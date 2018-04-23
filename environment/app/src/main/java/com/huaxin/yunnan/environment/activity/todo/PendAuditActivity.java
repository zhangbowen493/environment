package com.huaxin.yunnan.environment.activity.todo;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.BaseDialog;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.Utils.ToastUtils;
import com.huaxin.yunnan.environment.activity.todo.adapter.ReviewHistoryAdapter;
import com.huaxin.yunnan.environment.bean.PendAuditBean;
import com.huaxin.yunnan.environment.bean.ReviewHistoryBean;
import com.huaxin.yunnan.environment.net.NetTool;

import java.io.File;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import static com.huaxin.yunnan.environment.Constant.URL_AUDIT_GETAUDITHISTORYLIST;
import static com.huaxin.yunnan.environment.Constant.URL_PEND_AUDIT;

/**
 * 待审核页面
 */
public class PendAuditActivity extends BaseActicity implements View.OnClickListener {

	private BaseDialog baseDialog;
	private static final int DOWNLOAD_END = 101;
	private static final int DOWNLOAD_FAILED = 99;
	private static final int DOWNLOAD_SUCCESS = 100;
	private static final int DOWNLOAD_EXIST = 102;
	private LinearLayout ll_no;
	private TextView title_text;
	private TextView tv_bt;
	private TextView tv_wslx;
	private TextView tv_wsbh;
//	private TextView tv_wjmc;
	private TextView tv_wsjzrq;
	private TextView tv_scyh;
	private TextView tv_fqr;
	private TextView tv_fwdw;
	private Button bt_ty;
	private Button bt_bh;
	private Button bt_shls;
	private Intent intent;
	private String businessid_;
	private String workitem_ins_id_;
	private String vc_create_mechanism;
	private RefreshReciver reciver;
	private String filePath;
	private String wjmc;
	private String path;
	private String localFilePath;
	private String fromWhere = "";
	private String isXG;
	private ListView lv_wjmc;
	private ListView lv_review;

	private ReviewHistoryAdapter reviewHistoryAdapter;

	Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
				case DOWNLOAD_END:
					yNProgressDialog.dismiss();
					break;
				case DOWNLOAD_FAILED:
					ToastUtils.showShort(getApplicationContext(), "下载失败");
					yNProgressDialog.dismiss();
					break;
				case DOWNLOAD_SUCCESS:
					yNProgressDialog.dismiss();
					showOpen();
					break;
				case DOWNLOAD_EXIST:
					ToastUtils.showShort(getApplicationContext(), "文件已存在");
					yNProgressDialog.dismiss();
					break;
			}
		}
	};
	private String[] wjmclist;
	private String[] filepathlist;

	//下载完成后提示打开程序
	private void showOpen() {
		baseDialog = new BaseDialog(this);
		baseDialog.setMessage("下载完成，是否打开查看？");
		baseDialog.setYesOnclickListener("确定", new BaseDialog.onYesOnclickListener() {
			@Override
			public void onYesClick() {
				baseDialog.dismiss();
				Intent intent = new Intent();
				LogUtils.e("本地文件路径：" + localFilePath);
				File file1 = new File(localFilePath);
				if (file1.exists()) {
					LogUtils.e("文件存在");
				} else {
					LogUtils.e("文件不存在");
				}
				Uri data;
				data = FileProvider.getUriForFile(getApplicationContext(), "com.zz.fileprovider", file1);

				// 给目标应用一个临时授权
				intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
				intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				intent.setAction(Intent.ACTION_VIEW);
				String type = getMIMEType(file1);
				//设置intent的data和Type属性。
				intent.setDataAndType(data, type);
				try {
					startActivity(intent);
				} catch (ActivityNotFoundException e) {
					Toast.makeText(getApplicationContext(), "您未安装相关软件", Toast.LENGTH_SHORT).show();
				}
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

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pend_audit);
		reciver = new RefreshReciver();
		registerReceiver(reciver, new IntentFilter("刷新待办"));
		registerReceiver(reciver, new IntentFilter("回到消息列表"));
		registerReceiver(reciver, new IntentFilter("回到待办列表"));
		initProgressDialog();
		intent = getIntent();
		businessid_ = intent.getStringExtra("businessid_");
		fromWhere = intent.getStringExtra("FromWhere");
		isXG = intent.getStringExtra("isXG");
		Log.e("PendAuditActivity", businessid_);
		workitem_ins_id_ = intent.getStringExtra("workitem_ins_id_");
		initView();
		initData();
	}

	private void initData() {
		yNProgressDialog.show();
		NetTool.getInstance().rxPendAuditBeanPostNet(URL_PEND_AUDIT, businessid_, SpUtils.getString(getApplicationContext(), "userId"), SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
				.observeOn(AndroidSchedulers.mainThread())
				.subscribe(new Consumer<PendAuditBean>() {


					@Override
					public void accept(@NonNull PendAuditBean pendAuditBean) throws Exception {
						initHistoryData();
						if (pendAuditBean.getSuccess().equals("1")) {
							LogUtils.e("pendAuditBean内容："+pendAuditBean.toString());
							yNProgressDialog.dismiss();
							vc_create_mechanism = pendAuditBean.getData().get(0).getVc_create_mechanism();
							if (pendAuditBean.getData().get(0).getVc_document_name() == null) {
								tv_bt.setText("");
							} else {
								tv_bt.setText(pendAuditBean.getData().get(0).getVc_document_name().toString());
							}
							if (pendAuditBean.getData().get(0).getVc_document_priority_type() == null) {
								tv_wslx.setText("");
							} else {
								tv_wslx.setText(pendAuditBean.getData().get(0).getVc_document_priority_type().toString());
							}
							if (pendAuditBean.getData().get(0).getVc_document_number() == null) {
								tv_wsbh.setText("");
							} else {
								tv_wsbh.setText(pendAuditBean.getData().get(0).getVc_document_number().toString());
							}

							if (pendAuditBean.getData().get(0).getFilePath() == null) {
								filePath = "";
							} else {
								filePath = pendAuditBean.getData().get(0).getFilePath().toString();
								filepathlist=filePath.split(",");
							}

							if (pendAuditBean.getData().get(0).getFileName() == null || pendAuditBean.getData().get(0).getFileName().length() < 1) {
//								tv_wjmc.setText("");
//								tv_wjmc.setOnClickListener(null);
							} else {
								//获取文件名称
								wjmc = pendAuditBean.getData().get(0).getFileName().toString().trim();
								wjmc = wjmc.substring(0, wjmc.length() - 1);
								//截取文件名称
								wjmclist=wjmc.split(",");
								for (int i=0;i<wjmclist.length;i++){
									LogUtils.e("打印附件："+i+":"+wjmclist[i].toString());
								}
								//将文件名称放入listview
								ArrayAdapter<String> adapter = new ArrayAdapter<String>(PendAuditActivity.this, R.layout.textview_pendaudit, android.R.id.text1, wjmclist);
								lv_wjmc.setAdapter(adapter);
								setListViewHeightBasedOnChildren1(lv_wjmc);
								//设置listview点击效果进行下载
								lv_wjmc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
									@Override
									public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
										LogUtils.e("点击了"+wjmclist[i].toString());
										showNormalDialog(wjmclist[i].toString(),filepathlist[i].toString());
									}
								});

							}
							if (pendAuditBean.getData().get(0).getDocument_end_time() == null) {
								tv_wsjzrq.setText("");
							} else {
								tv_wsjzrq.setText(pendAuditBean.getData().get(0).getDocument_end_time().toString());
							}
							if (pendAuditBean.getData().get(0).getVc_create_user() == null) {
								tv_scyh.setText("");
							} else {
								tv_scyh.setText(pendAuditBean.getData().get(0).getVc_create_user().toString());
							}
							if (pendAuditBean.getData().get(0).getT_userinfo_id() == null) {
								tv_fqr.setText("");
							} else {
								tv_fqr.setText(pendAuditBean.getData().get(0).getT_userinfo_id().toString());
							}
							if (pendAuditBean.getData().get(0).getOrgname() == null) {
								tv_fwdw.setText("");
							} else {
								tv_fwdw.setText(pendAuditBean.getData().get(0).getOrgname().toString());
							}

						} else {
							yNProgressDialog.dismiss();
							Toast.makeText(getApplicationContext(), pendAuditBean.getMsg(), Toast.LENGTH_SHORT).show();
						}
					}

				}, new Consumer<Throwable>() {
					@Override
					public void accept(@NonNull Throwable throwable) throws Exception {
						yNProgressDialog.dismiss();
						Log.e("PendAuditActivity", throwable.getMessage().toString() + "1111");
						Toast.makeText(getApplicationContext(), "连接异常", Toast.LENGTH_SHORT).show();
					}
				});

	}

	private void initHistoryData() {
		NetTool.getInstance().rxReviewHistoryBeanPostNet(URL_AUDIT_GETAUDITHISTORYLIST, businessid_, SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
				.observeOn(AndroidSchedulers.mainThread())
				.subscribe(new Consumer<ReviewHistoryBean>() {
					@Override
					public void accept(@NonNull ReviewHistoryBean reviewHistoryBean) throws Exception {
						yNProgressDialog.dismiss();
						if (reviewHistoryBean.getSuccess().equals("1")) {
							reviewHistoryAdapter.setData(reviewHistoryBean);
							setListViewHeightBasedOnChildren(lv_review);
						} else {
							Toast.makeText(getApplicationContext(), "连接异常", Toast.LENGTH_SHORT).show();
						}
					}

				}, new Consumer<Throwable>() {
					@Override
					public void accept(@NonNull Throwable throwable) throws Exception {
						yNProgressDialog.dismiss();
						Toast.makeText(getApplicationContext(), "连接异常", Toast.LENGTH_SHORT).show();
					}
				});

	}

	/**
	 * 解决ScrollView嵌套ListView只显示一条的问题
	 * @param listView
	 */
	public void setListViewHeightBasedOnChildren1(ListView listView) {
		// 获取ListView对应的Adapter
		ListAdapter listAdapter = listView.getAdapter();
		if (listAdapter == null) {
			return;
		}
		int totalHeight = 0;
		for (int i = 0, len = listAdapter.getCount(); i < len; i++) {
			// listAdapter.getCount()返回数据项的数目
			View listItem = listAdapter.getView(i,null, listView);
			// 计算子项View 的宽高
			listItem.measure(0, 0);
			// 统计所有子项的总高度
			totalHeight += listItem.getMeasuredHeight();
		}
		ViewGroup.LayoutParams params = listView.getLayoutParams();
		params.height = totalHeight + (listView.getDividerHeight() *
				(listAdapter.getCount() - 1));
		// listView.getDividerHeight()获取子项间分隔符占用的高度
		// params.height最后得到整个ListView完整显示需要的高度
		listView.setLayoutParams(params);
		listView.invalidate();
	}

	private void initView() {
		lv_review = (ListView) findViewById(R.id.lv_review);
		reviewHistoryAdapter = new ReviewHistoryAdapter(this);
		lv_review.setAdapter(reviewHistoryAdapter);
		ll_no = (LinearLayout) findViewById(R.id.ll_no);
		title_text = (TextView) findViewById(R.id.title_text);
		title_text.setText("待审核");
		tv_bt = (TextView) findViewById(R.id.tv_bt);
		tv_wslx = (TextView) findViewById(R.id.tv_wslx);
		tv_wsbh = (TextView) findViewById(R.id.tv_wsbh);
//		tv_wjmc = (TextView) findViewById(R.id.tv_wjmc);
//		tv_wjmc.setOnClickListener(this);
		tv_wsjzrq = (TextView) findViewById(R.id.tv_wsjzrq);
		tv_scyh = (TextView) findViewById(R.id.tv_scyh);
		tv_fqr = (TextView) findViewById(R.id.tv_fqr);
		tv_fwdw = (TextView) findViewById(R.id.tv_fwdw);
		lv_wjmc = (ListView) findViewById(R.id.lv_wjmc);

		title_text.setOnClickListener(this);
		bt_ty = (Button) findViewById(R.id.bt_ty);
		bt_ty.setOnClickListener(this);
		bt_bh = (Button) findViewById(R.id.bt_bh);
		bt_bh.setOnClickListener(this);
		bt_shls = (Button) findViewById(R.id.bt_shls);
		bt_shls.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.title_text:
				if (TextUtils.isEmpty(fromWhere)) {
					finish();
				} else if (fromWhere.equals("Message")) {
					dialogList();
				}
				break;
			case R.id.bt_ty:
				intent = new Intent(PendAuditActivity.this, CommentAgreeActivity.class);
				intent.putExtra("workitem_ins_id_", workitem_ins_id_);
				intent.putExtra("busiOrgId", vc_create_mechanism);
				intent.putExtra("businessid_", businessid_);
				intent.putExtra("fromWhere", fromWhere);
				intent.putExtra("isXG", isXG);
				startActivityForResult(intent, 8);
				break;
			case R.id.bt_bh:
				intent = new Intent(PendAuditActivity.this, RejectActivity.class);
				intent.putExtra("workitem_ins_id_", workitem_ins_id_);
				intent.putExtra("businessid_", businessid_);
				intent.putExtra("busiOrgId", vc_create_mechanism);
				intent.putExtra("fromWhere", fromWhere);
				intent.putExtra("isXG", isXG);
				startActivity(intent);
				break;
			case R.id.bt_shls:
				intent = new Intent(PendAuditActivity.this, ReviewHistoryActivity.class);
				intent.putExtra("workitem_ins_id_", workitem_ins_id_);
				intent.putExtra("businessid_", businessid_);
				intent.putExtra("busiOrgId", vc_create_mechanism);
				startActivity(intent);
				break;
//			case R.id.tv_wjmc:
//				showNormalDialog();
//				break;
		}
	}

	/**
	 * 列表
	 */
	private void dialogList() {
		final String items[] = {"回到消息列表", "回到待办列表"};

		AlertDialog.Builder builder = new AlertDialog.Builder(this, 3);

		// builder.setMessage("是否确认退出?"); //设置内容
		builder.setIcon(R.mipmap.ic_launcher);
		// 设置列表显示，注意设置了列表显示就不要设置builder.setMessage()了，否则列表不起作用。
		builder.setItems(items, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
//				Toast.makeText(PendAuditActivity.this, items[which],
//						Toast.LENGTH_SHORT).show();
				if (items[which].equals("回到消息列表")) {
					sendBroadcast(new Intent("回到消息列表"));
					finish();
				} else {
					intent = new Intent(PendAuditActivity.this, ToDoActivity.class);
					startActivity(intent);
					sendBroadcast(new Intent("回到待办列表"));
					finish();
				}
			}
		});

		builder.create().show();
	}

	private void DLFiles(final String fileName, final String filepath) {
		path = Environment.getExternalStorageDirectory().getPath() + "/DLFiles";
		LogUtils.e("文件下载路径：" + path);
		//点击下载文件
		if (!filepath.equals("")) {
			new Thread() {
				public void run() {
					try {
						LogUtils.e("DLFiles下载路径："+filepath);
						LogUtils.e("DLFiles文件名称："+fileName);
						DownloadFile mDownloadFile = new DownloadFile(PendAuditActivity.this, filepath);
						localFilePath = Environment.getExternalStorageDirectory() + File.separator + path + File.separator + fileName;
						int downloadResult = mDownloadFile.downloadFiles(
								filepath, path, fileName);
						LogUtils.e("下载结果为："+downloadResult);
						switch (downloadResult) {
							case -1:
								//下载失败
								handler.sendEmptyMessage(DOWNLOAD_FAILED);
								break;
							case 0:
								//下载成功
								handler.sendEmptyMessage(DOWNLOAD_SUCCESS);
								break;
							case 1:
								//文件已存在
								handler.sendEmptyMessage(DOWNLOAD_EXIST);
								break;
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}.start();
		} else {
			ToastUtils.showShort(getApplicationContext(), "未上传文件");
		}
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		unregisterReceiver(reciver);
	}

	class RefreshReciver extends BroadcastReceiver {

		@Override
		public void onReceive(Context context, Intent intent) {
			finish();
		}
	}


	private void showNormalDialog(final String fileName, final String filepath) {
		baseDialog = new BaseDialog(this);
		baseDialog.setMessage("是否下载文件？");
		baseDialog.setYesOnclickListener("确定", new BaseDialog.onYesOnclickListener() {
			@Override
			public void onYesClick() {
				if (fileName.length() > 0) {
					yNProgressDialog.show();
					//下载文件
					DLFiles(fileName,filepath);
				} else {
					ToastUtils.showShort(getApplicationContext(), "当前文件不存在");
				}
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
//		final AlertDialog.Builder normalDialog =
//				new AlertDialog.Builder(this);
//		normalDialog.setMessage("是否确定下载文件？");
//		normalDialog.setPositiveButton("确定",
//				new DialogInterface.OnClickListener() {
//					@Override
//					public void onClick(DialogInterface dialog, int which) {
//						if (wjmc.toString().trim().length() > 0) {
//							yNProgressDialog.show();
//							//下载文件
//							DLFiles();
//						} else {
//							ToastUtils.showShort(getApplicationContext(), "当前文件不存在");
//						}
//					}
//				});
//		normalDialog.setNegativeButton("取消",
//				new DialogInterface.OnClickListener() {
//					@Override
//					public void onClick(DialogInterface dialog, int which) {
//						//...To-do
//					}
//				});
//		// 显示
//		normalDialog.show();
	}

	/**
	 * 根据文件后缀名匹配MIMEType
	 *
	 * @param file
	 * @return
	 */
	public static String getMIMEType(File file) {
		String type = "*/*";
		String name = file.getName();
		int index = name.lastIndexOf('.');
		if (index < 0) {
			return type;
		}
		String end = name.substring(index, name.length()).toLowerCase();
		if (TextUtils.isEmpty(end)) return type;

		for (int i = 0; i < MIME_MapTable.length; i++) {
			if (end.equals(MIME_MapTable[i][0]))
				type = MIME_MapTable[i][1];
		}
		return type;
	}

	private static final String[][] MIME_MapTable = {
			{".3gp", "video/3gpp"},
			{".apk", "application/vnd.android.package-archive"},
			{".asf", "video/x-ms-asf"},
			{".avi", "video/x-msvideo"},
			{".bin", "application/octet-stream"},
			{".bmp", "image/bmp"},
			{".c", "text/plain"},
			{".class", "application/octet-stream"},
			{".conf", "text/plain"},
			{".cpp", "text/plain"},
			{".doc", "application/msword"},
			{".docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document"},
			{".xls", "application/vnd.ms-excel"},
			{".xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"},
			{".exe", "application/octet-stream"},
			{".gif", "image/gif"},
			{".gtar", "application/x-gtar"},
			{".gz", "application/x-gzip"},
			{".h", "text/plain"},
			{".htm", "text/html"},
			{".html", "text/html"},
			{".jar", "application/java-archive"},
			{".java", "text/plain"},
			{".jpeg", "image/jpeg"},
			{".jpg", "image/jpeg"},
			{".js", "application/x-javascript"},
			{".log", "text/plain"},
			{".m3u", "audio/x-mpegurl"},
			{".m4a", "audio/mp4a-latm"},
			{".m4b", "audio/mp4a-latm"},
			{".m4p", "audio/mp4a-latm"},
			{".m4u", "video/vnd.mpegurl"},
			{".m4v", "video/x-m4v"},
			{".mov", "video/quicktime"},
			{".mp2", "audio/x-mpeg"},
			{".mp3", "audio/x-mpeg"},
			{".mp4", "video/mp4"},
			{".mpc", "application/vnd.mpohun.certificate"},
			{".mpe", "video/mpeg"},
			{".mpeg", "video/mpeg"},
			{".mpg", "video/mpeg"},
			{".mpg4", "video/mp4"},
			{".mpga", "audio/mpeg"},
			{".msg", "application/vnd.ms-outlook"},
			{".ogg", "audio/ogg"},
			{".pdf", "application/pdf"},
			{".png", "image/png"},
			{".pps", "application/vnd.ms-powerpoint"},
			{".ppt", "application/vnd.ms-powerpoint"},
			{".pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation"},
			{".prop", "text/plain"},
			{".rc", "text/plain"},
			{".rmvb", "audio/x-pn-realaudio"},
			{".rtf", "application/rtf"},
			{".sh", "text/plain"},
			{".tar", "application/x-tar"},
			{".tgz", "application/x-compressed"},
			{".txt", "text/plain"},
			{".wav", "audio/x-wav"},
			{".wma", "audio/x-ms-wma"},
			{".wmv", "audio/x-ms-wmv"},
			{".wps", "application/vnd.ms-works"},
			{".xml", "text/plain"},
			{".z", "application/x-compress"},
			{".zip", "application/x-zip-compressed"},
			{"", "*/*"}
	};
	/***
	 * 动态设置listview的高度
	 */
	public void setListViewHeightBasedOnChildren(ListView listView) {
		BaseAdapter listAdapter = (BaseAdapter) listView.getAdapter();
		if (listAdapter == null) {
			return;
		}
		int totalHeight = 0;
		for (int i = 0; i < listAdapter.getCount(); i++) {
			View listItem = listAdapter.getView(i, null, listView);
			listItem.measure(0, 0);
			totalHeight += listItem.getMeasuredHeight();
		}
		ViewGroup.LayoutParams params = listView.getLayoutParams();
		listView.setDivider(null);
		params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() + 1));
		listView.setLayoutParams(params);
	}
}
