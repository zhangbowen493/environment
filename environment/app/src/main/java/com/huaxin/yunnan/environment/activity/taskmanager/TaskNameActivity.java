package com.huaxin.yunnan.environment.activity.taskmanager;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationListener;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.BaseDialog;
import com.huaxin.yunnan.environment.Constant;
import com.huaxin.yunnan.environment.MainActivity;
import com.huaxin.yunnan.environment.MyApplication;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.Utils.ToastUtils;
import com.huaxin.yunnan.environment.activity.LoginActivity;
import com.huaxin.yunnan.environment.activity.map.Location;
import com.huaxin.yunnan.environment.activity.taskmanager.adapter.TaskNameAdapter;
import com.huaxin.yunnan.environment.bean.LocationBean;
import com.huaxin.yunnan.environment.bean.LocationUpBean;
import com.huaxin.yunnan.environment.bean.LoginResultBean;
import com.huaxin.yunnan.environment.bean.TaskNameBean;
import com.huaxin.yunnan.environment.net.NetTool;
import com.tencent.android.tpush.XGPushManager;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.http.okhttp.request.RequestCall;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Call;
import okhttp3.MediaType;

import static android.app.Notification.VISIBILITY_PUBLIC;
import static com.huaxin.yunnan.environment.Constant.RESPONSE_SUCCESS;
import static com.huaxin.yunnan.environment.Constant.URL_LOGIN;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_TASK_IFOF;

public class TaskNameActivity extends BaseActicity implements View.OnClickListener {

	private LinearLayout ll_no;
	private TextView title_text;
	private ListView lv_mould;
	private TaskNameAdapter taskNameAdapter;
	private Intent intent;
	private String t_task_list_id2;
	private TextView VC_TASK_NAME;
	private TextView VC_TASK_TYPE;
	private TextView DT_TASK_START_TIME;
	private TextView DT_TASK_END_TIME;
	private TextView VC_COMPANY_NAME;
	private TextView VC_CHECK_MAN_NAME;
	private TextView VC_NOTER_NAME;
	private String t_task_name;
	private String t_task_list_id;
	private TextView tv_begin_location;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_name);
		intent = getIntent();
		t_task_list_id = intent.getStringExtra("t_task_list_id");
		Log.e("TaskNameActivity", t_task_list_id);
		Log.e("RecordActivity", SpUtils.getString(getApplicationContext(), "userToken"));
		t_task_name = intent.getStringExtra("t_task_name");
		initProgressDialog();
		initView();
		initData();
	}

	private void initData() {
		yNProgressDialog.show();
		NetTool.getInstance().rxPostNet2(URL_QUERY_TASK_IFOF, t_task_list_id, SpUtils.getString(getApplicationContext(), "userToken"))
				.subscribeOn(Schedulers.io())
				.observeOn(AndroidSchedulers.mainThread())
				.subscribe(new Consumer<TaskNameBean>() {
					@Override
					public void accept(@NonNull TaskNameBean resultBean) throws Exception {
						yNProgressDialog.dismiss();
						if (resultBean.getSuccess().equals("1")) {
							t_task_list_id2 = resultBean.getData().getT_task_list_id();
							if (resultBean.getData().getVc_task_name() == null) {
								VC_TASK_NAME.setText("");
							} else {
								VC_TASK_NAME.setText(resultBean.getData().getVc_task_name());
							}
							if (resultBean.getData().getVc_task_type() == null) {
								VC_TASK_TYPE.setText("");
							} else {
								switch (resultBean.getData().getVc_task_type()) {
									case "1":
										VC_TASK_TYPE.setText("例行监察");
										break;
									case "2":
										VC_TASK_TYPE.setText("专项行动");
										break;
									case "3":
										VC_TASK_TYPE.setText("后督查");
										break;
									case "4":
										VC_TASK_TYPE.setText("群众举报");
										break;
									case "5":
										VC_TASK_TYPE.setText("领导指派");
										break;
								}

							}
							if (resultBean.getData().getVc_company_name() == null) {
								VC_COMPANY_NAME.setText("");
							} else {
								VC_COMPANY_NAME.setText(resultBean.getData().getVc_company_name());
							}
							if (resultBean.getData().getVc_noter_name() == null) {
								VC_NOTER_NAME.setText("");
							} else {
								VC_NOTER_NAME.setText(resultBean.getData().getVc_noter_name());
							}
							if (resultBean.getData().getTask_start_time() == null) {
								DT_TASK_START_TIME.setText("");
							} else {
								DT_TASK_START_TIME.setText(resultBean.getData().getTask_start_time());
							}
							if (resultBean.getData().getTask_end_time() == null) {
								DT_TASK_END_TIME.setText("");
							} else {
								DT_TASK_END_TIME.setText(resultBean.getData().getTask_end_time());
							}
							StringBuilder str = new StringBuilder();
							if (resultBean.getData().getTask_jcr().size() == 0) {
								VC_CHECK_MAN_NAME.setText("");
							} else {
								for (int i = 0; i < resultBean.getData().getTask_jcr().size(); i++) {
									str.append(resultBean.getData().getTask_jcr().get(i).getVc_user_name() + ",");
								}
								String ss = str.substring(0, str.length() - 1);//当循环结束后截取最后一个逗号
								VC_CHECK_MAN_NAME.setText(ss);
							}
							if (resultBean.getData().getTask_zfmb().size() == 0) {
								lv_mould.setVisibility(View.GONE);
							} else {
								taskNameAdapter.setData(resultBean.getData().getTask_zfmb());
							}
							if (resultBean.getData().getDt_task_start_time() == null) {
								DT_TASK_START_TIME.setVisibility(View.GONE);
							} else {
								DT_TASK_START_TIME.setText(resultBean.getData().getDt_task_start_time());
							}
							if (resultBean.getData().getDt_task_end_time() == null) {
								DT_TASK_END_TIME.setVisibility(View.GONE);
							} else {
								DT_TASK_END_TIME.setText(resultBean.getData().getDt_task_end_time());
							}
						} else {
							Toast.makeText(getApplicationContext(), "连接超时", Toast.LENGTH_SHORT).show();
						}
					}
				}, new Consumer<Throwable>() {
					@Override
					public void accept(@NonNull Throwable throwable) throws Exception {
						Log.e("LoginActivity", throwable.getMessage().toString());
						yNProgressDialog.dismiss();
						Toast.makeText(getApplicationContext(), "连接超时", Toast.LENGTH_SHORT).show();
					}
				});
	}

	private void initView() {
		ll_no = (LinearLayout) findViewById(R.id.ll_no);
		title_text = (TextView) findViewById(R.id.title_text);
		title_text.setText(t_task_name);
		title_text.setOnClickListener(this);
		lv_mould = (ListView) findViewById(R.id.lv_mould);
		taskNameAdapter = new TaskNameAdapter(this);

		lv_mould.setAdapter(taskNameAdapter);
		lv_mould.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
				Intent intent = new Intent(TaskNameActivity.this, LawTemplateActivity.class);
				TaskNameBean.DataBean.TaskZfmbBean zfmbBean = (TaskNameBean.DataBean.TaskZfmbBean) adapterView.getItemAtPosition(i);
				intent.putExtra("vc_zfmbmc", zfmbBean.getVc_zfmbmc());
				intent.putExtra("vc_url", zfmbBean.getVc_url());
				intent.putExtra("t_task_list_id", t_task_list_id2);
				startActivity(intent);
			}
		});

		VC_TASK_NAME = (TextView) findViewById(R.id.VC_TASK_NAME);
		VC_TASK_TYPE = (TextView) findViewById(R.id.VC_TASK_TYPE);
		DT_TASK_START_TIME = (TextView) findViewById(R.id.DT_TASK_START_TIME);
		DT_TASK_END_TIME = (TextView) findViewById(R.id.DT_TASK_END_TIME);
		VC_COMPANY_NAME = (TextView) findViewById(R.id.VC_COMPANY_NAME);
		VC_CHECK_MAN_NAME = (TextView) findViewById(R.id.VC_CHECK_MAN_NAME);
		VC_NOTER_NAME = (TextView) findViewById(R.id.VC_NOTER_NAME);
		tv_begin_location = (TextView) findViewById(R.id.tv_begin_location);
		tv_begin_location.setOnClickListener(this);
		if (MyApplication.getInstance().isBegin && t_task_list_id.equals(MyApplication.getInstance().getT_task_list_id())) {
			//此任务正在进行
			tv_begin_location.setText("结束任务");
			//设置字体颜色
//            tv_begin_location.setTextColor(R.color.blue_1);
		}
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.title_text:
				finish();
				break;
			case R.id.tv_begin_location:
				//点击开始任务，弹出Dialog
				showDialog();
				break;
		}
	}

	private BaseDialog baseDialog;

	private void showDialog() {
		baseDialog = new BaseDialog(this);
		baseDialog.setMessage("是否" + tv_begin_location.getText().toString() + "?");
		baseDialog.setYesOnclickListener("确定", new BaseDialog.onYesOnclickListener() {
			@Override
			public void onYesClick() {
				baseDialog.dismiss();
				if (MyApplication.getInstance().isBegin) {
					if (MyApplication.getInstance().t_task_list_id.equals(t_task_list_id)) {
						//任务进行中，点击停止定位
						MyApplication.getInstance().getmLocationClient().stopLocation();
						MyApplication.getInstance().setBegin(false);
						MyApplication.getInstance().setT_task_list_id("");
						//此任务正在进行
						tv_begin_location.setText("开始任务");
						//设置字体颜色
//					tv_begin_location.setTextColor(Color.valueOf(R.color.liji_material_red_500));
						//取消Notification
						NotificationManager mNotifyMgr =
								(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
						mNotifyMgr.cancel(99);
						//TODO 提交定位数据至后台
						showDialogUpLocation();
					} else {
						ToastUtils.showShort(getApplicationContext(), "当前已有任务正在进行，请结束任务后再开启本次任务！");
					}
				} else {
					//开始任务
					MyApplication.getInstance().setBegin(true);
					MyApplication.getInstance().setT_task_list_id(t_task_list_id);
					tv_begin_location.setText("结束任务");
					Location.initLocation();
					showNotification();
					ToastUtils.showLong(getApplicationContext(), "开始记录定位，可在通知栏查看相关信息，结束任务后请回到此页面点击“结束任务”按钮上传点位信息！");
					startActivity(new Intent(TaskNameActivity.this, MainActivity.class));
					finish();
				}
			}
		});
		baseDialog.setNoOnclickListener("取消", new BaseDialog.onNoOnclickListener() {
			@Override
			public void onNoClick() {
				baseDialog.dismiss();
				return;
			}
		});
		baseDialog.show();
	}

	private void showDialogUpLocation() {
		baseDialog = new BaseDialog(this);
		baseDialog.setMessage("是否上送定位信息？");
		baseDialog.setYesOnclickListener("确定", new BaseDialog.onYesOnclickListener() {
			@Override
			public void onYesClick() {
				baseDialog.dismiss();
				if (MyApplication.getInstance().getData().size() > 0) {
					//list里面有数据，post上传
					Post(MyApplication.getInstance().getData());
//					LogUtils.e("看一下List的data:"+MyApplication.getInstance().getData().toString());
				} else {
					//list里面没有数据
					ToastUtils.showShort(getApplicationContext(), "定位数据为空，请重新记录");
					LogUtils.e("定位数据：" + MyApplication.getInstance().getData().toString());
				}
			}
		});
		baseDialog.setNoOnclickListener("取消", new BaseDialog.onNoOnclickListener() {
			@Override
			public void onNoClick() {
				baseDialog.dismiss();
				return;
			}
		});
		baseDialog.show();
	}

	private void showNotification() {
		NotificationCompat.Builder mBuilder =
				new NotificationCompat.Builder(this)
						.setSmallIcon(R.mipmap.icon)
						.setContentTitle(t_task_name)
						.setContentText("任务已开始，点击查看相关信息")
						//点击通知后自动清除
						.setAutoCancel(false)
						.setVisibility(VISIBILITY_PUBLIC);

		Intent resultIntent = new Intent(this, TaskNameActivity.class);
		resultIntent.putExtra("t_task_list_id", t_task_list_id);
		resultIntent.putExtra("t_task_name", t_task_name);
		PendingIntent resultPendingIntent = PendingIntent.getActivity(
				this, 0, resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);
		mBuilder.setContentIntent(resultPendingIntent);
		Notification notification = mBuilder.build();
		notification.flags |= Notification.FLAG_NO_CLEAR;
		int mNotificationId = 99;
		NotificationManager mNotifyMgr =
				(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		mNotifyMgr.notify(mNotificationId, notification);
	}

	private RequestCall mRequestCall;

	private void Post(List<LocationBean> data) {
		yNProgressDialog.show();
		PostBean mPostBean = new PostBean();
		mPostBean.setT_task_list_id(t_task_list_id);
		mPostBean.setData(data);
		mRequestCall = OkHttpUtils
				.post()
				.url(Constant.URL_UP_LOCATION)
				.addParams("data", new Gson().toJson(mPostBean))
				.addParams("userToken", SpUtils.getString(getApplicationContext(), "userToken"))
				.build();

		mRequestCall.execute(new StringCallback() {
			@Override
			public void onError(Call call, Exception e, int id) {
				call.cancel();
				yNProgressDialog.dismiss();
				LogUtils.e("网络请求失败！" + e.toString());
				ToastUtils.showShort(getApplicationContext(), "上送失败！请检查网络是否通畅，错误原因：" + e.toString());
			}

			@Override
			public void onResponse(String response, int id) {
				yNProgressDialog.dismiss();
				LogUtils.e("网络请求返回response:" + response);
				Gson g = new GsonBuilder().serializeNulls().create();
				LocationUpBean mLocationUpBean = g.fromJson(response, LocationUpBean.class);
				if (mLocationUpBean.getSuccess().equals(RESPONSE_SUCCESS)) {
					//坐标点上送成功
					ToastUtils.showShort(getApplicationContext(), "坐标点上传成功！");
					MyApplication.getInstance().getData().clear();
				} else {
					yNProgressDialog.dismiss();
					ToastUtils.showShort(getApplicationContext(), "上送失败！错误原因：" + mLocationUpBean.getMsg().toString());
				}
			}
		});
	}

	class PostBean {
		private String t_task_list_id;
		private List<LocationBean> data;

		public String getT_task_list_id() {
			return t_task_list_id;
		}

		public void setT_task_list_id(String t_task_list_id) {
			this.t_task_list_id = t_task_list_id;
		}

		public List<LocationBean> getData() {
			return data;
		}

		public void setData(List<LocationBean> data) {
			this.data = data;
		}

	}
}
