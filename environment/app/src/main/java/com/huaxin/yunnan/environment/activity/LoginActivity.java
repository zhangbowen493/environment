package com.huaxin.yunnan.environment.activity;

import android.app.Notification;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.MainActivity;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.Utils.ToastUtils;
import com.huaxin.yunnan.environment.bean.LoginResultBean;
import com.huaxin.yunnan.environment.net.NetTool;
import com.tencent.android.tpush.XGCustomPushNotificationBuilder;
import com.tencent.android.tpush.XGIOperateCallback;
import com.tencent.android.tpush.XGPushConfig;
import com.tencent.android.tpush.XGPushManager;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.http.okhttp.request.RequestCall;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Call;

import static com.huaxin.yunnan.environment.Constant.RESPONSE_SUCCESS;
import static com.huaxin.yunnan.environment.Constant.URL_LOGIN;

/**
 * 登录Acticity
 */
public class LoginActivity extends BaseActicity implements View.OnClickListener {

	private EditText et_pwd, et_account;
	public String Tag = "LoginActivity";
	private CheckBox cb_rm_pwd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);


		getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		setContentView(R.layout.activity_login);
		initView();
		initProgressDialog();
		getInfo();
	}

	/**
	 * 信鸽注册、登录
	 *
	 * @param userId
	 */
	private void loginXG(String userId) {
		XGCustomPushNotificationBuilder build = new XGCustomPushNotificationBuilder();
		build.setSound(
				RingtoneManager.getActualDefaultRingtoneUri(

						getApplicationContext(), RingtoneManager.TYPE_ALARM))

				.setDefaults(Notification.DEFAULT_VIBRATE) // 振动

				.setFlags(Notification.FLAG_NO_CLEAR); // 是否可清除

		// 若不设定以上自定义layout，又想简单指定通知栏图片资源

		build.setNotificationLargeIcon(R.mipmap.icon);

		// 客户端保存build_id

		XGPushManager.setPushNotificationBuilder(this, 1, build);
		XGPushConfig.setAccessId(getApplicationContext(), 2100272492);
		XGPushConfig.setAccessKey(getApplicationContext(), "AW66FJ3J8T4Z");
		//启动、注册信鸽
		XGPushManager.registerPush(getApplicationContext(), userId, new XGIOperateCallback() {
			@Override
			public void onSuccess(Object o, int i) {
				Log.e("LoginActivity", "注册成功，设备token为：" + o);
			}

			@Override
			public void onFail(Object o, int i, String s) {
				Log.e("LoginActivity", "注册失败，错误码：" + i + ",错误信息：" + s);
			}
		});
	}


	//初始化控件
	private void initView() {
		et_pwd = (EditText) findViewById(R.id.et_password);
		et_account = (EditText) findViewById(R.id.et_account);
		findViewById(R.id.btn_login).setOnClickListener(this);
		cb_rm_pwd = (CheckBox) findViewById(R.id.cb_rm_pwd);
	}


	@Override
	public void onClick(View view) {
		switch (view.getId()) {
			case R.id.btn_login:
				if (et_account.getText().toString().trim().equals("") || et_account.getText() == null || et_pwd.getText().toString().trim().equals("") || et_pwd.getText() == null)
					ToastUtils.showShort(getApplicationContext(), "账号密码不能为空！");
				else
					Post();
				break;
			case R.id.iv_back:
				this.finish();
				break;
			default:
				break;
		}
	}

	private RequestCall mRequestCall;

	private void Post() {
		saveInfo();
		yNProgressDialog.show();
		mRequestCall = OkHttpUtils
				.post()
				.url(URL_LOGIN)
				.addParams("usercode", et_account.getText().toString().trim())
				.addParams("passwd", et_pwd.getText().toString().trim())
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
				LoginResultBean mLoginResultBean = g.fromJson(response, LoginResultBean.class);
				if (mLoginResultBean.getSuccess().equals(RESPONSE_SUCCESS)) {
					if (!mLoginResultBean.getUserToken().equals("")) {
						String userId = mLoginResultBean.getData().getUserId();
						//登录信鸽
						if (userId.length() < 7) {
							loginXG(userId);
						} else {
							loginXG(userId.substring(userId.length() - 7));
						}
						//存储UserToken
						SpUtils.putString(getApplicationContext(), "userToken", mLoginResultBean.getUserToken());
						//存储UserID
						SpUtils.putString(getApplicationContext(), "userId", mLoginResultBean.getData().getUserId());
						SpUtils.putString(getApplicationContext(), "name", mLoginResultBean.getData().getName());

						//存储ouinfo_id
						SpUtils.putString(getApplicationContext(), "ouinfo_id", mLoginResultBean.getData().getOuinfo_id());
						startActivity(new Intent(LoginActivity.this, MainActivity.class));
					} else {
						yNProgressDialog.dismiss();
						ToastUtils.showShort(getApplicationContext(), "登录失败！原因：Token为空");
						LogUtils.e(Tag, "Token为空！！！");
					}
				} else {
					yNProgressDialog.dismiss();
					ToastUtils.showShort(getApplicationContext(), "登录失败！原因：" + mLoginResultBean.getMsg().toString());
				}
			}
		});
	}

	private void saveInfo() {
		//保存本次登录名
		SpUtils.putString(this, "usercode", et_account.getText().toString().trim());
		if (cb_rm_pwd.isChecked()) {
			//保存密码
			SpUtils.putString(this, "passwd", et_pwd.getText().toString().trim());
			SpUtils.putBoolean(this, "issavepwd", true);
		} else {
			//不保存密码
			SpUtils.putString(this, "passwd", "");
			SpUtils.putBoolean(this, "issavepwd", false);
		}
	}


	public void getInfo() {
		//获取登录名
		String usercosde = SpUtils.getString(this, "usercode", "");
		//保存密码
		String passwd = SpUtils.getString(this, "passwd", "");
		if (usercosde != null || !usercosde.equals("")) {
			et_account.setText(usercosde);
		}
		if (passwd != null || !passwd.equals("")) {
			et_pwd.setText(passwd);
		}
		Boolean isSave = SpUtils.getBoolean(this, "issavepwd", false);
		if (isSave) {
			cb_rm_pwd.setChecked(true);
		}
	}
}

