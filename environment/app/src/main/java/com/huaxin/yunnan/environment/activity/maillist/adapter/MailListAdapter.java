package com.huaxin.yunnan.environment.activity.maillist.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.bean.MailListBean;

/**
 * Created by longzeqiu on 2017/10/9.
 */

public class MailListAdapter extends BaseAdapter {


    private Context context;
    private MailListBean mailListBean;
    private ViewHolder viewHolder;
    private LayoutInflater inflate;

    public MailListAdapter(Context context) {
        this.context = context;
        this.inflate = LayoutInflater.from(context);
    }

    public void setData(MailListBean mData) {
        this.mailListBean = mData;
        notifyDataSetChanged();
    }
    public void addData(MailListBean data) {
        this.mailListBean.getData().addAll(data.getData());
        notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        if (mailListBean == null || mailListBean.getData() == null) {
            return 0;
        } else {
            return mailListBean.getData().size();
        }
    }

    @Override
    public Object getItem(int i) {
        return mailListBean.getData().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflate.inflate(R.layout.item_department, null);
            viewHolder = new ViewHolder();
            viewHolder.tv_department_name = (TextView) view.findViewById(R.id.tv_department_name);
            viewHolder.tv_department_number = (TextView) view.findViewById(R.id.tv_department_number);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        if (mailListBean.getData().get(i).getName()==null){
            viewHolder.tv_department_name.setText("");
        }else {
            viewHolder.tv_department_name.setText(mailListBean.getData().get(i).getName().toString());
        }
        if (mailListBean.getData().get(i).getTotal()==null){
            viewHolder.tv_department_number.setText("（0人）");
        }else {
            viewHolder.tv_department_number.setText("（"+mailListBean.getData().get(i).getTotal().toString()+"人）");
        }

        return view;
    }

    static class ViewHolder {
        TextView tv_department_name;
        TextView tv_department_number;

    }
}
