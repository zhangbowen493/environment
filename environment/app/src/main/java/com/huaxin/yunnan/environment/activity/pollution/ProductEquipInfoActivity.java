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
import com.huaxin.yunnan.environment.bean.ProductEquipInfoBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_PRODUCTEQUIP_INFO;

public class ProductEquipInfoActivity extends BaseActicity implements View.OnClickListener, CallBack {

	private LinearLayout ll_no;
	private TextView title_text;
	private TextView wrybh;
	private TextView xh;
	private TextView sbmc;
	private TextView ggxh;
	private TextView sl;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_product_equip_info);
		initProgressDialog();
		Intent intent = getIntent();
		String t_task_list_id = intent.getStringExtra("uuid");
		initView();
		NetTool.PollutionPost(getApplicationContext(), t_task_list_id, URL_QUERY_PRODUCTEQUIP_INFO, ProductEquipInfoBean.class, this, yNProgressDialog);
	}

	private void initView() {
		ll_no = (LinearLayout) findViewById(R.id.ll_no);
		title_text = (TextView) findViewById(R.id.title_text);
		title_text.setText("污染源生产设备信息");

        title_text.setOnClickListener(this);
		wrybh = (TextView) findViewById(R.id.wrybh);
		wrybh.setOnClickListener(this);
		xh = (TextView) findViewById(R.id.xh);
		xh.setOnClickListener(this);
		sbmc = (TextView) findViewById(R.id.sbmc);
		sbmc.setOnClickListener(this);
		ggxh = (TextView) findViewById(R.id.ggxh);
		ggxh.setOnClickListener(this);
		sl = (TextView) findViewById(R.id.sl);
		sl.setOnClickListener(this);
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
		ProductEquipInfoBean resultBean = (ProductEquipInfoBean) o;
		if (resultBean.getSuccess().equals("1")) {
			if (resultBean.getData().getQueryData().size() >= 1) {
				if (resultBean.getData().getQueryData().get(0).getWrybh() == null) {
					wrybh.setText("");
				} else {
					wrybh.setText(resultBean.getData().getQueryData().get(0).getWrybh().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getXh() == null) {
					xh.setText("");
				} else {
					xh.setText(resultBean.getData().getQueryData().get(0).getXh().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getSbmc() == null) {
					sbmc.setText("");
				} else {
					sbmc.setText(resultBean.getData().getQueryData().get(0).getSbmc().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getGgxh() == null) {
					ggxh.setText("");
				} else {
					ggxh.setText(resultBean.getData().getQueryData().get(0).getGgxh().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getSl() == null) {
					sl.setText("");
				} else {
					sl.setText(resultBean.getData().getQueryData().get(0).getSl().toString());
				}
			} else {
				ToastUtils.showShort(getApplicationContext(), resultBean.getMsg());
			}


		} else {
			Toast.makeText(getApplicationContext(), resultBean.getMsg(), Toast.LENGTH_SHORT).show();
		}
	}
}
