package com.huaxin.yunnan.environment.activity.template;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.Constant;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.bean.FireElectricityEnterpriseTemplateBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_HR_INFO;

/**
 * 4、火电企业现场监察记录页面
 */
public class FireElectricityEnterpriseTemplateActivity extends BaseActicity implements View.OnClickListener, CallBack {

	private TextView titleText;
	private TextView mTvKSSJ;
	private TextView mTvJSSJ;
	private TextView mTvDD;
	private TextView mTvJCR;
	private TextView mTvZFZH;
	private TextView mTvJLR;
	private TextView mTvBJCDWMC;
	private TextView mTvZZJGDMZH;
	private TextView mTvFDDBR;
	private TextView mTvFDDBRSFZH;
	private TextView mTvXCFZR;
	private TextView mTvXCFZRSFFZ;
	private TextView mTvNL;
	private TextView mTvGZDW;
	private TextView mTvZW;
	private TextView mTvYBAGX;
	private TextView mTvDZ;
	private TextView mTvDH;
	private TextView mTvYZBM;
	private TextView mTvQTCJRXMJDW;
	private TextView mTvHBDWMC;
	private TextView mTvHBDWLX;
	private TextView mTvHJJCLX;
	private TextView mTvSFQRZJ;
	private TextView mTvSFSQHB;
	private TextView mTvSZSZ;
	private TextView mTvSZXQS;
	private TextView mTvSZZX;
	private TextView mTvSZCZ;
	private TextView mTvDM;
	private TextView mTvXYZZJ;
	private TextView mTvGYJTJZ;
	private TextView mTvJZZJ;
	private TextView mTvPBGL;
	private TextView mTvQLFDJZW;
	private TextView mTvSJSJ;
	private TextView mTvPZLXBM;
	private TextView mTvLXPFH;
	private TextView mTvHPBZDW;
	private TextView mTvBZWCSSSJ;
	private TextView mTvSFJDDJBZHP;
	private TextView mTvHPSPDW;
	private TextView mTvHPSPSJ;
	private TextView mTvHPSPWH;
	private TextView mTvHPSFCZYJSP;
	private TextView mTvHMLFJHDL;
	private TextView mTvSFYWJYZ;
	private TextView mTvBFDY;
	private TextView mTvJCTRSSCSJ;
	private TextView mTvLJSCSJ;
	private TextView mTvSFHBPFTYSC;
	private TextView mTvSSCSPDW;
	private TextView mTvSSCSPSJ;
	private TextView mTvSSCSPWH;
	private TextView mTvSFTGHBJGYS;
	private TextView mTvJGYSSJ;
	private TextView mTvYSDW;
	private TextView mTvYSSPWH;
	private TextView mTvSFXGK;
	private TextView mTvXGKHPZDZXQK;
	private TextView mTvSFQDPWXKZ;
	private TextView mTvAZGDPFWW;
	private TextView mTvFFBMJSJ;
	private TextView mTvSFCGYXQ;
	private TextView mTvXKZLX;
	private TextView mTvYXQ;
	private TextView mTvNJSJ;
	private TextView mTvSFTBDJB;
	private TextView mTvSFJNPWF;
	private TextView mTvJFKSSJ;
	private TextView mTvJFJSSJ;
	private TextView mTvGJPWF;
	private TextView mTvYQCCSS;
	private TextView mTvSFLS;
	private TextView mTvWLSQKMS;
	private TextView mTvYQZXJCXTS;
	private TextView mTvSFLWBSCSJ;
	private TextView mTvSFWTDSFYW;
	private TextView mTvSBYXWHF;
	private TextView mTvSFCYYWZZ;
	private TextView mTvZZZBH;
	private TextView mTvSFJYFMHC;
	private TextView mTvYSYSJ;
	private TextView mTvXDCL;
	private TextView mTvSFPTSS;
	private TextView mTvSSWPTQKMS;
	private TextView mTvSFDFSXHLY;
	private TextView mTvWPTQKMS;
	private TextView mTvSFPTZSZLSS;
	private TextView mTvJTFZCS;
	private TextView mTvZZYXJZ;
	private TextView mTvSSSCFH;
	private TextView mTvTJJZ;
	private TextView mTvTJSJ;
	private TextView mTvSFHBSMBG;
	private TextView mTvHBBMJB;
	private TextView mTvCYSJ;
	private TextView mTvLJFD;
	private TextView mTvYMXH;
	private TextView mTvSHSXH;
	private TextView mTvYMPJHL;
	private TextView mTvTLSSSFFHYQ;
	private TextView mTvNAXHL;
	private TextView mTvYMPJHA;
	private TextView mTvTXSSSFFHYQ;
	private TextView mTvXCJCSJ;
	private TextView mTvYQTLSSSFYX;
	private TextView mTvYQCCSSSFZZYX;
	private TextView mTvCEMSSFZZYX;
	private TextView mTvCEMSXSWRWYZ;
	private TextView mTvSFYYWTZ;
	private TextView mTvYBQSFYHGZ;
	private TextView mTvSFZYXQN;
	private TextView mTvSFAGDBD;
	private TextView mTvSFTGSH;
	private TextView mTvZXJCSSSJ;
	private TextView mTvSSSJFBW;
	private TextView mTvYDPLZT;
	private TextView mTvCCJZ;
	private TextView mTvCCKSSJ;
	private TextView mTvCCJSSJ;
	private TextView mTvSO2ZGW;
	private TextView mTvSO2ZDW;
	private TextView mTvNOxZGW;
	private TextView mTvNOxZDW;
	private TextView mTvYCZGW;
	private TextView mTvYCZDW;
	private TextView mTvHJJCZMC;
	private TextView mTvJCSJ;
	private TextView mTvJCJZ;
	private TextView mTvSO2;
	private TextView mTvNOx;
	private TextView mTvYC;
	private TextView mTvPFSFCB;
	private TextView mTvCBYZ;
	private TextView mTvGFFZCSSFGF;
	private TextView mTvGFZHLYL;
	private TextView mTvZYZY;
	private TextView mTvHZYSJL;
	private TextView mTvGYGFSFLSDF;
	private TextView mTvFMHCJCCS;
	private TextView mTvQTHBBMJCQK;
	private TextView mTvCSGCCS;
	private TextView mTvSFYTD;
	private TextView mTvSFTSXF;
	private TextView mTvWSFHJLI;
	private TextView mTvSFYBHMB;
	private TextView mTvWSBHMBJSSJ;
	private TextView mTvZBBHQKMS;
	private TextView mTvSFLSFXFFDC;
	private TextView mTvHJWLSQKMS;
	private TextView mTvSFBZTHHJYA;
	private TextView mTvSFBZTHHJYAPGBA;
	private TextView mTvSFJXNDYJYL;
	private TextView mTvSFCBYJWZ;
	private TextView mTvQQTHBBMJCQK;
	private TextView mTvBCZZYWT;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fire_electricity_enterprise_template);
		initProgressDialog();
		Intent intent = getIntent();
		String t_task_list_id = intent.getStringExtra("t_task_list_id");
		initView();
		NetTool.templatePost(getApplicationContext(), t_task_list_id, URL_QUERY_HR_INFO, FireElectricityEnterpriseTemplateBean.class, this, yNProgressDialog);
	}

	private void initView() {
		titleText = (TextView) findViewById(R.id.title_text);
		titleText.setText("火电企业现场监察记录");
		findViewById(R.id.title_text).setOnClickListener(this);

		mTvKSSJ = (TextView) findViewById(R.id.tv_KSSJ);
		mTvJSSJ = (TextView) findViewById(R.id.tv_JSSJ);
		mTvDD = (TextView) findViewById(R.id.tv_DD);
		mTvJCR = (TextView) findViewById(R.id.tv_JCR);
		mTvZFZH = (TextView) findViewById(R.id.tv_ZFZH);
		mTvJLR = (TextView) findViewById(R.id.tv_JLR);
		mTvBJCDWMC = (TextView) findViewById(R.id.tv_BJCDWMC);
		mTvZZJGDMZH = (TextView) findViewById(R.id.tv_ZZJGDMZH);
		mTvFDDBR = (TextView) findViewById(R.id.tv_FDDBR);
		mTvFDDBRSFZH = (TextView) findViewById(R.id.tv_FDDBRSFZH);
		mTvXCFZR = (TextView) findViewById(R.id.tv_XCFZR);
		mTvXCFZRSFFZ = (TextView) findViewById(R.id.tv_XCFZRSFFZ);
		mTvNL = (TextView) findViewById(R.id.tv_NL);
		mTvGZDW = (TextView) findViewById(R.id.tv_GZDW);
		mTvZW = (TextView) findViewById(R.id.tv_ZW);
		mTvYBAGX = (TextView) findViewById(R.id.tv_YBAGX);
		mTvDZ = (TextView) findViewById(R.id.tv_DZ);
		mTvDH = (TextView) findViewById(R.id.tv_DH);
		mTvYZBM = (TextView) findViewById(R.id.tv_YZBM);
		mTvQTCJRXMJDW = (TextView) findViewById(R.id.tv_QTCJRXMJDW);
		mTvHBDWMC = (TextView) findViewById(R.id.tv_HBDWMC);
		mTvHBDWLX = (TextView) findViewById(R.id.tv_HBDWLX);
		mTvHJJCLX = (TextView) findViewById(R.id.tv_HJJCLX);
		mTvSFQRZJ = (TextView) findViewById(R.id.tv_SFQRZJ);
		mTvSFSQHB = (TextView) findViewById(R.id.tv_SFSQHB);
		mTvSZSZ = (TextView) findViewById(R.id.tv_SZSZ);
		mTvSZXQS = (TextView) findViewById(R.id.tv_SZXQS);
		mTvSZZX = (TextView) findViewById(R.id.tv_SZZX);
		mTvSZCZ = (TextView) findViewById(R.id.tv_SZCZ);
		mTvDM = (TextView) findViewById(R.id.tv_DM);
		mTvXYZZJ = (TextView) findViewById(R.id.tv_XYZZJ);
		mTvGYJTJZ = (TextView) findViewById(R.id.tv_GYJTJZ);
		mTvJZZJ = (TextView) findViewById(R.id.tv_JZZJ);
		mTvPBGL = (TextView) findViewById(R.id.tv_PBGL);
		mTvQLFDJZW = (TextView) findViewById(R.id.tv_QLFDJZW);
		mTvSJSJ = (TextView) findViewById(R.id.tv_SJSJ);
		mTvPZLXBM = (TextView) findViewById(R.id.tv_PZLXBM);
		mTvLXPFH = (TextView) findViewById(R.id.tv_LXPFH);
		mTvHPBZDW = (TextView) findViewById(R.id.tv_HPBZDW);
		mTvBZWCSSSJ = (TextView) findViewById(R.id.tv_BZWCSSSJ);
		mTvSFJDDJBZHP = (TextView) findViewById(R.id.tv_SFJDDJBZHP);
		mTvHPSPDW = (TextView) findViewById(R.id.tv_HPSPDW);
		mTvHPSPSJ = (TextView) findViewById(R.id.tv_HPSPSJ);
		mTvHPSPWH = (TextView) findViewById(R.id.tv_HPSPWH);
		mTvHPSFCZYJSP = (TextView) findViewById(R.id.tv_HPSFCZYJSP);
		mTvHMLFJHDL = (TextView) findViewById(R.id.tv_HMLFJHDL);
		mTvSFYWJYZ = (TextView) findViewById(R.id.tv_SFYWJYZ);
		mTvBFDY = (TextView) findViewById(R.id.tv_BFDY);
		mTvJCTRSSCSJ = (TextView) findViewById(R.id.tv_JCTRSSCSJ);
		mTvLJSCSJ = (TextView) findViewById(R.id.tv_LJSCSJ);
		mTvSFHBPFTYSC = (TextView) findViewById(R.id.tv_SFHBPFTYSC);
		mTvSSCSPDW = (TextView) findViewById(R.id.tv_SSCSPDW);
		mTvSSCSPSJ = (TextView) findViewById(R.id.tv_SSCSPSJ);
		mTvSSCSPWH = (TextView) findViewById(R.id.tv_SSCSPWH);
		mTvSFTGHBJGYS = (TextView) findViewById(R.id.tv_SFTGHBJGYS);
		mTvJGYSSJ = (TextView) findViewById(R.id.tv_JGYSSJ);
		mTvYSDW = (TextView) findViewById(R.id.tv_YSDW);
		mTvYSSPWH = (TextView) findViewById(R.id.tv_YSSPWH);
		mTvSFXGK = (TextView) findViewById(R.id.tv_SFXGK);
		mTvXGKHPZDZXQK = (TextView) findViewById(R.id.tv_XGKHPZDZXQK);
		mTvSFQDPWXKZ = (TextView) findViewById(R.id.tv_SFQDPWXKZ);
		mTvAZGDPFWW = (TextView) findViewById(R.id.tv_AZGDPFWW);
		mTvFFBMJSJ = (TextView) findViewById(R.id.tv_FFBMJSJ);
		mTvSFCGYXQ = (TextView) findViewById(R.id.tv_SFCGYXQ);
		mTvXKZLX = (TextView) findViewById(R.id.tv_XKZLX);
		mTvYXQ = (TextView) findViewById(R.id.tv_YXQ);
		mTvNJSJ = (TextView) findViewById(R.id.tv_NJSJ);
		mTvSFTBDJB = (TextView) findViewById(R.id.tv_SFTBDJB);
		mTvSFJNPWF = (TextView) findViewById(R.id.tv_SFJNPWF);
		mTvJFKSSJ = (TextView) findViewById(R.id.tv_JFKSSJ);
		mTvJFJSSJ = (TextView) findViewById(R.id.tv_JFJSSJ);
		mTvGJPWF = (TextView) findViewById(R.id.tv_GJPWF);
		mTvYQCCSS = (TextView) findViewById(R.id.tv_YQCCSS);
		mTvSFLS = (TextView) findViewById(R.id.tv_SFLS);
		mTvWLSQKMS = (TextView) findViewById(R.id.tv_WLSQKMS);
		mTvYQZXJCXTS = (TextView) findViewById(R.id.tv_YQZXJCXTS);
		mTvSFLWBSCSJ = (TextView) findViewById(R.id.tv_SFLWBSCSJ);
		mTvSFWTDSFYW = (TextView) findViewById(R.id.tv_SFWTDSFYW);
		mTvSBYXWHF = (TextView) findViewById(R.id.tv_SBYXWHF);
		mTvSFCYYWZZ = (TextView) findViewById(R.id.tv_SFCYYWZZ);
		mTvZZZBH = (TextView) findViewById(R.id.tv_ZZZBH);
		mTvSFJYFMHC = (TextView) findViewById(R.id.tv_SFJYFMHC);
		mTvYSYSJ = (TextView) findViewById(R.id.tv_YSYSJ);
		mTvXDCL = (TextView) findViewById(R.id.tv_XDCL);
		mTvSFPTSS = (TextView) findViewById(R.id.tv_SFPTSS);
		mTvSSWPTQKMS = (TextView) findViewById(R.id.tv_SSWPTQKMS);
		mTvSFDFSXHLY = (TextView) findViewById(R.id.tv_SFDFSXHLY);
		mTvWPTQKMS = (TextView) findViewById(R.id.tv_WPTQKMS);
		mTvSFPTZSZLSS = (TextView) findViewById(R.id.tv_SFPTZSZLSS);
		mTvJTFZCS = (TextView) findViewById(R.id.tv_JTFZCS);
		mTvZZYXJZ = (TextView) findViewById(R.id.tv_ZZYXJZ);
		mTvSSSCFH = (TextView) findViewById(R.id.tv_SSSCFH);
		mTvTJJZ = (TextView) findViewById(R.id.tv_TJJZ);
		mTvTJSJ = (TextView) findViewById(R.id.tv_TJSJ);
		mTvSFHBSMBG = (TextView) findViewById(R.id.tv_SFHBSMBG);
		mTvHBBMJB = (TextView) findViewById(R.id.tv_HBBMJB);
		mTvCYSJ = (TextView) findViewById(R.id.tv_CYSJ);
		mTvLJFD = (TextView) findViewById(R.id.tv_LJFD);
		mTvYMXH = (TextView) findViewById(R.id.tv_YMXH);
		mTvSHSXH = (TextView) findViewById(R.id.tv_SHSXH);
		mTvYMPJHL = (TextView) findViewById(R.id.tv_YMPJHL);
		mTvTLSSSFFHYQ = (TextView) findViewById(R.id.tv_TLSSSFFHYQ);
		mTvNAXHL = (TextView) findViewById(R.id.tv_NAXHL);
		mTvYMPJHA = (TextView) findViewById(R.id.tv_YMPJHA);
		mTvTXSSSFFHYQ = (TextView) findViewById(R.id.tv_TXSSSFFHYQ);
		mTvXCJCSJ = (TextView) findViewById(R.id.tv_XCJCSJ);
		mTvYQTLSSSFYX = (TextView) findViewById(R.id.tv_YQTLSSSFYX);
		mTvYQCCSSSFZZYX = (TextView) findViewById(R.id.tv_YQCCSSSFZZYX);
		mTvCEMSSFZZYX = (TextView) findViewById(R.id.tv_CEMSSFZZYX);
		mTvCEMSXSWRWYZ = (TextView) findViewById(R.id.tv_CEMSXSWRWYZ);
		mTvSFYYWTZ = (TextView) findViewById(R.id.tv_SFYYWTZ);
		mTvYBQSFYHGZ = (TextView) findViewById(R.id.tv_YBQSFYHGZ);
		mTvSFZYXQN = (TextView) findViewById(R.id.tv_SFZYXQN);
		mTvSFAGDBD = (TextView) findViewById(R.id.tv_SFAGDBD);
		mTvSFTGSH = (TextView) findViewById(R.id.tv_SFTGSH);
		mTvZXJCSSSJ = (TextView) findViewById(R.id.tv_ZXJCSSSJ);
		mTvSSSJFBW = (TextView) findViewById(R.id.tv_SSSJFBW);
		mTvYDPLZT = (TextView) findViewById(R.id.tv_YDPLZT);
		mTvCCJZ = (TextView) findViewById(R.id.tv_CCJZ);
		mTvCCKSSJ = (TextView) findViewById(R.id.tv_CCKSSJ);
		mTvCCJSSJ = (TextView) findViewById(R.id.tv_CCJSSJ);
		mTvSO2ZGW = (TextView) findViewById(R.id.tv_SO2ZGW);
		mTvSO2ZDW = (TextView) findViewById(R.id.tv_SO2ZDW);
		mTvNOxZGW = (TextView) findViewById(R.id.tv_NOxZGW);
		mTvNOxZDW = (TextView) findViewById(R.id.tv_NOxZDW);
		mTvYCZGW = (TextView) findViewById(R.id.tv_YCZGW);
		mTvYCZDW = (TextView) findViewById(R.id.tv_YCZDW);
		mTvHJJCZMC = (TextView) findViewById(R.id.tv_HJJCZMC);
		mTvJCSJ = (TextView) findViewById(R.id.tv_JCSJ);
		mTvJCJZ = (TextView) findViewById(R.id.tv_JCJZ);
		mTvSO2 = (TextView) findViewById(R.id.tv_SO2);
		mTvNOx = (TextView) findViewById(R.id.tv_NOx);
		mTvYC = (TextView) findViewById(R.id.tv_YC);
		mTvPFSFCB = (TextView) findViewById(R.id.tv_PFSFCB);
		mTvCBYZ = (TextView) findViewById(R.id.tv_CBYZ);
		mTvGFFZCSSFGF = (TextView) findViewById(R.id.tv_GFFZCSSFGF);
		mTvGFZHLYL = (TextView) findViewById(R.id.tv_GFZHLYL);
		mTvZYZY = (TextView) findViewById(R.id.tv_ZYZY);
		mTvHZYSJL = (TextView) findViewById(R.id.tv_HZYSJL);
		mTvGYGFSFLSDF = (TextView) findViewById(R.id.tv_GYGFSFLSDF);
		mTvFMHCJCCS = (TextView) findViewById(R.id.tv_FMHCJCCS);
		mTvQTHBBMJCQK = (TextView) findViewById(R.id.tv_QTHBBMJCQK);
		mTvCSGCCS = (TextView) findViewById(R.id.tv_CSGCCS);
		mTvSFYTD = (TextView) findViewById(R.id.tv_SFYTD);
		mTvSFTSXF = (TextView) findViewById(R.id.tv_SFTSXF);
		mTvWSFHJLI = (TextView) findViewById(R.id.tv_WSFHJLI);
		mTvSFYBHMB = (TextView) findViewById(R.id.tv_SFYBHMB);
		mTvWSBHMBJSSJ = (TextView) findViewById(R.id.tv_WSBHMBJSSJ);
		mTvZBBHQKMS = (TextView) findViewById(R.id.tv_ZBBHQKMS);
		mTvSFLSFXFFDC = (TextView) findViewById(R.id.tv_SFLSFXFFDC);
		mTvHJWLSQKMS = (TextView) findViewById(R.id.tv_HJWLSQKMS);
		mTvSFBZTHHJYA = (TextView) findViewById(R.id.tv_SFBZTHHJYA);
		mTvSFBZTHHJYAPGBA = (TextView) findViewById(R.id.tv_SFBZTHHJYAPGBA);
		mTvSFJXNDYJYL = (TextView) findViewById(R.id.tv_SFJXNDYJYL);
		mTvSFCBYJWZ = (TextView) findViewById(R.id.tv_SFCBYJWZ);
		mTvQQTHBBMJCQK = (TextView) findViewById(R.id.tv_QQTHBBMJCQK);
		mTvBCZZYWT = (TextView) findViewById(R.id.tv_BCZZYWT);

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
		FireElectricityEnterpriseTemplateBean mFireElectricityEnterpriseTemplateBean = (FireElectricityEnterpriseTemplateBean) o;
		if (Constant.RESPONSE_SUCCESS.equals(mFireElectricityEnterpriseTemplateBean.getSuccess())) {
			initData(mFireElectricityEnterpriseTemplateBean);
		} else {
			LogUtils.e("请求失败，错误码：" + mFireElectricityEnterpriseTemplateBean.getSuccess() + "错误信息：" + mFireElectricityEnterpriseTemplateBean.getMsg());
		}
	}

	private void initData(FireElectricityEnterpriseTemplateBean mFireElectricityEnterpriseTemplateBean) {

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_start_time() != null)
			mTvKSSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_start_time().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_end_time() != null)
			mTvJSSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_end_time().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_location() != null)
			mTvDD.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_location().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_jcr() != null)
			mTvJCR.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_jcr().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_zfzh() != null)
			mTvZFZH.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_zfzh().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_jlr() != null)
			mTvJLR.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_jlr().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_bjcdwmc() != null)
			mTvBJCDWMC.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_bjcdwmc().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_zzjgdmzh() != null)
			mTvZZJGDMZH.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_zzjgdmzh().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_fddbr() != null)
			mTvFDDBR.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_fddbr().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_fddbrsfzh() != null)
			mTvFDDBRSFZH.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_fddbrsfzh().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_xcfzr() != null)
			mTvXCFZR.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_xcfzr().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_xcfzrsfzh() != null)
			mTvXCFZRSFFZ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_xcfzrsfzh().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getNb_age() != null)
			mTvNL.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getNb_age().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_gzdw() != null)
			mTvGZDW.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_gzdw().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_duty() != null)
			mTvZW.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_duty().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ybagx() != null)
			mTvYBAGX.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ybagx().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_address() != null)
			mTvDZ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_address().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_telephone() != null)
			mTvDH.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_telephone().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_yzbm() != null)
			mTvYZBM.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_yzbm().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getCl_qtcjrxmjgzdw() != null)
			mTvQTCJRXMJDW.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getCl_qtcjrxmjgzdw().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_hbdwmc() != null)
			mTvHBDWMC.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_hbdwmc().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_hbdwlx() != null)
			mTvHBDWLX.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_hbdwlx().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_hjjclx() != null)
			mTvHJJCLX.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_hjjclx().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfqrzj() != null)
			mTvSFQRZJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfqrzj().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfsqhb() != null)
			mTvSFSQHB.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfsqhb().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_city() != null)
			mTvSZSZ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_city().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_county() != null)
			mTvSZXQS.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_county().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_town() != null)
			mTvSZZX.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_town().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_szc() != null)
			mTvSZCZ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_szc().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_dm() != null)
			mTvDM.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_dm().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_xyzzj() != null)
			mTvXYZZJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_xyzzj().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_gjtjz() != null)
			mTvGYJTJZ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_gjtjz().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_jzzj() != null)
			mTvJZZJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_jzzj().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_pbgl() != null)
			mTvPBGL.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_pbgl().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_qlfdjz() != null)
			mTvQLFDJZW.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_qlfdjz().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_sj_time() != null)
			mTvSJSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_sj_time().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_pzlxbm() != null)
			mTvPZLXBM.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_pzlxbm().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_lxpfwh() != null)
			mTvLXPFH.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_lxpfwh().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_hpbzdw() != null)
			mTvHPBZDW.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_hpbzdw().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_bzwcss_time() != null)
			mTvBZWCSSSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_bzwcss_time().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfjddjbzhp() != null)
			mTvSFJDDJBZHP.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfjddjbzhp().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_hpspdw() != null)
			mTvHPSPDW.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_hpspdw().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_hpsp_time() != null)
			mTvHPSPSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_hpsp_time().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_hpspwh() != null)
			mTvHPSPWH.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_hpspwh().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfczyjsp() != null)
			mTvHPSFCZYJSP.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfczyjsp().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_rmlfjhdl() != null)
			mTvHMLFJHDL.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_rmlfjhdl().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_xzgmddscgy() != null)
			mTvSFYWJYZ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_xzgmddscgy().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_bfdy() != null)
			mTvBFDY.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_bfdy().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_jctrssc_time() != null)
			mTvJCTRSSCSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_jctrssc_time().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ljscsj() != null)
			mTvLJSCSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ljscsj().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfjhbbmpftysscjyqssc() != null)
			mTvSFHBPFTYSC.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfjhbbmpftysscjyqssc().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sscspdw() != null)
			mTvSSCSPDW.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sscspdw().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_sscsp_time() != null)
			mTvSSCSPSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_sscsp_time().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sscspwh() != null)
			mTvSSCSPWH.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sscspwh().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sftghbjgys() != null)
			mTvSFTGHBJGYS.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sftghbjgys().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_jgys_time() != null)
			mTvJGYSSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_jgys_time().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ysdw() != null)
			mTvYSDW.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ysdw().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ysspwh() != null)
			mTvYSSPWH.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ysspwh().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfjxgxjgjhkj() != null)
			mTvSFXGK.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfjxgxjgjhkj().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_xjjshkjhpzdzxqk() != null)
			mTvXGKHPZDZXQK.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_xjjshkjhpzdzxqk().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_xjjshkjhpzdzxqk() != null)
			mTvSFQDPWXKZ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_xjjshkjhpzdzxqk().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfazpwxkzdgdpfwrw() != null)
			mTvAZGDPFWW.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfazpwxkzdgdpfwrw().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ffbmjsj() != null)
			mTvFFBMJSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ffbmjsj().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfcgyxq() != null)
			mTvSFCGYXQ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfcgyxq().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_xkzlx() != null)
			mTvXKZLX.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_xkzlx().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_yxq() != null)
			mTvYXQ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_yxq().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_nj_time() != null)
			mTvNJSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_nj_time().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfayqtbqywrwpfsqdjb() != null)
			mTvSFTBDJB.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfayqtbqywrwpfsqdjb().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfagdjnpwf() != null)
			mTvSFJNPWF.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfagdjnpwf().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_jfks_time() != null)
			mTvJFKSSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_jfks_time().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_jfjs_time() != null)
			mTvJFJSSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_jfjs_time().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_gjnpwf() != null)
			mTvGJPWF.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_gjnpwf().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_yqccss() != null)
			mTvYQCCSS.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_yqccss().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getCl_qyscydsshdccssfls() != null)
			mTvSFLS.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getCl_qyscydsshdccssfls().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_wlsqkms() != null)
			mTvWLSQKMS.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_wlsqkms().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_yqzxjcxts() != null)
			mTvYQZXJCXTS.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_yqzxjcxts().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sflwbscsj() != null)
			mTvSFLWBSCSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sflwbscsj().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfwtdsfyw() != null)
			mTvSFWTDSFYW.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfwtdsfyw().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sbyxwhf() != null)
			mTvSBYXWHF.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sbyxwhf().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfcyywzz() != null)
			mTvSFCYYWZZ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfcyywzz().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_zzzbh() != null)
			mTvZZZBH.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_zzzbh().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfjyfmhc() != null)
			mTvSFJYFMHC.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfjyfmhc().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ysysj() != null)
			mTvYSYSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ysysj().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_xdcl() != null)
			mTvXDCL.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_xdcl().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfptjyscfsshwsclcs() != null)
			mTvSFPTSS.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfptjyscfsshwsclcs().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_wptqksm() != null)
			mTvSSWPTQKMS.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_wptqksm().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfdfsxhly() != null)
			mTvSFDFSXHLY.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfdfsxhly().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_fsxhwptqkms() != null)
			mTvWPTQKMS.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_fsxhwptqkms().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfpbzszlss() != null)
			mTvSFPTZSZLSS.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfpbzszlss().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_jtfzcs() != null)
			mTvJTFZCS.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_jtfzcs().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_zzyxjz() != null)
			mTvZZYXJZ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_zzyxjz().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ssscfh() != null)
			mTvSSSCFH.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ssscfh().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_tjjz() != null)
			mTvTJJZ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_tjjz().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_tjsj() != null)
			mTvTJSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_tjsj().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfxhbbmjxsmbg() != null)
			mTvSFHBSMBG.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfxhbbmjxsmbg().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_hbbmjb() != null)
			mTvHBBMJB.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_hbbmjb().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_cysj() != null)
			mTvCYSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_cysj().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ljfd() != null)
			mTvLJFD.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ljfd().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ymxh() != null)
			mTvYMXH.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ymxh().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_shshy() != null)
			mTvSHSXH.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_shshy().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ympjhl() != null)
			mTvYMPJHL.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ympjhl().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_tlsssffhyq() != null)
			mTvTLSSSFFHYQ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_tlsssffhyq().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_naxhl() != null)
			mTvNAXHL.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_naxhl().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ympjhdy() != null)
			mTvYMPJHA.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ympjhdy().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_tssssffhyq() != null)
			mTvTXSSSFFHYQ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_tssssffhyq().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_xcjc_time() != null)
			mTvXCJCSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_xcjc_time().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_yqtlsssfyx() != null)
			mTvYQTLSSSFYX.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_yqtlsssfyx().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_yqccsssfzzyx() != null)
			mTvYQCCSSSFZZYX.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_yqccsssfzzyx().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_wryzxjcxtsfzzyx() != null)
			mTvCEMSSFZZYX.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_wryzxjcxtsfzzyx().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_cemsxtxszdzxjcwrwyz() != null)
			mTvCEMSXSWRWYZ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_cemsxtxszdzxjcwrwyz().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfywzdsbywjltz() != null)
			mTvSFYYWTZ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfywzdsbywjltz().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_zxjcybqsfyhgz() != null)
			mTvYBQSFYHGZ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_zxjcybqsfyhgz().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfzyxqn() != null)
			mTvSFZYXQN.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfzyxqn().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfagdjxbd() != null)
			mTvSFAGDBD.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfagdjxbd().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_syjdwryzxjcsbsjsftgshbtsh() != null)
			mTvSFTGSH.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_syjdwryzxjcsbsjsftgshbtsh().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getCl_gjzzxjcsssj() != null)
			mTvZXJCSSSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getCl_gjzzxjcsssj().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getCl_zksfbskzxtsssj() != null)
			mTvSSSJFBW.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getCl_zksfbskzxtsssj().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ydplzt() != null)
			mTvYDPLZT.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ydplzt().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ccjz() != null)
			mTvCCJZ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ccjz().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_ccks_time() != null)
			mTvCCKSSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_ccks_time().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_ccjs_time() != null)
			mTvCCJSSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_ccjs_time().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sozg() != null)
			mTvSO2ZGW.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sozg().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sozd() != null)
			mTvSO2ZDW.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sozd().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_noxzg() != null)
			mTvNOxZGW.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_noxzg().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_yczg() != null)
			mTvNOxZDW.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_noxzd().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_yczg() != null)
			mTvYCZGW.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_yczg().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_yczd() != null)
			mTvYCZDW.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_yczd().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_hjjczmc() != null)
			mTvHJJCZMC.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_hjjczmc().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_jc_time() != null)
			mTvJCSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_jc_time().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_jcjz() != null)
			mTvJCJZ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_jcjz().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_so() != null)
			mTvSO2.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_so().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_nox() != null)
			mTvNOx.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_nox().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_yc() != null)
			mTvYC.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_yc().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_wrwpfsfcb() != null)
			mTvPFSFCB.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_wrwpfsfcb().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_cbyz() != null)
			mTvCBYZ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_cbyz().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_gffzcssfgf() != null)
			mTvGFFZCSSFGF.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_gffzcssfgf().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_fmhlzdgygfzhlyl() != null)
			mTvGFZHLYL.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_fmhlzdgygfzhlyl().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_zyzy() != null)
			mTvZYZY.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_zyzy().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_hzysjl() != null)
			mTvHZYSJL.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_hzysjl().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_gygfsglsdf() != null)
			mTvGYGFSFLSDF.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_gygfsglsdf().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_fmhcjccs() != null)
			mTvFMHCJCCS.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_fmhcjccs().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getCl_qthbbmjcqk() != null)
			mTvQTHBBMJCQK.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getCl_qthbbmjcqk().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ssgcsfcqlfycfyscs() != null)
			mTvCSGCCS.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_ssgcsfcqlfycfyscs().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sffxytdqk() != null)
			mTvSFYTD.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sffxytdqk().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfyxgtsxfsjfs() != null)
			mTvSFTSXF.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfyxgtsxfsjfs().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_hpyqwsfhjl() != null)
			mTvWSFHJLI.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_hpyqwsfhjl().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_jlnsfybhmb() != null)
			mTvSFYBHMB.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_jlnsfybhmb().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_bhmbjs_time() != null)
			mTvWSBHMBJSSJ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getDt_bhmbjs_time().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_zbhjbhqkms() != null)
			mTvZBBHQKMS.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_zbhjbhqkms().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sflsfxffsccs() != null)
			mTvSFLSFXFFDC.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sflsfxffsccs().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_fxffxswlsqkms() != null)
			mTvHJWLSQKMS.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_fxffxswlsqkms().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfbztfhjsjyjya() != null)
			mTvSFBZTHHJYA.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfbztfhjsjyjya().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfdtfhjsjyjyapgba() != null)
			mTvSFBZTHHJYAPGBA.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfdtfhjsjyjyapgba().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfjxndyjyl() != null)
			mTvSFJXNDYJYL.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfjxndyjyl().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfcbyjwz() != null)
			mTvSFCBYJWZ.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getVc_sfcbyjwz().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getCl_qthbbmjcqk() != null)
			mTvQQTHBBMJCQK.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getCl_qthbbmjcqk().toString());

		if (mFireElectricityEnterpriseTemplateBean.getData().get(0).getCl_czzywt() != null)
			mTvBCZZYWT.setText(mFireElectricityEnterpriseTemplateBean.getData().get(0).getCl_czzywt().toString());

	}
}
