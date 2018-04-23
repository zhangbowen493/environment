package com.huaxin.yunnan.environment.activity.maillist.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.bean.DeparterBean;

/**
 * Created by longzeqiu on 2017/10/9.
 */

public class DeparterAdapter extends BaseAdapter {


    private Context context;
    private DeparterBean mData;
    private ViewHolder viewHolder;
    private LayoutInflater inflate;

    public DeparterAdapter(Context context) {
        this.context = context;
        this.inflate = LayoutInflater.from(context);
    }

    public void setData(DeparterBean mData) {
        this.mData = mData;
        notifyDataSetChanged();
    }
    public void addData(DeparterBean data) {
        this.mData.getData().addAll(data.getData());
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        if (mData == null || mData.getData() == null) {
            return 0;
        } else {
            return mData.getData().size();
        }
    }

    @Override
    public Object getItem(int i) {
        return mData.getData().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflate.inflate(R.layout.item_departer, null);
            viewHolder = new ViewHolder();
            viewHolder.name = (TextView) view.findViewById(R.id.tv_department_name);
            viewHolder.number = (TextView) view.findViewById(R.id.tv_department_number);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        if (mData.getData().get(i).getName()==null){
            viewHolder.name.setText("");
        }else {
            viewHolder.name.setText(mData.getData().get(i).getName());
        }


        return view;
    }

    static class ViewHolder {
        TextView name;
        TextView number;
    }
}
