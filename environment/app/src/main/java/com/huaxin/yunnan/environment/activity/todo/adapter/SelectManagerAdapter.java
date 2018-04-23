package com.huaxin.yunnan.environment.activity.todo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.bean.SelectManagerBean;

/**
 * Created by longzeqiu on 2017/10/9.
 */

public class SelectManagerAdapter extends BaseAdapter {


    private Context context;
    private SelectManagerBean selectManagerBean;
    private ViewHolder viewHolder;
    private LayoutInflater inflate;

    public SelectManagerAdapter(Context context) {
        this.context = context;
        this.inflate = LayoutInflater.from(context);
    }

    public void setData(SelectManagerBean selectManagerBean) {
        this.selectManagerBean = selectManagerBean;
        notifyDataSetChanged();
    }
//    public void addData(ArrayList<String> data) {
//        this.data.getData().addAll(data.getData());
//        notifyDataSetChanged();
//    }


    @Override
    public int getCount() {
        if (selectManagerBean == null || selectManagerBean.getData() == null) {
            return 0;
        } else {
            return selectManagerBean.getData().size();
        }
    }

    @Override
    public Object getItem(int i) {
        return selectManagerBean.getData().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflate.inflate(R.layout.item_xzblr, null);
            viewHolder = new ViewHolder();
            viewHolder.tv_name = (TextView) view.findViewById(R.id.tv_name);
            viewHolder.tv_department = (TextView) view.findViewById(R.id.tv_department);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        if (selectManagerBean.getData().get(i).getUsername()==null){
            viewHolder.tv_name.setText("");
        }else {
            viewHolder.tv_name.setText(selectManagerBean.getData().get(i).getUsername().toString());
        }
        if (selectManagerBean.getData().get(i).getOrgname()==null){
            viewHolder.tv_department.setText("（0人）");
        }else {
            viewHolder.tv_department.setText(selectManagerBean.getData().get(i).getOrgname().toString());
        }

        return view;
    }

    static class ViewHolder {
        TextView tv_name;
        TextView tv_department;

    }
}
