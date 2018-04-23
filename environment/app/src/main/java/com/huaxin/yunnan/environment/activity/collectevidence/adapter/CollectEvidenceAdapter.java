package com.huaxin.yunnan.environment.activity.collectevidence.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.huaxin.yunnan.environment.Constant;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.bean.CollectEvidenceBean;

/**
 * Created by longzeqiu on 2017/10/9.
 */

public class CollectEvidenceAdapter extends BaseAdapter {

    private Context context;
    private CollectEvidenceBean queryDataBean;
    private ViewHolder viewHolder;
    private LayoutInflater inflate;

    public CollectEvidenceAdapter(Context context) {
        this.context = context;
        this.inflate = LayoutInflater.from(context);
    }

    public void setData(CollectEvidenceBean queryDataBean) {
        this.queryDataBean = queryDataBean;
        notifyDataSetChanged();
    }
    public void addData(CollectEvidenceBean queryDataBean) {
        this.queryDataBean.getData().getQueryData().addAll(queryDataBean.getData().getQueryData());
        notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        if (queryDataBean == null || queryDataBean.getData() == null) {
            return 0;
        } else {
            return queryDataBean.getData().getQueryData().size();
        }
    }

    @Override
    public Object getItem(int i) {
        return queryDataBean.getData().getQueryData().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflate.inflate(R.layout.item_colleclist, null);
            viewHolder = new ViewHolder();
            viewHolder.iv_image = (ImageView) view.findViewById(R.id.iv_image);
            viewHolder.tv_del = (TextView) view.findViewById(R.id.tv_del);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        Log.e("CollectEvidenceAdapter", Constant.IP+":5032"+queryDataBean.getData().getQueryData().get(i).getUrl());
        Glide.with(context)
                .load(Constant.IP+":9090"+queryDataBean.getData().getQueryData().get(i).getUrl()).placeholder(R.drawable.picture_loading).into(viewHolder.iv_image);
//                .load(Constant.IP+":5032"+queryDataBean.getData().getQueryData().get(i).getUrl()).placeholder(R.drawable.picture_loading).into(viewHolder.iv_image);
        if (queryDataBean.getData().getQueryData().get(i).getDate().toString()==null){
            viewHolder.tv_del.setText("");
        }else {
            viewHolder.tv_del.setText(queryDataBean.getData().getQueryData().get(i).getDate().toString());
        }
//        if (mailListBean.getData().get(i).getTotal()==null){
//            viewHolder.tv_department_number.setText("（0人）");
//        }else {
//            viewHolder.tv_department_number.setText ("（"+mailListBean.getData().get(i).getTotal().toString()+"人）");
//        }

        return view;
    }

    static class ViewHolder {
        ImageView iv_image;
        TextView tv_del;

    }
}
