package com.huaxin.yunnan.environment.activity.template;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.Constant;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.bean.InorganicPhosphorusChemicalBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_WR_INFO;

/**
 * 20、无机磷化工行业现场监察记录页面
 */
public class InorganicPhosphorusChemicalActivity extends BaseActicity implements View.OnClickListener, CallBack {

	private TextView titleText;
	private TextView mDTSTARTTIME;
	private TextView mDTENDTIME;
	private TextView mVCLOCATION;
	private TextView mVCJCR;
	private TextView mVCZFZH;
	private TextView mVCJLR;
	private TextView mVCBJCDWMC;
	private TextView mVCZZJGDMZH;
	private TextView mVCFDDBR;
	private TextView mVCFDDBRSFZH;
	private TextView mVCXCFZR;
	private TextView mVCXCFZRSFZH;
	private TextView mNBAGE;
	private TextView mVCGZDW;
	private TextView mVCDUTY;
	private TextView mVCYBAGX;
	private TextView mVCADDRESS;
	private TextView mVCTELEPHONE;
	private TextView mVCYZBM;
	private TextView mCLQTCJRXMJGZDW;
	private TextView mVCHBDWMC;
	private TextView mVCHBDWLX;
	private TextView mVCHJJCLX;
	private TextView mVCSFQRZJ;
	private TextView mVCSFSQHB;
	private TextView mVCCITY;
	private TextView mVCCOUNTY;
	private TextView mVCTOWN;
	private TextView mVCXZC;
	private TextView mVCGYYQ;
	private TextView mVCPQ;
	private TextView mVCXCJCSZT;
	private TextView mVCQYZYCP;
	private TextView mVCCL;
	private TextView mVCZYSCGY;
	private TextView mVCSCZZJSB;
	private TextView mVCXMSFYBG;
	private TextView mVCBGQKMS;
	private TextView mVCBZHPBGWJ;
	private TextView mVCCZJDHPDJ;
	private TextView mVCJGHBBMSP;
	private TextView mVCCZYJSP;
	private TextView mVCYJSPQKMS;
	private TextView mVCSSCSPTY;
	private TextView mVCWPZSSCMS;
	private TextView mVCXMJGYS;
	private TextView mVCWYSCGYN;
	private TextView mVCHPBZDW;
	private TextView mDTBZTIME;
	private TextView mVCSPWH;
	private TextView mVCSSCSPDW;
	private TextView mDTSSCSPTIME;
	private TextView mVCSSCSPWH;
	private TextView mVCJGYSDW;
	private TextView mDTJGYSTIME;
	private TextView mVCJGYSWH;
	private TextView mVCYFQDXKZ;
	private TextView mVCAGDPFWRW;
	private TextView mVCJXPWSBDJ;
	private TextView mVCJNPWF;
	private TextView mVCSYNJNPWF;
	private TextView mVCYJNPWF;
	private TextView mVCWZEJNYY;
	private TextView mVCFSCSHJ;
	private TextView mVCFSTZWRW;
	private TextView mVCQTWRW;
	private TextView mVCSJCSL;
	private TextView mVCSCFDCLSS;
	private TextView mVCCLL;
	private TextView mVCFHFSCLYQ;
	private TextView mVCBFHQKMS;
	private TextView mVCSXFSFL;
	private TextView mVCCZTPFSXW;
	private TextView mVCQKSM;
	private TextView mVCFSSFCB;
	private TextView mVCCBYZJJCZ;
	private TextView mVCJCDW;
	private TextView mDTJCTIME;
	private TextView mVCAZZXJCZZ;
	private TextView mDTAZTIME;
	private TextView mVCYHBBMLW;
	private TextView mVCSFYXZC;
	private TextView mVCSFJGJY;
	private TextView mDTJYTIME;
	private TextView mVCZXJCSJ;
	private TextView mVCZYWXFW;
	private TextView mVCFGSCSL;
	private TextView mVCFGSCZCS;
	private TextView mVCFSZCSL;
	private TextView mVCFSZCZCS;
	private TextView mVCHSSNCSL;
	private TextView mVCSSNCZCS;
	private TextView mVCFCMCSL;
	private TextView mVCFCMCZCS;
	private TextView mVCQTGTFW;
	private TextView mVCCSL;
	private TextView mVCQTGTFWCZCS;
	private TextView mVCWFTZSFGF;
	private TextView mVCXHBBMSB;
	private TextView mVCWSBDYNX;
	private TextView mVCWFCFCSYBS;
	private TextView mVCFHWFCCGF;
	private TextView mVCDCSJCGYN;
	private TextView mVCYYJXDCZC;
	private TextView mVCZXZYLDZD;
	private TextView mVCYSCLYZZ;
	private TextView mVCYSL;
	private TextView mVCPC;
	private TextView mVCJSDWYZZ;
	private TextView mVCSJCZFS;
	private TextView mVCQTYBGF;
	private TextView mVCJXGFCC;
	private TextView mVCLYCSFHYQ;
	private TextView mVCCZFS;
	private TextView mVCFQCSHJ;
	private TextView mVCPTFQZLSS;
	private TextView mVCWPTSSMC;
	private TextView mVCJQJCSFCB;
	private TextView mVCFQCBYZJJCZ;
	private TextView mVCFQJCDW;
	private TextView mDTFQJCTIME;
	private TextView mVCFQAZZXJCZZ;
	private TextView mDTFQAZTIME;
	private TextView mVCSFLW;
	private TextView mVCFQSFYXZC;
	private TextView mVCFQSFJGJY;
	private TextView mDTFQJYSJ;
	private TextView mVCFQZXJCSJXS;
	private TextView mVCSFCQJZCS;
	private TextView mVCWPTJSSS;
	private TextView mVCWSFHJL;
	private TextView mVCSFYBHMB;
	private TextView mDTBHMBJSSJ;
	private TextView mVCZBHJBHQK;
	private TextView mVCLSFXFFCS;
	private TextView mVCWLSQKMS;
	private TextView mVCBZTFYJYA;
	private TextView mVCDYAPGBBA;
	private TextView mVCJXNDYJYL;
	private TextView mVCSFCBYJWZ;
	private TextView mCLQTHBBMJCQK;
	private TextView mCLCZZYWT;
	private TextView mCLJCYQ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_no_phosphorus_chemical_industry);
		initProgressDialog();
		Intent intent = getIntent();
		String t_task_list_id = intent.getStringExtra("t_task_list_id");
		initView();
		NetTool.templatePost(getApplicationContext(), t_task_list_id, URL_QUERY_WR_INFO, InorganicPhosphorusChemicalBean.class, this, yNProgressDialog);
	}

	private void initView() {
		titleText = (TextView) findViewById(R.id.title_text);
		titleText.setText("无机磷化工行业现场监察记录");
		findViewById(R.id.title_text).setOnClickListener(this);
		mDTSTARTTIME = (TextView) findViewById(R.id.DT_START_TIME);
		mDTENDTIME = (TextView) findViewById(R.id.DT_END_TIME);
		mVCLOCATION = (TextView) findViewById(R.id.VC_LOCATION);
		mVCJCR = (TextView) findViewById(R.id.VC_JCR);
		mVCZFZH = (TextView) findViewById(R.id.VC_ZFZH);
		mVCJLR = (TextView) findViewById(R.id.VC_JLR);
		mVCBJCDWMC = (TextView) findViewById(R.id.VC_BJCDWMC);
		mVCZZJGDMZH = (TextView) findViewById(R.id.VC_ZZJGDMZH);
		mVCFDDBR = (TextView) findViewById(R.id.VC_FDDBR);
		mVCFDDBRSFZH = (TextView) findViewById(R.id.VC_FDDBRSFZH);
		mVCXCFZR = (TextView) findViewById(R.id.VC_XCFZR);
		mVCXCFZRSFZH = (TextView) findViewById(R.id.VC_XCFZRSFZH);
		mNBAGE = (TextView) findViewById(R.id.NB_AGE);
		mVCGZDW = (TextView) findViewById(R.id.VC_GZDW);
		mVCDUTY = (TextView) findViewById(R.id.VC_DUTY);
		mVCYBAGX = (TextView) findViewById(R.id.VC_YBAGX);
		mVCADDRESS = (TextView) findViewById(R.id.VC_ADDRESS);
		mVCTELEPHONE = (TextView) findViewById(R.id.VC_TELEPHONE);
		mVCYZBM = (TextView) findViewById(R.id.VC_YZBM);
		mCLQTCJRXMJGZDW = (TextView) findViewById(R.id.CL_QTCJRXMJGZDW);
		mVCHBDWMC = (TextView) findViewById(R.id.VC_HBDWMC);
		mVCHBDWLX = (TextView) findViewById(R.id.VC_HBDWLX);
		mVCHJJCLX = (TextView) findViewById(R.id.VC_HJJCLX);
		mVCSFQRZJ = (TextView) findViewById(R.id.VC_SFQRZJ);
		mVCSFSQHB = (TextView) findViewById(R.id.VC_SFSQHB);
		mVCCITY = (TextView) findViewById(R.id.VC_CITY);
		mVCCOUNTY = (TextView) findViewById(R.id.VC_COUNTY);
		mVCTOWN = (TextView) findViewById(R.id.VC_TOWN);
		mVCXZC = (TextView) findViewById(R.id.VC_XZC);
		mVCGYYQ = (TextView) findViewById(R.id.VC_GYYQ);
		mVCPQ = (TextView) findViewById(R.id.VC_PQ);
		mVCXCJCSZT = (TextView) findViewById(R.id.VC_XCJCSZT);
		mVCQYZYCP = (TextView) findViewById(R.id.VC_QYZYCP);
		mVCCL = (TextView) findViewById(R.id.VC_CL);
		mVCZYSCGY = (TextView) findViewById(R.id.VC_ZYSCGY);
		mVCSCZZJSB = (TextView) findViewById(R.id.VC_SCZZJSB);
		mVCXMSFYBG = (TextView) findViewById(R.id.VC_XMSFYBG);
		mVCBGQKMS = (TextView) findViewById(R.id.VC_BGQKMS);
		mVCBZHPBGWJ = (TextView) findViewById(R.id.VC_BZHPBGWJ);
		mVCCZJDHPDJ = (TextView) findViewById(R.id.VC_CZJDHPDJ);
		mVCJGHBBMSP = (TextView) findViewById(R.id.VC_JGHBBMSP);
		mVCCZYJSP = (TextView) findViewById(R.id.VC_CZYJSP);
		mVCYJSPQKMS = (TextView) findViewById(R.id.VC_YJSPQKMS);
		mVCSSCSPTY = (TextView) findViewById(R.id.VC_SSCSPTY);
		mVCWPZSSCMS = (TextView) findViewById(R.id.VC_WPZSSCMS);
		mVCXMJGYS = (TextView) findViewById(R.id.VC_XMJGYS);
		mVCWYSCGYN = (TextView) findViewById(R.id.VC_WYSCGYN);
		mVCHPBZDW = (TextView) findViewById(R.id.VC_HPBZDW);
		mDTBZTIME = (TextView) findViewById(R.id.DT_BZ_TIME);
		mVCSPWH = (TextView) findViewById(R.id.VC_SPWH);
		mVCSSCSPDW = (TextView) findViewById(R.id.VC_SSCSPDW);
		mDTSSCSPTIME = (TextView) findViewById(R.id.DT_SSCSP_TIME);
		mVCSSCSPWH = (TextView) findViewById(R.id.VC_SSCSPWH);
		mVCJGYSDW = (TextView) findViewById(R.id.VC_JGYSDW);
		mDTJGYSTIME = (TextView) findViewById(R.id.DT_JGYS_TIME);
		mVCJGYSWH = (TextView) findViewById(R.id.VC_JGYSWH);
		mVCYFQDXKZ = (TextView) findViewById(R.id.VC_YFQDXKZ);
		mVCAGDPFWRW = (TextView) findViewById(R.id.VC_AGDPFWRW);
		mVCJXPWSBDJ = (TextView) findViewById(R.id.VC_JXPWSBDJ);
		mVCJNPWF = (TextView) findViewById(R.id.VC_JNPWF);
		mVCSYNJNPWF = (TextView) findViewById(R.id.VC_SYNJNPWF);
		mVCYJNPWF = (TextView) findViewById(R.id.VC_YJNPWF);
		mVCWZEJNYY = (TextView) findViewById(R.id.VC_WZEJNYY);
		mVCFSCSHJ = (TextView) findViewById(R.id.VC_FSCSHJ);
		mVCFSTZWRW = (TextView) findViewById(R.id.VC_FSTZWRW);
		mVCQTWRW = (TextView) findViewById(R.id.VC_QTWRW);
		mVCSJCSL = (TextView) findViewById(R.id.VC_SJCSL);
		mVCSCFDCLSS = (TextView) findViewById(R.id.VC_SCFDCLSS);
		mVCCLL = (TextView) findViewById(R.id.VC_CLL);
		mVCFHFSCLYQ = (TextView) findViewById(R.id.VC_FHFSCLYQ);
		mVCBFHQKMS = (TextView) findViewById(R.id.VC_BFHQKMS);
		mVCSXFSFL = (TextView) findViewById(R.id.VC_SXFSFL);
		mVCCZTPFSXW = (TextView) findViewById(R.id.VC_CZTPFSXW);
		mVCQKSM = (TextView) findViewById(R.id.VC_QKSM);
		mVCFSSFCB = (TextView) findViewById(R.id.VC_FSSFCB);
		mVCCBYZJJCZ = (TextView) findViewById(R.id.VC_CBYZJJCZ);
		mVCJCDW = (TextView) findViewById(R.id.VC_JCDW);
		mDTJCTIME = (TextView) findViewById(R.id.DT_JC_TIME);
		mVCAZZXJCZZ = (TextView) findViewById(R.id.VC_AZZXJCZZ);
		mDTAZTIME = (TextView) findViewById(R.id.DT_AZ_TIME);
		mVCYHBBMLW = (TextView) findViewById(R.id.VC_YHBBMLW);
		mVCSFYXZC = (TextView) findViewById(R.id.VC_SFYXZC);
		mVCSFJGJY = (TextView) findViewById(R.id.VC_SFJGJY);
		mDTJYTIME = (TextView) findViewById(R.id.DT_JY_TIME);
		mVCZXJCSJ = (TextView) findViewById(R.id.VC_ZXJCSJ);
		mVCZYWXFW = (TextView) findViewById(R.id.VC_ZYWXFW);
		mVCFGSCSL = (TextView) findViewById(R.id.VC_FGSCSL);
		mVCFGSCZCS = (TextView) findViewById(R.id.VC_FGSCZCS);
		mVCFSZCSL = (TextView) findViewById(R.id.VC_FSZCSL);
		mVCFSZCZCS = (TextView) findViewById(R.id.VC_FSZCZCS);
		mVCHSSNCSL = (TextView) findViewById(R.id.VC_HSSNCSL);
		mVCSSNCZCS = (TextView) findViewById(R.id.VC_SSNCZCS);
		mVCFCMCSL = (TextView) findViewById(R.id.VC_FCMCSL);
		mVCFCMCZCS = (TextView) findViewById(R.id.VC_FCMCZCS);
		mVCQTGTFW = (TextView) findViewById(R.id.VC_QTGTFW);
		mVCCSL = (TextView) findViewById(R.id.VC_CSL);
		mVCQTGTFWCZCS = (TextView) findViewById(R.id.VC_QTGTFWCZCS);
		mVCWFTZSFGF = (TextView) findViewById(R.id.VC_WFTZSFGF);
		mVCXHBBMSB = (TextView) findViewById(R.id.VC_XHBBMSB);
		mVCWSBDYNX = (TextView) findViewById(R.id.VC_WSBDYNX);
		mVCWFCFCSYBS = (TextView) findViewById(R.id.VC_WFCFCSYBS);
		mVCFHWFCCGF = (TextView) findViewById(R.id.VC_FHWFCCGF);
		mVCDCSJCGYN = (TextView) findViewById(R.id.VC_DCSJCGYN);
		mVCYYJXDCZC = (TextView) findViewById(R.id.VC_YYJXDCZC);
		mVCZXZYLDZD = (TextView) findViewById(R.id.VC_ZXZYLDZD);
		mVCYSCLYZZ = (TextView) findViewById(R.id.VC_YSCLYZZ);
		mVCYSL = (TextView) findViewById(R.id.VC_YSL);
		mVCPC = (TextView) findViewById(R.id.VC_PC);
		mVCJSDWYZZ = (TextView) findViewById(R.id.VC_JSDWYZZ);
		mVCSJCZFS = (TextView) findViewById(R.id.VC_SJCZFS);
		mVCQTYBGF = (TextView) findViewById(R.id.VC_QTYBGF);
		mVCJXGFCC = (TextView) findViewById(R.id.VC_JXGFCC);
		mVCLYCSFHYQ = (TextView) findViewById(R.id.VC_LYCSFHYQ);
		mVCCZFS = (TextView) findViewById(R.id.VC_CZFS);
		mVCFQCSHJ = (TextView) findViewById(R.id.VC_FQCSHJ);
		mVCPTFQZLSS = (TextView) findViewById(R.id.VC_PTFQZLSS);
		mVCWPTSSMC = (TextView) findViewById(R.id.VC_WPTSSMC);
		mVCJQJCSFCB = (TextView) findViewById(R.id.VC_JQJCSFCB);
		mVCFQCBYZJJCZ = (TextView) findViewById(R.id.VC_FQCBYZJJCZ);
		mVCFQJCDW = (TextView) findViewById(R.id.VC_FQJCDW);
		mDTFQJCTIME = (TextView) findViewById(R.id.DT_FQJC_TIME);
		mVCFQAZZXJCZZ = (TextView) findViewById(R.id.VC_FQAZZXJCZZ);
		mDTFQAZTIME = (TextView) findViewById(R.id.DT_FQAZ_TIME);
		mVCSFLW = (TextView) findViewById(R.id.VC_SFLW);
		mVCFQSFYXZC = (TextView) findViewById(R.id.VC_FQSFYXZC);
		mVCFQSFJGJY = (TextView) findViewById(R.id.VC_FQSFJGJY);
		mDTFQJYSJ = (TextView) findViewById(R.id.DT_FQJYSJ);
		mVCFQZXJCSJXS = (TextView) findViewById(R.id.VC_FQZXJCSJXS);
		mVCSFCQJZCS = (TextView) findViewById(R.id.VC_SFCQJZCS);
		mVCWPTJSSS = (TextView) findViewById(R.id.VC_WPTJSSS);
		mVCWSFHJL = (TextView) findViewById(R.id.VC_WSFHJL);
		mVCSFYBHMB = (TextView) findViewById(R.id.VC_SFYBHMB);
		mDTBHMBJSSJ = (TextView) findViewById(R.id.DT_BHMBJSSJ);
		mVCZBHJBHQK = (TextView) findViewById(R.id.VC_ZBHJBHQK);
		mVCLSFXFFCS = (TextView) findViewById(R.id.VC_LSFXFFCS);
		mVCWLSQKMS = (TextView) findViewById(R.id.VC_WLSQKMS);
		mVCBZTFYJYA = (TextView) findViewById(R.id.VC_BZTFYJYA);
		mVCDYAPGBBA = (TextView) findViewById(R.id.VC_DYAPGBBA);
		mVCJXNDYJYL = (TextView) findViewById(R.id.VC_JXNDYJYL);
		mVCSFCBYJWZ = (TextView) findViewById(R.id.VC_SFCBYJWZ);
		mCLQTHBBMJCQK = (TextView) findViewById(R.id.CL_QTHBBMJCQK);
		mCLCZZYWT = (TextView) findViewById(R.id.CL_CZZYWT);
		mCLJCYQ = (TextView) findViewById(R.id.CL_JCYQ);

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
		InorganicPhosphorusChemicalBean mInorganicPhosphorusChemicalBean = (InorganicPhosphorusChemicalBean) o;
		if (Constant.RESPONSE_SUCCESS.equals(mInorganicPhosphorusChemicalBean.getSuccess())) {
			initData(mInorganicPhosphorusChemicalBean);
		} else {
			LogUtils.e("请求失败，错误码：" + mInorganicPhosphorusChemicalBean.getSuccess() + "错误信息：" + mInorganicPhosphorusChemicalBean.getMsg());
		}
	}

	private void initData(InorganicPhosphorusChemicalBean mInorganicPhosphorusChemicalBean) {

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getDt_start_time() != null)
			mDTSTARTTIME.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getDt_start_time().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getDt_end_time() != null)
			mDTENDTIME.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getDt_end_time().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_location() != null)
			mVCLOCATION.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_location().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jcr() != null)
			mVCJCR.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jcr().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_zfzh() != null)
			mVCZFZH.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_zfzh().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jlr() != null)
			mVCJLR.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jlr().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_bjcdwmc() != null)
			mVCBJCDWMC.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_bjcdwmc().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_zzjgdmzh() != null)
			mVCZZJGDMZH.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_zzjgdmzh().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fddbr() != null)
			mVCFDDBR.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fddbr().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fddbrsfzh() != null)
			mVCFDDBRSFZH.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fddbrsfzh().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_xcfzr() != null)
			mVCXCFZR.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_xcfzr().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_xcfzrsfzh() != null)
			mVCXCFZRSFZH.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_xcfzrsfzh().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getNb_age() != null)
			mNBAGE.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getNb_age().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_gzdw() != null)
			mVCGZDW.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_gzdw().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_duty() != null)
			mVCDUTY.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_duty().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_ybagx() != null)
			mVCYBAGX.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_ybagx().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_address() != null)
			mVCADDRESS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_address().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_telephone() != null)
			mVCTELEPHONE.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_telephone().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_yzbm() != null)
			mVCYZBM.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_yzbm().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getCl_qtcjrxmjgzdw() != null)
			mCLQTCJRXMJGZDW.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getCl_qtcjrxmjgzdw().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_hbdwmc() != null)
			mVCHBDWMC.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_hbdwmc().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_hbdwlx() != null)
			mVCHBDWLX.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_hbdwlx().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_hjjclx() != null)
			mVCHJJCLX.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_hjjclx().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sfqrzj() != null)
			mVCSFQRZJ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sfqrzj().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sfsqhb() != null)
			mVCSFSQHB.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sfsqhb().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_city() != null)
			mVCCITY.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_city().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_county() != null)
			mVCCOUNTY.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_county().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_town() != null)
			mVCTOWN.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_town().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_xzc() != null)
			mVCXZC.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_xzc().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_gyyq() != null)
			mVCGYYQ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_gyyq().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_pq() != null)
			mVCPQ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_pq().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_xcjcszt() != null)
			mVCXCJCSZT.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_xcjcszt().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_qyzycp() != null)
			mVCQYZYCP.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_qyzycp().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_cl() != null)
			mVCCL.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_cl().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_zyscgy() != null)
			mVCZYSCGY.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_zyscgy().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sczzjsb() != null)
			mVCSCZZJSB.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sczzjsb().toString());


		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_xmsfybg() != null)
			mVCXMSFYBG.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_xmsfybg().toString());


		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_bgqkms() != null)
			mVCBGQKMS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_bgqkms().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_bzhpbgwj() != null)
			mVCBZHPBGWJ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_bzhpbgwj().toString());


		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_czjdhpdj() != null)
			mVCCZJDHPDJ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_czjdhpdj().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jghbbmsp() != null)
			mVCJGHBBMSP.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jghbbmsp().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_czyjsp() != null)
			mVCCZYJSP.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_czyjsp().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_yjspqkms() != null)
			mVCYJSPQKMS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_yjspqkms().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sscspty() != null)
			mVCSSCSPTY.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sscspty().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_wpzsscms() != null)
			mVCWPZSSCMS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_wpzsscms().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_xmjgys() != null)
			mVCXMJGYS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_xmjgys().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_wyscgyn() != null)
			mVCWYSCGYN.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_wyscgyn().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_hpbzdw() != null)
			mVCHPBZDW.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_hpbzdw().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getDt_bz_time() != null)
			mDTBZTIME.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getDt_bz_time().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_spwh() != null)
			mVCSPWH.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_spwh().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sscspdw() != null)
			mVCSSCSPDW.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sscspdw().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getDt_sscsp_time() != null)
			mDTSSCSPTIME.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getDt_sscsp_time().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sscspwh() != null)
			mVCSSCSPWH.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sscspwh().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jgysdw() != null)
			mVCJGYSDW.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jgysdw().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getDt_jgys_time() != null)
			mDTJGYSTIME.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getDt_jgys_time().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jgyswh() != null)
			mVCJGYSWH.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jgyswh().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_yfqdxkz() != null)
			mVCYFQDXKZ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_yfqdxkz().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_agdpfwrw() != null)
			mVCAGDPFWRW.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_agdpfwrw().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jxpwsbdj() != null)
			mVCJXPWSBDJ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jxpwsbdj().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jnpwf() != null)
			mVCJNPWF.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jnpwf().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_synjnpwf() != null)
			mVCSYNJNPWF.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_synjnpwf().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_yjnpwf() != null)
			mVCYJNPWF.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_yjnpwf().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_wzejnyy() != null)
			mVCWZEJNYY.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_wzejnyy().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fscshj() != null)
			mVCFSCSHJ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fscshj().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fstzwrw() != null)
			mVCFSTZWRW.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fstzwrw().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_qtwrw() != null)
			mVCQTWRW.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_qtwrw().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sjcsl() != null)
			mVCSJCSL.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sjcsl().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_scfdclss() != null)
			mVCSCFDCLSS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_scfdclss().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_cll() != null)
			mVCCLL.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_cll().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fhfsclyq() != null)
			mVCFHFSCLYQ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fhfsclyq().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_bfhqkms() != null)
			mVCBFHQKMS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_bfhqkms().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sxfsfl() != null)
			mVCSXFSFL.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sxfsfl().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_cztpfsxw() != null)
			mVCCZTPFSXW.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_cztpfsxw().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_qksm() != null)
			mVCQKSM.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_qksm().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fssfcb() != null)
			mVCFSSFCB.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fssfcb().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_cbyzjjcz() != null)
			mVCCBYZJJCZ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_cbyzjjcz().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jcdw() != null)
			mVCJCDW.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jcdw().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getDt_jc_time() != null)
			mDTJCTIME.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getDt_jc_time().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_azzxjczz() != null)
			mVCAZZXJCZZ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_azzxjczz().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getDt_az_time() != null)
			mDTAZTIME.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getDt_az_time().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_yhbbmlw() != null)
			mVCYHBBMLW.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_yhbbmlw().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sfyxzc() != null)
			mVCSFYXZC.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sfyxzc().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sfjgjy() != null)
			mVCSFJGJY.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sfjgjy().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getDt_jy_time() != null)
			mDTJYTIME.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getDt_jy_time().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_zxjcsj() != null)
			mVCZXJCSJ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_zxjcsj().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_zywxfw() != null)
			mVCZYWXFW.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_zywxfw().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fgscsl() != null)
			mVCFGSCSL.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fgscsl().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fgsczcs() != null)
			mVCFGSCZCS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fgsczcs().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fszcsl() != null)
			mVCFSZCSL.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fszcsl().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fszczcs() != null)
			mVCFSZCZCS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fszczcs().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_hssncsl() != null)
			mVCHSSNCSL.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_hssncsl().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_ssnczcs() != null)
			mVCSSNCZCS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_ssnczcs().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fcmcsl() != null)
			mVCFCMCSL.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fcmcsl().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fcmczcs() != null)
			mVCFCMCZCS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fcmczcs().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_qtgtfw() != null)
			mVCQTGTFW.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_qtgtfw().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_csl() != null)
			mVCCSL.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_csl().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_qtgtfwczcs() != null)
			mVCQTGTFWCZCS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_qtgtfwczcs().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_wftzsfgf() != null)
			mVCWFTZSFGF.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_wftzsfgf().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_xhbbmsb() != null)
			mVCXHBBMSB.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_xhbbmsb().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_wsbdynx() != null)
			mVCWSBDYNX.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_wsbdynx().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_wfcfcsybs() != null)
			mVCWFCFCSYBS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_wfcfcsybs().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fhwfccgf() != null)
			mVCFHWFCCGF.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fhwfccgf().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_dcsjcgyn() != null)
			mVCDCSJCGYN.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_dcsjcgyn().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_yyjxdczc() != null)
			mVCYYJXDCZC.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_yyjxdczc().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_zxzyldzd() != null)
			mVCZXZYLDZD.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_zxzyldzd().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_ysclyzz() != null)
			mVCYSCLYZZ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_ysclyzz().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_ysl() != null)
			mVCYSL.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_ysl().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_pc() != null)
			mVCPC.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_pc().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jsdwyzz() != null)
			mVCJSDWYZZ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jsdwyzz().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sjczfs() != null)
			mVCSJCZFS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sjczfs().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_qtybgf() != null)
			mVCQTYBGF.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_qtybgf().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jxgfcc() != null)
			mVCJXGFCC.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jxgfcc().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_lycsfhyq() != null)
			mVCLYCSFHYQ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_lycsfhyq().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_czfs() != null)
			mVCCZFS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_czfs().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fqcshj() != null)
			mVCFQCSHJ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fqcshj().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_ptfqzlss() != null)
			mVCPTFQZLSS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_ptfqzlss().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_wptssmc() != null)
			mVCWPTSSMC.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_wptssmc().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jqjcsfcb() != null)
			mVCJQJCSFCB.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jqjcsfcb().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fqcbyzjjcz() != null)
			mVCFQCBYZJJCZ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fqcbyzjjcz().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fqjcdw() != null)
			mVCFQJCDW.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fqjcdw().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getDt_fqjc_time() != null)
			mDTFQJCTIME.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getDt_fqjc_time().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fqazzxjczz() != null)
			mVCFQAZZXJCZZ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fqazzxjczz().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getDt_fqaz_time() != null)
			mDTFQAZTIME.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getDt_fqaz_time().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sflw() != null)
			mVCSFLW.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sflw().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fqsfyxzc() != null)
			mVCFQSFYXZC.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fqsfyxzc().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fqsfjgjy() != null)
			mVCFQSFJGJY.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fqsfjgjy().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getDt_fqjysj() != null)
			mDTFQJYSJ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getDt_fqjysj().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fqzxjcsjxs() != null)
			mVCFQZXJCSJXS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_fqzxjcsjxs().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sfcqjzcs() != null)
			mVCSFCQJZCS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sfcqjzcs().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_wptjsss() != null)
			mVCWPTJSSS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_wptjsss().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_wsfhjl() != null)
			mVCWSFHJL.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_wsfhjl().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sfybhmb() != null)
			mVCSFYBHMB.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sfybhmb().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getDt_bhmbjssj() != null)
			mDTBHMBJSSJ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getDt_bhmbjssj().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_zbhjbhqk() != null)
			mVCZBHJBHQK.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_zbhjbhqk().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_lsfxffcs() != null)
			mVCLSFXFFCS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_lsfxffcs().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_wlsqkms() != null)
			mVCWLSQKMS.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_wlsqkms().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_bztfyjya() != null)
			mVCBZTFYJYA.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_bztfyjya().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_dyapgbba() != null)
			mVCDYAPGBBA.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_dyapgbba().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jxndyjyl() != null)
			mVCJXNDYJYL.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_jxndyjyl().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sfcbyjwz() != null)
			mVCSFCBYJWZ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getVc_sfcbyjwz().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getCl_qthbbmjcqk() != null)
			mCLQTHBBMJCQK.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getCl_qthbbmjcqk().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getCl_czzywt() != null)
			mCLCZZYWT.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getCl_czzywt().toString());

		if (mInorganicPhosphorusChemicalBean.getData().get(0).getCl_jcyq() != null)
			mCLJCYQ.setText(mInorganicPhosphorusChemicalBean.getData().get(0).getCl_jcyq().toString());
	}
}
