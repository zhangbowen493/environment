package com.huaxin.yunnan.environment.activity.map;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.LocationSource;
import com.amap.api.maps.MapView;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.MyLocationStyle;
import com.amap.api.maps.model.PolylineOptions;
import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.R;

public class LocationActivity extends BaseActicity implements LocationSource, View.OnClickListener, AMapLocationListener {
	private MapView mMapView;
	private AMap aMap;
	private UiSettings mUiSettings;//定义一个UiSettings对象
	private Button mBtStart, mBtStop;
	private ToggleButton mTbPlayPause;
	//以前的定位点
	private LatLng oldLatLng;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_location);
		mBtStart = (Button) findViewById(R.id.start);
		mBtStop = (Button) findViewById(R.id.stop);
		mTbPlayPause = (ToggleButton) findViewById(R.id.play_pause);

		//获取地图控件引用
		mMapView = (MapView) findViewById(R.id.map);
		//在activity执行onCreate时执行mMapView.onCreate(savedInstanceState)，创建地图
		mMapView.onCreate(savedInstanceState);


		//初始化地图控制器对象

		if (aMap == null) {
			aMap = mMapView.getMap();
			mUiSettings = aMap.getUiSettings();//实例化UiSettings类对象
		}

		initEvent();
		showCenterMarker();
		setupUiSettings();
	}

	private boolean isChecked = false;

	private void initEvent() {
		mBtStart.setOnClickListener(this);
		mBtStop.setOnClickListener(this);
		mTbPlayPause.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (isChecked) {
					stopTrace();
				} else {
					startTrace();
				}
			}
		});
	}

	private void stopTrace() {
		Toast.makeText(getApplicationContext(), "停止记录轨迹", Toast.LENGTH_SHORT).show();
		isChecked = !isChecked;
	}

	private void startTrace() {
		aMap.clear();
		Toast.makeText(getApplicationContext(), "开始记录轨迹", Toast.LENGTH_SHORT).show();
		isChecked = !isChecked;
	}

	private void setupUiSettings() {
		mUiSettings.setCompassEnabled(true);
		aMap.setLocationSource(this);//通过aMap对象设置定位数据源的监听

		mUiSettings.setMyLocationButtonEnabled(true); //显示默认的定位按钮
//
		aMap.setMyLocationEnabled(true);// 可触发定位并显示当前位置
		mUiSettings.setScaleControlsEnabled(true);//控制比例尺控件是否显示

		// 缩放级别（zoom）：地图缩放级别范围为【4-20级】，值越大地图越详细
		aMap.moveCamera(CameraUpdateFactory.zoomTo(16));
		//使用 aMap.setMapTextZIndex(2) 可以将地图底图文字设置在添加的覆盖物之上
		aMap.setMapTextZIndex(2);
	}

	/**
	 * 显示定位蓝点
	 */
	private void showCenterMarker() {
		MyLocationStyle myLocationStyle;
		myLocationStyle = new MyLocationStyle();//初始化定位蓝点样式类myLocationStyle.myLocationType(MyLocationStyle.LOCATION_TYPE_LOCATION_ROTATE);//连续定位、且将视角移动到地图中心点，定位点依照设备方向旋转，并且会跟随设备移动。（1秒1次定位）如果不设置myLocationType，默认也会执行此种模式。
		myLocationStyle.interval(2000); //设置连续定位模式下的定位间隔，只在连续定位模式下生效，单次定位模式下不会生效。单位为毫秒。
		aMap.setMyLocationStyle(myLocationStyle);//设置定位蓝点的Style
//        aMap.setMyLocationEnabled(true);// 设置为true表示启动显示定位蓝点，false表示隐藏定位蓝点并不进行定位，默认是false。
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		//在activity执行onDestroy时执行mMapView.onDestroy()，销毁地图
		mMapView.onDestroy();
	}

	@Override
	protected void onResume() {
		super.onResume();
		//在activity执行onResume时执行mMapView.onResume ()，重新绘制加载地图
		mMapView.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
		//在activity执行onPause时执行mMapView.onPause ()，暂停地图的绘制
		mMapView.onPause();
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		//在activity执行onSaveInstanceState时执行mMapView.onSaveInstanceState (outState)，保存地图当前的状态
		mMapView.onSaveInstanceState(outState);
	}

	private OnLocationChangedListener mListener;
	private AMapLocationClient mLocationClient;
	private AMapLocationClientOption mLocationOption;

	@Override
	public void activate(OnLocationChangedListener onLocationChangedListener) {
		mListener = onLocationChangedListener;
		if (mLocationClient == null) {
			mLocationClient = new AMapLocationClient(this);
			mLocationOption = new AMapLocationClientOption();
			//设置定位监听
			mLocationClient.setLocationListener(this);
			//设置为高精度定位模式
			mLocationOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
			//设置定位参数
			mLocationClient.setLocationOption(mLocationOption);
			mLocationOption.setOnceLocation(false);
			/**
			 * 设置是否优先返回GPS定位结果，如果30秒内GPS没有返回定位结果则进行网络定位
			 * 注意：只有在高精度模式下的单次定位有效，其他方式无效
			 */
			mLocationOption.setGpsFirst(true);
			// 设置发送定位请求的时间间隔,最小值为1000ms,1秒更新一次定位信息
			mLocationOption.setInterval(10000);
			// 此方法为每隔固定时间会发起一次定位请求，为了减少电量消耗或网络流量消耗，
			// 注意设置合适的定位时间的间隔（最小间隔支持为2000ms），并且在合适时间调用stopLocation()方法来取消定位请求
			// 在定位结束后，在合适的生命周期调用onDestroy()方法
			// 在单次定位情况下，定位无论成功与否，都无需调用stopLocation()方法移除请求，定位sdk内部会移除
			mLocationClient.startLocation();
		}
	}

	@Override
	public void deactivate() {
		mListener = null;
		if (mLocationClient != null) {
			mLocationClient.stopLocation();
			mLocationClient.onDestroy();
		}
		mLocationClient = null;
	}

	//是否是第一次定位
	private boolean isFirstLatLng = true;

	@Override
	public void onLocationChanged(AMapLocation aMapLocation) {
		if (mListener != null && aMapLocation != null) {
			if (aMapLocation != null
					&& aMapLocation.getErrorCode() == 0) {
				mListener.onLocationChanged(aMapLocation);// 显示系统小蓝点
				//                //定位成功
				LatLng newLatLng = new LatLng(aMapLocation.getLatitude(), aMapLocation.getLongitude());  //Utils.getLocationLatLng(aMapLocation);
				//轨迹记录
				if (isChecked) {
					drawPolyline(newLatLng);
				}
			} else {
				String errText = "定位失败," + aMapLocation.getErrorCode() + ": " + aMapLocation.getErrorInfo();
				Log.e("AmapErr", errText);
				if (isFirstLatLng) {
					Toast.makeText(this, errText, Toast.LENGTH_SHORT).show();
				}
			}
		}
	}

	private void drawPolyline(LatLng newLatLng) {
		if (isFirstLatLng) {
			//记录第一次的定位信息
			oldLatLng = newLatLng;
			isFirstLatLng = false;
		}
		//位置有变化
		if (oldLatLng != newLatLng) {
			setUpMap(oldLatLng, newLatLng);
			oldLatLng = newLatLng;
		}
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.start:
				changeCenterMarkerColor();
			case R.id.stop:
				Toast.makeText(this, "点击开始", Toast.LENGTH_SHORT).show();
				break;
			default:
		}
	}

	/**
	 * 更改定位蓝点颜色
	 */
	private void changeCenterMarkerColor() {
	}

	/**
	 * 绘制两个坐标点之间的线段,从以前位置到现在位置
	 */
	private void setUpMap(LatLng oldData, LatLng newData) {

		// 绘制一个大地曲线
		aMap.addPolyline((new PolylineOptions())
				.add(oldData, newData)
				.geodesic(true).color(Color.GREEN));

	}

}
