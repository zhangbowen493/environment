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
import com.huaxin.yunnan.environment.bean.PollutionMaterialsBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_POLLYTIONMATERIALS_INFO;

/**
 * 污染源主要原辅材料信息页面
 */
public class PollutionMaterialsActivity extends BaseActicity implements View.OnClickListener, CallBack {
	private TextView titleText;
	private TextView tvWRYBH;
	private TextView tvXH;
	private TextView tvYFCLMC;
	private TextView tvNYL;
	private TextView tvDW;
	private TextView tvBZ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pollution_materials);
		initProgressDialog();
		Intent intent = getIntent();
		String uuid = intent.getStringExtra("uuid");
		initView();
		NetTool.PollutionPost(getApplicationContext(), uuid, URL_QUERY_POLLYTIONMATERIALS_INFO, PollutionMaterialsBean.class, this, yNProgressDialog);
	}

	private void initView() {
		titleText = (TextView) findViewById(R.id.title_text);
		titleText.setText("污染源主要原辅材料信息");
		tvWRYBH = (TextView) findViewById(R.id.tv_WRYBH);
		tvXH = (TextView) findViewById(R.id.tv_XH);
		tvYFCLMC = (TextView) findViewById(R.id.tv_YFCLMC);
		tvNYL = (TextView) findViewById(R.id.tv_NYL);
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
		PollutionMaterialsBean mPollutionMaterialsBean = (PollutionMaterialsBean) o;
		if (Constant.RESPONSE_SUCCESS.equals(mPollutionMaterialsBean.getSuccess())) {
			initData(mPollutionMaterialsBean);
		} else {
			ToastUtils.showShort(getApplicationContext(), mPollutionMaterialsBean.getMsg());
		}
	}

	private void initData(PollutionMaterialsBean mPollutionMaterialsBean) {
		if (mPollutionMaterialsBean.getData().getQueryData().size() >= 1) {
			if (mPollutionMaterialsBean.getData().getQueryData().get(0).getWrybh() != null)
				tvWRYBH.setText(mPollutionMaterialsBean.getData().getQueryData().get(0).getWrybh().toString());
			String XH = mPollutionMaterialsBean.getData().getQueryData().get(0).getXh() + "";
			if (XH != null)
				tvXH.setText(XH);
			if (mPollutionMaterialsBean.getData().getQueryData().get(0).getYfclmc() != null)
				tvYFCLMC.setText(mPollutionMaterialsBean.getData().getQueryData().get(0).getYfclmc().toString());
			String NYL = mPollutionMaterialsBean.getData().getQueryData().get(0).getNcl() + "";
			if (NYL != null)
				tvNYL.setText(NYL);
			if (mPollutionMaterialsBean.getData().getQueryData().get(0).getDw() != null)
				tvDW.setText(mPollutionMaterialsBean.getData().getQueryData().get(0).getDw().toString());
			if (mPollutionMaterialsBean.getData().getQueryData().get(0).getBz() != null)
				tvBZ.setText(mPollutionMaterialsBean.getData().getQueryData().get(0).getBz().toString());
		}
	}
}
