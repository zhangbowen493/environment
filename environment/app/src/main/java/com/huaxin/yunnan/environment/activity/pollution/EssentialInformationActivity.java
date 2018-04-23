package com.huaxin.yunnan.environment.activity.pollution;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.ToastUtils;
import com.huaxin.yunnan.environment.bean.EssentialInformaBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_ESSENTIALINFORMATION_INFO;

public class  EssentialInformationActivity extends BaseActicity implements View.OnClickListener, CallBack {

	private LinearLayout ll_no;
	private TextView title_text;
	private TextView tv_WRYBH;
	private TextView wrymc;
	private TextView cymc;
	private TextView wryjc;
	private TextView zzjgdn;
	private TextView yyzzdm;
	private TextView sssf;
	private TextView ssds;
	private TextView ssqx;
	private TextView ssjd;
	private TextView wgdm;
	private TextView gxgs;
	private TextView ztz;
	private TextView hbtz;
	private TextView lsgx;
	private TextView jjlx;
	private TextView hydm;
	private TextView qygm;
	private TextView dwlx;
	private TextView frdb;
	private TextView lxdh;
	private TextView czhm;
	private TextView dwdz;
	private TextView yzbm;
	private TextView hblxr;
	private TextView hblxrdh;
	private TextView hblxrlxdz;
	private TextView wz;
	private TextView dzyx;
	private TextView jdd;
	private TextView jdf;
	private TextView jdm;
	private TextView wdd;
	private TextView wdf;
	private TextView wdm;
	private TextView zzdmj;
	private TextView szgyymc;
	private TextView kysj;
	private TextView tysj;
	private TextView zxgkjsj;
	private TextView pwsbdjh;
	private TextView pwxkzbh;
	private TextView wryjs;
	private TextView sczt;
	private TextView sfzx;
	private TextView zxsj;
	private TextView zxyy;
	private TextView bz;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_essential_information);
		initProgressDialog();
		Intent intent = getIntent();
		String t_task_list_id = intent.getStringExtra("uuid");
		Log.e("EssentialInformationAct", t_task_list_id);
		initView();
		NetTool.PollutionJBPost(getApplicationContext(), t_task_list_id, URL_QUERY_ESSENTIALINFORMATION_INFO, EssentialInformaBean.class, this, yNProgressDialog);

	}

	private void initView() {
		ll_no = (LinearLayout) findViewById(R.id.ll_no);
		title_text = (TextView) findViewById(R.id.title_text);
		title_text.setText("污染源基本信息");
        title_text.setOnClickListener(this);
		tv_WRYBH = (TextView) findViewById(R.id.tv_WRYBH);
		tv_WRYBH.setOnClickListener(this);
		wrymc = (TextView) findViewById(R.id.wrymc);
		wrymc.setOnClickListener(this);
		cymc = (TextView) findViewById(R.id.cymc);
		cymc.setOnClickListener(this);
		wryjc = (TextView) findViewById(R.id.wryjc);
		wryjc.setOnClickListener(this);
		zzjgdn = (TextView) findViewById(R.id.zzjgdn);
		zzjgdn.setOnClickListener(this);
		yyzzdm = (TextView) findViewById(R.id.yyzzdm);
		yyzzdm.setOnClickListener(this);
		sssf = (TextView) findViewById(R.id.sssf);
		sssf.setOnClickListener(this);
		ssds = (TextView) findViewById(R.id.ssds);
		ssds.setOnClickListener(this);
		ssqx = (TextView) findViewById(R.id.ssqx);
		ssqx.setOnClickListener(this);
		ssjd = (TextView) findViewById(R.id.ssjd);
		ssjd.setOnClickListener(this);
		wgdm = (TextView) findViewById(R.id.wgdm);
		wgdm.setOnClickListener(this);
		gxgs = (TextView) findViewById(R.id.gxgs);
		gxgs.setOnClickListener(this);
		ztz = (TextView) findViewById(R.id.ztz);
		ztz.setOnClickListener(this);
		hbtz = (TextView) findViewById(R.id.hbtz);
		hbtz.setOnClickListener(this);
		lsgx = (TextView) findViewById(R.id.lsgx);
		lsgx.setOnClickListener(this);
		jjlx = (TextView) findViewById(R.id.jjlx);
		jjlx.setOnClickListener(this);
		hydm = (TextView) findViewById(R.id.hydm);
		hydm.setOnClickListener(this);
		qygm = (TextView) findViewById(R.id.qygm);
		qygm.setOnClickListener(this);
		dwlx = (TextView) findViewById(R.id.dwlx);
		dwlx.setOnClickListener(this);
		frdb = (TextView) findViewById(R.id.frdb);
		frdb.setOnClickListener(this);
		lxdh = (TextView) findViewById(R.id.lxdh);
		lxdh.setOnClickListener(this);
		czhm = (TextView) findViewById(R.id.czhm);
		czhm.setOnClickListener(this);
		dwdz = (TextView) findViewById(R.id.dwdz);
		dwdz.setOnClickListener(this);
		yzbm = (TextView) findViewById(R.id.yzbm);
		yzbm.setOnClickListener(this);
		hblxr = (TextView) findViewById(R.id.hblxr);
		hblxr.setOnClickListener(this);
		hblxrdh = (TextView) findViewById(R.id.hblxrdh);
		hblxrdh.setOnClickListener(this);
		hblxrlxdz = (TextView) findViewById(R.id.hblxrlxdz);
		hblxrlxdz.setOnClickListener(this);
		wz = (TextView) findViewById(R.id.wz);
		wz.setOnClickListener(this);
		dzyx = (TextView) findViewById(R.id.dzyx);
		dzyx.setOnClickListener(this);
		jdd = (TextView) findViewById(R.id.jdd);
		jdd.setOnClickListener(this);
		jdf = (TextView) findViewById(R.id.jdf);
		jdf.setOnClickListener(this);
		jdm = (TextView) findViewById(R.id.jdm);
		jdm.setOnClickListener(this);
		wdd = (TextView) findViewById(R.id.wdd);
		wdd.setOnClickListener(this);
		wdf = (TextView) findViewById(R.id.wdf);
		wdf.setOnClickListener(this);
		wdm = (TextView) findViewById(R.id.wdm);
		wdm.setOnClickListener(this);
		zzdmj = (TextView) findViewById(R.id.zzdmj);
		zzdmj.setOnClickListener(this);
		szgyymc = (TextView) findViewById(R.id.szgyymc);
		szgyymc.setOnClickListener(this);
		kysj = (TextView) findViewById(R.id.kysj);
		kysj.setOnClickListener(this);
		tysj = (TextView) findViewById(R.id.tysj);
		tysj.setOnClickListener(this);
		zxgkjsj = (TextView) findViewById(R.id.zxgkjsj);
		zxgkjsj.setOnClickListener(this);
		pwsbdjh = (TextView) findViewById(R.id.pwsbdjh);
		pwsbdjh.setOnClickListener(this);
		pwxkzbh = (TextView) findViewById(R.id.pwxkzbh);
		pwxkzbh.setOnClickListener(this);
		wryjs = (TextView) findViewById(R.id.wryjs);
		wryjs.setOnClickListener(this);
		sczt = (TextView) findViewById(R.id.sczt);
		sczt.setOnClickListener(this);
		sfzx = (TextView) findViewById(R.id.sfzx);
		sfzx.setOnClickListener(this);
		zxsj = (TextView) findViewById(R.id.zxsj);
		zxsj.setOnClickListener(this);
		zxyy = (TextView) findViewById(R.id.zxyy);
		zxyy.setOnClickListener(this);
		bz = (TextView) findViewById(R.id.bz);
		bz.setOnClickListener(this);
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
		EssentialInformaBean resultBean = (EssentialInformaBean) o;
		if (resultBean.getSuccess().equals("1")) {
			if (resultBean.getData().getQueryData().size() >= 1) {
				if (resultBean.getData().getQueryData().get(0).getWrybh() == null) {
					tv_WRYBH.setText("");
				} else {
					tv_WRYBH.setText(resultBean.getData().getQueryData().get(0).getWrybh().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getWryjc() == null) {
					wryjc.setText("");
				} else {
					wryjc.setText(resultBean.getData().getQueryData().get(0).getWryjc().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getWrymc() == null) {
					wrymc.setText("");
				} else {
					wrymc.setText(resultBean.getData().getQueryData().get(0).getWrymc().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getCymc() == null) {
					cymc.setText("");
				} else {
					cymc.setText(resultBean.getData().getQueryData().get(0).getCymc().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getWryjc() == null) {
					wryjc.setText("");
				} else {
					wryjc.setText(resultBean.getData().getQueryData().get(0).getWryjc().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getZzjgdn() == null) {
					zzjgdn.setText("");
				} else {
					zzjgdn.setText(resultBean.getData().getQueryData().get(0).getZzjgdn().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getYyzzdm() == null) {
					yyzzdm.setText("");
				} else {
					yyzzdm.setText(resultBean.getData().getQueryData().get(0).getYyzzdm().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getSssf() == null) {
					sssf.setText("");
				} else {
					sssf.setText(resultBean.getData().getQueryData().get(0).getSssf().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getSsds() == null) {
					ssds.setText("");
				} else {
					ssds.setText(resultBean.getData().getQueryData().get(0).getSsds().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getSsqx() == null) {
					ssqx.setText("");
				} else {
					ssqx.setText(resultBean.getData().getQueryData().get(0).getSsqx().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getSsjd() == null) {
					ssjd.setText("");
				} else {
					ssjd.setText(resultBean.getData().getQueryData().get(0).getSsjd().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getQfgwgdm() == null) {
					wgdm.setText("");
				} else {
					wgdm.setText(resultBean.getData().getQueryData().get(0).getQfgwgdm().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getGxgs() == null) {
					gxgs.setText("");
				} else {
					gxgs.setText(resultBean.getData().getQueryData().get(0).getGxgs().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getZtz() == null) {
					ztz.setText("");
				} else {
					ztz.setText(resultBean.getData().getQueryData().get(0).getZtz().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getHbtz() == null) {
					hbtz.setText("");
				} else {
					hbtz.setText(resultBean.getData().getQueryData().get(0).getHbtz().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getLsgx() == null) {
					lsgx.setText("");
				} else {
					lsgx.setText(resultBean.getData().getQueryData().get(0).getLsgx().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getJjlx() == null) {
					jjlx.setText("");
				} else {
					jjlx.setText(resultBean.getData().getQueryData().get(0).getJjlx().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getHydm() == null) {
					hydm.setText("");
				} else {
					hydm.setText(resultBean.getData().getQueryData().get(0).getHydm().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getQygm() == null) {
					qygm.setText("");
				} else {
					qygm.setText(resultBean.getData().getQueryData().get(0).getQygm().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getDwlx() == null) {
					dwlx.setText("");
				} else {
					dwlx.setText(resultBean.getData().getQueryData().get(0).getDwlx().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getFrdb() == null) {
					frdb.setText("");
				} else {
					frdb.setText(resultBean.getData().getQueryData().get(0).getFrdb().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getLxdh() == null) {
					lxdh.setText("");
				} else {
					lxdh.setText(resultBean.getData().getQueryData().get(0).getLxdh().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getCzhm() == null) {
					czhm.setText("");
				} else {
					czhm.setText(resultBean.getData().getQueryData().get(0).getCzhm().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getDwdz() == null) {
					dwdz.setText("");
				} else {
					dwdz.setText(resultBean.getData().getQueryData().get(0).getDwdz().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getYzbm() == null) {
					yzbm.setText("");
				} else {
					yzbm.setText(resultBean.getData().getQueryData().get(0).getYzbm().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getHblxr() == null) {
					hblxr.setText("");
				} else {
					hblxr.setText(resultBean.getData().getQueryData().get(0).getHblxr().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getHblxrlxdz() == null) {
					hblxrlxdz.setText("");
				} else {
					hblxrlxdz.setText(resultBean.getData().getQueryData().get(0).getHblxrlxdz().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getHbrlxdh() == null) {
					hblxrdh.setText("");
				} else {
					hblxrdh.setText(resultBean.getData().getQueryData().get(0).getHbrlxdh().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getWzh() == null) {
					wz.setText("");
				} else {
					wz.setText(resultBean.getData().getQueryData().get(0).getWzh().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getDzyx() == null) {
					dzyx.setText("");
				} else {
					dzyx.setText(resultBean.getData().getQueryData().get(0).getDzyx().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getJdd() == null) {
					jdd.setText("");
				} else {
					jdd.setText(resultBean.getData().getQueryData().get(0).getJdd().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getJdf() == null) {
					jdf.setText("");
				} else {
					jdf.setText(resultBean.getData().getQueryData().get(0).getJdf().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getJdm() == null) {
					jdm.setText("");
				} else {
					jdm.setText(resultBean.getData().getQueryData().get(0).getJdm().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getWdd() == null) {
					wdd.setText("");
				} else {
					wdd.setText(resultBean.getData().getQueryData().get(0).getWdd().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getWdf() == null) {
					wdf.setText("");
				} else {
					wdf.setText(resultBean.getData().getQueryData().get(0).getWdf().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getWdm() == null) {
					wdm.setText("");
				} else {
					wdm.setText(resultBean.getData().getQueryData().get(0).getWdm().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getZzdmj() == null) {
					zzdmj.setText("");
				} else {
					zzdmj.setText(resultBean.getData().getQueryData().get(0).getZzdmj().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getSzgyymc() == null) {
					szgyymc.setText("");
				} else {
					szgyymc.setText(resultBean.getData().getQueryData().get(0).getSzgyymc().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getKysj() == null) {
					kysj.setText("");
				} else {
					kysj.setText(resultBean.getData().getQueryData().get(0).getKysj().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getTysj() == null) {
					tysj.setText("");
				} else {
					tysj.setText(resultBean.getData().getQueryData().get(0).getTysj().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getZhgkjsj() == null) {
					zxgkjsj.setText("");
				} else {
					zxgkjsj.setText(resultBean.getData().getQueryData().get(0).getZhgkjsj().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getPwsbdm() == null) {
					pwsbdjh.setText("");
				} else {
					pwsbdjh.setText(resultBean.getData().getQueryData().get(0).getPwsbdm().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getPwxkzbh() == null) {
					pwxkzbh.setText("");
				} else {
					pwxkzbh.setText(resultBean.getData().getQueryData().get(0).getPwxkzbh().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getWryjs() == null) {
					wryjs.setText("");
				} else {
					wryjs.setText(resultBean.getData().getQueryData().get(0).getWryjs().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getSczt() == null) {
					sczt.setText("");
				} else {
					sczt.setText(resultBean.getData().getQueryData().get(0).getSczt().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getSfqxgl() == null) {
					sfzx.setText("");
				} else {
					sfzx.setText(resultBean.getData().getQueryData().get(0).getSfqxgl().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getQxsj() == null) {
					zxsj.setText("");
				} else {
					zxsj.setText(resultBean.getData().getQueryData().get(0).getQxsj().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getQxyy() == null) {
					zxyy.setText("");
				} else {
					zxyy.setText(resultBean.getData().getQueryData().get(0).getQxyy().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getBz() == null) {
					bz.setText("");
				} else {
					bz.setText(resultBean.getData().getQueryData().get(0).getBz().toString());
				}
			} else {
				ToastUtils.showShort(getApplicationContext(), "数据为空！");
			}
		} else {
			Toast.makeText(getApplicationContext(), resultBean.getMsg(), Toast.LENGTH_SHORT).show();
		}
	}
}
