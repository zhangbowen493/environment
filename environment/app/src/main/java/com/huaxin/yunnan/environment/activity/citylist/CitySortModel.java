package com.huaxin.yunnan.environment.activity.citylist;

/**
 * Created by zbw on 2017/9/29 14:16.
 * 实体类 显示城市和相对应的拼音首字母
 */

public class CitySortModel {
	private String name;//显示的数据
	private String sortLetters;//显示数据拼音的首字母

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSortLetters() {
		return sortLetters;
	}

	public void setSortLetters(String sortLetters) {
		this.sortLetters = sortLetters;
	}
}
