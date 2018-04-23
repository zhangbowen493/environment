package com.huaxin.yunnan.environment.activity.template;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.Constant;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.bean.CopperSmeltingTemplateBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_TR_INFO;

/**
 * 6、铜冶炼行业现场监察记录
 */
public class CopperSmeltingTemplateActivity extends BaseActicity implements View.OnClickListener, CallBack {

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
	private TextView mVCQYZT;
	private TextView mVCQYCP;
	private TextView mVCCTCL;
	private TextView mVCJTCL;
	private TextView mVCLSCL;
	private TextView mVCQTCL;
	private TextView mVCSCZYYL;
	private TextView mVCTYLGY;
	private TextView mVCQTTYLGY;
	private TextView mVCCTJLGY;
	private TextView mVCQTCTJLGY;
	private TextView mVCLSSCXSCGY;
	private TextView mVCZYSCZZJSB;
	private TextView mVCCYJSZCSFSYXZL;
	private TextView mVCCYJSZCSFSYTTL;
	private TextView mDTXMSJTIMA;
	private TextView mDTPZLXTIME;
	private TextView mVCPZLXDW;
	private TextView mVCLXPFWH;
	private TextView mVCBZHJYXPJBG;
	private TextView mVCHPBZDW;
	private TextView mDTBZTIME;
	private TextView mVCSFJDDJBZ;
	private TextView mVCHPSPDW;
	private TextView mDTHPSPTIME;
	private TextView mVCHPSPWH;
	private TextView mVCSFCZYJSPQK;
	private TextView mVCSCYFCL;
	private TextView mVCZFCPJCLFBW;
	private TextView mVCGXMCSDSFYHJYXPJWJYZ;
	private TextView mVCBFDY;
	private TextView mVCBZHPBGSSFSYCYZCTTFW;
	private TextView mVCMQSFSYCYZCTTFW;
	private TextView mDTTRSSCTIME;
	private TextView mVCLJSCJGY;
	private TextView mVCSFPFTYSSC;
	private TextView mVCHBSSCSPDW;
	private TextView mDTHBSSCSPTIME;
	private TextView mVCHBSSCSPWH;
	private TextView mVCSFTGHBJGYS;
	private TextView mVCHBJGYSSPDW;
	private TextView mDTHBJGYSSPTIME;
	private TextView mVCHBJGYSSPWH;
	private TextView mVCSFJXGJGHKJ;
	private TextView mCLJGKJHPJSTSZDZXQK;
	private TextView mVCSFYFQDPWXKZ;
	private TextView mVCSFAZPWXKZDGDPFWRW;
	private TextView mVCSFXHJBHBMJXPWSBDJ;
	private TextView mVCSFJSZEJNPWF;
	private TextView mVCSYNSJJNPWF;
	private TextView mVCYJPWF;
	private TextView mCLWZEJNPWFYY;
	private TextView mVCGQYFSLY;
	private TextView mVCFSTZWRW;
	private TextView mVCSJCSL;
	private TextView mVCSCFSCLSS;
	private TextView mVCCLL;
	private TextView mVCSFFHFSCLYQ;
	private TextView mVCBFHQKMS;
	private TextView mVCSFSXSHFSYSHSCFSFL;
	private TextView mVCSFCZGBJGDFSPFFSXW;
	private TextView mCLQKSM;
	private TextView mCLWXFWZYY;
	private TextView mVCYICSL;
	private TextView mVCYICZCS;
	private TextView mVCERCSL;
	private TextView mVCERCZCS;
	private TextView mVCSANCSL;
	private TextView mVCSANCZCS;
	private TextView mVCSICSL;
	private TextView mVCSICZCS;
	private TextView mVCWUCSL;
	private TextView mVCWUCZCS;
	private TextView mVCLIUCSL;
	private TextView mVCLIUCZCS;
	private TextView mVCQT;
	private TextView mVCQTCSL;
	private TextView mVCQTCZCS;
	private TextView mVCWXFWTZSFJQGF;
	private TextView mVCSYCSJCZQKSFXHBBMSB;
	private TextView mVCWSBDYNX;
	private TextView mVCWXFWCFKHCDSFSYBS;
	private TextView mVCSFFHWXFWCCGF;
	private TextView mVCZCNLSCFSCSJSFCGYN;
	private TextView mVCZCWSFJSYYJXDCZC;
	private TextView mVCRZYCCSFZXWXFWZYLDZD;
	private TextView mVCYSCLSFJYXGZZ;
	private TextView mVCYSL;
	private TextView mVCPC;
	private TextView mVCJSDWSFJYWFJYZZ;
	private TextView mVCSJCZFS;
	private TextView mVCQTYBGF;
	private TextView mVCSFJXGFCC;
	private TextView mVCZHLYCSSFFHHPYQ;
	private TextView mVCCZFS;
	private TextView mVCFQCSHJ;
	private TextView mVCSFPTFQZLSS;
	private TextView mVCWPTJSSSMCW;
	private TextView mVCJQJGJCSFCB;
	private TextView mVCCBYZJJCZW;
	private TextView mVCJCDW;
	private TextView mDTJCTIME;
	private TextView mCOLUMN99;
	private TextView mDTZXAZTIME;
	private TextView mVCSFXHBBMLW;
	private TextView mVCSFYXZC;
	private TextView mVCSFJGJY;
	private TextView mDTJYTIME;
	private TextView mVCZXJCSJXSW;
	private TextView mVCSFAHPYQCQCS;
	private TextView mVCWPTJSDSSW;
	private TextView mVCHPYQDWSFHJL;
	private TextView mVCJLNSFYBHMB;
	private TextView mDTBHMBJSTIME;
	private TextView mVCQYZBHJBHQK;
	private TextView mVCSFLSHPJPFYQDFXFFDCCS;
	private TextView mVCCSWLSQKMS;
	private TextView mVCSFBZTFHJSJYJYA;
	private TextView mVCSFBZTFHJSJYJYAPGBA;
	private TextView mVCSFAYAYQJXNDYJYL;
	private TextView mVCSFCBYJWZ;
	private TextView mCLQTHBBMJCQK;
	private TextView mCLCZZYWT;
	private TextView mCLJCYQ;
	private String t_detail_id;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_copper_smelting_template);
		initProgressDialog();
		Bundle bundle = this.getIntent().getExtras();
		t_detail_id = bundle.getString("t_task_list_id");
		initView();
		NetTool.templatePost(getApplicationContext(), t_detail_id, URL_QUERY_TR_INFO, CopperSmeltingTemplateBean.class, this, yNProgressDialog);
	}

	private void initView() {
		titleText = (TextView) findViewById(R.id.title_text);
		titleText.setText("铜冶炼行业现场监察记录");
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
		mVCQYZT = (TextView) findViewById(R.id.VC_QYZT);
		mVCQYCP = (TextView) findViewById(R.id.VC_QYCP);
		mVCCTCL = (TextView) findViewById(R.id.VC_CTCL);
		mVCJTCL = (TextView) findViewById(R.id.VC_JTCL);
		mVCLSCL = (TextView) findViewById(R.id.VC_LSCL);
		mVCQTCL = (TextView) findViewById(R.id.VC_QTCL);
		mVCSCZYYL = (TextView) findViewById(R.id.VC_SCZYYL);
		mVCTYLGY = (TextView) findViewById(R.id.VC_TYLGY);
		mVCQTTYLGY = (TextView) findViewById(R.id.VC_QTTYLGY);
		mVCCTJLGY = (TextView) findViewById(R.id.VC_CTJLGY);
		mVCQTCTJLGY = (TextView) findViewById(R.id.VC_QTCTJLGY);
		mVCLSSCXSCGY = (TextView) findViewById(R.id.VC_LSSCXSCGY);
		mVCZYSCZZJSB = (TextView) findViewById(R.id.VC_ZYSCZZJSB);
		mVCCYJSZCSFSYXZL = (TextView) findViewById(R.id.VC_CYJSZCSFSYXZL);
		mVCCYJSZCSFSYTTL = (TextView) findViewById(R.id.VC_CYJSZCSFSYTTL);
		mDTXMSJTIMA = (TextView) findViewById(R.id.DT_XMSJ_TIMA);
		mDTPZLXTIME = (TextView) findViewById(R.id.DT_PZLX_TIME);
		mVCPZLXDW = (TextView) findViewById(R.id.VC_PZLXDW);
		mVCLXPFWH = (TextView) findViewById(R.id.VC_LXPFWH);
		mVCBZHJYXPJBG = (TextView) findViewById(R.id.VC_BZHJYXPJBG);
		mVCHPBZDW = (TextView) findViewById(R.id.VC_HPBZDW);
		mDTBZTIME = (TextView) findViewById(R.id.DT_BZ_TIME);
		mVCSFJDDJBZ = (TextView) findViewById(R.id.VC_SFJDDJBZ);
		mVCHPSPDW = (TextView) findViewById(R.id.VC_HPSPDW);
		mDTHPSPTIME = (TextView) findViewById(R.id.DT_HPSP_TIME);
		mVCHPSPWH = (TextView) findViewById(R.id.VC_HPSPWH);
		mVCSFCZYJSPQK = (TextView) findViewById(R.id.VC_SFCZYJSPQK);
		mVCSCYFCL = (TextView) findViewById(R.id.VC_SCYFCL);
		mVCZFCPJCLFBW = (TextView) findViewById(R.id.VC_ZFCPJCLFBW);
		mVCGXMCSDSFYHJYXPJWJYZ = (TextView) findViewById(R.id.VC_GXMCSDSFYHJYXPJWJYZ);
		mVCBFDY = (TextView) findViewById(R.id.VC_BFDY);
		mVCBZHPBGSSFSYCYZCTTFW = (TextView) findViewById(R.id.VC_BZHPBGSSFSYCYZCTTFW);
		mVCMQSFSYCYZCTTFW = (TextView) findViewById(R.id.VC_MQSFSYCYZCTTFW);
		mDTTRSSCTIME = (TextView) findViewById(R.id.DT_TRSSC_TIME);
		mVCLJSCJGY = (TextView) findViewById(R.id.VC_LJSCJGY);
		mVCSFPFTYSSC = (TextView) findViewById(R.id.VC_SFPFTYSSC);
		mVCHBSSCSPDW = (TextView) findViewById(R.id.VC_HBSSCSPDW);
		mDTHBSSCSPTIME = (TextView) findViewById(R.id.DT_HBSSCSP_TIME);
		mVCHBSSCSPWH = (TextView) findViewById(R.id.VC_HBSSCSPWH);
		mVCSFTGHBJGYS = (TextView) findViewById(R.id.VC_SFTGHBJGYS);
		mVCHBJGYSSPDW = (TextView) findViewById(R.id.VC_HBJGYSSPDW);
		mDTHBJGYSSPTIME = (TextView) findViewById(R.id.DT_HBJGYSSP_TIME);
		mVCHBJGYSSPWH = (TextView) findViewById(R.id.VC_HBJGYSSPWH);
		mVCSFJXGJGHKJ = (TextView) findViewById(R.id.VC_SFJXGJGHKJ);
		mCLJGKJHPJSTSZDZXQK = (TextView) findViewById(R.id.CL_JGKJHPJSTSZDZXQK);
		mVCSFYFQDPWXKZ = (TextView) findViewById(R.id.VC_SFYFQDPWXKZ);
		mVCSFAZPWXKZDGDPFWRW = (TextView) findViewById(R.id.VC_SFAZPWXKZDGDPFWRW);
		mVCSFXHJBHBMJXPWSBDJ = (TextView) findViewById(R.id.VC_SFXHJBHBMJXPWSBDJ);
		mVCSFJSZEJNPWF = (TextView) findViewById(R.id.VC_SFJSZEJNPWF);
		mVCSYNSJJNPWF = (TextView) findViewById(R.id.VC_SYNSJJNPWF);
		mVCYJPWF = (TextView) findViewById(R.id.VC_YJPWF);
		mCLWZEJNPWFYY = (TextView) findViewById(R.id.CL_WZEJNPWFYY);
		mVCGQYFSLY = (TextView) findViewById(R.id.VC_GQYFSLY);
		mVCFSTZWRW = (TextView) findViewById(R.id.VC_FSTZWRW);
		mVCSJCSL = (TextView) findViewById(R.id.VC_SJCSL);
		mVCSCFSCLSS = (TextView) findViewById(R.id.VC_SCFSCLSS);
		mVCCLL = (TextView) findViewById(R.id.VC_CLL);
		mVCSFFHFSCLYQ = (TextView) findViewById(R.id.VC_SFFHFSCLYQ);
		mVCBFHQKMS = (TextView) findViewById(R.id.VC_BFHQKMS);
		mVCSFSXSHFSYSHSCFSFL = (TextView) findViewById(R.id.VC_SFSXSHFSYSHSCFSFL);
		mVCSFCZGBJGDFSPFFSXW = (TextView) findViewById(R.id.VC_SFCZGBJGDFSPFFSXW);
		mCLQKSM = (TextView) findViewById(R.id.CL_QKSM);
		mCLWXFWZYY = (TextView) findViewById(R.id.CL_WXFWZYY);
		mVCYICSL = (TextView) findViewById(R.id.VC_YICSL);
		mVCYICZCS = (TextView) findViewById(R.id.VC_YICZCS);
		mVCERCSL = (TextView) findViewById(R.id.VC_ERCSL);
		mVCERCZCS = (TextView) findViewById(R.id.VC_ERCZCS);
		mVCSANCSL = (TextView) findViewById(R.id.VC_SANCSL);
		mVCSANCZCS = (TextView) findViewById(R.id.VC_SANCZCS);
		mVCSICSL = (TextView) findViewById(R.id.VC_SICSL);
		mVCSICZCS = (TextView) findViewById(R.id.VC_SICZCS);
		mVCWUCSL = (TextView) findViewById(R.id.VC_WUCSL);
		mVCWUCZCS = (TextView) findViewById(R.id.VC_WUCZCS);
		mVCLIUCSL = (TextView) findViewById(R.id.VC_LIUCSL);
		mVCLIUCZCS = (TextView) findViewById(R.id.VC_LIUCZCS);
		mVCQT = (TextView) findViewById(R.id.VC_QT);
		mVCQTCSL = (TextView) findViewById(R.id.VC_QTCSL);
		mVCQTCZCS = (TextView) findViewById(R.id.VC_QTCZCS);
		mVCWXFWTZSFJQGF = (TextView) findViewById(R.id.VC_WXFWTZSFJQGF);
		mVCSYCSJCZQKSFXHBBMSB = (TextView) findViewById(R.id.VC_SYCSJCZQKSFXHBBMSB);
		mVCWSBDYNX = (TextView) findViewById(R.id.VC_WSBDYNX);
		mVCWXFWCFKHCDSFSYBS = (TextView) findViewById(R.id.VC_WXFWCFKHCDSFSYBS);
		mVCSFFHWXFWCCGF = (TextView) findViewById(R.id.VC_SFFHWXFWCCGF);
		mVCZCNLSCFSCSJSFCGYN = (TextView) findViewById(R.id.VC_ZCNLSCFSCSJSFCGYN);
		mVCZCWSFJSYYJXDCZC = (TextView) findViewById(R.id.VC_ZCWSFJSYYJXDCZC);
		mVCRZYCCSFZXWXFWZYLDZD = (TextView) findViewById(R.id.VC_RZYCCSFZXWXFWZYLDZD);
		mVCYSCLSFJYXGZZ = (TextView) findViewById(R.id.VC_YSCLSFJYXGZZ);
		mVCYSL = (TextView) findViewById(R.id.VC_YSL);
		mVCPC = (TextView) findViewById(R.id.VC_PC);
		mVCJSDWSFJYWFJYZZ = (TextView) findViewById(R.id.VC_JSDWSFJYWFJYZZ);
		mVCSJCZFS = (TextView) findViewById(R.id.VC_SJCZFS);
		mVCQTYBGF = (TextView) findViewById(R.id.VC_QTYBGF);
		mVCSFJXGFCC = (TextView) findViewById(R.id.VC_SFJXGFCC);
		mVCZHLYCSSFFHHPYQ = (TextView) findViewById(R.id.VC_ZHLYCSSFFHHPYQ);
		mVCCZFS = (TextView) findViewById(R.id.VC_CZFS);
		mVCFQCSHJ = (TextView) findViewById(R.id.VC_FQCSHJ);
		mVCSFPTFQZLSS = (TextView) findViewById(R.id.VC_SFPTFQZLSS);
		mVCWPTJSSSMCW = (TextView) findViewById(R.id.VC_WPTJSSSMCW);
		mVCJQJGJCSFCB = (TextView) findViewById(R.id.VC_JQJGJCSFCB);
		mVCCBYZJJCZW = (TextView) findViewById(R.id.VC_CBYZJJCZW);
		mVCJCDW = (TextView) findViewById(R.id.VC_JCDW);
		mDTJCTIME = (TextView) findViewById(R.id.DT_JC_TIME);
		mCOLUMN99 = (TextView) findViewById(R.id.COLUMN_99);
		mDTZXAZTIME = (TextView) findViewById(R.id.DT_ZXAZ_TIME);
		mVCSFXHBBMLW = (TextView) findViewById(R.id.VC_SFXHBBMLW);
		mVCSFYXZC = (TextView) findViewById(R.id.VC_SFYXZC);
		mVCSFJGJY = (TextView) findViewById(R.id.VC_SFJGJY);
		mDTJYTIME = (TextView) findViewById(R.id.DT_JY_TIME);
		mVCZXJCSJXSW = (TextView) findViewById(R.id.VC_ZXJCSJXSW);
		mVCSFAHPYQCQCS = (TextView) findViewById(R.id.VC_SFAHPYQCQCS);
		mVCWPTJSDSSW = (TextView) findViewById(R.id.VC_WPTJSDSSW);
		mVCHPYQDWSFHJL = (TextView) findViewById(R.id.VC_HPYQDWSFHJL);
		mVCJLNSFYBHMB = (TextView) findViewById(R.id.VC_JLNSFYBHMB);
		mDTBHMBJSTIME = (TextView) findViewById(R.id.DT_BHMBJS_TIME);
		mVCQYZBHJBHQK = (TextView) findViewById(R.id.VC_QYZBHJBHQK);
		mVCSFLSHPJPFYQDFXFFDCCS = (TextView) findViewById(R.id.VC_SFLSHPJPFYQDFXFFDCCS);
		mVCCSWLSQKMS = (TextView) findViewById(R.id.VC_CSWLSQKMS);
		mVCSFBZTFHJSJYJYA = (TextView) findViewById(R.id.VC_SFBZTFHJSJYJYA);
		mVCSFBZTFHJSJYJYAPGBA = (TextView) findViewById(R.id.VC_SFBZTFHJSJYJYAPGBA);
		mVCSFAYAYQJXNDYJYL = (TextView) findViewById(R.id.VC_SFAYAYQJXNDYJYL);
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
		CopperSmeltingTemplateBean mCopperSmeltingTemplateBean = (CopperSmeltingTemplateBean) o;
		LogUtils.e("获取数据" + mCopperSmeltingTemplateBean.toString());
		if (Constant.RESPONSE_SUCCESS.equals(mCopperSmeltingTemplateBean.getSuccess())) {
			initData(mCopperSmeltingTemplateBean);
		} else {
			LogUtils.e("请求失败，错误码：" + mCopperSmeltingTemplateBean.getSuccess() + "错误信息：" + mCopperSmeltingTemplateBean.getMsg());
		}
	}

	private void initData(CopperSmeltingTemplateBean mCopperSmeltingTemplateBean) {

		if (mCopperSmeltingTemplateBean.getData().get(0).getDt_start_time() != null)
			mDTSTARTTIME.setText(mCopperSmeltingTemplateBean.getData().get(0).getDt_start_time().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getDt_end_time() != null)
			mDTENDTIME.setText(mCopperSmeltingTemplateBean.getData().get(0).getDt_end_time().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_location() != null)
			mVCLOCATION.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_location().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_jcr() != null)
			mVCJCR.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_jcr().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_zfzh() != null)
			mVCZFZH.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_zfzh().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_jlr() != null)
			mVCJLR.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_jlr().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_bjcdwmc() != null)
			mVCBJCDWMC.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_bjcdwmc().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_zzjgdmzh() != null)
			mVCZZJGDMZH.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_zzjgdmzh().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_fddbr() != null)
			mVCFDDBR.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_fddbr().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_fddbrsfzh() != null)
			mVCFDDBRSFZH.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_fddbrsfzh().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_xcfzr() != null)
			mVCXCFZR.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_xcfzr().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_xcfzrsfzh() != null)
			mVCXCFZRSFZH.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_xcfzrsfzh().toString());

		String age = mCopperSmeltingTemplateBean.getData().get(0).getNb_age() + "";
		if (age != null)
			mNBAGE.setText(age);

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_gzdw() != null)
			mVCGZDW.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_gzdw().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_duty() != null)
			mVCDUTY.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_duty().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_ybagx() != null)
			mVCYBAGX.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_ybagx().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_address() != null)
			mVCADDRESS.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_address().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_telephone() != null)
			mVCTELEPHONE.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_telephone().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_yzbm() != null)
			mVCYZBM.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_yzbm().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getCl_qtcjrxmjgzdw() != null)
			mCLQTCJRXMJGZDW.setText(mCopperSmeltingTemplateBean.getData().get(0).getCl_qtcjrxmjgzdw().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_hbdwmc() != null)
			mVCHBDWMC.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_hbdwmc().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_hbdwlx() != null)
			mVCHBDWLX.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_hbdwlx().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_hjjclx() != null)
			mVCHJJCLX.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_hjjclx().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfqrzj() != null)
			mVCSFQRZJ.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfqrzj().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfsqhb() != null)
			mVCSFSQHB.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfsqhb().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_city() != null)
			mVCCITY.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_city().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_county() != null)
			mVCCOUNTY.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_county().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_town() != null)
			mVCTOWN.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_town().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_xzc() != null)
			mVCXZC.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_xzc().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_gyyq() != null)
			mVCGYYQ.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_gyyq().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_pq() != null)
			mVCPQ.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_pq().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_qyzt() != null)
			mVCQYZT.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_qyzt().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_qycp() != null)
			mVCQYCP.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_qycp().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_ctcl() != null)
			mVCCTCL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_ctcl().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_jtcl() != null)
			mVCJTCL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_jtcl().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_lscl() != null)
			mVCLSCL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_lscl().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_qtcl() != null)
			mVCQTCL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_qtcl().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sczyyl() != null)
			mVCSCZYYL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sczyyl().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_tylgy() != null)
			mVCTYLGY.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_tylgy().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_qttylgy() != null)
			mVCQTTYLGY.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_qttylgy().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_ctjlgy() != null)
			mVCCTJLGY.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_ctjlgy().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_qtctjlgy() != null)
			mVCQTCTJLGY.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_qtctjlgy().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_lsscxscgy() != null)
			mVCLSSCXSCGY.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_lsscxscgy().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_zysczzjsb() != null)
			mVCZYSCZZJSB.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_zysczzjsb().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_cyjszcsfsyxzl() != null)
			mVCCYJSZCSFSYXZL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_cyjszcsfsyxzl().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_cyjszcsfsyttl() != null)
			mVCCYJSZCSFSYTTL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_cyjszcsfsyttl().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getDt_xmsj_tima() != null)
			mDTXMSJTIMA.setText(mCopperSmeltingTemplateBean.getData().get(0).getDt_xmsj_tima().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getDt_pzlx_time() != null)
			mDTPZLXTIME.setText(mCopperSmeltingTemplateBean.getData().get(0).getDt_pzlx_time().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_pzlxdw() != null)
			mVCPZLXDW.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_pzlxdw().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_lxpfwh() != null)
			mVCLXPFWH.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_lxpfwh().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_bzhjyxpjbg() != null)
			mVCBZHJYXPJBG.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_bzhjyxpjbg().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_hpbzdw() != null)
			mVCHPBZDW.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_hpbzdw().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getDt_bz_time() != null)
			mDTBZTIME.setText(mCopperSmeltingTemplateBean.getData().get(0).getDt_bz_time().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfjddjbz() != null)
			mVCSFJDDJBZ.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfjddjbz().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_hpspdw() != null)
			mVCHPSPDW.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_hpspdw().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getDt_hpsp_time() != null)
			mDTHPSPTIME.setText(mCopperSmeltingTemplateBean.getData().get(0).getDt_hpsp_time().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_hpspwh() != null)
			mVCHPSPWH.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_hpspwh().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfczyjspqk() != null)
			mVCSFCZYJSPQK.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfczyjspqk().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_scyfcl() != null)
			mVCSCYFCL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_scyfcl().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_zfcpjclfbw() != null)
			mVCZFCPJCLFBW.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_zfcpjclfbw().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_gxmcsdsfyhjyxpjwjyz() != null)
			mVCGXMCSDSFYHJYXPJWJYZ.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_gxmcsdsfyhjyxpjwjyz().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_bfdy() != null)
			mVCBFDY.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_bfdy().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_bzhpbgssfsycyzcttfw() != null)
			mVCBZHPBGSSFSYCYZCTTFW.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_bzhpbgssfsycyzcttfw().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_mqsfsycyzcttfw() != null)
			mVCMQSFSYCYZCTTFW.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_mqsfsycyzcttfw().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getDt_trssc_time() != null)
			mDTTRSSCTIME.setText(mCopperSmeltingTemplateBean.getData().get(0).getDt_trssc_time().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_ljscjgy() != null)
			mVCLJSCJGY.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_ljscjgy().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfpftyssc() != null)
			mVCSFPFTYSSC.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfpftyssc().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_hbsscspdw() != null)
			mVCHBSSCSPDW.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_hbsscspdw().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getDt_hbsscsp_time() != null)
			mDTHBSSCSPTIME.setText(mCopperSmeltingTemplateBean.getData().get(0).getDt_hbsscsp_time().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_hbsscspwh() != null)
			mVCHBSSCSPWH.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_hbsscspwh().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sftghbjgys() != null)
			mVCSFTGHBJGYS.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sftghbjgys().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_hbjgysspdw() != null)
			mVCHBJGYSSPDW.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_hbjgysspdw().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getDt_hbjgyssp_time() != null)
			mDTHBJGYSSPTIME.setText(mCopperSmeltingTemplateBean.getData().get(0).getDt_hbjgyssp_time().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_hbjgysspwh() != null)
			mVCHBJGYSSPWH.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_hbjgysspwh().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfjxgjghkj() != null)
			mVCSFJXGJGHKJ.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfjxgjghkj().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getCl_jgkjhpjstszdzxqk() != null)
			mCLJGKJHPJSTSZDZXQK.setText(mCopperSmeltingTemplateBean.getData().get(0).getCl_jgkjhpjstszdzxqk().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfyfqdpwxkz() != null)
			mVCSFYFQDPWXKZ.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfyfqdpwxkz().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfazpwxkzdgdpfwrw() != null)
			mVCSFAZPWXKZDGDPFWRW.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfazpwxkzdgdpfwrw().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfxhjbhbmjxpwsbdj() != null)
			mVCSFXHJBHBMJXPWSBDJ.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfxhjbhbmjxpwsbdj().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfjszejnpwf() != null)
			mVCSFJSZEJNPWF.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfjszejnpwf().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_synsjjnpwf() != null)
			mVCSYNSJJNPWF.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_synsjjnpwf().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_yjpwf() != null)
			mVCYJPWF.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_yjpwf().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getCl_wzejnpwfyy() != null)
			mCLWZEJNPWFYY.setText(mCopperSmeltingTemplateBean.getData().get(0).getCl_wzejnpwfyy().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_gqyfsly() != null)
			mVCGQYFSLY.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_gqyfsly().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_fstzwrw() != null)
			mVCFSTZWRW.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_fstzwrw().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sjcsl() != null)
			mVCSJCSL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sjcsl().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_scfsclss() != null)
			mVCSCFSCLSS.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_scfsclss().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_cll() != null)
			mVCCLL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_cll().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sffhfsclyq() != null)
			mVCSFFHFSCLYQ.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sffhfsclyq().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_bfhqkms() != null)
			mVCBFHQKMS.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_bfhqkms().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfsxshfsyshscfsfl() != null)
			mVCSFSXSHFSYSHSCFSFL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfsxshfsyshscfsfl().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfczgbjgdfspffsxw() != null)
			mVCSFCZGBJGDFSPFFSXW.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfczgbjgdfspffsxw().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getCl_qksm() != null)
			mCLQKSM.setText(mCopperSmeltingTemplateBean.getData().get(0).getCl_qksm().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getCl_wxfwzyy() != null)
			mCLWXFWZYY.setText(mCopperSmeltingTemplateBean.getData().get(0).getCl_wxfwzyy().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_yicsl() != null)
			mVCYICSL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_yicsl().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_yiczcs() != null)
			mVCYICZCS.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_yiczcs().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_ercsl() != null)
			mVCERCSL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_ercsl().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_erczcs() != null)
			mVCERCZCS.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_erczcs().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sancsl() != null)
			mVCSANCSL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sancsl().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sanczcs() != null)
			mVCSANCZCS.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sanczcs().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sicsl() != null)
			mVCSICSL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sicsl().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_siczcs() != null)
			mVCSICZCS.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_siczcs().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_wucsl() != null)
			mVCWUCSL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_wucsl().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_wuczcs() != null)
			mVCWUCZCS.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_wuczcs().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_liucsl() != null)
			mVCLIUCSL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_liucsl().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_liuczcs() != null)
			mVCLIUCZCS.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_liuczcs().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_qt() != null)
			mVCQT.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_qt().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_qtcsl() != null)
			mVCQTCSL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_qtcsl().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_qtczcs() != null)
			mVCQTCZCS.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_qtczcs().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_wxfwtzsfjqgf() != null)
			mVCWXFWTZSFJQGF.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_wxfwtzsfjqgf().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sycsjczqksfxhbbmsb() != null)
			mVCSYCSJCZQKSFXHBBMSB.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sycsjczqksfxhbbmsb().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_wsbdynx() != null)
			mVCWSBDYNX.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_wsbdynx().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_wxfwcfkhcdsfsybs() != null)
			mVCWXFWCFKHCDSFSYBS.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_wxfwcfkhcdsfsybs().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sffhwxfwccgf() != null)
			mVCSFFHWXFWCCGF.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sffhwxfwccgf().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_zcnlscfscsjsfcgyn() != null)
			mVCZCNLSCFSCSJSFCGYN.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_zcnlscfscsjsfcgyn().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_zcwsfjsyyjxdczc() != null)
			mVCZCWSFJSYYJXDCZC.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_zcwsfjsyyjxdczc().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_rzyccsfzxwxfwzyldzd() != null)
			mVCRZYCCSFZXWXFWZYLDZD.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_rzyccsfzxwxfwzyldzd().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_ysclsfjyxgzz() != null)
			mVCYSCLSFJYXGZZ.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_ysclsfjyxgzz().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_ysl() != null)
			mVCYSL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_ysl().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_pc() != null)
			mVCPC.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_pc().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_jsdwsfjywfjyzz() != null)
			mVCJSDWSFJYWFJYZZ.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_jsdwsfjywfjyzz().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sjczfs() != null)
			mVCSJCZFS.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sjczfs().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_qtybgf() != null)
			mVCQTYBGF.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_qtybgf().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfjxgfcc() != null)
			mVCSFJXGFCC.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfjxgfcc().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_zhlycssffhhpyq() != null)
			mVCZHLYCSSFFHHPYQ.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_zhlycssffhhpyq().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_czfs() != null)
			mVCCZFS.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_czfs().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_fqcshj() != null)
			mVCFQCSHJ.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_fqcshj().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfptfqzlss() != null)
			mVCSFPTFQZLSS.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfptfqzlss().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_wptjsssmcw() != null)
			mVCWPTJSSSMCW.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_wptjsssmcw().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_jqjgjcsfcb() != null)
			mVCJQJGJCSFCB.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_jqjgjcsfcb().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_cbyzjjczw() != null)
			mVCCBYZJJCZW.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_cbyzjjczw().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_jcdw() != null)
			mVCJCDW.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_jcdw().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getDt_jc_time() != null)
			mDTJCTIME.setText(mCopperSmeltingTemplateBean.getData().get(0).getDt_jc_time().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_zxjczzsfaz() != null)
			mCOLUMN99.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_zxjczzsfaz().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getDt_zxaz_time() != null)
			mDTZXAZTIME.setText(mCopperSmeltingTemplateBean.getData().get(0).getDt_zxaz_time().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfxhbbmlw() != null)
			mVCSFXHBBMLW.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfxhbbmlw().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfyxzc() != null)
			mVCSFYXZC.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfyxzc().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfjgjy() != null)
			mVCSFJGJY.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfjgjy().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getDt_jy_time() != null)
			mDTJYTIME.setText(mCopperSmeltingTemplateBean.getData().get(0).getDt_jy_time().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_zxjcsjxsw() != null)
			mVCZXJCSJXSW.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_zxjcsjxsw().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfahpyqcqcs() != null)
			mVCSFAHPYQCQCS.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfahpyqcqcs().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_wptjsdssw() != null)
			mVCWPTJSDSSW.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_wptjsdssw().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_hpyqdwsfhjl() != null)
			mVCHPYQDWSFHJL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_hpyqdwsfhjl().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_jlnsfybhmb() != null)
			mVCJLNSFYBHMB.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_jlnsfybhmb().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getDt_bhmbjs_time() != null)
			mDTBHMBJSTIME.setText(mCopperSmeltingTemplateBean.getData().get(0).getDt_bhmbjs_time().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_qyzbhjbhqk() != null)
			mVCQYZBHJBHQK.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_qyzbhjbhqk().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sflshpjpfyqdfxffdccs() != null)
			mVCSFLSHPJPFYQDFXFFDCCS.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sflshpjpfyqdfxffdccs().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_cswlsqkms() != null)
			mVCCSWLSQKMS.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_cswlsqkms().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfbztfhjsjyjya() != null)
			mVCSFBZTFHJSJYJYA.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfbztfhjsjyjya().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfbztfhjsjyjyapgba() != null)
			mVCSFBZTFHJSJYJYAPGBA.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfbztfhjsjyjyapgba().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfayayqjxndyjyl() != null)
			mVCSFAYAYQJXNDYJYL.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfayayqjxndyjyl().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getVc_sfcbyjwz() != null)
			mVCSFCBYJWZ.setText(mCopperSmeltingTemplateBean.getData().get(0).getVc_sfcbyjwz().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getCl_qthbbmjcqk() != null)
			mCLQTHBBMJCQK.setText(mCopperSmeltingTemplateBean.getData().get(0).getCl_qthbbmjcqk().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getCl_czzywt() != null)
			mCLCZZYWT.setText(mCopperSmeltingTemplateBean.getData().get(0).getCl_czzywt().toString());

		if (mCopperSmeltingTemplateBean.getData().get(0).getCl_jcyq() != null)
			mCLJCYQ.setText(mCopperSmeltingTemplateBean.getData().get(0).getCl_jcyq().toString());

	}
}
