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
import com.huaxin.yunnan.environment.bean.FlueGasManagementFacilitiesBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_FLUEGASMANAGEMENT_INFO;

/**
 * 污染源废气治理设施信息页面
 */
public class FlueGasManagementFacilitiesActivity extends BaseActicity implements View.OnClickListener, CallBack {
	private TextView titleText;
	private TextView tvWRYBH;
	private TextView tvJHZZBH;
	private TextView tvJHZZMC;
	private TextView tvGGXH;
	private TextView tvSJCLNL;
	private TextView tvSJJHL;
	private TextView tvSCJJL;
	private TextView tvJHFF;
	private TextView tvZTTE;
	private TextView tvGDZCYZ;
	private TextView tvNYXFY;
	private TextView tvTYRQ;
	private TextView tvSSYXZT;
	private TextView tvPFKBH;
	private TextView tvBZ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_flue_gas_management_facilities);
		initProgressDialog();
		Intent intent = getIntent();
		String uuid = intent.getStringExtra("uuid");
		initView();
		NetTool.PollutionPost(getApplicationContext(), uuid, URL_QUERY_FLUEGASMANAGEMENT_INFO, FlueGasManagementFacilitiesBean.class, this, yNProgressDialog);
	}

	private void initView() {
		titleText = (TextView) findViewById(R.id.title_text);
		titleText.setText("污染源废气治理设施信息");
		tvWRYBH = (TextView) findViewById(R.id.tv_WRYBH);
		tvJHZZBH = (TextView) findViewById(R.id.tv_JHZZBH);
		tvJHZZMC = (TextView) findViewById(R.id.tv_JHZZMC);
		tvGGXH = (TextView) findViewById(R.id.tv_GGXH);
		tvSJCLNL = (TextView) findViewById(R.id.tv_SJCLNL);
		tvSJJHL = (TextView) findViewById(R.id.tv_SJJHL);
		tvSCJJL = (TextView) findViewById(R.id.tv_SCJJL);
		tvJHFF = (TextView) findViewById(R.id.tv_JHFF);
		tvZTTE = (TextView) findViewById(R.id.tv_ZTTE);
		tvGDZCYZ = (TextView) findViewById(R.id.tv_GDZCYZ);
		tvNYXFY = (TextView) findViewById(R.id.tv_NYXFY);
		tvTYRQ = (TextView) findViewById(R.id.tv_TYRQ);
		tvSSYXZT = (TextView) findViewById(R.id.tv_SSYXZT);
		tvPFKBH = (TextView) findViewById(R.id.tv_PFKBH);
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
		FlueGasManagementFacilitiesBean mFlueGasManagementFacilitiesBean = (FlueGasManagementFacilitiesBean) o;
		if (Constant.RESPONSE_SUCCESS.equals(mFlueGasManagementFacilitiesBean.getSuccess())) {
			initData(mFlueGasManagementFacilitiesBean);
		} else {
			ToastUtils.showShort(getApplicationContext(),  mFlueGasManagementFacilitiesBean.getMsg());
		}
	}

	private void initData(FlueGasManagementFacilitiesBean mFlueGasManagementFacilitiesBean) {
		if (mFlueGasManagementFacilitiesBean.getData().getQueryData().size() >= 1) {
			if (mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getWrybh() != null)
				tvWRYBH.setText(mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getWrybh().toString());

			if (mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getJhzzbh() != null)
				tvJHZZBH.setText(mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getJhzzbh().toString());

			if (mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getJhzzmc() != null)
				tvJHZZMC.setText(mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getJhzzmc().toString());

			if (mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getGgxh() != null)
				tvGGXH.setText(mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getGgxh().toString());

			String SJCLNL = mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getSjclnl() + "";
			if (SJCLNL != null) {
				tvSJCLNL.setText(SJCLNL);
			}

			String SJJHL = mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getSjjhl() + "";
			if (SJJHL != null)
				tvSJJHL.setText(SJJHL);

			String SCJHL = mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getScjhl() + "";
			if (SCJHL != null)
				tvSCJJL.setText(SCJHL);

			if (mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getJhff() != null)
				tvJHFF.setText(mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getJhff().toString());

			String ZTZ = mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getZtz() + "";
			if (ZTZ != null)
				tvZTTE.setText(ZTZ);

			String GDZCYZ = mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getGdzcyz() + "";
			if (GDZCYZ != null)
				tvGDZCYZ.setText(GDZCYZ);

			String NYXFY = mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getNyxfy() + "";
			if (NYXFY != null)
				tvNYXFY.setText(NYXFY);

			if (mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getTyrq() != null)
				tvTYRQ.setText(mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getTyrq().toString());

			if (mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getSsyxzt() != null)
				tvSSYXZT.setText(mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getSsyxzt().toString());
			tvSSYXZT.setText("正常");

			if (mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getBz() != null)
				tvBZ.setText(mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getBz().toString());

			if (mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getPfkbh() != null)
				tvPFKBH.setText(mFlueGasManagementFacilitiesBean.getData().getQueryData().get(0).getPfkbh().toString());
		} else {

		}
	}
}
