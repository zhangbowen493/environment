package com.huaxin.yunnan.environment.fragment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.bean.PollutionSourceBean;

/**
 * Created by longzeqiu on 2017/10/9.
 */

public class PollutionSourceAdapter extends BaseAdapter {


    private Context context;
    PollutionSourceBean data;

    private ViewHolder viewHolder;
    private LayoutInflater inflate;

    public PollutionSourceAdapter(Context context) {
        this.context = context;
        this.inflate = LayoutInflater.from(context);
    }

    public void setDatas(PollutionSourceBean datas) {
        this.data = datas;
        notifyDataSetChanged();
    }

    public void addData(PollutionSourceBean data) {
        this.data.getData().getQueryData().addAll(data.getData().getQueryData());
        notifyDataSetChanged();
    }




    @Override
    public int getCount() {
        if (data == null || data.getData() == null) {
            return 0;
        } else {
            return data.getData().getQueryData().size();
        }
    }

    @Override
    public Object getItem(int i) {
        return data.getData().getQueryData().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflate.inflate(R.layout.item_pollution_source, null);
            viewHolder = new ViewHolder();
            viewHolder.tv_pollution_source_name = (TextView) view.findViewById(R.id.tv_pollution_source_name);
            viewHolder.tv_name = (TextView) view.findViewById(R.id.tv_name);
            viewHolder.tv_number = (TextView) view.findViewById(R.id.tv_number);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        if (data.getData().getQueryData().get(i).getWrymc() == null){
            viewHolder.tv_pollution_source_name.setText("");
        }else {
            viewHolder.tv_pollution_source_name.setText(data.getData().getQueryData().get(i).getWrymc());
        }
        if (data.getData().getQueryData().get(i).getHblxr()==null){
            viewHolder.tv_name.setText("");
        }else {
            viewHolder.tv_name.setText(data.getData().getQueryData().get(i).getHblxr().toString());
        }
        if (data.getData().getQueryData().get(i).getLxdh()==null){
            viewHolder.tv_number.setText("");
        }else {
            viewHolder.tv_number.setText(data.getData().getQueryData().get(i).getLxdh().toString());
        }

        return view;
    }

    static class ViewHolder {
        TextView tv_pollution_source_name;
        TextView tv_name;
        TextView tv_number;

    }
}
