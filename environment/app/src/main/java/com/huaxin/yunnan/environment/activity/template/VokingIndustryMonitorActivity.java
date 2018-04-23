package com.huaxin.yunnan.environment.activity.template;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.Constant;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.bean.VokingIndustryMonitorBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_JRD_INFO;

/**
 * 18、焦化行业现场监察记录页面
 */
public class VokingIndustryMonitorActivity extends BaseActicity implements View.OnClickListener, CallBack {

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
	private TextView mVCXCJCQK;
	private TextView mVCJT;
	private TextView mVCMJY;
	private TextView mVCCB;
	private TextView mVCJC;
	private TextView mVCLH;
	private TextView mVCLA;
	private TextView mVCNAS;
	private TextView mVCQT;
	private TextView mVCCPJGM;
	private TextView mVCSFCJZRGG;
	private TextView mVCYFTT;
	private TextView mCLYFTTXXMS;
	private TextView mVCFHCYZC;
	private TextView mCLGHCYZCXXMS;
	private TextView mDTXFSJTIME;
	private TextView mDTPZLXTIME;
	private TextView mVCPZLXDW;
	private TextView mVCLXPFWH;
	private TextView mVCPJBGLX;
	private TextView mVCHPBZDW;
	private TextView mDTHPBZTIME;
	private TextView mVCSFJDDJBZ;
	private TextView mVCHPSPDW;
	private TextView mDTHPSPTIME;
	private TextView mVCHPSPWH;
	private TextView mVCSFYJSP;
	private TextView mVCSFGKJ;
	private TextView mVCGKJZXQK;
	private TextView mVCSFYWJYZ;
	private TextView mVCBFQK;
	private TextView mDTTRSSCTIME;
	private TextView mVCLHSCSJ;
	private TextView mVCSFTYSSC;
	private TextView mVCSSCSPDW;
	private TextView mDTSSCSPTIME;
	private TextView mVCSSCSPWH;
	private TextView mVCSFHBJGYS;
	private TextView mDTHBJGYSTIME;
	private TextView mVCYSDW;
	private TextView mVCYSSPWH;
	private TextView mVCSFQDPWXKZBAGDPFWRW;
	private TextView mVCSFSBDJ;
	private TextView mVCSFJNPWF;
	private TextView mVCSJJNPWF;
	private TextView mVCYJPWF;
	private TextView mVCWZEJNYY;
	private TextView mVCSFYCCZZ;
	private TextView mVCCCWPTZZ;
	private TextView mVCSFYFQYS;
	private TextView mVCSFYCCC;
	private TextView mVCASBSFZC;
	private TextView mVCPTJHZZ;
	private TextView mVCJHWPTZZ;
	private TextView mVCSYMQCLFS;
	private TextView mVCPQXJTSFKQ;
	private TextView mVCYBCHFCXZZ;
	private TextView mVCYCCDMZ;
	private TextView mVCSFZCYX;
	private TextView mVCJCZSFMB;
	private TextView mVCCCSSSFZC;
	private TextView mVCSFJYCCXT;
	private TextView mVCAZZXJCZZ;
	private TextView mDTAZTIME;
	private TextView mVCSFLW;
	private TextView mVCJCSFYXZC;
	private TextView mVCSFJGJY;
	private TextView mDTJYTIME;
	private TextView mVCZXSJXS;
	private TextView mVCSFPTWSCLSS;
	private TextView mVCWSCLGY;
	private TextView mVCSJCLL;
	private TextView mVCWNCSL;
	private TextView mVCSFXHBWP;
	private TextView mVCJZATYCL;
	private TextView mVCSFPBCDC;
	private TextView mVCCDCSFXHBWP;
	private TextView mVCSFFSFL;
	private TextView mVCSFCZTPFS;
	private TextView mVCQKSM;
	private TextView mVCWXFWLB;
	private TextView mVCQTWXFW;
	private TextView mVCCSL;
	private TextView mVCWFTZSFGF;
	private TextView mVCCZQKSFSB;
	private TextView mCLWSBDYNX;
	private TextView mVCWFCFDYBS;
	private TextView mVCFHWFCCGF;
	private TextView mVCDCSJCGYN;
	private TextView mVCYYJDCZC;
	private TextView mVCZXZYLDZD;
	private TextView mVCYSCLYZZ;
	private TextView mVCYSL;
	private TextView mVCPC;
	private TextView mVCJSDWYZZ;
	private TextView mVCSJCZFS;
	private TextView mVCQTGFGFCC;
	private TextView mVCLYCSFHYQ;
	private TextView mVCCZFS;
	private TextView mVCCZSBCQCS;
	private TextView mVCWSFHJL;
	private TextView mVCSFYBHMB;
	private TextView mDTBHMBJSTIME;
	private TextView mVCZBHJBHQK;
	private TextView mVCLSFXFFCS;
	private TextView mVCWLSQKMS;
	private TextView mVCSFBZYJYA;
	private TextView mVCSFDYAPGBBA;
	private TextView mVCSFYJYL;
	private TextView mVCSFCBYJWZ;
	private TextView mCLQTHBBMJCQK;
	private TextView mCLCZZYWT;
	private TextView mCLJCYQ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_voking_industry_monitor);
		initProgressDialog();
		Intent intent = getIntent();
		String t_task_list_id = intent.getStringExtra("t_task_list_id");
		initView();
		NetTool.templatePost(getApplicationContext(), t_task_list_id, URL_QUERY_JRD_INFO, VokingIndustryMonitorBean.class, this, yNProgressDialog);
	}

	private void initView() {
		titleText = (TextView) findViewById(R.id.title_text);
		titleText.setText("焦化行业现场监察记录");
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
		mVCXCJCQK = (TextView) findViewById(R.id.VC_XCJCQK);
		mVCJT = (TextView) findViewById(R.id.VC_JT);
		mVCMJY = (TextView) findViewById(R.id.VC_MJY);
		mVCCB = (TextView) findViewById(R.id.VC_CB);
		mVCJC = (TextView) findViewById(R.id.VC_JC);
		mVCLH = (TextView) findViewById(R.id.VC_LH);
		mVCLA = (TextView) findViewById(R.id.VC_LA);
		mVCNAS = (TextView) findViewById(R.id.VC_NAS);
		mVCQT = (TextView) findViewById(R.id.VC_QT);
		mVCCPJGM = (TextView) findViewById(R.id.VC_CPJGM);
		mVCSFCJZRGG = (TextView) findViewById(R.id.VC_SFCJZRGG);
		mVCYFTT = (TextView) findViewById(R.id.VC_YFTT);
		mCLYFTTXXMS = (TextView) findViewById(R.id.CL_YFTTXXMS);
		mVCFHCYZC = (TextView) findViewById(R.id.VC_FHCYZC);
		mCLGHCYZCXXMS = (TextView) findViewById(R.id.CL_GHCYZCXXMS);
		mDTXFSJTIME = (TextView) findViewById(R.id.DT_XFSJ_TIME);
		mDTPZLXTIME = (TextView) findViewById(R.id.DT_PZLX_TIME);
		mVCPZLXDW = (TextView) findViewById(R.id.VC_PZLXDW);
		mVCLXPFWH = (TextView) findViewById(R.id.VC_LXPFWH);
		mVCPJBGLX = (TextView) findViewById(R.id.VC_PJBGLX);
		mVCHPBZDW = (TextView) findViewById(R.id.VC_HPBZDW);
		mDTHPBZTIME = (TextView) findViewById(R.id.DT_HPBZ_TIME);
		mVCSFJDDJBZ = (TextView) findViewById(R.id.VC_SFJDDJBZ);
		mVCHPSPDW = (TextView) findViewById(R.id.VC_HPSPDW);
		mDTHPSPTIME = (TextView) findViewById(R.id.DT_HPSP_TIME);
		mVCHPSPWH = (TextView) findViewById(R.id.VC_HPSPWH);
		mVCSFYJSP = (TextView) findViewById(R.id.VC_SFYJSP);
		mVCSFGKJ = (TextView) findViewById(R.id.VC_SFGKJ);
		mVCGKJZXQK = (TextView) findViewById(R.id.VC_GKJZXQK);
		mVCSFYWJYZ = (TextView) findViewById(R.id.VC_SFYWJYZ);
		mVCBFQK = (TextView) findViewById(R.id.VC_BFQK);
		mDTTRSSCTIME = (TextView) findViewById(R.id.DT_TRSSC_TIME);
		mVCLHSCSJ = (TextView) findViewById(R.id.VC_LHSCSJ);
		mVCSFTYSSC = (TextView) findViewById(R.id.VC_SFTYSSC);
		mVCSSCSPDW = (TextView) findViewById(R.id.VC_SSCSPDW);
		mDTSSCSPTIME = (TextView) findViewById(R.id.DT_SSCSP_TIME);
		mVCSSCSPWH = (TextView) findViewById(R.id.VC_SSCSPWH);
		mVCSFHBJGYS = (TextView) findViewById(R.id.VC_SFHBJGYS);
		mDTHBJGYSTIME = (TextView) findViewById(R.id.DT_HBJGYS_TIME);
		mVCYSDW = (TextView) findViewById(R.id.VC_YSDW);
		mVCYSSPWH = (TextView) findViewById(R.id.VC_YSSPWH);
		mVCSFQDPWXKZBAGDPFWRW = (TextView) findViewById(R.id.VC_SFQDPWXKZBAGDPFWRW);
		mVCSFSBDJ = (TextView) findViewById(R.id.VC_SFSBDJ);
		mVCSFJNPWF = (TextView) findViewById(R.id.VC_SFJNPWF);
		mVCSJJNPWF = (TextView) findViewById(R.id.VC_SJJNPWF);
		mVCYJPWF = (TextView) findViewById(R.id.VC_YJPWF);
		mVCWZEJNYY = (TextView) findViewById(R.id.VC_WZEJNYY);
		mVCSFYCCZZ = (TextView) findViewById(R.id.VC_SFYCCZZ);
		mVCCCWPTZZ = (TextView) findViewById(R.id.VC_CCWPTZZ);
		mVCSFYFQYS = (TextView) findViewById(R.id.VC_SFYFQYS);
		mVCSFYCCC = (TextView) findViewById(R.id.VC_SFYCCC);
		mVCASBSFZC = (TextView) findViewById(R.id.VC_ASBSFZC);
		mVCPTJHZZ = (TextView) findViewById(R.id.VC_PTJHZZ);
		mVCJHWPTZZ = (TextView) findViewById(R.id.VC_JHWPTZZ);
		mVCSYMQCLFS = (TextView) findViewById(R.id.VC_SYMQCLFS);
		mVCPQXJTSFKQ = (TextView) findViewById(R.id.VC_PQXJTSFKQ);
		mVCYBCHFCXZZ = (TextView) findViewById(R.id.VC_YBCHFCXZZ);
		mVCYCCDMZ = (TextView) findViewById(R.id.VC_YCCDMZ);
		mVCSFZCYX = (TextView) findViewById(R.id.VC_SFZCYX);
		mVCJCZSFMB = (TextView) findViewById(R.id.VC_JCZSFMB);
		mVCCCSSSFZC = (TextView) findViewById(R.id.VC_CCSSSFZC);
		mVCSFJYCCXT = (TextView) findViewById(R.id.VC_SFJYCCXT);
		mVCAZZXJCZZ = (TextView) findViewById(R.id.VC_AZZXJCZZ);
		mDTAZTIME = (TextView) findViewById(R.id.DT_AZ_TIME);
		mVCSFLW = (TextView) findViewById(R.id.VC_SFLW);
		mVCJCSFYXZC = (TextView) findViewById(R.id.VC_JCSFYXZC);
		mVCSFJGJY = (TextView) findViewById(R.id.VC_SFJGJY);
		mDTJYTIME = (TextView) findViewById(R.id.DT_JY_TIME);
		mVCZXSJXS = (TextView) findViewById(R.id.VC_ZXSJXS);
		mVCSFPTWSCLSS = (TextView) findViewById(R.id.VC_SFPTWSCLSS);
		mVCWSCLGY = (TextView) findViewById(R.id.VC_WSCLGY);
		mVCSJCLL = (TextView) findViewById(R.id.VC_SJCLL);
		mVCWNCSL = (TextView) findViewById(R.id.VC_WNCSL);
		mVCSFXHBWP = (TextView) findViewById(R.id.VC_SFXHBWP);
		mVCJZATYCL = (TextView) findViewById(R.id.VC_JZATYCL);
		mVCSFPBCDC = (TextView) findViewById(R.id.VC_SFPBCDC);
		mVCCDCSFXHBWP = (TextView) findViewById(R.id.VC_CDCSFXHBWP);
		mVCSFFSFL = (TextView) findViewById(R.id.VC_SFFSFL);
		mVCSFCZTPFS = (TextView) findViewById(R.id.VC_SFCZTPFS);
		mVCQKSM = (TextView) findViewById(R.id.VC_QKSM);
		mVCWXFWLB = (TextView) findViewById(R.id.VC_WXFWLB);
		mVCQTWXFW = (TextView) findViewById(R.id.VC_QTWXFW);
		mVCCSL = (TextView) findViewById(R.id.VC_CSL);
		mVCWFTZSFGF = (TextView) findViewById(R.id.VC_WFTZSFGF);
		mVCCZQKSFSB = (TextView) findViewById(R.id.VC_CZQKSFSB);
		mCLWSBDYNX = (TextView) findViewById(R.id.CL_WSBDYNX);
		mVCWFCFDYBS = (TextView) findViewById(R.id.VC_WFCFDYBS);
		mVCFHWFCCGF = (TextView) findViewById(R.id.VC_FHWFCCGF);
		mVCDCSJCGYN = (TextView) findViewById(R.id.VC_DCSJCGYN);
		mVCYYJDCZC = (TextView) findViewById(R.id.VC_YYJDCZC);
		mVCZXZYLDZD = (TextView) findViewById(R.id.VC_ZXZYLDZD);
		mVCYSCLYZZ = (TextView) findViewById(R.id.VC_YSCLYZZ);
		mVCYSL = (TextView) findViewById(R.id.VC_YSL);
		mVCPC = (TextView) findViewById(R.id.VC_PC);
		mVCJSDWYZZ = (TextView) findViewById(R.id.VC_JSDWYZZ);
		mVCSJCZFS = (TextView) findViewById(R.id.VC_SJCZFS);
		mVCQTGFGFCC = (TextView) findViewById(R.id.VC_QTGFGFCC);
		mVCLYCSFHYQ = (TextView) findViewById(R.id.VC_LYCSFHYQ);
		mVCCZFS = (TextView) findViewById(R.id.VC_CZFS);
		mVCCZSBCQCS = (TextView) findViewById(R.id.VC_CZSBCQCS);
		mVCWSFHJL = (TextView) findViewById(R.id.VC_WSFHJL);
		mVCSFYBHMB = (TextView) findViewById(R.id.VC_SFYBHMB);
		mDTBHMBJSTIME = (TextView) findViewById(R.id.DT_BHMBJS_TIME);
		mVCZBHJBHQK = (TextView) findViewById(R.id.VC_ZBHJBHQK);
		mVCLSFXFFCS = (TextView) findViewById(R.id.VC_LSFXFFCS);
		mVCWLSQKMS = (TextView) findViewById(R.id.VC_WLSQKMS);
		mVCSFBZYJYA = (TextView) findViewById(R.id.VC_SFBZYJYA);
		mVCSFDYAPGBBA = (TextView) findViewById(R.id.VC_SFDYAPGBBA);
		mVCSFYJYL = (TextView) findViewById(R.id.VC_SFYJYL);
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
		VokingIndustryMonitorBean mVokingIndustryMonitorBean = (VokingIndustryMonitorBean) o;
		if (Constant.RESPONSE_SUCCESS.equals(mVokingIndustryMonitorBean.getSuccess())) {
			initData(mVokingIndustryMonitorBean);
		} else {
			LogUtils.e("请求失败，错误码：" + mVokingIndustryMonitorBean.getSuccess() + "错误信息：" + mVokingIndustryMonitorBean.getMsg());
		}
	}

	private void initData(VokingIndustryMonitorBean mVokingIndustryMonitorBean) {
		if (mVokingIndustryMonitorBean.getData().get(0).getDt_start_time()!=null)
			mDTSTARTTIME.setText(mVokingIndustryMonitorBean.getData().get(0).getDt_start_time().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getDt_end_time()!=null)
			mDTENDTIME.setText(mVokingIndustryMonitorBean.getData().get(0).getDt_end_time().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_location()!=null)
			mVCLOCATION.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_location().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_jcr()!=null)
			mVCJCR.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_jcr().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_zfzh()!=null)
			mVCZFZH.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_zfzh().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_jlr()!=null)
			mVCJLR.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_jlr().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_bjcdwmc()!=null)
			mVCBJCDWMC.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_bjcdwmc().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_zzjgdmzh()!=null)
			mVCZZJGDMZH.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_zzjgdmzh().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_fddbr()!=null)
			mVCFDDBR.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_fddbr().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_fddbrsfzh()!=null)
			mVCFDDBRSFZH.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_fddbrsfzh().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_xcfzr()!=null)
			mVCXCFZR.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_xcfzr().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_xcfzrsfzh()!=null)
			mVCXCFZRSFZH.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_xcfzrsfzh().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getNb_age()!=null)
			mNBAGE.setText(mVokingIndustryMonitorBean.getData().get(0).getNb_age().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_gzdw()!=null)
			mVCGZDW.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_gzdw().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_duty()!=null)
			mVCDUTY.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_duty().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_ybagx()!=null)
			mVCYBAGX.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_ybagx().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_address()!=null)
			mVCADDRESS.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_address().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_telephone()!=null)
			mVCTELEPHONE.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_telephone().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_yzbm()!=null)
			mVCYZBM.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_yzbm().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getCl_qtcjrxmjgzdw()!=null)
			mCLQTCJRXMJGZDW.setText(mVokingIndustryMonitorBean.getData().get(0).getCl_qtcjrxmjgzdw().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_hbdwmc()!=null)
			mVCHBDWMC.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_hbdwmc().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_hbdwlx()!=null)
			mVCHBDWLX.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_hbdwlx().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_hjjclx()!=null)
			mVCHJJCLX.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_hjjclx().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfqrzj()!=null)
			mVCSFQRZJ.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfqrzj().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfsqhb()!=null)
			mVCSFSQHB.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfsqhb().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_city()!=null)
			mVCCITY.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_city().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_county()!=null)
			mVCCOUNTY.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_county().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_town()!=null)
			mVCTOWN.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_town().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_xzc()!=null)
			mVCXZC.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_xzc().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_gyyq()!=null)
			mVCGYYQ.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_gyyq().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_pq()!=null)
			mVCPQ.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_pq().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_xcjcqk()!=null)
			mVCXCJCQK.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_xcjcqk().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_jt()!=null)
			mVCJT.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_jt().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_mjy()!=null)
			mVCMJY.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_mjy().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_cb()!=null)
			mVCCB.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_cb().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_jc()!=null)
			mVCJC.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_jc().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_lh()!=null)
			mVCLH.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_lh().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_la()!=null)
			mVCLA.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_la().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_nas()!=null)
			mVCNAS.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_nas().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_qt()!=null)
			mVCQT.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_qt().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_cpjgm()!=null)
			mVCCPJGM.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_cpjgm().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfcjzrgg()!=null)
			mVCSFCJZRGG.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfcjzrgg().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_yftt()!=null)
			mVCYFTT.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_yftt().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getCl_yfttxxms()!=null)
			mCLYFTTXXMS.setText(mVokingIndustryMonitorBean.getData().get(0).getCl_yfttxxms().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_fhcyzc()!=null)
			mVCFHCYZC.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_fhcyzc().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getCl_ghcyzcxxms()!=null)
			mCLGHCYZCXXMS.setText(mVokingIndustryMonitorBean.getData().get(0).getCl_ghcyzcxxms().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getDt_xfsj_time()!=null)
			mDTXFSJTIME.setText(mVokingIndustryMonitorBean.getData().get(0).getDt_xfsj_time().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getDt_pzlx_time()!=null)
			mDTPZLXTIME.setText(mVokingIndustryMonitorBean.getData().get(0).getDt_pzlx_time().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_pzlxdw()!=null)
			mVCPZLXDW.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_pzlxdw().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_lxpfwh()!=null)
			mVCLXPFWH.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_lxpfwh().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_pjbglx()!=null)
			mVCPJBGLX.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_pjbglx().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_hpbzdw()!=null)
			mVCHPBZDW.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_hpbzdw().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getDt_hpbz_time()!=null)
			mDTHPBZTIME.setText(mVokingIndustryMonitorBean.getData().get(0).getDt_hpbz_time().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfjddjbz()!=null)
			mVCSFJDDJBZ.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfjddjbz().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_hpspdw()!=null)
			mVCHPSPDW.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_hpspdw().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getDt_hpsp_time()!=null)
			mDTHPSPTIME.setText(mVokingIndustryMonitorBean.getData().get(0).getDt_hpsp_time().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_hpspwh()!=null)
			mVCHPSPWH.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_hpspwh().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfyjsp()!=null)
			mVCSFYJSP.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfyjsp().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfgkj()!=null)
			mVCSFGKJ.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfgkj().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_gkjzxqk()!=null)
			mVCGKJZXQK.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_gkjzxqk().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfywjyz()!=null)
			mVCSFYWJYZ.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfywjyz().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_bfqk()!=null)
			mVCBFQK.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_bfqk().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getDt_trssc_time()!=null)
			mDTTRSSCTIME.setText(mVokingIndustryMonitorBean.getData().get(0).getDt_trssc_time().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_lhscsj()!=null)
			mVCLHSCSJ.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_lhscsj().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sftyssc()!=null)
			mVCSFTYSSC.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sftyssc().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sscspdw()!=null)
			mVCSSCSPDW.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sscspdw().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getDt_sscsp_time()!=null)
			mDTSSCSPTIME.setText(mVokingIndustryMonitorBean.getData().get(0).getDt_sscsp_time().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sscspwh()!=null)
			mVCSSCSPWH.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sscspwh().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfhbjgys()!=null)
			mVCSFHBJGYS.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfhbjgys().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getDt_hbjgys_time()!=null)
			mDTHBJGYSTIME.setText(mVokingIndustryMonitorBean.getData().get(0).getDt_hbjgys_time().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_ysdw()!=null)
			mVCYSDW.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_ysdw().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_ysspwh()!=null)
			mVCYSSPWH.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_ysspwh().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfqdpwxkzbagdpfwrw()!=null)
			mVCSFQDPWXKZBAGDPFWRW.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfqdpwxkzbagdpfwrw().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfsbdj()!=null)
			mVCSFSBDJ.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfsbdj().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfjnpwf()!=null)
			mVCSFJNPWF.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfjnpwf().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sjjnpwf()!=null)
			mVCSJJNPWF.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sjjnpwf().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_yjpwf()!=null)
			mVCYJPWF.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_yjpwf().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_wzejnyy()!=null)
			mVCWZEJNYY.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_wzejnyy().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfycczz()!=null)
			mVCSFYCCZZ.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfycczz().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_ccwptzz()!=null)
			mVCCCWPTZZ.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_ccwptzz().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfyfqys()!=null)
			mVCSFYFQYS.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfyfqys().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfyccc()!=null)
			mVCSFYCCC.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfyccc().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_asbsfzc()!=null)
			mVCASBSFZC.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_asbsfzc().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_ptjhzz()!=null)
			mVCPTJHZZ.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_ptjhzz().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_jhwptzz()!=null)
			mVCJHWPTZZ.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_jhwptzz().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_symqclfs()!=null)
			mVCSYMQCLFS.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_symqclfs().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_pqxjtsfkq()!=null)
			mVCPQXJTSFKQ.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_pqxjtsfkq().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_ybchfcxzz()!=null)
			mVCYBCHFCXZZ.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_ybchfcxzz().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_yccdmz()!=null)
			mVCYCCDMZ.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_yccdmz().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfzcyx()!=null)
			mVCSFZCYX.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfzcyx().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_jczsfmb()!=null)
			mVCJCZSFMB.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_jczsfmb().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_ccsssfzc()!=null)
			mVCCCSSSFZC.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_ccsssfzc().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfjyccxt()!=null)
			mVCSFJYCCXT.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfjyccxt().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_azzxjczz()!=null)
			mVCAZZXJCZZ.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_azzxjczz().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getDt_az_time()!=null)
			mDTAZTIME.setText(mVokingIndustryMonitorBean.getData().get(0).getDt_az_time().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sflw()!=null)
			mVCSFLW.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sflw().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_jcsfyxzc()!=null)
			mVCJCSFYXZC.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_jcsfyxzc().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfjgjy()!=null)
			mVCSFJGJY.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfjgjy().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getDt_jy_time()!=null)
			mDTJYTIME.setText(mVokingIndustryMonitorBean.getData().get(0).getDt_jy_time().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_zxsjxs()!=null)
			mVCZXSJXS.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_zxsjxs().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfptwsclss()!=null)
			mVCSFPTWSCLSS.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfptwsclss().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_wsclgy()!=null)
			mVCWSCLGY.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_wsclgy().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sjcll()!=null)
			mVCSJCLL.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sjcll().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_wncsl()!=null)
			mVCWNCSL.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_wncsl().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfxhbwp()!=null)
			mVCSFXHBWP.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfxhbwp().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_jzatycl()!=null)
			mVCJZATYCL.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_jzatycl().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfpbcdc()!=null)
			mVCSFPBCDC.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfpbcdc().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_cdcsfxhbwp()!=null)
			mVCCDCSFXHBWP.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_cdcsfxhbwp().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sffsfl()!=null)
			mVCSFFSFL.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sffsfl().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfcztpfs()!=null)
			mVCSFCZTPFS.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfcztpfs().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_qksm()!=null)
			mVCQKSM.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_qksm().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_wxfwlb()!=null)
			mVCWXFWLB.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_wxfwlb().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_qtwxfw()!=null)
			mVCQTWXFW.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_qtwxfw().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_csl()!=null)
			mVCCSL.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_csl().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_wftzsfgf()!=null)
			mVCWFTZSFGF.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_wftzsfgf().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_czqksfsb()!=null)
			mVCCZQKSFSB.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_czqksfsb().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getCl_wsbdynx()!=null)
			mCLWSBDYNX.setText(mVokingIndustryMonitorBean.getData().get(0).getCl_wsbdynx().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_wfcfdybs()!=null)
			mVCWFCFDYBS.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_wfcfdybs().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_fhwfccgf()!=null)
			mVCFHWFCCGF.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_fhwfccgf().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_dcsjcgyn()!=null)
			mVCDCSJCGYN.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_dcsjcgyn().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_yyjdczc()!=null)
			mVCYYJDCZC.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_yyjdczc().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_zxzyldzd()!=null)
			mVCZXZYLDZD.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_zxzyldzd().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_ysclyzz()!=null)
			mVCYSCLYZZ.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_ysclyzz().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_ysl()!=null)
			mVCYSL.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_ysl().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_pc()!=null)
			mVCPC.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_pc().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_jsdwyzz()!=null)
			mVCJSDWYZZ.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_jsdwyzz().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sjczfs()!=null)
			mVCSJCZFS.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sjczfs().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_qtgfgfcc()!=null)
			mVCQTGFGFCC.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_qtgfgfcc().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_lycsfhyq()!=null)
			mVCLYCSFHYQ.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_lycsfhyq().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_czfs()!=null)
			mVCCZFS.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_czfs().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_czsbcqcs()!=null)
			mVCCZSBCQCS.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_czsbcqcs().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_wsfhjl()!=null)
			mVCWSFHJL.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_wsfhjl().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfybhmb()!=null)
			mVCSFYBHMB.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfybhmb().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getDt_bhmbjs_time()!=null)
			mDTBHMBJSTIME.setText(mVokingIndustryMonitorBean.getData().get(0).getDt_bhmbjs_time().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_zbhjbhqk()!=null)
			mVCZBHJBHQK.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_zbhjbhqk().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_lsfxffcs()!=null)
			mVCLSFXFFCS.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_lsfxffcs().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_wlsqkms()!=null)
			mVCWLSQKMS.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_wlsqkms().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfbzyjya()!=null)
			mVCSFBZYJYA.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfbzyjya().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfdyapgbba()!=null)
			mVCSFDYAPGBBA.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfdyapgbba().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfyjyl()!=null)
			mVCSFYJYL.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfyjyl().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getVc_sfcbyjwz()!=null)
			mVCSFCBYJWZ.setText(mVokingIndustryMonitorBean.getData().get(0).getVc_sfcbyjwz().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getCl_qthbbmjcqk()!=null)
			mCLQTHBBMJCQK.setText(mVokingIndustryMonitorBean.getData().get(0).getCl_qthbbmjcqk().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getCl_czzywt()!=null)
			mCLCZZYWT.setText(mVokingIndustryMonitorBean.getData().get(0).getCl_czzywt().toString());
		if (mVokingIndustryMonitorBean.getData().get(0).getCl_jcyq()!=null)
			mCLJCYQ.setText(mVokingIndustryMonitorBean.getData().get(0).getCl_jcyq().toString());
	}
}
