package com.huaxin.yunnan.environment.db.dao.bean;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.List;

/**
 * 2、合成氨行业现场检查记录模板bean
 * Created by zbw on 2017/10/26 14:44.
 */
@DatabaseTable(tableName = "ammoniatemplate_bean_list")
public class AmmoniaTemplateDbBean {

	@DatabaseField(generatedId = true)
	private int id;
	@DatabaseField(columnName = "t_hcahyxcjc_record_id")
	private String t_hcahyxcjc_record_id;
	@DatabaseField(columnName = "dt_start_time")
	private String dt_start_time;
	@DatabaseField(columnName = "dt_end_time")
	private String dt_end_time;
	@DatabaseField(columnName = "vc_location")
	private String vc_location;
	@DatabaseField(columnName = "vc_jcr")
	private String vc_jcr;
	@DatabaseField(columnName = "vc_jcr_id")
	private Object vc_jcr_id;
	@DatabaseField(columnName = "vc_zfzh")
	private String vc_zfzh;
	@DatabaseField(columnName = "vc_jlr")
	private String vc_jlr;
	@DatabaseField(columnName = "vc_jlr_id")
	private Object vc_jlr_id;
	@DatabaseField(columnName = "vc_bjcdwmc")
	private String vc_bjcdwmc;
	@DatabaseField(columnName = "vc_bjcdwmc_id")
	private Object vc_bjcdwmc_id;
	@DatabaseField(columnName = "vc_zzjgdmzh")
	private String vc_zzjgdmzh;
	@DatabaseField(columnName = "vc_fddbr")
	private String vc_fddbr;
	@DatabaseField(columnName = "vc_fddbrsfzh")
	private String vc_fddbrsfzh;
	@DatabaseField(columnName = "vc_xcfzr")
	private Object vc_xcfzr;
	@DatabaseField(columnName = "vc_xcfzrsfzh")
	private Object vc_xcfzrsfzh;
	@DatabaseField(columnName = "nb_age")
	private Object nb_age;
	@DatabaseField(columnName = "vc_gzdw")
	private Object vc_gzdw;
	@DatabaseField(columnName = "vc_duty")
	private Object vc_duty;
	@DatabaseField(columnName = "vc_ybagx")
	private Object vc_ybagx;
	@DatabaseField(columnName = "vc_address")
	private Object vc_address;
	@DatabaseField(columnName = "vc_telephone")
	private Object vc_telephone;
	@DatabaseField(columnName = "vc_yzbm")
	private Object vc_yzbm;
	@DatabaseField(columnName = "cl_qtcjrxmjgzdw")
	private Object cl_qtcjrxmjgzdw;
	@DatabaseField(columnName = "vc_hbdwmc")
	private Object vc_hbdwmc;
	@DatabaseField(columnName = "vc_hbdwlx")
	private Object vc_hbdwlx;
	@DatabaseField(columnName = "vc_hjjclx")
	private String vc_hjjclx;
	@DatabaseField(columnName = "vc_sfqrzj")
	private String vc_sfqrzj;
	@DatabaseField(columnName = "vc_sfsqhb")
	private Object vc_sfsqhb;
	@DatabaseField(columnName = "vc_city")
	private Object vc_city;
	@DatabaseField(columnName = "vc_county")
	private Object vc_county;
	@DatabaseField(columnName = "vc_town")
	private Object vc_town;
	@DatabaseField(columnName = "vc_xzc")
	private Object vc_xzc;
	@DatabaseField(columnName = "vc_gyyq")
	private Object vc_gyyq;
	@DatabaseField(columnName = "vc_pq")
	private Object vc_pq;
	@DatabaseField(columnName = "vc_xcjcsqk")
	private String vc_xcjcsqk;
	@DatabaseField(columnName = "vc_zycphscgy")
	private Object vc_zycphscgy;
	@DatabaseField(columnName = "vc_xmmc")
	private Object vc_xmmc;
	@DatabaseField(columnName = "vc_hpbzdw")
	private Object vc_hpbzdw;
	@DatabaseField(columnName = "dt_hpbz_time")
	private String dt_hpbz_time;
	@DatabaseField(columnName = "vc_spdw")
	private Object vc_spdw;
	@DatabaseField(columnName = "dt_sp_time")
	private String dt_sp_time;
	@DatabaseField(columnName = "vc_spwh")
	private Object vc_spwh;
	@DatabaseField(columnName = "vc_sscpfdw")
	private Object vc_sscpfdw;
	@DatabaseField(columnName = "dt_sscpf_time")
	private String dt_sscpf_time;
	@DatabaseField(columnName = "vc_sscpfwh")
	private Object vc_sscpfwh;
	@DatabaseField(columnName = "vc_hbjgysdw")
	private Object vc_hbjgysdw;
	@DatabaseField(columnName = "dt_hbjgys_time")
	private String dt_hbjgys_time;
	@DatabaseField(columnName = "vc_hbjgyswh")
	private Object vc_hbjgyswh;
	@DatabaseField(columnName = "vc_sfbzhpbgwj")
	private Object vc_sfbzhpbgwj;
	@DatabaseField(columnName = "vc_wbzqkms")
	private Object vc_wbzqkms;
	@DatabaseField(columnName = "vc_bzsfczjdhpdjdqk")
	private Object vc_bzsfczjdhpdjdqk;
	@DatabaseField(columnName = "vc_jdhpdjqkms")
	private Object vc_jdhpdjqkms;
	@DatabaseField(columnName = "vc_sfjghbbmsp")
	private Object vc_sfjghbbmsp;
	@DatabaseField(columnName = "vc_wjspqkms")
	private Object vc_wjspqkms;
	@DatabaseField(columnName = "vc_sfczyjsp")
	private Object vc_sfczyjsp;
	@DatabaseField(columnName = "vc_yjspqkms")
	private Object vc_yjspqkms;
	@DatabaseField(columnName = "vc_sscsfjghbbmspty")
	private Object vc_sscsfjghbbmspty;
	@DatabaseField(columnName = "vc_wjpzsztrsscqkms")
	private Object vc_wjpzsztrsscqkms;
	@DatabaseField(columnName = "vc_sftghbbmxmjgys")
	private Object vc_sftghbbmxmjgys;
	@DatabaseField(columnName = "vc_wjyshtyyqssczjsfcgyn")
	private Object vc_wjyshtyyqssczjsfcgyn;
	@DatabaseField(columnName = "vc_qysyjsxmxzgmddssybg")
	private Object vc_qysyjsxmxzgmddssybg;
	@DatabaseField(columnName = "vc_bgqkms")
	private Object vc_bgqkms;
	@DatabaseField(columnName = "vc_sfyfqdpwxkz")
	private Object vc_sfyfqdpwxkz;
	@DatabaseField(columnName = "vc_azpwxkzdgdpfwrw")
	private Object vc_azpwxkzdgdpfwrw;
	@DatabaseField(columnName = "vc_wagdqkms")
	private Object vc_wagdqkms;
	@DatabaseField(columnName = "vc_sfjxpwsbdj")
	private Object vc_sfjxpwsbdj;
	@DatabaseField(columnName = "vc_sfjnpwf")
	private Object vc_sfjnpwf;
	@DatabaseField(columnName = "vc_synsjjnpwf")
	private Object vc_synsjjnpwf;
	@DatabaseField(columnName = "vc_yjpwf")
	private Object vc_yjpwf;
	@DatabaseField(columnName = "vc_wzejnpwfyy")
	private Object vc_wzejnpwfyy;
	@DatabaseField(columnName = "cl_gqyyzzpffqwryjpthbss")
	private Object cl_gqyyzzpffqwryjpthbss;
	@DatabaseField(columnName = "vc_hpbgjpfyqdfqzldccsjsssfls")
	private Object vc_hpbgjpfyqdfqzldccsjsssfls;
	@DatabaseField(columnName = "cl_wlsqkms")
	private Object cl_wlsqkms;
	@DatabaseField(columnName = "vc_fq_jlnjcsfcb")
	private Object vc_fq_jlnjcsfcb;
	@DatabaseField(columnName = "vc_fq_cbyzjjczw")
	private Object vc_fq_cbyzjjczw;
	@DatabaseField(columnName = "vc_fq_jcdw")
	private Object vc_fq_jcdw;
	@DatabaseField(columnName = "dt_fqjc_time")
	private String dt_fqjc_time;
	@DatabaseField(columnName = "vc_fq_sfazzxjczz")
	private Object vc_fq_sfazzxjczz;
	@DatabaseField(columnName = "dt_fqaz_time")
	private String dt_fqaz_time;
	@DatabaseField(columnName = "vc_fq_sfyhbbmlw")
	private Object vc_fq_sfyhbbmlw;
	@DatabaseField(columnName = "vc_fq_sfyyzc")
	private Object vc_fq_sfyyzc;
	@DatabaseField(columnName = "vc_fq_sfjgjy")
	private Object vc_fq_sfjgjy;
	@DatabaseField(columnName = "dt_fqjy_time")
	private String dt_fqjy_time;
	@DatabaseField(columnName = "vc_fq_zxjcsj")
	private Object vc_fq_zxjcsj;
	@DatabaseField(columnName = "vc_fs_scfscshj")
	private Object vc_fs_scfscshj;
	@DatabaseField(columnName = "vc_fs_csl")
	private Object vc_fs_csl;
	@DatabaseField(columnName = "vc_fs_scfsclss")
	private Object vc_fs_scfsclss;
	@DatabaseField(columnName = "vc_fs_cll")
	private Object vc_fs_cll;
	@DatabaseField(columnName = "vc_fsclsffhhpjpfyq")
	private Object vc_fsclsffhhpjpfyq;
	@DatabaseField(columnName = "vc_fs_bfhqkms")
	private Object vc_fs_bfhqkms;
	@DatabaseField(columnName = "vc_fs_sfsxfsfl")
	private Object vc_fs_sfsxfsfl;
	@DatabaseField(columnName = "vc_fs_sfcztpfs")
	private Object vc_fs_sfcztpfs;
	@DatabaseField(columnName = "vc_fs_qksm")
	private Object vc_fs_qksm;
	@DatabaseField(columnName = "vc_fs_jlnjcsfcb")
	private Object vc_fs_jlnjcsfcb;
	@DatabaseField(columnName = "vc_fs_cbyzjjcz")
	private Object vc_fs_cbyzjjcz;
	@DatabaseField(columnName = "vc_fs_jcdw")
	private Object vc_fs_jcdw;
	@DatabaseField(columnName = "dt_fs_jc_time")
	private String dt_fs_jc_time;
	@DatabaseField(columnName = "vc_fs_sfazzxjczz")
	private Object vc_fs_sfazzxjczz;
	@DatabaseField(columnName = "dt_fs_az_time")
	private String dt_fs_az_time;
	@DatabaseField(columnName = "vc_fs_sfyhbbmlw")
	private Object vc_fs_sfyhbbmlw;
	@DatabaseField(columnName = "vc_fs_sfyxzc")
	private Object vc_fs_sfyxzc;
	@DatabaseField(columnName = "vc_fs_sfjgjy")
	private Object vc_fs_sfjgjy;
	@DatabaseField(columnName = "dt_fs_jy_time")
	private String dt_fs_jy_time;
	@DatabaseField(columnName = "vc_fs_zxjcsjxs")
	private Object vc_fs_zxjcsjxs;
	@DatabaseField(columnName = "vc_mjyzcsl")
	private Object vc_mjyzcsl;
	@DatabaseField(columnName = "vc_mjyczcs")
	private Object vc_mjyczcs;
	@DatabaseField(columnName = "vc_fkwycsl")
	private Object vc_fkwycsl;
	@DatabaseField(columnName = "vc_fkwyczcs")
	private Object vc_fkwyczcs;
	@DatabaseField(columnName = "vc_qtwfzljcsl")
	private Object vc_qtwfzljcsl;
	@DatabaseField(columnName = "vc_qtwfclfs")
	private Object vc_qtwfclfs;
	@DatabaseField(columnName = "vc_wxfwtzsfjqgf")
	private Object vc_wxfwtzsfjqgf;
	@DatabaseField(columnName = "vc_sycsjczqksfxhbbmsb")
	private Object vc_sycsjczqksfxhbbmsb;
	@DatabaseField(columnName = "vc_wsbdynx")
	private Object vc_wsbdynx;
	@DatabaseField(columnName = "vc_sfzdlwxfwywsgffcshyjya")
	private Object vc_sfzdlwxfwywsgffcshyjya;
	@DatabaseField(columnName = "vc_wxfwcfkhcdsfsybs")
	private Object vc_wxfwcfkhcdsfsybs;
	@DatabaseField(columnName = "vc_sffhwxfwccgf")
	private Object vc_sffhwxfwccgf;
	@DatabaseField(columnName = "vc_sfczwxfwyybgfhd")
	private Object vc_sfczwxfwyybgfhd;
	@DatabaseField(columnName = "vc_zcnlscfdcsjsfcgyn")
	private Object vc_zcnlscfdcsjsfcgyn;
	@DatabaseField(columnName = "vc_zcwsfjsyyjxdczc")
	private Object vc_zcwsfjsyyjxdczc;
	@DatabaseField(columnName = "vc_rzyccsfzxwxfwzyldzd")
	private Object vc_rzyccsfzxwxfwzyldzd;
	@DatabaseField(columnName = "vc_ysclsfjyxgzz")
	private Object vc_ysclsfjyxgzz;
	@DatabaseField(columnName = "vc_ysl")
	private Object vc_ysl;
	@DatabaseField(columnName = "vc_pc")
	private Object vc_pc;
	@DatabaseField(columnName = "vc_jsdwsfjywfjyzz")
	private Object vc_jsdwsfjywfjyzz;
	@DatabaseField(columnName = "vc_sjczfs")
	private Object vc_sjczfs;
	@DatabaseField(columnName = "vc_gqyybgfdclfssffhhpjpfyq")
	private Object vc_gqyybgfdclfssffhhpjpfyq;
	@DatabaseField(columnName = "vc_bfhqkms")
	private Object vc_bfhqkms;
	@DatabaseField(columnName = "vc_gczsbsfahpjpfyqcqcs")
	private Object vc_gczsbsfahpjpfyqcqcs;
	@DatabaseField(columnName = "vc_wlsqkms")
	private Object vc_wlsqkms;
	@DatabaseField(columnName = "vc_hpyqdfhjl")
	private Object vc_hpyqdfhjl;
	@DatabaseField(columnName = "vc_jlnsfybhmb")
	private Object vc_jlnsfybhmb;
	@DatabaseField(columnName = "dt_bhmbjssh")
	private String dt_bhmbjssh;
	@DatabaseField(columnName = "vc_zbhjbhqkms")
	private Object vc_zbhjbhqkms;
	@DatabaseField(columnName = "vc_sflshpjpfyqdfxffdccs")
	private Object vc_sflshpjpfyqdfxffdccs;
	@DatabaseField(columnName = "vc_fxcswlsqkms")
	private Object vc_fxcswlsqkms;
	@DatabaseField(columnName = "vc_sfbztfhjsjyjya")
	private Object vc_sfbztfhjsjyjya;
	@DatabaseField(columnName = "vc_sfdtfhjsjyjyajxpgba")
	private Object vc_sfdtfhjsjyjyajxpgba;
	@DatabaseField(columnName = "vc_sfayayqjxndyjyl")
	private Object vc_sfayayqjxndyjyl;
	@DatabaseField(columnName = "vc_sfcbyjwz")
	private Object vc_sfcbyjwz;
	@DatabaseField(columnName = "cl_qthbbmjcqk")
	private Object cl_qthbbmjcqk;
	@DatabaseField(columnName = "cl_czzywt")
	private Object cl_czzywt;
	@DatabaseField(columnName = "cl_jcyq")
	private Object cl_jcyq;
	@DatabaseField(columnName = "dt_create_time")
	private String dt_create_time;
	@DatabaseField(columnName = "vc_create_user")
	private String vc_create_user;
	@DatabaseField(columnName = "vc_create_mechanism")
	private String vc_create_mechanism;
	@DatabaseField(columnName = "dt_update_time")
	private Object dt_update_time;
	@DatabaseField(columnName = "vc_update_user")
	private Object vc_update_user;
	@DatabaseField(columnName = "vc_uodate_mechanism")
	private Object vc_uodate_mechanism;
	@DatabaseField(columnName = "vc_status")
	private Object vc_status;
	@DatabaseField(columnName = "instanceid")
	private Object instanceid;
	@DatabaseField(columnName = "del_status")
	private String del_status;
	@DatabaseField(columnName = "t_task_list_id")
	private String t_task_list_id;
	@DatabaseField(columnName = "rownum_")
	private int rownum_;

	public String getT_hcahyxcjc_record_id() {
		return t_hcahyxcjc_record_id;
	}

	public void setT_hcahyxcjc_record_id(String t_hcahyxcjc_record_id) {
		this.t_hcahyxcjc_record_id = t_hcahyxcjc_record_id;
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

	public String getVc_jcr() {
		return vc_jcr;
	}

	public void setVc_jcr(String vc_jcr) {
		this.vc_jcr = vc_jcr;
	}

	public Object getVc_jcr_id() {
		return vc_jcr_id;
	}

	public void setVc_jcr_id(Object vc_jcr_id) {
		this.vc_jcr_id = vc_jcr_id;
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

	public Object getVc_jlr_id() {
		return vc_jlr_id;
	}

	public void setVc_jlr_id(Object vc_jlr_id) {
		this.vc_jlr_id = vc_jlr_id;
	}

	public String getVc_bjcdwmc() {
		return vc_bjcdwmc;
	}

	public void setVc_bjcdwmc(String vc_bjcdwmc) {
		this.vc_bjcdwmc = vc_bjcdwmc;
	}

	public Object getVc_bjcdwmc_id() {
		return vc_bjcdwmc_id;
	}

	public void setVc_bjcdwmc_id(Object vc_bjcdwmc_id) {
		this.vc_bjcdwmc_id = vc_bjcdwmc_id;
	}

	public String getVc_zzjgdmzh() {
		return vc_zzjgdmzh;
	}

	public void setVc_zzjgdmzh(String vc_zzjgdmzh) {
		this.vc_zzjgdmzh = vc_zzjgdmzh;
	}

	public String getVc_fddbr() {
		return vc_fddbr;
	}

	public void setVc_fddbr(String vc_fddbr) {
		this.vc_fddbr = vc_fddbr;
	}

	public String getVc_fddbrsfzh() {
		return vc_fddbrsfzh;
	}

	public void setVc_fddbrsfzh(String vc_fddbrsfzh) {
		this.vc_fddbrsfzh = vc_fddbrsfzh;
	}

	public Object getVc_xcfzr() {
		return vc_xcfzr;
	}

	public void setVc_xcfzr(Object vc_xcfzr) {
		this.vc_xcfzr = vc_xcfzr;
	}

	public Object getVc_xcfzrsfzh() {
		return vc_xcfzrsfzh;
	}

	public void setVc_xcfzrsfzh(Object vc_xcfzrsfzh) {
		this.vc_xcfzrsfzh = vc_xcfzrsfzh;
	}

	public Object getNb_age() {
		return nb_age;
	}

	public void setNb_age(Object nb_age) {
		this.nb_age = nb_age;
	}

	public Object getVc_gzdw() {
		return vc_gzdw;
	}

	public void setVc_gzdw(Object vc_gzdw) {
		this.vc_gzdw = vc_gzdw;
	}

	public Object getVc_duty() {
		return vc_duty;
	}

	public void setVc_duty(Object vc_duty) {
		this.vc_duty = vc_duty;
	}

	public Object getVc_ybagx() {
		return vc_ybagx;
	}

	public void setVc_ybagx(Object vc_ybagx) {
		this.vc_ybagx = vc_ybagx;
	}

	public Object getVc_address() {
		return vc_address;
	}

	public void setVc_address(Object vc_address) {
		this.vc_address = vc_address;
	}

	public Object getVc_telephone() {
		return vc_telephone;
	}

	public void setVc_telephone(Object vc_telephone) {
		this.vc_telephone = vc_telephone;
	}

	public Object getVc_yzbm() {
		return vc_yzbm;
	}

	public void setVc_yzbm(Object vc_yzbm) {
		this.vc_yzbm = vc_yzbm;
	}

	public Object getCl_qtcjrxmjgzdw() {
		return cl_qtcjrxmjgzdw;
	}

	public void setCl_qtcjrxmjgzdw(Object cl_qtcjrxmjgzdw) {
		this.cl_qtcjrxmjgzdw = cl_qtcjrxmjgzdw;
	}

	public Object getVc_hbdwmc() {
		return vc_hbdwmc;
	}

	public void setVc_hbdwmc(Object vc_hbdwmc) {
		this.vc_hbdwmc = vc_hbdwmc;
	}

	public Object getVc_hbdwlx() {
		return vc_hbdwlx;
	}

	public void setVc_hbdwlx(Object vc_hbdwlx) {
		this.vc_hbdwlx = vc_hbdwlx;
	}

	public String getVc_hjjclx() {
		return vc_hjjclx;
	}

	public void setVc_hjjclx(String vc_hjjclx) {
		this.vc_hjjclx = vc_hjjclx;
	}

	public String getVc_sfqrzj() {
		return vc_sfqrzj;
	}

	public void setVc_sfqrzj(String vc_sfqrzj) {
		this.vc_sfqrzj = vc_sfqrzj;
	}

	public Object getVc_sfsqhb() {
		return vc_sfsqhb;
	}

	public void setVc_sfsqhb(Object vc_sfsqhb) {
		this.vc_sfsqhb = vc_sfsqhb;
	}

	public Object getVc_city() {
		return vc_city;
	}

	public void setVc_city(Object vc_city) {
		this.vc_city = vc_city;
	}

	public Object getVc_county() {
		return vc_county;
	}

	public void setVc_county(Object vc_county) {
		this.vc_county = vc_county;
	}

	public Object getVc_town() {
		return vc_town;
	}

	public void setVc_town(Object vc_town) {
		this.vc_town = vc_town;
	}

	public Object getVc_xzc() {
		return vc_xzc;
	}

	public void setVc_xzc(Object vc_xzc) {
		this.vc_xzc = vc_xzc;
	}

	public Object getVc_gyyq() {
		return vc_gyyq;
	}

	public void setVc_gyyq(Object vc_gyyq) {
		this.vc_gyyq = vc_gyyq;
	}

	public Object getVc_pq() {
		return vc_pq;
	}

	public void setVc_pq(Object vc_pq) {
		this.vc_pq = vc_pq;
	}

	public String getVc_xcjcsqk() {
		return vc_xcjcsqk;
	}

	public void setVc_xcjcsqk(String vc_xcjcsqk) {
		this.vc_xcjcsqk = vc_xcjcsqk;
	}

	public Object getVc_zycphscgy() {
		return vc_zycphscgy;
	}

	public void setVc_zycphscgy(Object vc_zycphscgy) {
		this.vc_zycphscgy = vc_zycphscgy;
	}

	public Object getVc_xmmc() {
		return vc_xmmc;
	}

	public void setVc_xmmc(Object vc_xmmc) {
		this.vc_xmmc = vc_xmmc;
	}

	public Object getVc_hpbzdw() {
		return vc_hpbzdw;
	}

	public void setVc_hpbzdw(Object vc_hpbzdw) {
		this.vc_hpbzdw = vc_hpbzdw;
	}

	public String getDt_hpbz_time() {
		return dt_hpbz_time;
	}

	public void setDt_hpbz_time(String dt_hpbz_time) {
		this.dt_hpbz_time = dt_hpbz_time;
	}

	public Object getVc_spdw() {
		return vc_spdw;
	}

	public void setVc_spdw(Object vc_spdw) {
		this.vc_spdw = vc_spdw;
	}

	public String getDt_sp_time() {
		return dt_sp_time;
	}

	public void setDt_sp_time(String dt_sp_time) {
		this.dt_sp_time = dt_sp_time;
	}

	public Object getVc_spwh() {
		return vc_spwh;
	}

	public void setVc_spwh(Object vc_spwh) {
		this.vc_spwh = vc_spwh;
	}

	public Object getVc_sscpfdw() {
		return vc_sscpfdw;
	}

	public void setVc_sscpfdw(Object vc_sscpfdw) {
		this.vc_sscpfdw = vc_sscpfdw;
	}

	public String getDt_sscpf_time() {
		return dt_sscpf_time;
	}

	public void setDt_sscpf_time(String dt_sscpf_time) {
		this.dt_sscpf_time = dt_sscpf_time;
	}

	public Object getVc_sscpfwh() {
		return vc_sscpfwh;
	}

	public void setVc_sscpfwh(Object vc_sscpfwh) {
		this.vc_sscpfwh = vc_sscpfwh;
	}

	public Object getVc_hbjgysdw() {
		return vc_hbjgysdw;
	}

	public void setVc_hbjgysdw(Object vc_hbjgysdw) {
		this.vc_hbjgysdw = vc_hbjgysdw;
	}

	public String getDt_hbjgys_time() {
		return dt_hbjgys_time;
	}

	public void setDt_hbjgys_time(String dt_hbjgys_time) {
		this.dt_hbjgys_time = dt_hbjgys_time;
	}

	public Object getVc_hbjgyswh() {
		return vc_hbjgyswh;
	}

	public void setVc_hbjgyswh(Object vc_hbjgyswh) {
		this.vc_hbjgyswh = vc_hbjgyswh;
	}

	public Object getVc_sfbzhpbgwj() {
		return vc_sfbzhpbgwj;
	}

	public void setVc_sfbzhpbgwj(Object vc_sfbzhpbgwj) {
		this.vc_sfbzhpbgwj = vc_sfbzhpbgwj;
	}

	public Object getVc_wbzqkms() {
		return vc_wbzqkms;
	}

	public void setVc_wbzqkms(Object vc_wbzqkms) {
		this.vc_wbzqkms = vc_wbzqkms;
	}

	public Object getVc_bzsfczjdhpdjdqk() {
		return vc_bzsfczjdhpdjdqk;
	}

	public void setVc_bzsfczjdhpdjdqk(Object vc_bzsfczjdhpdjdqk) {
		this.vc_bzsfczjdhpdjdqk = vc_bzsfczjdhpdjdqk;
	}

	public Object getVc_jdhpdjqkms() {
		return vc_jdhpdjqkms;
	}

	public void setVc_jdhpdjqkms(Object vc_jdhpdjqkms) {
		this.vc_jdhpdjqkms = vc_jdhpdjqkms;
	}

	public Object getVc_sfjghbbmsp() {
		return vc_sfjghbbmsp;
	}

	public void setVc_sfjghbbmsp(Object vc_sfjghbbmsp) {
		this.vc_sfjghbbmsp = vc_sfjghbbmsp;
	}

	public Object getVc_wjspqkms() {
		return vc_wjspqkms;
	}

	public void setVc_wjspqkms(Object vc_wjspqkms) {
		this.vc_wjspqkms = vc_wjspqkms;
	}

	public Object getVc_sfczyjsp() {
		return vc_sfczyjsp;
	}

	public void setVc_sfczyjsp(Object vc_sfczyjsp) {
		this.vc_sfczyjsp = vc_sfczyjsp;
	}

	public Object getVc_yjspqkms() {
		return vc_yjspqkms;
	}

	public void setVc_yjspqkms(Object vc_yjspqkms) {
		this.vc_yjspqkms = vc_yjspqkms;
	}

	public Object getVc_sscsfjghbbmspty() {
		return vc_sscsfjghbbmspty;
	}

	public void setVc_sscsfjghbbmspty(Object vc_sscsfjghbbmspty) {
		this.vc_sscsfjghbbmspty = vc_sscsfjghbbmspty;
	}

	public Object getVc_wjpzsztrsscqkms() {
		return vc_wjpzsztrsscqkms;
	}

	public void setVc_wjpzsztrsscqkms(Object vc_wjpzsztrsscqkms) {
		this.vc_wjpzsztrsscqkms = vc_wjpzsztrsscqkms;
	}

	public Object getVc_sftghbbmxmjgys() {
		return vc_sftghbbmxmjgys;
	}

	public void setVc_sftghbbmxmjgys(Object vc_sftghbbmxmjgys) {
		this.vc_sftghbbmxmjgys = vc_sftghbbmxmjgys;
	}

	public Object getVc_wjyshtyyqssczjsfcgyn() {
		return vc_wjyshtyyqssczjsfcgyn;
	}

	public void setVc_wjyshtyyqssczjsfcgyn(Object vc_wjyshtyyqssczjsfcgyn) {
		this.vc_wjyshtyyqssczjsfcgyn = vc_wjyshtyyqssczjsfcgyn;
	}

	public Object getVc_qysyjsxmxzgmddssybg() {
		return vc_qysyjsxmxzgmddssybg;
	}

	public void setVc_qysyjsxmxzgmddssybg(Object vc_qysyjsxmxzgmddssybg) {
		this.vc_qysyjsxmxzgmddssybg = vc_qysyjsxmxzgmddssybg;
	}

	public Object getVc_bgqkms() {
		return vc_bgqkms;
	}

	public void setVc_bgqkms(Object vc_bgqkms) {
		this.vc_bgqkms = vc_bgqkms;
	}

	public Object getVc_sfyfqdpwxkz() {
		return vc_sfyfqdpwxkz;
	}

	public void setVc_sfyfqdpwxkz(Object vc_sfyfqdpwxkz) {
		this.vc_sfyfqdpwxkz = vc_sfyfqdpwxkz;
	}

	public Object getVc_azpwxkzdgdpfwrw() {
		return vc_azpwxkzdgdpfwrw;
	}

	public void setVc_azpwxkzdgdpfwrw(Object vc_azpwxkzdgdpfwrw) {
		this.vc_azpwxkzdgdpfwrw = vc_azpwxkzdgdpfwrw;
	}

	public Object getVc_wagdqkms() {
		return vc_wagdqkms;
	}

	public void setVc_wagdqkms(Object vc_wagdqkms) {
		this.vc_wagdqkms = vc_wagdqkms;
	}

	public Object getVc_sfjxpwsbdj() {
		return vc_sfjxpwsbdj;
	}

	public void setVc_sfjxpwsbdj(Object vc_sfjxpwsbdj) {
		this.vc_sfjxpwsbdj = vc_sfjxpwsbdj;
	}

	public Object getVc_sfjnpwf() {
		return vc_sfjnpwf;
	}

	public void setVc_sfjnpwf(Object vc_sfjnpwf) {
		this.vc_sfjnpwf = vc_sfjnpwf;
	}

	public Object getVc_synsjjnpwf() {
		return vc_synsjjnpwf;
	}

	public void setVc_synsjjnpwf(Object vc_synsjjnpwf) {
		this.vc_synsjjnpwf = vc_synsjjnpwf;
	}

	public Object getVc_yjpwf() {
		return vc_yjpwf;
	}

	public void setVc_yjpwf(Object vc_yjpwf) {
		this.vc_yjpwf = vc_yjpwf;
	}

	public Object getVc_wzejnpwfyy() {
		return vc_wzejnpwfyy;
	}

	public void setVc_wzejnpwfyy(Object vc_wzejnpwfyy) {
		this.vc_wzejnpwfyy = vc_wzejnpwfyy;
	}

	public Object getCl_gqyyzzpffqwryjpthbss() {
		return cl_gqyyzzpffqwryjpthbss;
	}

	public void setCl_gqyyzzpffqwryjpthbss(Object cl_gqyyzzpffqwryjpthbss) {
		this.cl_gqyyzzpffqwryjpthbss = cl_gqyyzzpffqwryjpthbss;
	}

	public Object getVc_hpbgjpfyqdfqzldccsjsssfls() {
		return vc_hpbgjpfyqdfqzldccsjsssfls;
	}

	public void setVc_hpbgjpfyqdfqzldccsjsssfls(Object vc_hpbgjpfyqdfqzldccsjsssfls) {
		this.vc_hpbgjpfyqdfqzldccsjsssfls = vc_hpbgjpfyqdfqzldccsjsssfls;
	}

	public Object getCl_wlsqkms() {
		return cl_wlsqkms;
	}

	public void setCl_wlsqkms(Object cl_wlsqkms) {
		this.cl_wlsqkms = cl_wlsqkms;
	}

	public Object getVc_fq_jlnjcsfcb() {
		return vc_fq_jlnjcsfcb;
	}

	public void setVc_fq_jlnjcsfcb(Object vc_fq_jlnjcsfcb) {
		this.vc_fq_jlnjcsfcb = vc_fq_jlnjcsfcb;
	}

	public Object getVc_fq_cbyzjjczw() {
		return vc_fq_cbyzjjczw;
	}

	public void setVc_fq_cbyzjjczw(Object vc_fq_cbyzjjczw) {
		this.vc_fq_cbyzjjczw = vc_fq_cbyzjjczw;
	}

	public Object getVc_fq_jcdw() {
		return vc_fq_jcdw;
	}

	public void setVc_fq_jcdw(Object vc_fq_jcdw) {
		this.vc_fq_jcdw = vc_fq_jcdw;
	}

	public String getDt_fqjc_time() {
		return dt_fqjc_time;
	}

	public void setDt_fqjc_time(String dt_fqjc_time) {
		this.dt_fqjc_time = dt_fqjc_time;
	}

	public Object getVc_fq_sfazzxjczz() {
		return vc_fq_sfazzxjczz;
	}

	public void setVc_fq_sfazzxjczz(Object vc_fq_sfazzxjczz) {
		this.vc_fq_sfazzxjczz = vc_fq_sfazzxjczz;
	}

	public String getDt_fqaz_time() {
		return dt_fqaz_time;
	}

	public void setDt_fqaz_time(String dt_fqaz_time) {
		this.dt_fqaz_time = dt_fqaz_time;
	}

	public Object getVc_fq_sfyhbbmlw() {
		return vc_fq_sfyhbbmlw;
	}

	public void setVc_fq_sfyhbbmlw(Object vc_fq_sfyhbbmlw) {
		this.vc_fq_sfyhbbmlw = vc_fq_sfyhbbmlw;
	}

	public Object getVc_fq_sfyyzc() {
		return vc_fq_sfyyzc;
	}

	public void setVc_fq_sfyyzc(Object vc_fq_sfyyzc) {
		this.vc_fq_sfyyzc = vc_fq_sfyyzc;
	}

	public Object getVc_fq_sfjgjy() {
		return vc_fq_sfjgjy;
	}

	public void setVc_fq_sfjgjy(Object vc_fq_sfjgjy) {
		this.vc_fq_sfjgjy = vc_fq_sfjgjy;
	}

	public String getDt_fqjy_time() {
		return dt_fqjy_time;
	}

	public void setDt_fqjy_time(String dt_fqjy_time) {
		this.dt_fqjy_time = dt_fqjy_time;
	}

	public Object getVc_fq_zxjcsj() {
		return vc_fq_zxjcsj;
	}

	public void setVc_fq_zxjcsj(Object vc_fq_zxjcsj) {
		this.vc_fq_zxjcsj = vc_fq_zxjcsj;
	}

	public Object getVc_fs_scfscshj() {
		return vc_fs_scfscshj;
	}

	public void setVc_fs_scfscshj(Object vc_fs_scfscshj) {
		this.vc_fs_scfscshj = vc_fs_scfscshj;
	}

	public Object getVc_fs_csl() {
		return vc_fs_csl;
	}

	public void setVc_fs_csl(Object vc_fs_csl) {
		this.vc_fs_csl = vc_fs_csl;
	}

	public Object getVc_fs_scfsclss() {
		return vc_fs_scfsclss;
	}

	public void setVc_fs_scfsclss(Object vc_fs_scfsclss) {
		this.vc_fs_scfsclss = vc_fs_scfsclss;
	}

	public Object getVc_fs_cll() {
		return vc_fs_cll;
	}

	public void setVc_fs_cll(Object vc_fs_cll) {
		this.vc_fs_cll = vc_fs_cll;
	}

	public Object getVc_fsclsffhhpjpfyq() {
		return vc_fsclsffhhpjpfyq;
	}

	public void setVc_fsclsffhhpjpfyq(Object vc_fsclsffhhpjpfyq) {
		this.vc_fsclsffhhpjpfyq = vc_fsclsffhhpjpfyq;
	}

	public Object getVc_fs_bfhqkms() {
		return vc_fs_bfhqkms;
	}

	public void setVc_fs_bfhqkms(Object vc_fs_bfhqkms) {
		this.vc_fs_bfhqkms = vc_fs_bfhqkms;
	}

	public Object getVc_fs_sfsxfsfl() {
		return vc_fs_sfsxfsfl;
	}

	public void setVc_fs_sfsxfsfl(Object vc_fs_sfsxfsfl) {
		this.vc_fs_sfsxfsfl = vc_fs_sfsxfsfl;
	}

	public Object getVc_fs_sfcztpfs() {
		return vc_fs_sfcztpfs;
	}

	public void setVc_fs_sfcztpfs(Object vc_fs_sfcztpfs) {
		this.vc_fs_sfcztpfs = vc_fs_sfcztpfs;
	}

	public Object getVc_fs_qksm() {
		return vc_fs_qksm;
	}

	public void setVc_fs_qksm(Object vc_fs_qksm) {
		this.vc_fs_qksm = vc_fs_qksm;
	}

	public Object getVc_fs_jlnjcsfcb() {
		return vc_fs_jlnjcsfcb;
	}

	public void setVc_fs_jlnjcsfcb(Object vc_fs_jlnjcsfcb) {
		this.vc_fs_jlnjcsfcb = vc_fs_jlnjcsfcb;
	}

	public Object getVc_fs_cbyzjjcz() {
		return vc_fs_cbyzjjcz;
	}

	public void setVc_fs_cbyzjjcz(Object vc_fs_cbyzjjcz) {
		this.vc_fs_cbyzjjcz = vc_fs_cbyzjjcz;
	}

	public Object getVc_fs_jcdw() {
		return vc_fs_jcdw;
	}

	public void setVc_fs_jcdw(Object vc_fs_jcdw) {
		this.vc_fs_jcdw = vc_fs_jcdw;
	}

	public String getDt_fs_jc_time() {
		return dt_fs_jc_time;
	}

	public void setDt_fs_jc_time(String dt_fs_jc_time) {
		this.dt_fs_jc_time = dt_fs_jc_time;
	}

	public Object getVc_fs_sfazzxjczz() {
		return vc_fs_sfazzxjczz;
	}

	public void setVc_fs_sfazzxjczz(Object vc_fs_sfazzxjczz) {
		this.vc_fs_sfazzxjczz = vc_fs_sfazzxjczz;
	}

	public String getDt_fs_az_time() {
		return dt_fs_az_time;
	}

	public void setDt_fs_az_time(String dt_fs_az_time) {
		this.dt_fs_az_time = dt_fs_az_time;
	}

	public Object getVc_fs_sfyhbbmlw() {
		return vc_fs_sfyhbbmlw;
	}

	public void setVc_fs_sfyhbbmlw(Object vc_fs_sfyhbbmlw) {
		this.vc_fs_sfyhbbmlw = vc_fs_sfyhbbmlw;
	}

	public Object getVc_fs_sfyxzc() {
		return vc_fs_sfyxzc;
	}

	public void setVc_fs_sfyxzc(Object vc_fs_sfyxzc) {
		this.vc_fs_sfyxzc = vc_fs_sfyxzc;
	}

	public Object getVc_fs_sfjgjy() {
		return vc_fs_sfjgjy;
	}

	public void setVc_fs_sfjgjy(Object vc_fs_sfjgjy) {
		this.vc_fs_sfjgjy = vc_fs_sfjgjy;
	}

	public String getDt_fs_jy_time() {
		return dt_fs_jy_time;
	}

	public void setDt_fs_jy_time(String dt_fs_jy_time) {
		this.dt_fs_jy_time = dt_fs_jy_time;
	}

	public Object getVc_fs_zxjcsjxs() {
		return vc_fs_zxjcsjxs;
	}

	public void setVc_fs_zxjcsjxs(Object vc_fs_zxjcsjxs) {
		this.vc_fs_zxjcsjxs = vc_fs_zxjcsjxs;
	}

	public Object getVc_mjyzcsl() {
		return vc_mjyzcsl;
	}

	public void setVc_mjyzcsl(Object vc_mjyzcsl) {
		this.vc_mjyzcsl = vc_mjyzcsl;
	}

	public Object getVc_mjyczcs() {
		return vc_mjyczcs;
	}

	public void setVc_mjyczcs(Object vc_mjyczcs) {
		this.vc_mjyczcs = vc_mjyczcs;
	}

	public Object getVc_fkwycsl() {
		return vc_fkwycsl;
	}

	public void setVc_fkwycsl(Object vc_fkwycsl) {
		this.vc_fkwycsl = vc_fkwycsl;
	}

	public Object getVc_fkwyczcs() {
		return vc_fkwyczcs;
	}

	public void setVc_fkwyczcs(Object vc_fkwyczcs) {
		this.vc_fkwyczcs = vc_fkwyczcs;
	}

	public Object getVc_qtwfzljcsl() {
		return vc_qtwfzljcsl;
	}

	public void setVc_qtwfzljcsl(Object vc_qtwfzljcsl) {
		this.vc_qtwfzljcsl = vc_qtwfzljcsl;
	}

	public Object getVc_qtwfclfs() {
		return vc_qtwfclfs;
	}

	public void setVc_qtwfclfs(Object vc_qtwfclfs) {
		this.vc_qtwfclfs = vc_qtwfclfs;
	}

	public Object getVc_wxfwtzsfjqgf() {
		return vc_wxfwtzsfjqgf;
	}

	public void setVc_wxfwtzsfjqgf(Object vc_wxfwtzsfjqgf) {
		this.vc_wxfwtzsfjqgf = vc_wxfwtzsfjqgf;
	}

	public Object getVc_sycsjczqksfxhbbmsb() {
		return vc_sycsjczqksfxhbbmsb;
	}

	public void setVc_sycsjczqksfxhbbmsb(Object vc_sycsjczqksfxhbbmsb) {
		this.vc_sycsjczqksfxhbbmsb = vc_sycsjczqksfxhbbmsb;
	}

	public Object getVc_wsbdynx() {
		return vc_wsbdynx;
	}

	public void setVc_wsbdynx(Object vc_wsbdynx) {
		this.vc_wsbdynx = vc_wsbdynx;
	}

	public Object getVc_sfzdlwxfwywsgffcshyjya() {
		return vc_sfzdlwxfwywsgffcshyjya;
	}

	public void setVc_sfzdlwxfwywsgffcshyjya(Object vc_sfzdlwxfwywsgffcshyjya) {
		this.vc_sfzdlwxfwywsgffcshyjya = vc_sfzdlwxfwywsgffcshyjya;
	}

	public Object getVc_wxfwcfkhcdsfsybs() {
		return vc_wxfwcfkhcdsfsybs;
	}

	public void setVc_wxfwcfkhcdsfsybs(Object vc_wxfwcfkhcdsfsybs) {
		this.vc_wxfwcfkhcdsfsybs = vc_wxfwcfkhcdsfsybs;
	}

	public Object getVc_sffhwxfwccgf() {
		return vc_sffhwxfwccgf;
	}

	public void setVc_sffhwxfwccgf(Object vc_sffhwxfwccgf) {
		this.vc_sffhwxfwccgf = vc_sffhwxfwccgf;
	}

	public Object getVc_sfczwxfwyybgfhd() {
		return vc_sfczwxfwyybgfhd;
	}

	public void setVc_sfczwxfwyybgfhd(Object vc_sfczwxfwyybgfhd) {
		this.vc_sfczwxfwyybgfhd = vc_sfczwxfwyybgfhd;
	}

	public Object getVc_zcnlscfdcsjsfcgyn() {
		return vc_zcnlscfdcsjsfcgyn;
	}

	public void setVc_zcnlscfdcsjsfcgyn(Object vc_zcnlscfdcsjsfcgyn) {
		this.vc_zcnlscfdcsjsfcgyn = vc_zcnlscfdcsjsfcgyn;
	}

	public Object getVc_zcwsfjsyyjxdczc() {
		return vc_zcwsfjsyyjxdczc;
	}

	public void setVc_zcwsfjsyyjxdczc(Object vc_zcwsfjsyyjxdczc) {
		this.vc_zcwsfjsyyjxdczc = vc_zcwsfjsyyjxdczc;
	}

	public Object getVc_rzyccsfzxwxfwzyldzd() {
		return vc_rzyccsfzxwxfwzyldzd;
	}

	public void setVc_rzyccsfzxwxfwzyldzd(Object vc_rzyccsfzxwxfwzyldzd) {
		this.vc_rzyccsfzxwxfwzyldzd = vc_rzyccsfzxwxfwzyldzd;
	}

	public Object getVc_ysclsfjyxgzz() {
		return vc_ysclsfjyxgzz;
	}

	public void setVc_ysclsfjyxgzz(Object vc_ysclsfjyxgzz) {
		this.vc_ysclsfjyxgzz = vc_ysclsfjyxgzz;
	}

	public Object getVc_ysl() {
		return vc_ysl;
	}

	public void setVc_ysl(Object vc_ysl) {
		this.vc_ysl = vc_ysl;
	}

	public Object getVc_pc() {
		return vc_pc;
	}

	public void setVc_pc(Object vc_pc) {
		this.vc_pc = vc_pc;
	}

	public Object getVc_jsdwsfjywfjyzz() {
		return vc_jsdwsfjywfjyzz;
	}

	public void setVc_jsdwsfjywfjyzz(Object vc_jsdwsfjywfjyzz) {
		this.vc_jsdwsfjywfjyzz = vc_jsdwsfjywfjyzz;
	}

	public Object getVc_sjczfs() {
		return vc_sjczfs;
	}

	public void setVc_sjczfs(Object vc_sjczfs) {
		this.vc_sjczfs = vc_sjczfs;
	}

	public Object getVc_gqyybgfdclfssffhhpjpfyq() {
		return vc_gqyybgfdclfssffhhpjpfyq;
	}

	public void setVc_gqyybgfdclfssffhhpjpfyq(Object vc_gqyybgfdclfssffhhpjpfyq) {
		this.vc_gqyybgfdclfssffhhpjpfyq = vc_gqyybgfdclfssffhhpjpfyq;
	}

	public Object getVc_bfhqkms() {
		return vc_bfhqkms;
	}

	public void setVc_bfhqkms(Object vc_bfhqkms) {
		this.vc_bfhqkms = vc_bfhqkms;
	}

	public Object getVc_gczsbsfahpjpfyqcqcs() {
		return vc_gczsbsfahpjpfyqcqcs;
	}

	public void setVc_gczsbsfahpjpfyqcqcs(Object vc_gczsbsfahpjpfyqcqcs) {
		this.vc_gczsbsfahpjpfyqcqcs = vc_gczsbsfahpjpfyqcqcs;
	}

	public Object getVc_wlsqkms() {
		return vc_wlsqkms;
	}

	public void setVc_wlsqkms(Object vc_wlsqkms) {
		this.vc_wlsqkms = vc_wlsqkms;
	}

	public Object getVc_hpyqdfhjl() {
		return vc_hpyqdfhjl;
	}

	public void setVc_hpyqdfhjl(Object vc_hpyqdfhjl) {
		this.vc_hpyqdfhjl = vc_hpyqdfhjl;
	}

	public Object getVc_jlnsfybhmb() {
		return vc_jlnsfybhmb;
	}

	public void setVc_jlnsfybhmb(Object vc_jlnsfybhmb) {
		this.vc_jlnsfybhmb = vc_jlnsfybhmb;
	}

	public String getDt_bhmbjssh() {
		return dt_bhmbjssh;
	}

	public void setDt_bhmbjssh(String dt_bhmbjssh) {
		this.dt_bhmbjssh = dt_bhmbjssh;
	}

	public Object getVc_zbhjbhqkms() {
		return vc_zbhjbhqkms;
	}

	public void setVc_zbhjbhqkms(Object vc_zbhjbhqkms) {
		this.vc_zbhjbhqkms = vc_zbhjbhqkms;
	}

	public Object getVc_sflshpjpfyqdfxffdccs() {
		return vc_sflshpjpfyqdfxffdccs;
	}

	public void setVc_sflshpjpfyqdfxffdccs(Object vc_sflshpjpfyqdfxffdccs) {
		this.vc_sflshpjpfyqdfxffdccs = vc_sflshpjpfyqdfxffdccs;
	}

	public Object getVc_fxcswlsqkms() {
		return vc_fxcswlsqkms;
	}

	public void setVc_fxcswlsqkms(Object vc_fxcswlsqkms) {
		this.vc_fxcswlsqkms = vc_fxcswlsqkms;
	}

	public Object getVc_sfbztfhjsjyjya() {
		return vc_sfbztfhjsjyjya;
	}

	public void setVc_sfbztfhjsjyjya(Object vc_sfbztfhjsjyjya) {
		this.vc_sfbztfhjsjyjya = vc_sfbztfhjsjyjya;
	}

	public Object getVc_sfdtfhjsjyjyajxpgba() {
		return vc_sfdtfhjsjyjyajxpgba;
	}

	public void setVc_sfdtfhjsjyjyajxpgba(Object vc_sfdtfhjsjyjyajxpgba) {
		this.vc_sfdtfhjsjyjyajxpgba = vc_sfdtfhjsjyjyajxpgba;
	}

	public Object getVc_sfayayqjxndyjyl() {
		return vc_sfayayqjxndyjyl;
	}

	public void setVc_sfayayqjxndyjyl(Object vc_sfayayqjxndyjyl) {
		this.vc_sfayayqjxndyjyl = vc_sfayayqjxndyjyl;
	}

	public Object getVc_sfcbyjwz() {
		return vc_sfcbyjwz;
	}

	public void setVc_sfcbyjwz(Object vc_sfcbyjwz) {
		this.vc_sfcbyjwz = vc_sfcbyjwz;
	}

	public Object getCl_qthbbmjcqk() {
		return cl_qthbbmjcqk;
	}

	public void setCl_qthbbmjcqk(Object cl_qthbbmjcqk) {
		this.cl_qthbbmjcqk = cl_qthbbmjcqk;
	}

	public Object getCl_czzywt() {
		return cl_czzywt;
	}

	public void setCl_czzywt(Object cl_czzywt) {
		this.cl_czzywt = cl_czzywt;
	}

	public Object getCl_jcyq() {
		return cl_jcyq;
	}

	public void setCl_jcyq(Object cl_jcyq) {
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

	public Object getDt_update_time() {
		return dt_update_time;
	}

	public void setDt_update_time(Object dt_update_time) {
		this.dt_update_time = dt_update_time;
	}

	public Object getVc_update_user() {
		return vc_update_user;
	}

	public void setVc_update_user(Object vc_update_user) {
		this.vc_update_user = vc_update_user;
	}

	public Object getVc_uodate_mechanism() {
		return vc_uodate_mechanism;
	}

	public void setVc_uodate_mechanism(Object vc_uodate_mechanism) {
		this.vc_uodate_mechanism = vc_uodate_mechanism;
	}

	public Object getVc_status() {
		return vc_status;
	}

	public void setVc_status(Object vc_status) {
		this.vc_status = vc_status;
	}

	public Object getInstanceid() {
		return instanceid;
	}

	public void setInstanceid(Object instanceid) {
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
		return "AmmoniaTemplateDbBean{" +
				"t_hcahyxcjc_record_id='" + t_hcahyxcjc_record_id + '\'' +
				", dt_start_time='" + dt_start_time + '\'' +
				", dt_end_time='" + dt_end_time + '\'' +
				", vc_location='" + vc_location + '\'' +
				", vc_jcr='" + vc_jcr + '\'' +
				", vc_jcr_id=" + vc_jcr_id +
				", vc_zfzh='" + vc_zfzh + '\'' +
				", vc_jlr='" + vc_jlr + '\'' +
				", vc_jlr_id=" + vc_jlr_id +
				", vc_bjcdwmc='" + vc_bjcdwmc + '\'' +
				", vc_bjcdwmc_id=" + vc_bjcdwmc_id +
				", vc_zzjgdmzh='" + vc_zzjgdmzh + '\'' +
				", vc_fddbr='" + vc_fddbr + '\'' +
				", vc_fddbrsfzh='" + vc_fddbrsfzh + '\'' +
				", vc_xcfzr=" + vc_xcfzr +
				", vc_xcfzrsfzh=" + vc_xcfzrsfzh +
				", nb_age=" + nb_age +
				", vc_gzdw=" + vc_gzdw +
				", vc_duty=" + vc_duty +
				", vc_ybagx=" + vc_ybagx +
				", vc_address=" + vc_address +
				", vc_telephone=" + vc_telephone +
				", vc_yzbm=" + vc_yzbm +
				", cl_qtcjrxmjgzdw=" + cl_qtcjrxmjgzdw +
				", vc_hbdwmc=" + vc_hbdwmc +
				", vc_hbdwlx=" + vc_hbdwlx +
				", vc_hjjclx='" + vc_hjjclx + '\'' +
				", vc_sfqrzj='" + vc_sfqrzj + '\'' +
				", vc_sfsqhb=" + vc_sfsqhb +
				", vc_city=" + vc_city +
				", vc_county=" + vc_county +
				", vc_town=" + vc_town +
				", vc_xzc=" + vc_xzc +
				", vc_gyyq=" + vc_gyyq +
				", vc_pq=" + vc_pq +
				", vc_xcjcsqk='" + vc_xcjcsqk + '\'' +
				", vc_zycphscgy=" + vc_zycphscgy +
				", vc_xmmc=" + vc_xmmc +
				", vc_hpbzdw=" + vc_hpbzdw +
				", dt_hpbz_time='" + dt_hpbz_time + '\'' +
				", vc_spdw=" + vc_spdw +
				", dt_sp_time='" + dt_sp_time + '\'' +
				", vc_spwh=" + vc_spwh +
				", vc_sscpfdw=" + vc_sscpfdw +
				", dt_sscpf_time='" + dt_sscpf_time + '\'' +
				", vc_sscpfwh=" + vc_sscpfwh +
				", vc_hbjgysdw=" + vc_hbjgysdw +
				", dt_hbjgys_time='" + dt_hbjgys_time + '\'' +
				", vc_hbjgyswh=" + vc_hbjgyswh +
				", vc_sfbzhpbgwj=" + vc_sfbzhpbgwj +
				", vc_wbzqkms=" + vc_wbzqkms +
				", vc_bzsfczjdhpdjdqk=" + vc_bzsfczjdhpdjdqk +
				", vc_jdhpdjqkms=" + vc_jdhpdjqkms +
				", vc_sfjghbbmsp=" + vc_sfjghbbmsp +
				", vc_wjspqkms=" + vc_wjspqkms +
				", vc_sfczyjsp=" + vc_sfczyjsp +
				", vc_yjspqkms=" + vc_yjspqkms +
				", vc_sscsfjghbbmspty=" + vc_sscsfjghbbmspty +
				", vc_wjpzsztrsscqkms=" + vc_wjpzsztrsscqkms +
				", vc_sftghbbmxmjgys=" + vc_sftghbbmxmjgys +
				", vc_wjyshtyyqssczjsfcgyn=" + vc_wjyshtyyqssczjsfcgyn +
				", vc_qysyjsxmxzgmddssybg=" + vc_qysyjsxmxzgmddssybg +
				", vc_bgqkms=" + vc_bgqkms +
				", vc_sfyfqdpwxkz=" + vc_sfyfqdpwxkz +
				", vc_azpwxkzdgdpfwrw=" + vc_azpwxkzdgdpfwrw +
				", vc_wagdqkms=" + vc_wagdqkms +
				", vc_sfjxpwsbdj=" + vc_sfjxpwsbdj +
				", vc_sfjnpwf=" + vc_sfjnpwf +
				", vc_synsjjnpwf=" + vc_synsjjnpwf +
				", vc_yjpwf=" + vc_yjpwf +
				", vc_wzejnpwfyy=" + vc_wzejnpwfyy +
				", cl_gqyyzzpffqwryjpthbss=" + cl_gqyyzzpffqwryjpthbss +
				", vc_hpbgjpfyqdfqzldccsjsssfls=" + vc_hpbgjpfyqdfqzldccsjsssfls +
				", cl_wlsqkms=" + cl_wlsqkms +
				", vc_fq_jlnjcsfcb=" + vc_fq_jlnjcsfcb +
				", vc_fq_cbyzjjczw=" + vc_fq_cbyzjjczw +
				", vc_fq_jcdw=" + vc_fq_jcdw +
				", dt_fqjc_time='" + dt_fqjc_time + '\'' +
				", vc_fq_sfazzxjczz=" + vc_fq_sfazzxjczz +
				", dt_fqaz_time='" + dt_fqaz_time + '\'' +
				", vc_fq_sfyhbbmlw=" + vc_fq_sfyhbbmlw +
				", vc_fq_sfyyzc=" + vc_fq_sfyyzc +
				", vc_fq_sfjgjy=" + vc_fq_sfjgjy +
				", dt_fqjy_time='" + dt_fqjy_time + '\'' +
				", vc_fq_zxjcsj=" + vc_fq_zxjcsj +
				", vc_fs_scfscshj=" + vc_fs_scfscshj +
				", vc_fs_csl=" + vc_fs_csl +
				", vc_fs_scfsclss=" + vc_fs_scfsclss +
				", vc_fs_cll=" + vc_fs_cll +
				", vc_fsclsffhhpjpfyq=" + vc_fsclsffhhpjpfyq +
				", vc_fs_bfhqkms=" + vc_fs_bfhqkms +
				", vc_fs_sfsxfsfl=" + vc_fs_sfsxfsfl +
				", vc_fs_sfcztpfs=" + vc_fs_sfcztpfs +
				", vc_fs_qksm=" + vc_fs_qksm +
				", vc_fs_jlnjcsfcb=" + vc_fs_jlnjcsfcb +
				", vc_fs_cbyzjjcz=" + vc_fs_cbyzjjcz +
				", vc_fs_jcdw=" + vc_fs_jcdw +
				", dt_fs_jc_time='" + dt_fs_jc_time + '\'' +
				", vc_fs_sfazzxjczz=" + vc_fs_sfazzxjczz +
				", dt_fs_az_time='" + dt_fs_az_time + '\'' +
				", vc_fs_sfyhbbmlw=" + vc_fs_sfyhbbmlw +
				", vc_fs_sfyxzc=" + vc_fs_sfyxzc +
				", vc_fs_sfjgjy=" + vc_fs_sfjgjy +
				", dt_fs_jy_time='" + dt_fs_jy_time + '\'' +
				", vc_fs_zxjcsjxs=" + vc_fs_zxjcsjxs +
				", vc_mjyzcsl=" + vc_mjyzcsl +
				", vc_mjyczcs=" + vc_mjyczcs +
				", vc_fkwycsl=" + vc_fkwycsl +
				", vc_fkwyczcs=" + vc_fkwyczcs +
				", vc_qtwfzljcsl=" + vc_qtwfzljcsl +
				", vc_qtwfclfs=" + vc_qtwfclfs +
				", vc_wxfwtzsfjqgf=" + vc_wxfwtzsfjqgf +
				", vc_sycsjczqksfxhbbmsb=" + vc_sycsjczqksfxhbbmsb +
				", vc_wsbdynx=" + vc_wsbdynx +
				", vc_sfzdlwxfwywsgffcshyjya=" + vc_sfzdlwxfwywsgffcshyjya +
				", vc_wxfwcfkhcdsfsybs=" + vc_wxfwcfkhcdsfsybs +
				", vc_sffhwxfwccgf=" + vc_sffhwxfwccgf +
				", vc_sfczwxfwyybgfhd=" + vc_sfczwxfwyybgfhd +
				", vc_zcnlscfdcsjsfcgyn=" + vc_zcnlscfdcsjsfcgyn +
				", vc_zcwsfjsyyjxdczc=" + vc_zcwsfjsyyjxdczc +
				", vc_rzyccsfzxwxfwzyldzd=" + vc_rzyccsfzxwxfwzyldzd +
				", vc_ysclsfjyxgzz=" + vc_ysclsfjyxgzz +
				", vc_ysl=" + vc_ysl +
				", vc_pc=" + vc_pc +
				", vc_jsdwsfjywfjyzz=" + vc_jsdwsfjywfjyzz +
				", vc_sjczfs=" + vc_sjczfs +
				", vc_gqyybgfdclfssffhhpjpfyq=" + vc_gqyybgfdclfssffhhpjpfyq +
				", vc_bfhqkms=" + vc_bfhqkms +
				", vc_gczsbsfahpjpfyqcqcs=" + vc_gczsbsfahpjpfyqcqcs +
				", vc_wlsqkms=" + vc_wlsqkms +
				", vc_hpyqdfhjl=" + vc_hpyqdfhjl +
				", vc_jlnsfybhmb=" + vc_jlnsfybhmb +
				", dt_bhmbjssh='" + dt_bhmbjssh + '\'' +
				", vc_zbhjbhqkms=" + vc_zbhjbhqkms +
				", vc_sflshpjpfyqdfxffdccs=" + vc_sflshpjpfyqdfxffdccs +
				", vc_fxcswlsqkms=" + vc_fxcswlsqkms +
				", vc_sfbztfhjsjyjya=" + vc_sfbztfhjsjyjya +
				", vc_sfdtfhjsjyjyajxpgba=" + vc_sfdtfhjsjyjyajxpgba +
				", vc_sfayayqjxndyjyl=" + vc_sfayayqjxndyjyl +
				", vc_sfcbyjwz=" + vc_sfcbyjwz +
				", cl_qthbbmjcqk=" + cl_qthbbmjcqk +
				", cl_czzywt=" + cl_czzywt +
				", cl_jcyq=" + cl_jcyq +
				", dt_create_time='" + dt_create_time + '\'' +
				", vc_create_user='" + vc_create_user + '\'' +
				", vc_create_mechanism='" + vc_create_mechanism + '\'' +
				", dt_update_time=" + dt_update_time +
				", vc_update_user=" + vc_update_user +
				", vc_uodate_mechanism=" + vc_uodate_mechanism +
				", vc_status=" + vc_status +
				", instanceid=" + instanceid +
				", del_status='" + del_status + '\'' +
				", t_task_list_id='" + t_task_list_id + '\'' +
				", rownum_=" + rownum_ +
				'}';
	}
}
