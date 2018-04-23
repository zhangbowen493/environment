package com.huaxin.yunnan.environment.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.MyApplication;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.Utils.ToastUtils;
import com.huaxin.yunnan.environment.bean.PwdChangeBean;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.http.okhttp.request.RequestCall;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import okhttp3.Call;

import static com.huaxin.yunnan.environment.Constant.URL_UPDATEPWD;

/**
 * Created by zbw on 2017/9/28 15:00.
 */

public class PwdChangeActivity extends BaseActicity implements View.OnClickListener {
    private EditText etNewPwd;
    private EditText etNewPwdAgain;
    private ImageView iv_back;
    private TextView mTvBack;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pwd_change);
        initView();
        initProgressDialog();
    }

    //初始化控件
    private void initView() {
        etNewPwd = (EditText) findViewById(R.id.et_new_pwd);
        etNewPwdAgain = (EditText) findViewById(R.id.et_new_pwd_again);
        iv_back = (ImageView) findViewById(R.id.iv_back);
        findViewById(R.id.btn_confirm).setOnClickListener(this);
        iv_back.setOnClickListener(this);
        mTvBack = (TextView) findViewById(R.id.tv_back);
        mTvBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_confirm:
                changePwd();
                break;
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_back:
                finish();
                break;
            default:
                break;
        }
    }

    private void changePwd() {
        if (!etNewPwd.getText().toString().equals("")) {
            String newPwd = etNewPwd.getText().toString().trim();
            if (newPwd.equals(etNewPwdAgain.getText().toString().trim())) {
                String regEx = "^(?![\\d]+$)(?![a-zA-Z]+$)(?![!#$%^&*]+$)[\\da-zA-Z!#$%^&*]{6,32}$";
                Pattern pattern = Pattern.compile(regEx);
                Matcher matcher = pattern.matcher(newPwd);
                boolean rs = matcher.matches();
                if (rs) {
                    String userId = SpUtils.getString(getApplicationContext(), "userId");
                    if (userId != null) {
                        ChangePwdPost(newPwd, userId);
                    } else {
                        ToastUtils.showShort(getApplicationContext(), "userId为空  请重新登录！");
                    }
                } else {
                    ToastUtils.showShort(getApplicationContext(), "密码格式不正确，请重新输入");
                    etNewPwd.setText("");
                    etNewPwdAgain.setText("");
                    etNewPwd.setFocusable(true);
                    etNewPwd.setFocusableInTouchMode(true);
                    etNewPwd.requestFocus();
                    etNewPwd.findFocus();
                }
            } else {
                ToastUtils.showShort(getApplicationContext(), "两次密码不一致,请重新输入");
                etNewPwd.setText("");
                etNewPwdAgain.setText("");
                etNewPwd.setFocusable(true);
                etNewPwd.setFocusableInTouchMode(true);
                etNewPwd.requestFocus();
                etNewPwd.findFocus();
            }
        } else {
            ToastUtils.showShort(getApplicationContext(), "请输入密码");
        }
    }

    private RequestCall mRequestCall;

    private void ChangePwdPost(String newPwd, String userId) {
        yNProgressDialog.show();
        mRequestCall = OkHttpUtils
                .post()
                .url(URL_UPDATEPWD)
                .addParams("password", newPwd)
                .addParams("userId", userId)
                .addParams("userToken", SpUtils.getString(getApplicationContext(), "userToken"))
                .build();
        mRequestCall.execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {
                call.cancel();
                ToastUtils.showShort(getApplicationContext(), "修改密码失败，请检查网络是否通畅");
                yNProgressDialog.dismiss();
            }

            @Override
            public void onResponse(String response, int id) {
                LogUtils.e("网络请求返回response:" + response);
                yNProgressDialog.dismiss();
                Gson g = new GsonBuilder().serializeNulls().create();
                PwdChangeBean mPwdChangeBean = g.fromJson(response, PwdChangeBean.class);
                if (mPwdChangeBean.getSuccess().equals("1")) {
                    ToastUtils.showShort(getApplicationContext(), "密码修改成功！");
                    //销毁所有栈内Activity
                    MyApplication.getInstance().mScreenManager.popAlls();
                    startActivity(new Intent(PwdChangeActivity.this, LoginActivity.class));
                } else {
                    ToastUtils.showShort(getApplicationContext(), "修改失败，失败原因：" + mPwdChangeBean.getSuccess());
                }
            }
        });
    }

}
