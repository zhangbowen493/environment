package com.huaxin.yunnan.environment.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.huaxin.yunnan.environment.Constant;
import com.huaxin.yunnan.environment.MainActivity;
import com.huaxin.yunnan.environment.MyApplication;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.activity.citylist.CityListActivity;
import com.huaxin.yunnan.environment.activity.collectevidence.CollectEvidenceActivity;
import com.huaxin.yunnan.environment.activity.map.Location;
import com.huaxin.yunnan.environment.activity.map.LocationActivity;
import com.huaxin.yunnan.environment.activity.taskmanager.TaskManagerListActivity;
import com.huaxin.yunnan.environment.activity.todo.ToDoActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by longzeqiu on 2017/9/25.
 */

public class HomeFragment extends BaseFragment implements View.OnClickListener {
	private Button btn_one;
	/**
	 * 标志位，标志已经初始化完成
	 */
	private boolean isPrepared;
	/**
	 * 是否已被加载过一次，第二次就不再去请求数据了
	 */
	private boolean mHasLoadedOnce;


	private MainActivity mActivity;
	private TextView tv_city;

	private ImageView iv_loading;
	private RotateAnimation rotateAnimation;

	private LinearLayout ll_error_refresh;

	private FrameLayout fl_content;

	private LinearLayout ll_no_data;
	private LinearLayout ll_loading;
	private Button bt_field_forensics;
	private Button bt_todo;
	static LocationReceiver locationReceiver;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		isPrepared = true;
//        mHasLoadedOnce=false;
		View view = inflater.inflate(R.layout.fragment_home, container, false);
		initView(view);

		fl_content = (FrameLayout) view.findViewById(R.id.fl_content);
		Location.initLocation();
		registReceiver("broadcast_location");
		return view;
	}


	private void initView(View view) {
		tv_city = view.findViewById(R.id.tv_city);
		tv_city.setOnClickListener(this);
		view.findViewById(R.id.bt_task_management).setOnClickListener(this);
		//现场取证
		bt_field_forensics = ((Button) view.findViewById(R.id.bt_field_forensics));
		bt_field_forensics.setOnClickListener(this);
		//待办事务
		bt_todo = ((Button) view.findViewById(R.id.bt_todo));
		bt_todo.setOnClickListener(this);
		//在线监控
		view.findViewById(R.id.bt_online_monitor).setOnClickListener(this);

	}

	@Override
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		mActivity = (MainActivity) getActivity();
//        showLoading();
		lazyLoad();
	}

	@Override
	protected void lazyLoad() {
		if (!isPrepared || !isVisible) {
			//已加载的fragment不需要重新加载
			return;
		}
//        if(mHasLoadedOnce){
//            loadSuccess();
//        }else{
//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    loadSuccess();
//                }
//            },2000);
//
//            mHasLoadedOnce=true;
//        }

	}

//    //显示加载动画
//    private void showLoading() {
//        if(fl_content.getVisibility()!=View.GONE){
//            fl_content.setVisibility(View.GONE);//内容消失
//        }
//        if(ll_loading.getVisibility()!=View.VISIBLE){
//            ll_loading.setVisibility(View.VISIBLE);//加载出现
//        }
//        if(ll_error_refresh.getVisibility()!=View.GONE){
//            ll_error_refresh.setVisibility(View.GONE);//加载错误布局消失
//        }
//        if(ll_no_data.getVisibility()!=View.GONE){
//            ll_no_data.setVisibility(View.GONE);//没有数据布局消失
//        }
//        rotateAnimation = new RotateAnimation(0f, 360f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//        rotateAnimation.setDuration(3000);//设置动画持续时间
//        rotateAnimation.setInterpolator(new LinearInterpolator());//不停顿
//        rotateAnimation.setRepeatCount(10);
//        iv_loading.setAnimation(rotateAnimation);
//        rotateAnimation.startNow();
//    }
//    //取消动画
//    private void cancelLoading(){
//        if(ll_loading.getVisibility()!=View.GONE){
//            ll_loading.setVisibility(View.GONE);
//        }
//        rotateAnimation.cancel();
//    }


//    /**
//     * 加载成功
//     */
//    private void loadSuccess(){
//        cancelLoading();//取消加载动画
//        if(fl_content.getVisibility()!=View.VISIBLE){
//            fl_content.setVisibility(View.VISIBLE);//内容展示
//        }
//        if(ll_loading.getVisibility()!=View.GONE){
//            ll_loading.setVisibility(View.GONE);//加载消失
//        }
//        if(ll_error_refresh.getVisibility()!=View.GONE){
//
//            ll_error_refresh.setVisibility(View.GONE);//加载错误布局消失
//        }
//        if(ll_no_data.getVisibility()!=View.GONE){
//            ll_no_data.setVisibility(View.GONE);//没有数据布局消失
//        }
//    }

	/**
	 * 再次加载数据
	 */
	private void reLoading() {
		if (fl_content.getVisibility() != View.GONE) {
			fl_content.setVisibility(View.GONE);//内容消失
		}
		if (ll_loading.getVisibility() != View.VISIBLE) {
			ll_loading.setVisibility(View.VISIBLE);//加载出现
		}
		if (ll_error_refresh.getVisibility() != View.GONE) {
			ll_error_refresh.setVisibility(View.GONE);//加载错误布局消失
		}
		if (ll_no_data.getVisibility() != View.GONE) {
			ll_no_data.setVisibility(View.GONE);//没有数据布局消失
		}
		rotateAnimation.startNow();//展示加载动画
		lazyLoad();//联网请求数据
	}

	/**
	 * 加载失败
	 */
//    private void loadError(){
//        cancelLoading();//取消加载动画
//        if(fl_content.getVisibility()!=View.GONE){
//            fl_content.setVisibility(View.GONE);//内容消失
//        }
//        if(ll_loading.getVisibility()!=View.GONE){
//            ll_loading.setVisibility(View.GONE);//加载消失
//        }
//        if(ll_error_refresh.getVisibility()!=View.VISIBLE){
//            ll_error_refresh.setVisibility(View.VISIBLE);//加载错误布局出现
//        }
//        if(ll_no_data.getVisibility()!=View.GONE){
//            ll_no_data.setVisibility(View.GONE);//没有数据布局消失
//        }
//
//    }
//
//    /**
//     * 没有数据
//     */
//    private void noData(){
//        cancelLoading();//取消加载动画
//        if(fl_content.getVisibility()!=View.GONE){
//            fl_content.setVisibility(View.GONE);//内容消失
//        }
//        if(ll_loading.getVisibility()!=View.GONE){
//            ll_loading.setVisibility(View.GONE);//加载消失
//        }
//        if(ll_error_refresh.getVisibility()!= View.GONE){
//            ll_error_refresh.setVisibility(View.GONE);//加载错误布局消失
//        }
//        if(ll_no_data.getVisibility()!=View.VISIBLE){
//            ll_no_data.setVisibility(View.VISIBLE);//没有数据布局出现
//        }
//    }
	@Override
	public void onClick(View view) {
		switch (view.getId()) {
//            case R.id.btn_one:
//                mActivity.updateOne(-2);
//                break;
//            case R.id.ll_error_refresh:
//                reLoading();
//                break;
			case R.id.tv_city:
				startActivity(new Intent(getActivity(), CityListActivity.class));
				break;
			case R.id.bt_task_management:
				//任务办理
				startActivity(new Intent(getActivity(), TaskManagerListActivity.class));
				break;
			case R.id.bt_field_forensics:
				//现场取证
				startActivity(new Intent(getActivity(), CollectEvidenceActivity.class));
				break;
			case R.id.bt_todo:
				//公文待办
				startActivity(new Intent(getActivity(), ToDoActivity.class));
				break;
			case R.id.bt_online_monitor:
//				startActivity(new Intent(getActivity(), LocationActivity.class));
				break;
			default:
				break;
		}
	}

	/**
	 * 动态注册广播
	 *
	 * @param action
	 */
	private void registReceiver(String action) {
		if (locationReceiver == null) {
			locationReceiver = new LocationReceiver();
			IntentFilter intentFilter = new IntentFilter();
			intentFilter.addAction(action);
			getActivity().registerReceiver(locationReceiver, intentFilter);
		} else {
			LogUtils.e("HomeFragment:已动态注册广播");
		}
	}

	/**
	 * 定位接收者
	 */
	class LocationReceiver extends BroadcastReceiver {
		/**
		 * 纬度
		 */
		private String latitude;
		/**
		 * 经度
		 */
		private String longitude;
		/**
		 * 时间
		 */
		private String location_time;
		/**
		 * 城市
		 */
		private String city;

		@Override
		public void onReceive(Context context, Intent intent) {
			latitude = intent.getExtras().getString("latitude");
			longitude = intent.getExtras().getString("longitude");
			location_time = intent.getExtras().getString("location_time");
			city = intent.getExtras().getString("city");
			tv_city.setText(city);
			MyApplication.getInstance().setCity(city);
			LogUtils.e("HomeFragment-Receiver接收到定位信息：时间：" + location_time + ";纬度：" + latitude + ";经度:" + longitude + ";城市:" + city);
			if (!MyApplication.getInstance().isBegin)
				MyApplication.getInstance().getmLocationClient().stopLocation();
		}
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		//解除广播
		Intent intent = new Intent();
		intent.setAction("broadcast_location");
		PackageManager pm = getActivity().getPackageManager();
		List<ResolveInfo> resolveInfos = pm.queryBroadcastReceivers(intent, 0);
		if (resolveInfos != null && !resolveInfos.isEmpty()) {
			//查询到相应的BroadcastReceiver
			LogUtils.e("broadcast_location广播解除");
			getActivity().unregisterReceiver(locationReceiver);
		} else {
			locationReceiver = null;
			LogUtils.e("broadcast_location广播未注册");
		}

		if (!MyApplication.getInstance().isBegin)
			MyApplication.getInstance().getmLocationClient().stopLocation();
	}

	@Override
	public void onResume() {
		super.onResume();
		if (MyApplication.getInstance().getCity() != null)
			tv_city.setText(MyApplication.getInstance().getCity());
	}
}
