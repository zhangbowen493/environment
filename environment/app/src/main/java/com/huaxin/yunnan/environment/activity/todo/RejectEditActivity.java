package com.huaxin.yunnan.environment.activity.todo;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.bigkoo.pickerview.TimePickerView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.MyApplication;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.activity.meaaagelog.MessageLogActivity;
import com.huaxin.yunnan.environment.activity.todo.adapter.ReviewHistoryAdapter;
import com.huaxin.yunnan.environment.bean.BaseBean;
import com.huaxin.yunnan.environment.bean.PendAuditBean;
import com.huaxin.yunnan.environment.bean.RejectEditBean;
import com.huaxin.yunnan.environment.bean.ReviewHistoryBean;
import com.huaxin.yunnan.environment.net.NetTool;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Call;

import static com.huaxin.yunnan.environment.Constant.RESPONSE_SUCCESS;
import static com.huaxin.yunnan.environment.Constant.URL_AUDIT_GETAUDITHISTORYLIST;
import static com.huaxin.yunnan.environment.Constant.URL_BOHUI_CHONGTIJIAO_INFO;
import static com.huaxin.yunnan.environment.Constant.URL_BOHUI_WENJIAN_INFO;
import static com.huaxin.yunnan.environment.Constant.URL_PEND_AUDIT;

/**
 * 驳回重编辑页面
 */
public class RejectEditActivity extends BaseActicity implements View.OnClickListener {

    private LinearLayout ll_no;
    private TextView title_text;
    private Button bt_bc;
    private Button bt_xzlcbtj;
    private Button bt_shls;
    private String businessid_;
    private String workitem_ins_id_;
    private String vc_create_mechanism;
    private Intent intent;
    private TextView tv_bt;
    private TextView tv_wslx;
    private TextView tv_wsbh;
    private TextView tv_wjmc;
    private TextView tv_wsjzrq;
    private TextView tv_fqr;
    private TextView tv_fwdw;
    private Intent intent1;
    private RefreshReciver reciver;
    private ArrayList<String> classTexts = new ArrayList<String>();
    private String application_userid_;
    private String arrivetime_;
    private String fromWhere;
    private String isXG;
    private ListView lv_review;

    private ReviewHistoryAdapter reviewHistoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reject_edit);
        reciver = new RefreshReciver();
        registerReceiver(reciver, new IntentFilter("刷新待办"));
        registerReceiver(reciver, new IntentFilter("回到消息列表"));
        registerReceiver(reciver, new IntentFilter("回到待办列表"));
        initProgressDialog();
        intent = getIntent();
        businessid_ = intent.getStringExtra("businessid_");
        fromWhere = intent.getStringExtra("FromWhere");
        workitem_ins_id_ = intent.getStringExtra("workitem_ins_id_");
        isXG = intent.getStringExtra("isXG");

//        application_userid_ = intent.getStringExtra("application_userid_");
//        arrivetime_ = intent.getStringExtra("arrivetime_");

        initView();
        initData();
    }

    private void initData() {
        yNProgressDialog.show();
        NetTool.getInstance().rxPendAuditBeanPostNet(URL_PEND_AUDIT, businessid_, SpUtils.getString(getApplicationContext(), "userId"), SpUtils.getString(getApplicationContext(), "userToken","")).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<PendAuditBean>() {

                    @Override
                    public void accept(@NonNull PendAuditBean pendAuditBean) throws Exception {
                        initHistoryData();

                        MyApplication.getInstance().setmPendAuditBean(pendAuditBean);
                        if (pendAuditBean.getSuccess().equals("1")) {
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
                            if (pendAuditBean.getData().get(0).getFileName() == null) {
                                tv_wjmc.setText("");
                            } else {
                                tv_wjmc.setText(pendAuditBean.getData().get(0).getFileName().toString());
                            }
                            if (pendAuditBean.getData().get(0).getDocument_end_time() == null) {
                                tv_wsjzrq.setText("");
                            } else {
                                tv_wsjzrq.setText(pendAuditBean.getData().get(0).getDocument_end_time().toString());
                            }
                            if (pendAuditBean.getData().get(0).getT_userinfo_id() == null) {
                                tv_fqr.setText("");
                            } else {
                                tv_fqr.setText(pendAuditBean.getData().get(0).getT_userinfo_id().toString());
                            }

                            if (pendAuditBean.getData().get(0).getT_document_company_id() == null) {
                                tv_fwdw.setText("");
                            } else {
                                tv_fwdw.setText(pendAuditBean.getData().get(0).getT_document_company_id().toString());
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

    private void initView() {
        lv_review = (ListView) findViewById(R.id.lv_review);
        reviewHistoryAdapter = new ReviewHistoryAdapter(this);
        lv_review.setAdapter(reviewHistoryAdapter);

        classTexts.add("一般");
        classTexts.add("紧急");
        classTexts.add("非常紧急");
        ll_no = (LinearLayout) findViewById(R.id.ll_no);
        title_text = (TextView) findViewById(R.id.title_text);
        title_text.setText("驳回重编辑");
        bt_bc = (Button) findViewById(R.id.bt_bc);
        bt_xzlcbtj = (Button) findViewById(R.id.bt_xzlcbtj);
        bt_shls = (Button) findViewById(R.id.bt_shls);

        title_text.setOnClickListener(this);
        bt_bc.setOnClickListener(this);
        bt_xzlcbtj.setOnClickListener(this);
        bt_shls.setOnClickListener(this);
        tv_bt = (TextView) findViewById(R.id.tv_bt);
        tv_bt.setOnClickListener(this);
        tv_wslx = (TextView) findViewById(R.id.tv_wslx);
        tv_wslx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showListPopupWindow(findViewById(R.id.ll_txl),  classTexts, new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        tv_wslx.setText(classTexts.get(position));
//                        seatClass = classCodes[position];
                        mPopupWindow.dismiss();
                    }
                });
            }
        });
        tv_wsbh = (TextView) findViewById(R.id.tv_wsbh);
        tv_wsbh.setOnClickListener(this);
        tv_wjmc = (TextView) findViewById(R.id.tv_wjmc);
        tv_wjmc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("*/*");//设置类型，我这里是任意类型，任意后缀的可以这样写。
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                startActivityForResult(intent,1);
            }
        });
        tv_wsjzrq = (TextView) findViewById(R.id.tv_wsjzrq);
        tv_wsjzrq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager inputMethodManager = (InputMethodManager) RejectEditActivity.this.getApplicationContext().
                        getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(tv_wsjzrq.getWindowToken(), 0); //隐藏

                TimePickerView timePickerView = new TimePickerView.Builder(RejectEditActivity.this, new TimePickerView.OnTimeSelectListener() {
                    @Override
                    public void onTimeSelect(Date date, View v) {//选中事件回调
                        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                        tv_wsjzrq.setText(format.format(date));
                    }
                }).setContentSize(25)
                        .setType(new boolean[]{true, true, true, false, false, false})//隐藏时分秒
                        .isCenterLabel(false)//是否只显示中间选中项的label文字，false则每项item全部都带有label。
                        .build();
                if (tv_wsjzrq.getText().toString().equals("")) {

                } else {


                    final String s = tv_wsjzrq.getText().toString();
                    Log.e("RejectEditActivity", s);
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Date date = null;
                    try {
                        date = sdf.parse(s);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date);

                    timePickerView.setDate(calendar);

                }

                timePickerView.show();
            }
        });
        tv_fqr = (TextView) findViewById(R.id.tv_fqr);
        tv_fqr.setOnClickListener(this);
        tv_fwdw = (TextView) findViewById(R.id.tv_fwdw);
        tv_fwdw.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.title_text:
                if (TextUtils.isEmpty(fromWhere)) {
                    finish();
                } else if (fromWhere.equals("Message")){
                    dialogList();
                }
                break;
            case R.id.bt_bc:
                //保存
                yNProgressDialog.show();
                NetTool.getInstance().rxRejectEditBeanNet(URL_BOHUI_CHONGTIJIAO_INFO, businessid_,tv_wslx.getText().toString(),tv_wsbh.getText().toString(),tv_bt.getText().toString(),tv_wsjzrq.getText().toString(),tv_fqr.getText().toString(),tv_fwdw.getText().toString(),tv_wjmc.getText().toString(), SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Consumer<RejectEditBean>() {
                            @Override
                            public void accept(@NonNull RejectEditBean pendAuditBean) throws Exception {
                                yNProgressDialog.dismiss();
                                if (pendAuditBean.getSuccess().equals("1")) {
                                    yNProgressDialog.dismiss();
                                    if (TextUtils.isEmpty(fromWhere)) {
                                        sendBroadcast(new Intent("刷新待办"));
                                        finish();
                                    } else if (fromWhere.equals("Message")){
                                        dialogList();
                                    }
                                } else {
                                    yNProgressDialog.show();
                                    Toast.makeText(getApplicationContext(), pendAuditBean.getMsg().toString(), Toast.LENGTH_SHORT).show();
                                }
                            }

                        }, new Consumer<Throwable>() {
                            @Override
                            public void accept(@NonNull Throwable throwable) throws Exception {
                                yNProgressDialog.dismiss();
                                Toast.makeText(getApplicationContext(), "连接异常"+throwable.toString(), Toast.LENGTH_SHORT).show();
                                throwable.printStackTrace();
                            }
                        });
                break;
            case R.id.bt_xzlcbtj:
                //选择流程并提交
                intent = new Intent(RejectEditActivity.this, ResubmitActivity.class);
                intent.putExtra("workitem_ins_id_",workitem_ins_id_);
                intent.putExtra("busiOrgId", vc_create_mechanism);
                intent.putExtra("businessid_",businessid_);
                intent.putExtra("fromWhere",fromWhere);
                startActivityForResult(intent,8);
//                startActivity(intent);
                break;
            case R.id.bt_shls:
                //审核历史
                intent = new Intent(RejectEditActivity.this, ReviewHistoryActivity.class);
                intent.putExtra("workitem_ins_id_",workitem_ins_id_);
                intent.putExtra("businessid_",businessid_);
                intent.putExtra("busiOrgId", vc_create_mechanism);
                startActivity(intent);
                break;
        }
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
                    if (isXG!=null){
                        startActivity(new Intent(RejectEditActivity.this, MessageLogActivity.class));
                    }
                    //
                    finish();
                } else {
                    intent = new Intent(RejectEditActivity.this,ToDoActivity.class);
                    startActivity(intent);
                    sendBroadcast(new Intent("回到待办列表"));
                    finish();
                }
            }
        });

        builder.create().show();
    }

//    private RequestCall mRequestCall;
//    private void Post() {
//        yNProgressDialog.show();
//        PendAuditBean pendAuditBean= MyApplication.getInstance().getmPendAuditBean();
//        mRequestCall = OkHttpUtils
//                .post()
//                .url(URL_BOHUI_CHONGTIJIAO_INFO)
//
//                .addParams("t_document_management_id", businessid_)
//                //文书类型
//                .addParams("vc_document_priority_type", tv_wslx.getText().toString())
//                //文书编号
//                .addParams("vc_document_number", tv_wsbh.getText().toString())
//                //标题
//                .addParams("vc_document_name", tv_bt.getText().toString())
//                //文书截止日期
//                .addParams("document_end_time", tv_wsjzrq.getText().toString())
//                .addParams("vc_create_user", pendAuditBean.getData().get(0).getVc_create_user())
//                .addParams("vc_create_mechanism", pendAuditBean.getData().get(0).getVc_create_mechanism())
//                //文件名称
//                .addParams("fileName", tv_wjmc.getText().toString())
//                .addParams("userToken", SpUtils.getString(getApplicationContext(), "userToken",""))
//
//                .addParams("t_receipt_management_id", pendAuditBean.getData().get(0).getT_receipt_management_id()+"")
//                //发起人
//                .addParams("t_userinfo_id", tv_fqr.getText().toString())
//                //发文单位
//                .addParams("t_document_company_id", vc_create_mechanism)
//                .addParams("create_time", pendAuditBean.getData().get(0).getCreate_time())
//                .addParams("vc_update_user", pendAuditBean.getData().get(0).getVc_update_user()+"")
//                .addParams("update_time", pendAuditBean.getData().get(0).getUpdate_time())
//                .addParams("vc_uodate_mechanism", pendAuditBean.getData().get(0).getVc_uodate_mechanism()+"")
//                .addParams("vc_status", pendAuditBean.getData().get(0).getVc_status())
//                .addParams("vc_workflow", pendAuditBean.getData().get(0).getVc_workflow())
//                .addParams("vc_status_id", pendAuditBean.getData().get(0).getVc_status_id())
//                .addParams("is_interior", pendAuditBean.getData().get(0).getIs_interior())
//                .addParams("audit_end_user", pendAuditBean.getData().get(0).getAudit_end_user()+"")
//                .addParams("audit_end_org", pendAuditBean.getData().get(0).getAudit_end_org()+"")
//                .addParams("orgname", pendAuditBean.getData().get(0).getOrgname())
//                .addParams("filePath", pendAuditBean.getData().get(0).getFilePath())
//
//                .build();
//
//        mRequestCall.execute(new StringCallback() {
//            @Override
//            public void onError(Call call, Exception e, int id) {
//                call.cancel();
//                yNProgressDialog.dismiss();
//                LogUtils.e("网络请求失败！" + e.toString());
//            }
//
//            @Override
//            public void onResponse(String response, int id) {
//                yNProgressDialog.dismiss();
//                LogUtils.e("网络请求返回response:" + response);
//                Gson g = new GsonBuilder().serializeNulls().create();
//                RejectEditBean mRejectEditBean = g.fromJson(response, RejectEditBean.class);
//            }
//        });
//    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)  {
        if (resultCode == Activity.RESULT_OK) {//是否选择，没选择就不会继续
//            Uri uri = FileProvider.getUriForFile(this, "com.zz.fileprovider", file);

            Uri uri = data.getData();//得到uri，后面就是将uri转化成file的过程。
//            Toast.makeText(getApplicationContext(), getPath_above19(RejectEditActivity.this, uri), Toast.LENGTH_SHORT).show();
            Log.e("RejectEditActivity", getPath_above19(RejectEditActivity.this, uri));
            final File file = new File(getPath_above19(RejectEditActivity.this, uri));
            Log.e("RejectEditActivity","businessid_"+ businessid_);
            OkHttpUtils.post()//
                    .addFile("file", file.getName(), file)//
                    .addParams("businessId", businessid_)
                    .addParams("userToken",SpUtils.getString(getApplicationContext(), "userToken"))
                    .url(URL_BOHUI_WENJIAN_INFO)
                    .build()
                    .connTimeOut(300000)
                    .readTimeOut(300000)
                    .writeTimeOut(300000)
                    .execute(new StringCallback() {
                        @Override
                        public void onError(Call call, Exception e, int id) {
                            Log.e("PictureListActivity", e.getMessage());
                            Log.e("PictureListActivity", "异常");
                            Toast.makeText(getApplicationContext(), "连接超时", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onResponse(String response, int id) {
                            Log.e("PictureListActivity", response);
                            Gson g = new GsonBuilder().serializeNulls().create();
                            BaseBean mLoginResultBean = g.fromJson(response, BaseBean.class);
                            if (mLoginResultBean.getSuccess().equals(RESPONSE_SUCCESS)) {
                                Toast.makeText(getApplicationContext(), "上传成功", Toast.LENGTH_SHORT).show();
                                tv_wjmc.setText(file.getName());
                            } else {
                                Toast.makeText(getApplicationContext(), "上传失败", Toast.LENGTH_SHORT).show();
                            }


                        }
                    });
//            String[] proj = {MediaStore.Images.Media.DATA};
//            Cursor actualimagecursor = managedQuery(uri, proj, null, null, null);
//            int actual_image_column_index = actualimagecursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
//            actualimagecursor.moveToFirst();
//            String img_path = actualimagecursor.getString(actual_image_column_index);
//            File file = new File(img_path);
//            Toast.makeText(RejectEditActivity.this, file.toString(), Toast.LENGTH_SHORT).show();
        }
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public  static String getPath_above19(final Context context, final Uri uri) {
        final boolean isKitKat = Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT;
        // DocumentProvider
        if (isKitKat && DocumentsContract.isDocumentUri(context, uri)) {
            // ExternalStorageProvider
            if (isExternalStorageDocument(uri)) {
                final String docId = DocumentsContract.getDocumentId(uri);
                final String[] split = docId.split(":");
                final String type = split[0];
                if ("primary".equalsIgnoreCase(type)) {
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                }
            }
            // DownloadsProvider
            else if (isDownloadsDocument(uri)) {
                final String id = DocumentsContract.getDocumentId(uri);
                final Uri contentUri = ContentUris.withAppendedId(
                        Uri.parse("content://downloads/public_downloads"), Long.valueOf(id));
                return getDataColumn(context, contentUri, null, null);
            }
            // MediaProvider
            else if (isMediaDocument(uri)) {
                final String docId = DocumentsContract.getDocumentId(uri);
                final String[] split = docId.split(":");
                final String type = split[0];
                Uri contentUri = null;
                if ("image".equals(type)) {
                    contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(type)) {
                    contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(type)) {
                    contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                final String selection = "_id=?";
                final String[] selectionArgs = new String[]{
                        split[1]
                };
                return getDataColumn(context, contentUri, selection, selectionArgs);
            }
        }
        // MediaStore (and general)
        else if ("content".equalsIgnoreCase(uri.getScheme())) {
            // Return the remote address
            if (isGooglePhotosUri(uri))
                return uri.getLastPathSegment();
            return getDataColumn(context, uri, null, null);
        }
        // File
        else if ("file".equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        }
        return null;
    }
    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static boolean isGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(reciver);
    }

    public static String getDataColumn(Context context, Uri uri, String selection,
                                       String[] selectionArgs) {
        Cursor cursor = null;
        final String column = "_data";
        final String[] projection = {column};
        try {
            cursor = context.getContentResolver().query(uri, projection, selection, selectionArgs,
                    null);
            if (cursor != null && cursor.moveToFirst()) {
                final int index = cursor.getColumnIndexOrThrow(column);
                return cursor.getString(index);
            }
        } finally {
            if (cursor != null)
                cursor.close();
        }
        return null;
    }

    class RefreshReciver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            finish();
        }
    }

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
