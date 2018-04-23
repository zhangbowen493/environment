package com.huaxin.yunnan.environment.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.huaxin.yunnan.environment.R;

import java.util.List;
import java.util.Map;

/**
 * 审核历史Adapter
 * Created by zbw on 2017/11/11 16:03.
 */

public class ReviewHistoryAdapter extends BaseAdapter {
	private LayoutInflater mInflater = null;
	private List<Map<String, Object>> data;

	public ReviewHistoryAdapter(Context context, List<Map<String, Object>> data) {
		this.mInflater = LayoutInflater.from(context);
		this.data = data;
	}

	@Override
	public int getCount() {
		return data.size();
	}

	@Override
	public Object getItem(int i) {
		return data.get(i);
	}

	@Override
	public long getItemId(int i) {
		return i;
	}

	@Override
	public View getView(int i, View convertView, ViewGroup viewGroup) {
		ViewHolder holder = null;
		//如果缓存convertView为空，则需要创建View
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = mInflater.inflate(R.layout.item_review_history, null);
			holder.tv_name = (TextView) convertView.findViewById(R.id.tv_name);
			holder.tv_time_arr = (TextView) convertView.findViewById(R.id.tv_time_arr);
			holder.tv_time_check = (TextView) convertView.findViewById(R.id.tv_time_check);
			holder.tv_opinion_check = (TextView) convertView.findViewById(R.id.tv_opinion_check);
			holder.tv_people_check = (TextView) convertView.findViewById(R.id.tv_people_check);
			holder.iv_state = (ImageView) convertView.findViewById(R.id.iv_state);
			//将设置好的布局保存到缓存中，并将其设置在Tag里，以便后面方便取出Tag
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		holder.tv_name.setText("");
		holder.tv_time_arr.setText("");
		holder.tv_time_check.setText("");
		holder.tv_opinion_check.setText("");
		holder.tv_people_check.setText(data.get(i).get("bottom").toString());
//			holder.iv_state.setImageDrawable(R.drawable.todo_complete);

		return convertView;
	}

	//ViewHolder静态类
	static class ViewHolder {
		//活动名称
		public TextView tv_name;
		//到达时间
		public TextView tv_time_arr;
		//审核时间
		public TextView tv_time_check;
		//审核意见
		public TextView tv_opinion_check;
		//审核人
		public TextView tv_people_check;
		//状态
		public ImageView iv_state;
	}
}
