package com.huaxin.yunnan.environment.activity.todo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.activity.todo.adapter.ToDoAdapter;
import com.huaxin.yunnan.environment.bean.ToDoListBean;
import com.huaxin.yunnan.environment.net.NetTool;
import com.huaxin.yunnan.environment.refresh.RefreshLayout;

import java.util.ArrayList;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import static com.huaxin.yunnan.environment.Constant.URL_AUDIT_GETTODOLIST;

public class ToDoActivity extends BaseActicity implements View.OnClickListener, SwipeRefreshLayout.OnRefreshListener, RefreshLayout.OnLoadListener {

    private LinearLayout ll_no;
    private TextView title_text;
    private ListView lv_sm;
    private ToDoAdapter toDoAdapter;
    private RefreshLayout refreshLayout;
    private RefreshReciver reciver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);
        initTitleBackView();
        initProgressDialog();
        reciver = new RefreshReciver();
        registerReceiver(reciver, new IntentFilter("刷新待办"));
        initView();
//        refresh();
        initData();
    }

    private void initData() {
        yNProgressDialog.show();
        Log.e("ToDoActivity", URL_AUDIT_GETTODOLIST);
        NetTool.getInstance().rxToDoListBeanPostNet(URL_AUDIT_GETTODOLIST, "E002002", SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ToDoListBean>() {
                    @Override
                    public void accept(@NonNull ToDoListBean toDoListBean) throws Exception {
                        yNProgressDialog.dismiss();
                        if (toDoListBean.getSuccess().equals("1")) {
                            toDoAdapter.setData(toDoListBean);
                        } else {
                            Toast.makeText(getApplicationContext(), toDoListBean.getMsg().toString(), Toast.LENGTH_SHORT).show();
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
        title_text.setText("待办事项");
        lv_sm = (ListView) findViewById(R.id.lv_sm);
        lv_sm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            private Intent intent;

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ToDoListBean.DataBean dataBean = (ToDoListBean.DataBean) adapterView.getItemAtPosition(i);
                if (dataBean.getTodo_type_().equals("2")) {
                    intent = new Intent(ToDoActivity.this, RejectEditActivity.class);
                    String businessid_ = dataBean.getBusinessid_();
                    String application_userid_ = dataBean.getApplication_userid_();
                    String arrivetime_ = dataBean.getArrivetime_();
                    String workitem_ins_id_ = dataBean.getWorkitem_ins_id_();
                    intent.putExtra("workitem_ins_id_", workitem_ins_id_);
                    intent.putExtra("businessid_", businessid_);
                    intent.putExtra("application_userid_", application_userid_);
                    intent.putExtra("arrivetime_", arrivetime_);
                    startActivityForResult(intent, 8);
                } else {
                    intent = new Intent(ToDoActivity.this, PendAuditActivity.class);
                    String businessid_ = dataBean.getBusinessid_();
                    String workitem_ins_id_ = dataBean.getWorkitem_ins_id_();
                    intent.putExtra("workitem_ins_id_", workitem_ins_id_);
                    intent.putExtra("businessid_", businessid_);
                    Log.e("MessageDetailActivity", workitem_ins_id_);
                    Log.e("MessageDetailActivity", businessid_);
                    startActivityForResult(intent, 8);
                }
            }
        });
        toDoAdapter = new ToDoAdapter(this);
        lv_sm.setAdapter(toDoAdapter);
//        title_text.setOnClickListener(this);
//        refreshLayout = (RefreshLayout) findViewById(R.id.refreshLayout);
//        refreshLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.title_text:

                break;
        }
    }


    //初始化刷新控件
    private void refresh() {
        refreshLayout = (RefreshLayout) findViewById(R.id.refreshLayout);

        refreshLayout.setColorSchemeResources(R.color.colorPrimary, R.color.colorAccent, R.color.colorAccent, R.color.colorPrimaryDark);

        refreshLayout.setOnRefreshListener(this);

        refreshLayout.setOnLoadListener(this);
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
    public void onRefresh() {

    }

    @Override
    public void onLoad() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(reciver);
    }

    class RefreshReciver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            initData();
        }
    }
}
