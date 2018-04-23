package com.huaxin.yunnan.environment.activity.todo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.TextUtils;
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
import com.huaxin.yunnan.environment.activity.todo.adapter.ChoiceAdapter;
import com.huaxin.yunnan.environment.bean.ChoiceBean;
import com.huaxin.yunnan.environment.net.NetTool;
import com.huaxin.yunnan.environment.refresh.RefreshLayout;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import static com.huaxin.yunnan.environment.Constant.URL_AUDIT_GETNEXTACTLIST;
import static com.huaxin.yunnan.environment.Constant.URL_AUDIT_GETNEXTACTLISTFORSUBMIT;

/**
 * 7.选择环节Activity
 */
public class ChoiceActivity extends BaseActicity implements View.OnClickListener, SwipeRefreshLayout.OnRefreshListener, RefreshLayout.OnLoadListener {

    private LinearLayout ll_no;
    private TextView title_text;
    private ListView lv_choice;
    private ChoiceBean choiceBeana;
    private ChoiceAdapter choiceAdapter;
    private Intent intent;
    private String businessid_;
    private String workitem_ins_id_;
    private String busiOrgId;
    private String bbb;
    private String proid;
    private String name;
    private String busitype_proc_id;
    private String processcorpid;
    private String activityId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        initProgressDialog();
        intent = getIntent();
        bbb = intent.getStringExtra("bbb");
        workitem_ins_id_ = intent.getStringExtra("workitem_ins_id_");
        businessid_ = intent.getStringExtra("businessid_");
        busiOrgId = intent.getStringExtra("busiOrgId");
        proid = intent.getStringExtra("proid");
        name = intent.getStringExtra("name");
//        intent.putExtra("busitype_proc_id",dataBean.getBusitype_proc_id());
//        intent.putExtra("processcorpid",dataBean.getProcesscorpid());
        busitype_proc_id = intent.getStringExtra("busitype_proc_id");
        processcorpid = intent.getStringExtra("processcorpid");
        initView();

        initData();
    }

    private void initData() {
        if (bbb.equals("0")) {
            Log.e("ToDoActivity", URL_AUDIT_GETNEXTACTLIST);
            NetTool.getInstance().rxChoiceBeanPostNet(URL_AUDIT_GETNEXTACTLIST, workitem_ins_id_, SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Consumer<ChoiceBean>() {


                        @Override
                        public void accept(@NonNull ChoiceBean choiceBean) throws Exception {
                            yNProgressDialog.dismiss();
                            if (choiceBean.getSuccess().equals("1")) {
                                choiceBeana = choiceBean;
                                choiceAdapter.setData(choiceBean);
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
        } else {
            NetTool.getInstance().rxChoiceBean1PostNet(URL_AUDIT_GETNEXTACTLISTFORSUBMIT, proid, SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Consumer<ChoiceBean>() {




                        @Override
                        public void accept(@NonNull ChoiceBean choiceBean) throws Exception {
                            yNProgressDialog.dismiss();
                            if (choiceBean.getSuccess().equals("1")) {
                                choiceBeana = choiceBean;
                                activityId = choiceBean.getData().getActivityId();
                                choiceAdapter.setData(choiceBean);
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

    }

    private void initView() {
        ll_no = (LinearLayout) findViewById(R.id.ll_no);
        title_text = (TextView) findViewById(R.id.title_text);
        title_text.setText("选择环节");
        lv_choice = (ListView) findViewById(R.id.lv_choice);
        choiceAdapter = new ChoiceAdapter(this);
        lv_choice.setAdapter(choiceAdapter);
        lv_choice.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            private Intent intent;

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                intent = new Intent(ChoiceActivity.this, SelectManagerActivity.class);
                ChoiceBean.DataBean.NextActListBean nextActListBean = (ChoiceBean.DataBean.NextActListBean) adapterView.getItemAtPosition(i);
                intent.putExtra("processid", choiceBeana.getData().getProcessId());
                intent.putExtra("processVer", choiceBeana.getData().getProcessVer());
                Log.e("ChoiceActivity", nextActListBean.getActType());
                intent.putExtra("actId", nextActListBean.getActId());
                intent.putExtra("actType", nextActListBean.getActType());
                intent.putExtra("workitem_ins_id_", busiOrgId);
                intent.putExtra("activityId", activityId);
                intent.putExtra("hjmc", nextActListBean.getActName());
                intent.putExtra("name", name);
                intent.putExtra("busitype_proc_id",busitype_proc_id);
                intent.putExtra("processcorpid", processcorpid);
                startActivityForResult(intent, 0);
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


    @Override
    public void onRefresh() {

    }

    @Override
    public void onLoad() {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null) {
            return;
        }
        if (requestCode == 0) {
            switch (resultCode) {
                case 8:
                    String nam = data.getStringExtra("name");
                    Log.e("ChoiceActivity", "dfsfsd"+nam);
                    if (TextUtils.isEmpty(nam)){
                        Log.e("ChoiceActivity", "dfsfsd"+nam);
                    String name = data.getStringExtra("name");
                    String username = data.getStringExtra("username");
                    Log.e("ChoiceActivity", username);
                    String hjmc = data.getStringExtra("hjmc");
                    Log.e("ChoiceActivity", hjmc);
                    String id = data.getStringExtra("id");
                    Log.e("ChoiceActivity", id);
                    String actType = data.getStringExtra("actType");
                    Log.e("ChoiceActivity", actType);
                    String blr = data.getStringExtra("blr");
                    Log.e("ChoiceActivity", blr);
                    intent = new Intent(ChoiceActivity.this, CommentAgreeActivity.class);
                    intent.putExtra("username", username);
                    intent.putExtra("hjmc", hjmc);
                    intent.putExtra("id", id);
                    intent.putExtra("actType", actType);
                    intent.putExtra("blr", blr);
                    intent.putExtra("name", name);
                    setResult(8, intent);
                    finish();
                }else {
                        Log.e("ChoiceActivity", "zoule"+nam);
                        String name = data.getStringExtra("name");
                        String username = data.getStringExtra("username");
                        Log.e("ChoiceActivity", username);
                        String hjmc = data.getStringExtra("hjmc");
                        Log.e("ChoiceActivity", hjmc);
                        String id = data.getStringExtra("id");
                        Log.e("ChoiceActivity", id);
                        String actType = data.getStringExtra("actType");
                        Log.e("ChoiceActivity", actType);
                        String blr = data.getStringExtra("blr");
                        Log.e("ChoiceActivity", blr);


                        intent = new Intent(ChoiceActivity.this, SelectProcessActivity.class);
                        intent.putExtra("username", username);
                        intent.putExtra("hjmc", hjmc);
                        intent.putExtra("id", id);
                        intent.putExtra("actType", actType);
                        intent.putExtra("blr", blr);
                        intent.putExtra("name", name);
                        intent.putExtra("processid", data.getStringExtra("processid"));
                        intent.putExtra("processVer", data.getStringExtra("processVer"));
                        intent.putExtra("busitype_proc_id", data.getStringExtra("busitype_proc_id"));
                        intent.putExtra("processcorpid", data.getStringExtra("processcorpid"));
                        intent.putExtra("activityId", data.getStringExtra("activityId"));
                        setResult(8, intent);
                        finish();
                    }
                    break;
            }
        }
    }
}
