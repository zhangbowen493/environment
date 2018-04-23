package com.huaxin.yunnan.environment.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.activity.pollution.BasicInfoListActivity;
import com.huaxin.yunnan.environment.bean.PollutionSourceBean;
import com.huaxin.yunnan.environment.fragment.adapter.PollutionSourceAdapter;
import com.huaxin.yunnan.environment.net.NetTool;
import com.huaxin.yunnan.environment.refresh.RefreshLayout;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_POLLUTION_INFO;

/**
 * Created by longzeqiu on 2017/10/11.
 */

public class PollutionSourceFragment extends BaseFragment implements View.OnClickListener, SwipeRefreshLayout.OnRefreshListener, RefreshLayout.OnLoadListener {

    private EditText et_search;
    private ListView lv_pollution_source;
    private RefreshLayout refreshLayout;
    private PollutionSourceAdapter pollutionSourceAdapter;
    private int page;
    private String string;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pollution_source, container, false);
        initProgressDialog();
        initView(view);
        refresh();
        initdata();




        return view;
    }

    private void initdata() {
        string = et_search.getText().toString();
        page = 1;
        yNProgressDialog.show();
        Log.e("PollutionSourceFragment", URL_QUERY_POLLUTION_INFO);
        NetTool.getInstance().rxPollutionSourcePostNet(URL_QUERY_POLLUTION_INFO,String.valueOf(page),string, SpUtils.getString(getContext(), "userToken")).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<PollutionSourceBean>() {
                    @Override
                    public void accept(@NonNull PollutionSourceBean pollutionSourceBean) throws Exception {
                        yNProgressDialog.dismiss();
                        Log.e("PollutionSourceFragment", pollutionSourceBean.getSuccess().toString());
                        if (pollutionSourceBean.getSuccess().equals("1")){
                            pollutionSourceAdapter.setDatas(pollutionSourceBean);
                        }else {
                            Log.e("PollutionSourceFragment", "cuole");
                            Toast.makeText(getActivity().getApplicationContext(), pollutionSourceBean.getMsg(), Toast.LENGTH_SHORT).show();
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {
                        Log.e("PollutionSourceFragment", throwable.getMessage().toString());
                        yNProgressDialog.dismiss();
                        Toast.makeText(getActivity().getApplicationContext(), "连接异常", Toast.LENGTH_SHORT).show();
                    }
                });


    }


    private void refresh() {
        refreshLayout.setColorSchemeResources(R.color.colorPrimary, R.color.colorAccent, R.color.colorAccent, R.color.colorPrimaryDark);
//下拉刷新
        refreshLayout.setOnRefreshListener(this);
//上拉加载
        refreshLayout.setOnLoadListener(this);
    }

    private void initView(View view) {

        et_search = (EditText) view.findViewById(R.id.et_search);
//        et_search.setOnClickListener(this);
        //根据输入框输入值的改变来过滤搜索
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
        lv_pollution_source = (ListView) view.findViewById(R.id.lv_pollution_source);
        pollutionSourceAdapter = new PollutionSourceAdapter(getActivity());
        lv_pollution_source.setAdapter(pollutionSourceAdapter);
        lv_pollution_source.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), BasicInfoListActivity.class);
                PollutionSourceBean.DataBean.QueryDataBean queryDataBean = (PollutionSourceBean.DataBean.QueryDataBean) adapterView.getItemAtPosition(i);
                intent.putExtra("uuid", queryDataBean.getUuid());
                startActivity(intent);
            }
        });
        refreshLayout = (RefreshLayout) view.findViewById(R.id.refreshLayout);
        refreshLayout.setOnClickListener(this);
    }

    private void findData(String s) {

        page = 1;
        NetTool.getInstance().rxPollutionSourcePostNet(URL_QUERY_POLLUTION_INFO,String.valueOf(page),s, SpUtils.getString(getContext(), "userToken")).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<PollutionSourceBean>() {
                    @Override
                    public void accept(@NonNull PollutionSourceBean pollutionSourceBean) throws Exception {

                        if (pollutionSourceBean.getSuccess().equals("1")){
                            pollutionSourceAdapter.setDatas(pollutionSourceBean);
                        }else {
                            Toast.makeText(getActivity().getApplicationContext(), pollutionSourceBean.getMsg(), Toast.LENGTH_SHORT).show();
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {

                        Toast.makeText(getActivity().getApplicationContext(), "连接异常", Toast.LENGTH_SHORT).show();
                    }
                });


    }


    @Override
    protected void lazyLoad() {

    }

    private void submit() {
        // validate
        String search = et_search.getText().toString().trim();
        if (TextUtils.isEmpty(search)) {
            Toast.makeText(getContext(), "搜索关键词", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onRefresh() {

        page = 1;
        yNProgressDialog.show();
        NetTool.getInstance().rxPollutionSourcePostNet(URL_QUERY_POLLUTION_INFO,String.valueOf(page),et_search.getText().toString(), SpUtils.getString(getContext(), "userToken")).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<PollutionSourceBean>() {
                    @Override
                    public void accept(@NonNull PollutionSourceBean pollutionSourceBean) throws Exception {
                        yNProgressDialog.dismiss();
                        if (pollutionSourceBean.getSuccess().equals("1")){
                            pollutionSourceAdapter.setDatas(pollutionSourceBean);
                        }else {
                            Toast.makeText(getActivity().getApplicationContext(), pollutionSourceBean.getMsg().toString(), Toast.LENGTH_SHORT).show();
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {
                        yNProgressDialog.dismiss();
                        Toast.makeText(getActivity().getApplicationContext(), "连接异常", Toast.LENGTH_SHORT).show();
                    }
                });
        refreshLayout.setRefreshing(false);

    }

    @Override
    public void onLoad() {
        page = ++page;
        yNProgressDialog.show();
        NetTool.getInstance().rxPollutionSourcePostNet(URL_QUERY_POLLUTION_INFO,String.valueOf(page), et_search.getText().toString(),SpUtils.getString(getContext(), "userToken")).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<PollutionSourceBean>() {
                    @Override
                    public void accept(@NonNull PollutionSourceBean pollutionSourceBean) throws Exception {
                        yNProgressDialog.dismiss();
                        if (pollutionSourceBean.getSuccess().equals("1")){
                            refreshLayout.setLoading(false);
                            pollutionSourceAdapter.addData(pollutionSourceBean);
                        }else {
                            refreshLayout.setLoading(false);
                            refreshLayout.setOnLoadListener(null);
                            Toast.makeText(getActivity().getApplicationContext(), pollutionSourceBean.getMsg().toString(), Toast.LENGTH_SHORT).show();
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {
                        refreshLayout.setLoading(false);
                        yNProgressDialog.dismiss();
                        Toast.makeText(getActivity().getApplicationContext(), "连接异常", Toast.LENGTH_SHORT).show();
                    }
                });

    }
}
