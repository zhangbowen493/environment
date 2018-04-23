package com.huaxin.yunnan.environment.activity.todo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.bean.ToDoListBean;

/**
 * Created by longzeqiu on 2017/10/9.
 */

public class ToDoAdapter extends BaseAdapter {


    private Context context;
    private ToDoListBean toDoListBean;
    private ViewHolder viewHolder;
    private LayoutInflater inflate;

    public ToDoAdapter(Context context) {
        this.context = context;
        this.inflate = LayoutInflater.from(context);
    }

    public void setData(ToDoListBean toDoListBean) {
        this.toDoListBean = toDoListBean;
        notifyDataSetChanged();
    }
//    public void addData(ArrayList<String> data) {
//        this.data.getData().addAll(data.getData());
//        notifyDataSetChanged();
//    }


    @Override
    public int getCount() {
        if (toDoListBean == null || toDoListBean.getData() == null) {
            return 0;
        } else {
            return toDoListBean.getData().size();
        }
    }

    @Override
    public Object getItem(int i) {
        return toDoListBean.getData().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflate.inflate(R.layout.item_to_do, null);
            viewHolder = new ViewHolder();
            viewHolder.tv_todo_name = (TextView) view.findViewById(R.id.tv_todo_name);
            viewHolder.tv_ssfl = (TextView) view.findViewById(R.id.tv_ssfl);
            viewHolder.tv_sqr = (TextView) view.findViewById(R.id.tv_sqr);
            viewHolder.tv_time = (TextView) view.findViewById(R.id.tv_time);
            viewHolder.tv_sqdw = (TextView) view.findViewById(R.id.tv_sqdw);
            viewHolder.iv_state = (ImageView) view.findViewById(R.id.iv_state);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        if (toDoListBean.getData().get(i).getTodo_type_().equals("1")){
            viewHolder.iv_state.setImageDrawable(context.getResources().getDrawable(R.drawable.item_wait));
        }else {
            viewHolder.iv_state.setImageDrawable(context.getResources().getDrawable(R.drawable.item_return));
        }
        if (toDoListBean.getData().get(i).getTitle_() == null){
            viewHolder.tv_todo_name.setText("");
        }else {
            viewHolder.tv_todo_name.setText(toDoListBean.getData().get(i).getTitle_().toString());
        }
        if (toDoListBean.getData().get(i).getTitle_() == null){
            viewHolder.tv_todo_name.setText("");
        }else {
            viewHolder.tv_todo_name.setText(toDoListBean.getData().get(i).getTitle_().toString());
        }
        if (toDoListBean.getData().get(i).getApplication_username_() == null){
            viewHolder.tv_sqr.setText("");
        }else {
            viewHolder.tv_sqr.setText(toDoListBean.getData().get(i).getApplication_username_().toString());
        }
        if (toDoListBean.getData().get(i).getCorp_name() == null){
            viewHolder.tv_ssfl.setText("");
        }else {
            viewHolder.tv_ssfl.setText(toDoListBean.getData().get(i).getCorp_name().toString());
        }
        if (toDoListBean.getData().get(i).getArrivetime_() == null){
            viewHolder.tv_time.setText("");
        }else {
            viewHolder.tv_time.setText(toDoListBean.getData().get(i).getArrivetime_().toString());
        }
        if (toDoListBean.getData().get(i).getCorp_name() == null){
            viewHolder.tv_sqdw.setText("");
        }else {
            viewHolder.tv_sqdw.setText(toDoListBean.getData().get(i).getCorp_name().toString());
        }
//        if (mailListBean.getData().get(i).getName()==null){
//            viewHolder.tv_department_name.setText("");
//        }else {
//            viewHolder.tv_department_name.setText(mailListBean.getData().get(i).getName().toString());
//        }
//        if (mailListBean.getData().get(i).getTotal()==null){
//            viewHolder.tv_department_number.setText("（0人）");
//        }else {
//            viewHolder.tv_department_number.setText("（"+mailListBean.getData().get(i).getTotal().toString()+"人）");
//        }

        return view;
    }

    static class ViewHolder {
        TextView tv_todo_name;
        TextView tv_ssfl;
        TextView tv_sqr;
        TextView tv_time;
        TextView tv_sqdw;
        ImageView iv_state;
    }
}
