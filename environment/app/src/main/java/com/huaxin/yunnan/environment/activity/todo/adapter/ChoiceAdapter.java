package com.huaxin.yunnan.environment.activity.todo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.bean.ChoiceBean;

/**
 * Created by longzeqiu on 2017/10/9.
 */

public class ChoiceAdapter extends BaseAdapter {

    private Context context;
    private ChoiceBean choiceBean;
    private ViewHolder viewHolder;
    private LayoutInflater inflate;

    public ChoiceAdapter(Context context) {
        this.context = context;
        this.inflate = LayoutInflater.from(context);
    }

    public void setData(ChoiceBean choiceBean) {
        this.choiceBean = choiceBean;
        notifyDataSetChanged();
    }
//    public void addData(ArrayList<String> data) {
//        this.data.getData().addAll(data.getData());
//        notifyDataSetChanged();
//    }


    @Override
    public int getCount() {
        if (choiceBean == null || choiceBean.getData() == null) {
            return 0;
        } else {
            return choiceBean.getData().getNextActList().size();
        }
    }

    @Override
    public Object getItem(int i) {
        return choiceBean.getData().getNextActList().get(i);
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
        if (choiceBean.getData().getNextActList().get(i).getActName() == null){
            viewHolder.tv_choice.setText("");
        }else {
            viewHolder.tv_choice.setText(choiceBean.getData().getNextActList().get(i).getActName().toString());
        }


        return view;
    }

    static class ViewHolder {
        TextView tv_choice;
    }
}
