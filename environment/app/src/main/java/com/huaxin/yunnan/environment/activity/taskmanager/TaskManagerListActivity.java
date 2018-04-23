package com.huaxin.yunnan.environment.activity.taskmanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.Constant;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.adapter.TaskManagerAdapter;
import com.huaxin.yunnan.environment.bean.TaskManagerBean;
import com.huaxin.yunnan.environment.refresh.RefreshLayout;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.http.okhttp.request.RequestCall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.Call;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_TASK_LIST;
import static com.zhy.http.okhttp.OkHttpUtils.post;

/**
 * 任务办理页面
 */
public class TaskManagerListActivity extends BaseActicity implements View.OnClickListener, SwipeRefreshLayout.OnRefreshListener, RefreshLayout.OnLoadListener {
	private TextView tv_title;
	private ListView lv_task;
	private List<Map<String, Object>> data;
	private TaskManagerAdapter adapter;
	private RequestCall mTaskManagerRequestCall;
	private RefreshLayout refreshLayout;
	private int page = 1;
	private ArrayList<Map<String, Object>> array;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_manager_list);
		initProgressDialog();
		initView();
		refresh();
	}

	private void initView() {
		tv_title = (TextView) findViewById(R.id.title_text);
		tv_title.setText("任务办理");
        tv_title.setOnClickListener(this);
		lv_task = (ListView) findViewById(R.id.lv_task);
		findViewById(R.id.ll_no).setOnClickListener(this);
		refreshLayout = (RefreshLayout) findViewById(R.id.refreshLayout);
		Post(page, null);
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
			case R.id.title_text:
				//返回
				finish();
				break;
		}
	}

	private void refresh() {
		refreshLayout.setColorSchemeResources(R.color.colorPrimary, R.color.colorAccent, R.color.colorAccent, R.color.colorPrimaryDark);
//下拉刷新
		refreshLayout.setOnRefreshListener(this);
//上拉加载
		refreshLayout.setOnLoadListener(this);
	}

	private void Post(final int page, final String onLoad) {
		yNProgressDialog.show();
		mTaskManagerRequestCall =
				post()
						.url(URL_QUERY_TASK_LIST)
						.addParams("PageNum", page + "")
						.addParams("userToken", SpUtils.getString(getApplicationContext(), "userToken"))
						.build();

		mTaskManagerRequestCall.execute(new StringCallback() {
			@Override
			public void onError(Call call, Exception e, int id) {
				call.cancel();
				yNProgressDialog.dismiss();
				LogUtils.e("网络请求失败！" + e.toString());
				if(onLoad!=null){
					refreshLayout.setRefreshing(false);
					refreshLayout.setLoading(false);
				}
			}

			@Override
			public void onResponse(String response, int id) {
				yNProgressDialog.dismiss();
				LogUtils.e("网络请求返回response:" + response);
				Gson g = new GsonBuilder().serializeNulls().create();
				TaskManagerBean mTaskManagerBean = g.fromJson(response, TaskManagerBean.class);
				if (Constant.RESPONSE_SUCCESS.equals(mTaskManagerBean.getSuccess())) {
					if (mTaskManagerBean.getData().getQueryData() != null) {
						setListView(mTaskManagerBean.getData().getQueryData(), page);
					}
				} else {
					LogUtils.e("返回状态码：" + mTaskManagerBean.getSuccess());
				}
				if(onLoad!=null){
					if (mTaskManagerBean.getData().getQueryData().size()<1){
						refreshLayout.setOnLoadListener(null);
					}
					refreshLayout.setRefreshing(false);
					refreshLayout.setLoading(false);
				}
			}
		});
	}

	private void setListView(List<TaskManagerBean.DataBean.QueryDataBean> bean, int page) {
		if (page <= 1)
			array = new ArrayList<Map<String, Object>>();
		Map<String, Object> map;
		for (int i = 0; i < bean.size(); i++) {
			map = new HashMap<String, Object>();
			if (bean.get(i).getVc_task_name()!=null)
			map.put("top", bean.get(i).getVc_task_name());
			if (bean.get(i).getDt_task_start_time()!=null)
			map.put("mid_l", bean.get(i).getDt_task_start_time().toString());
			if (bean.get(i).getDt_task_end_time()!=null)
			map.put("mid_r", bean.get(i).getDt_task_end_time().toString());
			if (bean.get(i).getVc_company_name()!=null)
			map.put("bottom", bean.get(i).getVc_company_name());
			if (bean.get(i).getT_task_list_id()!=null)
			map.put("t_task_list_id", bean.get(i).getT_task_list_id());
			array.add(map);
		}
		if (page <= 1){
			adapter = new TaskManagerAdapter(this, array, TaskManagerAdapter.TAG_TASK);
			lv_task.setAdapter(adapter);
		}else {
			adapter.notifyDataSetChanged();
		}
		lv_task.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
				if (i < adapter.getCount()) {
					Intent intent = new Intent(TaskManagerListActivity.this, TaskNameActivity.class);
					intent.putExtra("t_task_list_id", array.get(i).get("t_task_list_id").toString());
					intent.putExtra("t_task_name", array.get(i).get("top").toString());
					startActivity(intent);
				}
			}
		});
	}

	//下拉刷新
	@Override
	public void onRefresh() {
		yNProgressDialog.show();
		page = 1;
		Post(page, null);
		refreshLayout.setOnLoadListener(this);
		refreshLayout.setRefreshing(false);
	}

	//上拉加载
	@Override
	public void onLoad() {
		page = ++page;
		yNProgressDialog.show();
		Post(page,"onLoad");
	}
}
