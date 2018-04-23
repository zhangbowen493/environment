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
import com.huaxin.yunnan.environment.bean.MajorProductBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_MAJORPRODUCT_INFO;

/**
 * 污染源主要产品信息页面
 */
public class MajorProductActivity extends BaseActicity implements View.OnClickListener, CallBack {
	private TextView titleText;
	private TextView tvWRYBH;
	private TextView tvXH;
	private TextView tvCPDM;
	private TextView tvCPMC;
	private TextView tvNCL;
	private TextView tvDW;
	private TextView tvBZ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_major_product);
		initProgressDialog();
		Intent intent = getIntent();
		String uuid = intent.getStringExtra("uuid");
		initView();
		NetTool.PollutionPost(getApplicationContext(), uuid, URL_QUERY_MAJORPRODUCT_INFO, MajorProductBean.class, this, yNProgressDialog);
	}

	private void initView() {
		titleText = (TextView) findViewById(R.id.title_text);
		titleText.setText("污染源主要产品信息");
		tvWRYBH = (TextView) findViewById(R.id.tv_WRYBH);
		tvXH = (TextView) findViewById(R.id.tv_XH);
		tvCPDM = (TextView) findViewById(R.id.tv_CPDM);
		tvCPMC = (TextView) findViewById(R.id.tv_CPMC);
		tvNCL = (TextView) findViewById(R.id.tv_NCL);
		tvDW = (TextView) findViewById(R.id.tv_DW);
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
		MajorProductBean mMajorProductBean = (MajorProductBean) o;
		if (Constant.RESPONSE_SUCCESS.equals(mMajorProductBean.getSuccess())) {
			initData(mMajorProductBean);
		} else {
			ToastUtils.showShort(getApplicationContext(),  mMajorProductBean.getMsg());
		}
	}

	private void initData(MajorProductBean mMajorProductBean) {
		if (mMajorProductBean.getData().getQueryData().size() >= 1) {
			if (mMajorProductBean.getData().getQueryData().get(0).getWrybh() != null)
				tvWRYBH.setText(mMajorProductBean.getData().getQueryData().get(0).getWrybh().toString());
			String XH = mMajorProductBean.getData().getQueryData().get(0).getXh() + "";
			if (XH != null)
				tvXH.setText(XH);
			if (mMajorProductBean.getData().getQueryData().get(0).getCpdm() != null)
				tvCPDM.setText(mMajorProductBean.getData().getQueryData().get(0).getCpdm().toString());
			if (mMajorProductBean.getData().getQueryData().get(0).getCpmc() != null)
				tvCPMC.setText(mMajorProductBean.getData().getQueryData().get(0).getCpmc().toString());
			String NCL = mMajorProductBean.getData().getQueryData().get(0).getNcl() + "";
			if (NCL != null)
				tvNCL.setText(NCL);
			if (mMajorProductBean.getData().getQueryData().get(0).getDw() != null)
				tvDW.setText(mMajorProductBean.getData().getQueryData().get(0).getDw().toString());
			if (mMajorProductBean.getData().getQueryData().get(0).getBz() != null)
				tvBZ.setText(mMajorProductBean.getData().getQueryData().get(0).getBz().toString());
		} else {

		}
	}
}
