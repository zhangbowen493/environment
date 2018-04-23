package com.huaxin.yunnan.environment.db.dao.bean;

import com.huaxin.yunnan.environment.bean.PollutionSurveryTakeDownBean;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * 12、污染源调查询问笔录页面bean
 * Created by zbw on 2017/10/26 14:48.
 */
@DatabaseTable(tableName = "pollutionsurverytakedown_bean_list")
public class PollutionSurveryTakeDownDbBean {

	@DatabaseField(generatedId = true)
	private int id;
	@DatabaseField(columnName = "t_wrydcxw_record_id")
	private String t_wrydcxw_record_id;
	@DatabaseField(columnName = "dt_start_time")
	private String dt_start_time;
	@DatabaseField(columnName = "dt_end_time")
	private String dt_end_time;
	@DatabaseField(columnName = "vc_location")
	private String vc_location;
	@DatabaseField(columnName = "vc_xwr")
	private String vc_xwr;
	@DatabaseField(columnName = "vc_xwr_id")
	private String vc_xwr_id;
	@DatabaseField(columnName = "vc_zfzh")
	private String vc_zfzh;
	@DatabaseField(columnName = "vc_jlr")
	private String vc_jlr;
	@DatabaseField(columnName = "vc_jlr_id")
	private String vc_jlr_id;
	@DatabaseField(columnName = "vc_zzjgdm")
	private String vc_zzjgdm;
	@DatabaseField(columnName = "vc_bxwrxm")
	private String vc_bxwrxm;
	@DatabaseField(columnName = "vc_sfzh")
	private String vc_sfzh;
	@DatabaseField(columnName = "nb_age")
	private String nb_age;
	@DatabaseField(columnName = "vc_gzdw")
	private String vc_gzdw;
	@DatabaseField(columnName = "vc_duty")
	private String vc_duty;
	@DatabaseField(columnName = "vc_ybagx")
	private String vc_ybagx;
	@DatabaseField(columnName = "vc_address")
	private String vc_address;
	@DatabaseField(columnName = "vc_telephone")
	private String vc_telephone;
	@DatabaseField(columnName = "vc_yzbm")
	private String vc_yzbm;
	@DatabaseField(columnName = "vc_qtcjtcxwrxmjgzdw")
	private String vc_qtcjtcxwrxmjgzdw;
	@DatabaseField(columnName = "vc_hjjclx")
	private String vc_hjjclx;
	@DatabaseField(columnName = "vc_sfsqhb")
	private String vc_sfsqhb;
	@DatabaseField(columnName = "vc_sfqrzj")
	private String vc_sfqrzj;
	@DatabaseField(columnName = "cl_xwnr")
	private String cl_xwnr;
	@DatabaseField(columnName = "dt_create_time")
	private String dt_create_time;
	@DatabaseField(columnName = "vc_create_user")
	private String vc_create_user;
	@DatabaseField(columnName = "vc_create_mechanism")
	private String vc_create_mechanism;
	@DatabaseField(columnName = "dt_update_time")
	private String dt_update_time;
	@DatabaseField(columnName = "vc_update_user")
	private String vc_update_user;
	@DatabaseField(columnName = "vc_uodate_mechanism")
	private String vc_uodate_mechanism;
	@DatabaseField(columnName = "vc_status")
	private String vc_status;
	@DatabaseField(columnName = "instanceid")
	private String instanceid;
	@DatabaseField(columnName = "del_status")
	private String del_status;
	@DatabaseField(columnName = "t_task_list_id")
	private String t_task_list_id;
	@DatabaseField(columnName = "rownum_")
	private int rownum_;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getT_wrydcxw_record_id() {
		return t_wrydcxw_record_id;
	}

	public void setT_wrydcxw_record_id(String t_wrydcxw_record_id) {
		this.t_wrydcxw_record_id = t_wrydcxw_record_id;
	}

	public String getDt_start_time() {
		return dt_start_time;
	}

	public void setDt_start_time(String dt_start_time) {
		this.dt_start_time = dt_start_time;
	}

	public String getDt_end_time() {
		return dt_end_time;
	}

	public void setDt_end_time(String dt_end_time) {
		this.dt_end_time = dt_end_time;
	}

	public String getVc_location() {
		return vc_location;
	}

	public void setVc_location(String vc_location) {
		this.vc_location = vc_location;
	}

	public String getVc_xwr() {
		return vc_xwr;
	}

	public void setVc_xwr(String vc_xwr) {
		this.vc_xwr = vc_xwr;
	}

	public String getVc_xwr_id() {
		return vc_xwr_id;
	}

	public void setVc_xwr_id(String vc_xwr_id) {
		this.vc_xwr_id = vc_xwr_id;
	}

	public String getVc_zfzh() {
		return vc_zfzh;
	}

	public void setVc_zfzh(String vc_zfzh) {
		this.vc_zfzh = vc_zfzh;
	}

	public String getVc_jlr() {
		return vc_jlr;
	}

	public void setVc_jlr(String vc_jlr) {
		this.vc_jlr = vc_jlr;
	}

	public String getVc_jlr_id() {
		return vc_jlr_id;
	}

	public void setVc_jlr_id(String vc_jlr_id) {
		this.vc_jlr_id = vc_jlr_id;
	}

	public String getVc_zzjgdm() {
		return vc_zzjgdm;
	}

	public void setVc_zzjgdm(String vc_zzjgdm) {
		this.vc_zzjgdm = vc_zzjgdm;
	}

	public String getVc_bxwrxm() {
		return vc_bxwrxm;
	}

	public void setVc_bxwrxm(String vc_bxwrxm) {
		this.vc_bxwrxm = vc_bxwrxm;
	}

	public String getVc_sfzh() {
		return vc_sfzh;
	}

	public void setVc_sfzh(String vc_sfzh) {
		this.vc_sfzh = vc_sfzh;
	}

	public String getNb_age() {
		return nb_age;
	}

	public void setNb_age(String nb_age) {
		this.nb_age = nb_age;
	}

	public String getVc_gzdw() {
		return vc_gzdw;
	}

	public void setVc_gzdw(String vc_gzdw) {
		this.vc_gzdw = vc_gzdw;
	}

	public String getVc_duty() {
		return vc_duty;
	}

	public void setVc_duty(String vc_duty) {
		this.vc_duty = vc_duty;
	}

	public String getVc_ybagx() {
		return vc_ybagx;
	}

	public void setVc_ybagx(String vc_ybagx) {
		this.vc_ybagx = vc_ybagx;
	}

	public String getVc_address() {
		return vc_address;
	}

	public void setVc_address(String vc_address) {
		this.vc_address = vc_address;
	}

	public String getVc_telephone() {
		return vc_telephone;
	}

	public void setVc_telephone(String vc_telephone) {
		this.vc_telephone = vc_telephone;
	}

	public String getVc_yzbm() {
		return vc_yzbm;
	}

	public void setVc_yzbm(String vc_yzbm) {
		this.vc_yzbm = vc_yzbm;
	}

	public String getVc_qtcjtcxwrxmjgzdw() {
		return vc_qtcjtcxwrxmjgzdw;
	}

	public void setVc_qtcjtcxwrxmjgzdw(String vc_qtcjtcxwrxmjgzdw) {
		this.vc_qtcjtcxwrxmjgzdw = vc_qtcjtcxwrxmjgzdw;
	}

	public String getVc_hjjclx() {
		return vc_hjjclx;
	}

	public void setVc_hjjclx(String vc_hjjclx) {
		this.vc_hjjclx = vc_hjjclx;
	}

	public String getVc_sfsqhb() {
		return vc_sfsqhb;
	}

	public void setVc_sfsqhb(String vc_sfsqhb) {
		this.vc_sfsqhb = vc_sfsqhb;
	}

	public String getVc_sfqrzj() {
		return vc_sfqrzj;
	}

	public void setVc_sfqrzj(String vc_sfqrzj) {
		this.vc_sfqrzj = vc_sfqrzj;
	}

	public String getCl_xwnr() {
		return cl_xwnr;
	}

	public void setCl_xwnr(String cl_xwnr) {
		this.cl_xwnr = cl_xwnr;
	}

	public String getDt_create_time() {
		return dt_create_time;
	}

	public void setDt_create_time(String dt_create_time) {
		this.dt_create_time = dt_create_time;
	}

	public String getVc_create_user() {
		return vc_create_user;
	}

	public void setVc_create_user(String vc_create_user) {
		this.vc_create_user = vc_create_user;
	}

	public String getVc_create_mechanism() {
		return vc_create_mechanism;
	}

	public void setVc_create_mechanism(String vc_create_mechanism) {
		this.vc_create_mechanism = vc_create_mechanism;
	}

	public String getDt_update_time() {
		return dt_update_time;
	}

	public void setDt_update_time(String dt_update_time) {
		this.dt_update_time = dt_update_time;
	}

	public String getVc_update_user() {
		return vc_update_user;
	}

	public void setVc_update_user(String vc_update_user) {
		this.vc_update_user = vc_update_user;
	}

	public String getVc_uodate_mechanism() {
		return vc_uodate_mechanism;
	}

	public void setVc_uodate_mechanism(String vc_uodate_mechanism) {
		this.vc_uodate_mechanism = vc_uodate_mechanism;
	}

	public String getVc_status() {
		return vc_status;
	}

	public void setVc_status(String vc_status) {
		this.vc_status = vc_status;
	}

	public String getInstanceid() {
		return instanceid;
	}

	public void setInstanceid(String instanceid) {
		this.instanceid = instanceid;
	}

	public String getDel_status() {
		return del_status;
	}

	public void setDel_status(String del_status) {
		this.del_status = del_status;
	}

	public String getT_task_list_id() {
		return t_task_list_id;
	}

	public void setT_task_list_id(String t_task_list_id) {
		this.t_task_list_id = t_task_list_id;
	}

	public int getRownum_() {
		return rownum_;
	}

	public void setRownum_(int rownum_) {
		this.rownum_ = rownum_;
	}

	@Override
	public String toString() {
		return "PollutionSurveryTakeDownDbBean{" +
				"id=" + id +
				", t_wrydcxw_record_id='" + t_wrydcxw_record_id + '\'' +
				", dt_start_time='" + dt_start_time + '\'' +
				", dt_end_time='" + dt_end_time + '\'' +
				", vc_location='" + vc_location + '\'' +
				", vc_xwr='" + vc_xwr + '\'' +
				", vc_xwr_id='" + vc_xwr_id + '\'' +
				", vc_zfzh='" + vc_zfzh + '\'' +
				", vc_jlr='" + vc_jlr + '\'' +
				", vc_jlr_id='" + vc_jlr_id + '\'' +
				", vc_zzjgdm='" + vc_zzjgdm + '\'' +
				", vc_bxwrxm='" + vc_bxwrxm + '\'' +
				", vc_sfzh='" + vc_sfzh + '\'' +
				", nb_age='" + nb_age + '\'' +
				", vc_gzdw='" + vc_gzdw + '\'' +
				", vc_duty='" + vc_duty + '\'' +
				", vc_ybagx='" + vc_ybagx + '\'' +
				", vc_address='" + vc_address + '\'' +
				", vc_telephone='" + vc_telephone + '\'' +
				", vc_yzbm='" + vc_yzbm + '\'' +
				", vc_qtcjtcxwrxmjgzdw='" + vc_qtcjtcxwrxmjgzdw + '\'' +
				", vc_hjjclx='" + vc_hjjclx + '\'' +
				", vc_sfsqhb='" + vc_sfsqhb + '\'' +
				", vc_sfqrzj='" + vc_sfqrzj + '\'' +
				", cl_xwnr='" + cl_xwnr + '\'' +
				", dt_create_time='" + dt_create_time + '\'' +
				", vc_create_user='" + vc_create_user + '\'' +
				", vc_create_mechanism='" + vc_create_mechanism + '\'' +
				", dt_update_time='" + dt_update_time + '\'' +
				", vc_update_user='" + vc_update_user + '\'' +
				", vc_uodate_mechanism='" + vc_uodate_mechanism + '\'' +
				", vc_status='" + vc_status + '\'' +
				", instanceid='" + instanceid + '\'' +
				", del_status='" + del_status + '\'' +
				", t_task_list_id='" + t_task_list_id + '\'' +
				", rownum_=" + rownum_ +
				'}';
	}
}
