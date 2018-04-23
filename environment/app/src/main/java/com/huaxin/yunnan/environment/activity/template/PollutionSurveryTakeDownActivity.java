package com.huaxin.yunnan.environment.activity.template;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;
import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.BaseDialog;
import com.huaxin.yunnan.environment.Constant;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.bean.PollutionSurveryTakeDownBean;
import com.huaxin.yunnan.environment.db.dao.PollutionSurveryTakeDownDao;
import com.huaxin.yunnan.environment.db.dao.bean.PollutionSurveryTakeDownDbBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.http.okhttp.request.RequestCall;

import okhttp3.Call;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_WRD_INFO;

/**
 * 12、污染源调查询问笔录页面
 */
public class PollutionSurveryTakeDownActivity extends BaseActicity implements View.OnClickListener, CallBack {

	private TextView titleText;
	private TextView tv_change;
	private EditText mDTSTARTTIME;
	private EditText mDTENDTIME;
	private EditText mVCLOCATION;
	private EditText mVCXWR;
	private EditText mVCZFZH;
	private EditText mVCJLR;
	private EditText mVCZZJGDM;
	private EditText mVCBXWRXM;
	private EditText mVCSFZH;
	private EditText mNBAGE;
	private EditText mVCGZDW;
	private EditText mVCDUTY;
	private EditText mVCYBAGX;
	private EditText mVCADDRESS;
	private EditText mVCTELEPHONE;
	private EditText mVCYZBM;
	private EditText mVCQTCJTCXWRXMJGZDW;
	private EditText mVCHJJCLX;
	private EditText mVCSFQRZJ;
	private EditText mVCSFSQHB;
	private EditText mCLXWNR;
	private BaseDialog baseDialog;
	private String t_task_list_id;
	private String t_wrydcxw_record_id;
	private String t_task_id;
	private PollutionSurveryTakeDownBean.DataBean dataBean;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pollution_survery_take_down);
		initProgressDialog();
		Intent intent = getIntent();
		t_task_list_id = intent.getStringExtra("t_task_list_id");
		initView();
		NetTool.templatePost(getApplicationContext(), t_task_list_id, URL_QUERY_WRD_INFO, PollutionSurveryTakeDownBean.class, this, yNProgressDialog);
	}

	private void initView() {
		titleText = (TextView) findViewById(R.id.title_text);
		titleText.setText("污染源调查询问笔录");
		findViewById(R.id.title_text).setOnClickListener(this);
		mDTSTARTTIME = (EditText) findViewById(R.id.DT_START_TIME);
		mDTENDTIME = (EditText) findViewById(R.id.DT_END_TIME);
		mVCLOCATION = (EditText) findViewById(R.id.VC_LOCATION);
		mVCXWR = (EditText) findViewById(R.id.VC_XWR);
		mVCZFZH = (EditText) findViewById(R.id.VC_ZFZH);
		mVCJLR = (EditText) findViewById(R.id.VC_JLR);
		mVCZZJGDM = (EditText) findViewById(R.id.VC_ZZJGDM);
		mVCBXWRXM = (EditText) findViewById(R.id.VC_BXWRXM);
		mVCSFZH = (EditText) findViewById(R.id.VC_SFZH);
		mNBAGE = (EditText) findViewById(R.id.NB_AGE);
		mVCGZDW = (EditText) findViewById(R.id.VC_GZDW);
		mVCDUTY = (EditText) findViewById(R.id.VC_DUTY);
		mVCYBAGX = (EditText) findViewById(R.id.VC_YBAGX);
		mVCADDRESS = (EditText) findViewById(R.id.VC_ADDRESS);
		mVCTELEPHONE = (EditText) findViewById(R.id.VC_TELEPHONE);
		mVCYZBM = (EditText) findViewById(R.id.VC_YZBM);
		mVCQTCJTCXWRXMJGZDW = (EditText) findViewById(R.id.VC_QTCJTCXWRXMJGZDW);
		mVCHJJCLX = (EditText) findViewById(R.id.VC_HJJCLX);
		mVCSFQRZJ = (EditText) findViewById(R.id.VC_SFQRZJ);
		mVCSFSQHB = (EditText) findViewById(R.id.VC_SFSQHB);
		mCLXWNR = (EditText) findViewById(R.id.CL_XWNR);

		tv_change = (TextView) findViewById(R.id.tv_change);
		tv_change.setVisibility(View.VISIBLE);
		tv_change.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.title_text:
				finish();
				break;
			case R.id.tv_change:
				showDialog();
				break;
		}
	}

	private void changeMsg() {
		tv_change.setText("提交");
		tv_change.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				//询问是否提交表单
				showDialogSave();

			}
		});
		mDTSTARTTIME.setEnabled(true);
		mDTSTARTTIME.setInputType(InputType.TYPE_CLASS_TEXT);
		mDTSTARTTIME.setSelection(mDTSTARTTIME.getText().length());
		mDTENDTIME.setEnabled(true);
		mVCLOCATION.setEnabled(true);
		mVCXWR.setEnabled(true);
		mVCZFZH.setEnabled(true);
		mVCJLR.setEnabled(true);
		mVCZZJGDM.setEnabled(true);
		mVCBXWRXM.setEnabled(true);
		mVCSFZH.setEnabled(true);
		mNBAGE.setEnabled(true);
		mVCGZDW.setEnabled(true);
		mVCDUTY.setEnabled(true);
		mVCYBAGX.setEnabled(true);
		mVCADDRESS.setEnabled(true);
		mVCTELEPHONE.setEnabled(true);
		mVCYZBM.setEnabled(true);
		mVCQTCJTCXWRXMJGZDW.setEnabled(true);
		mVCHJJCLX.setEnabled(true);
		mVCSFQRZJ.setEnabled(true);
		mVCSFSQHB.setEnabled(true);
		mCLXWNR.setEnabled(true);
		mDTENDTIME.setInputType(InputType.TYPE_CLASS_TEXT);
		mVCLOCATION.setInputType(InputType.TYPE_CLASS_TEXT);
		mVCXWR.setInputType(InputType.TYPE_CLASS_TEXT);
		mVCZFZH.setInputType(InputType.TYPE_CLASS_TEXT);
		mVCJLR.setInputType(InputType.TYPE_CLASS_TEXT);
		mVCZZJGDM.setInputType(InputType.TYPE_CLASS_TEXT);
		mVCBXWRXM.setInputType(InputType.TYPE_CLASS_TEXT);
		mVCSFZH.setInputType(InputType.TYPE_CLASS_TEXT);
		mNBAGE.setInputType(InputType.TYPE_CLASS_TEXT);
		mVCGZDW.setInputType(InputType.TYPE_CLASS_TEXT);
		mVCDUTY.setInputType(InputType.TYPE_CLASS_TEXT);
		mVCYBAGX.setInputType(InputType.TYPE_CLASS_TEXT);
		mVCADDRESS.setInputType(InputType.TYPE_CLASS_TEXT);
		mVCTELEPHONE.setInputType(InputType.TYPE_CLASS_TEXT);
		mVCYZBM.setInputType(InputType.TYPE_CLASS_TEXT);
		mVCQTCJTCXWRXMJGZDW.setInputType(InputType.TYPE_CLASS_TEXT);
		mVCHJJCLX.setInputType(InputType.TYPE_CLASS_TEXT);
		mVCSFQRZJ.setInputType(InputType.TYPE_CLASS_TEXT);
		mVCSFSQHB.setInputType(InputType.TYPE_CLASS_TEXT);
		mCLXWNR.setInputType(InputType.TYPE_CLASS_TEXT);
//		mDTENDTIME.setSelection(mDTSTARTTIME.getText().length());
	}

	@Override
	public void getResult(Object o) {
		PollutionSurveryTakeDownBean mPollutionSurveryTakeDownBean = (PollutionSurveryTakeDownBean) o;
		if (Constant.RESPONSE_SUCCESS.equals(mPollutionSurveryTakeDownBean.getSuccess())) {
			dataBean = mPollutionSurveryTakeDownBean.getData().get(0);
			initData(mPollutionSurveryTakeDownBean);
		} else {
			LogUtils.e("请求失败，错误码：" + mPollutionSurveryTakeDownBean.getSuccess() + "错误信息：" + mPollutionSurveryTakeDownBean.getMsg());
		}
	}

	private void initData(PollutionSurveryTakeDownBean mPollutionSurveryTakeDownBean) {
		if (mPollutionSurveryTakeDownBean.getData().get(0).getT_wrydcxw_record_id() != null)
			t_wrydcxw_record_id = mPollutionSurveryTakeDownBean.getData().get(0).getT_wrydcxw_record_id();

		if (mPollutionSurveryTakeDownBean.getData().get(0).getT_task_list_id() != null)
			t_task_id = mPollutionSurveryTakeDownBean.getData().get(0).getT_task_list_id();

		if (mPollutionSurveryTakeDownBean.getData().get(0).getDt_start_time() != null)
			mDTSTARTTIME.setText(mPollutionSurveryTakeDownBean.getData().get(0).getDt_start_time().toString());

		if (mPollutionSurveryTakeDownBean.getData().get(0).getDt_end_time() != null)
			mDTENDTIME.setText(mPollutionSurveryTakeDownBean.getData().get(0).getDt_end_time().toString());

		if (mPollutionSurveryTakeDownBean.getData().get(0).getVc_location() != null)
			mVCLOCATION.setText(mPollutionSurveryTakeDownBean.getData().get(0).getVc_location().toString());

		if (mPollutionSurveryTakeDownBean.getData().get(0).getVc_xwr() != null)
			mVCXWR.setText(mPollutionSurveryTakeDownBean.getData().get(0).getVc_xwr().toString());

		if (mPollutionSurveryTakeDownBean.getData().get(0).getVc_zfzh() != null)
			mVCZFZH.setText(mPollutionSurveryTakeDownBean.getData().get(0).getVc_zfzh().toString());

		if (mPollutionSurveryTakeDownBean.getData().get(0).getVc_jlr() != null)
			mVCJLR.setText(mPollutionSurveryTakeDownBean.getData().get(0).getVc_jlr().toString());

		if (mPollutionSurveryTakeDownBean.getData().get(0).getVc_zzjgdm() != null)
			mVCZZJGDM.setText(mPollutionSurveryTakeDownBean.getData().get(0).getVc_zzjgdm().toString());

		if (mPollutionSurveryTakeDownBean.getData().get(0).getVc_bxwrxm() != null)
			mVCBXWRXM.setText(mPollutionSurveryTakeDownBean.getData().get(0).getVc_bxwrxm().toString());

		if (mPollutionSurveryTakeDownBean.getData().get(0).getVc_sfzh() != null)
			mVCSFZH.setText(mPollutionSurveryTakeDownBean.getData().get(0).getVc_sfzh().toString());

		if (mPollutionSurveryTakeDownBean.getData().get(0).getNb_age()+"" != null)
			mNBAGE.setText(mPollutionSurveryTakeDownBean.getData().get(0).getNb_age()+"");

		if (mPollutionSurveryTakeDownBean.getData().get(0).getVc_gzdw() != null)
			mVCGZDW.setText(mPollutionSurveryTakeDownBean.getData().get(0).getVc_gzdw().toString());

		if (mPollutionSurveryTakeDownBean.getData().get(0).getVc_duty() != null)
			mVCDUTY.setText(mPollutionSurveryTakeDownBean.getData().get(0).getVc_duty().toString());

		if (mPollutionSurveryTakeDownBean.getData().get(0).getVc_ybagx() != null)
			mVCYBAGX.setText(mPollutionSurveryTakeDownBean.getData().get(0).getVc_ybagx().toString());

		if (mPollutionSurveryTakeDownBean.getData().get(0).getVc_address() != null)
			mVCADDRESS.setText(mPollutionSurveryTakeDownBean.getData().get(0).getVc_address().toString());

		if (mPollutionSurveryTakeDownBean.getData().get(0).getVc_telephone() != null)
			mVCTELEPHONE.setText(mPollutionSurveryTakeDownBean.getData().get(0).getVc_telephone().toString());

		if (mPollutionSurveryTakeDownBean.getData().get(0).getVc_yzbm() != null)
			mVCYZBM.setText(mPollutionSurveryTakeDownBean.getData().get(0).getVc_yzbm().toString());

		if (mPollutionSurveryTakeDownBean.getData().get(0).getVc_qtcjtcxwrxmjgzdw() != null)
			mVCQTCJTCXWRXMJGZDW.setText(mPollutionSurveryTakeDownBean.getData().get(0).getVc_qtcjtcxwrxmjgzdw().toString());

		if (mPollutionSurveryTakeDownBean.getData().get(0).getVc_hjjclx() != null)
			mVCHJJCLX.setText(mPollutionSurveryTakeDownBean.getData().get(0).getVc_hjjclx().toString());

		if (mPollutionSurveryTakeDownBean.getData().get(0).getVc_sfqrzj() != null)
			mVCSFQRZJ.setText(mPollutionSurveryTakeDownBean.getData().get(0).getVc_sfqrzj().toString());

		if (mPollutionSurveryTakeDownBean.getData().get(0).getVc_sfsqhb() != null)
			mVCSFSQHB.setText(mPollutionSurveryTakeDownBean.getData().get(0).getVc_sfsqhb().toString());

		if (mPollutionSurveryTakeDownBean.getData().get(0).getCl_xwnr() != null)
			mCLXWNR.setText(mPollutionSurveryTakeDownBean.getData().get(0).getCl_xwnr().toString());
	}

	private void showDialog() {
		baseDialog = new BaseDialog(this);
		baseDialog.setMessage("是否修改模板内容?");
		baseDialog.setYesOnclickListener("确定", new BaseDialog.onYesOnclickListener() {
			@Override
			public void onYesClick() {
				changeMsg();
				baseDialog.dismiss();
			}
		});
		baseDialog.setNoOnclickListener("取消", new BaseDialog.onNoOnclickListener() {
			@Override
			public void onNoClick() {
				baseDialog.dismiss();
				return;
			}
		});
		baseDialog.show();
	}

	private void showDialogSave() {
		baseDialog = new BaseDialog(this);
		baseDialog.setMessage("是否提交模板内容?");
		baseDialog.setYesOnclickListener("提交", new BaseDialog.onYesOnclickListener() {
			@Override
			public void onYesClick() {
				saveBeanUp();
				LogUtils.e("dataBean内容："+dataBean.toString());
				commitBean();
				baseDialog.dismiss();
			}
		});
		baseDialog.setNoOnclickListener("离线保存", new BaseDialog.onNoOnclickListener() {
			@Override
			public void onNoClick() {
				PollutionSurveryTakeDownDbBean mPollutionSurveryTakeDownDbBean = saveBean();
				DBsave(mPollutionSurveryTakeDownDbBean);
				baseDialog.dismiss();
				return;
			}
		});
		baseDialog.show();
	}

	private void saveBeanUp() {
		if (mVCLOCATION.getText() != null)
			dataBean.setVc_location(mVCLOCATION.getText().toString());

		if (mVCXWR.getText() != null)
			dataBean.setVc_xwr(mVCXWR.getText().toString());

		if (mVCZFZH.getText() != null)
			dataBean.setVc_zfzh(mVCZFZH.getText().toString());

		if (mVCJLR.getText() != null)
			dataBean.setVc_jlr(mVCJLR.getText().toString());

		if (mVCZZJGDM.getText() != null)
			dataBean.setVc_zzjgdm(mVCZZJGDM.getText().toString());

		if (mVCBXWRXM.getText() != null)
			dataBean.setVc_bxwrxm(mVCBXWRXM.getText().toString());

		if (mVCSFZH.getText() != null)
			dataBean.setVc_sfzh(mVCSFZH.getText().toString());

		if (mNBAGE.getText()+"" != null)
			dataBean.setNb_age(Integer.parseInt(mNBAGE.getText().toString()));

		if (mVCGZDW.getText() != null)
			dataBean.setVc_gzdw(mVCGZDW.getText().toString());

		if (mVCDUTY.getText() != null)
			dataBean.setVc_duty(mVCDUTY.getText().toString());

		if (mVCYBAGX.getText() != null)
			dataBean.setVc_ybagx(mVCYBAGX.getText().toString());

		if (mVCADDRESS.getText() != null)
			dataBean.setVc_address(mVCADDRESS.getText().toString());

		if (mVCTELEPHONE.getText() != null)
			dataBean.setVc_telephone(mVCTELEPHONE.getText().toString());

		if (mVCYZBM.getText() != null)
			dataBean.setVc_yzbm(mVCYZBM.getText().toString());

		if (mVCQTCJTCXWRXMJGZDW.getText() != null)
			dataBean.setVc_qtcjtcxwrxmjgzdw(mVCQTCJTCXWRXMJGZDW.getText().toString());

		if (mVCHJJCLX.getText() != null)
			dataBean.setVc_hjjclx(mVCHJJCLX.getText().toString());

		if (mVCSFQRZJ.getText() != null)
			dataBean.setVc_sfqrzj(mVCSFQRZJ.getText().toString());

		if (mVCSFSQHB.getText() != null)
			dataBean.setVc_sfsqhb(mVCSFSQHB.getText().toString());

		if (mCLXWNR.getText() != null)
			dataBean.setCl_xwnr(mCLXWNR.getText().toString());

		if (t_wrydcxw_record_id != null)
			dataBean.setT_wrydcxw_record_id(t_wrydcxw_record_id);

		if (t_task_id != null)
			dataBean.setT_task_list_id(t_task_id);
	}

	private PollutionSurveryTakeDownDbBean saveBean() {
		PollutionSurveryTakeDownDbBean mPollutionSurveryTakeDownDbBean = new PollutionSurveryTakeDownDbBean();
		if (mDTSTARTTIME.getText() != null)
			mPollutionSurveryTakeDownDbBean.setDt_start_time(mDTSTARTTIME.getText().toString());

		if (mDTENDTIME.getText() != null)
			mPollutionSurveryTakeDownDbBean.setDt_end_time(mDTENDTIME.getText().toString());

		if (mVCLOCATION.getText() != null)
			mPollutionSurveryTakeDownDbBean.setVc_location(mVCLOCATION.getText().toString());

		if (mVCXWR.getText() != null)
			mPollutionSurveryTakeDownDbBean.setVc_xwr(mVCXWR.getText().toString());

		if (mVCZFZH.getText() != null)
			mPollutionSurveryTakeDownDbBean.setVc_zfzh(mVCZFZH.getText().toString());

		if (mVCJLR.getText() != null)
			mPollutionSurveryTakeDownDbBean.setVc_jlr(mVCJLR.getText().toString());

		if (mVCZZJGDM.getText() != null)
			mPollutionSurveryTakeDownDbBean.setVc_zzjgdm(mVCZZJGDM.getText().toString());

		if (mVCBXWRXM.getText() != null)
			mPollutionSurveryTakeDownDbBean.setVc_bxwrxm(mVCBXWRXM.getText().toString());

		if (mVCSFZH.getText() != null)
			mPollutionSurveryTakeDownDbBean.setVc_sfzh(mVCSFZH.getText().toString());

		if (mNBAGE.getText() != null)
			mPollutionSurveryTakeDownDbBean.setNb_age(mNBAGE.getText().toString());

		if (mVCGZDW.getText() != null)
			mPollutionSurveryTakeDownDbBean.setVc_gzdw(mVCGZDW.getText().toString());

		if (mVCDUTY.getText() != null)
			mPollutionSurveryTakeDownDbBean.setVc_duty(mVCDUTY.getText().toString());

		if (mVCYBAGX.getText() != null)
			mPollutionSurveryTakeDownDbBean.setVc_ybagx(mVCYBAGX.getText().toString());

		if (mVCADDRESS.getText() != null)
			mPollutionSurveryTakeDownDbBean.setVc_address(mVCADDRESS.getText().toString());

		if (mVCTELEPHONE.getText() != null)
			mPollutionSurveryTakeDownDbBean.setVc_telephone(mVCTELEPHONE.getText().toString());

		if (mVCYZBM.getText() != null)
			mPollutionSurveryTakeDownDbBean.setVc_yzbm(mVCYZBM.getText().toString());

		if (mVCQTCJTCXWRXMJGZDW.getText() != null)
			mPollutionSurveryTakeDownDbBean.setVc_qtcjtcxwrxmjgzdw(mVCQTCJTCXWRXMJGZDW.getText().toString());

		if (mVCHJJCLX.getText() != null)
			mPollutionSurveryTakeDownDbBean.setVc_hjjclx(mVCHJJCLX.getText().toString());

		if (mVCSFQRZJ.getText() != null)
			mPollutionSurveryTakeDownDbBean.setVc_sfqrzj(mVCSFQRZJ.getText().toString());

		if (mVCSFSQHB.getText() != null)
			mPollutionSurveryTakeDownDbBean.setVc_sfsqhb(mVCSFSQHB.getText().toString());

		if (mCLXWNR.getText() != null)
			mPollutionSurveryTakeDownDbBean.setCl_xwnr(mCLXWNR.getText().toString());

		if (t_wrydcxw_record_id != null)
			mPollutionSurveryTakeDownDbBean.setT_wrydcxw_record_id(t_wrydcxw_record_id);

		if (t_task_id != null)
			mPollutionSurveryTakeDownDbBean.setT_task_list_id(t_task_id);

		return mPollutionSurveryTakeDownDbBean;
	}

	/**
	 * 数据库存储表单数据
	 *
	 * @param mPollutionSurveryTakeDownDbBean
	 */
	private void DBsave(PollutionSurveryTakeDownDbBean mPollutionSurveryTakeDownDbBean) {

		Integer i = PollutionSurveryTakeDownDao.getInstance(this).addData(mPollutionSurveryTakeDownDbBean);
		LogUtils.e("存储返回结果：" + i);
		LogUtils.e("当前数据库存储条数：" + PollutionSurveryTakeDownDao.getInstance(this).queryAllDataList());

	}

	private RequestCall mRequestCall;

	private void commitBean() {
		yNProgressDialog.show();
		mRequestCall = OkHttpUtils
				.post()
				.url(Constant.URL_PollutionSurveryTakeDown)
				.addParams("t_detail_id", t_task_list_id)
				.addParams("data", new Gson().toJson(dataBean))
				.addParams("userToken", SpUtils.getString(getApplicationContext(), "userToken"))
				.build();
		mRequestCall.execute(new StringCallback() {
			@Override
			public void onError(Call call, Exception e, int id) {
				call.cancel();
				yNProgressDialog.dismiss();
				LogUtils.e("网络请求失败！" + e.toString());
			}

			@Override
			public void onResponse(String response, int id) {
				yNProgressDialog.dismiss();
				LogUtils.e("网络请求返回response:" + response);
//				Gson g = new GsonBuilder().serializeNulls().create();
//				LocationUpBean mLocationUpBean = g.fromJson(response, LocationUpBean.class);
//				if (mLocationUpBean.getSuccess().equals(RESPONSE_SUCCESS)) {
//					//坐标点上送成功
//					ToastUtils.showShort(getApplicationContext(), "坐标点上传成功！");
//					MyApplication.getInstance().getData().clear();
//				} else {
//					yNProgressDialog.dismiss();
//					ToastUtils.showShort(getApplicationContext(), "上送失败！错误原因：" + mLocationUpBean.getMsg().toString());
//				}
			}
		});
	}
}
