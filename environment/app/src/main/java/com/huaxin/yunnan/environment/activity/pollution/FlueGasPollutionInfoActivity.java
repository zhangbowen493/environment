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
import com.huaxin.yunnan.environment.bean.FlueGasPollutionInfoBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_FLUEGAS_INFO;

/**
 * 污染源废气排放口信息页面
 */
public class FlueGasPollutionInfoActivity extends BaseActicity implements View.OnClickListener, CallBack {
	private TextView titleText;
	private TextView tvWRYBH;
	private TextView tvPFKBH;
	private TextView tvPFKMC;
	private TextView tvPFKWZ;
	private TextView tvZXBJ;
	private TextView tvPFKLX;
	private TextView tvPFGL;
	private TextView tvPFKGD;
	private TextView tvPQTJQMJ;
	private TextView tvCKNJ;
	private TextView tvRLZL;
	private TextView tvRSFS;
	private TextView tvCJGDMC;
	private TextView tvSFAZZXJKSB;
	private TextView tvJDD;
	private TextView tvJDF;
	private TextView tvJDM;
	private TextView tvWDD;
	private TextView tvWDF;
	private TextView tvWDM;
	private TextView tvBZ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_flue_gas_pollution_info);
		initProgressDialog();
		Intent intent = getIntent();
		String uuid = intent.getStringExtra("uuid");
		initView();
		NetTool.PollutionPost(getApplicationContext(), uuid, URL_QUERY_FLUEGAS_INFO, FlueGasPollutionInfoBean.class, this, yNProgressDialog);
	}

	private void initView() {
		titleText = (TextView) findViewById(R.id.title_text);
		titleText.setText("污染源废气排放口信息");
		tvWRYBH = (TextView) findViewById(R.id.tv_WRYBH);
		tvPFKBH = (TextView) findViewById(R.id.tv_PFKBH);
		tvPFKMC = (TextView) findViewById(R.id.tv_PFKMC);
		tvPFKWZ = (TextView) findViewById(R.id.tv_PFKWZ);
		tvZXBJ = (TextView) findViewById(R.id.tv_ZXBJ);
		tvPFKLX = (TextView) findViewById(R.id.tv_PFKLX);
		tvPFGL = (TextView) findViewById(R.id.tv_PFGL);
		tvPFKGD = (TextView) findViewById(R.id.tv_PFKGD);
		tvPQTJQMJ = (TextView) findViewById(R.id.tv_PQTJQMJ);
		tvCKNJ = (TextView) findViewById(R.id.tv_CKNJ);
		tvRLZL = (TextView) findViewById(R.id.tv_RLZL);
		tvRSFS = (TextView) findViewById(R.id.tv_RSFS);
		tvCJGDMC = (TextView) findViewById(R.id.tv_CJGDMC);
		tvSFAZZXJKSB = (TextView) findViewById(R.id.tv_SFAZZXJKSB);
		tvJDD = (TextView) findViewById(R.id.tv_JDD);
		tvJDF = (TextView) findViewById(R.id.tv_JDF);
		tvJDM = (TextView) findViewById(R.id.tv_JDM);
		tvWDD = (TextView) findViewById(R.id.tv_WDD);
		tvWDF = (TextView) findViewById(R.id.tv_WDF);
		tvWDM = (TextView) findViewById(R.id.tv_WDM);
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
		FlueGasPollutionInfoBean mFlueGasPollutionInfoBean = (FlueGasPollutionInfoBean) o;
		if (Constant.RESPONSE_SUCCESS.equals(mFlueGasPollutionInfoBean.getSuccess())) {
			initData(mFlueGasPollutionInfoBean);
		} else {
			ToastUtils.showShort(getApplicationContext(),mFlueGasPollutionInfoBean.getMsg());
		}
	}

	private void initData(FlueGasPollutionInfoBean mWasteWaterPollutionDischargeBean) {
		if (mWasteWaterPollutionDischargeBean.getData().getQueryData().size() >= 1) {
			if (mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getWrybh() != null)
				tvWRYBH.setText(mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getWrybh().toString());

			if (mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPfkbh() != null)
				tvPFKBH.setText(mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPfkbh().toString());

			if (mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPfkmc() != null)
				tvPFKMC.setText(mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPfkmc().toString());

			if (mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPfkwz() != null)
				tvPFKWZ.setText(mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPfkwz().toString());

			if (mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getZxbz() != null)
				tvZXBJ.setText(mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getZxbz().toString());

			if (mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPfklx() != null)
				tvPFKLX.setText(mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPfklx().toString());
				tvPFKLX.setText("类型一");

			if (mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPfgl() != null)
				tvPFGL.setText(mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPfgl().toString());
			tvPFGL.setText("规律一");

			String PFKGD = mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPfkgd() + "";
			if (PFKGD != null)
				tvPFKGD.setText(PFKGD);

			String PQTJQMJ = mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getPqtjmj() + "";
			if (PQTJQMJ != null)
				tvPQTJQMJ.setText(PQTJQMJ);

			String CKNJ = mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getCknj() + "";
			if (CKNJ != null)
				tvCKNJ.setText(CKNJ);

			if (mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getRszl() != null)
				tvRLZL.setText(mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getRszl().toString());

			if (mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getRsfs() != null)
				tvRSFS.setText(mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getRsfs().toString());

			if (mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getCjgdmc() != null)
				tvCJGDMC.setText(mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getCjgdmc().toString());

			if (mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getSfazzxjksb() != null)
				tvSFAZZXJKSB.setText(mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getSfazzxjksb().toString());
				tvSFAZZXJKSB.setText("是");

			String JDD = mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getJdd() + "";
			if (JDD != null)
				tvJDD.setText(JDD);

			String JDF = mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getJdf() + "";
			if (JDF != null)
				tvJDF.setText(JDF);

			String JDM = mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getJdm() + "";
			if (JDM != null)
				tvJDM.setText(JDM);

			String WDD = mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getWdd() + "";
			if (WDD != null)
				tvWDD.setText(WDD);

			String WDF = mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getWdf() + "";
			if (WDF != null)
				tvWDF.setText(WDF);

			String WDM = mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getWdm() + "";
			if (WDM != null)
				tvWDM.setText(WDM);

			if (mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getBz() != null)
				tvBZ.setText(mWasteWaterPollutionDischargeBean.getData().getQueryData().get(0).getBz().toString());
		} else {

		}
	}
}
