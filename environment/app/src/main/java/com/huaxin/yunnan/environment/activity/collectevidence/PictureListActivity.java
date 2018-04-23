package com.huaxin.yunnan.environment.activity.collectevidence;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v4.content.FileProvider;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.BaseDialog;
import com.huaxin.yunnan.environment.MyApplication;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.activity.collectevidence.adapter.GridViewAddImgesAdpter;
import com.huaxin.yunnan.environment.activity.map.Location;
import com.huaxin.yunnan.environment.bean.BaseBean;
import com.huaxin.yunnan.environment.net.NetTool;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Call;

import static com.huaxin.yunnan.environment.Constant.RESPONSE_SUCCESS;
import static com.huaxin.yunnan.environment.Constant.URL_DELETE_FILE_INFO;
import static com.huaxin.yunnan.environment.Constant.URL_UP_FILE_INFO;

public class PictureListActivity extends BaseActicity implements View.OnClickListener {

	private LinearLayout ll_no;
	private TextView title_text;
	private TextView tv_right_text;
	private TextView tv_location;

	private GridView gw;
	private List<Map<String, Object>> datas;
	private List<Map<String, Object>> waitDatas;
	private List<Map<String, Object>> faildDatas;
	private List<Map<String, Object>> successDatas;
	private GridViewAddImgesAdpter gridViewAddImgesAdpter;

	private File file;
	private BaseDialog baseDialog;
	private int j = 0;
	List<Integer> a = new ArrayList<Integer>();
	List<Integer> b = new ArrayList<Integer>();
	List<String> name = new ArrayList<String>();
	private int isSuccess = 0;
	private String locationMsg;
	private LocationReceiver locationReceiver;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_picture_list);
		initView();
		initProgressDialog();
		registReceiver("broadcast_location");
		if (MyApplication.getInstance().isBegin) {
			//已经正在执行任务，直接获取经纬度
			LogUtils.e("PictureListActivity:已经开始任务，使用已有定位数据");
			locationMsg = "纬度： " + MyApplication.getInstance().getLatitude() + "    经度：" + MyApplication.getInstance().getLongitude();
			LogUtils.e("当前经纬度：" + locationMsg);
			tv_location.setText(locationMsg);
		} else {
			//没有执行任务，这里开始定位
			LogUtils.e("PictureListActivity:没有开始任务，执行定位操作");
			Location.initLocation();
		}
	}

	private void initView() {
		ll_no = (LinearLayout) findViewById(R.id.ll_no);
		title_text = (TextView) findViewById(R.id.title_text);
		title_text.setText("图片预览");
		tv_location = (TextView) findViewById(R.id.tv_location);
		tv_right_text = (TextView) findViewById(R.id.tv_right_text);
		tv_right_text.setVisibility(View.VISIBLE);
		tv_right_text.setText("上传");
		tv_right_text.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				int waitSize = waitDatas.size();
				int faildSize = faildDatas.size();
				int size = datas.size();
				if (size == waitSize) {
					for (int i = 0; i < datas.size(); i++) {
						Log.e("PictureListActivity", datas.get(i).get("path").toString());
						final File file = new File(datas.get(i).get("path").toString());
						doUpFile(file, i);
					}
				} else {
					Log.e("PictureListActivity", "waitDatas.size():" + waitDatas.size());

					for (int i = 0; i < faildDatas.size(); i++) {
						waitDatas.add(faildDatas.get(i));
					}
					faildDatas.clear();
					Log.e("PictureListActivity", "waitDatas.size():" + waitDatas.size());
					Log.e("PictureListActivity", "faildDatas.size():" + faildDatas.size());
					for (int i = 0; i < waitDatas.size(); i++) {
						final File file = new File(waitDatas.get(i).get("path").toString());
						doUpFile(file, i);
					}


				}

			}
		});
		title_text.setOnClickListener(this);
		useCamera();
		gw = (GridView) findViewById(R.id.gw);
		gw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
				int size = datas.size();

				if (size == i) {
					if (i == 5) {
						Toast.makeText(getApplicationContext(), "最多只能上传5张", Toast.LENGTH_SHORT).show();
					} else {
						useCamera();
					}
				}
			}
		});
		final int[] delete = {1};
		gw.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
			@Override
			public boolean onItemLongClick(AdapterView<?> adapterView, View view, final int i, long l) {
				int size = datas.size();
				if (i == size) {
				} else {
					baseDialog = new BaseDialog(PictureListActivity.this);
					baseDialog.setMessage("确定删除该照片?");
					baseDialog.setYesOnclickListener("确定", new BaseDialog.onYesOnclickListener() {
						@Override
						public void onYesClick() {

							String path = datas.get(i).get("path").toString().replace("/storage/emulated/0/test/", "");
							for (int l = 0; l < name.size(); l++) {
								String s = name.get(l);
								if (s.equals(path)) {
									doDelete(name.get(l));

								}
							}


							successDatas.remove(datas.get(i));
							faildDatas.remove(datas.get(i));
							waitDatas.remove(datas.get(i));
							datas.remove(datas.get(i));
							gridViewAddImgesAdpter.notifyDataSetChanged();
							baseDialog.dismiss();
							for (int k = 0; k < a.size(); k++) {
								Integer integer = a.get(k);
								if (integer == i) {
									a.remove(k);

								} else if (i < integer) {
									Integer i1 = integer - 1;
									Log.e("PictureListActivity", "i1:" + i1);


									b.add(i1);
								} else if (i > integer) {
									b.add(integer);
								}
							}
							doTiHuan();
							gridViewAddImgesAdpter.notifyDataSetChanged();
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

				return false;
			}
		});
		datas = new ArrayList<>();
		waitDatas = new ArrayList<>();
		successDatas = new ArrayList<>();
		faildDatas = new ArrayList<>();
		gridViewAddImgesAdpter = new GridViewAddImgesAdpter(datas, a, this);
		gw.setAdapter(gridViewAddImgesAdpter);
	}

	private void doDelete(String s) {
		NetTool.getInstance().rxDeletePictureBeanPostNet(URL_DELETE_FILE_INFO, s, SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
				.observeOn(AndroidSchedulers.mainThread())
				.subscribe(new Consumer<BaseBean>() {
					@Override
					public void accept(@NonNull BaseBean baseBean) throws Exception {
						yNProgressDialog.dismiss();
						if (baseBean.getSuccess().equals("1")) {
							Log.e("PictureListActivity", "成功");
							Toast.makeText(getApplicationContext(), "删除成功", Toast.LENGTH_SHORT).show();
						} else {
							Toast.makeText(getApplicationContext(), "删除失败", Toast.LENGTH_SHORT).show();
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

	private void doTiHuan() {
		a.clear();
		for (int i = 0; i < b.size(); i++) {
			Integer integer = b.get(i);
			Log.e("PictureListActivity", "integer:" + integer);
			a.add(integer);
		}
		b.clear();
	}

	/**
	 * 使用相机
	 */
	private void useCamera() {
		Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		file = new File(Environment.getExternalStorageDirectory().getAbsolutePath()
				+ "/test/" + System.currentTimeMillis() + ".jpg");
		file.getParentFile().mkdirs();

		//改变Uri  com.xykj.customview.fileprovider注意和xml中的一致
		Uri uri = FileProvider.getUriForFile(this, "com.zz.fileprovider", file);
		//添加权限
		intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);

		intent.putExtra(MediaStore.EXTRA_OUTPUT, uri);
		startActivityForResult(intent, 1);
	}


//    public void applyWritePermission() {
//
//        String[] permissions = {Manifest.permission.WRITE_EXTERNAL_STORAGE};
//
//        if (Build.VERSION.SDK_INT >= 23) {
//            int check = ContextCompat.checkSelfPermission(this, permissions[0]);
//            // 权限是否已经 授权 GRANTED---授权  DINIED---拒绝
//            if (check == PackageManager.PERMISSION_GRANTED) {
//                //调用相机
//                useCamera();
//            } else {
//                requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
//            }
//        } else {
//            useCamera();
//        }
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
//                                           @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        if (requestCode == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//            useCamera();
//        } else {
//            // 没有获取 到权限，从新请求，或者关闭app
//            Toast.makeText(this, "需要存储权限", Toast.LENGTH_SHORT).show();
//        }
//    }

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if (requestCode == 1 && resultCode == RESULT_OK) {
			Log.e("TAG", "---------" + FileProvider.getUriForFile(this, "com.zz.fileprovider", file));
			Map<String, Object> map = new HashMap<>();
			map.put("path", file.getAbsolutePath());
			datas.add(map);
			waitDatas.add(map);
			//给图片添加经纬度操作
			Bitmap bm = BitmapFactory.decodeFile(file.getAbsolutePath());
			try {
				FileOutputStream fos = new FileOutputStream(file);
//          FileInputStream fis = new FileInputStream(new File(tempPicPath)) ;  
				byte[] temp = new byte[1024];
				//添加经纬度水印
				Bitmap newbm = addFlag(bm);
				newbm.compress(Bitmap.CompressFormat.JPEG, 100, fos);// 把数据写入文件
				fos.flush();
				fos.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			gridViewAddImgesAdpter.notifyDataSetChanged();
			gw.smoothScrollToPosition(datas.size());
		}
	}

	private Bitmap addFlag(Bitmap src) {
		// 获取原始图片与水印图片的宽与高
		int w = src.getWidth();
		int h = src.getHeight();
		Bitmap newBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
		Canvas mCanvas = new Canvas(newBitmap);
		// 往位图中开始画入src原始图片
		mCanvas.drawBitmap(src, 0, 0, null);
		//添加文字
		Paint textPaint = new Paint();
		textPaint.setColor(Color.RED);
		textPaint.setTextSize(100);
//        Typeface typeface = Typeface.create(familyName,
//                Typeface.BOLD_ITALIC);
//        textPaint.setTypeface(typeface);
//        textPaint.setTextAlign(Align.CENTER);
		//绘制经纬度坐标到图片上
		if (locationMsg != null) {
			mCanvas.drawText(locationMsg, (float) (w * 1) / 7, (float) (h * 14) / 15, textPaint);
			mCanvas.save(Canvas.ALL_SAVE_FLAG);
			mCanvas.restore();
		}
		return newBitmap;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.title_text:
				finish();
				break;
		}
	}

	public void doUpFile(final File path, final int i) {
		String ba;
		yNProgressDialog.show();

		ba = "0";

		Log.e("PictureListActivity", "zoule" + path.getName());
		OkHttpUtils.post()//
				.addFile("file", path.getName(), path)//
				.addParams("fileid", ba)
				.addParams("userToken",SpUtils.getString(getApplicationContext(), "userToken"))
				.url(URL_UP_FILE_INFO)
				.build()
				.connTimeOut(300000)
				.readTimeOut(300000)
				.writeTimeOut(300000)
				.execute(new StringCallback() {
					@Override
					public void onError(Call call, Exception e, int id) {
						faildDatas.add(datas.get(i));
						waitDatas.remove(datas.get(i));
						upFinish();
						Log.e("PictureListActivity", e.getMessage());
						Log.e("PictureListActivity", "异常");
						a.add(i);


						gridViewAddImgesAdpter.notifyDataSetChanged();

					}

					@Override
					public void onResponse(String response, int id) {
						Log.e("PictureListActivity", response);
						Gson g = new GsonBuilder().serializeNulls().create();
						BaseBean mLoginResultBean = g.fromJson(response, BaseBean.class);
						if (mLoginResultBean.getSuccess().equals(RESPONSE_SUCCESS)) {
							name.add(path.getName());
							successDatas.add(datas.get(i));
							waitDatas.remove(datas.get(i));
							upFinish();
							int successSize = successDatas.size();
							int size = datas.size();
							Log.e("PictureListActivity", "成功");
							if (successSize == size) {

								finish();
							}

						} else {
							faildDatas.add(datas.get(i));
							waitDatas.remove(datas.get(i));
							Log.e("PictureListActivity", "失败");
							upFinish();

							a.add(i);

							gridViewAddImgesAdpter.notifyDataSetChanged();

						}


					}
				});
	}

	private void upFinish() {
		int size = datas.size();
		int wait = waitDatas.size();
		int success = successDatas.size();
		int faild = faildDatas.size();
		if (wait == 0 && faild == 0) {
			yNProgressDialog.dismiss();
			if (success == size) {
				sendBroadcast(new Intent("刷新"));
				finish();
			}
		} else {
			if (wait == 0) {
				yNProgressDialog.dismiss();
			}
			if (size == faild) {
				yNProgressDialog.dismiss();
			}
		}

	}

	/**
	 * 动态注册广播
	 *
	 * @param action
	 */
	private void registReceiver(String action) {
		locationReceiver = new LocationReceiver();
		IntentFilter intentFilter = new IntentFilter();
		intentFilter.addAction(action);
		registerReceiver(locationReceiver, intentFilter);
	}

	/**
	 * 定位接收者
	 */
	class LocationReceiver extends BroadcastReceiver {
		/**
		 * 纬度
		 */
		private String latitude;
		/**
		 * 经度
		 */
		private String longitude;
		/**
		 * 时间
		 */
		private String location_time;

		@Override
		public void onReceive(Context context, Intent intent) {
			latitude = intent.getExtras().getString("latitude");
			longitude = intent.getExtras().getString("longitude");
			location_time = intent.getExtras().getString("location_time");
			LogUtils.e("PictureListActivity-Receiver接收到定位信息：时间：" + location_time + ";纬度：" + latitude + ";经度:" + longitude);
			locationMsg = "纬度： " + latitude + "    经度：" + longitude;
			tv_location.setText(locationMsg);
		}
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		//解除广播
		unregisterReceiver(locationReceiver);
		if (!MyApplication.getInstance().isBegin)
			MyApplication.getInstance().getmLocationClient().stopLocation();
	}

}
