package com.huaxin.yunnan.environment.activity.todo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.activity.meaaagelog.MessageLogActivity;
import com.huaxin.yunnan.environment.bean.BaseBean;
import com.huaxin.yunnan.environment.net.NetTool;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import static com.huaxin.yunnan.environment.Constant.URL_AUDIT_DOREJECTOFMOBILE;

/**
 * 5.审核驳回
 */
public class RejectActivity extends BaseActicity implements View.OnClickListener {
	private LinearLayout ll_no;
	private TextView mTitleText;
	private CheckBox mCbMessage;
	private CheckBox mCbDisagree;
	private EditText mEtMore;
	private Button mBtnConfirm;
	private Intent intent;
	private String workitem_ins_id_;
	private String businessid_;
	private String id;
	private RelativeLayout mRlDisagree;
	private String fromWhere;
	private String isXG;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reject);
		initProgressDialog();
		intent = getIntent();
//		intent.putExtra("workitem_ins_id_",workitem_ins_id_);
//		intent.putExtra("businessid_",businessid_);
//		intent.putExtra("busiOrgId", vc_create_mechanism);

		businessid_ = intent.getStringExtra("businessid_");
		workitem_ins_id_ = intent.getStringExtra("workitem_ins_id_");
		id = intent.getStringExtra("busiOrgId");
		isXG = intent.getStringExtra("isXG");
		fromWhere = intent.getStringExtra("fromWhere");
		initView();
	}


	private void initView() {
		ll_no = (LinearLayout) findViewById(R.id.ll_no);
		mTitleText = (TextView) findViewById(R.id.title_text);
		mTitleText.setText("审核驳回");
		mTitleText.setOnClickListener(this);
		mCbMessage = (CheckBox) findViewById(R.id.cb_message);
		mCbDisagree = (CheckBox) findViewById(R.id.cb_disagree);
		mEtMore = (EditText) findViewById(R.id.et_more);
		mBtnConfirm = (Button) findViewById(R.id.btn_confirm);
		mRlDisagree = (RelativeLayout) findViewById(R.id.rl_disagree);
		mRlDisagree.setOnClickListener(this);
		mBtnConfirm.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				yNProgressDialog.show();

				NetTool.getInstance().rxRejectPostNet(URL_AUDIT_DOREJECTOFMOBILE, workitem_ins_id_, businessid_, id, mEtMore.getText().toString(), "1", SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
						.observeOn(AndroidSchedulers.mainThread())
						.subscribe(new Consumer<BaseBean>() {
							@Override
							public void accept(@NonNull BaseBean baseBean) throws Exception {
								yNProgressDialog.dismiss();
								if (baseBean.getSuccess().equals("1")) {
									if (TextUtils.isEmpty(fromWhere)) {
										sendBroadcast(new Intent("刷新待办"));
										finish();
									} else if (fromWhere.equals("Message")){
										dialogList();
									}

								} else {
									Toast.makeText(getApplicationContext(), baseBean.getMsg(), Toast.LENGTH_SHORT).show();
								}
							}

						}, new Consumer<Throwable>() {
							@Override
							public void accept(@NonNull Throwable throwable) throws Exception {
								Log.e("RejectActivity", throwable.getMessage().toString());
								yNProgressDialog.dismiss();
								Toast.makeText(getApplicationContext(), "连接异常", Toast.LENGTH_SHORT).show();
							}
						});


			}
		});
	}

	/**
	 * 列表
	 */
	private void dialogList() {
		final String items[] = {"回到消息列表", "回到待办列表"};

		AlertDialog.Builder builder = new AlertDialog.Builder(this, 3);

		// 设置列表显示，注意设置了列表显示就不要设置builder.setMessage()了，否则列表不起作用。
		builder.setItems(items, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				if (items[which].equals("回到消息列表")) {
					sendBroadcast(new Intent("回到消息列表"));
					if (isXG != null) {
						startActivity(new Intent(RejectActivity.this, MessageLogActivity.class));
					}
					finish();
				} else {
					intent = new Intent(RejectActivity.this,ToDoActivity.class);
					startActivity(intent);
					sendBroadcast(new Intent("回到待办列表"));
					finish();
				}
			}
		});

		builder.create().show();
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
			case R.id.rl_disagree:
				if (mCbDisagree.isChecked())
					mCbDisagree.setChecked(false);
				else
					mCbDisagree.setChecked(true);
				break;
			case R.id.title_text:
				finish();
				break;
		}
	}
}
