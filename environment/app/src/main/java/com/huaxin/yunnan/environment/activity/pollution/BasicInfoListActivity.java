package com.huaxin.yunnan.environment.activity.pollution;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 污染源基本信息列表页面
 */
public class BasicInfoListActivity extends BaseActicity implements View.OnClickListener {
	private TextView title_text;
	private ListView lv_basic_info;
	private List<String> data;
	private Intent intent;
	private String uuid;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_basic_info_list);
		intent = getIntent();
		uuid = intent.getStringExtra("uuid");
		Log.e("BasicInfoListActivity", uuid);

		data = getData();
		initView();
	}

	private void initView() {
		title_text = (TextView) findViewById(R.id.title_text);
		title_text.setText("污染源名称");
		findViewById(R.id.title_text).setOnClickListener(this);
		PolBasicInfoAdapter polBasicInfoAdapter = new PolBasicInfoAdapter(this);
		lv_basic_info = (ListView) findViewById(R.id.lv_basic_info);
		lv_basic_info.setAdapter(polBasicInfoAdapter);
		lv_basic_info.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Intent intent = null;
				switch (position) {
					case 0:
						//污染源基本信息

						intent = new Intent(view.getContext(), EssentialInformationActivity.class);
						intent.putExtra("uuid", uuid);
						break;
					case 1:
						//污染源环境属性信息

						intent = new Intent(view.getContext(), EnvitronmentAttributeActivity.class);
						intent.putExtra("uuid", uuid);
						break;
					case 2:
						//污染源管理属性信息

						intent = new Intent(view.getContext(), AttributeManagementActivity.class);
						intent.putExtra("uuid", uuid);
						break;
					case 3:
						//污染源废水排放口信息

						intent = new Intent(view.getContext(), WasteWaterOutFallActivity.class);
						intent.putExtra("uuid", uuid);
						break;
					case 4:
						//污染源废水排放口排放污染物信息

						intent = new Intent(view.getContext(), WasteWaterPollutionDischargeActivity.class);
						intent.putExtra("uuid", uuid);
						break;
					case 5:
						//污染源废水治理设施信息

						intent = new Intent(view.getContext(), WastewaterTreatmentActivity.class);
						intent.putExtra("uuid", uuid);
						break;
					case 6:
						//污染源废气排放口信息

						intent = new Intent(view.getContext(), FlueGasPollutionInfoActivity.class);
						intent.putExtra("uuid", uuid);
						break;
					case 7:
						//污染源废气排放口排放污染物信息

						intent = new Intent(view.getContext(), WasteGasPollutionActivity.class);
						intent.putExtra("uuid", uuid);
						break;
					case 8:
						//污染源废气治理设施信息

						intent = new Intent(view.getContext(), FlueGasManagementFacilitiesActivity.class);
						intent.putExtra("uuid", uuid);
						break;
					case 9:
						//污染源产生固体废物信息

						intent = new Intent(view.getContext(), SolidWasteInfoActivity.class);
						intent.putExtra("uuid", uuid);
						break;
					case 10:
						//污染源噪声源信息

						intent = new Intent(view.getContext(), NoiseSourceInfoActivity.class);
						intent.putExtra("uuid", uuid);
						break;
					case 11:
						//污染源噪声源测点信息

						intent = new Intent(view.getContext(), NosiceSourceInfoActivity.class);
						intent.putExtra("uuid", uuid);
						break;
					case 12:
						//污染源主要原辅材料信息

						intent = new Intent(view.getContext(), PollutionMaterialsActivity.class);
						intent.putExtra("uuid", uuid);
						break;
					case 13:
						//污染源生产设备信息

						intent = new Intent(view.getContext(), ProductEquipInfoActivity.class);
						intent.putExtra("uuid", uuid);
						break;
					case 14:
						//污染源主要产品信息

						intent = new Intent(view.getContext(), MajorProductActivity.class);
						intent.putExtra("uuid", uuid);
						break;
					case 15:
						//污染源档案信息

						intent = new Intent(view.getContext(), FileInfoActivity.class);
						intent.putExtra("uuid", uuid);
						break;
					case 16:
						//污染源变更信息

						intent = new Intent(view.getContext(), PollutionChangeActivity.class);
						intent.putExtra("uuid", uuid);
						break;
					default:
						break;
				}

				if (intent != null)
					startActivity(intent);
			}
		});
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
			case R.id.title_text:
				//返回
				finish();
				break;
			default:
				break;
		}
	}

	public List<String> getData() {
		data = new ArrayList<>();
		String[] list = {"污染源基本信息", "污染源环境属性信息", "污染源管理属性信息", "污染源废水排放口信息", "污染源废水排放口排放污染物信息", "污染源废水治理设施信息"
				, "污染源废气排放口信息", "污染源废气排放口排放污染物信息", "污染源废气治理设施信息", "污染源产生固体废物信息", "污染源噪声源信息", "污染源噪声源测点信息"
				, "污染源主要原辅材料信息", "污染源生产设备信息", "污染源主要产品信息", "污染源档案信息", "污染源变更信息"};
		for (int i = 0; i < list.length; i++) {
			data.add(list[i].toString());
		}
		return data;
	}

	//ViewHolder静态类
	static class ViewHolder {
		public TextView title;
	}

	public class PolBasicInfoAdapter extends BaseAdapter {
		private LayoutInflater mInflater = null;

		private PolBasicInfoAdapter(Context context) {
			//根据context上下文加载布局，这里的是Demo17Activity本身，即this
			this.mInflater = LayoutInflater.from(context);
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
				//根据自定义的Item布局加载布局
				convertView = mInflater.inflate(R.layout.item_basic_info, null);
				holder.title = (TextView) convertView.findViewById(R.id.tv_item_name);
				//将设置好的布局保存到缓存中，并将其设置在Tag里，以便后面方便取出Tag
				convertView.setTag(holder);
			} else {
				holder = (ViewHolder) convertView.getTag();
			}
			holder.title.setText((String) data.get(i));

			return convertView;
		}
	}
}
