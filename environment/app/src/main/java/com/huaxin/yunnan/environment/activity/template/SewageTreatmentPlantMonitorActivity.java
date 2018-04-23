package com.huaxin.yunnan.environment.activity.template;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.Constant;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.bean.SewageTreatmentPlantMonitorBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_CR_INFO;

/**
 * 16、城镇污水处理厂现场监察记录页面
 */
public class SewageTreatmentPlantMonitorActivity extends BaseActicity implements View.OnClickListener, CallBack {

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
	private TextView mVCJCDDS;
	private TextView mVCJCDDX;
	private TextView mVCJCDDZ;
	private TextView mDTCONSTRUCTIONTIME;
	private TextView mDTRUNTIME;
	private TextView mVCSSJCLNL;
	private TextView mVCJSJCLNL;
	private TextView mVCSFFQJS;
	private TextView mVCPTWGSFYQBJC;
	private TextView mVCYXMS;
	private TextView mVCYYDW;
	private TextView mDTPZTIME;
	private TextView mVCPZDW;
	private TextView mVCHBLXPFWH;
	private TextView mDTHBSFBLHPSX;
	private TextView mVCHBKGJSTIME;
	private TextView mVCHBHJYXPJBGLX;
	private TextView mVCHBHPBZDW;
	private TextView mDTHBBZSJ;
	private TextView mVCHBHPSPBM;
	private TextView mDTHBHPSPTIME;
	private TextView mVCHBSCSYXDSPBM;
	private TextView mDTHBSCSPTIME;
	private TextView mVCHBSPWH;
	private TextView mVCHBSFTGHBJGYS;
	private TextView mDTHBYSTIME;
	private TextView mVCHBZZYSBM;
	private TextView mCL_HB_WYSQKSM;
	private TextView mVCKJSFZYZJXGGKJ;
	private TextView mDTKJGKJTIME;
	private TextView mVCKJPZLXBM;
	private TextView mVCKJLXPFWH;
	private TextView mVCKJSFBLHPSX;
	private TextView mVCKJHPSPBM;
	private TextView mDTKJHPSPTIME;
	private TextView mVCKJGKJSCSYXSPBM;
	private TextView mDTKJGKJYXSPTIME;
	private TextView mVCKJSPWH;
	private TextView mVCKJSFTGHBJGYS;
	private TextView mDTKJYSTIME;
	private TextView mVCKJZZYSBM;
	private TextView mCLKJWYSQKSM;
	private TextView mVCJSKCOD;
	private TextView mVCJSKNH;
	private TextView mVCJSKBOD;
	private TextView mVCJSKSS;
	private TextView mVCJSKZL;
	private TextView mVCJSKZD;
	private TextView mVCJSKFDCJ;
	private TextView mVCJSKZJSJS;
	private TextView mVCCSKCOD;
	private TextView mVCCSKNH;
	private TextView mVCCSKBOD;
	private TextView mVCCSKSS;
	private TextView mVCCSKZL;
	private TextView mVCCSKZD;
	private TextView mVCCSKFDCJ;
	private TextView mVCWSCLDWHDL;
	private TextView mVCHDLSFFHLJGX;
	private TextView mVCWSPFQX;
	private TextView mVCSFSJYYSYD;
	private TextView mVCSZJB;
	private TextView mVCSFSSAGGQSBDTPZPLP;
	private TextView mCLQKSM;
	private TextView mVCCSKSFGFHSZ;
	private TextView mCLQTQKSM;
	private TextView mVCZXJJBZ;
	private TextView mVCJQJCSFCB;
	private TextView mVCCBWRYZ;
	private TextView mVCCBBS;
	private TextView mVCJCDW;
	private TextView mDTJCTIME;
	private TextView mVCSFYXDSS;
	private TextView mVCXDFS;
	private TextView mVCGZJSFZCSY;
	private TextView mVCTNJSYQK;
	private TextView mVCTSWNNCSL;
	private TextView mVCNCZZL;
	private TextView mVCWNCZFS;
	private TextView mVCQTWNCZFS;
	private TextView mVCSFFHBZYQ;
	private TextView mVCDFYSCLFSSFFHHPJPFYQ;
	private TextView mVCBFHQKMS;
	private TextView mVCSFJYZZDDWJXWXFWJD;
	private TextView mVCJDDW;
	private TextView mVCWNWFCLFS;
	private TextView mVCSFFHHPJPFDXGYQ;
	private TextView mVCWNWFBFHQKMS;
	private TextView mVCWXFWTZSFJQGF;
	private TextView mVCSYCSJCZQKSFXHBBMSB;
	private TextView mVCSFZDLWXFWYWSGFFCSHYJFA;
	private TextView mVCWXFWCFKHCDSFSYBS;
	private TextView mVCSFFHWXFWCCGF;
	private TextView mVCSFCZWXFWYYBGFHD;
	private TextView mVCZCNYSCFDCSJSFCGYN;
	private TextView mVCRZNCCSFZXWXFWZYLDZD;
	private TextView mVCYSCLJYXGZZ;
	private TextView mVCYSL;
	private TextView mVCPC;
	private TextView mVCJSDWSFJYWFJYXKZ;
	private TextView mVCSJCZFS;
	private TextView mVCCQY;
	private TextView mVCQTCQY;
	private TextView mVCECZLDCCSJSSSFLS;
	private TextView mVCECWLSQKMS;
	private TextView mVCZSY;
	private TextView mVCQTZSY;
	private TextView mVCJZCSSFLS;
	private TextView mVCJZWLSQKMS;
	private TextView mVCZSJQJCSFDB;
	private TextView mVCZSJCDW;
	private TextView mDTZSJCTIME;
	private TextView mVCGCSFAHBBMYQAZLZXJCSB;
	private TextView mVCQYDDSZSFFHGJYQ;
	private TextView mVCJCSBSFJXLBDYS;
	private TextView mVCYXSFZC;
	private TextView mVCGZRYSFQDHBBSGPXDZGZS;
	private TextView mVCYWTZSFGF;
	private TextView mVCGCZKXTSFYXZC;
	private TextView mVCZKXTQXSJCCSFDDSEGY;
	private TextView mVCZKSJYZXSJSFYZ;
	private TextView mVCSFYHBBMLW;
	private TextView mVCZKYWTZSFGF;
	private TextView mVCSFLSHPJPFYQDFXFFDCCS;
	private TextView mVCHJFXWLSQKMS;
	private TextView mVCSFBZTFHJSJYJYA;
	private TextView mVCSFDTFHJSJYJYAJXPGBBA;
	private TextView mVCSFAYAYQJXNDYJYL;
	private TextView mVCSFCBYJWZ;
	private TextView mCLQTHBBMJCQK;
	private TextView mCLCZZYWT;
	private TextView mCLJCYQ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sewage_treatment_plant_monitor);
		initProgressDialog();
		Intent intent = getIntent();
		String t_task_list_id = intent.getStringExtra("t_task_list_id");
		initView();
		NetTool.templatePost(getApplicationContext(), t_task_list_id, URL_QUERY_CR_INFO, SewageTreatmentPlantMonitorBean.class, this, yNProgressDialog);
	}

	private void initView() {
		titleText = (TextView) findViewById(R.id.title_text);
		titleText.setText("城镇污水处理厂现场监察记录");
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
		mVCJCDDS = (TextView) findViewById(R.id.VC_JCDDS);
		mVCJCDDX = (TextView) findViewById(R.id.VC_JCDDX);
		mVCJCDDZ = (TextView) findViewById(R.id.VC_JCDDZ);
		mDTCONSTRUCTIONTIME = (TextView) findViewById(R.id.DT_CONSTRUCTION_TIME);
		mDTRUNTIME = (TextView) findViewById(R.id.DT_RUN_TIME);
		mVCSSJCLNL = (TextView) findViewById(R.id.VC_S_SJCLNL);
		mVCJSJCLNL = (TextView) findViewById(R.id.VC_J_SJCLNL);
		mVCSFFQJS = (TextView) findViewById(R.id.VC_SFFQJS);
		mVCPTWGSFYQBJC = (TextView) findViewById(R.id.VC_PTWGSFYQBJC);
		mVCYXMS = (TextView) findViewById(R.id.VC_YXMS);
		mVCYYDW = (TextView) findViewById(R.id.VC_YYDW);
		mDTPZTIME = (TextView) findViewById(R.id.DT_PZ_TIME);
		mVCPZDW = (TextView) findViewById(R.id.VC_PZDW);
		mVCHBLXPFWH = (TextView) findViewById(R.id.VC_HB_LXPFWH);
		mDTHBSFBLHPSX = (TextView) findViewById(R.id.DT_HB_SFBLHPSX);
		mVCHBKGJSTIME = (TextView) findViewById(R.id.VC_HB_KGJS_TIME);
		mVCHBHJYXPJBGLX = (TextView) findViewById(R.id.VC_HB_HJYXPJBGLX);
		mVCHBHPBZDW = (TextView) findViewById(R.id.VC_HB_HPBZDW);
		mDTHBBZSJ = (TextView) findViewById(R.id.DT_HB_BZSJ);
		mVCHBHPSPBM = (TextView) findViewById(R.id.VC_HB_HPSPBM);
		mDTHBHPSPTIME = (TextView) findViewById(R.id.DT_HB_HPSP_TIME);
		mVCHBSCSYXDSPBM = (TextView) findViewById(R.id.VC_HB_SCSYXDSPBM);
		mDTHBSCSPTIME = (TextView) findViewById(R.id.DT_HB_SCSP_TIME);
		mVCHBSPWH = (TextView) findViewById(R.id.VC_HB_SPWH);
		mVCHBSFTGHBJGYS = (TextView) findViewById(R.id.VC_HB_SFTGHBJGYS);
		mDTHBYSTIME = (TextView) findViewById(R.id.DT_HB_YS_TIME);
		mVCHBZZYSBM = (TextView) findViewById(R.id.VC_HB_ZZYSBM);
		mCL_HB_WYSQKSM = (TextView) findViewById(R.id.CL_HB_WYSQKSM);
		mVCKJSFZYZJXGGKJ = (TextView) findViewById(R.id.VC_KJ_SFZYZJXGGKJ);
		mDTKJGKJTIME = (TextView) findViewById(R.id.DT_KJ_GKJ_TIME);
		mVCKJPZLXBM = (TextView) findViewById(R.id.VC_KJ_PZLXBM);
		mVCKJLXPFWH = (TextView) findViewById(R.id.VC_KJ_LXPFWH);
		mVCKJSFBLHPSX = (TextView) findViewById(R.id.VC_KJ_SFBLHPSX);
		mVCKJHPSPBM = (TextView) findViewById(R.id.VC_KJ_HPSPBM);
		mDTKJHPSPTIME = (TextView) findViewById(R.id.DT_KJ_HPSP_TIME);
		mVCKJGKJSCSYXSPBM = (TextView) findViewById(R.id.VC_KJ_GKJSCSYXSPBM);
		mDTKJGKJYXSPTIME = (TextView) findViewById(R.id.DT_KJ_GKJYXSP_TIME);
		mVCKJSPWH = (TextView) findViewById(R.id.VC_KJ_SPWH);
		mVCKJSFTGHBJGYS = (TextView) findViewById(R.id.VC_KJ_SFTGHBJGYS);
		mDTKJYSTIME = (TextView) findViewById(R.id.DT_KJ_YS_TIME);
		mVCKJZZYSBM = (TextView) findViewById(R.id.VC_KJ_ZZYSBM);
		mCLKJWYSQKSM = (TextView) findViewById(R.id.CL_KJ_WYSQKSM);
		mVCJSKCOD = (TextView) findViewById(R.id.VC_JSKCOD);
		mVCJSKNH = (TextView) findViewById(R.id.VC_JSKNH);
		mVCJSKBOD = (TextView) findViewById(R.id.VC_JSKBOD);
		mVCJSKSS = (TextView) findViewById(R.id.VC_JSKSS);
		mVCJSKZL = (TextView) findViewById(R.id.VC_JSKZL);
		mVCJSKZD = (TextView) findViewById(R.id.VC_JSKZD);
		mVCJSKFDCJ = (TextView) findViewById(R.id.VC_JSKFDCJ);
		mVCJSKZJSJS = (TextView) findViewById(R.id.VC_JSKZJSJS);
		mVCCSKCOD = (TextView) findViewById(R.id.VC_CSKCOD);
		mVCCSKNH = (TextView) findViewById(R.id.VC_CSKNH);
		mVCCSKBOD = (TextView) findViewById(R.id.VC_CSKBOD);
		mVCCSKSS = (TextView) findViewById(R.id.VC_CSKSS);
		mVCCSKZL = (TextView) findViewById(R.id.VC_CSKZL);
		mVCCSKZD = (TextView) findViewById(R.id.VC_CSKZD);
		mVCCSKFDCJ = (TextView) findViewById(R.id.VC_CSKFDCJ);
		mVCWSCLDWHDL = (TextView) findViewById(R.id.VC_WSCLDWHDL);
		mVCHDLSFFHLJGX = (TextView) findViewById(R.id.VC_HDLSFFHLJGX);
		mVCWSPFQX = (TextView) findViewById(R.id.VC_WSPFQX);
		mVCSFSJYYSYD = (TextView) findViewById(R.id.VC_SFSJYYSYD);
		mVCSZJB = (TextView) findViewById(R.id.VC_SZJB);
		mVCSFSSAGGQSBDTPZPLP = (TextView) findViewById(R.id.VC_SFSSAGGQSBDTPZPLP);
		mCLQKSM = (TextView) findViewById(R.id.CL_QKSM);
		mVCCSKSFGFHSZ = (TextView) findViewById(R.id.VC_CSKSFGFHSZ);
		mCLQTQKSM = (TextView) findViewById(R.id.CL_QTQKSM);
		mVCZXJJBZ = (TextView) findViewById(R.id.VC_ZXJJBZ);
		mVCJQJCSFCB = (TextView) findViewById(R.id.VC_JQJCSFCB);
		mVCCBWRYZ = (TextView) findViewById(R.id.VC_CBWRYZ);
		mVCCBBS = (TextView) findViewById(R.id.VC_CBBS);
		mVCJCDW = (TextView) findViewById(R.id.VC_JCDW);
		mDTJCTIME = (TextView) findViewById(R.id.DT_JC_TIME);
		mVCSFYXDSS = (TextView) findViewById(R.id.VC_SFYXDSS);
		mVCXDFS = (TextView) findViewById(R.id.VC_XDFS);
		mVCGZJSFZCSY = (TextView) findViewById(R.id.VC_GZJSFZCSY);
		mVCTNJSYQK = (TextView) findViewById(R.id.VC_TNJSYQK);
		mVCTSWNNCSL = (TextView) findViewById(R.id.VC_TSWNNCSL);
		mVCNCZZL = (TextView) findViewById(R.id.VC_NCZZL);
		mVCWNCZFS = (TextView) findViewById(R.id.VC_WNCZFS);
		mVCQTWNCZFS = (TextView) findViewById(R.id.VC_QTWNCZFS);
		mVCSFFHBZYQ = (TextView) findViewById(R.id.VC_SFFHBZYQ);
		mVCDFYSCLFSSFFHHPJPFYQ = (TextView) findViewById(R.id.VC_DFYSCLFSSFFHHPJPFYQ);
		mVCBFHQKMS = (TextView) findViewById(R.id.VC_BFHQKMS);
		mVCSFJYZZDDWJXWXFWJD = (TextView) findViewById(R.id.VC_SFJYZZDDWJXWXFWJD);
		mVCJDDW = (TextView) findViewById(R.id.VC_JDDW);
		mVCWNWFCLFS = (TextView) findViewById(R.id.VC_WNWFCLFS);
		mVCSFFHHPJPFDXGYQ = (TextView) findViewById(R.id.VC_SFFHHPJPFDXGYQ);
		mVCWNWFBFHQKMS = (TextView) findViewById(R.id.VC_WNWF_BFHQKMS);
		mVCWXFWTZSFJQGF = (TextView) findViewById(R.id.VC_WXFWTZSFJQGF);
		mVCSYCSJCZQKSFXHBBMSB = (TextView) findViewById(R.id.VC_SYCSJCZQKSFXHBBMSB);
		mVCSFZDLWXFWYWSGFFCSHYJFA = (TextView) findViewById(R.id.VC_SFZDLWXFWYWSGFFCSHYJFA);
		mVCWXFWCFKHCDSFSYBS = (TextView) findViewById(R.id.VC_WXFWCFKHCDSFSYBS);
		mVCSFFHWXFWCCGF = (TextView) findViewById(R.id.VC_SFFHWXFWCCGF);
		mVCSFCZWXFWYYBGFHD = (TextView) findViewById(R.id.VC_SFCZWXFWYYBGFHD);
		mVCZCNYSCFDCSJSFCGYN = (TextView) findViewById(R.id.VC_ZCNYSCFDCSJSFCGYN);
		mVCRZNCCSFZXWXFWZYLDZD = (TextView) findViewById(R.id.VC_RZNCCSFZXWXFWZYLDZD);
		mVCYSCLJYXGZZ = (TextView) findViewById(R.id.VC_YSCLJYXGZZ);
		mVCYSL = (TextView) findViewById(R.id.VC_YSL);
		mVCPC = (TextView) findViewById(R.id.VC_PC);
		mVCJSDWSFJYWFJYXKZ = (TextView) findViewById(R.id.VC_JSDWSFJYWFJYXKZ);
		mVCSJCZFS = (TextView) findViewById(R.id.VC_SJCZFS);
		mVCCQY = (TextView) findViewById(R.id.VC_CQY);
		mVCQTCQY = (TextView) findViewById(R.id.VC_QTCQY);
		mVCECZLDCCSJSSSFLS = (TextView) findViewById(R.id.VC_ECZLDCCSJSSSFLS);
		mVCECWLSQKMS = (TextView) findViewById(R.id.VC_ECWLSQKMS);
		mVCZSY = (TextView) findViewById(R.id.VC_ZSY);
		mVCQTZSY = (TextView) findViewById(R.id.VC_QTZSY);
		mVCJZCSSFLS = (TextView) findViewById(R.id.VC_JZCSSFLS);
		mVCJZWLSQKMS = (TextView) findViewById(R.id.VC_JZWLSQKMS);
		mVCZSJQJCSFDB = (TextView) findViewById(R.id.VC_ZSJQJCSFDB);
		mVCZSJCDW = (TextView) findViewById(R.id.VC_ZS_JCDW);
		mDTZSJCTIME = (TextView) findViewById(R.id.DT_ZSJC_TIME);
		mVCGCSFAHBBMYQAZLZXJCSB = (TextView) findViewById(R.id.VC_GCSFAHBBMYQAZLZXJCSB);
		mVCQYDDSZSFFHGJYQ = (TextView) findViewById(R.id.VC_QYDDSZSFFHGJYQ);
		mVCJCSBSFJXLBDYS = (TextView) findViewById(R.id.VC_JCSBSFJXLBDYS);
		mVCYXSFZC = (TextView) findViewById(R.id.VC_YXSFZC);
		mVCGZRYSFQDHBBSGPXDZGZS = (TextView) findViewById(R.id.VC_GZRYSFQDHBBSGPXDZGZS);
		mVCYWTZSFGF = (TextView) findViewById(R.id.VC_YWTZSFGF);
		mVCGCZKXTSFYXZC = (TextView) findViewById(R.id.VC_GCZKXTSFYXZC);
		mVCZKXTQXSJCCSFDDSEGY = (TextView) findViewById(R.id.VC_ZKXTQXSJCCSFDDSEGY);
		mVCZKSJYZXSJSFYZ = (TextView) findViewById(R.id.VC_ZKSJYZXSJSFYZ);
		mVCSFYHBBMLW = (TextView) findViewById(R.id.VC_SFYHBBMLW);
		mVCZKYWTZSFGF = (TextView) findViewById(R.id.VC_ZK_YWTZSFGF);
		mVCSFLSHPJPFYQDFXFFDCCS = (TextView) findViewById(R.id.VC_SFLSHPJPFYQDFXFFDCCS);
		mVCHJFXWLSQKMS = (TextView) findViewById(R.id.VC_HJFX_WLSQKMS);
		mVCSFBZTFHJSJYJYA = (TextView) findViewById(R.id.VC_SFBZTFHJSJYJYA);
		mVCSFDTFHJSJYJYAJXPGBBA = (TextView) findViewById(R.id.VC_SFDTFHJSJYJYAJXPGBBA);
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
		SewageTreatmentPlantMonitorBean mSewageTreatmentPlantMonitorBean = (SewageTreatmentPlantMonitorBean) o;
		if (Constant.RESPONSE_SUCCESS.equals(mSewageTreatmentPlantMonitorBean.getSuccess())) {
			initData(mSewageTreatmentPlantMonitorBean);
		} else {
			LogUtils.e("请求失败，错误码：" + mSewageTreatmentPlantMonitorBean.getSuccess() + "错误信息：" + mSewageTreatmentPlantMonitorBean.getMsg());
		}
	}

	private void initData(SewageTreatmentPlantMonitorBean mSewageTreatmentPlantMonitorBean) {


		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_start_time() != null)
			mDTSTARTTIME.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_start_time().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_end_time() != null)
			mDTENDTIME.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_end_time().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_location() != null)
			mVCLOCATION.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_location().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jcr() != null)
			mVCJCR.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jcr().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_zfzh() != null)
			mVCZFZH.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_zfzh().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jlr() != null)
			mVCJLR.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jlr().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_bjcdwmc() != null)
			mVCBJCDWMC.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_bjcdwmc().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_zzjgdmzh() != null)
			mVCZZJGDMZH.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_zzjgdmzh().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_fddbr() != null)
			mVCFDDBR.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_fddbr().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_fddbrsfzh() != null)
			mVCFDDBRSFZH.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_fddbrsfzh().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_xcfzr() != null)
			mVCXCFZR.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_xcfzr().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_xcfzrsfzh() != null)
			mVCXCFZRSFZH.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_xcfzrsfzh().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getNb_age() != null)
			mNBAGE.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getNb_age().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_gzdw() != null)
			mVCGZDW.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_gzdw().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_duty() != null)
			mVCDUTY.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_duty().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_ybagx() != null)
			mVCYBAGX.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_ybagx().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_address() != null)
			mVCADDRESS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_address().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_telephone() != null)
			mVCTELEPHONE.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_telephone().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_yzbm() != null)
			mVCYZBM.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_yzbm().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getCl_qtcjrxmjgzdw() != null)
			mCLQTCJRXMJGZDW.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getCl_qtcjrxmjgzdw().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hbdwmc() != null)
			mVCHBDWMC.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hbdwmc().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hbdwlx() != null)
			mVCHBDWLX.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hbdwlx().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hjjclx() != null)
			mVCHJJCLX.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hjjclx().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfqrzj() != null)
			mVCSFQRZJ.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfqrzj().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfsqhb() != null)
			mVCSFSQHB.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfsqhb().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jcdds() != null)
			mVCJCDDS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jcdds().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jcddx() != null)
			mVCJCDDX.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jcddx().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jcddz() != null)
			mVCJCDDZ.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jcddz().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_construction_time() != null)
			mDTCONSTRUCTIONTIME.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_construction_time().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_run_time() != null)
			mDTRUNTIME.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_run_time().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_s_sjclnl() != null)
			mVCSSJCLNL.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_s_sjclnl().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_j_sjclnl() != null)
			mVCJSJCLNL.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_j_sjclnl().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sffqjs() != null)
			mVCSFFQJS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sffqjs().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_ptwgsfyqbjc() != null)
			mVCPTWGSFYQBJC.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_ptwgsfyqbjc().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_yxms() != null)
			mVCYXMS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_yxms().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_yydw() != null)
			mVCYYDW.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_yydw().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_pz_time() != null)
			mDTPZTIME.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_pz_time().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_pzdw() != null)
			mVCPZDW.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_pzdw().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hb_lxpfwh() != null)
			mVCHBLXPFWH.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hb_lxpfwh().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_hb_sfblhpsx() != null)
			mDTHBSFBLHPSX.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_hb_sfblhpsx().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hb_kgjs_time() != null)
			mVCHBKGJSTIME.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hb_kgjs_time().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hb_hjyxpjbglx() != null)
			mVCHBHJYXPJBGLX.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hb_hjyxpjbglx().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hb_hpbzdw() != null)
			mVCHBHPBZDW.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hb_hpbzdw().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_hb_bzsj() != null)
			mDTHBBZSJ.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_hb_bzsj().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hb_hpspbm() != null)
			mVCHBHPSPBM.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hb_hpspbm().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_hb_hpsp_time() != null)
			mDTHBHPSPTIME.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_hb_hpsp_time().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hb_scsyxdspbm() != null)
			mVCHBSCSYXDSPBM.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hb_scsyxdspbm().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_hb_scsp_time() != null)
			mDTHBSCSPTIME.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_hb_scsp_time().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hb_spwh() != null)
			mVCHBSPWH.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hb_spwh().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hb_sftghbjgys() != null)
			mVCHBSFTGHBJGYS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hb_sftghbjgys().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_hb_ys_time() != null)
			mDTHBYSTIME.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_hb_ys_time().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hb_zzysbm() != null)
			mVCHBZZYSBM.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hb_zzysbm().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getCl_hb_wysqksm() != null)
			mCL_HB_WYSQKSM.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getCl_hb_wysqksm().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_kj_sfzyzjxggkj() != null)
			mVCKJSFZYZJXGGKJ.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_kj_sfzyzjxggkj().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_kj_gkj_time() != null)
			mDTKJGKJTIME.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_kj_gkj_time().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_kj_pzlxbm() != null)
			mVCKJPZLXBM.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_kj_pzlxbm().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_kj_lxpfwh() != null)
			mVCKJLXPFWH.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_kj_lxpfwh().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_kj_sfblhpsx() != null)
			mVCKJSFBLHPSX.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_kj_sfblhpsx().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_kj_hpspbm() != null)
			mVCKJHPSPBM.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_kj_hpspbm().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_kj_hpsp_time() != null)
			mDTKJHPSPTIME.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_kj_hpsp_time().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_kj_gkjscsyxspbm() != null)
			mVCKJGKJSCSYXSPBM.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_kj_gkjscsyxspbm().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_kj_gkjyxsp_time() != null)
			mDTKJGKJYXSPTIME.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_kj_gkjyxsp_time().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_kj_spwh() != null)
			mVCKJSPWH.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_kj_spwh().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_kj_sftghbjgys() != null)
			mVCKJSFTGHBJGYS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_kj_sftghbjgys().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_kj_ys_time() != null)
			mDTKJYSTIME.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_kj_ys_time().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_kj_zzysbm() != null)
			mVCKJZZYSBM.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_kj_zzysbm().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getCl_kj_wysqksm() != null)
			mCLKJWYSQKSM.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getCl_kj_wysqksm().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jskcod() != null)
			mVCJSKCOD.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jskcod().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jsknh() != null)
			mVCJSKNH.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jsknh().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jskbod() != null)
			mVCJSKBOD.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jskbod().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jskss() != null)
			mVCJSKSS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jskss().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jskzl() != null)
			mVCJSKZL.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jskzl().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jskzd() != null)
			mVCJSKZD.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jskzd().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jskfdcj() != null)
			mVCJSKFDCJ.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jskfdcj().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jskzjsjs() != null)
			mVCJSKZJSJS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jskzjsjs().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_cskcod() != null)
			mVCCSKCOD.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_cskcod().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_csknh() != null)
			mVCCSKNH.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_csknh().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_cskbod() != null)
			mVCCSKBOD.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_cskbod().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_cskss() != null)
			mVCCSKSS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_cskss().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_cskzl() != null)
			mVCCSKZL.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_cskzl().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_cskzd() != null)
			mVCCSKZD.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_cskzd().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_cskfdcj() != null)
			mVCCSKFDCJ.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_cskfdcj().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_wscldwhdl() != null)
			mVCWSCLDWHDL.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_wscldwhdl().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hdlsffhljgx() != null)
			mVCHDLSFFHLJGX.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hdlsffhljgx().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_wspfqx() != null)
			mVCWSPFQX.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_wspfqx().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfsjyysyd() != null)
			mVCSFSJYYSYD.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfsjyysyd().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_szjb() != null)
			mVCSZJB.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_szjb().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfssaggqsbdtpzplp() != null)
			mVCSFSSAGGQSBDTPZPLP.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfssaggqsbdtpzplp().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getCl_qksm() != null)
			mCLQKSM.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getCl_qksm().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_csksfgfhsz() != null)
			mVCCSKSFGFHSZ.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_csksfgfhsz().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getCl_qtqksm() != null)
			mCLQTQKSM.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getCl_qtqksm().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_zxjjbz() != null)
			mVCZXJJBZ.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_zxjjbz().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jqjcsfcb() != null)
			mVCJQJCSFCB.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jqjcsfcb().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_cbwryz() != null)
			mVCCBWRYZ.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_cbwryz().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_cbbs() != null)
			mVCCBBS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_cbbs().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jcdw() != null)
			mVCJCDW.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jcdw().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_jc_time() != null)
			mDTJCTIME.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_jc_time().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfyxdss() != null)
			mVCSFYXDSS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfyxdss().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_xdfs() != null)
			mVCXDFS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_xdfs().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_gzjsfzcsy() != null)
			mVCGZJSFZCSY.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_gzjsfzcsy().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_tnjsyqk() != null)
			mVCTNJSYQK.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_tnjsyqk().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_tswnncsl() != null)
			mVCTSWNNCSL.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_tswnncsl().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_nczzl() != null)
			mVCNCZZL.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_nczzl().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_wnczfs() != null)
			mVCWNCZFS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_wnczfs().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_qtwnczfs() != null)
			mVCQTWNCZFS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_qtwnczfs().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sffhbzyq() != null)
			mVCSFFHBZYQ.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sffhbzyq().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_dfysclfssffhhpjpfyq() != null)
			mVCDFYSCLFSSFFHHPJPFYQ.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_dfysclfssffhhpjpfyq().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_bfhqkms() != null)
			mVCBFHQKMS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_bfhqkms().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfjyzzddwjxwxfwjd() != null)
			mVCSFJYZZDDWJXWXFWJD.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfjyzzddwjxwxfwjd().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jddw() != null)
			mVCJDDW.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jddw().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_wnwfclfs() != null)
			mVCWNWFCLFS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_wnwfclfs().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sffhhpjpfdxgyq() != null)
			mVCSFFHHPJPFDXGYQ.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sffhhpjpfdxgyq().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_wnwf_bfhqkms() != null)
			mVCWNWFBFHQKMS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_wnwf_bfhqkms().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_wxfwtzsfjqgf() != null)
			mVCWXFWTZSFJQGF.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_wxfwtzsfjqgf().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sycsjczqksfxhbbmsb() != null)
			mVCSYCSJCZQKSFXHBBMSB.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sycsjczqksfxhbbmsb().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfzdlwxfwywsgffcshyjfa() != null)
			mVCSFZDLWXFWYWSGFFCSHYJFA.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfzdlwxfwywsgffcshyjfa().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_wxfwcfkhcdsfsybs() != null)
			mVCWXFWCFKHCDSFSYBS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_wxfwcfkhcdsfsybs().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sffhwxfwccgf() != null)
			mVCSFFHWXFWCCGF.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sffhwxfwccgf().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfczwxfwyybgfhd() != null)
			mVCSFCZWXFWYYBGFHD.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfczwxfwyybgfhd().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_zcnyscfdcsjsfcgyn() != null)
			mVCZCNYSCFDCSJSFCGYN.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_zcnyscfdcsjsfcgyn().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_rznccsfzxwxfwzyldzd() != null)
			mVCRZNCCSFZXWXFWZYLDZD.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_rznccsfzxwxfwzyldzd().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_yscljyxgzz() != null)
			mVCYSCLJYXGZZ.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_yscljyxgzz().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_ysl() != null)
			mVCYSL.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_ysl().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_pc() != null)
			mVCPC.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_pc().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jsdwsfjywfjyxkz() != null)
			mVCJSDWSFJYWFJYXKZ.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jsdwsfjywfjyxkz().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sjczfs() != null)
			mVCSJCZFS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sjczfs().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_cqy() != null)
			mVCCQY.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_cqy().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_qtcqy() != null)
			mVCQTCQY.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_qtcqy().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_eczldccsjsssfls() != null)
			mVCECZLDCCSJSSSFLS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_eczldccsjsssfls().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_ecwlsqkms() != null)
			mVCECWLSQKMS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_ecwlsqkms().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_zsy() != null)
			mVCZSY.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_zsy().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_qtzsy() != null)
			mVCQTZSY.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_qtzsy().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jzcssfls() != null)
			mVCJZCSSFLS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jzcssfls().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jzwlsqkms() != null)
			mVCJZWLSQKMS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jzwlsqkms().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_zsjqjcsfdb() != null)
			mVCZSJQJCSFDB.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_zsjqjcsfdb().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_zs_jcdw() != null)
			mVCZSJCDW.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_zs_jcdw().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_zsjc_time() != null)
			mDTZSJCTIME.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getDt_zsjc_time().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_gcsfahbbmyqazlzxjcsb() != null)
			mVCGCSFAHBBMYQAZLZXJCSB.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_gcsfahbbmyqazlzxjcsb().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_qyddszsffhgjyq() != null)
			mVCQYDDSZSFFHGJYQ.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_qyddszsffhgjyq().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jcsbsfjxlbdys() != null)
			mVCJCSBSFJXLBDYS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jcsbsfjxlbdys().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jcsbsfjxlbdys() != null)
			mVCYXSFZC.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_jcsbsfjxlbdys().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_gzrysfqdhbbsgpxdzgzs() != null)
			mVCGZRYSFQDHBBSGPXDZGZS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_gzrysfqdhbbsgpxdzgzs().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_ywtzsfgf() != null)
			mVCYWTZSFGF.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_ywtzsfgf().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_gczkxtsfyxzc() != null)
			mVCGCZKXTSFYXZC.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_gczkxtsfyxzc().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_zkxtqxsjccsfddsegy() != null)
			mVCZKXTQXSJCCSFDDSEGY.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_zkxtqxsjccsfddsegy().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_zksjyzxsjsfyz() != null)
			mVCZKSJYZXSJSFYZ.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_zksjyzxsjsfyz().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfyhbbmlw() != null)
			mVCSFYHBBMLW.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfyhbbmlw().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_zk_ywtzsfgf() != null)
			mVCZKYWTZSFGF.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_zk_ywtzsfgf().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sflshpjpfyqdfxffdccs() != null)
			mVCSFLSHPJPFYQDFXFFDCCS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sflshpjpfyqdfxffdccs().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hjfx_wlsqkms() != null)
			mVCHJFXWLSQKMS.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_hjfx_wlsqkms().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfbztfhjsjyjya() != null)
			mVCSFBZTFHJSJYJYA.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfbztfhjsjyjya().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfdtfhjsjyjyajxpgbba() != null)
			mVCSFDTFHJSJYJYAJXPGBBA.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfdtfhjsjyjyajxpgbba().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfayayqjxndyjyl() != null)
			mVCSFAYAYQJXNDYJYL.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfayayqjxndyjyl().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfcbyjwz() != null)
			mVCSFCBYJWZ.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getVc_sfcbyjwz().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getCl_qthbbmjcqk() != null)
			mCLQTHBBMJCQK.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getCl_qthbbmjcqk().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getCl_czzywt() != null)
			mCLCZZYWT.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getCl_czzywt().toString());

		if (mSewageTreatmentPlantMonitorBean.getData().get(0).getCl_jcyq() != null)
			mCLJCYQ.setText(mSewageTreatmentPlantMonitorBean.getData().get(0).getCl_jcyq().toString());
	}
}
