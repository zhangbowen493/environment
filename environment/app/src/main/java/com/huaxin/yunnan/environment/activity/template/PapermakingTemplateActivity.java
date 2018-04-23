package com.huaxin.yunnan.environment.activity.template;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.Constant;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.bean.PapermakingTemplateBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_PC_INFO;

/**
 * 10、造纸行业现场监察记录
 */
public class PapermakingTemplateActivity extends BaseActicity implements View.OnClickListener, CallBack {

	private TextView titleText;
	private TextView mDTBEGINTIME;
	private TextView mDTENDTIME;
	private TextView mVCPLACE;
	private TextView mVCXAMINER;
	private TextView mVCLAWNUMBER;
	private TextView mVCRECORDER;
	private TextView mVCSINSPECTEDUNIT;
	private TextView mVCCODENUMBER;
	private TextView mVCLEGALREPRESENTATIVE;
	private TextView mVCLEGALID;
	private TextView mVCSITESUPERVISOR;
	private TextView mVCSITEID;
	private TextView mDTAGE;
	private TextView mVCWORKUNIT;
	private TextView mVCPOST;
	private TextView mVCRELATIONSHIP;
	private TextView mVCADDRESS;
	private TextView mVCTELEPHONE;
	private TextView mVCPOSTALCODE;
	private TextView mVCOTHERPEOPLE;
	private TextView mVCUNITNAME;
	private TextView mVCHBDWLX;
	private TextView mCHSUPERVISIONTYPE;
	private TextView mCHSFQRZJ;
	private TextView mCHSFSQHB;
	private TextView mVCSZS;
	private TextView mVCSZX;
	private TextView mVCSZZ;
	private TextView mVCSZXAC;
	private TextView mVCGYYQ;
	private TextView mVCSHEJICL;
	private TextView mVCSJCL;
	private TextView mVCHPBG;
	private TextView mCHSYCF;
	private TextView mVCQTWZL;
	private TextView mVCSBMC;
	private TextView mVCSBXH;
	private TextView mDTXMCSSJ;
	private TextView mDTPZLXSJ;
	private TextView mVCPZLXDW;
	private TextView mVCLXPFWH;
	private TextView mCHHPSFBL;
	private TextView mCHBZHPYXPJBG;
	private TextView mVCHPBZDW;
	private TextView mDTBZSJ;
	private TextView mCHSFSYTTFW;
	private TextView mDTWPSPSJ;
	private TextView mVCHBSSCSPDW;
	private TextView mDTHBSSCSPSJ;
	private TextView mVCHBSSCSPWH;
	private TextView mDTHBJGYSSJ;
	private TextView mVCZZYSBM;
	private TextView mCHSFJXJG;
	private TextView mVCJGCS;
	private TextView mDTNEWJGSJ;
	private TextView mVCPZLXBM;
	private TextView mVCGKJLXPFWH;
	private TextView mCHGKJHPSFBL;
	private TextView mVCWPSPDW;
	private TextView mDTSPSJ;
	private TextView mVCSPDW;
	private TextView mDTSSCSPSJ;
	private TextView mVCSPWH;
	private TextView mDTHBZGYSSJ;
	private TextView mVCHBZGZZYSBM;
	private TextView mCHSFSYZCTTFW;
	private TextView mCHSFSYCYZCTTFW;
	private TextView mVCSCFSCSHJ;
	private TextView mVCTZWRW;
	private TextView mVCCSLY;
	private TextView mVCCLSSW;
	private TextView mVCCLLW;
	private TextView mCHSJSFYBG;
	private TextView mVCPFQX;
	private TextView mCHSFSJYIYSY;
	private TextView mCHSGNW;
	private TextView mCHSFWFPS;
	private TextView mVCQTQKSM;
	private TextView mVCZXBZ;
	private TextView mCHJQJCSFDB;
	private TextView mVCWRYZW;
	private TextView mVCCBBS;
	private TextView mVCDBL;
	private TextView mVCJCDW;
	private TextView mDTJCSJ;
	private TextView mCHZXJCSFAZ;
	private TextView mCHYXSFZC;
	private TextView mCHJCZSFDB;
	private TextView mVCRCBWRYZW;
	private TextView mVCWRYZCBBS;
	private TextView mVCSSCLSS;
	private TextView mVCSSCLSSCLI;
	private TextView mVCSJCLSS;
	private TextView mVCSJCLSSCLI;
	private TextView mVCYBGFHPZW;
	private TextView mVCYBGFHPZWNZLY;
	private TextView mVCYBGFHPZWCLSSW;
	private TextView mVCMQSJMCW;
	private TextView mVCMQSJMCWNZLY;
	private TextView mVCMQSJMCWCLSSW;
	private TextView mVCHPZSJWXHXPMCW;
	private TextView mVCSYGD;
	private TextView mVCSYL;
	private TextView mCHSFCZFZHSGD;
	private TextView mVCHPZSYQDTMZCZCS;
	private TextView mCHSFJXSBDJ;
	private TextView mVCMQSJCZCSW;
	private TextView mCHSFYJFZJGY;
	private TextView mVCFYHYCZCS;
	private TextView mVCSJZDCZCS;
	private TextView mVCSJCZCS;
	private TextView mCHWFSFCZYZ;
	private TextView mCHYZSFBLHBSX;
	private TextView mCHYSDWSFJBZZ;
	private TextView mVCYSL;
	private TextView mCHCZDWSFJBZZ;
	private TextView mCHGLTZSFQQ;
	private TextView mVCCZL;
	private TextView mCHCDSFSYBS;
	private TextView mVCFQSCHJ;
	private TextView mVCHPBGYQCZCS;
	private TextView mVCHPBGYQCZCSCZLW;
	private TextView mVCSJSYCLSS;
	private TextView mVCSJSYCLSSCLLW;
	private TextView mVCSJSYCLSSCLLWQTSM;
	private TextView mCHSJSYCLSSJQJCSFDB;
	private TextView mVCSJSYCLSSJCDW;
	private TextView mDTJCSJJCSJ;
	private TextView mCHFQZXJCSFAZ;
	private TextView mCHFQYXSFZC;
	private TextView mCHFQJCZSFDB;
	private TextView mVCZSCSHJ;
	private TextView mCHZSSFDB;
	private TextView mVCZSQTSM;
	private TextView mCHZSQJCSFDB;
	private TextView mVCZSJCDW;
	private TextView mDTZSJCSJ;
	private TextView mCHSFAZJCSB;
	private TextView mCHTTAZSFGF;
	private TextView mCHYWTZSFGF;
	private TextView mCHZKXTQXSJSFKCC12GY;
	private TextView mCHZKSJZXSJSFYZ;
	private TextView mCHSFYHBBMLW;
	private TextView mVCHJYQWSFHJL;
	private TextView mCHJLNSFYBHMB;
	private TextView mDTBHMBJSSJ;
	private TextView mVCZBHJBHQK;
	private TextView mCHSFLSCS;
	private TextView mCHWLSQKMS;
	private TextView mCHSFBZTFYA;
	private TextView mCHSFDYAPG;
	private TextView mCHSFJXNDYL;
	private TextView mCHSFCBWZ;
	private TextView mCLQTHBBMJCQK;
	private TextView mCLCZZYWT;
	private TextView mCLJCYQ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_papermaking_template);
		initProgressDialog();
		Intent intent = getIntent();
		String t_task_list_id = intent.getStringExtra("t_task_list_id");
		initView();
		NetTool.templatePost(getApplicationContext(), t_task_list_id, URL_QUERY_PC_INFO, PapermakingTemplateBean.class, this, yNProgressDialog);
	}

	private void initView() {
		titleText = (TextView) findViewById(R.id.title_text);
		titleText.setText("造纸行业现场监察记录");
		findViewById(R.id.title_text).setOnClickListener(this);
		mDTBEGINTIME = (TextView) findViewById(R.id.DT_BEGIN_TIME);
		mDTENDTIME = (TextView) findViewById(R.id.DT_END_TIME);
		mVCPLACE = (TextView) findViewById(R.id.VC_PLACE);
		mVCXAMINER = (TextView) findViewById(R.id.VC_XAMINER);
		mVCLAWNUMBER = (TextView) findViewById(R.id.VC_LAW_NUMBER);
		mVCRECORDER = (TextView) findViewById(R.id.VC_RECORDER);
		mVCSINSPECTEDUNIT = (TextView) findViewById(R.id.VC_SINSPECTED_UNIT);
		mVCCODENUMBER = (TextView) findViewById(R.id.VC_CODE_NUMBER);
		mVCLEGALREPRESENTATIVE = (TextView) findViewById(R.id.VC_LEGAL_REPRESENTATIVE);
		mVCLEGALID = (TextView) findViewById(R.id.VC_LEGAL_ID);
		mVCSITESUPERVISOR = (TextView) findViewById(R.id.VC_SITE_SUPERVISOR);
		mVCSITEID = (TextView) findViewById(R.id.VC_SITE_ID);
		mDTAGE = (TextView) findViewById(R.id.DT_AGE);
		mVCWORKUNIT = (TextView) findViewById(R.id.VC_WORK_UNIT);
		mVCPOST = (TextView) findViewById(R.id.VC_POST);
		mVCRELATIONSHIP = (TextView) findViewById(R.id.VC_RELATIONSHIP);
		mVCADDRESS = (TextView) findViewById(R.id.VC_ADDRESS);
		mVCTELEPHONE = (TextView) findViewById(R.id.VC_TELEPHONE);
		mVCPOSTALCODE = (TextView) findViewById(R.id.VCPOSTAL_CODE);
		mVCOTHERPEOPLE = (TextView) findViewById(R.id.VC_OTHER_PEOPLE);
		mVCUNITNAME = (TextView) findViewById(R.id.VC_UNIT_NAME);
		mVCHBDWLX = (TextView) findViewById(R.id.VC_HBDWLX);
		mCHSUPERVISIONTYPE = (TextView) findViewById(R.id.CH_SUPERVISION_TYPE);
		mCHSFQRZJ = (TextView) findViewById(R.id.CH_SFQRZJ);
		mCHSFSQHB = (TextView) findViewById(R.id.CH_SFSQHB);
		mVCSZS = (TextView) findViewById(R.id.VC_SZS);
		mVCSZX = (TextView) findViewById(R.id.VC_SZX);
		mVCSZZ = (TextView) findViewById(R.id.VC_SZZ);
		mVCSZXAC = (TextView) findViewById(R.id.VC_SZXAC);
		mVCGYYQ = (TextView) findViewById(R.id.VC_GYYQ);
		mVCSHEJICL = (TextView) findViewById(R.id.VC_SHEJICL);
		mVCSJCL = (TextView) findViewById(R.id.VC_SJCL);
		mVCHPBG = (TextView) findViewById(R.id.VC_HPBG);
		mCHSYCF = (TextView) findViewById(R.id.CH_SYCF);
		mVCQTWZL = (TextView) findViewById(R.id.VC_QTWZL);
		mVCSBMC = (TextView) findViewById(R.id.VC_SBMC);
		mVCSBXH = (TextView) findViewById(R.id.VC_SBXH);
		mDTXMCSSJ = (TextView) findViewById(R.id.DT_XMCSSJ);
		mDTPZLXSJ = (TextView) findViewById(R.id.DT_PZLXSJ);
		mVCPZLXDW = (TextView) findViewById(R.id.VC_PZLXDW);
		mVCLXPFWH = (TextView) findViewById(R.id.VC_LXPFWH);
		mCHHPSFBL = (TextView) findViewById(R.id.CH_HPSFBL);
		mCHBZHPYXPJBG = (TextView) findViewById(R.id.CH_BZHPYXPJBG);
		mVCHPBZDW = (TextView) findViewById(R.id.VC_HPBZDW);
		mDTBZSJ = (TextView) findViewById(R.id.DT_BZSJ);
		mCHSFSYTTFW = (TextView) findViewById(R.id.CH_SFSYTTFW);
		mDTWPSPSJ = (TextView) findViewById(R.id.DT_WPSPSJ);
		mVCHBSSCSPDW = (TextView) findViewById(R.id.VC_HBSSCSPDW);
		mDTHBSSCSPSJ = (TextView) findViewById(R.id.DT_HBSSCSPSJ);
		mVCHBSSCSPWH = (TextView) findViewById(R.id.VC_HBSSCSPWH);
		mDTHBJGYSSJ = (TextView) findViewById(R.id.DT_HBJGYSSJ);
		mVCZZYSBM = (TextView) findViewById(R.id.VC_ZZYSBM);
		mCHSFJXJG = (TextView) findViewById(R.id.CH_SFJXJG);
		mVCJGCS = (TextView) findViewById(R.id.VC_JGCS);
		mDTNEWJGSJ = (TextView) findViewById(R.id.DT_NEWJGSJ);
		mVCPZLXBM = (TextView) findViewById(R.id.VC_PZLXBM);
		mVCGKJLXPFWH = (TextView) findViewById(R.id.VC_GKJ_LXPFWH);
		mCHGKJHPSFBL = (TextView) findViewById(R.id.CH_GKJ_HPSFBL);
		mVCWPSPDW = (TextView) findViewById(R.id.VC_WPSPDW);
		mDTSPSJ = (TextView) findViewById(R.id.DT_SPSJ);
		mVCSPDW = (TextView) findViewById(R.id.VC_SPDW);
		mDTSSCSPSJ = (TextView) findViewById(R.id.DT_SSCSPSJ);
		mVCSPWH = (TextView) findViewById(R.id.VC_SPWH);
		mDTHBZGYSSJ = (TextView) findViewById(R.id.DT_HBZGYSSJ);
		mVCHBZGZZYSBM = (TextView) findViewById(R.id.VC_HBZG_ZZYSBM);
		mCHSFSYZCTTFW = (TextView) findViewById(R.id.CH_SFSYZCTTFW);
		mCHSFSYCYZCTTFW = (TextView) findViewById(R.id.CH_SFSYCYZCTTFW);
		mVCSCFSCSHJ = (TextView) findViewById(R.id.VC_SCFSCSHJ);
		mVCTZWRW = (TextView) findViewById(R.id.VC_TZWRW);
		mVCCSLY = (TextView) findViewById(R.id.VC_CSLY);
		mVCCLSSW = (TextView) findViewById(R.id.VC_CLSSW);
		mVCCLLW = (TextView) findViewById(R.id.VC_CLLW);
		mCHSJSFYBG = (TextView) findViewById(R.id.CH_SJSFYBG);
		mVCPFQX = (TextView) findViewById(R.id.VC_PFQX);
		mCHSFSJYIYSY = (TextView) findViewById(R.id.CH_SFSJYIYSY);
		mCHSGNW = (TextView) findViewById(R.id.CH_SGNW);
		mCHSFWFPS = (TextView) findViewById(R.id.CH_SFWFPS);
		mVCQTQKSM = (TextView) findViewById(R.id.VC_QTQKSM);
		mVCZXBZ = (TextView) findViewById(R.id.VC_ZXBZ);
		mCHJQJCSFDB = (TextView) findViewById(R.id.CH_JQJCSFDB);
		mVCWRYZW = (TextView) findViewById(R.id.VC_WRYZW);
		mVCCBBS = (TextView) findViewById(R.id.VC_CBBS);
		mVCDBL = (TextView) findViewById(R.id.VC_DBL);
		mVCJCDW = (TextView) findViewById(R.id.VC_JCDW);
		mDTJCSJ = (TextView) findViewById(R.id.DT_JCSJ);
		mCHZXJCSFAZ = (TextView) findViewById(R.id.CH_ZXJCSFAZ);
		mCHYXSFZC = (TextView) findViewById(R.id.CH_YXSFZC);
		mCHJCZSFDB = (TextView) findViewById(R.id.CH_JCZSFDB);
		mVCRCBWRYZW = (TextView) findViewById(R.id.VC_RCBWRYZW);
		mVCWRYZCBBS = (TextView) findViewById(R.id.VC_WRYZCBBS);
		mVCSSCLSS = (TextView) findViewById(R.id.VC_SSCLSS);
		mVCSSCLSSCLI = (TextView) findViewById(R.id.VC_SSCLSS_CLI);
		mVCSJCLSS = (TextView) findViewById(R.id.VC_SJCLSS);
		mVCSJCLSSCLI = (TextView) findViewById(R.id.VC_SJCLSS_CLI);
		mVCYBGFHPZW = (TextView) findViewById(R.id.VC_YBGFHPZW);
		mVCYBGFHPZWNZLY = (TextView) findViewById(R.id.VC_YBGFHPZW_NZLY);
		mVCYBGFHPZWCLSSW = (TextView) findViewById(R.id.VC_YBGFHPZW_CLSSW);
		mVCMQSJMCW = (TextView) findViewById(R.id.VC_MQSJMCW);
		mVCMQSJMCWNZLY = (TextView) findViewById(R.id.VC_MQSJMCW_NZLY);
		mVCMQSJMCWCLSSW = (TextView) findViewById(R.id.VC_MQSJMCW_CLSSW);
		mVCHPZSJWXHXPMCW = (TextView) findViewById(R.id.VC_HPZSJWXHXPMCW);
		mVCSYGD = (TextView) findViewById(R.id.VC_SYGD);
		mVCSYL = (TextView) findViewById(R.id.VC_SYL);
		mCHSFCZFZHSGD = (TextView) findViewById(R.id.CH_SFCZFZHSGD);
		mVCHPZSYQDTMZCZCS = (TextView) findViewById(R.id.VC_HPZSYQDTMZCZCS);
		mCHSFJXSBDJ = (TextView) findViewById(R.id.CH_SFJXSBDJ);
		mVCMQSJCZCSW = (TextView) findViewById(R.id.VC_MQSJCZCSW);
		mCHSFYJFZJGY = (TextView) findViewById(R.id.CH_SFYJFZJGY);
		mVCFYHYCZCS = (TextView) findViewById(R.id.VC_FYHYCZCS);
		mVCSJZDCZCS = (TextView) findViewById(R.id.VC_SJZDCZCS);
		mVCSJCZCS = (TextView) findViewById(R.id.VC_SJCZCS);
		mCHWFSFCZYZ = (TextView) findViewById(R.id.CH_WFSFCZYZ);
		mCHYZSFBLHBSX = (TextView) findViewById(R.id.CH_YZSFBLHBSX);
		mCHYSDWSFJBZZ = (TextView) findViewById(R.id.CH_YSDWSFJBZZ);
		mVCYSL = (TextView) findViewById(R.id.VC_YSL);
		mCHCZDWSFJBZZ = (TextView) findViewById(R.id.CH_CZDWSFJBZZ);
		mCHGLTZSFQQ = (TextView) findViewById(R.id.CH_GLTZSFQQ);
		mVCCZL = (TextView) findViewById(R.id.VC_CZL);
		mCHCDSFSYBS = (TextView) findViewById(R.id.CH_CDSFSYBS);
		mVCFQSCHJ = (TextView) findViewById(R.id.VC_FQSCHJ);
		mVCHPBGYQCZCS = (TextView) findViewById(R.id.VC_HPBGYQCZCS);
		mVCHPBGYQCZCSCZLW = (TextView) findViewById(R.id.VC_HPBGYQCZCS_CZLW);
		mVCSJSYCLSS = (TextView) findViewById(R.id.VC_SJSYCLSS);
		mVCSJSYCLSSCLLW = (TextView) findViewById(R.id.VC_SJSYCLSS_CLLW);
		mVCSJSYCLSSCLLWQTSM = (TextView) findViewById(R.id.VC_SJSYCLSS_CLLW_QTSM);
		mCHSJSYCLSSJQJCSFDB = (TextView) findViewById(R.id.CH_SJSYCLSS_JQJCSFDB);
		mVCSJSYCLSSJCDW = (TextView) findViewById(R.id.VC_SJSYCLSS_JCDW);
		mDTJCSJJCSJ = (TextView) findViewById(R.id.DT_JCSJ_JCSJ);
		mCHFQZXJCSFAZ = (TextView) findViewById(R.id.CH_FQ_ZXJCSFAZ);
		mCHFQYXSFZC = (TextView) findViewById(R.id.CH_FQ_YXSFZC);
		mCHFQJCZSFDB = (TextView) findViewById(R.id.CH_FQ_JCZSFDB);
		mVCZSCSHJ = (TextView) findViewById(R.id.VC_ZSCSHJ);
		mCHZSSFDB = (TextView) findViewById(R.id.CH_ZS_SFDB);
		mVCZSQTSM = (TextView) findViewById(R.id.VC_ZSQTSM);
		mCHZSQJCSFDB = (TextView) findViewById(R.id.CH_ZS_QJCSFDB);
		mVCZSJCDW = (TextView) findViewById(R.id.VC_ZS_JCDW);
		mDTZSJCSJ = (TextView) findViewById(R.id.DT_ZS_JCSJ);
		mCHSFAZJCSB = (TextView) findViewById(R.id.CH_SFAZJCSB);
		mCHTTAZSFGF = (TextView) findViewById(R.id.CH_TTAZSFGF);
		mCHYWTZSFGF = (TextView) findViewById(R.id.CH_YWTZSFGF);
		mCHZKXTQXSJSFKCC12GY = (TextView) findViewById(R.id.CH_ZKXTQXSJSFKCC12GY);
		mCHZKSJZXSJSFYZ = (TextView) findViewById(R.id.CH_ZKSJZXSJSFYZ);
		mCHSFYHBBMLW = (TextView) findViewById(R.id.CH_SFYHBBMLW);
		mVCHJYQWSFHJL = (TextView) findViewById(R.id.VC_HJYQWSFHJL);
		mCHJLNSFYBHMB = (TextView) findViewById(R.id.CH_JLNSFYBHMB);
		mDTBHMBJSSJ = (TextView) findViewById(R.id.DT_BHMBJSSJ);
		mVCZBHJBHQK = (TextView) findViewById(R.id.VC_ZBHJBHQK);
		mCHSFLSCS = (TextView) findViewById(R.id.CH_SFLSCS);
		mCHWLSQKMS = (TextView) findViewById(R.id.CH_WLSQKMS);
		mCHSFBZTFYA = (TextView) findViewById(R.id.CH_SFBZTFYA);
		mCHSFDYAPG = (TextView) findViewById(R.id.CH_SFDYAPG);
		mCHSFJXNDYL = (TextView) findViewById(R.id.CH_SFJXNDYL);
		mCHSFCBWZ = (TextView) findViewById(R.id.CH_SFCBWZ);
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
		PapermakingTemplateBean mPapermakingTemplateBean = (PapermakingTemplateBean) o;
		if (Constant.RESPONSE_SUCCESS.equals(mPapermakingTemplateBean.getSuccess())) {
			initData(mPapermakingTemplateBean);
		} else {
			LogUtils.e("请求失败，错误码：" + mPapermakingTemplateBean.getSuccess() + "错误信息：" + mPapermakingTemplateBean.getMsg());
		}
	}

	private void initData(PapermakingTemplateBean mPapermakingTemplateBean) {

		if (mPapermakingTemplateBean.getData().get(0).getDt_begin_time() != null)
			mDTBEGINTIME.setText(mPapermakingTemplateBean.getData().get(0).getDt_begin_time().toString());

		if (mPapermakingTemplateBean.getData().get(0).getDt_end_time() != null)
			mDTENDTIME.setText(mPapermakingTemplateBean.getData().get(0).getDt_end_time().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_place() != null)
			mVCPLACE.setText(mPapermakingTemplateBean.getData().get(0).getVc_place().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_xaminer() != null)
			mVCXAMINER.setText(mPapermakingTemplateBean.getData().get(0).getVc_xaminer().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_law_number() != null)
			mVCLAWNUMBER.setText(mPapermakingTemplateBean.getData().get(0).getVc_law_number().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_recorder() != null)
			mVCRECORDER.setText(mPapermakingTemplateBean.getData().get(0).getVc_recorder().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_sinspected_unit() != null)
			mVCSINSPECTEDUNIT.setText(mPapermakingTemplateBean.getData().get(0).getVc_sinspected_unit().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_code_number() != null)
			mVCCODENUMBER.setText(mPapermakingTemplateBean.getData().get(0).getVc_code_number().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_legal_representative() != null)
			mVCLEGALREPRESENTATIVE.setText(mPapermakingTemplateBean.getData().get(0).getVc_legal_representative().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_legal_id() != null)
			mVCLEGALID.setText(mPapermakingTemplateBean.getData().get(0).getVc_legal_id().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_site_supervisor() != null)
			mVCSITESUPERVISOR.setText(mPapermakingTemplateBean.getData().get(0).getVc_site_supervisor().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_site_id() != null)
			mVCSITEID.setText(mPapermakingTemplateBean.getData().get(0).getVc_site_id().toString());

		if (mPapermakingTemplateBean.getData().get(0).getNb_age() != null)
			mDTAGE.setText(mPapermakingTemplateBean.getData().get(0).getNb_age().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_work_unit() != null)
			mVCWORKUNIT.setText(mPapermakingTemplateBean.getData().get(0).getVc_work_unit().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_post() != null)
			mVCPOST.setText(mPapermakingTemplateBean.getData().get(0).getVc_post().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_relationship() != null)
			mVCRELATIONSHIP.setText(mPapermakingTemplateBean.getData().get(0).getVc_relationship().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_address() != null)
			mVCADDRESS.setText(mPapermakingTemplateBean.getData().get(0).getVc_address().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_telephone() != null)
			mVCTELEPHONE.setText(mPapermakingTemplateBean.getData().get(0).getVc_telephone().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_postal_code() != null)
			mVCPOSTALCODE.setText(mPapermakingTemplateBean.getData().get(0).getVc_postal_code().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_other_people() != null)
			mVCOTHERPEOPLE.setText(mPapermakingTemplateBean.getData().get(0).getVc_other_people().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_unit_name() != null)
			mVCUNITNAME.setText(mPapermakingTemplateBean.getData().get(0).getVc_unit_name().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_hbdwlx() != null)
			mVCHBDWLX.setText(mPapermakingTemplateBean.getData().get(0).getCh_hbdwlx().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_supervision_type() != null)
			mCHSUPERVISIONTYPE.setText(mPapermakingTemplateBean.getData().get(0).getCh_supervision_type().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sfqrzj() != null)
			mCHSFQRZJ.setText(mPapermakingTemplateBean.getData().get(0).getCh_sfqrzj().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sfsqhb() != null)
			mCHSFSQHB.setText(mPapermakingTemplateBean.getData().get(0).getCh_sfsqhb().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_szs() != null)
			mVCSZS.setText(mPapermakingTemplateBean.getData().get(0).getVc_szs().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_szx() != null)
			mVCSZX.setText(mPapermakingTemplateBean.getData().get(0).getVc_szx().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_szz() != null)
			mVCSZZ.setText(mPapermakingTemplateBean.getData().get(0).getVc_szz().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_szxac() != null)
			mVCSZXAC.setText(mPapermakingTemplateBean.getData().get(0).getVc_szxac().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_gyyq() != null)
			mVCGYYQ.setText(mPapermakingTemplateBean.getData().get(0).getVc_gyyq().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_shejicl() != null)
			mVCSHEJICL.setText(mPapermakingTemplateBean.getData().get(0).getVc_shejicl().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_sjcl() != null)
			mVCSJCL.setText(mPapermakingTemplateBean.getData().get(0).getVc_sjcl().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_hpbg() != null)
			mVCHPBG.setText(mPapermakingTemplateBean.getData().get(0).getVc_hpbg().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_sycf() != null)
			mCHSYCF.setText(mPapermakingTemplateBean.getData().get(0).getVc_sycf().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_qtwzl() != null)
			mVCQTWZL.setText(mPapermakingTemplateBean.getData().get(0).getVc_qtwzl().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_sbmc() != null)
			mVCSBMC.setText(mPapermakingTemplateBean.getData().get(0).getVc_sbmc().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_sbxh() != null)
			mVCSBXH.setText(mPapermakingTemplateBean.getData().get(0).getVc_sbxh().toString());

		if (mPapermakingTemplateBean.getData().get(0).getDt_xmcssj() != null)
			mDTXMCSSJ.setText(mPapermakingTemplateBean.getData().get(0).getDt_xmcssj().toString());

		if (mPapermakingTemplateBean.getData().get(0).getDt_pzlxsj() != null)
			mDTPZLXSJ.setText(mPapermakingTemplateBean.getData().get(0).getDt_pzlxsj().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_pzlxdw() != null)
			mVCPZLXDW.setText(mPapermakingTemplateBean.getData().get(0).getVc_pzlxdw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_lxpfwh() != null)
			mVCLXPFWH.setText(mPapermakingTemplateBean.getData().get(0).getVc_lxpfwh().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_hpsfbl() != null)
			mCHHPSFBL.setText(mPapermakingTemplateBean.getData().get(0).getCh_hpsfbl().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_bzhpyxpjbg() != null)
			mCHBZHPYXPJBG.setText(mPapermakingTemplateBean.getData().get(0).getCh_bzhpyxpjbg().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_hpbzdw() != null)
			mVCHPBZDW.setText(mPapermakingTemplateBean.getData().get(0).getVc_hpbzdw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getDt_bzsj() != null)
			mDTBZSJ.setText(mPapermakingTemplateBean.getData().get(0).getDt_bzsj().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sfsyttfw() != null)
			mCHSFSYTTFW.setText(mPapermakingTemplateBean.getData().get(0).getCh_sfsyttfw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getDt_wpspsj() != null)
			mDTWPSPSJ.setText(mPapermakingTemplateBean.getData().get(0).getDt_wpspsj().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_hbsscspdw() != null)
			mVCHBSSCSPDW.setText(mPapermakingTemplateBean.getData().get(0).getVc_hbsscspdw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getDt_hbsscspsj() != null)
			mDTHBSSCSPSJ.setText(mPapermakingTemplateBean.getData().get(0).getDt_hbsscspsj().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_hbsscspwh() != null)
			mVCHBSSCSPWH.setText(mPapermakingTemplateBean.getData().get(0).getVc_hbsscspwh().toString());

		if (mPapermakingTemplateBean.getData().get(0).getDt_hbjgyssj() != null)
			mDTHBJGYSSJ.setText(mPapermakingTemplateBean.getData().get(0).getDt_hbjgyssj().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_zzysbm() != null)
			mVCZZYSBM.setText(mPapermakingTemplateBean.getData().get(0).getVc_zzysbm().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sfjxjg() != null)
			mCHSFJXJG.setText(mPapermakingTemplateBean.getData().get(0).getCh_sfjxjg().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_jgcs() != null)
			mVCJGCS.setText(mPapermakingTemplateBean.getData().get(0).getVc_jgcs().toString());

		if (mPapermakingTemplateBean.getData().get(0).getDt_newjgsj() != null)
			mDTNEWJGSJ.setText(mPapermakingTemplateBean.getData().get(0).getDt_newjgsj().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_pzlxbm() != null)
			mVCPZLXBM.setText(mPapermakingTemplateBean.getData().get(0).getVc_pzlxbm().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_gkj_lxpfwh() != null)
			mVCGKJLXPFWH.setText(mPapermakingTemplateBean.getData().get(0).getVc_gkj_lxpfwh().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_gkj_hpsfbl() != null)
			mCHGKJHPSFBL.setText(mPapermakingTemplateBean.getData().get(0).getCh_gkj_hpsfbl().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_wpspdw() != null)
			mVCWPSPDW.setText(mPapermakingTemplateBean.getData().get(0).getVc_wpspdw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getDt_spsj() != null)
			mDTSPSJ.setText(mPapermakingTemplateBean.getData().get(0).getDt_spsj().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_spdw() != null)
			mVCSPDW.setText(mPapermakingTemplateBean.getData().get(0).getVc_spdw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getDt_sscspsj() != null)
			mDTSSCSPSJ.setText(mPapermakingTemplateBean.getData().get(0).getDt_sscspsj().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_spwh() != null)
			mVCSPWH.setText(mPapermakingTemplateBean.getData().get(0).getVc_spwh().toString());

		if (mPapermakingTemplateBean.getData().get(0).getDt_hbzgyssj() != null)
			mDTHBZGYSSJ.setText(mPapermakingTemplateBean.getData().get(0).getDt_hbzgyssj().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_hbzg_zzysbm() != null)
			mVCHBZGZZYSBM.setText(mPapermakingTemplateBean.getData().get(0).getVc_hbzg_zzysbm().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sfsyzcttfw() != null)
			mCHSFSYZCTTFW.setText(mPapermakingTemplateBean.getData().get(0).getCh_sfsyzcttfw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sfsycyzcttfw() != null)
			mCHSFSYCYZCTTFW.setText(mPapermakingTemplateBean.getData().get(0).getCh_sfsycyzcttfw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_scfscshj() != null)
			mVCSCFSCSHJ.setText(mPapermakingTemplateBean.getData().get(0).getVc_scfscshj().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_tzwrw() != null)
			mVCTZWRW.setText(mPapermakingTemplateBean.getData().get(0).getVc_tzwrw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_csly() != null)
			mVCCSLY.setText(mPapermakingTemplateBean.getData().get(0).getVc_csly().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_clssw() != null)
			mVCCLSSW.setText(mPapermakingTemplateBean.getData().get(0).getVc_clssw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_cllw() != null)
			mVCCLLW.setText(mPapermakingTemplateBean.getData().get(0).getVc_cllw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sjsfybg() != null)
			mCHSJSFYBG.setText(mPapermakingTemplateBean.getData().get(0).getCh_sjsfybg().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_pfqx() != null)
			mVCPFQX.setText(mPapermakingTemplateBean.getData().get(0).getVc_pfqx().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sfsjyiysy() != null)
			mCHSFSJYIYSY.setText(mPapermakingTemplateBean.getData().get(0).getCh_sfsjyiysy().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sgnw() != null)
			mCHSGNW.setText(mPapermakingTemplateBean.getData().get(0).getCh_sgnw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sfwfps() != null)
			mCHSFWFPS.setText(mPapermakingTemplateBean.getData().get(0).getCh_sfwfps().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_qtqksm() != null)
			mVCQTQKSM.setText(mPapermakingTemplateBean.getData().get(0).getVc_qtqksm().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_zxbz() != null)
			mVCZXBZ.setText(mPapermakingTemplateBean.getData().get(0).getVc_zxbz().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_jqjcsfdb() != null)
			mCHJQJCSFDB.setText(mPapermakingTemplateBean.getData().get(0).getCh_jqjcsfdb().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_wryzw() != null)
			mVCWRYZW.setText(mPapermakingTemplateBean.getData().get(0).getVc_wryzw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_cbbs() != null)
			mVCCBBS.setText(mPapermakingTemplateBean.getData().get(0).getVc_cbbs().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_dbl() != null)
			mVCDBL.setText(mPapermakingTemplateBean.getData().get(0).getVc_dbl().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_jcdw() != null)
			mVCJCDW.setText(mPapermakingTemplateBean.getData().get(0).getVc_jcdw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getDt_jcsj() != null)
			mDTJCSJ.setText(mPapermakingTemplateBean.getData().get(0).getDt_jcsj().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_zxjcsfaz() != null)
			mCHZXJCSFAZ.setText(mPapermakingTemplateBean.getData().get(0).getCh_zxjcsfaz().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_yxsfzc() != null)
			mCHYXSFZC.setText(mPapermakingTemplateBean.getData().get(0).getCh_yxsfzc().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_jczsfdb() != null)
			mCHJCZSFDB.setText(mPapermakingTemplateBean.getData().get(0).getCh_jczsfdb().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_rcbwryzw() != null)
			mVCRCBWRYZW.setText(mPapermakingTemplateBean.getData().get(0).getVc_rcbwryzw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_wryzcbbs() != null)
			mVCWRYZCBBS.setText(mPapermakingTemplateBean.getData().get(0).getVc_wryzcbbs().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_ssclss() != null)
			mVCSSCLSS.setText(mPapermakingTemplateBean.getData().get(0).getVc_ssclss().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_ssclss_cli() != null)
			mVCSSCLSSCLI.setText(mPapermakingTemplateBean.getData().get(0).getVc_ssclss_cli().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_sjclss() != null)
			mVCSJCLSS.setText(mPapermakingTemplateBean.getData().get(0).getVc_sjclss().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_sjclss_cli() != null)
			mVCSJCLSSCLI.setText(mPapermakingTemplateBean.getData().get(0).getVc_sjclss_cli().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_ybgfhpzw() != null)
			mVCYBGFHPZW.setText(mPapermakingTemplateBean.getData().get(0).getVc_ybgfhpzw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_ybgfhpzw_nzly() != null)
			mVCYBGFHPZWNZLY.setText(mPapermakingTemplateBean.getData().get(0).getVc_ybgfhpzw_nzly().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_ybgfhpzw_clssw() != null)
			mVCYBGFHPZWCLSSW.setText(mPapermakingTemplateBean.getData().get(0).getVc_ybgfhpzw_clssw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_mqsjmcw() != null)
			mVCMQSJMCW.setText(mPapermakingTemplateBean.getData().get(0).getVc_mqsjmcw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_mqsjmcw_nzly() != null)
			mVCMQSJMCWNZLY.setText(mPapermakingTemplateBean.getData().get(0).getVc_mqsjmcw_nzly().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_mqsjmcw_clssw() != null)
			mVCMQSJMCWCLSSW.setText(mPapermakingTemplateBean.getData().get(0).getVc_mqsjmcw_clssw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_hpzsjwxhxpmcw() != null)
			mVCHPZSJWXHXPMCW.setText(mPapermakingTemplateBean.getData().get(0).getVc_hpzsjwxhxpmcw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_sygd() != null)
			mVCSYGD.setText(mPapermakingTemplateBean.getData().get(0).getVc_sygd().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_syl() != null)
			mVCSYL.setText(mPapermakingTemplateBean.getData().get(0).getVc_syl().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sfczfzhsgd() != null)
			mCHSFCZFZHSGD.setText(mPapermakingTemplateBean.getData().get(0).getCh_sfczfzhsgd().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_hpzsyqdtmzczcs() != null)
			mVCHPZSYQDTMZCZCS.setText(mPapermakingTemplateBean.getData().get(0).getVc_hpzsyqdtmzczcs().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sfjxsbdj() != null)
			mCHSFJXSBDJ.setText(mPapermakingTemplateBean.getData().get(0).getCh_sfjxsbdj().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_mqsjczcsw() != null)
			mVCMQSJCZCSW.setText(mPapermakingTemplateBean.getData().get(0).getVc_mqsjczcsw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sfyjfzjgy() != null)
			mCHSFYJFZJGY.setText(mPapermakingTemplateBean.getData().get(0).getCh_sfyjfzjgy().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_fyhyczcs() != null)
			mVCFYHYCZCS.setText(mPapermakingTemplateBean.getData().get(0).getVc_fyhyczcs().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_sjzdczcs() != null)
			mVCSJZDCZCS.setText(mPapermakingTemplateBean.getData().get(0).getVc_sjzdczcs().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_sjczcs() != null)
			mVCSJCZCS.setText(mPapermakingTemplateBean.getData().get(0).getVc_sjczcs().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_wfsfczyz() != null)
			mCHWFSFCZYZ.setText(mPapermakingTemplateBean.getData().get(0).getCh_wfsfczyz().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_yzsfblhbsx() != null)
			mCHYZSFBLHBSX.setText(mPapermakingTemplateBean.getData().get(0).getCh_yzsfblhbsx().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_ysdwsfjbzz() != null)
			mCHYSDWSFJBZZ.setText(mPapermakingTemplateBean.getData().get(0).getCh_ysdwsfjbzz().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_ysl() != null)
			mVCYSL.setText(mPapermakingTemplateBean.getData().get(0).getVc_ysl().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_czdwsfjbzz() != null)
			mCHCZDWSFJBZZ.setText(mPapermakingTemplateBean.getData().get(0).getCh_czdwsfjbzz().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_gltzsfqq() != null)
			mCHGLTZSFQQ.setText(mPapermakingTemplateBean.getData().get(0).getCh_gltzsfqq().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_czl() != null)
			mVCCZL.setText(mPapermakingTemplateBean.getData().get(0).getVc_czl().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_cdsfsybs() != null)
			mCHCDSFSYBS.setText(mPapermakingTemplateBean.getData().get(0).getCh_cdsfsybs().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_fqschj() != null)
			mVCFQSCHJ.setText(mPapermakingTemplateBean.getData().get(0).getVc_fqschj().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_hpbgyqczcs() != null)
			mVCHPBGYQCZCS.setText(mPapermakingTemplateBean.getData().get(0).getVc_hpbgyqczcs().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_hpbgyqczcs_czlw() != null)
			mVCHPBGYQCZCSCZLW.setText(mPapermakingTemplateBean.getData().get(0).getVc_hpbgyqczcs_czlw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_sjsyclss() != null)
			mVCSJSYCLSS.setText(mPapermakingTemplateBean.getData().get(0).getVc_sjsyclss().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_sjsyclss_cllw() != null)
			mVCSJSYCLSSCLLW.setText(mPapermakingTemplateBean.getData().get(0).getVc_sjsyclss_cllw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_sjsyclss_cllw_qtsm() != null)
			mVCSJSYCLSSCLLWQTSM.setText(mPapermakingTemplateBean.getData().get(0).getVc_sjsyclss_cllw_qtsm().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sjsyclss_jqjcsfdb() != null)
			mCHSJSYCLSSJQJCSFDB.setText(mPapermakingTemplateBean.getData().get(0).getCh_sjsyclss_jqjcsfdb().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_sjsyclss_jcdw() != null)
			mVCSJSYCLSSJCDW.setText(mPapermakingTemplateBean.getData().get(0).getVc_sjsyclss_jcdw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getDt_jcsj_jcsj() != null)
			mDTJCSJJCSJ.setText(mPapermakingTemplateBean.getData().get(0).getDt_jcsj_jcsj().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_fq_zxjcsfaz() != null)
			mCHFQZXJCSFAZ.setText(mPapermakingTemplateBean.getData().get(0).getCh_fq_zxjcsfaz().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_fq_yxsfzc() != null)
			mCHFQYXSFZC.setText(mPapermakingTemplateBean.getData().get(0).getCh_fq_yxsfzc().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_fq_jczsfdb() != null)
			mCHFQJCZSFDB.setText(mPapermakingTemplateBean.getData().get(0).getCh_fq_jczsfdb().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_zscshj() != null)
			mVCZSCSHJ.setText(mPapermakingTemplateBean.getData().get(0).getVc_zscshj().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_zs_sfdb() != null)
			mCHZSSFDB.setText(mPapermakingTemplateBean.getData().get(0).getCh_zs_sfdb().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_zsqtsm() != null)
			mVCZSQTSM.setText(mPapermakingTemplateBean.getData().get(0).getVc_zsqtsm().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_zs_qjcsfdb() != null)
			mCHZSQJCSFDB.setText(mPapermakingTemplateBean.getData().get(0).getCh_zs_qjcsfdb().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_zs_jcdw() != null)
			mVCZSJCDW.setText(mPapermakingTemplateBean.getData().get(0).getVc_zs_jcdw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getDt_zs_jcsj() != null)
			mDTZSJCSJ.setText(mPapermakingTemplateBean.getData().get(0).getDt_zs_jcsj().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sfazjcsb() != null)
			mCHSFAZJCSB.setText(mPapermakingTemplateBean.getData().get(0).getCh_sfazjcsb().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_ttazsfgf() != null)
			mCHTTAZSFGF.setText(mPapermakingTemplateBean.getData().get(0).getCh_ttazsfgf().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_ywtzsfgf() != null)
			mCHYWTZSFGF.setText(mPapermakingTemplateBean.getData().get(0).getCh_ywtzsfgf().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_zkxtqxsjsfkcc12gy() != null)
			mCHZKXTQXSJSFKCC12GY.setText(mPapermakingTemplateBean.getData().get(0).getCh_zkxtqxsjsfkcc12gy().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_zksjzxsjsfyz() != null)
			mCHZKSJZXSJSFYZ.setText(mPapermakingTemplateBean.getData().get(0).getCh_zksjzxsjsfyz().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sfyhbbmlw() != null)
			mCHSFYHBBMLW.setText(mPapermakingTemplateBean.getData().get(0).getCh_sfyhbbmlw().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_hjyqwsfhjl() != null)
			mVCHJYQWSFHJL.setText(mPapermakingTemplateBean.getData().get(0).getVc_hjyqwsfhjl().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_jlnsfybhmb() != null)
			mCHJLNSFYBHMB.setText(mPapermakingTemplateBean.getData().get(0).getCh_jlnsfybhmb().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_zbhjbhqk() != null)
			mDTBHMBJSSJ.setText(mPapermakingTemplateBean.getData().get(0).getVc_zbhjbhqk().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_zbhjbhqk() != null)
			mVCZBHJBHQK.setText(mPapermakingTemplateBean.getData().get(0).getVc_zbhjbhqk().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sflscs() != null)
			mCHSFLSCS.setText(mPapermakingTemplateBean.getData().get(0).getCh_sflscs().toString());

		if (mPapermakingTemplateBean.getData().get(0).getVc_wlsqkms() != null)
			mCHWLSQKMS.setText(mPapermakingTemplateBean.getData().get(0).getVc_wlsqkms().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sfbztfya() != null)
			mCHSFBZTFYA.setText(mPapermakingTemplateBean.getData().get(0).getCh_sfbztfya().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sfdyapg() != null)
			mCHSFDYAPG.setText(mPapermakingTemplateBean.getData().get(0).getCh_sfdyapg().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sfjxndyl() != null)
			mCHSFJXNDYL.setText(mPapermakingTemplateBean.getData().get(0).getCh_sfjxndyl().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCh_sfcbwz() != null)
			mCHSFCBWZ.setText(mPapermakingTemplateBean.getData().get(0).getCh_sfcbwz().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCl_qthbbmjcqk() != null)
			mCLQTHBBMJCQK.setText(mPapermakingTemplateBean.getData().get(0).getCl_qthbbmjcqk().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCl_czzywt() != null)
			mCLCZZYWT.setText(mPapermakingTemplateBean.getData().get(0).getCl_czzywt().toString());

		if (mPapermakingTemplateBean.getData().get(0).getCl_jcyq() != null)
			mCLJCYQ.setText(mPapermakingTemplateBean.getData().get(0).getCl_jcyq().toString());
	}
}
