package com.huaxin.yunnan.environment.activity.collectevidence;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.Constant;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.activity.collectevidence.adapter.CollectEvidenceAdapter;
import com.huaxin.yunnan.environment.bean.CollectEvidenceBean;
import com.huaxin.yunnan.environment.net.NetTool;
import com.huaxin.yunnan.environment.refresh.RefreshLayout;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import static com.huaxin.yunnan.environment.Constant.URL_DOWN_FILE_INFO;

/**
 * 现场取证
 */
public class CollectEvidenceActivity extends BaseActicity implements View.OnClickListener, SwipeRefreshLayout.OnRefreshListener, RefreshLayout.OnLoadListener {

    private LinearLayout ll_no;
    private TextView title_text;
    private Button bt_collect;
    private Intent intent;
    private TextView tv_right_text;
    private GridView gv_collect_evidence;
    private int page;
    private CollectEvidenceAdapter collectEvidenceAdapter;
    private LinearLayout ll_no_picture;
    private RefreshLayout refreshLayout;
    private RefreshReciver reciver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect_evidence);
        initProgressDialog();
        reciver = new RefreshReciver();
        registerReceiver(reciver, new IntentFilter("刷新"));
        initView();
        initData();
        refresh();
    }

    private void initData() {
        yNProgressDialog.show();
        page = 1;
        NetTool.getInstance().rxCollectEvidencePostNet(URL_DOWN_FILE_INFO, String.valueOf(page), SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<CollectEvidenceBean>() {
                    @Override
                    public void accept(@NonNull CollectEvidenceBean bean) throws Exception {
                        yNProgressDialog.dismiss();
                        if (bean.getSuccess().equals("1")) {
                            Log.e("CollectEvidenceActivity", "成功");
                            ll_no_picture.setVisibility(View.GONE);
                            tv_right_text.setVisibility(View.VISIBLE);
                            tv_right_text.setText("开始取证");
                            collectEvidenceAdapter.setData(bean);
                        } else {
                            Log.e("CollectEvidenceActivity", "失败");
                            refreshLayout.setVisibility(View.GONE);
                            ll_no_picture.setVisibility(View.VISIBLE);
                            tv_right_text.setVisibility(View.GONE);
                            tv_right_text.setText("上传");
                        }
                    }
                }, new Consumer<Throwable>()

                {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {
                        Log.e("CollectEvidenceActivity", throwable.getMessage().toString());
                        yNProgressDialog.dismiss();
                        Toast.makeText(getApplicationContext(), "连接异常", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void initView() {
        ll_no = (LinearLayout) findViewById(R.id.ll_no);
        title_text = (TextView) findViewById(R.id.title_text);
        title_text.setText("现场取证");
        title_text.setOnClickListener(this);
        bt_collect = (Button) findViewById(R.id.bt_collect);
        bt_collect.setOnClickListener(this);
        tv_right_text = (TextView) findViewById(R.id.tv_right_text);
        tv_right_text.setOnClickListener(this);
        ll_no_picture = ((LinearLayout) findViewById(R.id.ll_no_picture));



        gv_collect_evidence = (GridView) findViewById(R.id.gv_collect_evidence);
        collectEvidenceAdapter = new CollectEvidenceAdapter(this);
        gv_collect_evidence.setAdapter(collectEvidenceAdapter);
        gv_collect_evidence.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                CollectEvidenceBean.DataBean.QueryDataBean dataBean = (CollectEvidenceBean.DataBean.QueryDataBean) adapterView.getItemAtPosition(i);
                String url = dataBean.getUrl();
                Log.e("CollectEvidenceActivity", url);

                intent = new Intent(CollectEvidenceActivity.this,ReviewActivity.class);
                intent.putExtra("time",dataBean.getDate().toString());
                intent.putExtra("url",Constant.IP+":5032"+url);
                startActivity(intent);


            }
        });

    }




    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.title_text:
                finish();
                break;
            case R.id.bt_collect:
                //开始取证
                intent = new Intent(this, PictureListActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_right_text:
                intent = new Intent(this, PictureListActivity.class);
                startActivity(intent);
                break;
        }
    }
    private void refresh() {
        refreshLayout = ((RefreshLayout) findViewById(R.id.refreshLayout));
        refreshLayout.setColorSchemeResources(R.color.colorPrimary, R.color.colorAccent, R.color.colorAccent, R.color.colorPrimaryDark);
//下拉刷新
        refreshLayout.setOnRefreshListener(this);
//上拉加载
        refreshLayout.setOnLoadListener(this);
    }
    @Override
    public void onRefresh() {
        page = 1;
        yNProgressDialog.show();

        NetTool.getInstance().rxCollectEvidencePostNet(URL_DOWN_FILE_INFO, String.valueOf(page), SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<CollectEvidenceBean>() {
                    @Override
                    public void accept(@NonNull CollectEvidenceBean mailListBean) throws Exception {
                        yNProgressDialog.dismiss();
                        if (mailListBean.getSuccess().equals("1")){
                            ll_no_picture.setVisibility(View.GONE);
                            tv_right_text.setVisibility(View.VISIBLE);
                            tv_right_text.setText("开始取证");
                            collectEvidenceAdapter.setData(mailListBean);
                        } else {
                            ll_no_picture.setVisibility(View.VISIBLE);
                            tv_right_text.setVisibility(View.GONE);
                            tv_right_text.setText("上传");
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

        NetTool.getInstance().rxCollectEvidencePostNet(URL_DOWN_FILE_INFO, String.valueOf(page), SpUtils.getString(getApplicationContext(), "userToken")).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<CollectEvidenceBean>() {
                    @Override
                    public void accept(@NonNull CollectEvidenceBean mailListBean) throws Exception {
                        yNProgressDialog.dismiss();
                        if (mailListBean.getSuccess().equals("1")) {
                            refreshLayout.setLoading(false);
                            collectEvidenceAdapter.addData(mailListBean);
                        } else {
                            refreshLayout.setLoading(false);
                        }
                        if (mailListBean.getData().getQueryData().size()<1){
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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(reciver);
    }

    class RefreshReciver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            onRefresh();
        }
    }
}
