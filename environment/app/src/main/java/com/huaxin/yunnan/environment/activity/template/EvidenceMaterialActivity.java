package com.huaxin.yunnan.environment.activity.template;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.Constant;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.bean.EvidenceMaterialBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_FM_INFO;

/**
 * 14、取证材料页面
 */
public class EvidenceMaterialActivity extends BaseActicity implements View.OnClickListener, CallBack {

	private TextView titleText;
	private TextView mVCMATERIALNAME;
	private TextView mDTSHOOTINGTIME;
	private TextView mVCPHOTOGRAPHER;
	private TextView mVCSHOOTINGLOCATION;
	private TextView mVCPROOFOBJECT;
	private TextView mVCLAWENFORCEMENTOFFICIALS;
	private TextView mVCLAWENFORCEMENTCERTIFICATE;
	private TextView mVCREMARKS;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_evidence_material);
		initProgressDialog();
		Intent intent = getIntent();
		String t_task_list_id = intent.getStringExtra("t_task_list_id");
		initView();
		NetTool.templatePost(getApplicationContext(), t_task_list_id, URL_QUERY_FM_INFO, EvidenceMaterialBean.class, this, yNProgressDialog);
	}

	private void initView() {
		titleText = (TextView) findViewById(R.id.title_text);
		titleText.setText("取证材料");
		titleText.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				finish();
			}
		});
		findViewById(R.id.ll_no).setOnClickListener(this);
		mVCMATERIALNAME = (TextView) findViewById(R.id.VC_MATERIAL_NAME);
		mDTSHOOTINGTIME = (TextView) findViewById(R.id.DT_SHOOTING_TIME);
		mVCPHOTOGRAPHER = (TextView) findViewById(R.id.VC_PHOTOGRAPHER);
		mVCSHOOTINGLOCATION = (TextView) findViewById(R.id.VC_SHOOTING_LOCATION);
		mVCPROOFOBJECT = (TextView) findViewById(R.id.VC_PROOF_OBJECT);
		mVCLAWENFORCEMENTOFFICIALS = (TextView) findViewById(R.id.VC_LAW_ENFORCEMENT_OFFICIALS);
		mVCLAWENFORCEMENTCERTIFICATE = (TextView) findViewById(R.id.VC_LAW_ENFORCEMENT_CERTIFICATE);
		mVCREMARKS = (TextView) findViewById(R.id.VC_REMARKS);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.title_text:
				finish();
				break;
		}
	}

	@Override
	public void getResult(Object o) {
		EvidenceMaterialBean mEvidenceMaterialBean = (EvidenceMaterialBean) o;
		if (Constant.RESPONSE_SUCCESS.equals(mEvidenceMaterialBean.getSuccess())) {
			initData(mEvidenceMaterialBean);
		} else {
			LogUtils.e("请求失败，错误码：" + mEvidenceMaterialBean.getSuccess() + "错误信息：" + mEvidenceMaterialBean.getMsg());
		}
	}

	private void initData(EvidenceMaterialBean mEvidenceMaterialBean) {

		if (mEvidenceMaterialBean.getData().get(0).getVc_material_name() != null)
			mVCMATERIALNAME.setText(mEvidenceMaterialBean.getData().get(0).getVc_material_name().toString());
		if (mEvidenceMaterialBean.getData().get(0).getDt_shooting_time() != null)
			mDTSHOOTINGTIME.setText(mEvidenceMaterialBean.getData().get(0).getDt_shooting_time().toString());
		if (mEvidenceMaterialBean.getData().get(0).getVc_photographer() != null)
			mVCPHOTOGRAPHER.setText(mEvidenceMaterialBean.getData().get(0).getVc_photographer().toString());
		if (mEvidenceMaterialBean.getData().get(0).getVc_shooting_location() != null)
			mVCSHOOTINGLOCATION.setText(mEvidenceMaterialBean.getData().get(0).getVc_shooting_location().toString());
		if (mEvidenceMaterialBean.getData().get(0).getVc_proof_object() != null)
			mVCPROOFOBJECT.setText(mEvidenceMaterialBean.getData().get(0).getVc_proof_object().toString());
		if (mEvidenceMaterialBean.getData().get(0).getVc_law_enforcement_officials() != null)
			mVCLAWENFORCEMENTOFFICIALS.setText(mEvidenceMaterialBean.getData().get(0).getVc_law_enforcement_officials().toString());
		if (mEvidenceMaterialBean.getData().get(0).getVc_law_enforcement_certificate() != null)
			mVCLAWENFORCEMENTCERTIFICATE.setText(mEvidenceMaterialBean.getData().get(0).getVc_law_enforcement_certificate().toString());
		if (mEvidenceMaterialBean.getData().get(0).getVc_remarks() != null)
			mVCREMARKS.setText(mEvidenceMaterialBean.getData().get(0).getVc_remarks().toString());
	}
}
