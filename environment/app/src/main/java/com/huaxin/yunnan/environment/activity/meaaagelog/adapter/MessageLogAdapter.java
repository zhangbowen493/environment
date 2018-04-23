package com.huaxin.yunnan.environment.activity.meaaagelog.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.bean.MessageLogBean;

/**
 * Created by longzeqiu on 2017/10/9.
 */

public class MessageLogAdapter extends BaseAdapter {


    private Context context;
    private MessageLogBean mData;
    private ViewHolder viewHolder;
    private LayoutInflater inflate;

    public MessageLogAdapter(Context context) {
        this.context = context;
        this.inflate = LayoutInflater.from(context);
    }

    public void setData(MessageLogBean mData) {
        this.mData = mData;
        notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        if (mData == null || mData.getData().getQueryData() == null) {
            return 0;
        } else {
            return mData.getData().getQueryData().size();
        }
    }

    @Override
    public Object getItem(int i) {
        return mData.getData().getQueryData().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflate.inflate(R.layout.item_message, null);
            viewHolder = new ViewHolder();
            viewHolder.message = (TextView) view.findViewById(R.id.tv_message);
            viewHolder.iv_blue = (ImageView) view.findViewById(R.id.iv_blue);
            viewHolder.title = (TextView) view.findViewById(R.id.tv_title);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        if (mData.getData().getQueryData().get(i).getContent_id()==null&&mData.getData().getQueryData().get(i).getTitle()==null){
            viewHolder.message.setText("");

        }else {
            if (mData.getData().getQueryData().get(i).getContent_id()==null){
                viewHolder.message.setText(mData.getData().getQueryData().get(i).getTitle().replace("+a+",""));

            }else {
                viewHolder.message.setText(mData.getData().getQueryData().get(i).getTitle().replace("+a+",mData.getData().getQueryData().get(i).getContent_id()));

            }
        }
        if(mData.getData().getQueryData().get(i).getName()==null){
            viewHolder.title.setText("");
        }else {
            viewHolder.title.setText(mData.getData().getQueryData().get(i).getName());
        }
        if (mData.getData().getQueryData().get(i).getRead_status().equals("1")){
            viewHolder.iv_blue.setImageDrawable(context.getResources().getDrawable(R.drawable.message_gray));
        }else {
            viewHolder.iv_blue.setImageDrawable(context.getResources().getDrawable(R.drawable.message));
        }

        return view;
    }

    static class ViewHolder {
        TextView message;
        TextView title;
        ImageView iv_blue;

    }
}
