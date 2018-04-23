package com.huaxin.yunnan.environment.activity.map;

import com.amap.api.location.AMapLocationClient;
import com.huaxin.yunnan.environment.MyApplication;
import com.huaxin.yunnan.environment.Utils.LogUtils;

/**
 * Created by zbw on 2018/1/18 10:14.
 */

public class Location {
	public static void initLocation() {

		if (null != MyApplication.getInstance().getmLocationClient()) {
			AMapLocationClient mLocationClient = MyApplication.getInstance().getmLocationClient();
			mLocationClient.setLocationListener(MyApplication.getInstance().mAMapLocationListener);
			mLocationClient.setLocationOption(MyApplication.getInstance().getmLocationClientOption());
			//设置场景模式后最好调用一次stop，再调用start以保证场景模式生效
			mLocationClient.stopLocation();
			mLocationClient.startLocation();
		} else {
			LogUtils.e("LocationClien为空！");
		}
	}
}
