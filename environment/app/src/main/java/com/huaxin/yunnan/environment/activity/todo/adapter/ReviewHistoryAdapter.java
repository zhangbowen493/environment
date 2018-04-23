package com.huaxin.yunnan.environment.activity.todo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.bean.ReviewHistoryBean;

/**
 * Created by longzeqiu on 2017/10/9.
 */

public class ReviewHistoryAdapter extends BaseAdapter {


    private Context context;
    private ReviewHistoryBean reviewHistoryBean;
    private ViewHolder viewHolder;
    private LayoutInflater inflate;

    public ReviewHistoryAdapter(Context context) {
        this.context = context;
        this.inflate = LayoutInflater.from(context);
    }

    public void setData(ReviewHistoryBean reviewHistoryBean) {
        this.reviewHistoryBean = reviewHistoryBean;
        notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        if (reviewHistoryBean == null || reviewHistoryBean.getData() == null) {
            return 0;
        } else {
            return reviewHistoryBean.getData().size();
        }
    }

    @Override
    public Object getItem(int i) {
        return reviewHistoryBean.getData().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflate.inflate(R.layout.item_review_history, null);
            viewHolder = new ViewHolder();
            viewHolder.iv_state = (ImageView) view.findViewById(R.id.iv_state);
            viewHolder.tv_name = (TextView) view.findViewById(R.id.tv_name);
            viewHolder.tv_time_arr = (TextView) view.findViewById(R.id.tv_time_arr);
            viewHolder.tv_time_check = (TextView) view.findViewById(R.id.tv_time_check);
            viewHolder.tv_opinion_check = (TextView) view.findViewById(R.id.tv_opinion_check);
            viewHolder.tv_people_check = (TextView) view.findViewById(R.id.tv_people_check);

            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        if (reviewHistoryBean.getData().get(i).getStatus() == 3){
            viewHolder.iv_state.setImageDrawable(context.getResources().getDrawable(R.drawable.todo_sendback));
        }else if (reviewHistoryBean.getData().get(i).getStatus() == 4){
            viewHolder.iv_state.setImageDrawable(context.getResources().getDrawable(R.drawable.todo_complete));
        }else {
            viewHolder.iv_state.setImageDrawable(context.getResources().getDrawable(R.drawable.todo_pendingapproval));
        }
        if (reviewHistoryBean.getData().get(i).getActivity_name() == null){
            viewHolder.tv_name.setText("");
        }else {
            viewHolder.tv_name.setText(reviewHistoryBean.getData().get(i).getActivity_name().toString());
        }
        if (reviewHistoryBean.getData().get(i).getArrive_time() == null){
            viewHolder.tv_time_arr.setText("");
        }else {
            viewHolder.tv_time_arr.setText(reviewHistoryBean.getData().get(i).getArrive_time().toString());
        }
        if (reviewHistoryBean.getData().get(i).getComplete_time() == null){
            viewHolder.tv_time_check.setText("");
        }else {
            viewHolder.tv_time_check.setText(reviewHistoryBean.getData().get(i).getComplete_time().toString());
        }
        if (reviewHistoryBean.getData().get(i).getOpinion()== null){
            viewHolder.tv_opinion_check.setText("");
        }else {
            viewHolder.tv_opinion_check.setText(reviewHistoryBean.getData().get(i).getOpinion().toString());
        }
        if (reviewHistoryBean.getData().get(i).getAudit_user_name()== null){
            viewHolder.tv_people_check.setText("");
        }else {
            viewHolder.tv_people_check.setText(reviewHistoryBean.getData().get(i).getAudit_user_name().toString());
        }
//        if (reviewHistoryBean.getData().get(i).getActName() == null){
//            viewHolder.tv_choice.setText("");
//        }else {
//            viewHolder.tv_choice.setText(reviewHistoryBean.getData().get(i).getActName().toString());
//        }


        return view;
    }

    static class ViewHolder {
        ImageView iv_state;
        TextView tv_name;
        TextView tv_time_arr;
        TextView tv_time_check;
        TextView tv_opinion_check;
        TextView tv_people_check;
    }
}
