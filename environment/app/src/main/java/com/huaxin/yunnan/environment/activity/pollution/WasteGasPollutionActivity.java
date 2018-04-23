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
import com.huaxin.yunnan.environment.bean.WasteGasPollutionBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_WASTEGASPOLLUTION_INFO;

public class WasteGasPollutionActivity extends BaseActicity implements View.OnClickListener, CallBack {

	private LinearLayout ll_no;
	private TextView title_text;
	private TextView wrybh;
	private TextView pwkbh;
	private TextView wrwdm;
	private TextView pfbz;
	private TextView pfbzzdw;
	private TextView pfbzsz;
	private TextView pfbzzsx;
	private TextView pfbzzxx;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_waste_gas_pollution);
		initProgressDialog();
		Intent intent = getIntent();
		String t_task_list_id = intent.getStringExtra("uuid");
		initView();
		NetTool.PollutionPost(getApplicationContext(), t_task_list_id, URL_QUERY_WASTEGASPOLLUTION_INFO, WasteGasPollutionBean.class, this, yNProgressDialog);
	}

	private void initView() {
		ll_no = (LinearLayout) findViewById(R.id.ll_no);
		title_text = (TextView) findViewById(R.id.title_text);
		title_text.setText("污染源废气排放口排放污染物信息");

        title_text.setOnClickListener(this);
		wrybh = (TextView) findViewById(R.id.wrybh);
		wrybh.setOnClickListener(this);
		pwkbh = (TextView) findViewById(R.id.pwkbh);
		pwkbh.setOnClickListener(this);
		wrwdm = (TextView) findViewById(R.id.wrwdm);
		wrwdm.setOnClickListener(this);
		pfbz = (TextView) findViewById(R.id.pfbz);
		pfbz.setOnClickListener(this);
		pfbzzdw = (TextView) findViewById(R.id.pfbzzdw);
		pfbzzdw.setOnClickListener(this);
		pfbzsz = (TextView) findViewById(R.id.pfbzsz);
		pfbzsz.setOnClickListener(this);
		pfbzzsx = (TextView) findViewById(R.id.pfbzzsx);
		pfbzzsx.setOnClickListener(this);
		pfbzzxx = (TextView) findViewById(R.id.pfbzzxx);
		pfbzzxx.setOnClickListener(this);
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
		WasteGasPollutionBean resultBean = (WasteGasPollutionBean) o;
		if (resultBean.getSuccess().equals("1")) {
			if (resultBean.getData().getQueryData().size() >= 1) {
				if (resultBean.getData().getQueryData().get(0).getWrybh() == null) {
					wrybh.setText("");
				} else {
					wrybh.setText(resultBean.getData().getQueryData().get(0).getWrybh().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getPwkbh() == null) {
					pwkbh.setText("");
				} else {
					pwkbh.setText(resultBean.getData().getQueryData().get(0).getPwkbh().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getWrwdm() == null) {
					wrwdm.setText("");
				} else {
					wrwdm.setText(resultBean.getData().getQueryData().get(0).getWrwdm().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getPfbz() == null) {
					pfbz.setText("");
				} else {
					pfbz.setText(resultBean.getData().getQueryData().get(0).getPfbz().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getPfbzdw() == null) {
					pfbzzdw.setText("");
				} else {
					pfbzzdw.setText(resultBean.getData().getQueryData().get(0).getPfbzdw().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getPfbzsz() == null) {
					pfbzsz.setText("");
				} else {
					pfbzsz.setText(resultBean.getData().getQueryData().get(0).getPfbzsz().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getPfbzzsx() == null) {
					pfbzzsx.setText("");
				} else {
					pfbzzsx.setText(resultBean.getData().getQueryData().get(0).getPfbzzsx().toString());
				}

				if (resultBean.getData().getQueryData().get(0).getPfbzzsx() == null) {
					pfbzzxx.setText("");
				} else {
					pfbzzxx.setText(resultBean.getData().getQueryData().get(0).getPfbzzsx().toString());
				}
			} else {
				ToastUtils.showShort(getApplicationContext(), resultBean.getMsg());
			}

		} else {
			Toast.makeText(getApplicationContext(), resultBean.getMsg(), Toast.LENGTH_SHORT).show();
		}
	}
}
