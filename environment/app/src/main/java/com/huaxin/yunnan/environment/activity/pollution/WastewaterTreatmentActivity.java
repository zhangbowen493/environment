package com.huaxin.yunnan.environment.activity.pollution;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.bean.WastewaterTreatmentBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_WASTEWATEROUTFALL_INFO;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_WASTEWATERTREATMENT_INFO;

public class WastewaterTreatmentActivity extends BaseActicity implements View.OnClickListener, CallBack {

	private LinearLayout ll_no;
	private TextView title_text;
	private TextView wrybh;
	private TextView sclssbh;
	private TextView sclssmc;
	private TextView fslb;
	private TextView pwpbh;
	private TextView gdzcyz;
	private TextView ztze;
	private TextView sjclnl;
	private TextView sjclnl2;
	private TextView fsclff;
	private TextView nyxfy;
	private TextView tyrq;
	private TextView sbyxzt;
	private TextView bz;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pollutant_emission);

		initProgressDialog();
		Intent intent = getIntent();
		String t_task_list_id = intent.getStringExtra("uuid");
		initView();
		NetTool.PollutionPost(getApplicationContext(), t_task_list_id, URL_QUERY_WASTEWATERTREATMENT_INFO, WastewaterTreatmentBean.class, this, yNProgressDialog);
	}

	private void initView() {
		ll_no = (LinearLayout) findViewById(R.id.ll_no);
		title_text = (TextView) findViewById(R.id.title_text);
		title_text.setText("污染源废水治理设施信息");

		title_text.setOnClickListener(this);
		wrybh = (TextView) findViewById(R.id.wrybh);
		wrybh.setOnClickListener(this);
		sclssbh = (TextView) findViewById(R.id.sclssbh);
		sclssbh.setOnClickListener(this);
		sclssmc = (TextView) findViewById(R.id.sclssmc);
		sclssmc.setOnClickListener(this);
		fslb = (TextView) findViewById(R.id.fslb);
		fslb.setOnClickListener(this);
		pwpbh = (TextView) findViewById(R.id.pwpbh);
		pwpbh.setOnClickListener(this);
		gdzcyz = (TextView) findViewById(R.id.gdzcyz);
		gdzcyz.setOnClickListener(this);
		ztze = (TextView) findViewById(R.id.ztze);
		ztze.setOnClickListener(this);
		sjclnl = (TextView) findViewById(R.id.sjclnl);
		sjclnl2 = (TextView) findViewById(R.id.sjclnl2);
		sjclnl.setOnClickListener(this);
		fsclff = (TextView) findViewById(R.id.fsclff);
		fsclff.setOnClickListener(this);
		nyxfy = (TextView) findViewById(R.id.nyxfy);
		nyxfy.setOnClickListener(this);
		tyrq = (TextView) findViewById(R.id.tyrq);
		tyrq.setOnClickListener(this);
		sbyxzt = (TextView) findViewById(R.id.sbyxzt);
		sbyxzt.setOnClickListener(this);
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
		WastewaterTreatmentBean resultBean = (WastewaterTreatmentBean) o;
		if (resultBean.getSuccess().equals("1")) {
			if (resultBean.getData().getQueryData().get(0).getWrybh() == null) {
				wrybh.setText("");
			} else {
				wrybh.setText(resultBean.getData().getQueryData().get(0).getWrybh().toString());
			}
			if (resultBean.getData().getQueryData().get(0).getSclssbh() == null) {
				sclssbh.setText("");
			} else {
				sclssbh.setText(resultBean.getData().getQueryData().get(0).getSclssbh().toString());
			}
			if (resultBean.getData().getQueryData().get(0).getSclssmc() == null) {
				sclssmc.setText("");
			} else {
				sclssmc.setText(resultBean.getData().getQueryData().get(0).getSclssmc().toString());
			}
			if (resultBean.getData().getQueryData().get(0).getFslb() == null) {
				fslb.setText("");
			} else {
				fslb.setText(resultBean.getData().getQueryData().get(0).getFslb().toString());
				fslb.setText("类别一");
			}
			if (resultBean.getData().getQueryData().get(0).getPwkbh() == null) {
				pwpbh.setText("");
			} else {
				pwpbh.setText(resultBean.getData().getQueryData().get(0).getPwkbh().toString());
			}
			String yz = resultBean.getData().getQueryData().get(0).getGdzcyz() + "";
			if (yz == null) {
				gdzcyz.setText("");
			} else {
				gdzcyz.setText(yz);
			}
			String ze = resultBean.getData().getQueryData().get(0).getZtz() + "";
			if (ze == null) {
				ztze.setText("");
			} else {
				ztze.setText(ze);
			}

			if ((resultBean.getData().getQueryData().get(0).getSjclnl() + "") == null) {
				sjclnl.setText("");
			} else {
				sjclnl.setText(resultBean.getData().getQueryData().get(0).getSjclnl() + "");
			}
			if ((resultBean.getData().getQueryData().get(0).getSjclnli() + "") == null) {
				sjclnl2.setText("");
			} else {
				sjclnl2.setText(resultBean.getData().getQueryData().get(0).getSjclnli() + "");
			}
			if (resultBean.getData().getQueryData().get(0).getFsclff() == null) {
				fsclff.setText("");
			} else {
				fsclff.setText(resultBean.getData().getQueryData().get(0).getFsclff().toString());
			}
			if ((resultBean.getData().getQueryData().get(0).getNyxfy() + "") == null) {
				nyxfy.setText("");
			} else {
				nyxfy.setText(resultBean.getData().getQueryData().get(0).getNyxfy() + "");
			}
			if (resultBean.getData().getQueryData().get(0).getTyrq() == null) {
				tyrq.setText("");
			} else {
				tyrq.setText(resultBean.getData().getQueryData().get(0).getTyrq().toString());
			}
			if (resultBean.getData().getQueryData().get(0).getSsyxzt() == null) {
				sbyxzt.setText("");
			} else {
				sbyxzt.setText(resultBean.getData().getQueryData().get(0).getSsyxzt().toString());
				sbyxzt.setText("正常");
			}
			if (resultBean.getData().getQueryData().get(0).getBz() == null) {
				bz.setText("");
			} else {
				bz.setText(resultBean.getData().getQueryData().get(0).getBz().toString());
			}
		} else {
			Toast.makeText(getApplicationContext(), resultBean.getMsg(), Toast.LENGTH_SHORT).show();
		}
	}
}

