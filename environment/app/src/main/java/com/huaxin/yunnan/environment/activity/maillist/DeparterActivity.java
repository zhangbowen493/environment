package com.huaxin.yunnan.environment.activity.maillist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.activity.maillist.adapter.DeparterAdapter;
import com.huaxin.yunnan.environment.bean.DeparterBean;
import com.huaxin.yunnan.environment.net.NetTool;
import com.huaxin.yunnan.environment.refresh.RefreshLayout;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_DEPARTER_INFO;

public class DeparterActivity extends BaseActicity implements View.OnClickListener, SwipeRefreshLayout.OnRefreshListener, RefreshLayout.OnLoadListener {

    private LinearLayout ll_no;
    private TextView title_text;
    private ImageView iv_add;
    private RelativeLayout top_title;
    private EditText et_search;
    private ListView lv_departer;
    private RefreshLayout refreshLayout;
    private DeparterAdapter departerAdapter;
    private String search;
    private int page;
    private Intent intent;
    private String id;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departer);
        id = getIntent().getStringExtra("id");
        name = getIntent().getStringExtra("name");
        initProgressDialog();
        initView();
        refresh();
        initdata();
    }

    private void initdata() {
        search = et_search.getText().toString();
        page = 1;
        yNProgressDialog.show();

        NetTool.getInstance().rxDepartPostNet(URL_QUERY_DEPARTER_INFO, String.valueOf(page), search, id, SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<DeparterBean>() {
                    @Override
                    public void accept(@NonNull DeparterBean bean) throws Exception {
                        yNProgressDialog.dismiss();
                        if (bean.getSuccess().equals("1")) {
                            departerAdapter.setData(bean);
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
        ll_no = (LinearLayout) findViewById(R.id.ll_no);
        title_text = (TextView) findViewById(R.id.title_text);
        title_text.setText(name);
        iv_add = (ImageView) findViewById(R.id.iv_add);
        top_title = (RelativeLayout) findViewById(R.id.top_title);
        et_search = (EditText) findViewById(R.id.et_search);
        et_search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //当输入框里面的值为空，更新为原来的列表，否则为过滤数据列表
                findData(s.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }

        });
        lv_departer = (ListView) findViewById(R.id.lv_departer);
        departerAdapter = new DeparterAdapter(this);

        lv_departer.setAdapter(departerAdapter);
        refreshLayout = (RefreshLayout) findViewById(R.id.refreshLayout);
        lv_departer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                DeparterBean.DataBean dataBean = (DeparterBean.DataBean) adapterView.getItemAtPosition(i);

                intent = new Intent(DeparterActivity.this, DetailInformationActivity.class);
                intent.putExtra("name",dataBean.getName());
                intent.putExtra("job",dataBean.getJobtitle_id());
                intent.putExtra("phone",dataBean.getTelephone());
                intent.putExtra("ouin",dataBean.getOuinfoname());
                startActivity(intent);
            }
        });
        title_text.setOnClickListener(this);
    }



    //初始化刷新控件
    private void refresh() {
        refreshLayout = (RefreshLayout) findViewById(R.id.refreshLayout);

        refreshLayout.setColorSchemeResources(R.color.colorPrimary, R.color.colorAccent, R.color.colorAccent, R.color.colorPrimaryDark);

        refreshLayout.setOnRefreshListener(this);

        refreshLayout.setOnLoadListener(this);
    }

    private void findData(String s) {

        page = 1;
        NetTool.getInstance().rxDepartPostNet(URL_QUERY_DEPARTER_INFO, String.valueOf(page), s, id, SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<DeparterBean>() {
                    @Override
                    public void accept(@NonNull DeparterBean bean) throws Exception {

                        if (bean.getSuccess().equals("1")){
                            departerAdapter.setData(bean);
                        }else {
                            Toast.makeText(getApplicationContext(), "连接异常", Toast.LENGTH_SHORT).show();
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {

                        Toast.makeText(getApplicationContext(), "连接异常", Toast.LENGTH_SHORT).show();
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
    public void onRefresh() {
        page = 1;
        yNProgressDialog.show();
        search = et_search.getText().toString();
        NetTool.getInstance().rxDepartPostNet(URL_QUERY_DEPARTER_INFO, String.valueOf(page), search, id, SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<DeparterBean>() {
                    @Override
                    public void accept(@NonNull DeparterBean bean) throws Exception {
                        yNProgressDialog.dismiss();
                        if (bean.getSuccess().equals("1")){
                            departerAdapter.setData(bean);
                        }else {
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
        refreshLayout.setRefreshing(false);

    }

    @Override
    public void onLoad() {
        page = ++page;
        yNProgressDialog.show();
        search = et_search.getText().toString();
        NetTool.getInstance().rxDepartPostNet(URL_QUERY_DEPARTER_INFO, String.valueOf(page), search, id, SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<DeparterBean>() {
                    @Override
                    public void accept(@NonNull DeparterBean bean) throws Exception {
                        yNProgressDialog.dismiss();
                        if (bean.getSuccess().equals("1")) {
                            refreshLayout.setLoading(false);
                            departerAdapter.addData(bean);
                        } else {
                            refreshLayout.setLoading(false);
                            Toast.makeText(getApplicationContext(), "连接异常", Toast.LENGTH_SHORT).show();
                        }
                        if (bean.getData().size()<1){
                            refreshLayout.setOnLoadListener(null);
                        }
                        refreshLayout.setRefreshing(false);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {
                        refreshLayout.setLoading(false);
                        yNProgressDialog.dismiss();
                        Toast.makeText(getApplicationContext(), "连接异常", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
