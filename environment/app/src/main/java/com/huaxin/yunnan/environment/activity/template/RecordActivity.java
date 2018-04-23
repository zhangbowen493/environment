package com.huaxin.yunnan.environment.activity.template;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.BaseDialog;
import com.huaxin.yunnan.environment.Constant;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.bean.RecordBean;
import com.huaxin.yunnan.environment.db.dao.RecordDao;
import com.huaxin.yunnan.environment.db.dao.bean.RecordDbBean;
import com.huaxin.yunnan.environment.net.NetTool;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.http.okhttp.request.RequestCall;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Call;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_ZDXCJCJL_INFO;

/**
 * 1、通用现场检查记录
 */
public class RecordActivity extends BaseActicity implements View.OnClickListener {

	private LinearLayout ll_no;
	private TextView title_text;
	private Intent intent;
	private String t_task_list_id;
	private EditText DT_KSSJ;
	private EditText DT_JSSJ;
	private EditText VC_DD;
	private EditText VC_BJCDWMC;
	private EditText VC_ZZJGDM;
	private EditText VC_JCR;
	private EditText VC_ZFZH;
	private EditText VC_JLR;
	private EditText VC_FDDBR;
	private EditText VC_XCFZR;
	private EditText VC_SFZH;
	private EditText NB_NL;
	private EditText VC_GZDW;
	private EditText VC_ZW;
	private EditText VC_YBAGX;
	private EditText VC_DZ;
	private EditText VC_DH;
	private EditText VC_YZBM;
	private EditText VC_QTCJRXMYGZDW;
	private EditText VC_SFQRZJ;
	private EditText VC_SFSQHB;
	private EditText CL_QYGK;
	private EditText CL_HBSXJRW;
	private EditText CL_WRFZSSXCJCQK;
	private EditText CL_WSFHJLQK;
	private EditText CL_HJFXJYJGLQK;
	private EditText CL_QTHBBMJCQK;
	private EditText CL_CZZYWT;
	private EditText CL_JCYQ;

	private TextView tv_change;
	private RecordBean.DataBean dataBean;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_record);
		intent = getIntent();
		t_task_list_id = intent.getStringExtra("t_task_list_id");
		Log.e("NameActivity", t_task_list_id);
		Log.e("RecordActivity", SpUtils.getString(getApplicationContext(), "userToken"));
		initProgressDialog();
		initView();
		initData();

	}

	private void initData() {
		yNProgressDialog.show();
		NetTool.getInstance().rxRecordPostNet(URL_QUERY_ZDXCJCJL_INFO, t_task_list_id, SpUtils.getString(getApplicationContext(), "userToken"))
				.subscribeOn(Schedulers.io())
				.observeOn(AndroidSchedulers.mainThread())
				.subscribe(new Consumer<RecordBean>() {
					@Override
					public void accept(@NonNull RecordBean resultBean) throws Exception {
						yNProgressDialog.dismiss();
						if (resultBean.getSuccess().equals("1")) {
							dataBean = resultBean.getData().get(0);
							if (resultBean.getData().get(0).getDt_kssj() == null) {
								DT_KSSJ.setText("");
							} else {
								DT_KSSJ.setText(resultBean.getData().get(0).getDt_kssj().toString());
							}
							if (resultBean.getData().get(0).getDt_jssj() == null) {
								DT_JSSJ.setText("");
							} else {
								DT_JSSJ.setText(resultBean.getData().get(0).getDt_jssj().toString());
							}
							if (resultBean.getData().get(0).getVc_dd() == null) {
								VC_DD.setText("");
							} else {
								VC_DD.setText(resultBean.getData().get(0).getVc_dd().toString());
							}
							if (resultBean.getData().get(0).getVc_bjcdwmc() == null) {
								VC_BJCDWMC.setText("");
							} else {
								VC_BJCDWMC.setText(resultBean.getData().get(0).getVc_bjcdwmc().toString());
							}
							if (resultBean.getData().get(0).getVc_zzjgdm() == null) {
								VC_ZZJGDM.setText("");
							} else {
								VC_ZZJGDM.setText(resultBean.getData().get(0).getVc_zzjgdm().toString());
							}
							if (resultBean.getData().get(0).getVc_jcr() == null) {
								VC_JCR.setText("");
							} else {
								VC_JCR.setText(resultBean.getData().get(0).getVc_jcr().toString());
							}
							if (resultBean.getData().get(0).getVc_zfzh() == null) {
								VC_ZFZH.setText("");
							} else {
								VC_ZFZH.setText(resultBean.getData().get(0).getVc_zfzh().toString());
							}
							if (resultBean.getData().get(0).getVc_jlr() == null) {
								VC_JLR.setText("");
							} else {
								VC_JLR.setText(resultBean.getData().get(0).getVc_jlr().toString());
							}
							if (resultBean.getData().get(0).getVc_fddbr() == null) {
								VC_FDDBR.setText("");
							} else {
								VC_FDDBR.setText(resultBean.getData().get(0).getVc_fddbr().toString());
							}
							if (resultBean.getData().get(0).getVc_xcfzr() == null) {
								VC_XCFZR.setText("");
							} else {
								VC_XCFZR.setText(resultBean.getData().get(0).getVc_xcfzr().toString());
							}
							if (resultBean.getData().get(0).getVc_sfzh() == null) {
								VC_SFZH.setText("");
							} else {
								VC_SFZH.setText(resultBean.getData().get(0).getVc_sfzh().toString());
							}
							if (resultBean.getData().get(0).getNb_nl() == null) {
								NB_NL.setText("");
							} else {
								NB_NL.setText(resultBean.getData().get(0).getNb_nl().toString());
							}
							if (resultBean.getData().get(0).getVc_gzdw() == null) {
								VC_GZDW.setText("");
							} else {
								VC_GZDW.setText(resultBean.getData().get(0).getVc_gzdw().toString());
							}
							if (resultBean.getData().get(0).getVc_zw() == null) {
								VC_ZW.setText("");
							} else {
								VC_ZW.setText(resultBean.getData().get(0).getVc_zw().toString());
							}
							if (resultBean.getData().get(0).getVc_ybagx() == null) {
								VC_YBAGX.setText("");
							} else {
								VC_YBAGX.setText(resultBean.getData().get(0).getVc_ybagx().toString());
							}
							if (resultBean.getData().get(0).getVc_dz() == null) {
								VC_DZ.setText("");
							} else {
								VC_DZ.setText(resultBean.getData().get(0).getVc_dz().toString());
							}
							if (resultBean.getData().get(0).getVc_dh() == null) {
								VC_DH.setText("");
							} else {
								VC_DH.setText(resultBean.getData().get(0).getVc_dh().toString());
							}
							if (resultBean.getData().get(0).getVc_yzbm() == null) {
								VC_YZBM.setText("");
							} else {
								VC_YZBM.setText(resultBean.getData().get(0).getVc_yzbm().toString());
							}
							if (resultBean.getData().get(0).getVc_qtcjrxmygzdw() == null) {
								VC_QTCJRXMYGZDW.setText("");
							} else {
								VC_QTCJRXMYGZDW.setText(resultBean.getData().get(0).getVc_qtcjrxmygzdw().toString());
							}
							if (resultBean.getData().get(0).getVc_sfqrzj() == null) {
								VC_SFQRZJ.setText("");
							} else {
								VC_SFQRZJ.setText(resultBean.getData().get(0).getVc_sfqrzj().toString());
							}
							if (resultBean.getData().get(0).getVc_sfsqhb() == null) {
								VC_SFSQHB.setText("");
							} else {
								VC_SFSQHB.setText(resultBean.getData().get(0).getVc_sfsqhb().toString());
							}
							if (resultBean.getData().get(0).getCl_qygk() == null) {
								CL_QYGK.setText("");
							} else {
								CL_QYGK.setText(resultBean.getData().get(0).getCl_qygk().toString());
							}
							if (resultBean.getData().get(0).getCl_hbsxjrw() == null) {
								CL_HBSXJRW.setText("");
							} else {
								CL_HBSXJRW.setText(resultBean.getData().get(0).getCl_hbsxjrw().toString());
							}
							if (resultBean.getData().get(0).getCl_wrfzssxcjcqk() == null) {
								CL_WRFZSSXCJCQK.setText("");
							} else {
								CL_WRFZSSXCJCQK.setText(resultBean.getData().get(0).getCl_wrfzssxcjcqk().toString());
							}
							if (resultBean.getData().get(0).getCl_wsfhjlqk() == null) {
								CL_WSFHJLQK.setText("");
							} else {
								CL_WSFHJLQK.setText(resultBean.getData().get(0).getCl_wsfhjlqk().toString());
							}
							if (resultBean.getData().get(0).getCl_hjfxjyjglqk() == null) {
								CL_HJFXJYJGLQK.setText("");
							} else {
								CL_HJFXJYJGLQK.setText(resultBean.getData().get(0).getCl_hjfxjyjglqk().toString());
							}
							if (resultBean.getData().get(0).getCl_qthbbmjcqk() == null) {
								CL_QTHBBMJCQK.setText("");
							} else {
								CL_QTHBBMJCQK.setText(resultBean.getData().get(0).getCl_qthbbmjcqk().toString());
							}
							if (resultBean.getData().get(0).getCl_czzywt() == null) {
								CL_CZZYWT.setText("");
							} else {
								CL_CZZYWT.setText(resultBean.getData().get(0).getCl_czzywt().toString());
							}
							if (resultBean.getData().get(0).getCl_jcyq() == null) {
								CL_JCYQ.setText("");
							} else {
								CL_JCYQ.setText(resultBean.getData().get(0).getCl_jcyq().toString());
							}
						} else {
							Toast.makeText(getApplicationContext(), "连接超时", Toast.LENGTH_SHORT).show();
						}
					}
				}, new Consumer<Throwable>() {
					@Override
					public void accept(@NonNull Throwable throwable) throws Exception {
						Log.e("LoginActivity", throwable.getMessage().toString());
						yNProgressDialog.dismiss();
						Toast.makeText(getApplicationContext(), "连接超时", Toast.LENGTH_SHORT).show();
					}
				});
	}

	private void initView() {
		ll_no = (LinearLayout) findViewById(R.id.ll_no);
		title_text = (TextView) findViewById(R.id.title_text);
		title_text.setText("通用现场检查记录");

		title_text.setOnClickListener(this);
		DT_KSSJ = (EditText) findViewById(R.id.DT_KSSJ);
		DT_JSSJ = (EditText) findViewById(R.id.DT_JSSJ);
		VC_DD = (EditText) findViewById(R.id.VC_DD);
		VC_BJCDWMC = (EditText) findViewById(R.id.VC_BJCDWMC);
		VC_ZZJGDM = (EditText) findViewById(R.id.VC_ZZJGDM);
		VC_JCR = (EditText) findViewById(R.id.VC_JCR);
		VC_ZFZH = (EditText) findViewById(R.id.VC_ZFZH);
		VC_JLR = (EditText) findViewById(R.id.VC_JLR);
		VC_FDDBR = (EditText) findViewById(R.id.VC_FDDBR);
		VC_XCFZR = (EditText) findViewById(R.id.VC_XCFZR);
		VC_SFZH = (EditText) findViewById(R.id.VC_SFZH);
		NB_NL = (EditText) findViewById(R.id.NB_NL);
		VC_GZDW = (EditText) findViewById(R.id.VC_GZDW);
		VC_ZW = (EditText) findViewById(R.id.VC_ZW);
		VC_YBAGX = (EditText) findViewById(R.id.VC_YBAGX);
		VC_DZ = (EditText) findViewById(R.id.VC_DZ);
		VC_DH = (EditText) findViewById(R.id.VC_DH);
		VC_YZBM = (EditText) findViewById(R.id.VC_YZBM);
		VC_QTCJRXMYGZDW = (EditText) findViewById(R.id.VC_QTCJRXMYGZDW);
		VC_SFQRZJ = (EditText) findViewById(R.id.VC_SFQRZJ);
		VC_SFSQHB = (EditText) findViewById(R.id.VC_SFSQHB);
		CL_QYGK = (EditText) findViewById(R.id.CL_QYGK);
		CL_HBSXJRW = (EditText) findViewById(R.id.CL_HBSXJRW);
		CL_WRFZSSXCJCQK = (EditText) findViewById(R.id.CL_WRFZSSXCJCQK);
		CL_WSFHJLQK = (EditText) findViewById(R.id.CL_WSFHJLQK);
		CL_HJFXJYJGLQK = (EditText) findViewById(R.id.CL_HJFXJYJGLQK);
		CL_QTHBBMJCQK = (EditText) findViewById(R.id.CL_QTHBBMJCQK);
		CL_CZZYWT = (EditText) findViewById(R.id.CL_CZZYWT);
		CL_JCYQ = (EditText) findViewById(R.id.CL_JCYQ);

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

	private BaseDialog baseDialog;

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

	private void changeMsg() {
		tv_change.setText("提交");
		tv_change.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				//询问是否提交表单
				showDialogSave();

			}
		});
		DT_KSSJ.setEnabled(true);
		DT_JSSJ.setEnabled(true);
		VC_DD.setEnabled(true);
		VC_BJCDWMC.setEnabled(true);
		VC_ZZJGDM.setEnabled(true);
		VC_JCR.setEnabled(true);
		VC_ZFZH.setEnabled(true);
		VC_JLR.setEnabled(true);
		VC_FDDBR.setEnabled(true);
		VC_XCFZR.setEnabled(true);
		VC_SFZH.setEnabled(true);
		NB_NL.setEnabled(true);
		VC_GZDW.setEnabled(true);
		VC_ZW.setEnabled(true);
		VC_YBAGX.setEnabled(true);
		VC_DZ.setEnabled(true);
		VC_DH.setEnabled(true);
		VC_YZBM.setEnabled(true);
		VC_QTCJRXMYGZDW.setEnabled(true);
		VC_SFQRZJ.setEnabled(true);
		VC_SFSQHB.setEnabled(true);
		CL_QYGK.setEnabled(true);
		CL_HBSXJRW.setEnabled(true);
		CL_WRFZSSXCJCQK.setEnabled(true);
		CL_WSFHJLQK.setEnabled(true);
		CL_HJFXJYJGLQK.setEnabled(true);
		CL_QTHBBMJCQK.setEnabled(true);
		CL_CZZYWT.setEnabled(true);
		CL_JCYQ.setEnabled(true);

		DT_KSSJ.setInputType(InputType.TYPE_CLASS_TEXT);
		DT_JSSJ.setInputType(InputType.TYPE_CLASS_TEXT);
		VC_DD.setInputType(InputType.TYPE_CLASS_TEXT);
		VC_BJCDWMC.setInputType(InputType.TYPE_CLASS_TEXT);
		VC_ZZJGDM.setInputType(InputType.TYPE_CLASS_TEXT);
		VC_JCR.setInputType(InputType.TYPE_CLASS_TEXT);
		VC_ZFZH.setInputType(InputType.TYPE_CLASS_TEXT);
		VC_JLR.setInputType(InputType.TYPE_CLASS_TEXT);
		VC_FDDBR.setInputType(InputType.TYPE_CLASS_TEXT);
		VC_XCFZR.setInputType(InputType.TYPE_CLASS_TEXT);
		VC_SFZH.setInputType(InputType.TYPE_CLASS_TEXT);
		NB_NL.setInputType(InputType.TYPE_CLASS_TEXT);
		VC_GZDW.setInputType(InputType.TYPE_CLASS_TEXT);
		VC_ZW.setInputType(InputType.TYPE_CLASS_TEXT);
		VC_YBAGX.setInputType(InputType.TYPE_CLASS_TEXT);
		VC_DZ.setInputType(InputType.TYPE_CLASS_TEXT);
		VC_DH.setInputType(InputType.TYPE_CLASS_TEXT);
		VC_YZBM.setInputType(InputType.TYPE_CLASS_TEXT);
		VC_QTCJRXMYGZDW.setInputType(InputType.TYPE_CLASS_TEXT);
		VC_SFQRZJ.setInputType(InputType.TYPE_CLASS_TEXT);
		VC_SFSQHB.setInputType(InputType.TYPE_CLASS_TEXT);
		CL_QYGK.setInputType(InputType.TYPE_CLASS_TEXT);
		CL_HBSXJRW.setInputType(InputType.TYPE_CLASS_TEXT);
		CL_WRFZSSXCJCQK.setInputType(InputType.TYPE_CLASS_TEXT);
		CL_WSFHJLQK.setInputType(InputType.TYPE_CLASS_TEXT);
		CL_HJFXJYJGLQK.setInputType(InputType.TYPE_CLASS_TEXT);
		CL_QTHBBMJCQK.setInputType(InputType.TYPE_CLASS_TEXT);
		CL_CZZYWT.setInputType(InputType.TYPE_CLASS_TEXT);
		CL_JCYQ.setInputType(InputType.TYPE_CLASS_TEXT);
	}

	private void showDialogSave() {
		baseDialog = new BaseDialog(this);
		baseDialog.setMessage("是否提交模板内容?");
		baseDialog.setYesOnclickListener("提交", new BaseDialog.onYesOnclickListener() {
			@Override
			public void onYesClick() {
				saveBeanUp();
				LogUtils.e("dataBean内容：" + dataBean.toString());
				commitBean();
				baseDialog.dismiss();
			}
		});
		baseDialog.setNoOnclickListener("离线保存", new BaseDialog.onNoOnclickListener() {
			@Override
			public void onNoClick() {
				RecordDbBean mRecordDbBean = saveBean();
				DBsave(mRecordDbBean);
				baseDialog.dismiss();
				return;
			}
		});
		baseDialog.show();
	}

	/**
	 * 数据库存储表单数据
	 *
	 * @param mRecordDbBean
	 */
	private void DBsave(RecordDbBean mRecordDbBean) {

		Integer i = RecordDao.getInstance(this).addData(mRecordDbBean);
		LogUtils.e("存储返回结果：" + i);
		LogUtils.e("当前数据库存储条数：" + RecordDao.getInstance(this).queryAllDataList());

	}

	private RecordDbBean saveBean() {
		RecordDbBean mRecordDbBean = new RecordDbBean();
		if (DT_KSSJ.getText() != null) mRecordDbBean.setDt_kssj(DT_KSSJ.getText().toString());
		if (DT_JSSJ.getText() != null) mRecordDbBean.setDt_jssj(DT_JSSJ.getText().toString());
		if (VC_DD.getText() != null) mRecordDbBean.setVc_dd(VC_DD.getText().toString());
		if (VC_BJCDWMC.getText() != null)
			mRecordDbBean.setVc_bjcdwmc(VC_BJCDWMC.getText().toString());
		if (VC_ZZJGDM.getText() != null) mRecordDbBean.setVc_zzjgdm(VC_ZZJGDM.getText().toString());
		if (VC_JCR.getText() != null) mRecordDbBean.setVc_jcr(VC_JCR.getText().toString());
		if (VC_ZFZH.getText() != null) mRecordDbBean.setVc_zfzh(VC_ZFZH.getText().toString());
		if (VC_JLR.getText() != null) mRecordDbBean.setVc_jlr(VC_JLR.getText().toString());
		if (VC_FDDBR.getText() != null) mRecordDbBean.setVc_fddbr(VC_FDDBR.getText().toString());
		if (VC_XCFZR.getText() != null) mRecordDbBean.setVc_xcfzr(VC_XCFZR.getText().toString());
		if (VC_SFZH.getText() != null) mRecordDbBean.setVc_sfzh(VC_SFZH.getText().toString());
		if (NB_NL.getText() != null) mRecordDbBean.setNb_nl(NB_NL.getText().toString());
		if (VC_GZDW.getText() != null) mRecordDbBean.setVc_gzdw(VC_GZDW.getText().toString());
		if (VC_ZW.getText() != null) mRecordDbBean.setVc_zw(VC_ZW.getText().toString());
		if (VC_YBAGX.getText() != null) mRecordDbBean.setVc_ybagx(VC_YBAGX.getText().toString());
		if (VC_DZ.getText() != null) mRecordDbBean.setVc_dz(VC_DZ.getText().toString());
		if (VC_DH.getText() != null) mRecordDbBean.setVc_dh(VC_DH.getText().toString());
		if (VC_YZBM.getText() != null) mRecordDbBean.setVc_yzbm(VC_YZBM.getText().toString());
		if (VC_QTCJRXMYGZDW.getText() != null)
			mRecordDbBean.setVc_qtcjrxmygzdw(VC_QTCJRXMYGZDW.getText().toString());
		if (VC_SFQRZJ.getText() != null) mRecordDbBean.setVc_sfqrzj(VC_SFQRZJ.getText().toString());
		if (VC_SFSQHB.getText() != null) mRecordDbBean.setVc_sfsqhb(VC_SFSQHB.getText().toString());
		if (CL_QYGK.getText() != null) mRecordDbBean.setCl_qygk(CL_QYGK.getText().toString());
		if (CL_HBSXJRW.getText() != null)
			mRecordDbBean.setCl_hbsxjrw(CL_HBSXJRW.getText().toString());
		if (CL_WRFZSSXCJCQK.getText() != null)
			mRecordDbBean.setCl_wrfzssxcjcqk(CL_WRFZSSXCJCQK.getText().toString());
		if (CL_WSFHJLQK.getText() != null)
			mRecordDbBean.setCl_wsfhjlqk(CL_WSFHJLQK.getText().toString());
		if (CL_HJFXJYJGLQK.getText() != null)
			mRecordDbBean.setCl_hjfxjyjglqk(CL_HJFXJYJGLQK.getText().toString());
		if (CL_QTHBBMJCQK.getText() != null)
			mRecordDbBean.setCl_qthbbmjcqk(CL_QTHBBMJCQK.getText().toString());
		if (CL_CZZYWT.getText() != null) mRecordDbBean.setCl_czzywt(CL_CZZYWT.getText().toString());
		if (CL_JCYQ.getText() != null) mRecordDbBean.setCl_jcyq(CL_JCYQ.getText().toString());
		return mRecordDbBean;
	}

	private void saveBeanUp() {
		if (VC_DD.getText() != null) dataBean.setVc_dd(VC_DD.getText().toString());
		if (VC_BJCDWMC.getText() != null) dataBean.setVc_bjcdwmc(VC_BJCDWMC.getText().toString());
		if (VC_ZZJGDM.getText() != null) dataBean.setVc_zzjgdm(VC_ZZJGDM.getText().toString());
		if (VC_JCR.getText() != null) dataBean.setVc_jcr(VC_JCR.getText().toString());
		if (VC_ZFZH.getText() != null) dataBean.setVc_zfzh(VC_ZFZH.getText().toString());
		if (VC_JLR.getText() != null) dataBean.setVc_jlr(VC_JLR.getText().toString());
		if (VC_FDDBR.getText() != null) dataBean.setVc_fddbr(VC_FDDBR.getText().toString());
		if (VC_XCFZR.getText() != null) dataBean.setVc_xcfzr(VC_XCFZR.getText().toString());
		if (VC_SFZH.getText() != null) dataBean.setVc_sfzh(VC_SFZH.getText().toString());
		if (NB_NL.getText() != null) dataBean.setNb_nl(NB_NL.getText().toString());
		if (VC_GZDW.getText() != null) dataBean.setVc_gzdw(VC_GZDW.getText().toString());
		if (VC_ZW.getText() != null) dataBean.setVc_zw(VC_ZW.getText().toString());
		if (VC_YBAGX.getText() != null) dataBean.setVc_ybagx(VC_YBAGX.getText().toString());
		if (VC_DZ.getText() != null) dataBean.setVc_dz(VC_DZ.getText().toString());
		if (VC_DH.getText() != null) dataBean.setVc_dh(VC_DH.getText().toString());
		if (VC_YZBM.getText() != null) dataBean.setVc_yzbm(VC_YZBM.getText().toString());
		if (VC_QTCJRXMYGZDW.getText() != null)
			dataBean.setVc_qtcjrxmygzdw(VC_QTCJRXMYGZDW.getText().toString());
		if (VC_SFQRZJ.getText() != null) dataBean.setVc_sfqrzj(VC_SFQRZJ.getText().toString());
		if (VC_SFSQHB.getText() != null) dataBean.setVc_sfsqhb(VC_SFSQHB.getText().toString());
		if (CL_QYGK.getText() != null) dataBean.setCl_qygk(CL_QYGK.getText().toString());
		if (CL_HBSXJRW.getText() != null) dataBean.setCl_hbsxjrw(CL_HBSXJRW.getText().toString());
		if (CL_WRFZSSXCJCQK.getText() != null)
			dataBean.setCl_wrfzssxcjcqk(CL_WRFZSSXCJCQK.getText().toString());
		if (CL_WSFHJLQK.getText() != null)
			dataBean.setCl_wsfhjlqk(CL_WSFHJLQK.getText().toString());
		if (CL_HJFXJYJGLQK.getText() != null)
			dataBean.setCl_hjfxjyjglqk(CL_HJFXJYJGLQK.getText().toString());
		if (CL_QTHBBMJCQK.getText() != null)
			dataBean.setCl_qthbbmjcqk(CL_QTHBBMJCQK.getText().toString());
		if (CL_CZZYWT.getText() != null) dataBean.setCl_czzywt(CL_CZZYWT.getText().toString());
		if (CL_JCYQ.getText() != null) dataBean.setCl_jcyq(CL_JCYQ.getText().toString());
	}

	private RequestCall mRequestCall;

	private void commitBean() {
		yNProgressDialog.show();
		mRequestCall = OkHttpUtils
				.post()
				.url(Constant.URL_RECORD)
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
