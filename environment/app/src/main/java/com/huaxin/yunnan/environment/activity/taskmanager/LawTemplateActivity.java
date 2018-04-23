package com.huaxin.yunnan.environment.activity.taskmanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
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
import com.huaxin.yunnan.environment.Utils.ToastUtils;
import com.huaxin.yunnan.environment.activity.LoginActivity;
import com.huaxin.yunnan.environment.activity.template.AmmoniaTemplateActivity;
import com.huaxin.yunnan.environment.activity.template.AutomaticOnlineActivity;
import com.huaxin.yunnan.environment.activity.template.CementIndustryActivity;
import com.huaxin.yunnan.environment.activity.template.CopperSmeltingTemplateActivity;
import com.huaxin.yunnan.environment.activity.template.EnvironmentActivity;
import com.huaxin.yunnan.environment.activity.template.EvidenceMaterialActivity;
import com.huaxin.yunnan.environment.activity.template.FireElectricityEnterpriseTemplateActivity;
import com.huaxin.yunnan.environment.activity.template.InorganicPhosphorusChemicalActivity;
import com.huaxin.yunnan.environment.activity.template.IronSteelIndustryActivity;
import com.huaxin.yunnan.environment.activity.template.LeadActivity;
import com.huaxin.yunnan.environment.activity.template.LiveStockFarmActivity;
import com.huaxin.yunnan.environment.activity.template.MetalBeneficationActivity;
import com.huaxin.yunnan.environment.activity.template.PapermakingTemplateActivity;
import com.huaxin.yunnan.environment.activity.template.PollutionSurveryTakeDownActivity;
import com.huaxin.yunnan.environment.activity.template.RecordActivity;
import com.huaxin.yunnan.environment.activity.template.SewageChargesActivity;
import com.huaxin.yunnan.environment.activity.template.SewageTreatmentPlantMonitorActivity;
import com.huaxin.yunnan.environment.activity.template.TinBeneficationActivity;
import com.huaxin.yunnan.environment.activity.template.VokingIndustryMonitorActivity;
import com.huaxin.yunnan.environment.activity.template.WaterElectricityTemplateActivity;
import com.huaxin.yunnan.environment.adapter.TaskManagerAdapter;
import com.huaxin.yunnan.environment.bean.LawTemplateBean;
import com.huaxin.yunnan.environment.refresh.RefreshLayout;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.http.okhttp.request.RequestCall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.Call;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_AC_INFO_LIST;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_CC_INFO_LIST;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_CRD_INFO_LIST;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_CR_INFO_LIST;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_FM_INFO_LIST;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_GR_INFO_LIST;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_HC_INFO_LIST;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_HRD_INFO_LIST;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_HR_INFO_LIST;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_JRD_INFO_LIST;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_JR_INFO_LIST;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_PC_INFO_LIST;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_PR_INFO_LIST;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_QC_INFO_LIST;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_SR_INFO_LIST;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_TR_INFO_LIST;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_WRD_INFO_LIST;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_WR_INFO_LIST;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_XC_INFO_LIST;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_ZDXCJCJL_INFO_LIST;
import static com.zhy.http.okhttp.OkHttpUtils.post;

/**
 * 执法模板选择页面
 */
public class LawTemplateActivity extends BaseActicity implements View.OnClickListener, SwipeRefreshLayout.OnRefreshListener, RefreshLayout.OnLoadListener {
	private TextView tv_title, tv_1, tv_2, tv_3;
	private ListView lv_task;
	private List<Map<String, Object>> data;
	private TaskManagerAdapter adapter;
	private String url;
	private RequestCall mLawTemplateRequestCall;
	private String vc_zfmbmc, vc_url, t_task_list_id;
	private Intent intent;
	private RefreshLayout refreshLayout;
	private int page = 1;
	private ArrayList<Map<String, Object>> array;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_manager_list);
		initProgressDialog();
		initView();
		getData();
		refresh();
	}

	private void initView() {
		tv_title = (TextView) findViewById(R.id.title_text);
		tv_title.setText("选择执法模板");
        tv_title.setOnClickListener(this);
		lv_task = (ListView) findViewById(R.id.lv_task);
		findViewById(R.id.ll_no).setOnClickListener(this);
		refreshLayout = (RefreshLayout) findViewById(R.id.refreshLayout);
	}

	public void getData() {
		Bundle bundle = this.getIntent().getExtras();
		vc_zfmbmc = bundle.getString("vc_zfmbmc");
		vc_url = bundle.getString("vc_url");
		t_task_list_id = bundle.getString("t_task_list_id");
		LogUtils.e("LawTemplateActivity接收信息：vc_zfmbmc:" + vc_zfmbmc + ";vc_url:" + vc_url + ";t_task_list_id:" + t_task_list_id);
		switch (vc_url) {
			case "A001004001":
				intent = new Intent(LawTemplateActivity.this, SewageTreatmentPlantMonitorActivity.class);
				url = URL_QUERY_CR_INFO_LIST;
				break;
			case "A001004002":
				intent = new Intent(LawTemplateActivity.this, LiveStockFarmActivity.class);
				url = URL_QUERY_CRD_INFO_LIST;
				break;
			case "A001004003":
				intent = new Intent(LawTemplateActivity.this, IronSteelIndustryActivity.class);
				url = URL_QUERY_GR_INFO_LIST;
				break;
			case "A001004004":
				intent = new Intent(LawTemplateActivity.this, AmmoniaTemplateActivity.class);
				url = URL_QUERY_HRD_INFO_LIST;
				break;
			case "A001004005":
				intent = new Intent(LawTemplateActivity.this, FireElectricityEnterpriseTemplateActivity.class);
				url = URL_QUERY_HR_INFO_LIST;
				break;
			case "A001004006":
				intent = new Intent(LawTemplateActivity.this, VokingIndustryMonitorActivity.class);
				url = URL_QUERY_JRD_INFO_LIST;
				break;
			case "A001004007":
				intent = new Intent(LawTemplateActivity.this, MetalBeneficationActivity.class);
				url = URL_QUERY_JR_INFO_LIST;
				break;
			case "A001004008":
				intent = new Intent(LawTemplateActivity.this, SewageChargesActivity.class);
				url = URL_QUERY_PR_INFO_LIST;
				break;
			case "A001004009":
				intent = new Intent(LawTemplateActivity.this, LeadActivity.class);
				url = URL_QUERY_QC_INFO_LIST;
				break;
			case "A001004010":
				intent = new Intent(LawTemplateActivity.this, EnvironmentActivity.class);
				url = URL_QUERY_SR_INFO_LIST;
				break;
			case "A001004011":
				intent = new Intent(LawTemplateActivity.this, WaterElectricityTemplateActivity.class);
				url = URL_QUERY_HC_INFO_LIST;
				break;
			case "A001004012":
				intent = new Intent(LawTemplateActivity.this, CementIndustryActivity.class);
				url = URL_QUERY_CC_INFO_LIST;
				break;
			case "A001004013":
				intent = new Intent(LawTemplateActivity.this, RecordActivity.class);
				url = URL_QUERY_ZDXCJCJL_INFO_LIST;
				break;
			case "A001004014":
				intent = new Intent(LawTemplateActivity.this, CopperSmeltingTemplateActivity.class);
				url = URL_QUERY_TR_INFO_LIST;
				break;
			case "A001004015":
				intent = new Intent(LawTemplateActivity.this, AutomaticOnlineActivity.class);
				url = URL_QUERY_AC_INFO_LIST;
				break;
			case "A001004016":
				intent = new Intent(LawTemplateActivity.this, InorganicPhosphorusChemicalActivity.class);
				url = URL_QUERY_WR_INFO_LIST;
				break;
			case "A001004017":
				intent = new Intent(LawTemplateActivity.this, TinBeneficationActivity.class);
				url = URL_QUERY_XC_INFO_LIST;
				break;
			case "A001004018":
				intent = new Intent(LawTemplateActivity.this, PapermakingTemplateActivity.class);
				url = URL_QUERY_PC_INFO_LIST;
				break;
			case "A001004019":
				intent = new Intent(LawTemplateActivity.this, EvidenceMaterialActivity.class);
				url = URL_QUERY_FM_INFO_LIST;
				break;
			case "A001004020":
				intent = new Intent(LawTemplateActivity.this, PollutionSurveryTakeDownActivity.class);
				url = URL_QUERY_WRD_INFO_LIST;
				break;
			default:
				intent = new Intent(LawTemplateActivity.this, LoginActivity.class);
				LogUtils.e("url有误：" + vc_url);
				break;
		}
		Post(page, null);
	}

	private void refresh() {
		refreshLayout.setColorSchemeResources(R.color.colorPrimary, R.color.colorAccent, R.color.colorAccent, R.color.colorPrimaryDark);
//下拉刷新
		refreshLayout.setOnRefreshListener(this);
//上拉加载
		refreshLayout.setOnLoadListener(this);
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

	private void Post(final int page, final String onLoad) {
		yNProgressDialog.show();
		mLawTemplateRequestCall = post()
				.url(url)
				.addParams("t_task_list_id", t_task_list_id)
				.addParams("PageNum", page + "")
				.addParams("userToken", SpUtils.getString(getApplicationContext(), "userToken"))
				.build();

		mLawTemplateRequestCall.execute(new StringCallback() {
			@Override
			public void onError(Call call, Exception e, int id) {
				call.cancel();
				yNProgressDialog.dismiss();
				LogUtils.e("网络请求失败！" + e.toString());
				if (onLoad != null) {
					refreshLayout.setRefreshing(false);
					refreshLayout.setLoading(false);
				}
			}

			@Override
			public void onResponse(String response, int id) {
				yNProgressDialog.dismiss();
				LogUtils.e("网络请求返回response:" + response);
				Gson g = new GsonBuilder().serializeNulls().create();
				LawTemplateBean mLawTemplateBean = g.fromJson(response, LawTemplateBean.class);
				if (Constant.RESPONSE_SUCCESS.equals(mLawTemplateBean.getSuccess())) {
					if (mLawTemplateBean.getData() != null) {
						setListView(mLawTemplateBean.getData(), page);
					}
				} else {
					LogUtils.e("返回状态码：" + mLawTemplateBean.getSuccess());
				}
				if (onLoad != null) {
					if (mLawTemplateBean.getData().size() < 1) {
						refreshLayout.setOnLoadListener(null);
					}
					refreshLayout.setRefreshing(false);
					refreshLayout.setLoading(false);
				}
			}
		});
	}

	public void setListView(List<LawTemplateBean.DataBean> bean, int page) {
		if (page <= 1)
			array = new ArrayList<Map<String, Object>>();
		Map<String, Object> map;
		for (int i = 0; i < bean.size(); i++) {
			map = new HashMap<String, Object>();
			if (vc_zfmbmc != null)
				map.put("top", vc_zfmbmc);
			if (bean.get(i).getDt_start_time() != null)
				map.put("mid_l", bean.get(i).getDt_start_time().toString());
			if (bean.get(i).getDt_end_time() != null)
				map.put("mid_r", bean.get(i).getDt_end_time().toString());
			if (bean.get(i).getVc_bjcdwmc() != null)
				map.put("bottom", bean.get(i).getVc_bjcdwmc());
			if (bean.get(i).getT_detail_id() != null)
				Log.e("LawTemplateActivity", bean.get(i).getT_detail_id());
			map.put("t_detail_id", bean.get(i).getT_detail_id());
			array.add(map);
		}
		if (page <= 1) {
			adapter = new TaskManagerAdapter(this, array, TaskManagerAdapter.TAG_LAWTEMP);
			lv_task.setAdapter(adapter);
		} else {
			adapter.notifyDataSetChanged();
		}
		lv_task.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
				if (intent != null) {
					if (array.get(i).get("t_detail_id") != null)
						intent.putExtra("t_task_list_id", array.get(i).get("t_detail_id").toString());
					startActivity(intent);
				} else {
					ToastUtils.showShort(getApplicationContext(), "Intent为空！");
				}
			}
		});
	}

	@Override
	public void onRefresh() {
		yNProgressDialog.show();
		page = 1;
		Post(page, null);
		refreshLayout.setOnLoadListener(this);
		refreshLayout.setRefreshing(false);
	}

	@Override
	public void onLoad() {
		page = ++page;
		yNProgressDialog.show();
		Post(page, "onLoad");
	}
}
