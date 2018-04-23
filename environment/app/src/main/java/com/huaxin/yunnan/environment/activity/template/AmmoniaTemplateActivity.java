package com.huaxin.yunnan.environment.activity.template;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.Constant;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.bean.AmmoniaTemplateBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;
import com.zhy.http.okhttp.request.RequestCall;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_HRD_INFO;

/**
 * 2、合成氨行业现场检查记录模板
 */
public class AmmoniaTemplateActivity extends BaseActicity implements View.OnClickListener, CallBack {
	private TextView tvKSSJ;
	private TextView tvJSSJ;
	private TextView tvDD;
	private TextView tvJCR;
	private TextView tvZFZH;
	private TextView tvJLR;
	private TextView tvBJCDWMC;
	private TextView tvZZJGDMZH;
	private TextView tvFDDBR;
	private TextView tvFDDBRSFZH;
	private TextView tvXCFZR;
	private TextView tvXCFZRSFFZ;
	private TextView tvNL;
	private TextView tvGZDW;
	private TextView tvZW;
	private TextView tvYBAGX;
	private TextView tvDZ;
	private TextView tvDH;
	private TextView tvYZBM;
	private TextView tvQTCJRXMJDW;
	private TextView tvHBDWMC;
	private TextView tvHBDWLX;
	private TextView tvHJJCLX;
	private TextView tvSFQRZJ;
	private TextView tvSFSQHB;
	private TextView tvSZSZ;
	private TextView tvSZXQS;
	private TextView tvSZZX;
	private TextView tvSZXZC;
	private TextView tvGYYQ;
	private TextView tvPQ;
	private TextView tvXCJCSQK;
	private TextView tvZYCPHSCGY;
	private TextView tvXMMC;
	private TextView tvHJBZDW;
	private TextView tvHPBZSJ;
	private TextView tvSPDW;
	private TextView tvSPSJ;
	private TextView tvSPWH;
	private TextView tvSSCPFDW;
	private TextView tvSSCPFSJ;
	private TextView tvSSCPFWH;
	private TextView tvHBJGYSDW;
	private TextView tvHBJGYSSJ;
	private TextView tvHBJGYSWH;
	private TextView tvSFBZHPBGWJ;
	private TextView tvWBZQKMS;
	private TextView tvBZSFCZJDHPDJQK;
	private TextView tvJDHPDJQKMS;
	private TextView tvSFJGHBBMSP;
	private TextView tvWJSPQKMS;
	private TextView tvSFCZYJSP;
	private TextView tvYJSPQKMS;
	private TextView tvSSCSFJGHBBMSPTY;
	private TextView tvWJPZSZTRSSCQKMS;
	private TextView tvSFJGYS;
	private TextView tvSFCGYN;
	private TextView tvSFYBG;
	private TextView tvBGQKMS;
	private TextView tvSFQDPWXKZ;
	private TextView tvAZGDPFWW;
	private TextView tvWAGDQKMS;
	private TextView tvSFSQDJ;
	private TextView tvSFJNPWF;
	private TextView tvSJJNPWF;
	private TextView tvYJPWF;
	private TextView tvWZEJNPWFYY;
	private TextView tvPTHBSS;
	private TextView tvSFLS;
	private TextView tvWLSQKMS;
	private TextView tvJLNJCSFCB;
	private TextView tvCBYZJJCZ;
	private TextView tvJCDW;
	private TextView tvJCSJ;
	private TextView tvSFAZZXJCZZ;
	private TextView tvAZSJ;
	private TextView tvSFYHBBMLW;
	private TextView tvSFZCYX;
	private TextView tvSFJGJY;
	private TextView tvJYSJ;
	private TextView tvZXJCSJ;
	private TextView tvSCFSCSHJ;
	private TextView tvCSL;
	private TextView tvSCFSCLSS;
	private TextView tvCLL;
	private TextView tvPFYQ;
	private TextView tvBFHQKMS;
	private TextView tvSFSXFSFL;
	private TextView tvSFTPFS;
	private TextView tvQKSM;
	private TextView tvFSJLNJCSFCB;
	private TextView tvFSCBYZJJCZ;
	private TextView tvFSJCDW;
	private TextView tvFSJCSJ;
	private TextView tvFSSFAZZXJCZZ;
	private TextView tvFSAZSJ;
	private TextView tvFSSFYHBBMLW;
	private TextView tvFSSFYXZC;
	private TextView tvFSSFJGJY;
	private TextView tvFSJYSJ;
	private TextView tvFSZXJCSJXSW;
	private TextView tvMJYZCSL;
	private TextView tvMJYZCLCS;
	private TextView tvFKWYCSL;
	private TextView tvFKWYCLCS;
	private TextView tvQTWFZLJCSL;
	private TextView tvCLFSW;
	private TextView tvTZSFJQ;
	private TextView tvSFXHBBMSB;
	private TextView tvWSBDYNX;
	private TextView tvSFZZCSHYA;
	private TextView tvCDSFYBS;
	private TextView tvSFFHWXFWCCGF;
	private TextView tvSFYYBGFHD;
	private TextView tvLSDFSJSFCGYN;
	private TextView tvCWSFYYJDCZC;
	private TextView tvSFZZLDZD;
	private TextView tvYSCLSFJYXGZZ;
	private TextView tvYSL;
	private TextView tvJSDWSFFWZZ;
	private TextView tvSJCLFS;
	private TextView tvSFFHHP;
	private TextView tvHPBFHQKMS;
	private TextView tvSBSFCQCS;
	private TextView tvZSWLSQKMS;
	private TextView tvHPFHJL;
	private TextView tvJLNSFYBHMB;
	private TextView tvBHMBJSSJ;
	private TextView tvZBHJBHQKMS;
	private TextView tvSFLSPFYQ;
	private TextView tvHJPJWLSQKMS;
	private TextView tvSFBZYA;
	private TextView tvSFDYZPG;
	private TextView tvSFYJYL;
	private TextView tvSFCBYJWZ;
	private TextView tvQTHBBMJCQK;
	private TextView tvCZZYWT;
	private TextView tvJCYQ;
	private TextView titleText;
	private String t_detail_id;
	private RequestCall mRequestCall;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_template_ammonia);
		initProgressDialog();
		Intent intent = getIntent();
		String t_task_list_id = intent.getStringExtra("t_task_list_id");
		initView();
		NetTool.templatePost(getApplicationContext(), t_task_list_id, URL_QUERY_HRD_INFO, AmmoniaTemplateBean.class, this, yNProgressDialog);
	}

	private void initView() {
		tvKSSJ = (TextView) findViewById(R.id.tv_KSSJ);
		tvJSSJ = (TextView) findViewById(R.id.tv_JSSJ);
		tvDD = (TextView) findViewById(R.id.tv_DD);
		tvJCR = (TextView) findViewById(R.id.tv_JCR);
		tvZFZH = (TextView) findViewById(R.id.tv_ZFZH);
		tvJLR = (TextView) findViewById(R.id.tv_JLR);
		tvBJCDWMC = (TextView) findViewById(R.id.tv_BJCDWMC);
		tvZZJGDMZH = (TextView) findViewById(R.id.tv_ZZJGDMZH);
		tvFDDBR = (TextView) findViewById(R.id.tv_FDDBR);
		tvFDDBRSFZH = (TextView) findViewById(R.id.tv_FDDBRSFZH);
		tvXCFZR = (TextView) findViewById(R.id.tv_XCFZR);
		tvXCFZRSFFZ = (TextView) findViewById(R.id.tv_XCFZRSFFZ);
		tvNL = (TextView) findViewById(R.id.tv_NL);
		tvGZDW = (TextView) findViewById(R.id.tv_GZDW);
		tvZW = (TextView) findViewById(R.id.tv_ZW);
		tvYBAGX = (TextView) findViewById(R.id.tv_YBAGX);
		tvDZ = (TextView) findViewById(R.id.tv_DZ);
		tvDH = (TextView) findViewById(R.id.tv_DH);
		tvYZBM = (TextView) findViewById(R.id.tv_YZBM);
		tvQTCJRXMJDW = (TextView) findViewById(R.id.tv_QTCJRXMJDW);
		tvHBDWMC = (TextView) findViewById(R.id.tv_HBDWMC);
		tvHBDWLX = (TextView) findViewById(R.id.tv_HBDWLX);
		tvHJJCLX = (TextView) findViewById(R.id.tv_HJJCLX);
		tvSFQRZJ = (TextView) findViewById(R.id.tv_SFQRZJ);
		tvSFSQHB = (TextView) findViewById(R.id.tv_SFSQHB);
		tvSZSZ = (TextView) findViewById(R.id.tv_SZSZ);
		tvSZXQS = (TextView) findViewById(R.id.tv_SZXQS);
		tvSZZX = (TextView) findViewById(R.id.tv_SZZX);
		tvSZXZC = (TextView) findViewById(R.id.tv_SZXZC);
		tvGYYQ = (TextView) findViewById(R.id.tv_GYYQ);
		tvPQ = (TextView) findViewById(R.id.tv_PQ);
		tvXCJCSQK = (TextView) findViewById(R.id.tv_XCJCSQK);
		tvZYCPHSCGY = (TextView) findViewById(R.id.tv_ZYCPHSCGY);
		tvXMMC = (TextView) findViewById(R.id.tv_XMMC);
		tvHJBZDW = (TextView) findViewById(R.id.tv_HJBZDW);
		tvHPBZSJ = (TextView) findViewById(R.id.tv_HPBZSJ);
		tvSPDW = (TextView) findViewById(R.id.tv_SPDW);
		tvSPSJ = (TextView) findViewById(R.id.tv_SPSJ);
		tvSPWH = (TextView) findViewById(R.id.tv_SPWH);
		tvSSCPFDW = (TextView) findViewById(R.id.tv_SSCPFDW);
		tvSSCPFSJ = (TextView) findViewById(R.id.tv_SSCPFSJ);
		tvSSCPFWH = (TextView) findViewById(R.id.tv_SSCPFWH);
		tvHBJGYSDW = (TextView) findViewById(R.id.tv_HBJGYSDW);
		tvHBJGYSSJ = (TextView) findViewById(R.id.tv_HBJGYSSJ);
		tvHBJGYSWH = (TextView) findViewById(R.id.tv_HBJGYSWH);
		tvSFBZHPBGWJ = (TextView) findViewById(R.id.tv_SFBZHPBGWJ);
		tvWBZQKMS = (TextView) findViewById(R.id.tv_WBZQKMS);
		tvBZSFCZJDHPDJQK = (TextView) findViewById(R.id.tv_BZSFCZJDHPDJQK);
		tvJDHPDJQKMS = (TextView) findViewById(R.id.tv_JDHPDJQKMS);
		tvSFJGHBBMSP = (TextView) findViewById(R.id.tv_SFJGHBBMSP);
		tvWJSPQKMS = (TextView) findViewById(R.id.tv_WJSPQKMS);
		tvSFCZYJSP = (TextView) findViewById(R.id.tv_SFCZYJSP);
		tvYJSPQKMS = (TextView) findViewById(R.id.tv_YJSPQKMS);
		tvSSCSFJGHBBMSPTY = (TextView) findViewById(R.id.tv_SSCSFJGHBBMSPTY);
		tvWJPZSZTRSSCQKMS = (TextView) findViewById(R.id.tv_WJPZSZTRSSCQKMS);
		tvSFJGYS = (TextView) findViewById(R.id.tv_SFJGYS);
		tvSFCGYN = (TextView) findViewById(R.id.tv_SFCGYN);
		tvSFYBG = (TextView) findViewById(R.id.tv_SFYBG);
		tvBGQKMS = (TextView) findViewById(R.id.tv_BGQKMS);
		tvSFQDPWXKZ = (TextView) findViewById(R.id.tv_SFQDPWXKZ);
		tvAZGDPFWW = (TextView) findViewById(R.id.tv_AZGDPFWW);
		tvWAGDQKMS = (TextView) findViewById(R.id.tv_WAGDQKMS);
		tvSFSQDJ = (TextView) findViewById(R.id.tv_SFSQDJ);
		tvSFJNPWF = (TextView) findViewById(R.id.tv_SFJNPWF);
		tvSJJNPWF = (TextView) findViewById(R.id.tv_SJJNPWF);
		tvYJPWF = (TextView) findViewById(R.id.tv_YJPWF);
		tvWZEJNPWFYY = (TextView) findViewById(R.id.tv_WZEJNPWFYY);
		tvPTHBSS = (TextView) findViewById(R.id.tv_PTHBSS);
		tvSFLS = (TextView) findViewById(R.id.tv_SFLS);
		tvWLSQKMS = (TextView) findViewById(R.id.tv_WLSQKMS);
		tvJLNJCSFCB = (TextView) findViewById(R.id.tv_JLNJCSFCB);
		tvCBYZJJCZ = (TextView) findViewById(R.id.tv_CBYZJJCZ);
		tvJCDW = (TextView) findViewById(R.id.tv_JCDW);
		tvJCSJ = (TextView) findViewById(R.id.tv_JCSJ);
		tvSFAZZXJCZZ = (TextView) findViewById(R.id.tv_SFAZZXJCZZ);
		tvAZSJ = (TextView) findViewById(R.id.tv_AZSJ);
		tvSFYHBBMLW = (TextView) findViewById(R.id.tv_SFYHBBMLW);
		tvSFZCYX = (TextView) findViewById(R.id.tv_SFZCYX);
		tvSFJGJY = (TextView) findViewById(R.id.tv_SFJGJY);
		tvJYSJ = (TextView) findViewById(R.id.tv_JYSJ);
		tvZXJCSJ = (TextView) findViewById(R.id.tv_ZXJCSJ);
		tvSCFSCSHJ = (TextView) findViewById(R.id.tv_SCFSCSHJ);
		tvCSL = (TextView) findViewById(R.id.tv_CSL);
		tvSCFSCLSS = (TextView) findViewById(R.id.tv_SCFSCLSS);
		tvCLL = (TextView) findViewById(R.id.tv_CLL);
		tvPFYQ = (TextView) findViewById(R.id.tv_PFYQ);
		tvBFHQKMS = (TextView) findViewById(R.id.tv_BFHQKMS);
		tvSFSXFSFL = (TextView) findViewById(R.id.tv_SFSXFSFL);
		tvSFTPFS = (TextView) findViewById(R.id.tv_SFTPFS);
		tvQKSM = (TextView) findViewById(R.id.tv_QKSM);
		tvFSJLNJCSFCB = (TextView) findViewById(R.id.tv_FSJLNJCSFCB);
		tvFSCBYZJJCZ = (TextView) findViewById(R.id.tv_FSCBYZJJCZ);
		tvFSJCDW = (TextView) findViewById(R.id.tv_FSJCDW);
		tvFSJCSJ = (TextView) findViewById(R.id.tv_FSJCSJ);
		tvFSSFAZZXJCZZ = (TextView) findViewById(R.id.tv_FSSFAZZXJCZZ);
		tvFSAZSJ = (TextView) findViewById(R.id.tv_FSAZSJ);
		tvFSSFYHBBMLW = (TextView) findViewById(R.id.tv_FSSFYHBBMLW);
		tvFSSFYXZC = (TextView) findViewById(R.id.tv_FSSFYXZC);
		tvFSSFJGJY = (TextView) findViewById(R.id.tv_FSSFJGJY);
		tvFSJYSJ = (TextView) findViewById(R.id.tv_FSJYSJ);
		tvFSZXJCSJXSW = (TextView) findViewById(R.id.tv_FSZXJCSJXSW);
		tvMJYZCSL = (TextView) findViewById(R.id.tv_MJYZCSL);
		tvMJYZCLCS = (TextView) findViewById(R.id.tv_MJYZCLCS);
		tvFKWYCSL = (TextView) findViewById(R.id.tv_FKWYCSL);
		tvFKWYCLCS = (TextView) findViewById(R.id.tv_FKWYCLCS);
		tvQTWFZLJCSL = (TextView) findViewById(R.id.tv_QTWFZLJCSL);
		tvCLFSW = (TextView) findViewById(R.id.tv_CLFSW);
		tvTZSFJQ = (TextView) findViewById(R.id.tv_TZSFJQ);
		tvSFXHBBMSB = (TextView) findViewById(R.id.tv_SFXHBBMSB);
		tvWSBDYNX = (TextView) findViewById(R.id.tv_WSBDYNX);
		tvSFZZCSHYA = (TextView) findViewById(R.id.tv_SFZZCSHYA);
		tvCDSFYBS = (TextView) findViewById(R.id.tv_CDSFYBS);
		tvSFFHWXFWCCGF = (TextView) findViewById(R.id.tv_SFFHWXFWCCGF);
		tvSFYYBGFHD = (TextView) findViewById(R.id.tv_SFYYBGFHD);
		tvLSDFSJSFCGYN = (TextView) findViewById(R.id.tv_LSDFSJSFCGYN);
		tvCWSFYYJDCZC = (TextView) findViewById(R.id.tv_CWSFYYJDCZC);
		tvSFZZLDZD = (TextView) findViewById(R.id.tv_SFZZLDZD);
		tvYSCLSFJYXGZZ = (TextView) findViewById(R.id.tv_YSCLSFJYXGZZ);
		tvYSL = (TextView) findViewById(R.id.tv_YSL);
		tvJSDWSFFWZZ = (TextView) findViewById(R.id.tv_JSDWSFFWZZ);
		tvSJCLFS = (TextView) findViewById(R.id.tv_SJCLFS);
		tvSFFHHP = (TextView) findViewById(R.id.tv_SFFHHP);
		tvHPBFHQKMS = (TextView) findViewById(R.id.tv_HPBFHQKMS);
		tvSBSFCQCS = (TextView) findViewById(R.id.tv_SBSFCQCS);
		tvZSWLSQKMS = (TextView) findViewById(R.id.tv_ZSWLSQKMS);
		tvHPFHJL = (TextView) findViewById(R.id.tv_HPFHJL);
		tvJLNSFYBHMB = (TextView) findViewById(R.id.tv_JLNSFYBHMB);
		tvBHMBJSSJ = (TextView) findViewById(R.id.tv_BHMBJSSJ);
		tvZBHJBHQKMS = (TextView) findViewById(R.id.tv_ZBHJBHQKMS);
		tvSFLSPFYQ = (TextView) findViewById(R.id.tv_SFLSPFYQ);
		tvHJPJWLSQKMS = (TextView) findViewById(R.id.tv_HJPJWLSQKMS);
		tvSFBZYA = (TextView) findViewById(R.id.tv_SFBZYA);
		tvSFDYZPG = (TextView) findViewById(R.id.tv_SFDYZPG);
		tvSFYJYL = (TextView) findViewById(R.id.tv_SFYJYL);
		tvSFCBYJWZ = (TextView) findViewById(R.id.tv_SFCBYJWZ);
		tvQTHBBMJCQK = (TextView) findViewById(R.id.tv_QTHBBMJCQK);
		tvCZZYWT = (TextView) findViewById(R.id.tv_CZZYWT);
		tvJCYQ = (TextView) findViewById(R.id.tv_JCYQ);
		titleText = (TextView) findViewById(R.id.title_text);
		titleText.setText("合成氨行业现场检查记录");
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
		AmmoniaTemplateBean mAmmoniaTemplateBean = (AmmoniaTemplateBean) o;
		if (Constant.RESPONSE_SUCCESS.equals(mAmmoniaTemplateBean.getSuccess())) {
			initData(mAmmoniaTemplateBean);
		} else {
			LogUtils.e("请求失败，错误码：" + mAmmoniaTemplateBean.getSuccess() + "错误信息：" + mAmmoniaTemplateBean.getMsg());
		}
	}

	private void initData(AmmoniaTemplateBean mAmmoniaTemplateBean) {

		if (mAmmoniaTemplateBean.getData().get(0).getDt_start_time() != null)
			tvKSSJ.setText(mAmmoniaTemplateBean.getData().get(0).getDt_start_time().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getDt_end_time() != null)
			tvJSSJ.setText(mAmmoniaTemplateBean.getData().get(0).getDt_end_time().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_location() != null)
			tvDD.setText(mAmmoniaTemplateBean.getData().get(0).getVc_location().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_jcr() != null)
			tvJCR.setText(mAmmoniaTemplateBean.getData().get(0).getVc_jcr().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_zfzh() != null)
			tvZFZH.setText(mAmmoniaTemplateBean.getData().get(0).getVc_zfzh().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_jlr() != null)
			tvJLR.setText(mAmmoniaTemplateBean.getData().get(0).getVc_jlr().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_bjcdwmc() != null)
			tvBJCDWMC.setText(mAmmoniaTemplateBean.getData().get(0).getVc_bjcdwmc().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_zzjgdmzh() != null)
			tvZZJGDMZH.setText(mAmmoniaTemplateBean.getData().get(0).getVc_zzjgdmzh().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fddbr() != null)
			tvFDDBR.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fddbr().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fddbrsfzh() != null)
			tvFDDBRSFZH.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fddbrsfzh().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_xcfzr() != null)
			tvXCFZR.setText(mAmmoniaTemplateBean.getData().get(0).getVc_xcfzr().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_xcfzrsfzh() != null)
			tvXCFZRSFFZ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_xcfzrsfzh().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getNb_age() != null)
			tvNL.setText(mAmmoniaTemplateBean.getData().get(0).getNb_age().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_gzdw() != null)
			tvGZDW.setText(mAmmoniaTemplateBean.getData().get(0).getVc_gzdw().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_duty() != null)
			tvZW.setText(mAmmoniaTemplateBean.getData().get(0).getVc_duty().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_ybagx() != null)
			tvYBAGX.setText(mAmmoniaTemplateBean.getData().get(0).getVc_ybagx().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_address() != null)
			tvDZ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_address().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_telephone() != null)
			tvDH.setText(mAmmoniaTemplateBean.getData().get(0).getVc_telephone().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_yzbm() != null)
			tvYZBM.setText(mAmmoniaTemplateBean.getData().get(0).getVc_yzbm().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getCl_qtcjrxmjgzdw() != null)
			tvQTCJRXMJDW.setText(mAmmoniaTemplateBean.getData().get(0).getCl_qtcjrxmjgzdw().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_hbdwmc() != null)
			tvHBDWMC.setText(mAmmoniaTemplateBean.getData().get(0).getVc_hbdwmc().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_hbdwlx() != null)
			tvHBDWLX.setText(mAmmoniaTemplateBean.getData().get(0).getVc_hbdwlx().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_hjjclx() != null)
			tvHJJCLX.setText(mAmmoniaTemplateBean.getData().get(0).getVc_hjjclx().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sfqrzj() != null)
			tvSFQRZJ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sfqrzj().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sfsqhb() != null)
			tvSFSQHB.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sfsqhb().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_city() != null)
			tvSZSZ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_city().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_county() != null)
			tvSZXQS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_county().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_town() != null)
			tvSZZX.setText(mAmmoniaTemplateBean.getData().get(0).getVc_town().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_xzc() != null)
			tvSZXZC.setText(mAmmoniaTemplateBean.getData().get(0).getVc_xzc().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_gyyq() != null)
			tvGYYQ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_gyyq().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_pq() != null)
			tvPQ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_pq().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_xcjcsqk() != null)
			tvXCJCSQK.setText(mAmmoniaTemplateBean.getData().get(0).getVc_xcjcsqk().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_zycphscgy() != null)
			tvZYCPHSCGY.setText(mAmmoniaTemplateBean.getData().get(0).getVc_zycphscgy().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_xmmc() != null)
			tvXMMC.setText(mAmmoniaTemplateBean.getData().get(0).getVc_xmmc().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_hpbzdw() != null)
			tvHJBZDW.setText(mAmmoniaTemplateBean.getData().get(0).getVc_hpbzdw().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getDt_hpbz_time() != null)
			tvHPBZSJ.setText(mAmmoniaTemplateBean.getData().get(0).getDt_hpbz_time().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_spdw() != null)
			tvSPDW.setText(mAmmoniaTemplateBean.getData().get(0).getVc_spdw().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getDt_sp_time() != null)
			tvSPSJ.setText(mAmmoniaTemplateBean.getData().get(0).getDt_sp_time().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_spwh() != null)
			tvSPWH.setText(mAmmoniaTemplateBean.getData().get(0).getVc_spwh().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sscpfdw() != null)
			tvSSCPFDW.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sscpfdw().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getDt_sscpf_time() != null)
			tvSSCPFSJ.setText(mAmmoniaTemplateBean.getData().get(0).getDt_sscpf_time().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sscpfwh() != null)
			tvSSCPFWH.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sscpfwh().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_hbjgysdw() != null)
			tvHBJGYSDW.setText(mAmmoniaTemplateBean.getData().get(0).getVc_hbjgysdw().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getDt_hbjgys_time() != null)
			tvHBJGYSSJ.setText(mAmmoniaTemplateBean.getData().get(0).getDt_hbjgys_time().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_hbjgyswh() != null)
			tvHBJGYSWH.setText(mAmmoniaTemplateBean.getData().get(0).getVc_hbjgyswh().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sfbzhpbgwj() != null)
			tvSFBZHPBGWJ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sfbzhpbgwj().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_wbzqkms() != null)
			tvWBZQKMS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_wbzqkms().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_bzsfczjdhpdjdqk() != null)
			tvBZSFCZJDHPDJQK.setText(mAmmoniaTemplateBean.getData().get(0).getVc_bzsfczjdhpdjdqk().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_jdhpdjqkms() != null)
			tvJDHPDJQKMS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_jdhpdjqkms().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sfjghbbmsp() != null)
			tvSFJGHBBMSP.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sfjghbbmsp().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_wjspqkms() != null)
			tvWJSPQKMS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_wjspqkms().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sfczyjsp() != null)
			tvSFCZYJSP.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sfczyjsp().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_yjspqkms() != null)
			tvYJSPQKMS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_yjspqkms().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sscsfjghbbmspty() != null)
			tvSSCSFJGHBBMSPTY.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sscsfjghbbmspty().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_wjpzsztrsscqkms() != null)
			tvWJPZSZTRSSCQKMS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_wjpzsztrsscqkms().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sftghbbmxmjgys() != null)
			tvSFJGYS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sftghbbmxmjgys().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_wjyshtyyqssczjsfcgyn() != null)
			tvSFCGYN.setText(mAmmoniaTemplateBean.getData().get(0).getVc_wjyshtyyqssczjsfcgyn().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_qysyjsxmxzgmddssybg() != null)
			tvSFYBG.setText(mAmmoniaTemplateBean.getData().get(0).getVc_qysyjsxmxzgmddssybg().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_bgqkms() != null)
			tvBGQKMS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_bgqkms().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sfyfqdpwxkz() != null)
			tvSFQDPWXKZ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sfyfqdpwxkz().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_azpwxkzdgdpfwrw() != null)
			tvAZGDPFWW.setText(mAmmoniaTemplateBean.getData().get(0).getVc_azpwxkzdgdpfwrw().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_wagdqkms() != null)
			tvWAGDQKMS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_wagdqkms().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sfjxpwsbdj() != null)
			tvSFSQDJ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sfjxpwsbdj().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sfjnpwf() != null)
			tvSFJNPWF.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sfjnpwf().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_synsjjnpwf() != null)
			tvSJJNPWF.setText(mAmmoniaTemplateBean.getData().get(0).getVc_synsjjnpwf().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_yjpwf() != null)
			tvYJPWF.setText(mAmmoniaTemplateBean.getData().get(0).getVc_yjpwf().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_wzejnpwfyy() != null)
			tvWZEJNPWFYY.setText(mAmmoniaTemplateBean.getData().get(0).getVc_wzejnpwfyy().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getCl_gqyyzzpffqwryjpthbss() != null)
			tvPTHBSS.setText(mAmmoniaTemplateBean.getData().get(0).getCl_gqyyzzpffqwryjpthbss().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_hpbgjpfyqdfqzldccsjsssfls() != null)
			tvSFLS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_hpbgjpfyqdfqzldccsjsssfls().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getCl_wlsqkms() != null)
			tvWLSQKMS.setText(mAmmoniaTemplateBean.getData().get(0).getCl_wlsqkms().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fq_jlnjcsfcb() != null)
			tvJLNJCSFCB.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fq_jlnjcsfcb().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fq_cbyzjjczw() != null)
			tvCBYZJJCZ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fq_cbyzjjczw().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fq_jcdw() != null)
			tvJCDW.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fq_jcdw().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getDt_fqjc_time() != null)
			tvJCSJ.setText(mAmmoniaTemplateBean.getData().get(0).getDt_fqjc_time().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fq_sfazzxjczz() != null)
			tvSFAZZXJCZZ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fq_sfazzxjczz().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getDt_fqaz_time() != null)
			tvAZSJ.setText(mAmmoniaTemplateBean.getData().get(0).getDt_fqaz_time().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fq_sfyhbbmlw() != null)
			tvSFYHBBMLW.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fq_sfyhbbmlw().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fq_sfyyzc() != null)
			tvSFZCYX.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fq_sfyyzc().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fq_sfjgjy() != null)
			tvSFJGJY.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fq_sfjgjy().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getDt_fqjy_time() != null)
			tvJYSJ.setText(mAmmoniaTemplateBean.getData().get(0).getDt_fqjy_time().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fq_zxjcsj() != null)
			tvZXJCSJ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fq_zxjcsj().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fs_scfscshj() != null)
			tvSCFSCSHJ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fs_scfscshj().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fs_csl() != null)
			tvCSL.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fs_csl().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fs_scfsclss() != null)
			tvSCFSCLSS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fs_scfsclss().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fs_cll() != null)
			tvCLL.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fs_cll().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fsclsffhhpjpfyq() != null)
			tvPFYQ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fsclsffhhpjpfyq().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fs_bfhqkms() != null)
			tvBFHQKMS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fs_bfhqkms().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fs_sfsxfsfl() != null)
			tvSFSXFSFL.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fs_sfsxfsfl().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fs_sfcztpfs() != null)
			tvSFTPFS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fs_sfcztpfs().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fs_qksm() != null)
			tvQKSM.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fs_qksm().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fs_jlnjcsfcb() != null)
			tvFSJLNJCSFCB.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fs_jlnjcsfcb().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fs_cbyzjjcz() != null)
			tvFSCBYZJJCZ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fs_cbyzjjcz().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fs_jcdw() != null)
			tvFSJCDW.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fs_jcdw().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getDt_fs_jc_time() != null)
			tvFSJCSJ.setText(mAmmoniaTemplateBean.getData().get(0).getDt_fs_jc_time().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fs_sfazzxjczz() != null)
			tvFSSFAZZXJCZZ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fs_sfazzxjczz().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getDt_fs_az_time() != null)
			tvFSAZSJ.setText(mAmmoniaTemplateBean.getData().get(0).getDt_fs_az_time().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fs_sfyhbbmlw() != null)
			tvFSSFYHBBMLW.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fs_sfyhbbmlw().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fs_sfyxzc() != null)
			tvFSSFYXZC.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fs_sfyxzc().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fs_sfjgjy() != null)
			tvFSSFJGJY.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fs_sfjgjy().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getDt_fs_jy_time() != null)
			tvFSJYSJ.setText(mAmmoniaTemplateBean.getData().get(0).getDt_fs_jy_time().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fs_zxjcsjxs() != null)
			tvFSZXJCSJXSW.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fs_zxjcsjxs().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_mjyzcsl() != null)
			tvMJYZCSL.setText(mAmmoniaTemplateBean.getData().get(0).getVc_mjyzcsl().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_mjyczcs() != null)
			tvMJYZCLCS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_mjyczcs().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fkwycsl() != null)
			tvFKWYCSL.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fkwycsl().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fkwyczcs() != null)
			tvFKWYCLCS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fkwyczcs().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_qtwfzljcsl() != null)
			tvQTWFZLJCSL.setText(mAmmoniaTemplateBean.getData().get(0).getVc_qtwfzljcsl().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_qtwfclfs() != null)
			tvCLFSW.setText(mAmmoniaTemplateBean.getData().get(0).getVc_qtwfclfs().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_wxfwtzsfjqgf() != null)
			tvTZSFJQ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_wxfwtzsfjqgf().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sycsjczqksfxhbbmsb() != null)
			tvSFXHBBMSB.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sycsjczqksfxhbbmsb().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_wsbdynx() != null)
			tvWSBDYNX.setText(mAmmoniaTemplateBean.getData().get(0).getVc_wsbdynx().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sfzdlwxfwywsgffcshyjya() != null)
			tvSFZZCSHYA.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sfzdlwxfwywsgffcshyjya().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_wxfwcfkhcdsfsybs() != null)
			tvCDSFYBS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_wxfwcfkhcdsfsybs().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sffhwxfwccgf() != null)
			tvSFFHWXFWCCGF.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sffhwxfwccgf().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sfczwxfwyybgfhd() != null)
			tvSFYYBGFHD.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sfczwxfwyybgfhd().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_zcnlscfdcsjsfcgyn() != null)
			tvLSDFSJSFCGYN.setText(mAmmoniaTemplateBean.getData().get(0).getVc_zcnlscfdcsjsfcgyn().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_zcwsfjsyyjxdczc() != null)
			tvCWSFYYJDCZC.setText(mAmmoniaTemplateBean.getData().get(0).getVc_zcwsfjsyyjxdczc().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_rzyccsfzxwxfwzyldzd() != null)
			tvSFZZLDZD.setText(mAmmoniaTemplateBean.getData().get(0).getVc_rzyccsfzxwxfwzyldzd().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_ysclsfjyxgzz() != null)
			tvYSCLSFJYXGZZ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_ysclsfjyxgzz().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_ysl() != null)
			tvYSL.setText(mAmmoniaTemplateBean.getData().get(0).getVc_ysl().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_jsdwsfjywfjyzz() != null)
			tvJSDWSFFWZZ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_jsdwsfjywfjyzz().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sjczfs() != null)
			tvSJCLFS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sjczfs().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_gqyybgfdclfssffhhpjpfyq() != null)
			tvSFFHHP.setText(mAmmoniaTemplateBean.getData().get(0).getVc_gqyybgfdclfssffhhpjpfyq().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_bfhqkms() != null)
			tvHPBFHQKMS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_bfhqkms().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_gczsbsfahpjpfyqcqcs() != null)
			tvSBSFCQCS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_gczsbsfahpjpfyqcqcs().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_wlsqkms() != null)
			tvZSWLSQKMS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_wlsqkms().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_hpyqdfhjl() != null)
			tvHPFHJL.setText(mAmmoniaTemplateBean.getData().get(0).getVc_hpyqdfhjl().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_jlnsfybhmb() != null)
			tvJLNSFYBHMB.setText(mAmmoniaTemplateBean.getData().get(0).getVc_jlnsfybhmb().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getDt_bhmbjssh() != null)
			tvBHMBJSSJ.setText(mAmmoniaTemplateBean.getData().get(0).getDt_bhmbjssh().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_zbhjbhqkms() != null)
			tvZBHJBHQKMS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_zbhjbhqkms().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sflshpjpfyqdfxffdccs() != null)
			tvSFLSPFYQ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sflshpjpfyqdfxffdccs().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_fxcswlsqkms() != null)
			tvHJPJWLSQKMS.setText(mAmmoniaTemplateBean.getData().get(0).getVc_fxcswlsqkms().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sfbztfhjsjyjya() != null)
			tvSFBZYA.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sfbztfhjsjyjya().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sfdtfhjsjyjyajxpgba() != null)
			tvSFDYZPG.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sfdtfhjsjyjyajxpgba().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sfayayqjxndyjyl() != null)
			tvSFYJYL.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sfayayqjxndyjyl().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getVc_sfcbyjwz() != null)
			tvSFCBYJWZ.setText(mAmmoniaTemplateBean.getData().get(0).getVc_sfcbyjwz().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getCl_qthbbmjcqk() != null)
			tvQTHBBMJCQK.setText(mAmmoniaTemplateBean.getData().get(0).getCl_qthbbmjcqk().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getCl_czzywt() != null)
			tvCZZYWT.setText(mAmmoniaTemplateBean.getData().get(0).getCl_czzywt().toString());

		if (mAmmoniaTemplateBean.getData().get(0).getCl_jcyq() != null)
			tvJCYQ.setText(mAmmoniaTemplateBean.getData().get(0).getCl_jcyq().toString());
	}
}
