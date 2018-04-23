package com.huaxin.yunnan.environment.activity.todo;

import android.content.Intent;
import android.os.Bundle;
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
import com.huaxin.yunnan.environment.activity.todo.adapter.SelectManagerAdapter;
import com.huaxin.yunnan.environment.bean.SelectManagerBean;
import com.huaxin.yunnan.environment.net.NetTool;

import java.util.ArrayList;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import static com.huaxin.yunnan.environment.Constant.URL_AUDIT_GETUSERLISTOFACT;

public class SelectManagerActivity extends BaseActicity implements View.OnClickListener {

    private LinearLayout ll_no;
    private TextView title_text;
    private ListView lv_sm;
    private SelectManagerAdapter selectManagerAdapter;
    private Intent intent;
    private String processid;
    private String processVer;
    private String id;
    private String workitem_ins_id_;
    private String hjmc;
    private String actType;
    private String name;
    private String busitype_proc_id;
    private String processcorpid;
    private String activityId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_manager);
        initProgressDialog();
        intent = getIntent();
        processid = intent.getStringExtra("processid");
        processVer = intent.getStringExtra("processVer");
        actType = intent.getStringExtra("actType");
        name = intent.getStringExtra("name");
        activityId = intent.getStringExtra("activityId");
        Log.e("SelectManagerActivity", actType);
        busitype_proc_id = intent.getStringExtra("busitype_proc_id");
        processcorpid = intent.getStringExtra("processcorpid");
        id = intent.getStringExtra("actId");

        workitem_ins_id_ = intent.getStringExtra("workitem_ins_id_");
        hjmc = intent.getStringExtra("hjmc");
        initView();
        initData();
    }

    private void initData() {
        yNProgressDialog.show();
        NetTool.getInstance().rxSelectManagerBeanPostNet(URL_AUDIT_GETUSERLISTOFACT, processid, processVer, id, workitem_ins_id_, SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<SelectManagerBean>() {


                    @Override
                    public void accept(@NonNull SelectManagerBean selectManagerBean) throws Exception {
                        yNProgressDialog.dismiss();
                        if (selectManagerBean.getSuccess().equals("1")) {
                            selectManagerAdapter.setData(selectManagerBean);
                        } else {
                            Toast.makeText(getApplicationContext(), selectManagerBean.getMsg(), Toast.LENGTH_SHORT).show();
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
        title_text.setText("选择办理人");
        lv_sm = (ListView) findViewById(R.id.lv_sm);
        selectManagerAdapter = new SelectManagerAdapter(this);
        lv_sm.setAdapter(selectManagerAdapter);
        lv_sm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent = new Intent(ChooseTwoActivity.this, ChooseActivity.class);
//                intent.putExtra("s", s);
//                intent.putExtra("pu", "pu");
//                intent.putExtra("Type",isJlx);
//                setResult(8, intent);
//                ChooseTwoActivity.this.finish();
                SelectManagerBean.DataBean dataBean = (SelectManagerBean.DataBean) adapterView.getItemAtPosition(i);
                intent = new Intent(SelectManagerActivity.this, ChoiceActivity.class);
                intent.putExtra("username", dataBean.getUsername());
                intent.putExtra("blr", dataBean.getUserid());
                intent.putExtra("hjmc", hjmc);
                intent.putExtra("id", id);
                intent.putExtra("actType", actType);
                intent.putExtra("name", name);
                intent.putExtra("processid", processid);
                intent.putExtra("processVer", processVer);
                intent.putExtra("busitype_proc_id", busitype_proc_id);
                intent.putExtra("processcorpid", processcorpid);
                intent.putExtra("activityId", activityId);
                Log.e("SelectManagerActivity", processid);
                Log.e("SelectManagerActivity", processVer);
                Log.e("SelectManagerActivity", id);
                setResult(8, intent);
                finish();
            }
        });
        title_text.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.title_text:
                finish();
                break;
        }
    }

    private ArrayList<String> getData() {
        ArrayList<String> data = new ArrayList<>();
        String temp = " item";
        for (int i = 0; i < 20; i++) {
            data.add(i + temp);
        }

        return data;
    }
}
