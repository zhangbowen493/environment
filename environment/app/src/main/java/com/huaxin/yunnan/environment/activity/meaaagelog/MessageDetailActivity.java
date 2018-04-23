package com.huaxin.yunnan.environment.activity.meaaagelog;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.activity.todo.PendAuditActivity;
import com.huaxin.yunnan.environment.activity.todo.RejectEditActivity;
import com.huaxin.yunnan.environment.bean.MessageLogBean;

public class MessageDetailActivity extends BaseActicity {

    private TextView title_text;
    private TextView tv_title;
    private TextView tv_message;
    private MessageLogBean.DataBean.QueryDataBean dataBean;
    private Intent intent;
    private String workItemInsId;
    private String isXG;
    private RefreshReciver reciver;
    private CharSequence str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        reciver = new RefreshReciver();
        registerReceiver(reciver, new IntentFilter("回到消息列表"));
        registerReceiver(reciver, new IntentFilter("回到待办列表"));
        setContentView(R.layout.activity_message_detail);
        dataBean = (MessageLogBean.DataBean.QueryDataBean) getIntent().getSerializableExtra("dataBean");
        workItemInsId = getIntent().getStringExtra("workItemInsId");
        isXG = getIntent().getStringExtra("isXG");
        initTitleBackView();
        LogUtils.e("MessageDetailActivity:dataBean:" + dataBean);
        LogUtils.e("MessageDetailActivity:workItemInsId:" + workItemInsId);
        LogUtils.e("MessageDetailActivity:isXG:" + isXG);
        if (dataBean == null || workItemInsId == null) {
            LogUtils.e("结束当前页面：MessageDetailActivity");
            finish();
        } else {
            initView();
        }
    }

    private void initView() {
        title_text = (TextView) findViewById(R.id.title_text);
        title_text.setText("消息详情");
        tv_title = (TextView) findViewById(R.id.tv_title);
        tv_title.setText(dataBean.getName());
        tv_message = (TextView) findViewById(R.id.tv_message);
        String replace = dataBean.getTitle().replace("+a+", "/");
        String[] strs = replace.split("/");
        if (dataBean.getRead_status().equals("1")) {
            if (dataBean.getContent_id() == null) {
                tv_message.setText(strs[0] + "" + strs[1]);
            } else {
                tv_message.setText(strs[0] + dataBean.getContent_id() + strs[1]);
            }


        } else {
            if (dataBean.getContent_id() == null) {
                str = "";
            } else {
                str = dataBean.getContent_id();
            }

            SpannableString spannableString1 = new SpannableString(str);


            spannableString1.setSpan(new ClickableSpan() {

                @Override
                public void onClick(View widget) {
                    if (dataBean.getVc_status().equals("3")) {
                        intent = new Intent(MessageDetailActivity.this, RejectEditActivity.class);
                        intent.putExtra("workitem_ins_id_", workItemInsId);
                        intent.putExtra("businessid_", dataBean.getType_id());
                        intent.putExtra("FromWhere", "Message");
                        intent.putExtra("isXG", isXG);
                        startActivity(intent);
                    } else if (dataBean.getVc_status().equals("1")) {
                        intent = new Intent(MessageDetailActivity.this, PendAuditActivity.class);
                        intent.putExtra("workitem_ins_id_", workItemInsId);
                        intent.putExtra("businessid_", dataBean.getType_id());
                        intent.putExtra("FromWhere", "Message");
                        intent.putExtra("isXG", isXG);
                        startActivity(intent);
                    }
//                Toast.makeText(getApplicationContext(), "who hit me", Toast.LENGTH_SHORT).show();

                }
            }, 0, str.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableString1.setSpan(new ForegroundColorSpan(Color.RED), 0, str.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            tv_message.setText(strs[0]);
            tv_message.append(spannableString1);
            tv_message.append(strs[1]);
            tv_message.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        sendBroadcast(new Intent("回到消息列表"));
        unregisterReceiver(reciver);
    }

    class RefreshReciver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            finish();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
//        dataBean = (MessageLogBean.DataBean.QueryDataBean) getIntent().getSerializableExtra("dataBean");
//        workItemInsId = getIntent().getStringExtra("workItemInsId");
    }
}
