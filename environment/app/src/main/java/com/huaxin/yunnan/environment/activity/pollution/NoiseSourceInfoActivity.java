package com.huaxin.yunnan.environment.activity.pollution;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.Constant;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.Utils.ToastUtils;
import com.huaxin.yunnan.environment.bean.NoiseSourceInfoBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_NOISESOURCE_INFO;

/**
 * 污染源噪声源信息页面
 */
public class NoiseSourceInfoActivity extends BaseActicity implements View.OnClickListener, CallBack {
	private TextView titleText;
	private TextView tvWRYBH;
	private TextView tvZSYBH;
	private TextView tvZSYMC;
	private TextView tvZSYXZ;
	private TextView tvZSWZ;
	private TextView tvPFBZ;
	private TextView tvSFZXJK;
	private TextView tvBZ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_noise_source_info);
		initProgressDialog();
		Intent intent = getIntent();
		String uuid = intent.getStringExtra("uuid");
		initView();
		NetTool.PollutionPost(getApplicationContext(), uuid, URL_QUERY_NOISESOURCE_INFO, NoiseSourceInfoBean.class, this, yNProgressDialog);
	}

	private void initView() {
		titleText = (TextView) findViewById(R.id.title_text);
		titleText.setText("污染源噪声源信息");
		tvWRYBH = (TextView) findViewById(R.id.tv_WRYBH);
		tvZSYBH = (TextView) findViewById(R.id.tv_ZSYBH);
		tvZSYMC = (TextView) findViewById(R.id.tv_ZSYMC);
		tvZSYXZ = (TextView) findViewById(R.id.tv_ZSYXZ);
		tvZSWZ = (TextView) findViewById(R.id.tv_ZSWZ);
		tvPFBZ = (TextView) findViewById(R.id.tv_PFBZ);
		tvSFZXJK = (TextView) findViewById(R.id.tv_SFZXJK);
		tvBZ = (TextView) findViewById(R.id.tv_BZ);
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
		NoiseSourceInfoBean mNoiseSourceInfoBean = (NoiseSourceInfoBean) o;
		if (Constant.RESPONSE_SUCCESS.equals(mNoiseSourceInfoBean.getSuccess())) {
			initData(mNoiseSourceInfoBean);
		} else {
			ToastUtils.showShort(getApplicationContext(), mNoiseSourceInfoBean.getMsg());
		}
	}

	private void initData(NoiseSourceInfoBean mNoiseSourceInfoBean) {
		if (mNoiseSourceInfoBean.getData().getQueryData().size() >= 1) {
			if (mNoiseSourceInfoBean.getData().getQueryData().get(0).getWrybh() != null)
				tvWRYBH.setText(mNoiseSourceInfoBean.getData().getQueryData().get(0).getWrybh().toString());

			if (mNoiseSourceInfoBean.getData().getQueryData().get(0).getZsrbh() != null)
				tvZSYBH.setText(mNoiseSourceInfoBean.getData().getQueryData().get(0).getZsrbh().toString());

			if (mNoiseSourceInfoBean.getData().getQueryData().get(0).getZsymc() != null)
				tvZSYMC.setText(mNoiseSourceInfoBean.getData().getQueryData().get(0).getZsymc().toString());

			if (mNoiseSourceInfoBean.getData().getQueryData().get(0).getZsyxz() != null)
				tvZSYXZ.setText(mNoiseSourceInfoBean.getData().getQueryData().get(0).getZsyxz().toString());
				tvZSYXZ.setText("性质一");

			if (mNoiseSourceInfoBean.getData().getQueryData().get(0).getZswz() != null)
				tvZSWZ.setText(mNoiseSourceInfoBean.getData().getQueryData().get(0).getZswz().toString());

			if (mNoiseSourceInfoBean.getData().getQueryData().get(0).getPfbz() != null)
				tvPFBZ.setText(mNoiseSourceInfoBean.getData().getQueryData().get(0).getPfbz().toString());

			if (mNoiseSourceInfoBean.getData().getQueryData().get(0).getSfzxjk() != null)
				tvSFZXJK.setText(mNoiseSourceInfoBean.getData().getQueryData().get(0).getSfzxjk().toString());
			tvSFZXJK.setText("是");

			if (mNoiseSourceInfoBean.getData().getQueryData().get(0).getBz() != null)
				tvBZ.setText(mNoiseSourceInfoBean.getData().getQueryData().get(0).getBz().toString());
		} else {

		}
	}
}
