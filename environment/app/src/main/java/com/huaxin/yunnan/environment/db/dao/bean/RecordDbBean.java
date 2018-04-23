package com.huaxin.yunnan.environment.db.dao.bean;

import com.huaxin.yunnan.environment.bean.RecordBean;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * 1.通用现场检查记录DbBean
 * Created by zbw on 2018/1/29 17:10.
 */
@DatabaseTable(tableName = "record_bean_list")
public class RecordDbBean {
	@DatabaseField(generatedId = true)
	private int id;
	@DatabaseField(columnName = "t_zdxcjcjl_id")
	private String t_zdxcjcjl_id;
	@DatabaseField(columnName = "dt_kssj")
	private String dt_kssj;
	@DatabaseField(columnName = "dt_jssj")
	private String dt_jssj;
	@DatabaseField(columnName = "vc_dd")
	private String vc_dd;
	@DatabaseField(columnName = "vc_bjcdwmc")
	private String vc_bjcdwmc;
	@DatabaseField(columnName = "vc_zzjgdm")
	private String vc_zzjgdm;
	@DatabaseField(columnName = "vc_jcr")
	private String vc_jcr;
	@DatabaseField(columnName = "vc_zfzh")
	private String vc_zfzh;
	@DatabaseField(columnName = "vc_jlr")
	private String vc_jlr;
	@DatabaseField(columnName = "vc_fddbr")
	private String vc_fddbr;
	@DatabaseField(columnName = "vc_jcr_id")
	private String vc_jcr_id;
	@DatabaseField(columnName = "vc_jlr_id")
	private String vc_jlr_id;
	@DatabaseField(columnName = "vc_bjcdwmc_id")
	private String vc_bjcdwmc_id;
	@DatabaseField(columnName = "vc_xcfzr")
	private String vc_xcfzr;
	@DatabaseField(columnName = "vc_sfzh")
	private String vc_sfzh;
	@DatabaseField(columnName = "nb_nl")
	private String nb_nl;
	@DatabaseField(columnName = "vc_gzdw")
	private String vc_gzdw;
	@DatabaseField(columnName = "vc_zw")
	private String vc_zw;
	@DatabaseField(columnName = "vc_ybagx")
	private String vc_ybagx;
	@DatabaseField(columnName = "vc_dz")
	private String vc_dz;
	@DatabaseField(columnName = "vc_dh")
	private String vc_dh;
	@DatabaseField(columnName = "vc_yzbm")
	private String vc_yzbm;
	@DatabaseField(columnName = "vc_qtcjrxmygzdw")
	private String vc_qtcjrxmygzdw;
	@DatabaseField(columnName = "vc_sfqrzj")
	private String vc_sfqrzj;
	@DatabaseField(columnName = "vc_sfsqhb")
	private String vc_sfsqhb;
	@DatabaseField(columnName = "cl_qygk")
	private String cl_qygk;
	@DatabaseField(columnName = "cl_hbsxjrw")
	private String cl_hbsxjrw;
	@DatabaseField(columnName = "cl_wrfzssxcjcqk")
	private String cl_wrfzssxcjcqk;
	@DatabaseField(columnName = "cl_wsfhjlqk")
	private String cl_wsfhjlqk;
	@DatabaseField(columnName = "cl_hjfxjyjglqk")
	private String cl_hjfxjyjglqk;
	@DatabaseField(columnName = "cl_qthbbmjcqk")
	private String cl_qthbbmjcqk;
	@DatabaseField(columnName = "cl_czzywt")
	private String cl_czzywt;
	@DatabaseField(columnName = "cl_jcyq")
	private String cl_jcyq;
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

	public String getT_zdxcjcjl_id() {
		return t_zdxcjcjl_id;
	}

	public void setT_zdxcjcjl_id(String t_zdxcjcjl_id) {
		this.t_zdxcjcjl_id = t_zdxcjcjl_id;
	}

	public String getDt_kssj() {
		return dt_kssj;
	}

	public void setDt_kssj(String dt_kssj) {
		this.dt_kssj = dt_kssj;
	}

	public String getDt_jssj() {
		return dt_jssj;
	}

	public void setDt_jssj(String dt_jssj) {
		this.dt_jssj = dt_jssj;
	}

	public String getVc_dd() {
		return vc_dd;
	}

	public void setVc_dd(String vc_dd) {
		this.vc_dd = vc_dd;
	}

	public String getVc_bjcdwmc() {
		return vc_bjcdwmc;
	}

	public void setVc_bjcdwmc(String vc_bjcdwmc) {
		this.vc_bjcdwmc = vc_bjcdwmc;
	}

	public String getVc_zzjgdm() {
		return vc_zzjgdm;
	}

	public void setVc_zzjgdm(String vc_zzjgdm) {
		this.vc_zzjgdm = vc_zzjgdm;
	}

	public String getVc_jcr() {
		return vc_jcr;
	}

	public void setVc_jcr(String vc_jcr) {
		this.vc_jcr = vc_jcr;
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

	public String getVc_fddbr() {
		return vc_fddbr;
	}

	public void setVc_fddbr(String vc_fddbr) {
		this.vc_fddbr = vc_fddbr;
	}

	public String getVc_jcr_id() {
		return vc_jcr_id;
	}

	public void setVc_jcr_id(String vc_jcr_id) {
		this.vc_jcr_id = vc_jcr_id;
	}

	public String getVc_jlr_id() {
		return vc_jlr_id;
	}

	public void setVc_jlr_id(String vc_jlr_id) {
		this.vc_jlr_id = vc_jlr_id;
	}

	public String getVc_bjcdwmc_id() {
		return vc_bjcdwmc_id;
	}

	public void setVc_bjcdwmc_id(String vc_bjcdwmc_id) {
		this.vc_bjcdwmc_id = vc_bjcdwmc_id;
	}

	public String getVc_xcfzr() {
		return vc_xcfzr;
	}

	public void setVc_xcfzr(String vc_xcfzr) {
		this.vc_xcfzr = vc_xcfzr;
	}

	public String getVc_sfzh() {
		return vc_sfzh;
	}

	public void setVc_sfzh(String vc_sfzh) {
		this.vc_sfzh = vc_sfzh;
	}

	public String getNb_nl() {
		return nb_nl;
	}

	public void setNb_nl(String nb_nl) {
		this.nb_nl = nb_nl;
	}

	public String getVc_gzdw() {
		return vc_gzdw;
	}

	public void setVc_gzdw(String vc_gzdw) {
		this.vc_gzdw = vc_gzdw;
	}

	public String getVc_zw() {
		return vc_zw;
	}

	public void setVc_zw(String vc_zw) {
		this.vc_zw = vc_zw;
	}

	public String getVc_ybagx() {
		return vc_ybagx;
	}

	public void setVc_ybagx(String vc_ybagx) {
		this.vc_ybagx = vc_ybagx;
	}

	public String getVc_dz() {
		return vc_dz;
	}

	public void setVc_dz(String vc_dz) {
		this.vc_dz = vc_dz;
	}

	public String getVc_dh() {
		return vc_dh;
	}

	public void setVc_dh(String vc_dh) {
		this.vc_dh = vc_dh;
	}

	public String getVc_yzbm() {
		return vc_yzbm;
	}

	public void setVc_yzbm(String vc_yzbm) {
		this.vc_yzbm = vc_yzbm;
	}

	public String getVc_qtcjrxmygzdw() {
		return vc_qtcjrxmygzdw;
	}

	public void setVc_qtcjrxmygzdw(String vc_qtcjrxmygzdw) {
		this.vc_qtcjrxmygzdw = vc_qtcjrxmygzdw;
	}

	public String getVc_sfqrzj() {
		return vc_sfqrzj;
	}

	public void setVc_sfqrzj(String vc_sfqrzj) {
		this.vc_sfqrzj = vc_sfqrzj;
	}

	public String getVc_sfsqhb() {
		return vc_sfsqhb;
	}

	public void setVc_sfsqhb(String vc_sfsqhb) {
		this.vc_sfsqhb = vc_sfsqhb;
	}

	public String getCl_qygk() {
		return cl_qygk;
	}

	public void setCl_qygk(String cl_qygk) {
		this.cl_qygk = cl_qygk;
	}

	public String getCl_hbsxjrw() {
		return cl_hbsxjrw;
	}

	public void setCl_hbsxjrw(String cl_hbsxjrw) {
		this.cl_hbsxjrw = cl_hbsxjrw;
	}

	public String getCl_wrfzssxcjcqk() {
		return cl_wrfzssxcjcqk;
	}

	public void setCl_wrfzssxcjcqk(String cl_wrfzssxcjcqk) {
		this.cl_wrfzssxcjcqk = cl_wrfzssxcjcqk;
	}

	public String getCl_wsfhjlqk() {
		return cl_wsfhjlqk;
	}

	public void setCl_wsfhjlqk(String cl_wsfhjlqk) {
		this.cl_wsfhjlqk = cl_wsfhjlqk;
	}

	public String getCl_hjfxjyjglqk() {
		return cl_hjfxjyjglqk;
	}

	public void setCl_hjfxjyjglqk(String cl_hjfxjyjglqk) {
		this.cl_hjfxjyjglqk = cl_hjfxjyjglqk;
	}

	public String getCl_qthbbmjcqk() {
		return cl_qthbbmjcqk;
	}

	public void setCl_qthbbmjcqk(String cl_qthbbmjcqk) {
		this.cl_qthbbmjcqk = cl_qthbbmjcqk;
	}

	public String getCl_czzywt() {
		return cl_czzywt;
	}

	public void setCl_czzywt(String cl_czzywt) {
		this.cl_czzywt = cl_czzywt;
	}

	public String getCl_jcyq() {
		return cl_jcyq;
	}

	public void setCl_jcyq(String cl_jcyq) {
		this.cl_jcyq = cl_jcyq;
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
		return "RecordDbBean{" +
				"id=" + id +
				", t_zdxcjcjl_id='" + t_zdxcjcjl_id + '\'' +
				", dt_kssj='" + dt_kssj + '\'' +
				", dt_jssj='" + dt_jssj + '\'' +
				", vc_dd='" + vc_dd + '\'' +
				", vc_bjcdwmc='" + vc_bjcdwmc + '\'' +
				", vc_zzjgdm='" + vc_zzjgdm + '\'' +
				", vc_jcr='" + vc_jcr + '\'' +
				", vc_zfzh='" + vc_zfzh + '\'' +
				", vc_jlr='" + vc_jlr + '\'' +
				", vc_fddbr='" + vc_fddbr + '\'' +
				", vc_jcr_id='" + vc_jcr_id + '\'' +
				", vc_jlr_id='" + vc_jlr_id + '\'' +
				", vc_bjcdwmc_id='" + vc_bjcdwmc_id + '\'' +
				", vc_xcfzr='" + vc_xcfzr + '\'' +
				", vc_sfzh='" + vc_sfzh + '\'' +
				", nb_nl='" + nb_nl + '\'' +
				", vc_gzdw='" + vc_gzdw + '\'' +
				", vc_zw='" + vc_zw + '\'' +
				", vc_ybagx='" + vc_ybagx + '\'' +
				", vc_dz='" + vc_dz + '\'' +
				", vc_dh='" + vc_dh + '\'' +
				", vc_yzbm='" + vc_yzbm + '\'' +
				", vc_qtcjrxmygzdw='" + vc_qtcjrxmygzdw + '\'' +
				", vc_sfqrzj='" + vc_sfqrzj + '\'' +
				", vc_sfsqhb='" + vc_sfsqhb + '\'' +
				", cl_qygk='" + cl_qygk + '\'' +
				", cl_hbsxjrw='" + cl_hbsxjrw + '\'' +
				", cl_wrfzssxcjcqk='" + cl_wrfzssxcjcqk + '\'' +
				", cl_wsfhjlqk='" + cl_wsfhjlqk + '\'' +
				", cl_hjfxjyjglqk='" + cl_hjfxjyjglqk + '\'' +
				", cl_qthbbmjcqk='" + cl_qthbbmjcqk + '\'' +
				", cl_czzywt='" + cl_czzywt + '\'' +
				", cl_jcyq='" + cl_jcyq + '\'' +
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
