package com.huaxin.yunnan.environment.activity.todo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.activity.todo.adapter.SelectProcessAdapter;
import com.huaxin.yunnan.environment.bean.SelectProcessBean;
import com.huaxin.yunnan.environment.net.NetTool;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import static com.huaxin.yunnan.environment.Constant.URL_AUDIT_GETPROCESSLIST;
import static com.huaxin.yunnan.environment.Constant.URL_AUDIT_GETTODOLIST;

public class SelectProcessActivity extends BaseActicity implements View.OnClickListener {

    private LinearLayout ll_no;
    private TextView title_text;
    private RelativeLayout rl_in;
    private RelativeLayout rl_out;
    private Intent intent;
    private String businessid_;
    private String workitem_ins_id_;
    private String busiOrgId;
    private ListView lv_sp;
    private SelectProcessAdapter selectProcessAdapter;
    String id;
    String actType;
    String blr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_process);
        initProgressDialog();
        intent = getIntent();
        businessid_ = intent.getStringExtra("businessid_");
        workitem_ins_id_ = intent.getStringExtra("workitem_ins_id_");
        busiOrgId = intent.getStringExtra("busiOrgId");
        initView();
        initData();
    }

    private void initData() {
        yNProgressDialog.show();
        Log.e("ToDoActivity", URL_AUDIT_GETTODOLIST);
        NetTool.getInstance().rxSelectProcessBeanPostNet(URL_AUDIT_GETPROCESSLIST, businessid_, busiOrgId, SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<SelectProcessBean>() {
                    @Override
                    public void accept(@NonNull SelectProcessBean toDoListBean) throws Exception {
                        yNProgressDialog.dismiss();
                        if (toDoListBean.getSuccess().equals("1")) {
                            selectProcessAdapter.setData(toDoListBean);
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
        title_text.setText("选择流程");


        title_text.setOnClickListener(this);
        lv_sp = (ListView) findViewById(R.id.lv_sp);
        selectProcessAdapter = new SelectProcessAdapter(this);
        lv_sp.setAdapter(selectProcessAdapter);
        lv_sp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                SelectProcessBean.DataBean dataBean = (SelectProcessBean.DataBean) adapterView.getItemAtPosition(i);
                intent = new Intent(SelectProcessActivity.this, ChoiceActivity.class);
                intent.putExtra("bbb", "1");
                intent.putExtra("name",dataBean.getProc_name());
                intent.putExtra("businessid_", businessid_);
                intent.putExtra("workitem_ins_id_", workitem_ins_id_);
                intent.putExtra("busiOrgId", busiOrgId);
                String proc_id = dataBean.getProc_id();
                intent.putExtra("busitype_proc_id",dataBean.getBusitype_proc_id());
                intent.putExtra("processcorpid",dataBean.getProcesscorpid());
                intent.putExtra("proid", proc_id);
                startActivityForResult(intent, 0);


            }
        });
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
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.e("SelectProcessActivity", "kdfjkldfjdkflj");
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null) {
            return;
        }
        if (requestCode == 0) {
            switch (resultCode) {
                case 8:
                    Log.e("SelectProcessActivity", "kdfjkldfjdkflj");

                    intent = new Intent(SelectProcessActivity.this, ResubmitActivity.class);
                    String username = data.getStringExtra("username");
                    String hjmc = data.getStringExtra("hjmc");
                    String name = data.getStringExtra("name");
                    id = data.getStringExtra("id");
                    actType = data.getStringExtra("actType");
                    blr = data.getStringExtra("blr");
                    Log.e("CommentAgreeActivity", id);
                    Log.e("CommentAgreeActivity", actType);
                    Log.e("CommentAgreeActivity", blr);
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
                    break;
            }

        }
    }
}
