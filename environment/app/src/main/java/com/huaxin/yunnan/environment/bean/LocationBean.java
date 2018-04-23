package com.huaxin.yunnan.environment.bean;

/**
 * 定位结果Bean
 * Created by zbw on 2018/1/16 17:39.
 */

public class LocationBean {
	/**
	 * 定位时间
	 */
	private String latitude;
	/**
	 * 定位经度
	 */
	private String longitude;
	/**
	 * 定位纬度
	 */
	private String location_time;

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

	public String getLocation_time() {
		return location_time;
	}

	public void setLocation_time(String location_time) {
		this.location_time = location_time;
	}

	@Override
	public String toString() {
		return "{" +
				"\"latitude\":\"" + latitude + '\"' +
				",\"longitude\":\"" + longitude + '\"' +
				",\"location_time\":\"" + location_time + '\"' +
				'}';
	}
}
