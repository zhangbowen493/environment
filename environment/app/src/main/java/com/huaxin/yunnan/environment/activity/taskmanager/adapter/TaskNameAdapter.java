package com.huaxin.yunnan.environment.activity.taskmanager.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.bean.TaskNameBean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/10/9.
 */

public class TaskNameAdapter extends BaseAdapter {


    private Context context;
    private List<TaskNameBean.DataBean.TaskZfmbBean> mData;
    private ViewHolder viewHolder;
    private LayoutInflater inflate;

    public TaskNameAdapter(Context context) {
        this.context = context;
        this.inflate = LayoutInflater.from(context);
    }

    public void setData(List<TaskNameBean.DataBean.TaskZfmbBean> mData) {
        this.mData = mData;
        notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        if (mData == null) {
            return 0;
        } else {
            return mData.size();
        }
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflate.inflate(R.layout.item_moudle, null);
            viewHolder = new ViewHolder();
            viewHolder.tv_visit_weibo_menu = (TextView) view.findViewById(R.id.tv_visit_weibo_menu);
            viewHolder.rl_item = (RelativeLayout) view.findViewById(R.id.rl_item);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.tv_visit_weibo_menu.setText(mData.get(i).getVc_zfmbmc());
        return view;
    }

    static class ViewHolder {
        TextView tv_visit_weibo_menu;
        RelativeLayout rl_item;
    }
}
