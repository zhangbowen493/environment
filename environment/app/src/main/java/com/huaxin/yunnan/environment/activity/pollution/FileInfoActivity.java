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
import com.huaxin.yunnan.environment.bean.FileInfoBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_FILEINFO_INFO;

public class FileInfoActivity extends BaseActicity implements View.OnClickListener, CallBack {

	private LinearLayout ll_no;
	private TextView title_text;
	private TextView wrybh;
	private TextView dabh;
	private TextView dalx;
	private TextView sfyx;
	private TextView damc;
	private TextView wjmc;
	private TextView wjhz;
	private TextView cflj;
	private TextView bz;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_file_info);
		initProgressDialog();
		Intent intent = getIntent();
		String t_task_list_id = intent.getStringExtra("uuid");
		initView();
		NetTool.PollutionPost(getApplicationContext(), t_task_list_id, URL_QUERY_FILEINFO_INFO, FileInfoBean.class, this, yNProgressDialog);
	}

	private void initView() {
		ll_no = (LinearLayout) findViewById(R.id.ll_no);
		title_text = (TextView) findViewById(R.id.title_text);
		title_text.setText("污染源档案信息");

        title_text.setOnClickListener(this);
		wrybh = (TextView) findViewById(R.id.wrybh);
		wrybh.setOnClickListener(this);
		dabh = (TextView) findViewById(R.id.dabh);
		dabh.setOnClickListener(this);
		dalx = (TextView) findViewById(R.id.dalx);
		dalx.setOnClickListener(this);
		sfyx = (TextView) findViewById(R.id.sfyx);
		sfyx.setOnClickListener(this);
		damc = (TextView) findViewById(R.id.damc);
		damc.setOnClickListener(this);
		wjmc = (TextView) findViewById(R.id.wjmc);
		wjmc.setOnClickListener(this);
		wjhz = (TextView) findViewById(R.id.wjhz);
		wjhz.setOnClickListener(this);
		cflj = (TextView) findViewById(R.id.cflj);
		cflj.setOnClickListener(this);
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
		FileInfoBean resultBean = (FileInfoBean) o;
		if (resultBean.getSuccess().equals("1")) {
			if (resultBean.getData().getQueryData().size() >= 1) {
				if (resultBean.getData().getQueryData().get(0).getWrybh() == null) {
					wrybh.setText("");
				} else {
					wrybh.setText(resultBean.getData().getQueryData().get(0).getWrybh().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getDabh() == null) {
					dabh.setText("");
				} else {
					dabh.setText(resultBean.getData().getQueryData().get(0).getDabh().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getDalx() == null) {
					dalx.setText("");
				} else {
					dalx.setText(resultBean.getData().getQueryData().get(0).getDalx().toString());
					dalx.setText("类型一");
				}
				if (resultBean.getData().getQueryData().get(0).getSfyx() == null) {
					sfyx.setText("");
				} else {
					sfyx.setText(resultBean.getData().getQueryData().get(0).getSfyx().toString());
					sfyx.setText("是");
				}
				if (resultBean.getData().getQueryData().get(0).getDamc() == null) {
					damc.setText("");
				} else {
					damc.setText(resultBean.getData().getQueryData().get(0).getDamc().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getWjmc() == null) {
					wjmc.setText("");
				} else {
					wjmc.setText(resultBean.getData().getQueryData().get(0).getWjmc().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getWjhz() == null) {
					wjhz.setText("");
				} else {
					wjhz.setText(resultBean.getData().getQueryData().get(0).getWjhz().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getCflj() == null) {
					cflj.setText("");
				} else {
					cflj.setText(resultBean.getData().getQueryData().get(0).getCflj().toString());
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
