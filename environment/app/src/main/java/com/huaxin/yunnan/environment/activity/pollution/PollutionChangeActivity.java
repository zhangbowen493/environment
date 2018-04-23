package com.huaxin.yunnan.environment.activity.pollution;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.Constant;
import com.huaxin.yunnan.environment.MyApplication;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.Utils.ToastUtils;
import com.huaxin.yunnan.environment.activity.LoginActivity;
import com.huaxin.yunnan.environment.bean.PollutionChangeBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.RESPONSE_TOKEN_FAILED;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_POLLUTIONCHANGE_INFO;

/**
 * 污染源变更信息页面
 */
public class PollutionChangeActivity extends BaseActicity implements View.OnClickListener, CallBack {
	private TextView titleText;
	private TextView tvWRYBH;
	private TextView tvBGSJ;
	private TextView tvBGSX;
	private TextView tvBGQNR;
	private TextView tvBGHNR;
	private TextView tvBGSM;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pollution_change);
		initProgressDialog();
		Intent intent = getIntent();
		String uuid = intent.getStringExtra("uuid");
		initView();
		NetTool.PollutionPost(getApplicationContext(), uuid, URL_QUERY_POLLUTIONCHANGE_INFO, PollutionChangeBean.class, this, yNProgressDialog);
	}

	private void initView() {
		titleText = (TextView) findViewById(R.id.title_text);
		titleText.setText("污染源变更信息");
		tvWRYBH = (TextView) findViewById(R.id.tv_WRYBH);
		tvBGSJ = (TextView) findViewById(R.id.tv_BGSJ);
		tvBGSX = (TextView) findViewById(R.id.tv_BGSX);
		tvBGQNR = (TextView) findViewById(R.id.tv_BGQNR);
		tvBGHNR = (TextView) findViewById(R.id.tv_BGHNR);
		tvBGSM = (TextView) findViewById(R.id.tv_BGSM);
		findViewById(R.id.title_text).setOnClickListener(this);
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

	@Override
	public void getResult(Object o) {
		PollutionChangeBean mPollutionChangeBean = (PollutionChangeBean) o;
		if (Constant.RESPONSE_SUCCESS.equals(mPollutionChangeBean.getSuccess())) {
			initData(mPollutionChangeBean);
		} else {
			ToastUtils.showShort(getApplicationContext(), mPollutionChangeBean.getMsg());
			if (mPollutionChangeBean.getSuccess().equals(RESPONSE_TOKEN_FAILED)) {
				startActivity(new Intent(PollutionChangeActivity.this, LoginActivity.class));
				MyApplication.getInstance().mScreenManager.popAlls();
			}
		}
	}

	private void initData(PollutionChangeBean mPollutionChangeBean) {
		if (mPollutionChangeBean.getData().getQueryData().size() >= 1) {
			if (mPollutionChangeBean.getData().getQueryData().get(0).getWrybh() != null)
				tvWRYBH.setText(mPollutionChangeBean.getData().getQueryData().get(0).getWrybh().toString());

			if (mPollutionChangeBean.getData().getQueryData().get(0).getWrybh() != null)
				tvBGSJ.setText(mPollutionChangeBean.getData().getQueryData().get(0).getBgsj().toString());

			if (mPollutionChangeBean.getData().getQueryData().get(0).getWrybh() != null)
				tvBGSX.setText(mPollutionChangeBean.getData().getQueryData().get(0).getBgsx().toString());

			if (mPollutionChangeBean.getData().getQueryData().get(0).getWrybh() != null)
				tvBGQNR.setText(mPollutionChangeBean.getData().getQueryData().get(0).getBgqnr().toString());

			if (mPollutionChangeBean.getData().getQueryData().get(0).getWrybh() != null)
				tvBGHNR.setText(mPollutionChangeBean.getData().getQueryData().get(0).getBghnr().toString());

			if (mPollutionChangeBean.getData().getQueryData().get(0).getWrybh() != null)
				tvBGSM.setText(mPollutionChangeBean.getData().getQueryData().get(0).getBgsm().toString());
		} else {

		}
	}
}
