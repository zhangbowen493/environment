package com.huaxin.yunnan.environment.bean;

/**
 * Created by zbw on 2017/10/12 14:57.
 * 任务办理模块 任务bean
 */

public class TaskBean {
	/**
	 * 任务名称
	 */
	private String name;
	/**
	 * 开始时间
	 */
	private String starttime;
	/**
	 * 结束时间
	 */
	private String endtime;
	/**
	 * 检查对象
	 */
	private String checkingobjects;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getCheckingobjects() {
		return checkingobjects;
	}

	public void setCheckingobjects(String checkingobjects) {
		this.checkingobjects = checkingobjects;
	}

	@Override
	public String toString() {
		return "TaskBean{" +
				"name='" + name + '\'' +
				", starttime='" + starttime + '\'' +
				", endtime='" + endtime + '\'' +
				", checkingobjects='" + checkingobjects + '\'' +
				'}';
	}
}
