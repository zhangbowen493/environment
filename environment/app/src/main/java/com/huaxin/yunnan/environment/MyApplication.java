package com.huaxin.yunnan.environment;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.Utils.ScreenManager;
import com.huaxin.yunnan.environment.bean.LiveStockFarmBean;
import com.huaxin.yunnan.environment.bean.LocationBean;
import com.huaxin.yunnan.environment.bean.MessageLogBean;
import com.huaxin.yunnan.environment.bean.PendAuditBean;
import com.huaxin.yunnan.environment.bean.UserBean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 全局Application
 */
public class MyApplication extends MultiDexApplication {

	//堆栈管理工具
	public ScreenManager mScreenManager;

	public static MyApplication instance;

	public static MyApplication getInstance() {
		return instance;
	}

	public static UserBean mUserBean;

	//声明AMapLocationClient类对象
	public AMapLocationClient mLocationClient = null;

	public AMapLocationClientOption getmLocationClientOption() {
		return mLocationClientOption;
	}

	public AMapLocationClientOption mLocationClientOption = null;

	private PendAuditBean mPendAuditBean;

	//定位时间
	public String location_time;
	//纬度
	public String latitude;
	//经度
	public String longitude;

	//是否开始任务
	public boolean isBegin=false;

	//任务ID
	public String t_task_list_id="";

	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	protected void attachBaseContext(Context base) {
		super.attachBaseContext(base);
		MultiDex.install(this);
	}

	@Override
	public void onCreate() {
		super.onCreate();
		if (instance == null) {
			instance = MyApplication.this;
		}
		mScreenManager = ScreenManager.getScreenManager();
		//初始化定位
		mLocationClient = new AMapLocationClient(getApplicationContext());
//		//设置定位回调监听
//		mLocationClient.setLocationListener(mLocationListener);
		mLocationClientOption = new AMapLocationClientOption();
		//设置定位模式为AMapLocationMode.Hight_Accuracy，高精度模式。
		mLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
		/**
		 * 设置定位场景，目前支持三种场景（签到、出行、运动，默认无场景）
		 */
		mLocationClientOption.setLocationPurpose(AMapLocationClientOption.AMapLocationPurpose.Transport);
//		//获取一次定位结果：
//		//该方法默认为false。
		mLocationClientOption.setOnceLocation(false);
		//设置定位间隔,单位毫秒,默认为2000ms，最低1000ms。
		mLocationClientOption.setInterval(5000);
		//设置是否返回地址信息（默认返回地址信息）
		mLocationClientOption.setNeedAddress(true);
		//设置是否允许模拟位置,默认为true，允许模拟位置
		mLocationClientOption.setMockEnable(false);
		//单位是毫秒，默认30000毫秒，建议超时时间不要低于8000毫秒。
		mLocationClientOption.setHttpTimeOut(60000);
	}

	private LocationBean mLocationBean;

	private List<LocationBean> data = new ArrayList<>();

	public List<LocationBean> getData() {
		return data;
	}
	public AMapLocationListener mAMapLocationListener = new AMapLocationListener() {
		@Override
		public void onLocationChanged(AMapLocation amapLocation) {

			if (amapLocation != null) {
				if (amapLocation.getErrorCode() == 0) {
					//可在其中解析amapLocation获取相应内容。
//					LogUtils.e("MyApplication:获取当前定位结果来源:" + amapLocation.getLocationType());//获取当前定位结果来源，如网络定位结果，详见定位类型表
//					LogUtils.e("MyApplication:获取纬度:" + amapLocation.getLatitude());//获取纬度
//					LogUtils.e("MyApplication:获取经度:" + amapLocation.getLongitude());//获取经度
//					LogUtils.e("MyApplication:获取精度信息:" + amapLocation.getAccuracy());//获取精度信息
//					LogUtils.e("MyApplication:地址:" + amapLocation.getAddress());//地址，如果option中设置isNeedAddress为false，则没有此结果，网络定位结果中会有地址信息，GPS定位不返回地址信息。
//					LogUtils.e("MyApplication:国家信息:" + amapLocation.getCountry());//国家信息
//					LogUtils.e("MyApplication:省信息:" + amapLocation.getProvince());//省信息
//					LogUtils.e("MyApplication:城市信息:" + amapLocation.getCity());//城市信息
//					LogUtils.e("MyApplication:城区信息:" + amapLocation.getDistrict());//城区信息
//					LogUtils.e("MyApplication:街道信息:" + amapLocation.getStreet());//街道信息
//					LogUtils.e("MyApplication:街道门牌号信息:" + amapLocation.getStreetNum());//街道门牌号信息
//					LogUtils.e("MyApplication:城市编码:" + amapLocation.getCityCode());//城市编码
//					LogUtils.e("MyApplication:地区编码:" + amapLocation.getAdCode());//地区编码
//					LogUtils.e("MyApplication:获取当前定位点的AOI信息:" + amapLocation.getAoiName());//获取当前定位点的AOI信息
//					LogUtils.e("MyApplication:获取当前室内定位的建筑物Id:" + amapLocation.getBuildingId());//获取当前室内定位的建筑物Id
//					LogUtils.e("MyApplication:获取当前室内定位的楼层:" + amapLocation.getFloor());//获取当前室内定位的楼层
					//获取定位时间
					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
					Date date = new Date(amapLocation.getTime());
					//时间赋值
					location_time = df.format(date);
					//定位数据赋值
					//纬度
					latitude = String.valueOf(amapLocation.getLatitude());
					//经度
					longitude = String.valueOf(amapLocation.getLongitude());
					LogUtils.e("MyApplication:时间:" + location_time);
					LogUtils.e("MyApplication:纬度:" + amapLocation.getLatitude());
					LogUtils.e("MyApplication:经度:" + amapLocation.getLongitude());
					if (isBegin) {
						mLocationBean = new LocationBean();
						mLocationBean.setLocation_time(location_time);
						mLocationBean.setLatitude(latitude);
						mLocationBean.setLongitude(longitude);
						data.add(mLocationBean);
						LogUtils.e("MyApplication:List<LocationBean>:" + data.toString());
					} else {
						data = new ArrayList<>();
						LogUtils.e("MyApplication:List<LocationBean>:" + "停止记录");
					}
					//广播发送定位数据
					Intent intent = new Intent();
					intent.setAction("broadcast_location");
					intent.putExtra("location_time", location_time);
					intent.putExtra("latitude", latitude);
					intent.putExtra("longitude", longitude);
					intent.putExtra("city", amapLocation.getCity());
					getApplicationContext().sendBroadcast(intent);
					LogUtils.e("MyApplication发送定位数据");
				} else {
					//定位失败时，可通过ErrCode（错误码）信息来确定失败的原因，errInfo是错误信息，详见错误码表。
					LogUtils.e("AmapError", "location Error, ErrCode:"
							+ amapLocation.getErrorCode() + ", errInfo:"
							+ amapLocation.getErrorInfo());
				}
			}
		}
	};
	public String getT_task_list_id() {
		return t_task_list_id;
	}

	public void setT_task_list_id(String t_task_list_id) {
		this.t_task_list_id = t_task_list_id;
	}
	public String getLocation_time() {
		return location_time;
	}

	public void setLocation_time(String location_time) {
		this.location_time = location_time;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public boolean isBegin() {
		return isBegin;
	}

	public void setBegin(boolean begin) {
		isBegin = begin;
	}

	public PendAuditBean getmPendAuditBean() {
		return mPendAuditBean;
	}

	public void setmPendAuditBean(PendAuditBean mPendAuditBean) {
		this.mPendAuditBean = mPendAuditBean;
	}

	public AMapLocationClient getmLocationClient() {
		return mLocationClient;
	}

	public void setmLocationClient(AMapLocationClient mLocationClient) {
		this.mLocationClient = mLocationClient;
	}
}
