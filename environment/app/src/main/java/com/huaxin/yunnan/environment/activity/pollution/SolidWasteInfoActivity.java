package com.huaxin.yunnan.environment.activity.pollution;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.ToastUtils;
import com.huaxin.yunnan.environment.bean.SolidWasteInfoBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_SOLIDWASTE_INFO;

public class SolidWasteInfoActivity extends BaseActicity implements View.OnClickListener, CallBack {

	private LinearLayout ll_no;
	private TextView title_text;
	private TextView wrybh;
	private TextView gtfwlbbh;
	private TextView gtfwlbmc;
	private TextView gtfwxldm;
	private TextView clfs;
	private TextView sfwf;
	private TextView bz;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_solid_waste_info);
		initProgressDialog();
		Intent intent = getIntent();
		String t_task_list_id = intent.getStringExtra("uuid");
		initView();
		NetTool.PollutionPost(getApplicationContext(), t_task_list_id, URL_QUERY_SOLIDWASTE_INFO, SolidWasteInfoBean.class, this, yNProgressDialog);
	}

	private void initView() {
		ll_no = (LinearLayout) findViewById(R.id.ll_no);
		title_text = (TextView) findViewById(R.id.title_text);
		title_text.setText("污染源产生固体废物信息");

		title_text.setOnClickListener(this);
		wrybh = (TextView) findViewById(R.id.wrybh);
		wrybh.setOnClickListener(this);
		gtfwlbbh = (TextView) findViewById(R.id.gtfwlbbh);
		gtfwlbbh.setOnClickListener(this);
		gtfwlbmc = (TextView) findViewById(R.id.gtfwlbmc);
		gtfwlbmc.setOnClickListener(this);
		gtfwxldm = (TextView) findViewById(R.id.gtfwxldm);
		gtfwxldm.setOnClickListener(this);
		clfs = (TextView) findViewById(R.id.clfs);
		clfs.setOnClickListener(this);
		sfwf = (TextView) findViewById(R.id.sfwf);
		sfwf.setOnClickListener(this);
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
		SolidWasteInfoBean resultBean = (SolidWasteInfoBean) o;
		if (resultBean.getSuccess().equals("1")) {
			if (resultBean.getData().getQueryData().size() >= 1) {
				if (resultBean.getData().getQueryData().get(0).getWrybh() == null) {
					wrybh.setText("");
				} else {
					wrybh.setText(resultBean.getData().getQueryData().get(0).getWrybh().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getGtfwlbbh() == null) {
					gtfwlbbh.setText("");
				} else {
					gtfwlbbh.setText(resultBean.getData().getQueryData().get(0).getGtfwlbbh().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getGtfwmc() == null) {
					gtfwlbmc.setText("");
				} else {
					gtfwlbmc.setText(resultBean.getData().getQueryData().get(0).getGtfwmc().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getGtfwfldm() == null) {
					gtfwxldm.setText("");
				} else {
					gtfwxldm.setText(resultBean.getData().getQueryData().get(0).getGtfwfldm().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getClfs() == null) {
					clfs.setText("");
				} else {
					clfs.setText(resultBean.getData().getQueryData().get(0).getClfs().toString());
					clfs.setText("方式一");
				}
				if (resultBean.getData().getQueryData().get(0).getSfwf() == null) {
					sfwf.setText("");
				} else {
					sfwf.setText(resultBean.getData().getQueryData().get(0).getSfwf().toString());
					sfwf.setText("是");
				}
				if (resultBean.getData().getQueryData().get(0).getBz() == null) {
					bz.setText("");
				} else {
					bz.setText(resultBean.getData().getQueryData().get(0).getBz().toString());
				}
			} else {
				ToastUtils.showShort(getApplicationContext(), resultBean.getMsg());
			}

		} else {
			Toast.makeText(getApplicationContext(),resultBean.getMsg(), Toast.LENGTH_SHORT).show();
		}
	}
}
