package com.huaxin.yunnan.environment.activity.pollution;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.Constant;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.Utils.ToastUtils;
import com.huaxin.yunnan.environment.bean.AttributeManagementBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_ATTRIBUTEMANAGEMENT_INFO;

/**
 * 污染源管理属性信息页面
 */
public class AttributeManagementActivity extends BaseActicity implements View.OnClickListener, CallBack {
	private TextView titleText;
	private TextView tvWRYBH;
	private TextView tvND;
	private TextView tvSFZDY;
	private TextView tvSFHJTJQY;
	private TextView tvSFZXJKQY;
	private TextView tvSFKZPWF;
	private TextView tvSFGFJYDW;
	private TextView tvSFGFCSDW;
	private TextView tvSFFXY;
	private TextView tvHBJGJB;
	private TextView tvDLQYZJRL;
	private TextView tvSFLSDW;
	private TextView tvHBCXDJ;
	private TextView tvSFTGISO14000;
	private TextView tvSFTGQJSCSH;
	private TextView tvSFFSZDWRY;
	private TextView tvSFFQZDWRY;
	private TextView tvSFGFZDWRY;
	private TextView tvSFWSCLC;
	private TextView tvSFSYDW;
	private TextView tvSFSSGS;
	private TextView tvSFYZGS;
	private TextView tvSFJDXJC;
	private TextView tvSFPWKGFH;
	private TextView tvSFJLJDYZD;
	private TextView tvFSPFBZSD;
	private TextView tvFQPFBZSD;
	private TextView tvFSPFBZ;
	private TextView tvFQPFBZ;
	private TextView tvZSPFBZ;
	private TextView tvZFPL;
	private TextView tvZFKSSJ;
	private TextView tvZFJSSJ;
	private TextView tvZFSJDW;
	private TextView tvSFZX;
	private TextView tvZXSJ;
	private TextView tvZXYY;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_attribute_management);
		initProgressDialog();
		Intent intent = getIntent();
		String uuid = intent.getStringExtra("uuid");
		initView();
		NetTool.PollutionPost(getApplicationContext(), uuid, URL_QUERY_ATTRIBUTEMANAGEMENT_INFO, AttributeManagementBean.class, this, yNProgressDialog);
	}

	private void initView() {
		titleText = (TextView) findViewById(R.id.title_text);
		titleText.setText("污染源管理属性信息");
		tvWRYBH = (TextView) findViewById(R.id.tv_WRYBH);
		tvND = (TextView) findViewById(R.id.tv_ND);
		tvSFZDY = (TextView) findViewById(R.id.tv_SFZDY);
		tvSFHJTJQY = (TextView) findViewById(R.id.tv_SFHJTJQY);
		tvSFZXJKQY = (TextView) findViewById(R.id.tv_SFZXJKQY);
		tvSFKZPWF = (TextView) findViewById(R.id.tv_SFKZPWF);
		tvSFGFJYDW = (TextView) findViewById(R.id.tv_SFGFJYDW);
		tvSFGFCSDW = (TextView) findViewById(R.id.tv_SFGFCSDW);
		tvSFFXY = (TextView) findViewById(R.id.tv_SFFXY);
		tvHBJGJB = (TextView) findViewById(R.id.tv_HBJGJB);
		tvDLQYZJRL = (TextView) findViewById(R.id.tv_DLQYZJRL);
		tvSFLSDW = (TextView) findViewById(R.id.tv_SFLSDW);
		tvHBCXDJ = (TextView) findViewById(R.id.tv_HBCXDJ);
		tvSFTGISO14000 = (TextView) findViewById(R.id.tv_SFTGISO14000);
		tvSFTGQJSCSH = (TextView) findViewById(R.id.tv_SFTGQJSCSH);
		tvSFFSZDWRY = (TextView) findViewById(R.id.tv_SFFSZDWRY);
		tvSFFQZDWRY = (TextView) findViewById(R.id.tv_SFFQZDWRY);
		tvSFGFZDWRY = (TextView) findViewById(R.id.tv_SFGFZDWRY);
		tvSFWSCLC = (TextView) findViewById(R.id.tv_SFWSCLC);
		tvSFSYDW = (TextView) findViewById(R.id.tv_SFSYDW);
		tvSFSSGS = (TextView) findViewById(R.id.tv_SFSSGS);
		tvSFYZGS = (TextView) findViewById(R.id.tv_SFYZGS);
		tvSFJDXJC = (TextView) findViewById(R.id.tv_SFJDXJC);
		tvSFPWKGFH = (TextView) findViewById(R.id.tv_SFPWKGFH);
		tvSFJLJDYZD = (TextView) findViewById(R.id.tv_SFJLJDYZD);
		tvFSPFBZSD = (TextView) findViewById(R.id.tv_FSPFBZSD);
		tvFQPFBZSD = (TextView) findViewById(R.id.tv_FQPFBZSD);
		tvFSPFBZ = (TextView) findViewById(R.id.tv_FSPFBZ);
		tvFQPFBZ = (TextView) findViewById(R.id.tv_FQPFBZ);
		tvZSPFBZ = (TextView) findViewById(R.id.tv_ZSPFBZ);
		tvZFPL = (TextView) findViewById(R.id.tv_ZFPL);
		tvZFKSSJ = (TextView) findViewById(R.id.tv_ZFKSSJ);
		tvZFJSSJ = (TextView) findViewById(R.id.tv_ZFJSSJ);
		tvZFSJDW = (TextView) findViewById(R.id.tv_ZFSJDW);
		tvSFZX = (TextView) findViewById(R.id.tv_SFZX);
		tvZXSJ = (TextView) findViewById(R.id.tv_ZXSJ);
		tvZXYY = (TextView) findViewById(R.id.tv_ZXYY);
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
		AttributeManagementBean mAttributeManagementBean = (AttributeManagementBean) o;
		if (Constant.RESPONSE_SUCCESS.equals(mAttributeManagementBean.getSuccess())) {
			initData(mAttributeManagementBean);
		} else {
			ToastUtils.showShort(getApplicationContext(), mAttributeManagementBean.getMsg());
		}
	}

	private void initData(AttributeManagementBean mAttributeManagementBean) {
		if (mAttributeManagementBean.getData().getQueryData().size() >= 1) {

			if (mAttributeManagementBean.getData().getQueryData().get(0).getWrybh() != null)
				tvWRYBH.setText(mAttributeManagementBean.getData().getQueryData().get(0).getWrybh().toString());

			if (mAttributeManagementBean.getData().getQueryData().get(0).getNd() != null)
				tvND.setText(mAttributeManagementBean.getData().getQueryData().get(0).getNd().toString());

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSfzdy() != null)
				tvSFZDY.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSfzdy().toString());
				tvSFZDY.setText("是");

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSfhjtjqy() != null)
				tvSFHJTJQY.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSfhjtjqy().toString());
			tvSFHJTJQY.setText("是");

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSfzxjkqy() != null)
				tvSFZXJKQY.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSfzxjkqy().toString());
			tvSFZXJKQY.setText("是");

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSfkzpwf() != null)
				tvSFKZPWF.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSfkzpwf().toString());
			tvSFKZPWF.setText("是");

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSfgfjydw() != null)
				tvSFGFJYDW.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSfgfjydw().toString());
			tvSFGFJYDW.setText("否");

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSfgfcsdw() != null)
				tvSFGFCSDW.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSfgfcsdw().toString());
			tvSFGFCSDW.setText("是");

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSffxy() != null)
				tvSFFXY.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSffxy().toString());
			tvSFFXY.setText("否");

			if (mAttributeManagementBean.getData().getQueryData().get(0).getHbjgjb() != null)
				tvHBJGJB.setText(mAttributeManagementBean.getData().getQueryData().get(0).getHbjgjb().toString());
			tvHBJGJB.setText("级别一");

			String DLQYJRL = mAttributeManagementBean.getData().getQueryData().get(0).getDlqyzjrl() + "";
			if (DLQYJRL != null)
				tvDLQYZJRL.setText(DLQYJRL);

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSflsdw() != null)
				tvSFLSDW.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSflsdw().toString());
			tvSFLSDW.setText("是");

			if (mAttributeManagementBean.getData().getQueryData().get(0).getHbcxdj() != null)
				tvHBCXDJ.setText(mAttributeManagementBean.getData().getQueryData().get(0).getHbcxdj().toString());
			tvHBCXDJ.setText("等级一");

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSftgiso14000() != null)
				tvSFTGISO14000.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSftgiso14000().toString());
			tvSFTGISO14000.setText("是");

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSftgqjscsh() != null)
				tvSFTGQJSCSH.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSftgqjscsh().toString());
			tvSFTGQJSCSH.setText("是");

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSffszdwry() != null)
				tvSFFSZDWRY.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSffszdwry().toString());
			tvSFFSZDWRY.setText("否");

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSffqzdwry() != null)
				tvSFFQZDWRY.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSffqzdwry().toString());
			tvSFFQZDWRY.setText("是");

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSfgfzdwry() != null)
				tvSFGFZDWRY.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSfgfzdwry().toString());
			tvSFGFZDWRY.setText("否");

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSfwsclc() != null)
				tvSFWSCLC.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSfwsclc().toString());

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSfsydw() != null)
				tvSFSYDW.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSfsydw().toString());

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSfssgs() != null)
				tvSFSSGS.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSfssgs().toString());

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSfyzgs() != null)
				tvSFYZGS.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSfyzgs().toString());

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSfjdxjc() != null)
				tvSFJDXJC.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSfjdxjc().toString());

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSfpwkgfh() != null)
				tvSFPWKGFH.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSfpwkgfh().toString());

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSfjljdyzd() != null)
				tvSFJLJDYZD.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSfjljdyzd().toString());

			if (mAttributeManagementBean.getData().getQueryData().get(0).getFspfbzsd() != null)
				tvFSPFBZSD.setText(mAttributeManagementBean.getData().getQueryData().get(0).getFspfbzsd().toString());

			if (mAttributeManagementBean.getData().getQueryData().get(0).getFqpfbzsd() != null)
				tvFQPFBZSD.setText(mAttributeManagementBean.getData().getQueryData().get(0).getFqpfbzsd().toString());

			if (mAttributeManagementBean.getData().getQueryData().get(0).getFspfbz() != null)
				tvFSPFBZ.setText(mAttributeManagementBean.getData().getQueryData().get(0).getFspfbz().toString());

			if (mAttributeManagementBean.getData().getQueryData().get(0).getFqpfbz() != null)
				tvFQPFBZ.setText(mAttributeManagementBean.getData().getQueryData().get(0).getFqpfbz().toString());

			if (mAttributeManagementBean.getData().getQueryData().get(0).getZspfbz() != null)
				tvZSPFBZ.setText(mAttributeManagementBean.getData().getQueryData().get(0).getZspfbz().toString());

			if (mAttributeManagementBean.getData().getQueryData().get(0).getZfpl() != null)
				tvZFPL.setText(mAttributeManagementBean.getData().getQueryData().get(0).getZfpl().toString());

			if (mAttributeManagementBean.getData().getQueryData().get(0).getZfkssj() != null)
				tvZFKSSJ.setText(mAttributeManagementBean.getData().getQueryData().get(0).getZfkssj().toString());

			if (mAttributeManagementBean.getData().getQueryData().get(0).getZfjssj() != null)
				tvZFJSSJ.setText(mAttributeManagementBean.getData().getQueryData().get(0).getZfjssj().toString());

			if (mAttributeManagementBean.getData().getQueryData().get(0).getZfsjdw() != null)
				tvZFSJDW.setText(mAttributeManagementBean.getData().getQueryData().get(0).getZfsjdw().toString());

			if (mAttributeManagementBean.getData().getQueryData().get(0).getSfqxgl() != null)
				tvSFZX.setText(mAttributeManagementBean.getData().getQueryData().get(0).getSfqxgl().toString());

			if (mAttributeManagementBean.getData().getQueryData().get(0).getQxsj() != null)
				tvZXSJ.setText(mAttributeManagementBean.getData().getQueryData().get(0).getQxsj().toString());

			if (mAttributeManagementBean.getData().getQueryData().get(0).getQxyy() != null)
				tvZXYY.setText(mAttributeManagementBean.getData().getQueryData().get(0).getQxyy().toString());
		}
	}


}
