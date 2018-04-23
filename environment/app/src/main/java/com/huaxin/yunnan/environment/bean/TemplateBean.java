package com.huaxin.yunnan.environment.bean;

/**
 * Created by zbw on 2017/10/12 15:01.
 * 任务办理模块  模板bean
 */
public class TemplateBean {
	/**
	 * 模板名称
	 */
	private String name;
	/**
	 * 检查人
	 */
	private String checkman;
	/**
	 * 现场负责人
	 */
	private String fieldperson;
	/**
	 * 电话
	 */
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCheckman() {
		return checkman;
	}

	public void setCheckman(String checkman) {
		this.checkman = checkman;
	}

	public String getFieldperson() {
		return fieldperson;
	}

	public void setFieldperson(String fieldperson) {
		this.fieldperson = fieldperson;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "TemplateBean{" +
				"name='" + name + '\'' +
				", checkman='" + checkman + '\'' +
				", fieldperson='" + fieldperson + '\'' +
				", phone='" + phone + '\'' +
				'}';
	}
}
