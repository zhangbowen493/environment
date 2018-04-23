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
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.Utils.ToastUtils;
import com.huaxin.yunnan.environment.activity.meaaagelog.MessageLogActivity;
import com.huaxin.yunnan.environment.bean.BaseBean;
import com.huaxin.yunnan.environment.net.NetTool;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.http.okhttp.request.RequestCall;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Call;

import static com.huaxin.yunnan.environment.Constant.URL_AUDIT_DOPASSOFMOBILE;
import static com.huaxin.yunnan.environment.Constant.URL_PUSH;

/**
 * 9.审核同意Activity
 */
public class CommentAgreeActivity extends BaseActicity implements View.OnClickListener {
	private LinearLayout ll_no;
	private TextView mTitleText;
	private ImageView mIvRight;
	private TextView mTvFlow;
	private TextView mTvTransactor;
	private CheckBox mCbMessage;
	private CheckBox mCbAgree;
	private CheckBox mCbSp;
	private CheckBox mCbSh;
	private CheckBox mCbSc;
	private EditText mEtMore;
	private RelativeLayout rl_xzhj;
	private Intent intent;
	private String businessid_;
	private String workitem_ins_id_;
	private String busiOrgId;
	private Button btn_confirm;
	String id;
	String actType;
	String blr;
	private RelativeLayout mRlAgree;
	private RelativeLayout mRlSp;
	private RelativeLayout mRlSh;
	private RelativeLayout mRlSc;
	private String fromWhere;
	private String isXG;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_commentagree);
		initProgressDialog();
		intent = getIntent();
		businessid_ = intent.getStringExtra("businessid_");
		workitem_ins_id_ = intent.getStringExtra("workitem_ins_id_");
		busiOrgId = intent.getStringExtra("busiOrgId");
		fromWhere = intent.getStringExtra("fromWhere");
		isXG = intent.getStringExtra("isXG");


		initView();
	}

	private void initView() {
		ll_no = (LinearLayout) findViewById(R.id.ll_no);

		mTitleText = (TextView) findViewById(R.id.title_text);
		mTitleText.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				finish();
			}
		});
		mIvRight = (ImageView) findViewById(R.id.iv_right);
		mTvFlow = (TextView) findViewById(R.id.tv_flow);
		mTvTransactor = (TextView) findViewById(R.id.tv_transactor);
		mCbMessage = (CheckBox) findViewById(R.id.cb_message);
		mCbAgree = (CheckBox) findViewById(R.id.cb_agree);
		mCbSp = (CheckBox) findViewById(R.id.cb_sp);
		mCbSh = (CheckBox) findViewById(R.id.cb_sh);
		mCbSc = (CheckBox) findViewById(R.id.cb_sc);
		mCbSp.setOnClickListener(this);
		mCbAgree.setOnClickListener(this);
		mCbSh.setOnClickListener(this);
		mCbSc.setOnClickListener(this);
		mEtMore = (EditText) findViewById(R.id.et_more);
		mTitleText.setText("重新提交");
		mRlAgree = (RelativeLayout) findViewById(R.id.rl_agree);
		mRlAgree.setOnClickListener(this);
		mRlSp = (RelativeLayout) findViewById(R.id.rl_sp);
		mRlSp.setOnClickListener(this);
		mRlSh = (RelativeLayout) findViewById(R.id.rl_sh);
		mRlSh.setOnClickListener(this);
		mRlSc = (RelativeLayout) findViewById(R.id.rl_sc);
		mRlSc.setOnClickListener(this);
		rl_xzhj = (RelativeLayout) findViewById(R.id.rl_xzhj);
		rl_xzhj.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				intent = new Intent(CommentAgreeActivity.this, ChoiceActivity.class);
				intent.putExtra("bbb", "0");
				intent.putExtra("businessid_", businessid_);
				intent.putExtra("workitem_ins_id_", workitem_ins_id_);
				intent.putExtra("busiOrgId", busiOrgId);
				startActivityForResult(intent, 0);
			}
		});
		btn_confirm = (Button) findViewById(R.id.btn_confirm);
		btn_confirm.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if (blr == null) {
					ToastUtils.showShort(getApplicationContext(), "请选择办理人！");
					return;
				}
				yNProgressDialog.show();
				NetTool.getInstance().rxCommentAgreePostNet(URL_AUDIT_DOPASSOFMOBILE, workitem_ins_id_, businessid_, busiOrgId,mEtMore.getText().toString(), id, actType, blr, "1", SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
						.observeOn(AndroidSchedulers.mainThread())
						.subscribe(new Consumer<BaseBean>() {


							@Override
							public void accept(@NonNull BaseBean baseBean) throws Exception {
								yNProgressDialog.dismiss();
								if (baseBean.getSuccess().equals("1")) {
									if (TextUtils.isEmpty(fromWhere)) {
										sendBroadcast(new Intent("刷新待办"));
										finish();
									} else if (fromWhere.equals("Message")) {
										dialogList();
									}
								} else {
									Toast.makeText(getApplicationContext(), baseBean.getMsg(), Toast.LENGTH_SHORT).show();
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
					if (isXG != null){
						startActivity(new Intent(CommentAgreeActivity.this, MessageLogActivity.class));
					}
					finish();
				} else {
					intent = new Intent(CommentAgreeActivity.this, ToDoActivity.class);
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
//            mCbSp.setOnClickListener(this);
//            mCbAgree.setOnClickListener(this);
//            mCbSh.setOnClickListener(this);
//            mCbSc.setOnClickListener(this);
			case R.id.cb_sp:
				if (mCbSp.isChecked()) {
					mCbAgree.setChecked(false);
					mCbSh.setChecked(false);
					mCbSc.setChecked(false);
				}
				break;
			case R.id.cb_agree:
				if (mCbAgree.isChecked()) {
					mCbSp.setChecked(false);
					mCbSh.setChecked(false);
					mCbSc.setChecked(false);
				}
				break;
			case R.id.cb_sh:
				if (mCbSh.isChecked()) {
					mCbSp.setChecked(false);
					mCbAgree.setChecked(false);
					mCbSc.setChecked(false);
				}
				break;
			case R.id.cb_sc:
				if (mCbSc.isChecked()) {
					mCbAgree.setChecked(false);
					mCbSh.setChecked(false);
					mCbSp.setChecked(false);
				}
				break;
			case R.id.rl_agree:
				if (mCbAgree.isChecked()) {
					mCbAgree.setChecked(false);
				} else {
					mCbAgree.setChecked(true);
				}
				mCbSp.setChecked(false);
				mCbSh.setChecked(false);
				mCbSc.setChecked(false);
				break;
			case R.id.rl_sc:
				if (mCbSc.isChecked()) {
					mCbSc.setChecked(false);
				} else {
					mCbSc.setChecked(true);
				}
				mCbAgree.setChecked(false);
				mCbSh.setChecked(false);
				mCbSp.setChecked(false);
				break;
			case R.id.rl_sh:
				if (mCbSh.isChecked()) {
					mCbSh.setChecked(false);
				} else {
					mCbSh.setChecked(true);
				}
				mCbSp.setChecked(false);
				mCbAgree.setChecked(false);
				mCbSc.setChecked(false);
				break;
			case R.id.rl_sp:
				if (mCbSp.isChecked()) {
					mCbSp.setChecked(false);
				} else {
					mCbSp.setChecked(true);
				}
				mCbAgree.setChecked(false);
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
					String username = data.getStringExtra("username");
					String hjmc = data.getStringExtra("hjmc");
					id = data.getStringExtra("id");
					actType = data.getStringExtra("actType");
					blr = data.getStringExtra("blr");
					Log.e("CommentAgreeActivity1：", id);
					Log.e("CommentAgreeActivity2：", actType);
					Log.e("CommentAgreeActivity3：", blr);
					mTvFlow.setText(hjmc);
					mTvTransactor.setText(username);
					intent.putExtra("username", username);
					intent.putExtra("hjmc", hjmc);

					break;
			}
		}
	}

	private RequestCall mRequestCall;

	private void Post() {
		yNProgressDialog.show();
        if (blr.length() >= 7) {
			blr=blr.substring(blr.length()-7);
		}
		mRequestCall = OkHttpUtils
				.post()
				.url(URL_PUSH)
				.addParams("accessId", "2100272492")
				.addParams("secretKey", "f37518154874bebff8ab5cf380bcabb0")
				.addParams("title", "标题20171207")
				.addParams("content", "这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容")
				.addParams("account", blr)
				.addParams("businessId", businessid_)
				.addParams("userToken", SpUtils.getString(getApplicationContext(), "userToken"))
				.build();

		mRequestCall.execute(new StringCallback() {
			@Override
			public void onError(Call call, Exception e, int id) {
				call.cancel();
				yNProgressDialog.dismiss();
				LogUtils.e("网络请求失败！" + e.toString());
			}

			@Override
			public void onResponse(String response, int id) {
				yNProgressDialog.dismiss();
				LogUtils.e("网络请求返回response:" + response);
				Gson g = new GsonBuilder().serializeNulls().create();
//				LoginResultBean mLoginResultBean = g.fromJson(response, LoginResultBean.class);
//				if (mLoginResultBean.getSuccess().equals(RESPONSE_SUCCESS)) {
//					if (!mLoginResultBean.getUserToken().equals("")) {
//						//存储UserToken
//						SpUtils.putString(getApplicationContext(), "userToken", mLoginResultBean.getUserToken());
//						//存储UserID
//						SpUtils.putString(getApplicationContext(), "userId", mLoginResultBean.getData().getUserId());
//						SpUtils.putString(getApplicationContext(), "name", mLoginResultBean.getData().getName());
//
//						//存储ouinfo_id
//						SpUtils.putString(getApplicationContext(), "ouinfo_id", mLoginResultBean.getData().getOuinfo_id());
//						startActivity(new Intent(LoginActivity.this, MainActivity.class));
//					} else {
//						yNProgressDialog.dismiss();
//						LogUtils.e( "Token为空！！！");
//					}
//				} else {
//					yNProgressDialog.dismiss();
//					ToastUtils.showShort(getApplicationContext(), "登录失败！原因：" + mLoginResultBean.getMsg().toString());
//				}
			}
		});
	}
}
