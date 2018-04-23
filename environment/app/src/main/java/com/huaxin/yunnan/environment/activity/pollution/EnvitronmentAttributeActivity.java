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
import com.huaxin.yunnan.environment.bean.EnvitronmentAttributeBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_ENVIRONMENTATTRIBUTE_INFO;

public class EnvitronmentAttributeActivity extends BaseActicity implements View.OnClickListener, CallBack {

	private LinearLayout ll_no;
	private TextView title_text;
	private TextView wrybh;
	private TextView lydm;
	private TextView sygnqjb;
	private TextView zsgnqjb;
	private TextView kqgnqjb;
	private TextView hygnqjb;
	private TextView sfsyq;
	private TextView sybhqjb;
	private TextView sybhqdm;
	private TextView sfs02kzq;
	private TextView sfsykzq;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_envitronment_attribute);
		initProgressDialog();
		Intent intent = getIntent();
		String t_task_list_id = intent.getStringExtra("uuid");
		initView();
		NetTool.PollutionPost(getApplicationContext(), t_task_list_id, URL_QUERY_ENVIRONMENTATTRIBUTE_INFO, EnvitronmentAttributeBean.class, this, yNProgressDialog);
	}

	private void initView() {
		ll_no = (LinearLayout) findViewById(R.id.ll_no);
		title_text = (TextView) findViewById(R.id.title_text);
		title_text.setText("污染源环境属性信息");
		title_text.setOnClickListener(this);
		wrybh = (TextView) findViewById(R.id.wrybh);
		wrybh.setOnClickListener(this);
		lydm = (TextView) findViewById(R.id.lydm);
		lydm.setOnClickListener(this);
		sygnqjb = (TextView) findViewById(R.id.sygnqjb);
		sygnqjb.setOnClickListener(this);
		zsgnqjb = (TextView) findViewById(R.id.zsgnqjb);
		zsgnqjb.setOnClickListener(this);
		kqgnqjb = (TextView) findViewById(R.id.kqgnqjb);
		kqgnqjb.setOnClickListener(this);
		hygnqjb = (TextView) findViewById(R.id.hygnqjb);
		hygnqjb.setOnClickListener(this);
		sfsyq = (TextView) findViewById(R.id.sfsyq);
		sfsyq.setOnClickListener(this);
		sybhqjb = (TextView) findViewById(R.id.sybhqjb);
		sybhqjb.setOnClickListener(this);
		sybhqdm = (TextView) findViewById(R.id.sybhqdm);
		sybhqdm.setOnClickListener(this);
		sfs02kzq = (TextView) findViewById(R.id.sfs02kzq);
		sfs02kzq.setOnClickListener(this);
		sfsykzq = (TextView) findViewById(R.id.sfsykzq);
		sfsykzq.setOnClickListener(this);
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
		EnvitronmentAttributeBean resultBean = (EnvitronmentAttributeBean) o;
		if (resultBean.getSuccess().equals("1")) {
			if (resultBean.getData().getQueryData().size() >= 1) {
				if (resultBean.getData().getQueryData().get(0).getWrybh() == null) {
					wrybh.setText("");
				} else {
					wrybh.setText(resultBean.getData().getQueryData().get(0).getWrybh().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getLydm() == null) {
					lydm.setText("");
				} else {
					lydm.setText(resultBean.getData().getQueryData().get(0).getLydm().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getSygnqjb() == null) {
					sygnqjb.setText("");
				} else {
					switch (resultBean.getData().getQueryData().get(0).getSygnqjb().toString()) {
						case "0":
							sygnqjb.setText("一级");
							break;
						case "1":
							sygnqjb.setText("二级");
							break;
						case "2":
							sygnqjb.setText("三级");
							break;
						case "3":
							sygnqjb.setText("四级");
							break;
					}
				}
				if (resultBean.getData().getQueryData().get(0).getZsgnqjb() == null) {
					zsgnqjb.setText("");
				} else {
					switch (resultBean.getData().getQueryData().get(0).getZsgnqjb().toString()) {
						case "0":
							zsgnqjb.setText("一级");
							break;
						case "1":
							zsgnqjb.setText("二级");
							break;
						case "2":
							zsgnqjb.setText("三级");
							break;
						case "3":
							zsgnqjb.setText("四级");
							break;
					}
				}
				if (resultBean.getData().getQueryData().get(0).getKqgnqjb() == null) {
					kqgnqjb.setText("");
				} else {
					switch (resultBean.getData().getQueryData().get(0).getKqgnqjb().toString()) {
						case "0":
							kqgnqjb.setText("一级");
							break;
						case "1":
							kqgnqjb.setText("二级");
							break;
						case "2":
							kqgnqjb.setText("三级");
							break;
						case "3":
							kqgnqjb.setText("四级");
							break;
					}
				}
				if (resultBean.getData().getQueryData().get(0).getHygnqjb() == null) {
					hygnqjb.setText("");
				} else {
					switch (resultBean.getData().getQueryData().get(0).getHygnqjb().toString()) {
						case "0":
							hygnqjb.setText("一级");
							break;
						case "1":
							hygnqjb.setText("二级");
							break;
						case "2":
							hygnqjb.setText("三级");
							break;
						case "3":
							hygnqjb.setText("四级");
							break;
					}
				}
				if (resultBean.getData().getQueryData().get(0).getSfsyq() == null) {
					sfsyq.setText("");
				} else {
					switch (resultBean.getData().getQueryData().get(0).getSfsyq().toString()) {
						case "0":
							sfsyq.setText("否");
							break;
						case "1":
							sfsyq.setText("是");
							break;
					}
				}
				if (resultBean.getData().getQueryData().get(0).getSybhqjb() == null) {
					sybhqjb.setText("");
				} else {
					switch (resultBean.getData().getQueryData().get(0).getSybhqjb().toString()) {
						case "0":
							sybhqjb.setText("一级");
							break;
						case "1":
							sybhqjb.setText("二级");
							break;
						case "2":
							sybhqjb.setText("三级");
							break;
						case "3":
							sybhqjb.setText("四级");
							break;
					}
				}
				if (resultBean.getData().getQueryData().get(0).getSybhqdm() == null) {
					sybhqdm.setText("");
				} else {
					sybhqdm.setText(resultBean.getData().getQueryData().get(0).getSybhqdm().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getSfso2kzq() == null) {
					sfs02kzq.setText("");
				} else {
					switch (resultBean.getData().getQueryData().get(0).getSfso2kzq().toString()) {
						case "0":
							sfs02kzq.setText("否");
							break;
						case "1":
							sfs02kzq.setText("是");
							break;
					}
				}
				if (resultBean.getData().getQueryData().get(0).getSfsykzq() == null) {
					sfsykzq.setText("");
				} else {
					switch (resultBean.getData().getQueryData().get(0).getSfsykzq().toString()) {
						case "0":
							sfsykzq.setText("否");
							break;
						case "1":
							sfsykzq.setText("是");
							break;
					}
				}
			} else {
				ToastUtils.showShort(getApplicationContext(), "数据为空！");
			}
		} else {
			Toast.makeText(getApplicationContext(), resultBean.getMsg(), Toast.LENGTH_SHORT).show();
		}
	}

}
