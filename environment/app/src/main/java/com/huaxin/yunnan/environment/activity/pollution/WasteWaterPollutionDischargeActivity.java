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
import com.huaxin.yunnan.environment.bean.WasteWaterPollutionDischargeBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_WASTEWATERPOLLUTION_INFO;

/**
 * 污染源废水排放口排放污染物信息页面
 */
public class WasteWaterPollutionDischargeActivity extends BaseActicity implements View.OnClickListener, CallBack {
	private TextView titleText;
	private TextView tvWRYBH;
	private TextView tvPWKBH;
	private TextView tvWRWDM;
	private TextView tvPFBZ;
	private TextView tvPFBZZDW;
	private TextView tvPFBZSZ;
	private TextView tvPFBZZSX;
	private TextView tvPFBZZXX;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_waste_water_pollution_discharge);
		initProgressDialog();
		Intent intent = getIntent();
		String uuid = intent.getStringExtra("uuid");
		initView();
		NetTool.PollutionPost(getApplicationContext(), uuid, URL_QUERY_WASTEWATERPOLLUTION_INFO, WasteWaterPollutionDischargeBean.class, this, yNProgressDialog);
	}

	private void initView() {
		titleText = (TextView) findViewById(R.id.title_text);
		titleText.setText("污染源废水排放口排放污染物信息");
		tvWRYBH = (TextView) findViewById(R.id.tv_WRYBH);
		tvPWKBH = (TextView) findViewById(R.id.tv_PWKBH);
		tvWRWDM = (TextView) findViewById(R.id.tv_WRWDM);
		tvPFBZ = (TextView) findViewById(R.id.tv_PFBZ);
		tvPFBZZDW = (TextView) findViewById(R.id.tv_PFBZZDW);
		tvPFBZSZ = (TextView) findViewById(R.id.tv_PFBZSZ);
		tvPFBZZSX = (TextView) findViewById(R.id.tv_PFBZZSX);
		tvPFBZZXX = (TextView) findViewById(R.id.tv_PFBZZXX);
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
		WasteWaterPollutionDischargeBean mWasteWaterPollutionDischargeBean = (WasteWaterPollutionDischargeBean) o;
		if (Constant.RESPONSE_SUCCESS.equals(mWasteWaterPollutionDischargeBean.getSuccess())) {
			initData(mWasteWaterPollutionDischargeBean);
		} else {
			ToastUtils.showShort(getApplicationContext(),mWasteWaterPollutionDischargeBean.getMsg());
		}
	}

	private void initData(WasteWaterPollutionDischargeBean mWasteWaterPollutionDischargeBean) {
		if (mWasteWaterPollutionDischargeBean.getData().getQueryData().size() >= 1) {
			if (mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getWrybh() != null)
				tvWRYBH.setText(mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getWrybh().toString());

			if (mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPwkbh() != null)
				tvPWKBH.setText(mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPwkbh().toString());

			if (mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getWrwdm() != null)
				tvWRWDM.setText(mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getWrwdm().toString());

			if (mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPfbz() != null)
				tvPFBZ.setText(mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPfbz().toString());

			if (mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPfbzdw() != null)
				tvPFBZZDW.setText(mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPfbzdw().toString());

			String PFBZSZ = mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPfbzsz() + "";
			if (PFBZSZ != null)
				tvPFBZSZ.setText(PFBZSZ);

			String PFBZZSX = mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPfbzzsx() + "";
			if (PFBZZSX != null)
				tvPFBZZSX.setText(PFBZZSX);

			String PFBZZXX = mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPfbzzxx() + "";
			if (PFBZZXX != null)
				tvPFBZZXX.setText(PFBZZXX);
		}
	}
}
