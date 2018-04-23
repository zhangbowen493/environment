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
import com.huaxin.yunnan.environment.bean.WasteWaterOutFallBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_WASTEWATEROUTFALL_INFO;
import static com.huaxin.yunnan.environment.Constant.URL_QUERY_WASTEWATERTREATMENT_INFO;

public class WasteWaterOutFallActivity extends BaseActicity implements View.OnClickListener, CallBack {

	private LinearLayout ll_no;
	private TextView title_text;
	private TextView wrybh;
	private TextView pwkbh;
	private TextView pwkmc;
	private TextView pwkwz;
	private TextView pfqxlb;
	private TextView pfgl;
	private TextView jnwsstdm;
	private TextView jngwdm;
	private TextView prwsclcdm;
	private TextView prwsclcmc;
	private TextView rhkjd;
	private TextView rhkwd;
	private TextView zxbz;
	private TextView sfazzxjkss;
	private TextView bzpazxs;
	private TextView jdd;
	private TextView jdf;
	private TextView jdm;
	private TextView wdd;
	private TextView wdf;
	private TextView wdm;
	private TextView bz;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_waste_water_out_fall);
		initProgressDialog();
		Intent intent = getIntent();
		String t_task_list_id = intent.getStringExtra("uuid");
		initView();
		NetTool.PollutionPost(getApplicationContext(), t_task_list_id, URL_QUERY_WASTEWATEROUTFALL_INFO, WasteWaterOutFallBean.class, this, yNProgressDialog);
	}

	private void initView() {
		ll_no = (LinearLayout) findViewById(R.id.ll_no);
		title_text = (TextView) findViewById(R.id.title_text);
		title_text.setText("污染源废水排放口信息");

        title_text.setOnClickListener(this);
		wrybh = (TextView) findViewById(R.id.wrybh);
		wrybh.setOnClickListener(this);
		pwkbh = (TextView) findViewById(R.id.pwkbh);
		pwkbh.setOnClickListener(this);
		pwkmc = (TextView) findViewById(R.id.pwkmc);
		pwkmc.setOnClickListener(this);
		pwkwz = (TextView) findViewById(R.id.pwkwz);
		pwkwz.setOnClickListener(this);
		pfqxlb = (TextView) findViewById(R.id.pfqxlb);
		pfqxlb.setOnClickListener(this);
		pfgl = (TextView) findViewById(R.id.pfgl);
		pfgl.setOnClickListener(this);
		jnwsstdm = (TextView) findViewById(R.id.jnwsstdm);
		jnwsstdm.setOnClickListener(this);
		jngwdm = (TextView) findViewById(R.id.jngwdm);
		jngwdm.setOnClickListener(this);
		prwsclcdm = (TextView) findViewById(R.id.prwsclcdm);
		prwsclcdm.setOnClickListener(this);
		prwsclcmc = (TextView) findViewById(R.id.prwsclcmc);
		prwsclcmc.setOnClickListener(this);
		rhkjd = (TextView) findViewById(R.id.rhkjd);
		rhkjd.setOnClickListener(this);
		rhkwd = (TextView) findViewById(R.id.rhkwd);
		rhkwd.setOnClickListener(this);
		zxbz = (TextView) findViewById(R.id.zxbz);
		zxbz.setOnClickListener(this);
		sfazzxjkss = (TextView) findViewById(R.id.sfazzxjkss);
		sfazzxjkss.setOnClickListener(this);
		bzpazxs = (TextView) findViewById(R.id.bzpazxs);
		bzpazxs.setOnClickListener(this);
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
		WasteWaterOutFallBean resultBean = (WasteWaterOutFallBean) o;
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
				if (resultBean.getData().getQueryData().get(0).getPwkmc() == null) {
					pwkmc.setText("");
				} else {
					pwkmc.setText(resultBean.getData().getQueryData().get(0).getPwkmc().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getPwkwz() == null) {
					pwkwz.setText("");
				} else {
					pwkwz.setText(resultBean.getData().getQueryData().get(0).getPwkwz().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getPfqxlb() == null) {
					pfqxlb.setText("");
				} else {
					pfqxlb.setText(resultBean.getData().getQueryData().get(0).getPfqxlb().toString());
					pfqxlb.setText("类别一");
				}
				if (resultBean.getData().getQueryData().get(0).getPfgl() == null) {
					pfgl.setText("");
				} else {
					pfgl.setText(resultBean.getData().getQueryData().get(0).getPfgl().toString());
					pfgl.setText("规律一");
				}
				if (resultBean.getData().getQueryData().get(0).getJnwsstdm() == null) {
					jnwsstdm.setText("");
				} else {
					jnwsstdm.setText(resultBean.getData().getQueryData().get(0).getJnwsstdm().toString());
				}

				if (resultBean.getData().getQueryData().get(0).getCode_pipenetwork() == null) {
					jngwdm.setText("");
				} else {
					jngwdm.setText(resultBean.getData().getQueryData().get(0).getCode_pipenetwork().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getOutentercode() == null) {
					prwsclcdm.setText("");
				} else {
					prwsclcdm.setText(resultBean.getData().getQueryData().get(0).getOutentercode().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getOutentername() == null) {
					prwsclcmc.setText("");
				} else {
					prwsclcmc.setText(resultBean.getData().getQueryData().get(0).getOutentername().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getEstuarylongitude() == null) {
					rhkjd.setText("");
				} else {
					rhkjd.setText(resultBean.getData().getQueryData().get(0).getEstuarylongitude().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getEstuarylatitude() == null) {
					rhkwd.setText("");
				} else {
					rhkwd.setText(resultBean.getData().getQueryData().get(0).getEstuarylatitude().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getZxbz() == null) {
					zxbz.setText("");
				} else {
					zxbz.setText(resultBean.getData().getQueryData().get(0).getZxbz().toString());
				}
				if (resultBean.getData().getQueryData().get(0).getSfazzxjksb() == null) {
					sfazzxjkss.setText("");
				} else {
					sfazzxjkss.setText(resultBean.getData().getQueryData().get(0).getSfazzxjksb().toString());
					sfazzxjkss.setText("是");
				}
				if (resultBean.getData().getQueryData().get(0).getIndicate() == null) {
					bzpazxs.setText("");
				} else {
					bzpazxs.setText(resultBean.getData().getQueryData().get(0).getIndicate().toString());
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
