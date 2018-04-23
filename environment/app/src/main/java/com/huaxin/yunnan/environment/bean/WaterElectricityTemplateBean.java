package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * 8、水电行业环境监察记录页面bean
 * Created by zbw on 2017/10/26 14:49.
 */

public class WaterElectricityTemplateBean {

	@Override
	public String toString() {
		return "WaterElectricityTemplateBean{" +
				"msg='" + msg + '\'' +
				", success='" + success + '\'' +
				", data=" + data +
				'}';
	}

	/**
	 * data : [{"t_hydroelectricity_control_id":"402880ce5f4ce4f6015f4d9810c4038c","dt_begin_time":{"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117},"dt_end_time":{"date":28,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509120000000,"timezoneOffset":-480,"year":117},"vc_place":"测试3地点","vc_xaminer":"admin_1","vc_law_number":"124353453","vc_recorder":"超级管理员","vc_sinspected_unit":"胜多负少","vc_xaminer_id":null,"vc_recorder_id":null,"vc_sinspected_unit_id":null,"vc_code_number":"23456","vc_legal_representative":"测试3代表人","vc_legal_id":"32456768","vc_site_supervisor":null,"vc_site_id":"23456786","nb_age":null,"vc_work_unit":null,"vc_post":null,"vc_relationship":null,"vc_address":null,"vc_telephone":null,"vc_postal_code":null,"vc_other_people":null,"vc_unit_name":null,"ch_hbdwlx":null,"ch_supervision_type":null,"ch_sfqrzj":null,"ch_sfsqhb":null,"vc_szs":null,"vc_szx":null,"vc_szz":null,"vc_czjyinfo":null,"ch_czjych":null,"ch_hlddszx":null,"ch_hlddgz":null,"vc_sdzdj":null,"vc_sdzejdj":null,"vc_xyfdzts":null,"vc_dtzjrl":null,"vc_zzjrl":null,"ch_fdfs":null,"vc_qtfdfs":null,"vc_hpjzts":null,"vc_sbmc":null,"vc_sbxh":null,"vc_xmjsnrsfypfyz":null,"vc_xmjsnrsfypfyz_byzds":null,"dt_xmcssj":null,"dt_pzlxsj":null,"dt_pzlxdw":null,"dt_lxpfwh":null,"vc_hpsfbl":null,"vc_bzhpyxpjbg":null,"vc_hpbzdw":null,"ch_bzsj":null,"ch_sfsyttfw":null,"vc_hbsscspdw":null,"dt_hbsscspsj":null,"ch_hbsscspwh":null,"ch_hbjgyssj":null,"vc_zzysbm":null,"dt_sfjxjg":null,"vc_jgcs":null,"ch_newjgsj":null,"ch_pzlxbm":null,"vc_gkj_lxpfwh":null,"dt_gkj_hpsfbl":null,"vc_wpspdw":null,"ch_spsj":null,"vc_spdw":null,"dt_yssj":null,"vc_spwh":null,"ch_hbzgyssj":null,"vc_hbzg_zzysbm":null,"ch_sfsyzcttfw":null,"vc_sfsycyzcttfw":null,"ch_sfjnpwf":null,"vc_jfksyf":null,"vc_jfjsyf":null,"vc_gjpwf":null,"ch_yxqjsfagdjnpwf":null,"vc_jfksyfj":null,"vc_jfjsyfj":null,"vc_gjnpwfy":null,"vc_zxqthjflzddqk":null,"vc_sgqjxfsclgy":null,"vc_cll":null,"ch_sfyhpyz":null,"vc_byzds":null,"ch_hpjxfsclfs":null,"ch_sjjxfsclfs":null,"vc_jcsclssyxqk":null,"vc_hyfsclgy":null,"vc_cll2":null,"ch_sfyhpyz2":null,"vc_byzds2":null,"ch_hpjxfsclfs2":null,"ch_sjjxfsclfs2":null,"vc_jcsclssyxqk2":null,"ch_jcqj":null,"ch_fsjcsfcb":null,"vc_fsjcsfcb":null,"vc_jcdw":null,"dt_jcsj":null,"vc_sslfsclgy":null,"vc_cll3":null,"ch_sfyhpyz3":null,"vc_byzds3":null,"ch_hpjxfsclfs3":null,"ch_sjjxfsclfs3":null,"vc_jcsclssyxqk3":null,"vc_hntfsclgy":null,"vc_cll4":null,"ch_sfyhpyz4":null,"vc_byzds4":null,"ch_hpjxfsclfs4":null,"ch_sjjxfsclfs4":null,"vc_jcsclssyxqk4":null,"ch_jqjcsfcb":null,"vc_cbd":null,"vc_fsjcsfcb2":null,"vc_jcdw2":null,"dt_jcsj2":null,"vc_sgqshfsclgy":null,"vc_cll5":null,"ch_sfyhpyz5":null,"vc_byzds5":null,"ch_hpjxfsclfs5":null,"ch_sjjxfsclfs5":null,"vc_jcsclssyxqk5":null,"vc_yxqshfsclgy":null,"vc_cll6":null,"ch_sfyhpyz6":null,"vc_byzds6":null,"ch_hpjxfsclfs6":null,"ch_sjjxfsclfs6":null,"vc_jcsclssyxqk6":null,"ch_jqjcsfcb2":null,"vc_cbd2":null,"vc_fsjcsfcb3":null,"vc_jcdw3":null,"dt_jcsj3":null,"ch_hpsfjycqnjywflxt":null,"ch_sfjcywflxt":null,"ch_fyzclsffhhpjpfyq":null,"vc_bfhqkms":null,"ch_shljclsffhhpjpfyq":null,"vc_bfhqkms2":null,"ch_kwfqtsfyyqyz":null,"vc_byzdw":null,"ch_fyfwtzsfzq":null,"ch_sycsjczqksfsb":null,"vc_wsbdy":null,"ch_cfdsfybz":null,"ch_sffhwxfwccgf":null,"ch_cnsfdfcgyn":null,"ch_cwsfjyyjzc":null,"ch_zyccsfzxldzd":null,"ch_ysclsfjyzz":null,"vc_ysl":null,"vc_qc":null,"ch_jsdwsfjyzz":null,"vc_sjczfsw":null,"vc_byzds8":null,"ch_sgqsffcyhpyz":null,"vc_byzds9":null,"ch_hntjbccsssyhpyz":null,"vc_byzds10":null,"vc_ccssyxqk":null,"ch_jqjcdx":null,"ch_sfcb":null,"ch_sgqsfzsyhpyz3":null,"vc_jccbz":null,"ch_sgqzsfzcssfyz":null,"vc_cbd4":null,"vc_jcdw4":null,"dt_jcsj4":null,"vc_xmctslczgs":null,"ch_slddsfybg":null,"vc_bgms":null,"vc_hpjydbhcs":null,"vc_sjcqdbhcs":null,"vc_syhbhzlcs":null,"ch_sfyhpyz7":null,"vc_xmctslczgs2":null,"ch_slddsfybg2":null,"vc_bgms2":null,"vc_hpjydbhcs2":null,"vc_sjcqdbhcs2":null,"vc_cyhbhzlcs":null,"vc_bgqkms":null,"ch_sfyhpyz8":null,"vc_xmqzzgs":null,"ch_slddsfybg1":null,"ch_qzspsfyhpyz":null,"vc_zcbhcs":null,"vc_qtxcqdbhcs":null,"vc_sjcqdstbhcs":null,"ch_dssdwbhcssfyhpyz":null,"vc_byzds11":null,"ch_dlsdwbhcssfyhpyz":null,"vc_byzds13":null,"ch_dzwbhcssfyhpyz":null,"vc_byzds14":null,"ch_hpsfyqfs":null,"vc_tshdglc":null,"vc_hpxstll":null,"vc_sxstll":null,"ch_sffhhpyq":null,"ch_sfyqanyq":null,"vc_jcyyxqk":null,"ch_sflscs":null,"vc_wlsqkms":null,"ch_sfbztfya":null,"ch_sfdyapg":null,"ch_sfjxndyl":null,"ch_sfcbwz":null,"cl_qthbbmjcqk":null,"cl_czzywt":null,"cl_jcyq":null,"dt_create_time":{"date":24,"day":2,"hours":16,"minutes":54,"month":9,"nanos":0,"seconds":36,"time":1508835276000,"timezoneOffset":-480,"year":117},"vc_create_user":"admin","vc_create_mechanism":"402848bd4830fed70148312e0efb0631","dt_update_time":null,"vc_update_user":null,"vc_uodate_mechanism":null,"vc_status":null,"instanceid":null,"del_status":"0","t_task_list_id":"402880ce5f4bfed5015f4c23b0f70136","rownum_":1}]
	 * msg :
	 * success : 1
	 */

	private String msg;
	private String success;
	private List<DataBean> data;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<DataBean> getData() {
		return data;
	}

	public void setData(List<DataBean> data) {
		this.data = data;
	}

	public static class DataBean {
		@Override
		public String toString() {
			return "DataBean{" +
					"t_hydroelectricity_control_id='" + t_hydroelectricity_control_id + '\'' +
					", dt_begin_time=" + dt_begin_time +
					", dt_end_time=" + dt_end_time +
					", vc_place='" + vc_place + '\'' +
					", vc_xaminer='" + vc_xaminer + '\'' +
					", vc_law_number='" + vc_law_number + '\'' +
					", vc_recorder='" + vc_recorder + '\'' +
					", vc_sinspected_unit='" + vc_sinspected_unit + '\'' +
					", vc_xaminer_id=" + vc_xaminer_id +
					", vc_recorder_id=" + vc_recorder_id +
					", vc_sinspected_unit_id=" + vc_sinspected_unit_id +
					", vc_code_number='" + vc_code_number + '\'' +
					", vc_legal_representative='" + vc_legal_representative + '\'' +
					", vc_legal_id='" + vc_legal_id + '\'' +
					", vc_site_supervisor=" + vc_site_supervisor +
					", vc_site_id='" + vc_site_id + '\'' +
					", nb_age=" + nb_age +
					", vc_work_unit=" + vc_work_unit +
					", vc_post=" + vc_post +
					", vc_relationship=" + vc_relationship +
					", vc_address=" + vc_address +
					", vc_telephone=" + vc_telephone +
					", vc_postal_code=" + vc_postal_code +
					", vc_other_people=" + vc_other_people +
					", vc_unit_name=" + vc_unit_name +
					", ch_hbdwlx=" + ch_hbdwlx +
					", ch_supervision_type=" + ch_supervision_type +
					", ch_sfqrzj=" + ch_sfqrzj +
					", ch_sfsqhb=" + ch_sfsqhb +
					", vc_szs=" + vc_szs +
					", vc_szx=" + vc_szx +
					", vc_szz=" + vc_szz +
					", vc_czjyinfo=" + vc_czjyinfo +
					", ch_czjych=" + ch_czjych +
					", ch_hlddszx=" + ch_hlddszx +
					", ch_hlddgz=" + ch_hlddgz +
					", vc_sdzdj=" + vc_sdzdj +
					", vc_sdzejdj=" + vc_sdzejdj +
					", vc_xyfdzts=" + vc_xyfdzts +
					", vc_dtzjrl=" + vc_dtzjrl +
					", vc_zzjrl=" + vc_zzjrl +
					", ch_fdfs=" + ch_fdfs +
					", vc_qtfdfs=" + vc_qtfdfs +
					", vc_hpjzts=" + vc_hpjzts +
					", vc_sbmc=" + vc_sbmc +
					", vc_sbxh=" + vc_sbxh +
					", vc_xmjsnrsfypfyz=" + vc_xmjsnrsfypfyz +
					", vc_xmjsnrsfypfyz_byzds=" + vc_xmjsnrsfypfyz_byzds +
					", dt_xmcssj=" + dt_xmcssj +
					", dt_pzlxsj=" + dt_pzlxsj +
					", dt_pzlxdw=" + dt_pzlxdw +
					", dt_lxpfwh=" + dt_lxpfwh +
					", vc_hpsfbl=" + vc_hpsfbl +
					", vc_bzhpyxpjbg=" + vc_bzhpyxpjbg +
					", vc_hpbzdw=" + vc_hpbzdw +
					", ch_bzsj=" + ch_bzsj +
					", ch_sfsyttfw=" + ch_sfsyttfw +
					", vc_hbsscspdw=" + vc_hbsscspdw +
					", dt_hbsscspsj=" + dt_hbsscspsj +
					", ch_hbsscspwh=" + ch_hbsscspwh +
					", ch_hbjgyssj=" + ch_hbjgyssj +
					", vc_zzysbm=" + vc_zzysbm +
					", dt_sfjxjg=" + dt_sfjxjg +
					", vc_jgcs=" + vc_jgcs +
					", ch_newjgsj=" + ch_newjgsj +
					", ch_pzlxbm=" + ch_pzlxbm +
					", vc_gkj_lxpfwh=" + vc_gkj_lxpfwh +
					", dt_gkj_hpsfbl=" + dt_gkj_hpsfbl +
					", vc_wpspdw=" + vc_wpspdw +
					", ch_spsj=" + ch_spsj +
					", vc_spdw=" + vc_spdw +
					", dt_yssj=" + dt_yssj +
					", vc_spwh=" + vc_spwh +
					", ch_hbzgyssj=" + ch_hbzgyssj +
					", vc_hbzg_zzysbm=" + vc_hbzg_zzysbm +
					", ch_sfsyzcttfw=" + ch_sfsyzcttfw +
					", vc_sfsycyzcttfw=" + vc_sfsycyzcttfw +
					", ch_sfjnpwf=" + ch_sfjnpwf +
					", vc_jfksyf=" + vc_jfksyf +
					", vc_jfjsyf=" + vc_jfjsyf +
					", vc_gjpwf=" + vc_gjpwf +
					", ch_yxqjsfagdjnpwf=" + ch_yxqjsfagdjnpwf +
					", vc_jfksyfj=" + vc_jfksyfj +
					", vc_jfjsyfj=" + vc_jfjsyfj +
					", vc_gjnpwfy=" + vc_gjnpwfy +
					", vc_zxqthjflzddqk=" + vc_zxqthjflzddqk +
					", vc_sgqjxfsclgy=" + vc_sgqjxfsclgy +
					", vc_cll=" + vc_cll +
					", ch_sfyhpyz=" + ch_sfyhpyz +
					", vc_byzds=" + vc_byzds +
					", ch_hpjxfsclfs=" + ch_hpjxfsclfs +
					", ch_sjjxfsclfs=" + ch_sjjxfsclfs +
					", vc_jcsclssyxqk=" + vc_jcsclssyxqk +
					", vc_hyfsclgy=" + vc_hyfsclgy +
					", vc_cll2=" + vc_cll2 +
					", ch_sfyhpyz2=" + ch_sfyhpyz2 +
					", vc_byzds2=" + vc_byzds2 +
					", ch_hpjxfsclfs2=" + ch_hpjxfsclfs2 +
					", ch_sjjxfsclfs2=" + ch_sjjxfsclfs2 +
					", vc_jcsclssyxqk2=" + vc_jcsclssyxqk2 +
					", ch_jcqj=" + ch_jcqj +
					", ch_fsjcsfcb=" + ch_fsjcsfcb +
					", vc_fsjcsfcb=" + vc_fsjcsfcb +
					", vc_jcdw=" + vc_jcdw +
					", dt_jcsj=" + dt_jcsj +
					", vc_sslfsclgy=" + vc_sslfsclgy +
					", vc_cll3=" + vc_cll3 +
					", ch_sfyhpyz3=" + ch_sfyhpyz3 +
					", vc_byzds3=" + vc_byzds3 +
					", ch_hpjxfsclfs3=" + ch_hpjxfsclfs3 +
					", ch_sjjxfsclfs3=" + ch_sjjxfsclfs3 +
					", vc_jcsclssyxqk3=" + vc_jcsclssyxqk3 +
					", vc_hntfsclgy=" + vc_hntfsclgy +
					", vc_cll4=" + vc_cll4 +
					", ch_sfyhpyz4=" + ch_sfyhpyz4 +
					", vc_byzds4=" + vc_byzds4 +
					", ch_hpjxfsclfs4=" + ch_hpjxfsclfs4 +
					", ch_sjjxfsclfs4=" + ch_sjjxfsclfs4 +
					", vc_jcsclssyxqk4=" + vc_jcsclssyxqk4 +
					", ch_jqjcsfcb=" + ch_jqjcsfcb +
					", vc_cbd=" + vc_cbd +
					", vc_fsjcsfcb2=" + vc_fsjcsfcb2 +
					", vc_jcdw2=" + vc_jcdw2 +
					", dt_jcsj2=" + dt_jcsj2 +
					", vc_sgqshfsclgy=" + vc_sgqshfsclgy +
					", vc_cll5=" + vc_cll5 +
					", ch_sfyhpyz5=" + ch_sfyhpyz5 +
					", vc_byzds5=" + vc_byzds5 +
					", ch_hpjxfsclfs5=" + ch_hpjxfsclfs5 +
					", ch_sjjxfsclfs5=" + ch_sjjxfsclfs5 +
					", vc_jcsclssyxqk5=" + vc_jcsclssyxqk5 +
					", vc_yxqshfsclgy=" + vc_yxqshfsclgy +
					", vc_cll6=" + vc_cll6 +
					", ch_sfyhpyz6=" + ch_sfyhpyz6 +
					", vc_byzds6=" + vc_byzds6 +
					", ch_hpjxfsclfs6=" + ch_hpjxfsclfs6 +
					", ch_sjjxfsclfs6=" + ch_sjjxfsclfs6 +
					", vc_jcsclssyxqk6=" + vc_jcsclssyxqk6 +
					", ch_jqjcsfcb2=" + ch_jqjcsfcb2 +
					", vc_cbd2=" + vc_cbd2 +
					", vc_fsjcsfcb3=" + vc_fsjcsfcb3 +
					", vc_jcdw3=" + vc_jcdw3 +
					", dt_jcsj3=" + dt_jcsj3 +
					", ch_hpsfjycqnjywflxt=" + ch_hpsfjycqnjywflxt +
					", ch_sfjcywflxt=" + ch_sfjcywflxt +
					", ch_fyzclsffhhpjpfyq=" + ch_fyzclsffhhpjpfyq +
					", vc_bfhqkms=" + vc_bfhqkms +
					", ch_shljclsffhhpjpfyq=" + ch_shljclsffhhpjpfyq +
					", vc_bfhqkms2=" + vc_bfhqkms2 +
					", ch_kwfqtsfyyqyz=" + ch_kwfqtsfyyqyz +
					", vc_byzdw=" + vc_byzdw +
					", ch_fyfwtzsfzq=" + ch_fyfwtzsfzq +
					", ch_sycsjczqksfsb=" + ch_sycsjczqksfsb +
					", vc_wsbdy=" + vc_wsbdy +
					", ch_cfdsfybz=" + ch_cfdsfybz +
					", ch_sffhwxfwccgf=" + ch_sffhwxfwccgf +
					", ch_cnsfdfcgyn=" + ch_cnsfdfcgyn +
					", ch_cwsfjyyjzc=" + ch_cwsfjyyjzc +
					", ch_zyccsfzxldzd=" + ch_zyccsfzxldzd +
					", ch_ysclsfjyzz=" + ch_ysclsfjyzz +
					", vc_ysl=" + vc_ysl +
					", vc_qc=" + vc_qc +
					", ch_jsdwsfjyzz=" + ch_jsdwsfjyzz +
					", vc_sjczfsw=" + vc_sjczfsw +
					", vc_byzds8=" + vc_byzds8 +
					", ch_sgqsffcyhpyz=" + ch_sgqsffcyhpyz +
					", vc_byzds9=" + vc_byzds9 +
					", ch_hntjbccsssyhpyz=" + ch_hntjbccsssyhpyz +
					", vc_byzds10=" + vc_byzds10 +
					", vc_ccssyxqk=" + vc_ccssyxqk +
					", ch_jqjcdx=" + ch_jqjcdx +
					", ch_sfcb=" + ch_sfcb +
					", ch_sgqsfzsyhpyz3=" + ch_sgqsfzsyhpyz3 +
					", vc_jccbz=" + vc_jccbz +
					", ch_sgqzsfzcssfyz=" + ch_sgqzsfzcssfyz +
					", vc_cbd4=" + vc_cbd4 +
					", vc_jcdw4=" + vc_jcdw4 +
					", dt_jcsj4=" + dt_jcsj4 +
					", vc_xmctslczgs=" + vc_xmctslczgs +
					", ch_slddsfybg=" + ch_slddsfybg +
					", vc_bgms=" + vc_bgms +
					", vc_hpjydbhcs=" + vc_hpjydbhcs +
					", vc_sjcqdbhcs=" + vc_sjcqdbhcs +
					", vc_syhbhzlcs=" + vc_syhbhzlcs +
					", ch_sfyhpyz7=" + ch_sfyhpyz7 +
					", vc_xmctslczgs2=" + vc_xmctslczgs2 +
					", ch_slddsfybg2=" + ch_slddsfybg2 +
					", vc_bgms2=" + vc_bgms2 +
					", vc_hpjydbhcs2=" + vc_hpjydbhcs2 +
					", vc_sjcqdbhcs2=" + vc_sjcqdbhcs2 +
					", vc_cyhbhzlcs=" + vc_cyhbhzlcs +
					", vc_bgqkms=" + vc_bgqkms +
					", ch_sfyhpyz8=" + ch_sfyhpyz8 +
					", vc_xmqzzgs=" + vc_xmqzzgs +
					", ch_slddsfybg1=" + ch_slddsfybg1 +
					", ch_qzspsfyhpyz=" + ch_qzspsfyhpyz +
					", vc_zcbhcs=" + vc_zcbhcs +
					", vc_qtxcqdbhcs=" + vc_qtxcqdbhcs +
					", vc_sjcqdstbhcs=" + vc_sjcqdstbhcs +
					", ch_dssdwbhcssfyhpyz=" + ch_dssdwbhcssfyhpyz +
					", vc_byzds11=" + vc_byzds11 +
					", ch_dlsdwbhcssfyhpyz=" + ch_dlsdwbhcssfyhpyz +
					", vc_byzds13=" + vc_byzds13 +
					", ch_dzwbhcssfyhpyz=" + ch_dzwbhcssfyhpyz +
					", vc_byzds14=" + vc_byzds14 +
					", ch_hpsfyqfs=" + ch_hpsfyqfs +
					", vc_tshdglc=" + vc_tshdglc +
					", vc_hpxstll=" + vc_hpxstll +
					", vc_sxstll=" + vc_sxstll +
					", ch_sffhhpyq=" + ch_sffhhpyq +
					", ch_sfyqanyq=" + ch_sfyqanyq +
					", vc_jcyyxqk=" + vc_jcyyxqk +
					", ch_sflscs=" + ch_sflscs +
					", vc_wlsqkms=" + vc_wlsqkms +
					", ch_sfbztfya=" + ch_sfbztfya +
					", ch_sfdyapg=" + ch_sfdyapg +
					", ch_sfjxndyl=" + ch_sfjxndyl +
					", ch_sfcbwz=" + ch_sfcbwz +
					", cl_qthbbmjcqk=" + cl_qthbbmjcqk +
					", cl_czzywt=" + cl_czzywt +
					", cl_jcyq=" + cl_jcyq +
					", dt_create_time=" + dt_create_time +
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

		/**
		 * t_hydroelectricity_control_id : 402880ce5f4ce4f6015f4d9810c4038c
		 * dt_begin_time : {"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117}
		 * dt_end_time : {"date":28,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509120000000,"timezoneOffset":-480,"year":117}
		 * vc_place : 测试3地点
		 * vc_xaminer : admin_1
		 * vc_law_number : 124353453
		 * vc_recorder : 超级管理员
		 * vc_sinspected_unit : 胜多负少
		 * vc_xaminer_id : null
		 * vc_recorder_id : null
		 * vc_sinspected_unit_id : null
		 * vc_code_number : 23456
		 * vc_legal_representative : 测试3代表人
		 * vc_legal_id : 32456768
		 * vc_site_supervisor : null
		 * vc_site_id : 23456786
		 * nb_age : null
		 * vc_work_unit : null
		 * vc_post : null
		 * vc_relationship : null
		 * vc_address : null
		 * vc_telephone : null
		 * vc_postal_code : null
		 * vc_other_people : null
		 * vc_unit_name : null
		 * ch_hbdwlx : null
		 * ch_supervision_type : null
		 * ch_sfqrzj : null
		 * ch_sfsqhb : null
		 * vc_szs : null
		 * vc_szx : null
		 * vc_szz : null
		 * vc_czjyinfo : null
		 * ch_czjych : null
		 * ch_hlddszx : null
		 * ch_hlddgz : null
		 * vc_sdzdj : null
		 * vc_sdzejdj : null
		 * vc_xyfdzts : null
		 * vc_dtzjrl : null
		 * vc_zzjrl : null
		 * ch_fdfs : null
		 * vc_qtfdfs : null
		 * vc_hpjzts : null
		 * vc_sbmc : null
		 * vc_sbxh : null
		 * vc_xmjsnrsfypfyz : null
		 * vc_xmjsnrsfypfyz_byzds : null
		 * dt_xmcssj : null
		 * dt_pzlxsj : null
		 * dt_pzlxdw : null
		 * dt_lxpfwh : null
		 * vc_hpsfbl : null
		 * vc_bzhpyxpjbg : null
		 * vc_hpbzdw : null
		 * ch_bzsj : null
		 * ch_sfsyttfw : null
		 * vc_hbsscspdw : null
		 * dt_hbsscspsj : null
		 * ch_hbsscspwh : null
		 * ch_hbjgyssj : null
		 * vc_zzysbm : null
		 * dt_sfjxjg : null
		 * vc_jgcs : null
		 * ch_newjgsj : null
		 * ch_pzlxbm : null
		 * vc_gkj_lxpfwh : null
		 * dt_gkj_hpsfbl : null
		 * vc_wpspdw : null
		 * ch_spsj : null
		 * vc_spdw : null
		 * dt_yssj : null
		 * vc_spwh : null
		 * ch_hbzgyssj : null
		 * vc_hbzg_zzysbm : null
		 * ch_sfsyzcttfw : null
		 * vc_sfsycyzcttfw : null
		 * ch_sfjnpwf : null
		 * vc_jfksyf : null
		 * vc_jfjsyf : null
		 * vc_gjpwf : null
		 * ch_yxqjsfagdjnpwf : null
		 * vc_jfksyfj : null
		 * vc_jfjsyfj : null
		 * vc_gjnpwfy : null
		 * vc_zxqthjflzddqk : null
		 * vc_sgqjxfsclgy : null
		 * vc_cll : null
		 * ch_sfyhpyz : null
		 * vc_byzds : null
		 * ch_hpjxfsclfs : null
		 * ch_sjjxfsclfs : null
		 * vc_jcsclssyxqk : null
		 * vc_hyfsclgy : null
		 * vc_cll2 : null
		 * ch_sfyhpyz2 : null
		 * vc_byzds2 : null
		 * ch_hpjxfsclfs2 : null
		 * ch_sjjxfsclfs2 : null
		 * vc_jcsclssyxqk2 : null
		 * ch_jcqj : null
		 * ch_fsjcsfcb : null
		 * vc_fsjcsfcb : null
		 * vc_jcdw : null
		 * dt_jcsj : null
		 * vc_sslfsclgy : null
		 * vc_cll3 : null
		 * ch_sfyhpyz3 : null
		 * vc_byzds3 : null
		 * ch_hpjxfsclfs3 : null
		 * ch_sjjxfsclfs3 : null
		 * vc_jcsclssyxqk3 : null
		 * vc_hntfsclgy : null
		 * vc_cll4 : null
		 * ch_sfyhpyz4 : null
		 * vc_byzds4 : null
		 * ch_hpjxfsclfs4 : null
		 * ch_sjjxfsclfs4 : null
		 * vc_jcsclssyxqk4 : null
		 * ch_jqjcsfcb : null
		 * vc_cbd : null
		 * vc_fsjcsfcb2 : null
		 * vc_jcdw2 : null
		 * dt_jcsj2 : null
		 * vc_sgqshfsclgy : null
		 * vc_cll5 : null
		 * ch_sfyhpyz5 : null
		 * vc_byzds5 : null
		 * ch_hpjxfsclfs5 : null
		 * ch_sjjxfsclfs5 : null
		 * vc_jcsclssyxqk5 : null
		 * vc_yxqshfsclgy : null
		 * vc_cll6 : null
		 * ch_sfyhpyz6 : null
		 * vc_byzds6 : null
		 * ch_hpjxfsclfs6 : null
		 * ch_sjjxfsclfs6 : null
		 * vc_jcsclssyxqk6 : null
		 * ch_jqjcsfcb2 : null
		 * vc_cbd2 : null
		 * vc_fsjcsfcb3 : null
		 * vc_jcdw3 : null
		 * dt_jcsj3 : null
		 * ch_hpsfjycqnjywflxt : null
		 * ch_sfjcywflxt : null
		 * ch_fyzclsffhhpjpfyq : null
		 * vc_bfhqkms : null
		 * ch_shljclsffhhpjpfyq : null
		 * vc_bfhqkms2 : null
		 * ch_kwfqtsfyyqyz : null
		 * vc_byzdw : null
		 * ch_fyfwtzsfzq : null
		 * ch_sycsjczqksfsb : null
		 * vc_wsbdy : null
		 * ch_cfdsfybz : null
		 * ch_sffhwxfwccgf : null
		 * ch_cnsfdfcgyn : null
		 * ch_cwsfjyyjzc : null
		 * ch_zyccsfzxldzd : null
		 * ch_ysclsfjyzz : null
		 * vc_ysl : null
		 * vc_qc : null
		 * ch_jsdwsfjyzz : null
		 * vc_sjczfsw : null
		 * vc_byzds8 : null
		 * ch_sgqsffcyhpyz : null
		 * vc_byzds9 : null
		 * ch_hntjbccsssyhpyz : null
		 * vc_byzds10 : null
		 * vc_ccssyxqk : null
		 * ch_jqjcdx : null
		 * ch_sfcb : null
		 * ch_sgqsfzsyhpyz3 : null
		 * vc_jccbz : null
		 * ch_sgqzsfzcssfyz : null
		 * vc_cbd4 : null
		 * vc_jcdw4 : null
		 * dt_jcsj4 : null
		 * vc_xmctslczgs : null
		 * ch_slddsfybg : null
		 * vc_bgms : null
		 * vc_hpjydbhcs : null
		 * vc_sjcqdbhcs : null
		 * vc_syhbhzlcs : null
		 * ch_sfyhpyz7 : null
		 * vc_xmctslczgs2 : null
		 * ch_slddsfybg2 : null
		 * vc_bgms2 : null
		 * vc_hpjydbhcs2 : null
		 * vc_sjcqdbhcs2 : null
		 * vc_cyhbhzlcs : null
		 * vc_bgqkms : null
		 * ch_sfyhpyz8 : null
		 * vc_xmqzzgs : null
		 * ch_slddsfybg1 : null
		 * ch_qzspsfyhpyz : null
		 * vc_zcbhcs : null
		 * vc_qtxcqdbhcs : null
		 * vc_sjcqdstbhcs : null
		 * ch_dssdwbhcssfyhpyz : null
		 * vc_byzds11 : null
		 * ch_dlsdwbhcssfyhpyz : null
		 * vc_byzds13 : null
		 * ch_dzwbhcssfyhpyz : null
		 * vc_byzds14 : null
		 * ch_hpsfyqfs : null
		 * vc_tshdglc : null
		 * vc_hpxstll : null
		 * vc_sxstll : null
		 * ch_sffhhpyq : null
		 * ch_sfyqanyq : null
		 * vc_jcyyxqk : null
		 * ch_sflscs : null
		 * vc_wlsqkms : null
		 * ch_sfbztfya : null
		 * ch_sfdyapg : null
		 * ch_sfjxndyl : null
		 * ch_sfcbwz : null
		 * cl_qthbbmjcqk : null
		 * cl_czzywt : null
		 * cl_jcyq : null
		 * dt_create_time : {"date":24,"day":2,"hours":16,"minutes":54,"month":9,"nanos":0,"seconds":36,"time":1508835276000,"timezoneOffset":-480,"year":117}
		 * vc_create_user : admin
		 * vc_create_mechanism : 402848bd4830fed70148312e0efb0631
		 * dt_update_time : null
		 * vc_update_user : null
		 * vc_uodate_mechanism : null
		 * vc_status : null
		 * instanceid : null
		 * del_status : 0
		 * t_task_list_id : 402880ce5f4bfed5015f4c23b0f70136
		 * rownum_ : 1
		 */

		private String t_hydroelectricity_control_id;
		private DtBeginTimeBean dt_begin_time;
		private DtEndTimeBean dt_end_time;
		private String vc_place;
		private String vc_xaminer;
		private String vc_law_number;
		private String vc_recorder;
		private String vc_sinspected_unit;
		private Object vc_xaminer_id;
		private Object vc_recorder_id;
		private Object vc_sinspected_unit_id;
		private String vc_code_number;
		private String vc_legal_representative;
		private String vc_legal_id;
		private Object vc_site_supervisor;
		private String vc_site_id;
		private Object nb_age;
		private Object vc_work_unit;
		private Object vc_post;
		private Object vc_relationship;
		private Object vc_address;
		private Object vc_telephone;
		private Object vc_postal_code;
		private Object vc_other_people;
		private Object vc_unit_name;
		private Object ch_hbdwlx;
		private Object ch_supervision_type;
		private Object ch_sfqrzj;
		private Object ch_sfsqhb;
		private Object vc_szs;
		private Object vc_szx;
		private Object vc_szz;
		private Object vc_czjyinfo;
		private Object ch_czjych;
		private Object ch_hlddszx;
		private Object ch_hlddgz;
		private Object vc_sdzdj;
		private Object vc_sdzejdj;
		private Object vc_xyfdzts;
		private Object vc_dtzjrl;
		private Object vc_zzjrl;
		private Object ch_fdfs;
		private Object vc_qtfdfs;
		private Object vc_hpjzts;
		private Object vc_sbmc;
		private Object vc_sbxh;
		private Object vc_xmjsnrsfypfyz;
		private Object vc_xmjsnrsfypfyz_byzds;
		private Object dt_xmcssj;
		private Object dt_pzlxsj;
		private Object dt_pzlxdw;
		private Object dt_lxpfwh;
		private Object vc_hpsfbl;
		private Object vc_bzhpyxpjbg;
		private Object vc_hpbzdw;
		private Object ch_bzsj;
		private Object ch_sfsyttfw;
		private Object vc_hbsscspdw;
		private Object dt_hbsscspsj;
		private Object ch_hbsscspwh;
		private Object ch_hbjgyssj;
		private Object vc_zzysbm;
		private Object dt_sfjxjg;
		private Object vc_jgcs;
		private Object ch_newjgsj;
		private Object ch_pzlxbm;
		private Object vc_gkj_lxpfwh;
		private Object dt_gkj_hpsfbl;
		private Object vc_wpspdw;
		private Object ch_spsj;
		private Object vc_spdw;
		private Object dt_yssj;
		private Object vc_spwh;
		private Object ch_hbzgyssj;
		private Object vc_hbzg_zzysbm;
		private Object ch_sfsyzcttfw;
		private Object vc_sfsycyzcttfw;
		private Object ch_sfjnpwf;
		private Object vc_jfksyf;
		private Object vc_jfjsyf;
		private Object vc_gjpwf;
		private Object ch_yxqjsfagdjnpwf;
		private Object vc_jfksyfj;
		private Object vc_jfjsyfj;
		private Object vc_gjnpwfy;
		private Object vc_zxqthjflzddqk;
		private Object vc_sgqjxfsclgy;
		private Object vc_cll;
		private Object ch_sfyhpyz;
		private Object vc_byzds;
		private Object ch_hpjxfsclfs;
		private Object ch_sjjxfsclfs;
		private Object vc_jcsclssyxqk;
		private Object vc_hyfsclgy;
		private Object vc_cll2;
		private Object ch_sfyhpyz2;
		private Object vc_byzds2;
		private Object ch_hpjxfsclfs2;
		private Object ch_sjjxfsclfs2;
		private Object vc_jcsclssyxqk2;
		private Object ch_jcqj;
		private Object ch_fsjcsfcb;
		private Object vc_fsjcsfcb;
		private Object vc_jcdw;
		private Object dt_jcsj;
		private Object vc_sslfsclgy;
		private Object vc_cll3;
		private Object ch_sfyhpyz3;
		private Object vc_byzds3;
		private Object ch_hpjxfsclfs3;
		private Object ch_sjjxfsclfs3;
		private Object vc_jcsclssyxqk3;
		private Object vc_hntfsclgy;
		private Object vc_cll4;
		private Object ch_sfyhpyz4;
		private Object vc_byzds4;
		private Object ch_hpjxfsclfs4;
		private Object ch_sjjxfsclfs4;
		private Object vc_jcsclssyxqk4;
		private Object ch_jqjcsfcb;
		private Object vc_cbd;
		private Object vc_fsjcsfcb2;
		private Object vc_jcdw2;
		private Object dt_jcsj2;
		private Object vc_sgqshfsclgy;
		private Object vc_cll5;
		private Object ch_sfyhpyz5;
		private Object vc_byzds5;
		private Object ch_hpjxfsclfs5;
		private Object ch_sjjxfsclfs5;
		private Object vc_jcsclssyxqk5;
		private Object vc_yxqshfsclgy;
		private Object vc_cll6;
		private Object ch_sfyhpyz6;
		private Object vc_byzds6;
		private Object ch_hpjxfsclfs6;
		private Object ch_sjjxfsclfs6;
		private Object vc_jcsclssyxqk6;
		private Object ch_jqjcsfcb2;
		private Object vc_cbd2;
		private Object vc_fsjcsfcb3;
		private Object vc_jcdw3;
		private Object dt_jcsj3;
		private Object ch_hpsfjycqnjywflxt;
		private Object ch_sfjcywflxt;
		private Object ch_fyzclsffhhpjpfyq;
		private Object vc_bfhqkms;
		private Object ch_shljclsffhhpjpfyq;
		private Object vc_bfhqkms2;
		private Object ch_kwfqtsfyyqyz;
		private Object vc_byzdw;
		private Object ch_fyfwtzsfzq;
		private Object ch_sycsjczqksfsb;
		private Object vc_wsbdy;
		private Object ch_cfdsfybz;
		private Object ch_sffhwxfwccgf;
		private Object ch_cnsfdfcgyn;
		private Object ch_cwsfjyyjzc;
		private Object ch_zyccsfzxldzd;
		private Object ch_ysclsfjyzz;
		private Object vc_ysl;
		private Object vc_qc;
		private Object ch_jsdwsfjyzz;
		private Object vc_sjczfsw;
		private Object vc_byzds8;
		private Object ch_sgqsffcyhpyz;
		private Object vc_byzds9;
		private Object ch_hntjbccsssyhpyz;
		private Object vc_byzds10;
		private Object vc_ccssyxqk;
		private Object ch_jqjcdx;
		private Object ch_sfcb;
		private Object ch_sgqsfzsyhpyz3;
		private Object vc_jccbz;
		private Object ch_sgqzsfzcssfyz;
		private Object vc_cbd4;
		private Object vc_jcdw4;
		private Object dt_jcsj4;
		private Object vc_xmctslczgs;
		private Object ch_slddsfybg;
		private Object vc_bgms;
		private Object vc_hpjydbhcs;
		private Object vc_sjcqdbhcs;
		private Object vc_syhbhzlcs;
		private Object ch_sfyhpyz7;
		private Object vc_xmctslczgs2;
		private Object ch_slddsfybg2;
		private Object vc_bgms2;
		private Object vc_hpjydbhcs2;
		private Object vc_sjcqdbhcs2;
		private Object vc_cyhbhzlcs;
		private Object vc_bgqkms;
		private Object ch_sfyhpyz8;
		private Object vc_xmqzzgs;
		private Object ch_slddsfybg1;
		private Object ch_qzspsfyhpyz;
		private Object vc_zcbhcs;
		private Object vc_qtxcqdbhcs;
		private Object vc_sjcqdstbhcs;
		private Object ch_dssdwbhcssfyhpyz;
		private Object vc_byzds11;
		private Object ch_dlsdwbhcssfyhpyz;
		private Object vc_byzds13;
		private Object ch_dzwbhcssfyhpyz;
		private Object vc_byzds14;
		private Object ch_hpsfyqfs;
		private Object vc_tshdglc;
		private Object vc_hpxstll;
		private Object vc_sxstll;
		private Object ch_sffhhpyq;
		private Object ch_sfyqanyq;
		private Object vc_jcyyxqk;
		private Object ch_sflscs;
		private Object vc_wlsqkms;
		private Object ch_sfbztfya;
		private Object ch_sfdyapg;
		private Object ch_sfjxndyl;
		private Object ch_sfcbwz;
		private Object cl_qthbbmjcqk;
		private Object cl_czzywt;
		private Object cl_jcyq;
		private DtCreateTimeBean dt_create_time;
		private String vc_create_user;
		private String vc_create_mechanism;
		private Object dt_update_time;
		private Object vc_update_user;
		private Object vc_uodate_mechanism;
		private Object vc_status;
		private Object instanceid;
		private String del_status;
		private String t_task_list_id;
		private int rownum_;

		public String getT_hydroelectricity_control_id() {
			return t_hydroelectricity_control_id;
		}

		public void setT_hydroelectricity_control_id(String t_hydroelectricity_control_id) {
			this.t_hydroelectricity_control_id = t_hydroelectricity_control_id;
		}

		public DtBeginTimeBean getDt_begin_time() {
			return dt_begin_time;
		}

		public void setDt_begin_time(DtBeginTimeBean dt_begin_time) {
			this.dt_begin_time = dt_begin_time;
		}

		public DtEndTimeBean getDt_end_time() {
			return dt_end_time;
		}

		public void setDt_end_time(DtEndTimeBean dt_end_time) {
			this.dt_end_time = dt_end_time;
		}

		public String getVc_place() {
			return vc_place;
		}

		public void setVc_place(String vc_place) {
			this.vc_place = vc_place;
		}

		public String getVc_xaminer() {
			return vc_xaminer;
		}

		public void setVc_xaminer(String vc_xaminer) {
			this.vc_xaminer = vc_xaminer;
		}

		public String getVc_law_number() {
			return vc_law_number;
		}

		public void setVc_law_number(String vc_law_number) {
			this.vc_law_number = vc_law_number;
		}

		public String getVc_recorder() {
			return vc_recorder;
		}

		public void setVc_recorder(String vc_recorder) {
			this.vc_recorder = vc_recorder;
		}

		public String getVc_sinspected_unit() {
			return vc_sinspected_unit;
		}

		public void setVc_sinspected_unit(String vc_sinspected_unit) {
			this.vc_sinspected_unit = vc_sinspected_unit;
		}

		public Object getVc_xaminer_id() {
			return vc_xaminer_id;
		}

		public void setVc_xaminer_id(Object vc_xaminer_id) {
			this.vc_xaminer_id = vc_xaminer_id;
		}

		public Object getVc_recorder_id() {
			return vc_recorder_id;
		}

		public void setVc_recorder_id(Object vc_recorder_id) {
			this.vc_recorder_id = vc_recorder_id;
		}

		public Object getVc_sinspected_unit_id() {
			return vc_sinspected_unit_id;
		}

		public void setVc_sinspected_unit_id(Object vc_sinspected_unit_id) {
			this.vc_sinspected_unit_id = vc_sinspected_unit_id;
		}

		public String getVc_code_number() {
			return vc_code_number;
		}

		public void setVc_code_number(String vc_code_number) {
			this.vc_code_number = vc_code_number;
		}

		public String getVc_legal_representative() {
			return vc_legal_representative;
		}

		public void setVc_legal_representative(String vc_legal_representative) {
			this.vc_legal_representative = vc_legal_representative;
		}

		public String getVc_legal_id() {
			return vc_legal_id;
		}

		public void setVc_legal_id(String vc_legal_id) {
			this.vc_legal_id = vc_legal_id;
		}

		public Object getVc_site_supervisor() {
			return vc_site_supervisor;
		}

		public void setVc_site_supervisor(Object vc_site_supervisor) {
			this.vc_site_supervisor = vc_site_supervisor;
		}

		public String getVc_site_id() {
			return vc_site_id;
		}

		public void setVc_site_id(String vc_site_id) {
			this.vc_site_id = vc_site_id;
		}

		public Object getNb_age() {
			return nb_age;
		}

		public void setNb_age(Object nb_age) {
			this.nb_age = nb_age;
		}

		public Object getVc_work_unit() {
			return vc_work_unit;
		}

		public void setVc_work_unit(Object vc_work_unit) {
			this.vc_work_unit = vc_work_unit;
		}

		public Object getVc_post() {
			return vc_post;
		}

		public void setVc_post(Object vc_post) {
			this.vc_post = vc_post;
		}

		public Object getVc_relationship() {
			return vc_relationship;
		}

		public void setVc_relationship(Object vc_relationship) {
			this.vc_relationship = vc_relationship;
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

		public Object getVc_postal_code() {
			return vc_postal_code;
		}

		public void setVc_postal_code(Object vc_postal_code) {
			this.vc_postal_code = vc_postal_code;
		}

		public Object getVc_other_people() {
			return vc_other_people;
		}

		public void setVc_other_people(Object vc_other_people) {
			this.vc_other_people = vc_other_people;
		}

		public Object getVc_unit_name() {
			return vc_unit_name;
		}

		public void setVc_unit_name(Object vc_unit_name) {
			this.vc_unit_name = vc_unit_name;
		}

		public Object getCh_hbdwlx() {
			return ch_hbdwlx;
		}

		public void setCh_hbdwlx(Object ch_hbdwlx) {
			this.ch_hbdwlx = ch_hbdwlx;
		}

		public Object getCh_supervision_type() {
			return ch_supervision_type;
		}

		public void setCh_supervision_type(Object ch_supervision_type) {
			this.ch_supervision_type = ch_supervision_type;
		}

		public Object getCh_sfqrzj() {
			return ch_sfqrzj;
		}

		public void setCh_sfqrzj(Object ch_sfqrzj) {
			this.ch_sfqrzj = ch_sfqrzj;
		}

		public Object getCh_sfsqhb() {
			return ch_sfsqhb;
		}

		public void setCh_sfsqhb(Object ch_sfsqhb) {
			this.ch_sfsqhb = ch_sfsqhb;
		}

		public Object getVc_szs() {
			return vc_szs;
		}

		public void setVc_szs(Object vc_szs) {
			this.vc_szs = vc_szs;
		}

		public Object getVc_szx() {
			return vc_szx;
		}

		public void setVc_szx(Object vc_szx) {
			this.vc_szx = vc_szx;
		}

		public Object getVc_szz() {
			return vc_szz;
		}

		public void setVc_szz(Object vc_szz) {
			this.vc_szz = vc_szz;
		}

		public Object getVc_czjyinfo() {
			return vc_czjyinfo;
		}

		public void setVc_czjyinfo(Object vc_czjyinfo) {
			this.vc_czjyinfo = vc_czjyinfo;
		}

		public Object getCh_czjych() {
			return ch_czjych;
		}

		public void setCh_czjych(Object ch_czjych) {
			this.ch_czjych = ch_czjych;
		}

		public Object getCh_hlddszx() {
			return ch_hlddszx;
		}

		public void setCh_hlddszx(Object ch_hlddszx) {
			this.ch_hlddszx = ch_hlddszx;
		}

		public Object getCh_hlddgz() {
			return ch_hlddgz;
		}

		public void setCh_hlddgz(Object ch_hlddgz) {
			this.ch_hlddgz = ch_hlddgz;
		}

		public Object getVc_sdzdj() {
			return vc_sdzdj;
		}

		public void setVc_sdzdj(Object vc_sdzdj) {
			this.vc_sdzdj = vc_sdzdj;
		}

		public Object getVc_sdzejdj() {
			return vc_sdzejdj;
		}

		public void setVc_sdzejdj(Object vc_sdzejdj) {
			this.vc_sdzejdj = vc_sdzejdj;
		}

		public Object getVc_xyfdzts() {
			return vc_xyfdzts;
		}

		public void setVc_xyfdzts(Object vc_xyfdzts) {
			this.vc_xyfdzts = vc_xyfdzts;
		}

		public Object getVc_dtzjrl() {
			return vc_dtzjrl;
		}

		public void setVc_dtzjrl(Object vc_dtzjrl) {
			this.vc_dtzjrl = vc_dtzjrl;
		}

		public Object getVc_zzjrl() {
			return vc_zzjrl;
		}

		public void setVc_zzjrl(Object vc_zzjrl) {
			this.vc_zzjrl = vc_zzjrl;
		}

		public Object getCh_fdfs() {
			return ch_fdfs;
		}

		public void setCh_fdfs(Object ch_fdfs) {
			this.ch_fdfs = ch_fdfs;
		}

		public Object getVc_qtfdfs() {
			return vc_qtfdfs;
		}

		public void setVc_qtfdfs(Object vc_qtfdfs) {
			this.vc_qtfdfs = vc_qtfdfs;
		}

		public Object getVc_hpjzts() {
			return vc_hpjzts;
		}

		public void setVc_hpjzts(Object vc_hpjzts) {
			this.vc_hpjzts = vc_hpjzts;
		}

		public Object getVc_sbmc() {
			return vc_sbmc;
		}

		public void setVc_sbmc(Object vc_sbmc) {
			this.vc_sbmc = vc_sbmc;
		}

		public Object getVc_sbxh() {
			return vc_sbxh;
		}

		public void setVc_sbxh(Object vc_sbxh) {
			this.vc_sbxh = vc_sbxh;
		}

		public Object getVc_xmjsnrsfypfyz() {
			return vc_xmjsnrsfypfyz;
		}

		public void setVc_xmjsnrsfypfyz(Object vc_xmjsnrsfypfyz) {
			this.vc_xmjsnrsfypfyz = vc_xmjsnrsfypfyz;
		}

		public Object getVc_xmjsnrsfypfyz_byzds() {
			return vc_xmjsnrsfypfyz_byzds;
		}

		public void setVc_xmjsnrsfypfyz_byzds(Object vc_xmjsnrsfypfyz_byzds) {
			this.vc_xmjsnrsfypfyz_byzds = vc_xmjsnrsfypfyz_byzds;
		}

		public Object getDt_xmcssj() {
			return dt_xmcssj;
		}

		public void setDt_xmcssj(Object dt_xmcssj) {
			this.dt_xmcssj = dt_xmcssj;
		}

		public Object getDt_pzlxsj() {
			return dt_pzlxsj;
		}

		public void setDt_pzlxsj(Object dt_pzlxsj) {
			this.dt_pzlxsj = dt_pzlxsj;
		}

		public Object getDt_pzlxdw() {
			return dt_pzlxdw;
		}

		public void setDt_pzlxdw(Object dt_pzlxdw) {
			this.dt_pzlxdw = dt_pzlxdw;
		}

		public Object getDt_lxpfwh() {
			return dt_lxpfwh;
		}

		public void setDt_lxpfwh(Object dt_lxpfwh) {
			this.dt_lxpfwh = dt_lxpfwh;
		}

		public Object getVc_hpsfbl() {
			return vc_hpsfbl;
		}

		public void setVc_hpsfbl(Object vc_hpsfbl) {
			this.vc_hpsfbl = vc_hpsfbl;
		}

		public Object getVc_bzhpyxpjbg() {
			return vc_bzhpyxpjbg;
		}

		public void setVc_bzhpyxpjbg(Object vc_bzhpyxpjbg) {
			this.vc_bzhpyxpjbg = vc_bzhpyxpjbg;
		}

		public Object getVc_hpbzdw() {
			return vc_hpbzdw;
		}

		public void setVc_hpbzdw(Object vc_hpbzdw) {
			this.vc_hpbzdw = vc_hpbzdw;
		}

		public Object getCh_bzsj() {
			return ch_bzsj;
		}

		public void setCh_bzsj(Object ch_bzsj) {
			this.ch_bzsj = ch_bzsj;
		}

		public Object getCh_sfsyttfw() {
			return ch_sfsyttfw;
		}

		public void setCh_sfsyttfw(Object ch_sfsyttfw) {
			this.ch_sfsyttfw = ch_sfsyttfw;
		}

		public Object getVc_hbsscspdw() {
			return vc_hbsscspdw;
		}

		public void setVc_hbsscspdw(Object vc_hbsscspdw) {
			this.vc_hbsscspdw = vc_hbsscspdw;
		}

		public Object getDt_hbsscspsj() {
			return dt_hbsscspsj;
		}

		public void setDt_hbsscspsj(Object dt_hbsscspsj) {
			this.dt_hbsscspsj = dt_hbsscspsj;
		}

		public Object getCh_hbsscspwh() {
			return ch_hbsscspwh;
		}

		public void setCh_hbsscspwh(Object ch_hbsscspwh) {
			this.ch_hbsscspwh = ch_hbsscspwh;
		}

		public Object getCh_hbjgyssj() {
			return ch_hbjgyssj;
		}

		public void setCh_hbjgyssj(Object ch_hbjgyssj) {
			this.ch_hbjgyssj = ch_hbjgyssj;
		}

		public Object getVc_zzysbm() {
			return vc_zzysbm;
		}

		public void setVc_zzysbm(Object vc_zzysbm) {
			this.vc_zzysbm = vc_zzysbm;
		}

		public Object getDt_sfjxjg() {
			return dt_sfjxjg;
		}

		public void setDt_sfjxjg(Object dt_sfjxjg) {
			this.dt_sfjxjg = dt_sfjxjg;
		}

		public Object getVc_jgcs() {
			return vc_jgcs;
		}

		public void setVc_jgcs(Object vc_jgcs) {
			this.vc_jgcs = vc_jgcs;
		}

		public Object getCh_newjgsj() {
			return ch_newjgsj;
		}

		public void setCh_newjgsj(Object ch_newjgsj) {
			this.ch_newjgsj = ch_newjgsj;
		}

		public Object getCh_pzlxbm() {
			return ch_pzlxbm;
		}

		public void setCh_pzlxbm(Object ch_pzlxbm) {
			this.ch_pzlxbm = ch_pzlxbm;
		}

		public Object getVc_gkj_lxpfwh() {
			return vc_gkj_lxpfwh;
		}

		public void setVc_gkj_lxpfwh(Object vc_gkj_lxpfwh) {
			this.vc_gkj_lxpfwh = vc_gkj_lxpfwh;
		}

		public Object getDt_gkj_hpsfbl() {
			return dt_gkj_hpsfbl;
		}

		public void setDt_gkj_hpsfbl(Object dt_gkj_hpsfbl) {
			this.dt_gkj_hpsfbl = dt_gkj_hpsfbl;
		}

		public Object getVc_wpspdw() {
			return vc_wpspdw;
		}

		public void setVc_wpspdw(Object vc_wpspdw) {
			this.vc_wpspdw = vc_wpspdw;
		}

		public Object getCh_spsj() {
			return ch_spsj;
		}

		public void setCh_spsj(Object ch_spsj) {
			this.ch_spsj = ch_spsj;
		}

		public Object getVc_spdw() {
			return vc_spdw;
		}

		public void setVc_spdw(Object vc_spdw) {
			this.vc_spdw = vc_spdw;
		}

		public Object getDt_yssj() {
			return dt_yssj;
		}

		public void setDt_yssj(Object dt_yssj) {
			this.dt_yssj = dt_yssj;
		}

		public Object getVc_spwh() {
			return vc_spwh;
		}

		public void setVc_spwh(Object vc_spwh) {
			this.vc_spwh = vc_spwh;
		}

		public Object getCh_hbzgyssj() {
			return ch_hbzgyssj;
		}

		public void setCh_hbzgyssj(Object ch_hbzgyssj) {
			this.ch_hbzgyssj = ch_hbzgyssj;
		}

		public Object getVc_hbzg_zzysbm() {
			return vc_hbzg_zzysbm;
		}

		public void setVc_hbzg_zzysbm(Object vc_hbzg_zzysbm) {
			this.vc_hbzg_zzysbm = vc_hbzg_zzysbm;
		}

		public Object getCh_sfsyzcttfw() {
			return ch_sfsyzcttfw;
		}

		public void setCh_sfsyzcttfw(Object ch_sfsyzcttfw) {
			this.ch_sfsyzcttfw = ch_sfsyzcttfw;
		}

		public Object getVc_sfsycyzcttfw() {
			return vc_sfsycyzcttfw;
		}

		public void setVc_sfsycyzcttfw(Object vc_sfsycyzcttfw) {
			this.vc_sfsycyzcttfw = vc_sfsycyzcttfw;
		}

		public Object getCh_sfjnpwf() {
			return ch_sfjnpwf;
		}

		public void setCh_sfjnpwf(Object ch_sfjnpwf) {
			this.ch_sfjnpwf = ch_sfjnpwf;
		}

		public Object getVc_jfksyf() {
			return vc_jfksyf;
		}

		public void setVc_jfksyf(Object vc_jfksyf) {
			this.vc_jfksyf = vc_jfksyf;
		}

		public Object getVc_jfjsyf() {
			return vc_jfjsyf;
		}

		public void setVc_jfjsyf(Object vc_jfjsyf) {
			this.vc_jfjsyf = vc_jfjsyf;
		}

		public Object getVc_gjpwf() {
			return vc_gjpwf;
		}

		public void setVc_gjpwf(Object vc_gjpwf) {
			this.vc_gjpwf = vc_gjpwf;
		}

		public Object getCh_yxqjsfagdjnpwf() {
			return ch_yxqjsfagdjnpwf;
		}

		public void setCh_yxqjsfagdjnpwf(Object ch_yxqjsfagdjnpwf) {
			this.ch_yxqjsfagdjnpwf = ch_yxqjsfagdjnpwf;
		}

		public Object getVc_jfksyfj() {
			return vc_jfksyfj;
		}

		public void setVc_jfksyfj(Object vc_jfksyfj) {
			this.vc_jfksyfj = vc_jfksyfj;
		}

		public Object getVc_jfjsyfj() {
			return vc_jfjsyfj;
		}

		public void setVc_jfjsyfj(Object vc_jfjsyfj) {
			this.vc_jfjsyfj = vc_jfjsyfj;
		}

		public Object getVc_gjnpwfy() {
			return vc_gjnpwfy;
		}

		public void setVc_gjnpwfy(Object vc_gjnpwfy) {
			this.vc_gjnpwfy = vc_gjnpwfy;
		}

		public Object getVc_zxqthjflzddqk() {
			return vc_zxqthjflzddqk;
		}

		public void setVc_zxqthjflzddqk(Object vc_zxqthjflzddqk) {
			this.vc_zxqthjflzddqk = vc_zxqthjflzddqk;
		}

		public Object getVc_sgqjxfsclgy() {
			return vc_sgqjxfsclgy;
		}

		public void setVc_sgqjxfsclgy(Object vc_sgqjxfsclgy) {
			this.vc_sgqjxfsclgy = vc_sgqjxfsclgy;
		}

		public Object getVc_cll() {
			return vc_cll;
		}

		public void setVc_cll(Object vc_cll) {
			this.vc_cll = vc_cll;
		}

		public Object getCh_sfyhpyz() {
			return ch_sfyhpyz;
		}

		public void setCh_sfyhpyz(Object ch_sfyhpyz) {
			this.ch_sfyhpyz = ch_sfyhpyz;
		}

		public Object getVc_byzds() {
			return vc_byzds;
		}

		public void setVc_byzds(Object vc_byzds) {
			this.vc_byzds = vc_byzds;
		}

		public Object getCh_hpjxfsclfs() {
			return ch_hpjxfsclfs;
		}

		public void setCh_hpjxfsclfs(Object ch_hpjxfsclfs) {
			this.ch_hpjxfsclfs = ch_hpjxfsclfs;
		}

		public Object getCh_sjjxfsclfs() {
			return ch_sjjxfsclfs;
		}

		public void setCh_sjjxfsclfs(Object ch_sjjxfsclfs) {
			this.ch_sjjxfsclfs = ch_sjjxfsclfs;
		}

		public Object getVc_jcsclssyxqk() {
			return vc_jcsclssyxqk;
		}

		public void setVc_jcsclssyxqk(Object vc_jcsclssyxqk) {
			this.vc_jcsclssyxqk = vc_jcsclssyxqk;
		}

		public Object getVc_hyfsclgy() {
			return vc_hyfsclgy;
		}

		public void setVc_hyfsclgy(Object vc_hyfsclgy) {
			this.vc_hyfsclgy = vc_hyfsclgy;
		}

		public Object getVc_cll2() {
			return vc_cll2;
		}

		public void setVc_cll2(Object vc_cll2) {
			this.vc_cll2 = vc_cll2;
		}

		public Object getCh_sfyhpyz2() {
			return ch_sfyhpyz2;
		}

		public void setCh_sfyhpyz2(Object ch_sfyhpyz2) {
			this.ch_sfyhpyz2 = ch_sfyhpyz2;
		}

		public Object getVc_byzds2() {
			return vc_byzds2;
		}

		public void setVc_byzds2(Object vc_byzds2) {
			this.vc_byzds2 = vc_byzds2;
		}

		public Object getCh_hpjxfsclfs2() {
			return ch_hpjxfsclfs2;
		}

		public void setCh_hpjxfsclfs2(Object ch_hpjxfsclfs2) {
			this.ch_hpjxfsclfs2 = ch_hpjxfsclfs2;
		}

		public Object getCh_sjjxfsclfs2() {
			return ch_sjjxfsclfs2;
		}

		public void setCh_sjjxfsclfs2(Object ch_sjjxfsclfs2) {
			this.ch_sjjxfsclfs2 = ch_sjjxfsclfs2;
		}

		public Object getVc_jcsclssyxqk2() {
			return vc_jcsclssyxqk2;
		}

		public void setVc_jcsclssyxqk2(Object vc_jcsclssyxqk2) {
			this.vc_jcsclssyxqk2 = vc_jcsclssyxqk2;
		}

		public Object getCh_jcqj() {
			return ch_jcqj;
		}

		public void setCh_jcqj(Object ch_jcqj) {
			this.ch_jcqj = ch_jcqj;
		}

		public Object getCh_fsjcsfcb() {
			return ch_fsjcsfcb;
		}

		public void setCh_fsjcsfcb(Object ch_fsjcsfcb) {
			this.ch_fsjcsfcb = ch_fsjcsfcb;
		}

		public Object getVc_fsjcsfcb() {
			return vc_fsjcsfcb;
		}

		public void setVc_fsjcsfcb(Object vc_fsjcsfcb) {
			this.vc_fsjcsfcb = vc_fsjcsfcb;
		}

		public Object getVc_jcdw() {
			return vc_jcdw;
		}

		public void setVc_jcdw(Object vc_jcdw) {
			this.vc_jcdw = vc_jcdw;
		}

		public Object getDt_jcsj() {
			return dt_jcsj;
		}

		public void setDt_jcsj(Object dt_jcsj) {
			this.dt_jcsj = dt_jcsj;
		}

		public Object getVc_sslfsclgy() {
			return vc_sslfsclgy;
		}

		public void setVc_sslfsclgy(Object vc_sslfsclgy) {
			this.vc_sslfsclgy = vc_sslfsclgy;
		}

		public Object getVc_cll3() {
			return vc_cll3;
		}

		public void setVc_cll3(Object vc_cll3) {
			this.vc_cll3 = vc_cll3;
		}

		public Object getCh_sfyhpyz3() {
			return ch_sfyhpyz3;
		}

		public void setCh_sfyhpyz3(Object ch_sfyhpyz3) {
			this.ch_sfyhpyz3 = ch_sfyhpyz3;
		}

		public Object getVc_byzds3() {
			return vc_byzds3;
		}

		public void setVc_byzds3(Object vc_byzds3) {
			this.vc_byzds3 = vc_byzds3;
		}

		public Object getCh_hpjxfsclfs3() {
			return ch_hpjxfsclfs3;
		}

		public void setCh_hpjxfsclfs3(Object ch_hpjxfsclfs3) {
			this.ch_hpjxfsclfs3 = ch_hpjxfsclfs3;
		}

		public Object getCh_sjjxfsclfs3() {
			return ch_sjjxfsclfs3;
		}

		public void setCh_sjjxfsclfs3(Object ch_sjjxfsclfs3) {
			this.ch_sjjxfsclfs3 = ch_sjjxfsclfs3;
		}

		public Object getVc_jcsclssyxqk3() {
			return vc_jcsclssyxqk3;
		}

		public void setVc_jcsclssyxqk3(Object vc_jcsclssyxqk3) {
			this.vc_jcsclssyxqk3 = vc_jcsclssyxqk3;
		}

		public Object getVc_hntfsclgy() {
			return vc_hntfsclgy;
		}

		public void setVc_hntfsclgy(Object vc_hntfsclgy) {
			this.vc_hntfsclgy = vc_hntfsclgy;
		}

		public Object getVc_cll4() {
			return vc_cll4;
		}

		public void setVc_cll4(Object vc_cll4) {
			this.vc_cll4 = vc_cll4;
		}

		public Object getCh_sfyhpyz4() {
			return ch_sfyhpyz4;
		}

		public void setCh_sfyhpyz4(Object ch_sfyhpyz4) {
			this.ch_sfyhpyz4 = ch_sfyhpyz4;
		}

		public Object getVc_byzds4() {
			return vc_byzds4;
		}

		public void setVc_byzds4(Object vc_byzds4) {
			this.vc_byzds4 = vc_byzds4;
		}

		public Object getCh_hpjxfsclfs4() {
			return ch_hpjxfsclfs4;
		}

		public void setCh_hpjxfsclfs4(Object ch_hpjxfsclfs4) {
			this.ch_hpjxfsclfs4 = ch_hpjxfsclfs4;
		}

		public Object getCh_sjjxfsclfs4() {
			return ch_sjjxfsclfs4;
		}

		public void setCh_sjjxfsclfs4(Object ch_sjjxfsclfs4) {
			this.ch_sjjxfsclfs4 = ch_sjjxfsclfs4;
		}

		public Object getVc_jcsclssyxqk4() {
			return vc_jcsclssyxqk4;
		}

		public void setVc_jcsclssyxqk4(Object vc_jcsclssyxqk4) {
			this.vc_jcsclssyxqk4 = vc_jcsclssyxqk4;
		}

		public Object getCh_jqjcsfcb() {
			return ch_jqjcsfcb;
		}

		public void setCh_jqjcsfcb(Object ch_jqjcsfcb) {
			this.ch_jqjcsfcb = ch_jqjcsfcb;
		}

		public Object getVc_cbd() {
			return vc_cbd;
		}

		public void setVc_cbd(Object vc_cbd) {
			this.vc_cbd = vc_cbd;
		}

		public Object getVc_fsjcsfcb2() {
			return vc_fsjcsfcb2;
		}

		public void setVc_fsjcsfcb2(Object vc_fsjcsfcb2) {
			this.vc_fsjcsfcb2 = vc_fsjcsfcb2;
		}

		public Object getVc_jcdw2() {
			return vc_jcdw2;
		}

		public void setVc_jcdw2(Object vc_jcdw2) {
			this.vc_jcdw2 = vc_jcdw2;
		}

		public Object getDt_jcsj2() {
			return dt_jcsj2;
		}

		public void setDt_jcsj2(Object dt_jcsj2) {
			this.dt_jcsj2 = dt_jcsj2;
		}

		public Object getVc_sgqshfsclgy() {
			return vc_sgqshfsclgy;
		}

		public void setVc_sgqshfsclgy(Object vc_sgqshfsclgy) {
			this.vc_sgqshfsclgy = vc_sgqshfsclgy;
		}

		public Object getVc_cll5() {
			return vc_cll5;
		}

		public void setVc_cll5(Object vc_cll5) {
			this.vc_cll5 = vc_cll5;
		}

		public Object getCh_sfyhpyz5() {
			return ch_sfyhpyz5;
		}

		public void setCh_sfyhpyz5(Object ch_sfyhpyz5) {
			this.ch_sfyhpyz5 = ch_sfyhpyz5;
		}

		public Object getVc_byzds5() {
			return vc_byzds5;
		}

		public void setVc_byzds5(Object vc_byzds5) {
			this.vc_byzds5 = vc_byzds5;
		}

		public Object getCh_hpjxfsclfs5() {
			return ch_hpjxfsclfs5;
		}

		public void setCh_hpjxfsclfs5(Object ch_hpjxfsclfs5) {
			this.ch_hpjxfsclfs5 = ch_hpjxfsclfs5;
		}

		public Object getCh_sjjxfsclfs5() {
			return ch_sjjxfsclfs5;
		}

		public void setCh_sjjxfsclfs5(Object ch_sjjxfsclfs5) {
			this.ch_sjjxfsclfs5 = ch_sjjxfsclfs5;
		}

		public Object getVc_jcsclssyxqk5() {
			return vc_jcsclssyxqk5;
		}

		public void setVc_jcsclssyxqk5(Object vc_jcsclssyxqk5) {
			this.vc_jcsclssyxqk5 = vc_jcsclssyxqk5;
		}

		public Object getVc_yxqshfsclgy() {
			return vc_yxqshfsclgy;
		}

		public void setVc_yxqshfsclgy(Object vc_yxqshfsclgy) {
			this.vc_yxqshfsclgy = vc_yxqshfsclgy;
		}

		public Object getVc_cll6() {
			return vc_cll6;
		}

		public void setVc_cll6(Object vc_cll6) {
			this.vc_cll6 = vc_cll6;
		}

		public Object getCh_sfyhpyz6() {
			return ch_sfyhpyz6;
		}

		public void setCh_sfyhpyz6(Object ch_sfyhpyz6) {
			this.ch_sfyhpyz6 = ch_sfyhpyz6;
		}

		public Object getVc_byzds6() {
			return vc_byzds6;
		}

		public void setVc_byzds6(Object vc_byzds6) {
			this.vc_byzds6 = vc_byzds6;
		}

		public Object getCh_hpjxfsclfs6() {
			return ch_hpjxfsclfs6;
		}

		public void setCh_hpjxfsclfs6(Object ch_hpjxfsclfs6) {
			this.ch_hpjxfsclfs6 = ch_hpjxfsclfs6;
		}

		public Object getCh_sjjxfsclfs6() {
			return ch_sjjxfsclfs6;
		}

		public void setCh_sjjxfsclfs6(Object ch_sjjxfsclfs6) {
			this.ch_sjjxfsclfs6 = ch_sjjxfsclfs6;
		}

		public Object getVc_jcsclssyxqk6() {
			return vc_jcsclssyxqk6;
		}

		public void setVc_jcsclssyxqk6(Object vc_jcsclssyxqk6) {
			this.vc_jcsclssyxqk6 = vc_jcsclssyxqk6;
		}

		public Object getCh_jqjcsfcb2() {
			return ch_jqjcsfcb2;
		}

		public void setCh_jqjcsfcb2(Object ch_jqjcsfcb2) {
			this.ch_jqjcsfcb2 = ch_jqjcsfcb2;
		}

		public Object getVc_cbd2() {
			return vc_cbd2;
		}

		public void setVc_cbd2(Object vc_cbd2) {
			this.vc_cbd2 = vc_cbd2;
		}

		public Object getVc_fsjcsfcb3() {
			return vc_fsjcsfcb3;
		}

		public void setVc_fsjcsfcb3(Object vc_fsjcsfcb3) {
			this.vc_fsjcsfcb3 = vc_fsjcsfcb3;
		}

		public Object getVc_jcdw3() {
			return vc_jcdw3;
		}

		public void setVc_jcdw3(Object vc_jcdw3) {
			this.vc_jcdw3 = vc_jcdw3;
		}

		public Object getDt_jcsj3() {
			return dt_jcsj3;
		}

		public void setDt_jcsj3(Object dt_jcsj3) {
			this.dt_jcsj3 = dt_jcsj3;
		}

		public Object getCh_hpsfjycqnjywflxt() {
			return ch_hpsfjycqnjywflxt;
		}

		public void setCh_hpsfjycqnjywflxt(Object ch_hpsfjycqnjywflxt) {
			this.ch_hpsfjycqnjywflxt = ch_hpsfjycqnjywflxt;
		}

		public Object getCh_sfjcywflxt() {
			return ch_sfjcywflxt;
		}

		public void setCh_sfjcywflxt(Object ch_sfjcywflxt) {
			this.ch_sfjcywflxt = ch_sfjcywflxt;
		}

		public Object getCh_fyzclsffhhpjpfyq() {
			return ch_fyzclsffhhpjpfyq;
		}

		public void setCh_fyzclsffhhpjpfyq(Object ch_fyzclsffhhpjpfyq) {
			this.ch_fyzclsffhhpjpfyq = ch_fyzclsffhhpjpfyq;
		}

		public Object getVc_bfhqkms() {
			return vc_bfhqkms;
		}

		public void setVc_bfhqkms(Object vc_bfhqkms) {
			this.vc_bfhqkms = vc_bfhqkms;
		}

		public Object getCh_shljclsffhhpjpfyq() {
			return ch_shljclsffhhpjpfyq;
		}

		public void setCh_shljclsffhhpjpfyq(Object ch_shljclsffhhpjpfyq) {
			this.ch_shljclsffhhpjpfyq = ch_shljclsffhhpjpfyq;
		}

		public Object getVc_bfhqkms2() {
			return vc_bfhqkms2;
		}

		public void setVc_bfhqkms2(Object vc_bfhqkms2) {
			this.vc_bfhqkms2 = vc_bfhqkms2;
		}

		public Object getCh_kwfqtsfyyqyz() {
			return ch_kwfqtsfyyqyz;
		}

		public void setCh_kwfqtsfyyqyz(Object ch_kwfqtsfyyqyz) {
			this.ch_kwfqtsfyyqyz = ch_kwfqtsfyyqyz;
		}

		public Object getVc_byzdw() {
			return vc_byzdw;
		}

		public void setVc_byzdw(Object vc_byzdw) {
			this.vc_byzdw = vc_byzdw;
		}

		public Object getCh_fyfwtzsfzq() {
			return ch_fyfwtzsfzq;
		}

		public void setCh_fyfwtzsfzq(Object ch_fyfwtzsfzq) {
			this.ch_fyfwtzsfzq = ch_fyfwtzsfzq;
		}

		public Object getCh_sycsjczqksfsb() {
			return ch_sycsjczqksfsb;
		}

		public void setCh_sycsjczqksfsb(Object ch_sycsjczqksfsb) {
			this.ch_sycsjczqksfsb = ch_sycsjczqksfsb;
		}

		public Object getVc_wsbdy() {
			return vc_wsbdy;
		}

		public void setVc_wsbdy(Object vc_wsbdy) {
			this.vc_wsbdy = vc_wsbdy;
		}

		public Object getCh_cfdsfybz() {
			return ch_cfdsfybz;
		}

		public void setCh_cfdsfybz(Object ch_cfdsfybz) {
			this.ch_cfdsfybz = ch_cfdsfybz;
		}

		public Object getCh_sffhwxfwccgf() {
			return ch_sffhwxfwccgf;
		}

		public void setCh_sffhwxfwccgf(Object ch_sffhwxfwccgf) {
			this.ch_sffhwxfwccgf = ch_sffhwxfwccgf;
		}

		public Object getCh_cnsfdfcgyn() {
			return ch_cnsfdfcgyn;
		}

		public void setCh_cnsfdfcgyn(Object ch_cnsfdfcgyn) {
			this.ch_cnsfdfcgyn = ch_cnsfdfcgyn;
		}

		public Object getCh_cwsfjyyjzc() {
			return ch_cwsfjyyjzc;
		}

		public void setCh_cwsfjyyjzc(Object ch_cwsfjyyjzc) {
			this.ch_cwsfjyyjzc = ch_cwsfjyyjzc;
		}

		public Object getCh_zyccsfzxldzd() {
			return ch_zyccsfzxldzd;
		}

		public void setCh_zyccsfzxldzd(Object ch_zyccsfzxldzd) {
			this.ch_zyccsfzxldzd = ch_zyccsfzxldzd;
		}

		public Object getCh_ysclsfjyzz() {
			return ch_ysclsfjyzz;
		}

		public void setCh_ysclsfjyzz(Object ch_ysclsfjyzz) {
			this.ch_ysclsfjyzz = ch_ysclsfjyzz;
		}

		public Object getVc_ysl() {
			return vc_ysl;
		}

		public void setVc_ysl(Object vc_ysl) {
			this.vc_ysl = vc_ysl;
		}

		public Object getVc_qc() {
			return vc_qc;
		}

		public void setVc_qc(Object vc_qc) {
			this.vc_qc = vc_qc;
		}

		public Object getCh_jsdwsfjyzz() {
			return ch_jsdwsfjyzz;
		}

		public void setCh_jsdwsfjyzz(Object ch_jsdwsfjyzz) {
			this.ch_jsdwsfjyzz = ch_jsdwsfjyzz;
		}

		public Object getVc_sjczfsw() {
			return vc_sjczfsw;
		}

		public void setVc_sjczfsw(Object vc_sjczfsw) {
			this.vc_sjczfsw = vc_sjczfsw;
		}

		public Object getVc_byzds8() {
			return vc_byzds8;
		}

		public void setVc_byzds8(Object vc_byzds8) {
			this.vc_byzds8 = vc_byzds8;
		}

		public Object getCh_sgqsffcyhpyz() {
			return ch_sgqsffcyhpyz;
		}

		public void setCh_sgqsffcyhpyz(Object ch_sgqsffcyhpyz) {
			this.ch_sgqsffcyhpyz = ch_sgqsffcyhpyz;
		}

		public Object getVc_byzds9() {
			return vc_byzds9;
		}

		public void setVc_byzds9(Object vc_byzds9) {
			this.vc_byzds9 = vc_byzds9;
		}

		public Object getCh_hntjbccsssyhpyz() {
			return ch_hntjbccsssyhpyz;
		}

		public void setCh_hntjbccsssyhpyz(Object ch_hntjbccsssyhpyz) {
			this.ch_hntjbccsssyhpyz = ch_hntjbccsssyhpyz;
		}

		public Object getVc_byzds10() {
			return vc_byzds10;
		}

		public void setVc_byzds10(Object vc_byzds10) {
			this.vc_byzds10 = vc_byzds10;
		}

		public Object getVc_ccssyxqk() {
			return vc_ccssyxqk;
		}

		public void setVc_ccssyxqk(Object vc_ccssyxqk) {
			this.vc_ccssyxqk = vc_ccssyxqk;
		}

		public Object getCh_jqjcdx() {
			return ch_jqjcdx;
		}

		public void setCh_jqjcdx(Object ch_jqjcdx) {
			this.ch_jqjcdx = ch_jqjcdx;
		}

		public Object getCh_sfcb() {
			return ch_sfcb;
		}

		public void setCh_sfcb(Object ch_sfcb) {
			this.ch_sfcb = ch_sfcb;
		}

		public Object getCh_sgqsfzsyhpyz3() {
			return ch_sgqsfzsyhpyz3;
		}

		public void setCh_sgqsfzsyhpyz3(Object ch_sgqsfzsyhpyz3) {
			this.ch_sgqsfzsyhpyz3 = ch_sgqsfzsyhpyz3;
		}

		public Object getVc_jccbz() {
			return vc_jccbz;
		}

		public void setVc_jccbz(Object vc_jccbz) {
			this.vc_jccbz = vc_jccbz;
		}

		public Object getCh_sgqzsfzcssfyz() {
			return ch_sgqzsfzcssfyz;
		}

		public void setCh_sgqzsfzcssfyz(Object ch_sgqzsfzcssfyz) {
			this.ch_sgqzsfzcssfyz = ch_sgqzsfzcssfyz;
		}

		public Object getVc_cbd4() {
			return vc_cbd4;
		}

		public void setVc_cbd4(Object vc_cbd4) {
			this.vc_cbd4 = vc_cbd4;
		}

		public Object getVc_jcdw4() {
			return vc_jcdw4;
		}

		public void setVc_jcdw4(Object vc_jcdw4) {
			this.vc_jcdw4 = vc_jcdw4;
		}

		public Object getDt_jcsj4() {
			return dt_jcsj4;
		}

		public void setDt_jcsj4(Object dt_jcsj4) {
			this.dt_jcsj4 = dt_jcsj4;
		}

		public Object getVc_xmctslczgs() {
			return vc_xmctslczgs;
		}

		public void setVc_xmctslczgs(Object vc_xmctslczgs) {
			this.vc_xmctslczgs = vc_xmctslczgs;
		}

		public Object getCh_slddsfybg() {
			return ch_slddsfybg;
		}

		public void setCh_slddsfybg(Object ch_slddsfybg) {
			this.ch_slddsfybg = ch_slddsfybg;
		}

		public Object getVc_bgms() {
			return vc_bgms;
		}

		public void setVc_bgms(Object vc_bgms) {
			this.vc_bgms = vc_bgms;
		}

		public Object getVc_hpjydbhcs() {
			return vc_hpjydbhcs;
		}

		public void setVc_hpjydbhcs(Object vc_hpjydbhcs) {
			this.vc_hpjydbhcs = vc_hpjydbhcs;
		}

		public Object getVc_sjcqdbhcs() {
			return vc_sjcqdbhcs;
		}

		public void setVc_sjcqdbhcs(Object vc_sjcqdbhcs) {
			this.vc_sjcqdbhcs = vc_sjcqdbhcs;
		}

		public Object getVc_syhbhzlcs() {
			return vc_syhbhzlcs;
		}

		public void setVc_syhbhzlcs(Object vc_syhbhzlcs) {
			this.vc_syhbhzlcs = vc_syhbhzlcs;
		}

		public Object getCh_sfyhpyz7() {
			return ch_sfyhpyz7;
		}

		public void setCh_sfyhpyz7(Object ch_sfyhpyz7) {
			this.ch_sfyhpyz7 = ch_sfyhpyz7;
		}

		public Object getVc_xmctslczgs2() {
			return vc_xmctslczgs2;
		}

		public void setVc_xmctslczgs2(Object vc_xmctslczgs2) {
			this.vc_xmctslczgs2 = vc_xmctslczgs2;
		}

		public Object getCh_slddsfybg2() {
			return ch_slddsfybg2;
		}

		public void setCh_slddsfybg2(Object ch_slddsfybg2) {
			this.ch_slddsfybg2 = ch_slddsfybg2;
		}

		public Object getVc_bgms2() {
			return vc_bgms2;
		}

		public void setVc_bgms2(Object vc_bgms2) {
			this.vc_bgms2 = vc_bgms2;
		}

		public Object getVc_hpjydbhcs2() {
			return vc_hpjydbhcs2;
		}

		public void setVc_hpjydbhcs2(Object vc_hpjydbhcs2) {
			this.vc_hpjydbhcs2 = vc_hpjydbhcs2;
		}

		public Object getVc_sjcqdbhcs2() {
			return vc_sjcqdbhcs2;
		}

		public void setVc_sjcqdbhcs2(Object vc_sjcqdbhcs2) {
			this.vc_sjcqdbhcs2 = vc_sjcqdbhcs2;
		}

		public Object getVc_cyhbhzlcs() {
			return vc_cyhbhzlcs;
		}

		public void setVc_cyhbhzlcs(Object vc_cyhbhzlcs) {
			this.vc_cyhbhzlcs = vc_cyhbhzlcs;
		}

		public Object getVc_bgqkms() {
			return vc_bgqkms;
		}

		public void setVc_bgqkms(Object vc_bgqkms) {
			this.vc_bgqkms = vc_bgqkms;
		}

		public Object getCh_sfyhpyz8() {
			return ch_sfyhpyz8;
		}

		public void setCh_sfyhpyz8(Object ch_sfyhpyz8) {
			this.ch_sfyhpyz8 = ch_sfyhpyz8;
		}

		public Object getVc_xmqzzgs() {
			return vc_xmqzzgs;
		}

		public void setVc_xmqzzgs(Object vc_xmqzzgs) {
			this.vc_xmqzzgs = vc_xmqzzgs;
		}

		public Object getCh_slddsfybg1() {
			return ch_slddsfybg1;
		}

		public void setCh_slddsfybg1(Object ch_slddsfybg1) {
			this.ch_slddsfybg1 = ch_slddsfybg1;
		}

		public Object getCh_qzspsfyhpyz() {
			return ch_qzspsfyhpyz;
		}

		public void setCh_qzspsfyhpyz(Object ch_qzspsfyhpyz) {
			this.ch_qzspsfyhpyz = ch_qzspsfyhpyz;
		}

		public Object getVc_zcbhcs() {
			return vc_zcbhcs;
		}

		public void setVc_zcbhcs(Object vc_zcbhcs) {
			this.vc_zcbhcs = vc_zcbhcs;
		}

		public Object getVc_qtxcqdbhcs() {
			return vc_qtxcqdbhcs;
		}

		public void setVc_qtxcqdbhcs(Object vc_qtxcqdbhcs) {
			this.vc_qtxcqdbhcs = vc_qtxcqdbhcs;
		}

		public Object getVc_sjcqdstbhcs() {
			return vc_sjcqdstbhcs;
		}

		public void setVc_sjcqdstbhcs(Object vc_sjcqdstbhcs) {
			this.vc_sjcqdstbhcs = vc_sjcqdstbhcs;
		}

		public Object getCh_dssdwbhcssfyhpyz() {
			return ch_dssdwbhcssfyhpyz;
		}

		public void setCh_dssdwbhcssfyhpyz(Object ch_dssdwbhcssfyhpyz) {
			this.ch_dssdwbhcssfyhpyz = ch_dssdwbhcssfyhpyz;
		}

		public Object getVc_byzds11() {
			return vc_byzds11;
		}

		public void setVc_byzds11(Object vc_byzds11) {
			this.vc_byzds11 = vc_byzds11;
		}

		public Object getCh_dlsdwbhcssfyhpyz() {
			return ch_dlsdwbhcssfyhpyz;
		}

		public void setCh_dlsdwbhcssfyhpyz(Object ch_dlsdwbhcssfyhpyz) {
			this.ch_dlsdwbhcssfyhpyz = ch_dlsdwbhcssfyhpyz;
		}

		public Object getVc_byzds13() {
			return vc_byzds13;
		}

		public void setVc_byzds13(Object vc_byzds13) {
			this.vc_byzds13 = vc_byzds13;
		}

		public Object getCh_dzwbhcssfyhpyz() {
			return ch_dzwbhcssfyhpyz;
		}

		public void setCh_dzwbhcssfyhpyz(Object ch_dzwbhcssfyhpyz) {
			this.ch_dzwbhcssfyhpyz = ch_dzwbhcssfyhpyz;
		}

		public Object getVc_byzds14() {
			return vc_byzds14;
		}

		public void setVc_byzds14(Object vc_byzds14) {
			this.vc_byzds14 = vc_byzds14;
		}

		public Object getCh_hpsfyqfs() {
			return ch_hpsfyqfs;
		}

		public void setCh_hpsfyqfs(Object ch_hpsfyqfs) {
			this.ch_hpsfyqfs = ch_hpsfyqfs;
		}

		public Object getVc_tshdglc() {
			return vc_tshdglc;
		}

		public void setVc_tshdglc(Object vc_tshdglc) {
			this.vc_tshdglc = vc_tshdglc;
		}

		public Object getVc_hpxstll() {
			return vc_hpxstll;
		}

		public void setVc_hpxstll(Object vc_hpxstll) {
			this.vc_hpxstll = vc_hpxstll;
		}

		public Object getVc_sxstll() {
			return vc_sxstll;
		}

		public void setVc_sxstll(Object vc_sxstll) {
			this.vc_sxstll = vc_sxstll;
		}

		public Object getCh_sffhhpyq() {
			return ch_sffhhpyq;
		}

		public void setCh_sffhhpyq(Object ch_sffhhpyq) {
			this.ch_sffhhpyq = ch_sffhhpyq;
		}

		public Object getCh_sfyqanyq() {
			return ch_sfyqanyq;
		}

		public void setCh_sfyqanyq(Object ch_sfyqanyq) {
			this.ch_sfyqanyq = ch_sfyqanyq;
		}

		public Object getVc_jcyyxqk() {
			return vc_jcyyxqk;
		}

		public void setVc_jcyyxqk(Object vc_jcyyxqk) {
			this.vc_jcyyxqk = vc_jcyyxqk;
		}

		public Object getCh_sflscs() {
			return ch_sflscs;
		}

		public void setCh_sflscs(Object ch_sflscs) {
			this.ch_sflscs = ch_sflscs;
		}

		public Object getVc_wlsqkms() {
			return vc_wlsqkms;
		}

		public void setVc_wlsqkms(Object vc_wlsqkms) {
			this.vc_wlsqkms = vc_wlsqkms;
		}

		public Object getCh_sfbztfya() {
			return ch_sfbztfya;
		}

		public void setCh_sfbztfya(Object ch_sfbztfya) {
			this.ch_sfbztfya = ch_sfbztfya;
		}

		public Object getCh_sfdyapg() {
			return ch_sfdyapg;
		}

		public void setCh_sfdyapg(Object ch_sfdyapg) {
			this.ch_sfdyapg = ch_sfdyapg;
		}

		public Object getCh_sfjxndyl() {
			return ch_sfjxndyl;
		}

		public void setCh_sfjxndyl(Object ch_sfjxndyl) {
			this.ch_sfjxndyl = ch_sfjxndyl;
		}

		public Object getCh_sfcbwz() {
			return ch_sfcbwz;
		}

		public void setCh_sfcbwz(Object ch_sfcbwz) {
			this.ch_sfcbwz = ch_sfcbwz;
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

		public DtCreateTimeBean getDt_create_time() {
			return dt_create_time;
		}

		public void setDt_create_time(DtCreateTimeBean dt_create_time) {
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

		public static class DtBeginTimeBean {
			@Override
			public String toString() {
				return
						(year + 1900) + "." + (month + 1) + "." + date
						;
			}

			/**
			 * date : 27
			 * day : 5
			 * hours : 0
			 * minutes : 0
			 * month : 9
			 * nanos : 0
			 * seconds : 0
			 * time : 1509033600000
			 * timezoneOffset : -480
			 * year : 117
			 */

			private int date;
			private int day;
			private int hours;
			private int minutes;
			private int month;
			private int nanos;
			private int seconds;
			private long time;
			private int timezoneOffset;
			private int year;

			public int getDate() {
				return date;
			}

			public void setDate(int date) {
				this.date = date;
			}

			public int getDay() {
				return day;
			}

			public void setDay(int day) {
				this.day = day;
			}

			public int getHours() {
				return hours;
			}

			public void setHours(int hours) {
				this.hours = hours;
			}

			public int getMinutes() {
				return minutes;
			}

			public void setMinutes(int minutes) {
				this.minutes = minutes;
			}

			public int getMonth() {
				return month;
			}

			public void setMonth(int month) {
				this.month = month;
			}

			public int getNanos() {
				return nanos;
			}

			public void setNanos(int nanos) {
				this.nanos = nanos;
			}

			public int getSeconds() {
				return seconds;
			}

			public void setSeconds(int seconds) {
				this.seconds = seconds;
			}

			public long getTime() {
				return time;
			}

			public void setTime(long time) {
				this.time = time;
			}

			public int getTimezoneOffset() {
				return timezoneOffset;
			}

			public void setTimezoneOffset(int timezoneOffset) {
				this.timezoneOffset = timezoneOffset;
			}

			public int getYear() {
				return year;
			}

			public void setYear(int year) {
				this.year = year;
			}
		}

		public static class DtEndTimeBean {
			@Override
			public String toString() {
				return
						(year + 1900) + "." + (month + 1) + "." + date
						;
			}

			/**
			 * date : 28
			 * day : 6
			 * hours : 0
			 * minutes : 0
			 * month : 9
			 * nanos : 0
			 * seconds : 0
			 * time : 1509120000000
			 * timezoneOffset : -480
			 * year : 117
			 */

			private int date;
			private int day;
			private int hours;
			private int minutes;
			private int month;
			private int nanos;
			private int seconds;
			private long time;
			private int timezoneOffset;
			private int year;

			public int getDate() {
				return date;
			}

			public void setDate(int date) {
				this.date = date;
			}

			public int getDay() {
				return day;
			}

			public void setDay(int day) {
				this.day = day;
			}

			public int getHours() {
				return hours;
			}

			public void setHours(int hours) {
				this.hours = hours;
			}

			public int getMinutes() {
				return minutes;
			}

			public void setMinutes(int minutes) {
				this.minutes = minutes;
			}

			public int getMonth() {
				return month;
			}

			public void setMonth(int month) {
				this.month = month;
			}

			public int getNanos() {
				return nanos;
			}

			public void setNanos(int nanos) {
				this.nanos = nanos;
			}

			public int getSeconds() {
				return seconds;
			}

			public void setSeconds(int seconds) {
				this.seconds = seconds;
			}

			public long getTime() {
				return time;
			}

			public void setTime(long time) {
				this.time = time;
			}

			public int getTimezoneOffset() {
				return timezoneOffset;
			}

			public void setTimezoneOffset(int timezoneOffset) {
				this.timezoneOffset = timezoneOffset;
			}

			public int getYear() {
				return year;
			}

			public void setYear(int year) {
				this.year = year;
			}
		}

		public static class DtCreateTimeBean {
			@Override
			public String toString() {
				return
						(year + 1900) + "." + (month + 1) + "." + date
						;
			}

			/**
			 * date : 24
			 * day : 2
			 * hours : 16
			 * minutes : 54
			 * month : 9
			 * nanos : 0
			 * seconds : 36
			 * time : 1508835276000
			 * timezoneOffset : -480
			 * year : 117
			 */

			private int date;
			private int day;
			private int hours;
			private int minutes;
			private int month;
			private int nanos;
			private int seconds;
			private long time;
			private int timezoneOffset;
			private int year;

			public int getDate() {
				return date;
			}

			public void setDate(int date) {
				this.date = date;
			}

			public int getDay() {
				return day;
			}

			public void setDay(int day) {
				this.day = day;
			}

			public int getHours() {
				return hours;
			}

			public void setHours(int hours) {
				this.hours = hours;
			}

			public int getMinutes() {
				return minutes;
			}

			public void setMinutes(int minutes) {
				this.minutes = minutes;
			}

			public int getMonth() {
				return month;
			}

			public void setMonth(int month) {
				this.month = month;
			}

			public int getNanos() {
				return nanos;
			}

			public void setNanos(int nanos) {
				this.nanos = nanos;
			}

			public int getSeconds() {
				return seconds;
			}

			public void setSeconds(int seconds) {
				this.seconds = seconds;
			}

			public long getTime() {
				return time;
			}

			public void setTime(long time) {
				this.time = time;
			}

			public int getTimezoneOffset() {
				return timezoneOffset;
			}

			public void setTimezoneOffset(int timezoneOffset) {
				this.timezoneOffset = timezoneOffset;
			}

			public int getYear() {
				return year;
			}

			public void setYear(int year) {
				this.year = year;
			}
		}
	}
}
