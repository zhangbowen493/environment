package com.huaxin.yunnan.environment.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.activity.pollution.BasicInfoListActivity;

import java.util.List;
import java.util.Map;

/**
 * Created by zbw on 2017/10/12 14:49.
 */

public class TaskManagerAdapter extends BaseAdapter {
	public static final int TAG_TASK = 1;
	public static final int TAG_LAWTEMP = 2;
	private LayoutInflater mInflater = null;
	private List<Map<String, Object>> data;
	private int tag;

	public TaskManagerAdapter(Context context, List<Map<String, Object>> data, int tag) {
		//根据context上下文加载布局，这里的是Demo17Activity本身，即this
		this.mInflater = LayoutInflater.from(context);
		this.data = data;
		this.tag = tag;
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
			if (tag == TAG_TASK)
				convertView = mInflater.inflate(R.layout.item_task_manager, null);
			else
				convertView = mInflater.inflate(R.layout.item_task_manager, null);
			holder.top = (TextView) convertView.findViewById(R.id.tv_top);
			holder.mid_l = (TextView) convertView.findViewById(R.id.tv_mid_l);
			holder.mid_r = (TextView) convertView.findViewById(R.id.tv_mid_r);
			holder.bottom = (TextView) convertView.findViewById(R.id.tv_bottom);
			//将设置好的布局保存到缓存中，并将其设置在Tag里，以便后面方便取出Tag
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		if (data.get(i).get("top")!=null)
		holder.top.setText(data.get(i).get("top").toString());
		if (data.get(i).get("mid_l")!=null)
		holder.mid_l.setText(data.get(i).get("mid_l").toString());
		if (data.get(i).get("mid_r")!=null)
		holder.mid_r.setText(data.get(i).get("mid_r").toString());
		if (data.get(i).get("bottom")!=null)
		holder.bottom.setText(data.get(i).get("bottom").toString());

		return convertView;

	}

	//ViewHolder静态类
	static class ViewHolder {
		public TextView top;
		public TextView mid_l;
		public TextView mid_r;
		public TextView bottom;
	}
}
