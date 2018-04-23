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
import com.huaxin.yunnan.environment.bean.NosiceSourceInfoBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_NOSICESOURCE_INFO;

public class NosiceSourceInfoActivity extends BaseActicity implements View.OnClickListener, CallBack {

	private LinearLayout ll_no;
	private TextView title_text;
	private TextView wrybh;
	private TextView zsybh;
	private TextView xh;
	private TextView cdwz;
	private TextView sybzlx;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nosice_source_info);
		initProgressDialog();
		Intent intent = getIntent();
		String t_task_list_id = intent.getStringExtra("uuid");
		initView();
		NetTool.PollutionPost(getApplicationContext(), t_task_list_id, URL_QUERY_NOSICESOURCE_INFO, NosiceSourceInfoBean.class, this, yNProgressDialog);
	}

	private void initView() {
		ll_no = (LinearLayout) findViewById(R.id.ll_no);
		title_text = (TextView) findViewById(R.id.title_text);
		title_text.setText("污染源噪声源测点信息");

        title_text.setOnClickListener(this);
		wrybh = (TextView) findViewById(R.id.wrybh);
		wrybh.setOnClickListener(this);
		zsybh = (TextView) findViewById(R.id.zsybh);
		zsybh.setOnClickListener(this);
		xh = (TextView) findViewById(R.id.xh);
		xh.setOnClickListener(this);
		cdwz = (TextView) findViewById(R.id.cdwz);
		cdwz.setOnClickListener(this);
		sybzlx = (TextView) findViewById(R.id.sybzlx);
		sybzlx.setOnClickListener(this);
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
		NosiceSourceInfoBean resultBean = (NosiceSourceInfoBean) o;
		if (resultBean.getSuccess().equals("1")) {
			if (resultBean.getData().getQueryData().size() >= 1) {
				if (resultBean.getData().getQueryData().get(0).getWrybh() == null) {
					wrybh.setText("");
				} else {
					wrybh.setText(resultBean.getData().getQueryData().get(0).getWrybh().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getZsybh() == null) {
					zsybh.setText("");
				} else {
					zsybh.setText(resultBean.getData().getQueryData().get(0).getZsybh().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getXh() == null) {
					xh.setText("");
				} else {
					xh.setText(resultBean.getData().getQueryData().get(0).getXh().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getCdwz() == null) {
					cdwz.setText("");
				} else {
					cdwz.setText(resultBean.getData().getQueryData().get(0).getCdwz().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getSybzlx() == null) {
					sybzlx.setText("");
				} else {
					sybzlx.setText(resultBean.getData().getQueryData().get(0).getSybzlx().toString());
					sybzlx.setText("类型一");
				}
			} else {
				ToastUtils.showShort(getApplicationContext(), resultBean.getMsg());
			}
		} else {
			Toast.makeText(getApplicationContext(),  resultBean.getMsg(), Toast.LENGTH_SHORT).show();
		}
	}
}
