package com.huaxin.yunnan.environment.activity.template;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.Constant;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.bean.WaterElectricityTemplateBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_HC_INFO;

/**
 * 8、水电行业环境监察记录页面
 */
public class WaterElectricityTemplateActivity extends BaseActicity implements View.OnClickListener, CallBack {

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
	private TextView mVCCZJYINFO;
	private TextView mCHCZJYCH;
	private TextView mCHHLDDSZX;
	private TextView mCHHLDDGZ;
	private TextView mVCSDZDJ;
	private TextView mVCSDZEJDJ;
	private TextView mVCXYFDZTS;
	private TextView mVCDTZJRL;
	private TextView mVCZZJRL;
	private TextView mCHFDFS;
	private TextView mVCQTFDFS;
	private TextView mVCHPJZTS;
	private TextView mVCSBMC;
	private TextView mVCSBXH;
	private TextView mVCXMJSNRSFYPFYZ;
	private TextView mVCXMJSNRSFYPFYZBYZDS;
	private TextView mDTXMCSSJ;
	private TextView mDTPZLXSJ;
	private TextView mDTPZLXDW;
	private TextView mDTLXPFWH;
	private TextView mVCHPSFBL;
	private TextView mVCBZHPYXPJBG;
	private TextView mVCHPBZDW;
	private TextView mCHBZSJ;
	private TextView mCHSFSYTTFW;
	private TextView mVCHBSSCSPDW;
	private TextView mDTHBSSCSPSJ;
	private TextView mCHHBSSCSPWH;
	private TextView mCHHBJGYSSJ;
	private TextView mVCZZYSBM;
	private TextView mDTSFJXJG;
	private TextView mVCJGCS;
	private TextView mCHNEWJGSJ;
	private TextView mCHPZLXBM;
	private TextView mVCGKJLXPFWH;
	private TextView mDTGKJHPSFBL;
	private TextView mVCWPSPDW;
	private TextView mCHSPSJ;
	private TextView mVCSPDW;
	private TextView mDTYSSJ;
	private TextView mVCSPWH;
	private TextView mCHHBZGYSSJ;
	private TextView mVCHBZGZZYSBM;
	private TextView mCHSFSYZCTTFW;
	private TextView mVCSFSYCYZCTTFW;
	private TextView mCHSFJNPWF;
	private TextView mVCJFKSYF;
	private TextView mVCJFJSYF;
	private TextView mVCGJPWF;
	private TextView mCHYXQJSFAGDJNPWF;
	private TextView mVCJFKSYFJ;
	private TextView mVCJFJSYFJ;
	private TextView mVCGJNPWFY;
	private TextView mVCZXQTHJFLZDDQK;
	private TextView mVCSGQJXFSCLGY;
	private TextView mVCCLL;
	private TextView mCHSFYHPYZ;
	private TextView mVCBYZDS;
	private TextView mCHHPJXFSCLFS;
	private TextView mCHSJJXFSCLFS;
	private TextView mVCJCSCLSSYXQK;
	private TextView mVCHYFSCLGY;
	private TextView mVCCLL2;
	private TextView mCHSFYHPYZ2;
	private TextView mVCBYZDS2;
	private TextView mCHHPJXFSCLFS2;
	private TextView mCHSJJXFSCLFS2;
	private TextView mVCJCSCLSSYXQK2;
	private TextView mCHJCQJ;
	private TextView mCHFSJCSFCB;
	private TextView mVCFSJCSFCB;
	private TextView mVCJCDW;
	private TextView mDTJCSJ;
	private TextView mVCSSLFSCLGY;
	private TextView mVCCLL3;
	private TextView mCHSFYHPYZ3;
	private TextView mVCBYZDS3;
	private TextView mCHHPJXFSCLFS3;
	private TextView mCHSJJXFSCLFS3;
	private TextView mVCJCSCLSSYXQK3;
	private TextView mVCHNTFSCLGY;
	private TextView mVCCLL4;
	private TextView mCHSFYHPYZ4;
	private TextView mVCBYZDS4;
	private TextView mCHHPJXFSCLFS4;
	private TextView mCHSJJXFSCLFS4;
	private TextView mVCJCSCLSSYXQK4;
	private TextView mCHJQJCSFCB;
	private TextView mVCCBD;
	private TextView mVCFSJCSFCB2;
	private TextView mVCJCDW2;
	private TextView mDTJCSJ2;
	private TextView mVCSGQSHFSCLGY;
	private TextView mVCCLL5;
	private TextView mCHSFYHPYZ5;
	private TextView mVCBYZDS5;
	private TextView mCHHPJXFSCLFS5;
	private TextView mCHSJJXFSCLFS5;
	private TextView mVCJCSCLSSYXQK5;
	private TextView mVCYXQSHFSCLGY;
	private TextView mVCCLL6;
	private TextView mCHSFYHPYZ6;
	private TextView mVCBYZDS6;
	private TextView mCHHPJXFSCLFS6;
	private TextView mCHSJJXFSCLFS6;
	private TextView mVCJCSCLSSYXQK6;
	private TextView mCHJQJCSFCB2;
	private TextView mVCCBD2;
	private TextView mVCFSJCSFCB3;
	private TextView mVCJCDW3;
	private TextView mDTJCSJ3;
	private TextView mCHHPSFJYCQNJYWFLXT;
	private TextView mCHSFJCYWFLXT;
	private TextView mCHFYZCLSFFHHPJPFYQ;
	private TextView mVCBYZDS8;
	private TextView mCHSGQSFFCYHPYZ;
	private TextView mVCBYZDS9;
	private TextView mCHHNTJBCCSSSYHPYZ;
	private TextView mVCBYZDS10;
	private TextView mVCCCSSYXQK;
	private TextView mCHJQJCDX;
	private TextView mCHSFCB;
	private TextView mCHSGQSFZSYHPYZ3;
	private TextView mVCJCCBZ;
	private TextView mVCCBD4;
	private TextView mVCJCDW4;
	private TextView mDTJCSJ4;
	private TextView mVCBGMS;
	private TextView mVCHPJYDBHCS;
	private TextView mVCSJCQDBHCS;
	private TextView mVCSYHBHZLCS;
	private TextView mCHSFYHPYZ7;
	private TextView mVCXMCTSLCZGS2;
	private TextView mCHSLDDSFYBG2;
	private TextView mVCBGMS2;
	private TextView mVCHPJYDBHCS2;
	private TextView mVCSJCQDBHCS2;
	private TextView mVCCYHBHZLCS;
	private TextView mCHSFYHPYZ8;
	private TextView mVCXMQZZGS;
	private TextView mVCCYHBHZLCS2;
	private TextView mCHSLDDSFYBG1;
	private TextView mCHQZSPSFYHPYZ;
	private TextView mCHZCBHCS;
	private TextView mVCQTXCQDBHCS;
	private TextView mVCSJCQDSTBHCS;
	private TextView mCHDSSDWBHCSSFYHPYZ;
	private TextView mVCBYZDS11;
	private TextView mCHDLSDWBHCSSFYHPYZ;
	private TextView mVCBYZDS13;
	private TextView mCHDZWBHCSSFYHPYZ;
	private TextView mVCBYZDS14;
	private TextView mCHHPSFYQFS;
	private TextView mVCTSHDGLC;
	private TextView mVCHPXSTLL;
	private TextView mVCSXSTLL;
	private TextView mCHSFFHHPYQ;
	private TextView mCHSFYQANYQ;
	private TextView mINSTANCEID;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_water_electricity_template);
		initProgressDialog();
		Intent intent = getIntent();
		String t_task_list_id = intent.getStringExtra("t_task_list_id");
		initView();
		NetTool.templatePost(getApplicationContext(), t_task_list_id, URL_QUERY_HC_INFO, WaterElectricityTemplateBean.class, this, yNProgressDialog);
	}

	private void initView() {
		titleText = (TextView) findViewById(R.id.title_text);
		titleText.setText("水电行业环境监察记录页面");
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
		mVCCZJYINFO = (TextView) findViewById(R.id.VC_CZJYINFO);
		mCHCZJYCH = (TextView) findViewById(R.id.CH_CZJYCH);
		mCHHLDDSZX = (TextView) findViewById(R.id.CH_HLDDSZX);
		mCHHLDDGZ = (TextView) findViewById(R.id.CH_HLDDGZ);
		mVCSDZDJ = (TextView) findViewById(R.id.VC_SDZDJ);
		mVCSDZEJDJ = (TextView) findViewById(R.id.VC_SDZEJDJ);
		mVCXYFDZTS = (TextView) findViewById(R.id.VC_XYFDZTS);
		mVCDTZJRL = (TextView) findViewById(R.id.VC_DTZJRL);
		mVCZZJRL = (TextView) findViewById(R.id.VC_ZZJRL);
		mCHFDFS = (TextView) findViewById(R.id.CH_FDFS);
		mVCQTFDFS = (TextView) findViewById(R.id.VC_QTFDFS);
		mVCHPJZTS = (TextView) findViewById(R.id.VC_HPJZTS);
		mVCSBMC = (TextView) findViewById(R.id.VC_SBMC);
		mVCSBXH = (TextView) findViewById(R.id.VC_SBXH);
		mVCXMJSNRSFYPFYZ = (TextView) findViewById(R.id.VC_XMJSNRSFYPFYZ);
		mVCXMJSNRSFYPFYZBYZDS = (TextView) findViewById(R.id.VC_XMJSNRSFYPFYZ_BYZDS);
		mDTXMCSSJ = (TextView) findViewById(R.id.DT_XMCSSJ);
		mDTPZLXSJ = (TextView) findViewById(R.id.DT_PZLXSJ);
		mDTPZLXDW = (TextView) findViewById(R.id.DT_PZLXDW);
		mDTLXPFWH = (TextView) findViewById(R.id.DT_LXPFWH);
		mVCHPSFBL = (TextView) findViewById(R.id.VC_HPSFBL);
		mVCBZHPYXPJBG = (TextView) findViewById(R.id.VC_BZHPYXPJBG);
		mVCHPBZDW = (TextView) findViewById(R.id.VC_HPBZDW);
		mCHBZSJ = (TextView) findViewById(R.id.CH_BZSJ);
		mCHSFSYTTFW = (TextView) findViewById(R.id.CH_SFSYTTFW);
		mVCHBSSCSPDW = (TextView) findViewById(R.id.VC_HBSSCSPDW);
		mDTHBSSCSPSJ = (TextView) findViewById(R.id.DT_HBSSCSPSJ);
		mCHHBSSCSPWH = (TextView) findViewById(R.id.CH_HBSSCSPWH);
		mCHHBJGYSSJ = (TextView) findViewById(R.id.CH_HBJGYSSJ);
		mVCZZYSBM = (TextView) findViewById(R.id.VC_ZZYSBM);
		mDTSFJXJG = (TextView) findViewById(R.id.DT_SFJXJG);
		mVCJGCS = (TextView) findViewById(R.id.VC_JGCS);
		mCHNEWJGSJ = (TextView) findViewById(R.id.CH_NEWJGSJ);
		mCHPZLXBM = (TextView) findViewById(R.id.CH_PZLXBM);
		mVCGKJLXPFWH = (TextView) findViewById(R.id.VC_GKJ_LXPFWH);
		mDTGKJHPSFBL = (TextView) findViewById(R.id.DT_GKJ_HPSFBL);
		mVCWPSPDW = (TextView) findViewById(R.id.VC_WPSPDW);
		mCHSPSJ = (TextView) findViewById(R.id.CH_SPSJ);
		mVCSPDW = (TextView) findViewById(R.id.VC_SPDW);
		mDTYSSJ = (TextView) findViewById(R.id.DT_YSSJ);
		mVCSPWH = (TextView) findViewById(R.id.VC_SPWH);
		mCHHBZGYSSJ = (TextView) findViewById(R.id.CH_HBZGYSSJ);
		mVCHBZGZZYSBM = (TextView) findViewById(R.id.VC_HBZG_ZZYSBM);
		mCHSFSYZCTTFW = (TextView) findViewById(R.id.CH_SFSYZCTTFW);
		mVCSFSYCYZCTTFW = (TextView) findViewById(R.id.VC_SFSYCYZCTTFW);
		mCHSFJNPWF = (TextView) findViewById(R.id.CH_SFJNPWF);
		mVCJFKSYF = (TextView) findViewById(R.id.VC_JFKSYF);
		mVCJFJSYF = (TextView) findViewById(R.id.VC_JFJSYF);
		mVCGJPWF = (TextView) findViewById(R.id.VC_GJPWF);
		mCHYXQJSFAGDJNPWF = (TextView) findViewById(R.id.CH_YXQJSFAGDJNPWF);
		mVCJFKSYFJ = (TextView) findViewById(R.id.VC_JFKSYFJ);
		mVCJFJSYFJ = (TextView) findViewById(R.id.VC_JFJSYFJ);
		mVCGJNPWFY = (TextView) findViewById(R.id.VC_GJNPWFY);
		mVCZXQTHJFLZDDQK = (TextView) findViewById(R.id.VC_ZXQTHJFLZDDQK);
		mVCSGQJXFSCLGY = (TextView) findViewById(R.id.VC_SGQJXFSCLGY);
		mVCCLL = (TextView) findViewById(R.id.VC_CLL);
		mCHSFYHPYZ = (TextView) findViewById(R.id.CH_SFYHPYZ);
		mVCBYZDS = (TextView) findViewById(R.id.VC_BYZDS);
		mCHHPJXFSCLFS = (TextView) findViewById(R.id.CH_HPJXFSCLFS);
		mCHSJJXFSCLFS = (TextView) findViewById(R.id.CH_SJJXFSCLFS);
		mVCJCSCLSSYXQK = (TextView) findViewById(R.id.VC_JCSCLSSYXQK);
		mVCHYFSCLGY = (TextView) findViewById(R.id.VC_HYFSCLGY);
		mVCCLL2 = (TextView) findViewById(R.id.VC_CLL2);
		mCHSFYHPYZ2 = (TextView) findViewById(R.id.CH_SFYHPYZ2);
		mVCBYZDS2 = (TextView) findViewById(R.id.VC_BYZDS2);
		mCHHPJXFSCLFS2 = (TextView) findViewById(R.id.CH_HPJXFSCLFS2);
		mCHSJJXFSCLFS2 = (TextView) findViewById(R.id.CH_SJJXFSCLFS2);
		mVCJCSCLSSYXQK2 = (TextView) findViewById(R.id.VC_JCSCLSSYXQK2);
		mCHJCQJ = (TextView) findViewById(R.id.CH_JCQJ);
		mCHFSJCSFCB = (TextView) findViewById(R.id.CH_FSJCSFCB);
		mVCFSJCSFCB = (TextView) findViewById(R.id.VC_FSJCSFCB);
		mVCJCDW = (TextView) findViewById(R.id.VC_JCDW);
		mDTJCSJ = (TextView) findViewById(R.id.DT_JCSJ);
		mVCSSLFSCLGY = (TextView) findViewById(R.id.VC_SSLFSCLGY);
		mVCCLL3 = (TextView) findViewById(R.id.VC_CLL3);
		mCHSFYHPYZ3 = (TextView) findViewById(R.id.CH_SFYHPYZ3);
		mVCBYZDS3 = (TextView) findViewById(R.id.VC_BYZDS3);
		mCHHPJXFSCLFS3 = (TextView) findViewById(R.id.CH_HPJXFSCLFS3);
		mCHSJJXFSCLFS3 = (TextView) findViewById(R.id.CH_SJJXFSCLFS3);
		mVCJCSCLSSYXQK3 = (TextView) findViewById(R.id.VC_JCSCLSSYXQK3);
		mVCHNTFSCLGY = (TextView) findViewById(R.id.VC_HNTFSCLGY);
		mVCCLL4 = (TextView) findViewById(R.id.VC_CLL4);
		mCHSFYHPYZ4 = (TextView) findViewById(R.id.CH_SFYHPYZ4);
		mVCBYZDS4 = (TextView) findViewById(R.id.VC_BYZDS4);
		mCHHPJXFSCLFS4 = (TextView) findViewById(R.id.CH_HPJXFSCLFS4);
		mCHSJJXFSCLFS4 = (TextView) findViewById(R.id.CH_SJJXFSCLFS4);
		mVCJCSCLSSYXQK4 = (TextView) findViewById(R.id.VC_JCSCLSSYXQK4);
		mCHJQJCSFCB = (TextView) findViewById(R.id.CH_JQJCSFCB);
		mVCCBD = (TextView) findViewById(R.id.VC_CBD);
		mVCFSJCSFCB2 = (TextView) findViewById(R.id.VC_FSJCSFCB2);
		mVCJCDW2 = (TextView) findViewById(R.id.VC_JCDW2);
		mDTJCSJ2 = (TextView) findViewById(R.id.DT_JCSJ2);
		mVCSGQSHFSCLGY = (TextView) findViewById(R.id.VC_SGQSHFSCLGY);
		mVCCLL5 = (TextView) findViewById(R.id.VC_CLL5);
		mCHSFYHPYZ5 = (TextView) findViewById(R.id.CH_SFYHPYZ5);
		mVCBYZDS5 = (TextView) findViewById(R.id.VC_BYZDS5);
		mCHHPJXFSCLFS5 = (TextView) findViewById(R.id.CH_HPJXFSCLFS5);
		mCHSJJXFSCLFS5 = (TextView) findViewById(R.id.CH_SJJXFSCLFS5);
		mVCJCSCLSSYXQK5 = (TextView) findViewById(R.id.VC_JCSCLSSYXQK5);
		mVCYXQSHFSCLGY = (TextView) findViewById(R.id.VC_YXQSHFSCLGY);
		mVCCLL6 = (TextView) findViewById(R.id.VC_CLL6);
		mCHSFYHPYZ6 = (TextView) findViewById(R.id.CH_SFYHPYZ6);
		mVCBYZDS6 = (TextView) findViewById(R.id.VC_BYZDS6);
		mCHHPJXFSCLFS6 = (TextView) findViewById(R.id.CH_HPJXFSCLFS6);
		mCHSJJXFSCLFS6 = (TextView) findViewById(R.id.CH_SJJXFSCLFS6);
		mVCJCSCLSSYXQK6 = (TextView) findViewById(R.id.VC_JCSCLSSYXQK6);
		mCHJQJCSFCB2 = (TextView) findViewById(R.id.CH_JQJCSFCB2);
		mVCCBD2 = (TextView) findViewById(R.id.VC_CBD2);
		mVCFSJCSFCB3 = (TextView) findViewById(R.id.VC_FSJCSFCB3);
		mVCJCDW3 = (TextView) findViewById(R.id.VC_JCDW3);
		mDTJCSJ3 = (TextView) findViewById(R.id.DT_JCSJ3);
		mCHHPSFJYCQNJYWFLXT = (TextView) findViewById(R.id.CH_HPSFJYCQNJYWFLXT);
		mCHSFJCYWFLXT = (TextView) findViewById(R.id.CH_SFJCYWFLXT);
		mCHFYZCLSFFHHPJPFYQ = (TextView) findViewById(R.id.CH_FYZCLSFFHHPJPFYQ);
		mVCBYZDS8 = (TextView) findViewById(R.id.VC_BYZDS8);
		mCHSGQSFFCYHPYZ = (TextView) findViewById(R.id.CH_SGQSFFCYHPYZ);
		mVCBYZDS9 = (TextView) findViewById(R.id.VC_BYZDS9);
		mCHHNTJBCCSSSYHPYZ = (TextView) findViewById(R.id.CH_HNTJBCCSSSYHPYZ);
		mVCBYZDS10 = (TextView) findViewById(R.id.VC_BYZDS10);
		mVCCCSSYXQK = (TextView) findViewById(R.id.VC_CCSSYXQK);
		mCHJQJCDX = (TextView) findViewById(R.id.CH_JQJCDX);
		mCHSFCB = (TextView) findViewById(R.id.CH_SFCB);
		mCHSGQSFZSYHPYZ3 = (TextView) findViewById(R.id.CH_SGQSFZSYHPYZ3);
		mVCJCCBZ = (TextView) findViewById(R.id.VC_JCCBZ);
		mVCCBD4 = (TextView) findViewById(R.id.VC_CBD4);
		mVCJCDW4 = (TextView) findViewById(R.id.VC_JCDW4);
		mDTJCSJ4 = (TextView) findViewById(R.id.DT_JCSJ4);
		mVCBGMS = (TextView) findViewById(R.id.VC_BGMS);
		mVCHPJYDBHCS = (TextView) findViewById(R.id.VC_HPJYDBHCS);
		mVCSJCQDBHCS = (TextView) findViewById(R.id.VC_SJCQDBHCS);
		mVCSYHBHZLCS = (TextView) findViewById(R.id.VC_SYHBHZLCS);
		mCHSFYHPYZ7 = (TextView) findViewById(R.id.CH_SFYHPYZ7);
		mVCXMCTSLCZGS2 = (TextView) findViewById(R.id.VC_XMCTSLCZGS2);
		mCHSLDDSFYBG2 = (TextView) findViewById(R.id.CH_SLDDSFYBG2);
		mVCBGMS2 = (TextView) findViewById(R.id.VC_BGMS2);
		mVCHPJYDBHCS2 = (TextView) findViewById(R.id.VC_HPJYDBHCS2);
		mVCSJCQDBHCS2 = (TextView) findViewById(R.id.VC_SJCQDBHCS2);
		mVCCYHBHZLCS = (TextView) findViewById(R.id.VC_CYHBHZLCS);
		mCHSFYHPYZ8 = (TextView) findViewById(R.id.CH_SFYHPYZ8);
		mVCXMQZZGS = (TextView) findViewById(R.id.VC_XMQZZGS);
//		mVCCYHBHZLCS2 = (TextView) findViewById(R.id.VC_CYHBHZLCS2);
		mCHSLDDSFYBG1 = (TextView) findViewById(R.id.CH_SLDDSFYBG1);
		mCHQZSPSFYHPYZ = (TextView) findViewById(R.id.CH_QZSPSFYHPYZ);
		mCHZCBHCS = (TextView) findViewById(R.id.CH_ZCBHCS);
		mVCQTXCQDBHCS = (TextView) findViewById(R.id.VC_QTXCQDBHCS);
		mVCSJCQDSTBHCS = (TextView) findViewById(R.id.VC_SJCQDSTBHCS);
		mCHDSSDWBHCSSFYHPYZ = (TextView) findViewById(R.id.CH_DSSDWBHCSSFYHPYZ);
		mVCBYZDS11 = (TextView) findViewById(R.id.VC_BYZDS11);
		mCHDLSDWBHCSSFYHPYZ = (TextView) findViewById(R.id.CH_DLSDWBHCSSFYHPYZ);
		mVCBYZDS13 = (TextView) findViewById(R.id.VC_BYZDS13);
		mCHDZWBHCSSFYHPYZ = (TextView) findViewById(R.id.CH_DZWBHCSSFYHPYZ);
		mVCBYZDS14 = (TextView) findViewById(R.id.VC_BYZDS14);
		mCHHPSFYQFS = (TextView) findViewById(R.id.CH_HPSFYQFS);
		mVCTSHDGLC = (TextView) findViewById(R.id.VC_TSHDGLC);
		mVCHPXSTLL = (TextView) findViewById(R.id.VC_HPXSTLL);
		mVCSXSTLL = (TextView) findViewById(R.id.VC_SXSTLL);
		mCHSFFHHPYQ = (TextView) findViewById(R.id.CH_SFFHHPYQ);
		mCHSFYQANYQ = (TextView) findViewById(R.id.CH_SFYQANYQ);
		mINSTANCEID = (TextView) findViewById(R.id.INSTANCEID);
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
		WaterElectricityTemplateBean mWaterElectricityTemplateBean = (WaterElectricityTemplateBean) o;
		LogUtils.e("返回数据：" + mWaterElectricityTemplateBean.toString());
		if (Constant.RESPONSE_SUCCESS.equals(mWaterElectricityTemplateBean.getSuccess())) {
			initData(mWaterElectricityTemplateBean);
		} else {
			LogUtils.e("请求失败，错误码：" + mWaterElectricityTemplateBean.getSuccess() + "错误信息：" + mWaterElectricityTemplateBean.getMsg());
		}
	}

	private void initData(WaterElectricityTemplateBean mWaterElectricityTemplateBean) {
		if (mWaterElectricityTemplateBean.getData().get(0).getDt_begin_time()==null) {
			mDTBEGINTIME.setText("");
		} else {
			mDTBEGINTIME.setText(mWaterElectricityTemplateBean.getData().get(0).getDt_begin_time().toString());
		}
		if (mWaterElectricityTemplateBean.getData().get(0).getDt_end_time()==null) {
			mDTENDTIME.setText("");
		} else {
			mDTENDTIME.setText(mWaterElectricityTemplateBean.getData().get(0).getDt_end_time().toString());
		}
		if (mWaterElectricityTemplateBean.getData().get(0).getVc_place()==null) {
			mVCPLACE.setText("");
		} else {
			mVCPLACE.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_place().toString());
		}
		if (mWaterElectricityTemplateBean.getData().get(0).getVc_xaminer()==null) {
			mVCXAMINER.setText("");
		} else {
			mVCXAMINER.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_xaminer().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_law_number()==null) {
			mVCLAWNUMBER.setText("");
		} else {
			mVCLAWNUMBER.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_law_number().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_recorder()==null) {
			mVCRECORDER.setText("");
		} else {
			mVCRECORDER.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_recorder().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_sinspected_unit()==null) {
			mVCSINSPECTEDUNIT.setText("");
		} else {
			mVCSINSPECTEDUNIT.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_sinspected_unit().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_code_number()==null) {
			mVCCODENUMBER.setText("");
		} else {
			mVCCODENUMBER.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_code_number().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_legal_representative()==null) {
			mVCLEGALREPRESENTATIVE.setText("");
		} else {
			mVCLEGALREPRESENTATIVE.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_legal_representative().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_legal_id()==null) {
			mVCLEGALID.setText("");
		} else {
			mVCLEGALID.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_legal_id().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_site_supervisor()==null) {
			mVCSITESUPERVISOR.setText("");
		} else {
			mVCSITESUPERVISOR.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_site_supervisor().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_site_id()==null) {
			mVCSITEID.setText("");
		} else {
			mVCSITEID.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_site_id().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getNb_age()==null) {
			mDTAGE.setText("");
		} else {
			mDTAGE.setText(mWaterElectricityTemplateBean.getData().get(0).getNb_age().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_work_unit()==null) {
			mVCWORKUNIT.setText("");
		} else {
			mVCWORKUNIT.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_work_unit().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_post()==null) {
			mVCPOST.setText("");
		} else {
			mVCPOST.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_post().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_relationship()==null) {
			mVCRELATIONSHIP.setText("");
		} else {
			mVCRELATIONSHIP.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_relationship().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_address()==null) {
			mVCADDRESS.setText("");
		} else {
			mVCADDRESS.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_address().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_telephone()==null) {
			mVCTELEPHONE.setText("");
		} else {
			mVCTELEPHONE.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_telephone().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_postal_code()==null) {
			mVCPOSTALCODE.setText("");
		} else {
			mVCPOSTALCODE.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_postal_code().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_other_people()==null) {
			mVCOTHERPEOPLE.setText("");
		} else {
			mVCOTHERPEOPLE.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_other_people().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_unit_name()==null) {
			mVCUNITNAME.setText("");
		} else {
			mVCUNITNAME.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_unit_name().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_hbdwlx()==null) {
			mVCHBDWLX.setText("");
		} else {
			mVCHBDWLX.setText(mWaterElectricityTemplateBean.getData().get(0).getDt_begin_time().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_supervision_type()==null) {
			mCHSUPERVISIONTYPE.setText("");
		} else {
			mCHSUPERVISIONTYPE.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_supervision_type().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sfqrzj()==null) {
			mCHSFQRZJ.setText("");
		} else {
			mCHSFQRZJ.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sfqrzj().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sfsqhb()==null) {
			mCHSFSQHB.setText("");
		} else {
			mCHSFSQHB.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sfsqhb().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_szs()==null) {
			mVCSZS.setText("");
		} else {
			mVCSZS.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_szs().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_szx()==null) {
			mVCSZX.setText("");
		} else {
			mVCSZX.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_szx().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_szz()==null) {
			mVCSZZ.setText("");
		} else {
			mVCSZZ.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_szz().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_czjyinfo()==null) {
			mVCCZJYINFO.setText("");
		} else {
			mVCCZJYINFO.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_czjyinfo().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_czjych()==null) {
			mCHCZJYCH.setText("");
		} else {
			mCHCZJYCH.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_czjych().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_hlddszx()==null) {
			mCHHLDDSZX.setText("");
		} else {
			mCHHLDDSZX.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_hlddszx().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_hlddgz()==null) {
			mCHHLDDGZ.setText("");
		} else {
			mCHHLDDGZ.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_hlddgz().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_sdzdj()==null) {
			mVCSDZDJ.setText("");
		} else {
			mVCSDZDJ.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_sdzdj().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_sdzejdj()==null) {
			mVCSDZEJDJ.setText("");
		} else {
			mVCSDZEJDJ.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_sdzejdj().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_xyfdzts()==null) {
			mVCXYFDZTS.setText("");
		} else {
			mVCXYFDZTS.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_xyfdzts().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_dtzjrl()==null) {
			mVCDTZJRL.setText("");
		} else {
			mVCDTZJRL.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_dtzjrl().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_zzjrl()==null) {
			mVCZZJRL.setText("");
		} else {
			mVCZZJRL.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_zzjrl().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_fdfs()==null) {
			mCHFDFS.setText("");
		} else {
			mCHFDFS.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_fdfs().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_qtfdfs()==null) {
			mVCQTFDFS.setText("");
		} else {
			mVCQTFDFS.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_qtfdfs().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_hpjzts()==null) {
			mVCHPJZTS.setText("");
		} else {
			mVCHPJZTS.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_hpjzts().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_sbmc()==null) {
			mVCSBMC.setText("");
		} else {
			mVCSBMC.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_sbmc().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_sbxh()==null) {
			mVCSBXH.setText("");
		} else {
			mVCSBXH.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_sbxh().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_xmjsnrsfypfyz()==null) {
			mVCXMJSNRSFYPFYZ.setText("");
		} else {
			mVCXMJSNRSFYPFYZ.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_xmjsnrsfypfyz().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_xmjsnrsfypfyz_byzds()==null) {
			mVCXMJSNRSFYPFYZBYZDS.setText("");
		} else {
			mVCXMJSNRSFYPFYZBYZDS.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_xmjsnrsfypfyz_byzds().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getDt_xmcssj()==null) {
			mDTXMCSSJ.setText("");
		} else {
			mDTXMCSSJ.setText(mWaterElectricityTemplateBean.getData().get(0).getDt_xmcssj().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getDt_pzlxsj()==null) {
			mDTPZLXSJ.setText("");
		} else {
			mDTPZLXSJ.setText(mWaterElectricityTemplateBean.getData().get(0).getDt_pzlxsj().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getDt_pzlxdw()==null) {
			mDTPZLXDW.setText("");
		} else {
			mDTPZLXDW.setText(mWaterElectricityTemplateBean.getData().get(0).getDt_pzlxdw().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getDt_lxpfwh()==null) {
			mDTLXPFWH.setText("");
		} else {
			mDTLXPFWH.setText(mWaterElectricityTemplateBean.getData().get(0).getDt_lxpfwh().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_hpsfbl()==null) {
			mVCHPSFBL.setText("");
		} else {
			mVCHPSFBL.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_hpsfbl().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_bzhpyxpjbg()==null) {
			mVCBZHPYXPJBG.setText("");
		} else {
			mVCBZHPYXPJBG.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_bzhpyxpjbg().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_hpbzdw()==null) {
			mVCHPBZDW.setText("");
		} else {
			mVCHPBZDW.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_hpbzdw().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_bzsj()==null) {
			mCHBZSJ.setText("");
		} else {
			mCHBZSJ.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_bzsj().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sfsyttfw()==null) {
			mCHSFSYTTFW.setText("");
		} else {
			mCHSFSYTTFW.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sfsyttfw().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_hbsscspdw()==null) {
			mVCHBSSCSPDW.setText("");
		} else {
			mVCHBSSCSPDW.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_hbsscspdw().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getDt_hbsscspsj()==null) {
			mDTHBSSCSPSJ.setText("");
		} else {
			mDTHBSSCSPSJ.setText(mWaterElectricityTemplateBean.getData().get(0).getDt_hbsscspsj().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_hbsscspwh()==null) {
			mCHHBSSCSPWH.setText("");
		} else {
			mCHHBSSCSPWH.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_hbsscspwh().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_hbjgyssj()==null) {
			mCHHBJGYSSJ.setText("");
		} else {
			mCHHBJGYSSJ.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_hbjgyssj().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_zzysbm()==null) {
			mVCZZYSBM.setText("");
		} else {
			mVCZZYSBM.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_zzysbm().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getDt_sfjxjg()==null) {
			mDTSFJXJG.setText("");
		} else {
			mDTSFJXJG.setText(mWaterElectricityTemplateBean.getData().get(0).getDt_sfjxjg().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_jgcs()==null) {
			mVCJGCS.setText("");
		} else {
			mVCJGCS.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_jgcs().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_newjgsj()==null) {
			mCHNEWJGSJ.setText("");
		} else {
			mCHNEWJGSJ.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_newjgsj().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_pzlxbm()==null) {
			mCHPZLXBM.setText("");
		} else {
			mCHPZLXBM.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_pzlxbm().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_gkj_lxpfwh()==null) {
			mVCGKJLXPFWH.setText("");
		} else {
			mVCGKJLXPFWH.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_gkj_lxpfwh().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getDt_gkj_hpsfbl()==null) {
			mDTGKJHPSFBL.setText("");
		} else {
			mDTGKJHPSFBL.setText(mWaterElectricityTemplateBean.getData().get(0).getDt_gkj_hpsfbl().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_wpspdw()==null) {
			mVCWPSPDW.setText("");
		} else {
			mVCWPSPDW.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_wpspdw().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_spsj()==null) {
			mCHSPSJ.setText("");
		} else {
			mCHSPSJ.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_spsj().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_spdw()==null) {
			mVCSPDW.setText("");
		} else {
			mVCSPDW.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_spdw().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getDt_yssj()==null) {
			mDTYSSJ.setText("");
		} else {
			mDTYSSJ.setText(mWaterElectricityTemplateBean.getData().get(0).getDt_yssj().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_spwh()==null) {
			mVCSPWH.setText("");
		} else {
			mVCSPWH.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_spwh().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_hbzgyssj()==null) {
			mCHHBZGYSSJ.setText("");
		} else {
			mCHHBZGYSSJ.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_hbzgyssj().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_hbzg_zzysbm()==null) {
			mVCHBZGZZYSBM.setText("");
		} else {
			mVCHBZGZZYSBM.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_hbzg_zzysbm().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sfsyzcttfw()==null) {
			mCHSFSYZCTTFW.setText("");
		} else {
			mCHSFSYZCTTFW.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sfsyzcttfw().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_sfsycyzcttfw()==null) {
			mVCSFSYCYZCTTFW.setText("");
		} else {
			mVCSFSYCYZCTTFW.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_sfsycyzcttfw().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sfjnpwf()==null) {
			mCHSFJNPWF.setText("");
		} else {
			mCHSFJNPWF.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sfjnpwf().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_jfksyf()==null) {
			mVCJFKSYF.setText("");
		} else {
			mVCJFKSYF.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_jfksyf().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_jfjsyf()==null) {
			mVCJFJSYF.setText("");
		} else {
			mVCJFJSYF.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_jfjsyf().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_gjpwf()==null) {
			mVCGJPWF.setText("");
		} else {
			mVCGJPWF.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_gjpwf().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_yxqjsfagdjnpwf()==null) {
			mCHYXQJSFAGDJNPWF.setText("");
		} else {
			mCHYXQJSFAGDJNPWF.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_yxqjsfagdjnpwf().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_jfksyfj()==null) {
			mVCJFKSYFJ.setText("");
		} else {
			mVCJFKSYFJ.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_jfksyfj().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_jfjsyfj()==null) {
			mVCJFJSYFJ.setText("");
		} else {
			mVCJFJSYFJ.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_jfjsyfj().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_gjnpwfy()==null) {
			mVCGJNPWFY.setText("");
		} else {
			mVCGJNPWFY.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_gjnpwfy().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_zxqthjflzddqk()==null) {
			mVCZXQTHJFLZDDQK.setText("");
		} else {
			mVCZXQTHJFLZDDQK.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_zxqthjflzddqk().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_sgqjxfsclgy()==null) {
			mVCSGQJXFSCLGY.setText("");
		} else {
			mVCSGQJXFSCLGY.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_sgqjxfsclgy().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_cll()==null) {
			mVCCLL.setText("");
		} else {
			mVCCLL.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_cll().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sfyhpyz()==null) {
			mCHSFYHPYZ.setText("");
		} else {
			mCHSFYHPYZ.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sfyhpyz().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_byzds()==null) {
			mVCBYZDS.setText("");
		} else {
			mVCBYZDS.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_byzds().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_hpjxfsclfs()==null) {
			mCHHPJXFSCLFS.setText("");
		} else {
			mCHHPJXFSCLFS.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_hpjxfsclfs().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sjjxfsclfs()==null) {
			mCHSJJXFSCLFS.setText("");
		} else {
			mCHSJJXFSCLFS.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sjjxfsclfs().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_jcsclssyxqk()==null) {
			mVCJCSCLSSYXQK.setText("");
		} else {
			mVCJCSCLSSYXQK.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_jcsclssyxqk().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_hyfsclgy()==null) {
			mVCHYFSCLGY.setText("");
		} else {
			mVCHYFSCLGY.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_hyfsclgy().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_cll2()==null) {
			mVCCLL2.setText("");
		} else {
			mVCCLL2.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_cll2().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sfyhpyz2()==null) {
			mCHSFYHPYZ2.setText("");
		} else {
			mCHSFYHPYZ2.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sfyhpyz2().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_byzds2()==null) {
			mVCBYZDS2.setText("");
		} else {
			mVCBYZDS2.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_byzds2().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_hpjxfsclfs2()==null) {
			mCHHPJXFSCLFS2.setText("");
		} else {
			mCHHPJXFSCLFS2.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_hpjxfsclfs2().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sjjxfsclfs2()==null) {
			mCHSJJXFSCLFS2.setText("");
		} else {
			mCHSJJXFSCLFS2.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sjjxfsclfs2().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_jcsclssyxqk2()==null) {
			mVCJCSCLSSYXQK2.setText("");
		} else {
			mVCJCSCLSSYXQK2.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_jcsclssyxqk2().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_jcqj()==null) {
			mCHJCQJ.setText("");
		} else {
			mCHJCQJ.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_jcqj().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_fsjcsfcb()==null) {
			mCHFSJCSFCB.setText("");
		} else {
			mCHFSJCSFCB.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_fsjcsfcb().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_fsjcsfcb()==null) {
			mVCFSJCSFCB.setText("");
		} else {
			mVCFSJCSFCB.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_fsjcsfcb().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_jcdw()==null) {
			mVCJCDW.setText("");
		} else {
			mVCJCDW.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_jcdw().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getDt_jcsj()==null) {
			mDTJCSJ.setText("");
		} else {
			mDTJCSJ.setText(mWaterElectricityTemplateBean.getData().get(0).getDt_jcsj().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_sslfsclgy()==null) {
			mVCSSLFSCLGY.setText("");
		} else {
			mVCSSLFSCLGY.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_sslfsclgy().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_cll3()==null) {
			mVCCLL3.setText("");
		} else {
			mVCCLL3.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_cll3().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sfyhpyz3()==null) {
			mCHSFYHPYZ3.setText("");
		} else {
			mCHSFYHPYZ3.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sfyhpyz3().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_byzds3()==null) {
			mVCBYZDS3.setText("");
		} else {
			mVCBYZDS3.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_byzds3().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_hpjxfsclfs3()==null) {
			mCHHPJXFSCLFS3.setText("");
		} else {
			mCHHPJXFSCLFS3.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_hpjxfsclfs3().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sjjxfsclfs3()==null) {
			mCHSJJXFSCLFS3.setText("");
		} else {
			mCHSJJXFSCLFS3.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sjjxfsclfs3().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_jcsclssyxqk3()==null) {
			mVCJCSCLSSYXQK3.setText("");
		} else {
			mVCJCSCLSSYXQK3.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_jcsclssyxqk3().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_hntfsclgy()==null) {
			mVCHNTFSCLGY.setText("");
		} else {
			mVCHNTFSCLGY.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_hntfsclgy().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_cll4()==null) {
			mVCCLL4.setText("");
		} else {
			mVCCLL4.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_cll4().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sfyhpyz4()==null) {
			mCHSFYHPYZ4.setText("");
		} else {
			mCHSFYHPYZ4.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sfyhpyz4().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_byzds4()==null) {
			mVCBYZDS4.setText("");
		} else {
			mVCBYZDS4.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_byzds4().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_hpjxfsclfs4()==null) {
			mCHHPJXFSCLFS4.setText("");
		} else {
			mCHHPJXFSCLFS4.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_hpjxfsclfs4().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sjjxfsclfs4()==null) {
			mCHSJJXFSCLFS4.setText("");
		} else {
			mCHSJJXFSCLFS4.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sjjxfsclfs4().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_jcsclssyxqk4()==null) {
			mVCJCSCLSSYXQK4.setText("");
		} else {
			mVCJCSCLSSYXQK4.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_jcsclssyxqk4().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_jqjcsfcb()==null) {
			mCHJQJCSFCB.setText("");
		} else {
			mCHJQJCSFCB.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_jqjcsfcb().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_cbd()==null) {
			mVCCBD.setText("");
		} else {
			mVCCBD.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_cbd().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_fsjcsfcb2()==null) {
			mVCFSJCSFCB2.setText("");
		} else {
			mVCFSJCSFCB2.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_fsjcsfcb2().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_jcdw2()==null) {
			mVCJCDW2.setText("");
		} else {
			mVCJCDW2.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_jcdw2().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getDt_jcsj2()==null) {
			mDTJCSJ2.setText("");
		} else {
			mDTJCSJ2.setText(mWaterElectricityTemplateBean.getData().get(0).getDt_jcsj2().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_sgqshfsclgy()==null) {
			mVCSGQSHFSCLGY.setText("");
		} else {
			mVCSGQSHFSCLGY.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_sgqshfsclgy().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_cll5()==null) {
			mVCCLL5.setText("");
		} else {
			mVCCLL5.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_cll5().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sfyhpyz5()==null) {
			mCHSFYHPYZ5.setText("");
		} else {
			mCHSFYHPYZ5.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sfyhpyz5().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_byzds5()==null) {
			mVCBYZDS5.setText("");
		} else {
			mVCBYZDS5.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_byzds5().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_hpjxfsclfs5()==null) {
			mCHHPJXFSCLFS5.setText("");
		} else {
			mCHHPJXFSCLFS5.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_hpjxfsclfs5().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sjjxfsclfs5()==null) {
			mCHSJJXFSCLFS5.setText("");
		} else {
			mCHSJJXFSCLFS5.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sjjxfsclfs5().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_jcsclssyxqk5()==null) {
			mVCJCSCLSSYXQK5.setText("");
		} else {
			mVCJCSCLSSYXQK5.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_jcsclssyxqk5().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_yxqshfsclgy()==null) {
			mVCYXQSHFSCLGY.setText("");
		} else {
			mVCYXQSHFSCLGY.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_yxqshfsclgy().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_cll6()==null) {
			mVCCLL6.setText("");
		} else {
			mVCCLL6.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_cll6().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sfyhpyz6()==null) {
			mCHSFYHPYZ6.setText("");
		} else {
			mCHSFYHPYZ6.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sfyhpyz6().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_byzds6()==null) {
			mVCBYZDS6.setText("");
		} else {
			mVCBYZDS6.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_byzds6().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_hpjxfsclfs6()==null) {
			mCHHPJXFSCLFS6.setText("");
		} else {
			mCHHPJXFSCLFS6.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_hpjxfsclfs6().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sjjxfsclfs6()==null) {
			mCHSJJXFSCLFS6.setText("");
		} else {
			mCHSJJXFSCLFS6.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sjjxfsclfs6().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_jcsclssyxqk6()==null) {
			mVCJCSCLSSYXQK6.setText("");
		} else {
			mVCJCSCLSSYXQK6.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_jcsclssyxqk6().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_jqjcsfcb2()==null) {
			mCHJQJCSFCB2.setText("");
		} else {
			mCHJQJCSFCB2.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_jqjcsfcb2().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_cbd2()==null) {
			mVCCBD2.setText("");
		} else {
			mVCCBD2.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_cbd2().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_fsjcsfcb3()==null) {
			mVCFSJCSFCB3.setText("");
		} else {
			mVCFSJCSFCB3.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_fsjcsfcb3().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_jcdw3()==null) {
			mVCJCDW3.setText("");
		} else {
			mVCJCDW3.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_jcdw3().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getDt_jcsj3()==null) {
			mDTJCSJ3.setText("");
		} else {
			mDTJCSJ3.setText(mWaterElectricityTemplateBean.getData().get(0).getDt_jcsj3().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_hpsfjycqnjywflxt()==null) {
			mCHHPSFJYCQNJYWFLXT.setText("");
		} else {
			mCHHPSFJYCQNJYWFLXT.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_hpsfjycqnjywflxt().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sfjcywflxt()==null) {
			mCHSFJCYWFLXT.setText("");
		} else {
			mCHSFJCYWFLXT.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sfjcywflxt().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_fyzclsffhhpjpfyq()==null) {
			mCHFYZCLSFFHHPJPFYQ.setText("");
		} else {
			mCHFYZCLSFFHHPJPFYQ.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_fyzclsffhhpjpfyq().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_byzds8()==null) {
			mVCBYZDS8.setText("");
		} else {
			mVCBYZDS8.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_byzds8().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sgqsffcyhpyz()==null) {
			mCHSGQSFFCYHPYZ.setText("");
		} else {
			mCHSGQSFFCYHPYZ.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sgqsffcyhpyz().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_byzds9()==null) {
			mVCBYZDS9.setText("");
		} else {
			mVCBYZDS9.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_byzds9().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_hntjbccsssyhpyz()==null) {
			mCHHNTJBCCSSSYHPYZ.setText("");
		} else {
			mCHHNTJBCCSSSYHPYZ.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_hntjbccsssyhpyz().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_byzds10()==null) {
			mVCBYZDS10.setText("");
		} else {
			mVCBYZDS10.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_byzds10().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_ccssyxqk()==null) {
			mVCCCSSYXQK.setText("");
		} else {
			mVCCCSSYXQK.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_ccssyxqk().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_jqjcdx()==null) {
			mCHJQJCDX.setText("");
		} else {
			mCHJQJCDX.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_jqjcdx().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sfcb()==null) {
			mCHSFCB.setText("");
		} else {
			mCHSFCB.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sfcb().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sgqsfzsyhpyz3()==null) {
			mCHSGQSFZSYHPYZ3.setText("");
		} else {
			mCHSGQSFZSYHPYZ3.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sgqsfzsyhpyz3().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_jccbz()==null) {
			mVCJCCBZ.setText("");
		} else {
			mVCJCCBZ.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_jccbz().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_cbd4()==null) {
			mVCCBD4.setText("");
		} else {
			mVCCBD4.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_cbd4().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_jcdw4()==null) {
			mVCJCDW4.setText("");
		} else {
			mVCJCDW4.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_jcdw4().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getDt_jcsj4()==null) {
			mDTJCSJ4.setText("");
		} else {
			mDTJCSJ4.setText(mWaterElectricityTemplateBean.getData().get(0).getDt_jcsj4().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_bgms()==null) {
			mVCBGMS.setText("");
		} else {
			mVCBGMS.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_bgms().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_hpjydbhcs()==null) {
			mVCHPJYDBHCS.setText("");
		} else {
			mVCHPJYDBHCS.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_hpjydbhcs().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_sjcqdbhcs()==null) {
			mVCSJCQDBHCS.setText("");
		} else {
			mVCSJCQDBHCS.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_sjcqdbhcs().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_syhbhzlcs()==null) {
			mVCSYHBHZLCS.setText("");
		} else {
			mVCSYHBHZLCS.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_syhbhzlcs().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sfyhpyz7()==null) {
			mCHSFYHPYZ7.setText("");
		} else {
			mCHSFYHPYZ7.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sfyhpyz7().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_xmctslczgs2()==null) {
			mVCXMCTSLCZGS2.setText("");
		} else {
			mVCXMCTSLCZGS2.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_xmctslczgs2().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_slddsfybg2()==null) {
			mCHSLDDSFYBG2.setText("");
		} else {
			mCHSLDDSFYBG2.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_slddsfybg2().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_bgms2()==null) {
			mVCBGMS2.setText("");
		} else {
			mVCBGMS2.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_bgms2().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_hpjydbhcs2()==null) {
			mVCHPJYDBHCS2.setText("");
		} else {
			mVCHPJYDBHCS2.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_hpjydbhcs2().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_sjcqdbhcs2()==null) {
			mVCSJCQDBHCS2.setText("");
		} else {
			mVCSJCQDBHCS2.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_sjcqdbhcs2().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_cyhbhzlcs()==null) {
			mVCCYHBHZLCS.setText("");
		} else {
			mVCCYHBHZLCS.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_cyhbhzlcs().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sfyhpyz8()==null) {
			mCHSFYHPYZ8.setText("");
		} else {
			mCHSFYHPYZ8.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sfyhpyz8().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_xmqzzgs()==null) {
			mVCXMQZZGS.setText("");
		} else {
			mVCXMQZZGS.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_xmqzzgs().toString());
		}
//		if (mWaterElectricityTemplateBean.getData().get(0).getVc_cyhbhzlcs2()==null) {
//			mVCCYHBHZLCS2.setText("");
//		} else {
//			mVCCYHBHZLCS2.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_cyhbhzlcs2().toString());
//		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_slddsfybg1()==null) {
			mCHSLDDSFYBG1.setText("");
		} else {
			mCHSLDDSFYBG1.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_slddsfybg1().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_qzspsfyhpyz()==null) {
			mCHQZSPSFYHPYZ.setText("");
		} else {
			mCHQZSPSFYHPYZ.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_qzspsfyhpyz().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_zcbhcs()==null) {
			mCHZCBHCS.setText("");
		} else {
			mCHZCBHCS.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_zcbhcs().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_qtxcqdbhcs()==null) {
			mVCQTXCQDBHCS.setText("");
		} else {
			mVCQTXCQDBHCS.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_qtxcqdbhcs().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_sjcqdstbhcs()==null) {
			mVCSJCQDSTBHCS.setText("");
		} else {
			mVCSJCQDSTBHCS.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_sjcqdstbhcs().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_dssdwbhcssfyhpyz()==null) {
			mCHDSSDWBHCSSFYHPYZ.setText("");
		} else {
			mCHDSSDWBHCSSFYHPYZ.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_dssdwbhcssfyhpyz().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_byzds11()==null) {
			mVCBYZDS11.setText("");
		} else {
			mVCBYZDS11.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_byzds11().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_dlsdwbhcssfyhpyz()==null) {
			mCHDLSDWBHCSSFYHPYZ.setText("");
		} else {
			mCHDLSDWBHCSSFYHPYZ.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_dlsdwbhcssfyhpyz().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_byzds13()==null) {
			mVCBYZDS13.setText("");
		} else {
			mVCBYZDS13.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_byzds13().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_dzwbhcssfyhpyz()==null) {
			mCHDZWBHCSSFYHPYZ.setText("");
		} else {
			mCHDZWBHCSSFYHPYZ.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_dzwbhcssfyhpyz().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_byzds14()==null) {
			mVCBYZDS14.setText("");
		} else {
			mVCBYZDS14.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_byzds14().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_hpsfyqfs()==null) {
			mCHHPSFYQFS.setText("");
		} else {
			mCHHPSFYQFS.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_hpsfyqfs().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_tshdglc()==null) {
			mVCTSHDGLC.setText("");
		} else {
			mVCTSHDGLC.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_tshdglc().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_hpxstll()==null) {
			mVCHPXSTLL.setText("");
		} else {
			mVCHPXSTLL.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_hpxstll().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getVc_sxstll()==null) {
			mVCSXSTLL.setText("");
		} else {
			mVCSXSTLL.setText(mWaterElectricityTemplateBean.getData().get(0).getVc_sxstll().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sffhhpyq()==null) {
			mCHSFFHHPYQ.setText("");
		} else {
			mCHSFFHHPYQ.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sffhhpyq().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getCh_sfyqanyq()==null) {
			mCHSFYQANYQ.setText("");
		} else {
			mCHSFYQANYQ.setText(mWaterElectricityTemplateBean.getData().get(0).getCh_sfyqanyq().toString());
		}

		if (mWaterElectricityTemplateBean.getData().get(0).getInstanceid()==null) {
			mINSTANCEID.setText("");
		} else {
			mINSTANCEID.setText(mWaterElectricityTemplateBean.getData().get(0).getInstanceid().toString());
		}


	}
}
