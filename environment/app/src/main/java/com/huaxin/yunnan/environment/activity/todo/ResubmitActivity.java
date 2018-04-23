package com.huaxin.yunnan.environment.activity.todo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.MainActivity;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.Utils.ToastUtils;
import com.huaxin.yunnan.environment.activity.LoginActivity;
import com.huaxin.yunnan.environment.bean.BaseBean;
import com.huaxin.yunnan.environment.bean.LoginResultBean;
import com.huaxin.yunnan.environment.net.NetTool;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.http.okhttp.request.RequestCall;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Call;

import static com.huaxin.yunnan.environment.Constant.RESPONSE_SUCCESS;
import static com.huaxin.yunnan.environment.Constant.URL_AUDIT_DOSUBMIT;
import static com.huaxin.yunnan.environment.Constant.URL_LOGIN;
import static com.huaxin.yunnan.environment.Constant.URL_PUSH;

/**
 * 1.重新提交Activity
 */
public class ResubmitActivity extends BaseActicity implements View.OnClickListener {
	private LinearLayout ll_no;
	private TextView mTitleText;
	private ImageView mIvRight;
	private TextView mTvFlow;
	private TextView mTvLink;
	private TextView mTvTransactor;
	private CheckBox mCbInteriorCirculation;
	private CheckBox mCbSp;
	private CheckBox mCbSh;
	private CheckBox mCbSc;
	private EditText mEtMore;
	private RelativeLayout rl_xzlc;
	private Intent intent;
	private String businessid_;
	private String workitem_ins_id_;
	private String busiOrgId;
	String id;
	String actType;
	String blr;
	private Button btn_confirm;
	private String processid;
	private String processVer;
	private String busitype_proc_id;
	private String processcorpid;
	private String activityid;
	private RelativeLayout mRlInteriorCirculation;
	private RelativeLayout mRlSp;
	private RelativeLayout mRlSh;
	private RelativeLayout mRlSc;
	private String fromWhere;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_resubmit);
		initProgressDialog();
		intent = getIntent();
		businessid_ = intent.getStringExtra("businessid_");
		workitem_ins_id_ = intent.getStringExtra("workitem_ins_id_");
		busiOrgId = intent.getStringExtra("busiOrgId");
		fromWhere = intent.getStringExtra("fromWhere");
		Log.e("ResubmitActivity", "businessid_" + businessid_);
		Log.e("ResubmitActivity", "workitem_ins_id_" + workitem_ins_id_);
		Log.e("ResubmitActivity", "busiOrgId" + busiOrgId);
		initView();
	}

	private void initView() {
		ll_no = (LinearLayout) findViewById(R.id.ll_no);
		mTitleText = (TextView) findViewById(R.id.title_text);
		mTitleText.setText("重新提交");
		mIvRight = (ImageView) findViewById(R.id.iv_right);
		mTvFlow = (TextView) findViewById(R.id.tv_flow);
		mTvLink = (TextView) findViewById(R.id.tv_link);
		mTvTransactor = (TextView) findViewById(R.id.tv_transactor);
		mCbInteriorCirculation = (CheckBox) findViewById(R.id.cb_interior_circulation);
		mCbSp = (CheckBox) findViewById(R.id.cb_sp);
		mCbSh = (CheckBox) findViewById(R.id.cb_sh);
		mCbSc = (CheckBox) findViewById(R.id.cb_sc);
		mEtMore = (EditText) findViewById(R.id.et_more);
		mRlInteriorCirculation = (RelativeLayout) findViewById(R.id.rl_interior_circulation);
		mRlInteriorCirculation.setOnClickListener(this);
		mRlSp = (RelativeLayout) findViewById(R.id.rl_sp);
		mRlSp.setOnClickListener(this);
		mRlSh = (RelativeLayout) findViewById(R.id.rl_sh);
		mRlSh.setOnClickListener(this);
		mRlSc = (RelativeLayout) findViewById(R.id.rl_sc);
		mRlSc.setOnClickListener(this);
		rl_xzlc = (RelativeLayout) findViewById(R.id.rl_xzlc);
		rl_xzlc.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				intent = new Intent(ResubmitActivity.this, SelectProcessActivity.class);
				intent.putExtra("workitem_ins_id_", workitem_ins_id_);
				intent.putExtra("busiOrgId", busiOrgId);
				intent.putExtra("businessid_", businessid_);
				startActivityForResult(intent, 0);
			}
		});
		btn_confirm = (Button) findViewById(R.id.btn_confirm);
		btn_confirm.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				yNProgressDialog.show();

				NetTool.getInstance().rxResubmitNet(URL_AUDIT_DOSUBMIT, processid, processVer, activityid, businessid_, busiOrgId, busitype_proc_id, processcorpid, mEtMore.getText().toString(), id, actType, blr, "1", SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
						.observeOn(AndroidSchedulers.mainThread())
						.subscribe(new Consumer<BaseBean>() {
							@Override
							public void accept(@NonNull BaseBean toDoListBean) throws Exception {
								yNProgressDialog.dismiss();
								if (toDoListBean.getSuccess().equals("1")) {
									if (TextUtils.isEmpty(fromWhere)) {
										sendBroadcast(new Intent("刷新待办"));
										finish();
									} else if (fromWhere.equals("Message")) {
										dialogList();
									}
								} else {
									Toast.makeText(getApplicationContext(), toDoListBean.getMsg().toString(), Toast.LENGTH_SHORT).show();
								}
							}

						}, new Consumer<Throwable>() {
							@Override
							public void accept(@NonNull Throwable throwable) throws Exception {
								Log.e("ResubmitActivity", throwable.getMessage().toString());
								yNProgressDialog.dismiss();
								Toast.makeText(getApplicationContext(), "连接异常", Toast.LENGTH_SHORT).show();
							}
						});
			}
		});
	}


	/**
	 * 列表
	 */
	private void dialogList() {
		final String items[] = {"回到消息列表", "回到待办列表"};

		AlertDialog.Builder builder = new AlertDialog.Builder(this, 3);

		// 设置列表显示，注意设置了列表显示就不要设置builder.setMessage()了，否则列表不起作用。
		builder.setItems(items, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				if (items[which].equals("回到消息列表")) {
					sendBroadcast(new Intent("回到消息列表"));
					finish();
				} else {
					intent = new Intent(ResubmitActivity.this, ToDoActivity.class);
					startActivity(intent);
					sendBroadcast(new Intent("回到待办列表"));
					finish();
				}
			}
		});

		builder.create().show();
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
			case R.id.rl_interior_circulation:
				if (mCbInteriorCirculation.isChecked())
					mCbInteriorCirculation.setChecked(false);
				else
					mCbInteriorCirculation.setChecked(true);
				break;
			case R.id.rl_sc:
				if (mCbSc.isChecked()) {
					mCbSc.setChecked(false);
				} else {
					mCbSc.setChecked(true);
				}
				mCbSh.setChecked(false);
				mCbSp.setChecked(false);
				break;
			case R.id.rl_sh:
				if (mCbSh.isChecked()) {
					mCbSh.setChecked(false);
				} else {
					mCbSh.setChecked(true);
				}
				mCbSc.setChecked(false);
				mCbSp.setChecked(false);
				break;
			case R.id.rl_sp:
				if (mCbSp.isChecked()) {
					mCbSp.setChecked(false);
				} else {
					mCbSp.setChecked(true);
				}
				mCbSh.setChecked(false);
				mCbSc.setChecked(false);
				break;
		}

	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if (data == null) {
			return;
		}
		if (requestCode == 0) {
			switch (resultCode) {
				case 8:
					String name = data.getStringExtra("name");
					String username = data.getStringExtra("username");
					String hjmc = data.getStringExtra("hjmc");

					id = data.getStringExtra("id");
					actType = data.getStringExtra("actType");
					blr = data.getStringExtra("blr");
					processid = data.getStringExtra("processid");
					processVer = data.getStringExtra("processVer");
					busitype_proc_id = data.getStringExtra("busitype_proc_id");
					processcorpid = data.getStringExtra("processcorpid");
					activityid = data.getStringExtra("activityId");
					Log.e("ResubmitActivity", "actid" + id);
					Log.e("ResubmitActivity", "actType" + actType);
					Log.e("ResubmitActivity", "blr" + blr);
					Log.e("ResubmitActivity", "processid" + processid);
					Log.e("ResubmitActivity", "processVer" + processVer);
					Log.e("ResubmitActivity", "busitype_proc_id" + busitype_proc_id);
					Log.e("ResubmitActivity", "processcorpid" + processcorpid);
					Log.e("ResubmitActivity", "activityid" + activityid);
					mTvFlow.setText(name);
					mTvLink.setText(hjmc);
					mTvTransactor.setText(username);
					break;
			}

		}


	}

}
