package com.huaxin.yunnan.environment.activity.todo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.bean.SelectProcessBean;

/**
 * Created by longzeqiu on 2017/10/9.
 */

public class SelectProcessAdapter extends BaseAdapter {


    private Context context;
    private SelectProcessBean selectProcessBean;
    private ViewHolder viewHolder;
    private LayoutInflater inflate;

    public SelectProcessAdapter(Context context) {
        this.context = context;
        this.inflate = LayoutInflater.from(context);
    }

    public void setData(SelectProcessBean selectProcessBean) {
        this.selectProcessBean = selectProcessBean;
        notifyDataSetChanged();
    }
//    public void addData(ArrayList<String> data) {
//        this.data.getData().addAll(data.getData());
//        notifyDataSetChanged();
//    }


    @Override
    public int getCount() {
        if (selectProcessBean == null || selectProcessBean.getData() == null) {
            return 0;
        } else {
            return selectProcessBean.getData().size();
        }
    }

    @Override
    public Object getItem(int i) {
        return selectProcessBean.getData().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflate.inflate(R.layout.item_choice, null);
            viewHolder = new ViewHolder();
            viewHolder.tv_choice = (TextView) view.findViewById(R.id.tv_choice);

            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        if (selectProcessBean.getData().get(i).getProc_name() == null){
            viewHolder.tv_choice.setText("");
        }else {
            viewHolder.tv_choice.setText(selectProcessBean.getData().get(i).getProc_name().toString());
        }


        return view;
    }

    static class ViewHolder {
        TextView tv_choice;
    }
}
