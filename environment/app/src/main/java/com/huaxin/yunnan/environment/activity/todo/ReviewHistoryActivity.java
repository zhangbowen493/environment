package com.huaxin.yunnan.environment.activity.todo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.activity.todo.adapter.ReviewHistoryAdapter;
import com.huaxin.yunnan.environment.bean.ReviewHistoryBean;
import com.huaxin.yunnan.environment.net.NetTool;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import static com.huaxin.yunnan.environment.Constant.URL_AUDIT_GETAUDITHISTORYLIST;

/**
 * 3.审核历史Activity
 */
public class ReviewHistoryActivity extends BaseActicity implements View.OnClickListener {
	private LinearLayout ll_no;
	private TextView title_text;
	private ListView lv_review;

	private ReviewHistoryAdapter reviewHistoryAdapter;
	private String businessid_;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_review_history);
		initProgressDialog();
		businessid_ = getIntent().getStringExtra("businessid_");
		initView();

		initData();
	}

	private void initData() {
		yNProgressDialog.show();
		Log.e("ToDoActivity", URL_AUDIT_GETAUDITHISTORYLIST);
		NetTool.getInstance().rxReviewHistoryBeanPostNet(URL_AUDIT_GETAUDITHISTORYLIST, businessid_, SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
				.observeOn(AndroidSchedulers.mainThread())
				.subscribe(new Consumer<ReviewHistoryBean>() {
					@Override
					public void accept(@NonNull ReviewHistoryBean reviewHistoryBean) throws Exception {
						yNProgressDialog.dismiss();
						if (reviewHistoryBean.getSuccess().equals("1")) {
							reviewHistoryAdapter.setData(reviewHistoryBean);
						} else {
							Toast.makeText(getApplicationContext(), "连接异常", Toast.LENGTH_SHORT).show();
						}
					}

				}, new Consumer<Throwable>() {
					@Override
					public void accept(@NonNull Throwable throwable) throws Exception {
						yNProgressDialog.dismiss();
						Toast.makeText(getApplicationContext(), "连接异常", Toast.LENGTH_SHORT).show();
					}
				});

	}

	private void initView() {
		ll_no = (LinearLayout) findViewById(R.id.ll_no);
		title_text = (TextView) findViewById(R.id.title_text);
		title_text.setText("审核历史");
		lv_review = (ListView) findViewById(R.id.lv_review);
		reviewHistoryAdapter = new ReviewHistoryAdapter(this);
		lv_review.setAdapter(reviewHistoryAdapter);

        title_text.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.title_text:
				finish();
				break;
		}
	}







//	@Override
//	public void onRefresh() {
//
//	}

//	@Override
//	public void onLoad() {
//
//	}



//	private ImageButton mTitleBack;
//	private TextView mTitleText;
//	private ListView mLvReview;
//	private List<Map<String, Object>> data;
//	private ReviewHistoryAdapter adapter;
//	private ArrayList<Map<String, Object>> array;
//
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_review_history);
//		initView();
//	}
//
//	private void initView() {
//		mTitleBack = (ImageButton) findViewById(R.id.title_back);
//		mTitleText = (TextView) findViewById(R.id.title_text);
//		mLvReview = (ListView) findViewById(R.id.lv_review);
//	}
//
//	@Override
//	public void onClick(View view) {
//
//	}
//
//	private void setListView(List<TaskManagerBean.DataBean.QueryDataBean> bean, int page) {
//		if (page <= 1)
//			array = new ArrayList<Map<String, Object>>();
//		Map<String, Object> map;
//		for (int i = 0; i < bean.size(); i++) {
//			map = new HashMap<String, Object>();
////			map.put("tv_name", bean.get(i).getVc_task_name());
////			map.put("tv_time_arr", bean.get(i).getDt_task_start_time().toString());
////			map.put("tv_time_check", bean.get(i).getDt_task_end_time().toString());
////			map.put("tv_opinion_check", bean.get(i).getVc_company_name());
////			map.put("tv_people_check", bean.get(i).getT_task_list_id());
////			map.put("iv_state", bean.get(i).getT_task_list_id());
//			array.add(map);
//		}
//		if (page <= 1) {
//			adapter = new ReviewHistoryAdapter(this, array);
//			mLvReview.setAdapter(adapter);
//		} else {
//			adapter.notifyDataSetChanged();
//		}
//		mLvReview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//			@Override
//			public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//				if (i < adapter.getCount()) {
////					Intent intent = new Intent(TaskManagerListActivity.this, TaskNameActivity.class);
////					intent.putExtra("t_task_list_id", array.get(i).get("t_task_list_id").toString());
////					intent.putExtra("t_task_name", array.get(i).get("top").toString());
////					startActivity(intent);
//				}
//			}
//		});
//	}
}
