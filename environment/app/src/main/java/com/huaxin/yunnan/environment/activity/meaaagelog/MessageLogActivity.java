package com.huaxin.yunnan.environment.activity.meaaagelog;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.activity.meaaagelog.adapter.MessageLogAdapter;
import com.huaxin.yunnan.environment.bean.BaseBean;
import com.huaxin.yunnan.environment.bean.MessageLogBean;
import com.huaxin.yunnan.environment.net.NetTool;
import com.huaxin.yunnan.environment.refresh.RefreshLayout;

import java.util.ArrayList;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import static com.huaxin.yunnan.environment.Constant.URL_MESSAGE_LOG_INFO;
import static com.huaxin.yunnan.environment.Constant.URL_MESSAGE_READ_INFO;

public class MessageLogActivity extends BaseActicity implements View.OnClickListener {

    private LinearLayout ll_no;
    private TextView title_text;
    private ImageView iv_add;
    private RelativeLayout top_title;
    private ListView lv_message;
    private RefreshLayout refreshLayout;
    private MessageLogAdapter messageLogAdapter;
    private Intent intent;
    private RefreshReciver reciver;
    private RefreshReciver2 refreshReciver2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_log);
        reciver = new RefreshReciver();
        refreshReciver2 = new RefreshReciver2();
        registerReceiver(reciver, new IntentFilter("回到消息列表"));
        registerReceiver(refreshReciver2, new IntentFilter("回到待办列表"));
        initProgressDialog();
        initView();
        initData();
    }

    private void initData() {
        yNProgressDialog.show();
        NetTool.getInstance().rxMessageLogBeanNet(URL_MESSAGE_LOG_INFO, SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<MessageLogBean>() {
                    @Override
                    public void accept(@NonNull MessageLogBean bean) throws Exception {
                        yNProgressDialog.dismiss();
                        if (bean.getSuccess().equals("1")) {
                            messageLogAdapter.setData(bean);
                        } else {
                            Toast.makeText(getApplicationContext(), bean.getMsg(), Toast.LENGTH_SHORT).show();
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
        ll_no = (LinearLayout) findViewById(R.id.ll_no);
        title_text = (TextView) findViewById(R.id.title_text);
        title_text.setText("消息日志");
        iv_add = (ImageView) findViewById(R.id.iv_add);
        top_title = (RelativeLayout) findViewById(R.id.top_title);
        lv_message = (ListView) findViewById(R.id.lv_message);
        messageLogAdapter = new MessageLogAdapter(this);
        lv_message.setAdapter(messageLogAdapter);
        lv_message.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                yNProgressDialog.show();
                final MessageLogBean.DataBean.QueryDataBean dataBean = (MessageLogBean.DataBean.QueryDataBean) adapterView.getItemAtPosition(i);
                String activity_ins_id = null;
                String next_type_id = null;
                if (TextUtils.isEmpty(dataBean.getActivity_ins_id())) {
                    activity_ins_id = "";
                } else {
                    activity_ins_id = dataBean.getActivity_ins_id();
                }
                if (TextUtils.isEmpty(dataBean.getNext_type_id())) {
                    next_type_id = "";
                } else {
                    next_type_id = dataBean.getNext_type_id();
                }
                NetTool.getInstance().rxMessageDetailBeanNet(URL_MESSAGE_READ_INFO, dataBean.getT_main_news_id(), dataBean.getTo_person(), next_type_id, activity_ins_id, dataBean.getType_id(), SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Consumer<BaseBean>() {
                            @Override
                            public void accept(@NonNull BaseBean bean) throws Exception {
                                yNProgressDialog.dismiss();
                                if (bean.getSuccess().equals("1")) {
                                    Log.e("MessageLogActivity", "zoule");
                                    intent = new Intent(MessageLogActivity.this, MessageDetailActivity.class);
                                    intent.putExtra("dataBean", dataBean);
                                    intent.putExtra("workItemInsId", bean.getWorkItemInsId());
                                    intent = new Intent(MessageLogActivity.this,MessageDetailActivity.class);
                                    intent.putExtra("dataBean",dataBean);
                                    if (bean.getWorkItemInsId()!=null){
                                        intent.putExtra("workItemInsId",bean.getWorkItemInsId());
                                    }else{
                                        intent.putExtra("workItemInsId","-1");
                                    }
                                    startActivity(intent);
                                } else {
                                    Toast.makeText(getApplicationContext(), bean.getMsg(), Toast.LENGTH_SHORT).show();
                                }
                            }

                        }, new Consumer<Throwable>() {
                            @Override
                            public void accept(@NonNull Throwable throwable) throws Exception {
                                Log.e("MessageLogActivity", throwable.getMessage().toString());
                                yNProgressDialog.dismiss();
                                Toast.makeText(getApplicationContext(), "连接异常", Toast.LENGTH_SHORT).show();
                            }
                        });

            }
        });
        title_text.setOnClickListener(this);
    }

    private ArrayList<String> getData() {
        ArrayList<String> data = new ArrayList<>();
        String temp = " item";
        for (int i = 0; i < 20; i++) {
            data.add(i + temp);
        }
        return data;
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
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(reciver);
        unregisterReceiver(refreshReciver2);
    }

    class RefreshReciver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            initData();
        }
    }

    class RefreshReciver2 extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            finish();
        }
    }
}
