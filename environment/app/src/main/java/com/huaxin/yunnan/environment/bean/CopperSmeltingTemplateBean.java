package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 *  6、铜冶炼行业现场监察记录bean
 * Created by zbw on 2017/10/26 14:45.
 */

public class CopperSmeltingTemplateBean {
	@Override
	public String toString() {
		return "CopperSmeltingTemplateBean{" +
				"msg='" + msg + '\'' +
				", success='" + success + '\'' +
				", data=" + data +
				'}';
	}

	/**
	 * data : [{"t_tylhyxcjc_record_id":"402880ce5f4ce4f6015f4dd5b98705ee","dt_start_time":{"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117},"dt_end_time":{"date":28,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509120000000,"timezoneOffset":-480,"year":117},"vc_location":"士大夫发给","vc_jcr":"admin_1,超级管理员","vc_jcr_id":null,"vc_zfzh":"2435463534","vc_jlr":"admin_1","vc_jlr_id":null,"vc_bjcdwmc":"大理怡祥纸业有限公司","vc_bjcdwmc_id":null,"vc_zzjgdmzh":"622898222","vc_fddbr":"朱建平","vc_fddbrsfzh":"143222445436","vc_xcfzr":"屌丝夫妇","vc_xcfzrsfzh":"423354365443","nb_age":21,"vc_gzdw":"十多个","vc_duty":"额外人","vc_ybagx":null,"vc_address":null,"vc_telephone":null,"vc_yzbm":null,"cl_qtcjrxmjgzdw":null,"vc_hbdwmc":null,"vc_hbdwlx":null,"vc_hjjclx":null,"vc_sfqrzj":null,"vc_sfsqhb":null,"vc_city":null,"vc_county":null,"vc_town":null,"vc_xzc":null,"vc_gyyq":null,"vc_pq":null,"vc_qyzt":null,"vc_qycp":null,"vc_ctcl":null,"vc_jtcl":null,"vc_lscl":null,"vc_qtcl":null,"vc_sczyyl":null,"vc_tylgy":"1,2","vc_qttylgy":null,"vc_ctjlgy":null,"vc_qtctjlgy":null,"vc_lsscxscgy":null,"vc_zysczzjsb":null,"vc_cyjszcsfsyxzl":null,"vc_cyjszcsfsyttl":null,"dt_xmsj_tima":null,"dt_pzlx_time":null,"vc_pzlxdw":null,"vc_lxpfwh":null,"vc_bzhjyxpjbg":null,"vc_hpbzdw":null,"dt_bz_time":null,"vc_sfjddjbz":null,"vc_hpspdw":null,"dt_hpsp_time":null,"vc_hpspwh":null,"vc_sfczyjspqk":null,"vc_scyfcl":null,"vc_zfcpjclfbw":null,"vc_gxmcsdsfyhjyxpjwjyz":null,"vc_bfdy":null,"vc_bzhpbgssfsycyzcttfw":null,"vc_mqsfsycyzcttfw":null,"dt_trssc_time":null,"vc_ljscjgy":null,"vc_sfpftyssc":null,"vc_hbsscspdw":null,"dt_hbsscsp_time":null,"vc_hbsscspwh":null,"vc_sftghbjgys":null,"vc_hbjgysspdw":null,"dt_hbjgyssp_time":null,"vc_hbjgysspwh":null,"vc_sfjxgjghkj":null,"cl_jgkjhpjstszdzxqk":null,"vc_sfyfqdpwxkz":null,"vc_sfazpwxkzdgdpfwrw":null,"vc_sfxhjbhbmjxpwsbdj":null,"vc_sfjszejnpwf":null,"vc_synsjjnpwf":null,"vc_yjpwf":null,"cl_wzejnpwfyy":null,"vc_gqyfsly":null,"vc_fstzwrw":null,"vc_sjcsl":null,"vc_scfsclss":null,"vc_cll":null,"vc_sffhfsclyq":null,"vc_bfhqkms":null,"vc_sfsxshfsyshscfsfl":null,"vc_sfczgbjgdfspffsxw":null,"cl_qksm":null,"cl_wxfwzyy":null,"vc_yicsl":null,"vc_yiczcs":null,"vc_ercsl":null,"vc_erczcs":null,"vc_sancsl":null,"vc_sanczcs":null,"vc_sicsl":null,"vc_siczcs":null,"vc_wucsl":null,"vc_wuczcs":null,"vc_liucsl":null,"vc_liuczcs":null,"vc_qt":null,"vc_qtcsl":null,"vc_qtczcs":null,"vc_wxfwtzsfjqgf":null,"vc_sycsjczqksfxhbbmsb":null,"vc_wsbdynx":null,"vc_wxfwcfkhcdsfsybs":null,"vc_sffhwxfwccgf":null,"vc_zcnlscfscsjsfcgyn":null,"vc_zcwsfjsyyjxdczc":null,"vc_rzyccsfzxwxfwzyldzd":null,"vc_ysclsfjyxgzz":null,"vc_ysl":null,"vc_pc":null,"vc_jsdwsfjywfjyzz":null,"vc_sjczfs":null,"vc_qtybgf":null,"vc_sfjxgfcc":null,"vc_zhlycssffhhpyq":null,"vc_czfs":null,"vc_fqcshj":null,"vc_sfptfqzlss":null,"vc_wptjsssmcw":null,"vc_jqjgjcsfcb":null,"vc_cbyzjjczw":null,"vc_jcdw":null,"dt_jc_time":null,"vc_zxjczzsfaz":null,"dt_zxaz_time":null,"vc_sfxhbbmlw":null,"vc_sfyxzc":null,"vc_sfjgjy":null,"dt_jy_time":null,"vc_zxjcsjxsw":null,"vc_sfahpyqcqcs":null,"vc_wptjsdssw":null,"vc_hpyqdwsfhjl":null,"vc_jlnsfybhmb":null,"dt_bhmbjs_time":null,"vc_qyzbhjbhqk":null,"vc_sflshpjpfyqdfxffdccs":null,"vc_cswlsqkms":null,"vc_sfbztfhjsjyjya":null,"vc_sfbztfhjsjyjyapgba":null,"vc_sfayayqjxndyjyl":null,"vc_sfcbyjwz":null,"cl_qthbbmjcqk":null,"cl_czzywt":null,"cl_jcyq":null,"dt_create_time":{"date":24,"day":2,"hours":18,"minutes":1,"month":9,"nanos":0,"seconds":57,"time":1508839317000,"timezoneOffset":-480,"year":117},"vc_create_user":"admin","vc_create_mechanism":"402848bd4830fed70148312e0efb0631","dt_update_time":{"date":24,"day":2,"hours":18,"minutes":1,"month":9,"nanos":0,"seconds":57,"time":1508839317000,"timezoneOffset":-480,"year":117},"vc_update_user":"admin","vc_uodate_mechanism":"402848bd4830fed70148312e0efb0631","vc_status":null,"instanceid":null,"del_status":"0","t_task_list_id":"402880ce5f4bfed5015f4c23b0f70136","rownum_":1}]
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
					"t_tylhyxcjc_record_id='" + t_tylhyxcjc_record_id + '\'' +
					", dt_start_time=" + dt_start_time +
					", dt_end_time=" + dt_end_time +
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
					", vc_xcfzr='" + vc_xcfzr + '\'' +
					", vc_xcfzrsfzh='" + vc_xcfzrsfzh + '\'' +
					", nb_age=" + nb_age +
					", vc_gzdw='" + vc_gzdw + '\'' +
					", vc_duty='" + vc_duty + '\'' +
					", vc_ybagx=" + vc_ybagx +
					", vc_address=" + vc_address +
					", vc_telephone=" + vc_telephone +
					", vc_yzbm=" + vc_yzbm +
					", cl_qtcjrxmjgzdw=" + cl_qtcjrxmjgzdw +
					", vc_hbdwmc=" + vc_hbdwmc +
					", vc_hbdwlx=" + vc_hbdwlx +
					", vc_hjjclx=" + vc_hjjclx +
					", vc_sfqrzj=" + vc_sfqrzj +
					", vc_sfsqhb=" + vc_sfsqhb +
					", vc_city=" + vc_city +
					", vc_county=" + vc_county +
					", vc_town=" + vc_town +
					", vc_xzc=" + vc_xzc +
					", vc_gyyq=" + vc_gyyq +
					", vc_pq=" + vc_pq +
					", vc_qyzt=" + vc_qyzt +
					", vc_qycp=" + vc_qycp +
					", vc_ctcl=" + vc_ctcl +
					", vc_jtcl=" + vc_jtcl +
					", vc_lscl=" + vc_lscl +
					", vc_qtcl=" + vc_qtcl +
					", vc_sczyyl=" + vc_sczyyl +
					", vc_tylgy='" + vc_tylgy + '\'' +
					", vc_qttylgy=" + vc_qttylgy +
					", vc_ctjlgy=" + vc_ctjlgy +
					", vc_qtctjlgy=" + vc_qtctjlgy +
					", vc_lsscxscgy=" + vc_lsscxscgy +
					", vc_zysczzjsb=" + vc_zysczzjsb +
					", vc_cyjszcsfsyxzl=" + vc_cyjszcsfsyxzl +
					", vc_cyjszcsfsyttl=" + vc_cyjszcsfsyttl +
					", dt_xmsj_tima=" + dt_xmsj_tima +
					", dt_pzlx_time=" + dt_pzlx_time +
					", vc_pzlxdw=" + vc_pzlxdw +
					", vc_lxpfwh=" + vc_lxpfwh +
					", vc_bzhjyxpjbg=" + vc_bzhjyxpjbg +
					", vc_hpbzdw=" + vc_hpbzdw +
					", dt_bz_time=" + dt_bz_time +
					", vc_sfjddjbz=" + vc_sfjddjbz +
					", vc_hpspdw=" + vc_hpspdw +
					", dt_hpsp_time=" + dt_hpsp_time +
					", vc_hpspwh=" + vc_hpspwh +
					", vc_sfczyjspqk=" + vc_sfczyjspqk +
					", vc_scyfcl=" + vc_scyfcl +
					", vc_zfcpjclfbw=" + vc_zfcpjclfbw +
					", vc_gxmcsdsfyhjyxpjwjyz=" + vc_gxmcsdsfyhjyxpjwjyz +
					", vc_bfdy=" + vc_bfdy +
					", vc_bzhpbgssfsycyzcttfw=" + vc_bzhpbgssfsycyzcttfw +
					", vc_mqsfsycyzcttfw=" + vc_mqsfsycyzcttfw +
					", dt_trssc_time=" + dt_trssc_time +
					", vc_ljscjgy=" + vc_ljscjgy +
					", vc_sfpftyssc=" + vc_sfpftyssc +
					", vc_hbsscspdw=" + vc_hbsscspdw +
					", dt_hbsscsp_time=" + dt_hbsscsp_time +
					", vc_hbsscspwh=" + vc_hbsscspwh +
					", vc_sftghbjgys=" + vc_sftghbjgys +
					", vc_hbjgysspdw=" + vc_hbjgysspdw +
					", dt_hbjgyssp_time=" + dt_hbjgyssp_time +
					", vc_hbjgysspwh=" + vc_hbjgysspwh +
					", vc_sfjxgjghkj=" + vc_sfjxgjghkj +
					", cl_jgkjhpjstszdzxqk=" + cl_jgkjhpjstszdzxqk +
					", vc_sfyfqdpwxkz=" + vc_sfyfqdpwxkz +
					", vc_sfazpwxkzdgdpfwrw=" + vc_sfazpwxkzdgdpfwrw +
					", vc_sfxhjbhbmjxpwsbdj=" + vc_sfxhjbhbmjxpwsbdj +
					", vc_sfjszejnpwf=" + vc_sfjszejnpwf +
					", vc_synsjjnpwf=" + vc_synsjjnpwf +
					", vc_yjpwf=" + vc_yjpwf +
					", cl_wzejnpwfyy=" + cl_wzejnpwfyy +
					", vc_gqyfsly=" + vc_gqyfsly +
					", vc_fstzwrw=" + vc_fstzwrw +
					", vc_sjcsl=" + vc_sjcsl +
					", vc_scfsclss=" + vc_scfsclss +
					", vc_cll=" + vc_cll +
					", vc_sffhfsclyq=" + vc_sffhfsclyq +
					", vc_bfhqkms=" + vc_bfhqkms +
					", vc_sfsxshfsyshscfsfl=" + vc_sfsxshfsyshscfsfl +
					", vc_sfczgbjgdfspffsxw=" + vc_sfczgbjgdfspffsxw +
					", cl_qksm=" + cl_qksm +
					", cl_wxfwzyy=" + cl_wxfwzyy +
					", vc_yicsl=" + vc_yicsl +
					", vc_yiczcs=" + vc_yiczcs +
					", vc_ercsl=" + vc_ercsl +
					", vc_erczcs=" + vc_erczcs +
					", vc_sancsl=" + vc_sancsl +
					", vc_sanczcs=" + vc_sanczcs +
					", vc_sicsl=" + vc_sicsl +
					", vc_siczcs=" + vc_siczcs +
					", vc_wucsl=" + vc_wucsl +
					", vc_wuczcs=" + vc_wuczcs +
					", vc_liucsl=" + vc_liucsl +
					", vc_liuczcs=" + vc_liuczcs +
					", vc_qt=" + vc_qt +
					", vc_qtcsl=" + vc_qtcsl +
					", vc_qtczcs=" + vc_qtczcs +
					", vc_wxfwtzsfjqgf=" + vc_wxfwtzsfjqgf +
					", vc_sycsjczqksfxhbbmsb=" + vc_sycsjczqksfxhbbmsb +
					", vc_wsbdynx=" + vc_wsbdynx +
					", vc_wxfwcfkhcdsfsybs=" + vc_wxfwcfkhcdsfsybs +
					", vc_sffhwxfwccgf=" + vc_sffhwxfwccgf +
					", vc_zcnlscfscsjsfcgyn=" + vc_zcnlscfscsjsfcgyn +
					", vc_zcwsfjsyyjxdczc=" + vc_zcwsfjsyyjxdczc +
					", vc_rzyccsfzxwxfwzyldzd=" + vc_rzyccsfzxwxfwzyldzd +
					", vc_ysclsfjyxgzz=" + vc_ysclsfjyxgzz +
					", vc_ysl=" + vc_ysl +
					", vc_pc=" + vc_pc +
					", vc_jsdwsfjywfjyzz=" + vc_jsdwsfjywfjyzz +
					", vc_sjczfs=" + vc_sjczfs +
					", vc_qtybgf=" + vc_qtybgf +
					", vc_sfjxgfcc=" + vc_sfjxgfcc +
					", vc_zhlycssffhhpyq=" + vc_zhlycssffhhpyq +
					", vc_czfs=" + vc_czfs +
					", vc_fqcshj=" + vc_fqcshj +
					", vc_sfptfqzlss=" + vc_sfptfqzlss +
					", vc_wptjsssmcw=" + vc_wptjsssmcw +
					", vc_jqjgjcsfcb=" + vc_jqjgjcsfcb +
					", vc_cbyzjjczw=" + vc_cbyzjjczw +
					", vc_jcdw=" + vc_jcdw +
					", dt_jc_time=" + dt_jc_time +
					", vc_zxjczzsfaz=" + vc_zxjczzsfaz +
					", dt_zxaz_time=" + dt_zxaz_time +
					", vc_sfxhbbmlw=" + vc_sfxhbbmlw +
					", vc_sfyxzc=" + vc_sfyxzc +
					", vc_sfjgjy=" + vc_sfjgjy +
					", dt_jy_time=" + dt_jy_time +
					", vc_zxjcsjxsw=" + vc_zxjcsjxsw +
					", vc_sfahpyqcqcs=" + vc_sfahpyqcqcs +
					", vc_wptjsdssw=" + vc_wptjsdssw +
					", vc_hpyqdwsfhjl=" + vc_hpyqdwsfhjl +
					", vc_jlnsfybhmb=" + vc_jlnsfybhmb +
					", dt_bhmbjs_time=" + dt_bhmbjs_time +
					", vc_qyzbhjbhqk=" + vc_qyzbhjbhqk +
					", vc_sflshpjpfyqdfxffdccs=" + vc_sflshpjpfyqdfxffdccs +
					", vc_cswlsqkms=" + vc_cswlsqkms +
					", vc_sfbztfhjsjyjya=" + vc_sfbztfhjsjyjya +
					", vc_sfbztfhjsjyjyapgba=" + vc_sfbztfhjsjyjyapgba +
					", vc_sfayayqjxndyjyl=" + vc_sfayayqjxndyjyl +
					", vc_sfcbyjwz=" + vc_sfcbyjwz +
					", cl_qthbbmjcqk=" + cl_qthbbmjcqk +
					", cl_czzywt=" + cl_czzywt +
					", cl_jcyq=" + cl_jcyq +
					", dt_create_time=" + dt_create_time +
					", vc_create_user='" + vc_create_user + '\'' +
					", vc_create_mechanism='" + vc_create_mechanism + '\'' +
					", dt_update_time=" + dt_update_time +
					", vc_update_user='" + vc_update_user + '\'' +
					", vc_uodate_mechanism='" + vc_uodate_mechanism + '\'' +
					", vc_status=" + vc_status +
					", instanceid=" + instanceid +
					", del_status='" + del_status + '\'' +
					", t_task_list_id='" + t_task_list_id + '\'' +
					", rownum_=" + rownum_ +
					'}';
		}

		/**
		 * t_tylhyxcjc_record_id : 402880ce5f4ce4f6015f4dd5b98705ee
		 * dt_start_time : {"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117}
		 * dt_end_time : {"date":28,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509120000000,"timezoneOffset":-480,"year":117}
		 * vc_location : 士大夫发给
		 * vc_jcr : admin_1,超级管理员
		 * vc_jcr_id : null
		 * vc_zfzh : 2435463534
		 * vc_jlr : admin_1
		 * vc_jlr_id : null
		 * vc_bjcdwmc : 大理怡祥纸业有限公司
		 * vc_bjcdwmc_id : null
		 * vc_zzjgdmzh : 622898222
		 * vc_fddbr : 朱建平
		 * vc_fddbrsfzh : 143222445436
		 * vc_xcfzr : 屌丝夫妇
		 * vc_xcfzrsfzh : 423354365443
		 * nb_age : 21
		 * vc_gzdw : 十多个
		 * vc_duty : 额外人
		 * vc_ybagx : null
		 * vc_address : null
		 * vc_telephone : null
		 * vc_yzbm : null
		 * cl_qtcjrxmjgzdw : null
		 * vc_hbdwmc : null
		 * vc_hbdwlx : null
		 * vc_hjjclx : null
		 * vc_sfqrzj : null
		 * vc_sfsqhb : null
		 * vc_city : null
		 * vc_county : null
		 * vc_town : null
		 * vc_xzc : null
		 * vc_gyyq : null
		 * vc_pq : null
		 * vc_qyzt : null
		 * vc_qycp : null
		 * vc_ctcl : null
		 * vc_jtcl : null
		 * vc_lscl : null
		 * vc_qtcl : null
		 * vc_sczyyl : null
		 * vc_tylgy : 1,2
		 * vc_qttylgy : null
		 * vc_ctjlgy : null
		 * vc_qtctjlgy : null
		 * vc_lsscxscgy : null
		 * vc_zysczzjsb : null
		 * vc_cyjszcsfsyxzl : null
		 * vc_cyjszcsfsyttl : null
		 * dt_xmsj_tima : null
		 * dt_pzlx_time : null
		 * vc_pzlxdw : null
		 * vc_lxpfwh : null
		 * vc_bzhjyxpjbg : null
		 * vc_hpbzdw : null
		 * dt_bz_time : null
		 * vc_sfjddjbz : null
		 * vc_hpspdw : null
		 * dt_hpsp_time : null
		 * vc_hpspwh : null
		 * vc_sfczyjspqk : null
		 * vc_scyfcl : null
		 * vc_zfcpjclfbw : null
		 * vc_gxmcsdsfyhjyxpjwjyz : null
		 * vc_bfdy : null
		 * vc_bzhpbgssfsycyzcttfw : null
		 * vc_mqsfsycyzcttfw : null
		 * dt_trssc_time : null
		 * vc_ljscjgy : null
		 * vc_sfpftyssc : null
		 * vc_hbsscspdw : null
		 * dt_hbsscsp_time : null
		 * vc_hbsscspwh : null
		 * vc_sftghbjgys : null
		 * vc_hbjgysspdw : null
		 * dt_hbjgyssp_time : null
		 * vc_hbjgysspwh : null
		 * vc_sfjxgjghkj : null
		 * cl_jgkjhpjstszdzxqk : null
		 * vc_sfyfqdpwxkz : null
		 * vc_sfazpwxkzdgdpfwrw : null
		 * vc_sfxhjbhbmjxpwsbdj : null
		 * vc_sfjszejnpwf : null
		 * vc_synsjjnpwf : null
		 * vc_yjpwf : null
		 * cl_wzejnpwfyy : null
		 * vc_gqyfsly : null
		 * vc_fstzwrw : null
		 * vc_sjcsl : null
		 * vc_scfsclss : null
		 * vc_cll : null
		 * vc_sffhfsclyq : null
		 * vc_bfhqkms : null
		 * vc_sfsxshfsyshscfsfl : null
		 * vc_sfczgbjgdfspffsxw : null
		 * cl_qksm : null
		 * cl_wxfwzyy : null
		 * vc_yicsl : null
		 * vc_yiczcs : null
		 * vc_ercsl : null
		 * vc_erczcs : null
		 * vc_sancsl : null
		 * vc_sanczcs : null
		 * vc_sicsl : null
		 * vc_siczcs : null
		 * vc_wucsl : null
		 * vc_wuczcs : null
		 * vc_liucsl : null
		 * vc_liuczcs : null
		 * vc_qt : null
		 * vc_qtcsl : null
		 * vc_qtczcs : null
		 * vc_wxfwtzsfjqgf : null
		 * vc_sycsjczqksfxhbbmsb : null
		 * vc_wsbdynx : null
		 * vc_wxfwcfkhcdsfsybs : null
		 * vc_sffhwxfwccgf : null
		 * vc_zcnlscfscsjsfcgyn : null
		 * vc_zcwsfjsyyjxdczc : null
		 * vc_rzyccsfzxwxfwzyldzd : null
		 * vc_ysclsfjyxgzz : null
		 * vc_ysl : null
		 * vc_pc : null
		 * vc_jsdwsfjywfjyzz : null
		 * vc_sjczfs : null
		 * vc_qtybgf : null
		 * vc_sfjxgfcc : null
		 * vc_zhlycssffhhpyq : null
		 * vc_czfs : null
		 * vc_fqcshj : null
		 * vc_sfptfqzlss : null
		 * vc_wptjsssmcw : null
		 * vc_jqjgjcsfcb : null
		 * vc_cbyzjjczw : null
		 * vc_jcdw : null
		 * dt_jc_time : null
		 * vc_zxjczzsfaz : null
		 * dt_zxaz_time : null
		 * vc_sfxhbbmlw : null
		 * vc_sfyxzc : null
		 * vc_sfjgjy : null
		 * dt_jy_time : null
		 * vc_zxjcsjxsw : null
		 * vc_sfahpyqcqcs : null
		 * vc_wptjsdssw : null
		 * vc_hpyqdwsfhjl : null
		 * vc_jlnsfybhmb : null
		 * dt_bhmbjs_time : null
		 * vc_qyzbhjbhqk : null
		 * vc_sflshpjpfyqdfxffdccs : null
		 * vc_cswlsqkms : null
		 * vc_sfbztfhjsjyjya : null
		 * vc_sfbztfhjsjyjyapgba : null
		 * vc_sfayayqjxndyjyl : null
		 * vc_sfcbyjwz : null
		 * cl_qthbbmjcqk : null
		 * cl_czzywt : null
		 * cl_jcyq : null
		 * dt_create_time : {"date":24,"day":2,"hours":18,"minutes":1,"month":9,"nanos":0,"seconds":57,"time":1508839317000,"timezoneOffset":-480,"year":117}
		 * vc_create_user : admin
		 * vc_create_mechanism : 402848bd4830fed70148312e0efb0631
		 * dt_update_time : {"date":24,"day":2,"hours":18,"minutes":1,"month":9,"nanos":0,"seconds":57,"time":1508839317000,"timezoneOffset":-480,"year":117}
		 * vc_update_user : admin
		 * vc_uodate_mechanism : 402848bd4830fed70148312e0efb0631
		 * vc_status : null
		 * instanceid : null
		 * del_status : 0
		 * t_task_list_id : 402880ce5f4bfed5015f4c23b0f70136
		 * rownum_ : 1
		 */

		private String t_tylhyxcjc_record_id;
		private DtStartTimeBean dt_start_time;
		private DtEndTimeBean dt_end_time;
		private String vc_location;
		private String vc_jcr;
		private Object vc_jcr_id;
		private String vc_zfzh;
		private String vc_jlr;
		private Object vc_jlr_id;
		private String vc_bjcdwmc;
		private Object vc_bjcdwmc_id;
		private String vc_zzjgdmzh;
		private String vc_fddbr;
		private String vc_fddbrsfzh;
		private String vc_xcfzr;
		private String vc_xcfzrsfzh;
		private int nb_age;
		private String vc_gzdw;
		private String vc_duty;
		private Object vc_ybagx;
		private Object vc_address;
		private Object vc_telephone;
		private Object vc_yzbm;
		private Object cl_qtcjrxmjgzdw;
		private Object vc_hbdwmc;
		private Object vc_hbdwlx;
		private Object vc_hjjclx;
		private Object vc_sfqrzj;
		private Object vc_sfsqhb;
		private Object vc_city;
		private Object vc_county;
		private Object vc_town;
		private Object vc_xzc;
		private Object vc_gyyq;
		private Object vc_pq;
		private Object vc_qyzt;
		private Object vc_qycp;
		private Object vc_ctcl;
		private Object vc_jtcl;
		private Object vc_lscl;
		private Object vc_qtcl;
		private Object vc_sczyyl;
		private String vc_tylgy;
		private Object vc_qttylgy;
		private Object vc_ctjlgy;
		private Object vc_qtctjlgy;
		private Object vc_lsscxscgy;
		private Object vc_zysczzjsb;
		private Object vc_cyjszcsfsyxzl;
		private Object vc_cyjszcsfsyttl;
		private Object dt_xmsj_tima;
		private Object dt_pzlx_time;
		private Object vc_pzlxdw;
		private Object vc_lxpfwh;
		private Object vc_bzhjyxpjbg;
		private Object vc_hpbzdw;
		private Object dt_bz_time;
		private Object vc_sfjddjbz;
		private Object vc_hpspdw;
		private Object dt_hpsp_time;
		private Object vc_hpspwh;
		private Object vc_sfczyjspqk;
		private Object vc_scyfcl;
		private Object vc_zfcpjclfbw;
		private Object vc_gxmcsdsfyhjyxpjwjyz;
		private Object vc_bfdy;
		private Object vc_bzhpbgssfsycyzcttfw;
		private Object vc_mqsfsycyzcttfw;
		private Object dt_trssc_time;
		private Object vc_ljscjgy;
		private Object vc_sfpftyssc;
		private Object vc_hbsscspdw;
		private Object dt_hbsscsp_time;
		private Object vc_hbsscspwh;
		private Object vc_sftghbjgys;
		private Object vc_hbjgysspdw;
		private Object dt_hbjgyssp_time;
		private Object vc_hbjgysspwh;
		private Object vc_sfjxgjghkj;
		private Object cl_jgkjhpjstszdzxqk;
		private Object vc_sfyfqdpwxkz;
		private Object vc_sfazpwxkzdgdpfwrw;
		private Object vc_sfxhjbhbmjxpwsbdj;
		private Object vc_sfjszejnpwf;
		private Object vc_synsjjnpwf;
		private Object vc_yjpwf;
		private Object cl_wzejnpwfyy;
		private Object vc_gqyfsly;
		private Object vc_fstzwrw;
		private Object vc_sjcsl;
		private Object vc_scfsclss;
		private Object vc_cll;
		private Object vc_sffhfsclyq;
		private Object vc_bfhqkms;
		private Object vc_sfsxshfsyshscfsfl;
		private Object vc_sfczgbjgdfspffsxw;
		private Object cl_qksm;
		private Object cl_wxfwzyy;
		private Object vc_yicsl;
		private Object vc_yiczcs;
		private Object vc_ercsl;
		private Object vc_erczcs;
		private Object vc_sancsl;
		private Object vc_sanczcs;
		private Object vc_sicsl;
		private Object vc_siczcs;
		private Object vc_wucsl;
		private Object vc_wuczcs;
		private Object vc_liucsl;
		private Object vc_liuczcs;
		private Object vc_qt;
		private Object vc_qtcsl;
		private Object vc_qtczcs;
		private Object vc_wxfwtzsfjqgf;
		private Object vc_sycsjczqksfxhbbmsb;
		private Object vc_wsbdynx;
		private Object vc_wxfwcfkhcdsfsybs;
		private Object vc_sffhwxfwccgf;
		private Object vc_zcnlscfscsjsfcgyn;
		private Object vc_zcwsfjsyyjxdczc;
		private Object vc_rzyccsfzxwxfwzyldzd;
		private Object vc_ysclsfjyxgzz;
		private Object vc_ysl;
		private Object vc_pc;
		private Object vc_jsdwsfjywfjyzz;
		private Object vc_sjczfs;
		private Object vc_qtybgf;
		private Object vc_sfjxgfcc;
		private Object vc_zhlycssffhhpyq;
		private Object vc_czfs;
		private Object vc_fqcshj;
		private Object vc_sfptfqzlss;
		private Object vc_wptjsssmcw;
		private Object vc_jqjgjcsfcb;
		private Object vc_cbyzjjczw;
		private Object vc_jcdw;
		private Object dt_jc_time;
		private Object vc_zxjczzsfaz;
		private Object dt_zxaz_time;
		private Object vc_sfxhbbmlw;
		private Object vc_sfyxzc;
		private Object vc_sfjgjy;
		private Object dt_jy_time;
		private Object vc_zxjcsjxsw;
		private Object vc_sfahpyqcqcs;
		private Object vc_wptjsdssw;
		private Object vc_hpyqdwsfhjl;
		private Object vc_jlnsfybhmb;
		private Object dt_bhmbjs_time;
		private Object vc_qyzbhjbhqk;
		private Object vc_sflshpjpfyqdfxffdccs;
		private Object vc_cswlsqkms;
		private Object vc_sfbztfhjsjyjya;
		private Object vc_sfbztfhjsjyjyapgba;
		private Object vc_sfayayqjxndyjyl;
		private Object vc_sfcbyjwz;
		private Object cl_qthbbmjcqk;
		private Object cl_czzywt;
		private Object cl_jcyq;
		private DtCreateTimeBean dt_create_time;
		private String vc_create_user;
		private String vc_create_mechanism;
		private DtUpdateTimeBean dt_update_time;
		private String vc_update_user;
		private String vc_uodate_mechanism;
		private Object vc_status;
		private Object instanceid;
		private String del_status;
		private String t_task_list_id;
		private int rownum_;

		public String getT_tylhyxcjc_record_id() {
			return t_tylhyxcjc_record_id;
		}

		public void setT_tylhyxcjc_record_id(String t_tylhyxcjc_record_id) {
			this.t_tylhyxcjc_record_id = t_tylhyxcjc_record_id;
		}

		public DtStartTimeBean getDt_start_time() {
			return dt_start_time;
		}

		public void setDt_start_time(DtStartTimeBean dt_start_time) {
			this.dt_start_time = dt_start_time;
		}

		public DtEndTimeBean getDt_end_time() {
			return dt_end_time;
		}

		public void setDt_end_time(DtEndTimeBean dt_end_time) {
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

		public String getVc_xcfzr() {
			return vc_xcfzr;
		}

		public void setVc_xcfzr(String vc_xcfzr) {
			this.vc_xcfzr = vc_xcfzr;
		}

		public String getVc_xcfzrsfzh() {
			return vc_xcfzrsfzh;
		}

		public void setVc_xcfzrsfzh(String vc_xcfzrsfzh) {
			this.vc_xcfzrsfzh = vc_xcfzrsfzh;
		}

		public int getNb_age() {
			return nb_age;
		}

		public void setNb_age(int nb_age) {
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

		public Object getVc_hjjclx() {
			return vc_hjjclx;
		}

		public void setVc_hjjclx(Object vc_hjjclx) {
			this.vc_hjjclx = vc_hjjclx;
		}

		public Object getVc_sfqrzj() {
			return vc_sfqrzj;
		}

		public void setVc_sfqrzj(Object vc_sfqrzj) {
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

		public Object getVc_qyzt() {
			return vc_qyzt;
		}

		public void setVc_qyzt(Object vc_qyzt) {
			this.vc_qyzt = vc_qyzt;
		}

		public Object getVc_qycp() {
			return vc_qycp;
		}

		public void setVc_qycp(Object vc_qycp) {
			this.vc_qycp = vc_qycp;
		}

		public Object getVc_ctcl() {
			return vc_ctcl;
		}

		public void setVc_ctcl(Object vc_ctcl) {
			this.vc_ctcl = vc_ctcl;
		}

		public Object getVc_jtcl() {
			return vc_jtcl;
		}

		public void setVc_jtcl(Object vc_jtcl) {
			this.vc_jtcl = vc_jtcl;
		}

		public Object getVc_lscl() {
			return vc_lscl;
		}

		public void setVc_lscl(Object vc_lscl) {
			this.vc_lscl = vc_lscl;
		}

		public Object getVc_qtcl() {
			return vc_qtcl;
		}

		public void setVc_qtcl(Object vc_qtcl) {
			this.vc_qtcl = vc_qtcl;
		}

		public Object getVc_sczyyl() {
			return vc_sczyyl;
		}

		public void setVc_sczyyl(Object vc_sczyyl) {
			this.vc_sczyyl = vc_sczyyl;
		}

		public String getVc_tylgy() {
			return vc_tylgy;
		}

		public void setVc_tylgy(String vc_tylgy) {
			this.vc_tylgy = vc_tylgy;
		}

		public Object getVc_qttylgy() {
			return vc_qttylgy;
		}

		public void setVc_qttylgy(Object vc_qttylgy) {
			this.vc_qttylgy = vc_qttylgy;
		}

		public Object getVc_ctjlgy() {
			return vc_ctjlgy;
		}

		public void setVc_ctjlgy(Object vc_ctjlgy) {
			this.vc_ctjlgy = vc_ctjlgy;
		}

		public Object getVc_qtctjlgy() {
			return vc_qtctjlgy;
		}

		public void setVc_qtctjlgy(Object vc_qtctjlgy) {
			this.vc_qtctjlgy = vc_qtctjlgy;
		}

		public Object getVc_lsscxscgy() {
			return vc_lsscxscgy;
		}

		public void setVc_lsscxscgy(Object vc_lsscxscgy) {
			this.vc_lsscxscgy = vc_lsscxscgy;
		}

		public Object getVc_zysczzjsb() {
			return vc_zysczzjsb;
		}

		public void setVc_zysczzjsb(Object vc_zysczzjsb) {
			this.vc_zysczzjsb = vc_zysczzjsb;
		}

		public Object getVc_cyjszcsfsyxzl() {
			return vc_cyjszcsfsyxzl;
		}

		public void setVc_cyjszcsfsyxzl(Object vc_cyjszcsfsyxzl) {
			this.vc_cyjszcsfsyxzl = vc_cyjszcsfsyxzl;
		}

		public Object getVc_cyjszcsfsyttl() {
			return vc_cyjszcsfsyttl;
		}

		public void setVc_cyjszcsfsyttl(Object vc_cyjszcsfsyttl) {
			this.vc_cyjszcsfsyttl = vc_cyjszcsfsyttl;
		}

		public Object getDt_xmsj_tima() {
			return dt_xmsj_tima;
		}

		public void setDt_xmsj_tima(Object dt_xmsj_tima) {
			this.dt_xmsj_tima = dt_xmsj_tima;
		}

		public Object getDt_pzlx_time() {
			return dt_pzlx_time;
		}

		public void setDt_pzlx_time(Object dt_pzlx_time) {
			this.dt_pzlx_time = dt_pzlx_time;
		}

		public Object getVc_pzlxdw() {
			return vc_pzlxdw;
		}

		public void setVc_pzlxdw(Object vc_pzlxdw) {
			this.vc_pzlxdw = vc_pzlxdw;
		}

		public Object getVc_lxpfwh() {
			return vc_lxpfwh;
		}

		public void setVc_lxpfwh(Object vc_lxpfwh) {
			this.vc_lxpfwh = vc_lxpfwh;
		}

		public Object getVc_bzhjyxpjbg() {
			return vc_bzhjyxpjbg;
		}

		public void setVc_bzhjyxpjbg(Object vc_bzhjyxpjbg) {
			this.vc_bzhjyxpjbg = vc_bzhjyxpjbg;
		}

		public Object getVc_hpbzdw() {
			return vc_hpbzdw;
		}

		public void setVc_hpbzdw(Object vc_hpbzdw) {
			this.vc_hpbzdw = vc_hpbzdw;
		}

		public Object getDt_bz_time() {
			return dt_bz_time;
		}

		public void setDt_bz_time(Object dt_bz_time) {
			this.dt_bz_time = dt_bz_time;
		}

		public Object getVc_sfjddjbz() {
			return vc_sfjddjbz;
		}

		public void setVc_sfjddjbz(Object vc_sfjddjbz) {
			this.vc_sfjddjbz = vc_sfjddjbz;
		}

		public Object getVc_hpspdw() {
			return vc_hpspdw;
		}

		public void setVc_hpspdw(Object vc_hpspdw) {
			this.vc_hpspdw = vc_hpspdw;
		}

		public Object getDt_hpsp_time() {
			return dt_hpsp_time;
		}

		public void setDt_hpsp_time(Object dt_hpsp_time) {
			this.dt_hpsp_time = dt_hpsp_time;
		}

		public Object getVc_hpspwh() {
			return vc_hpspwh;
		}

		public void setVc_hpspwh(Object vc_hpspwh) {
			this.vc_hpspwh = vc_hpspwh;
		}

		public Object getVc_sfczyjspqk() {
			return vc_sfczyjspqk;
		}

		public void setVc_sfczyjspqk(Object vc_sfczyjspqk) {
			this.vc_sfczyjspqk = vc_sfczyjspqk;
		}

		public Object getVc_scyfcl() {
			return vc_scyfcl;
		}

		public void setVc_scyfcl(Object vc_scyfcl) {
			this.vc_scyfcl = vc_scyfcl;
		}

		public Object getVc_zfcpjclfbw() {
			return vc_zfcpjclfbw;
		}

		public void setVc_zfcpjclfbw(Object vc_zfcpjclfbw) {
			this.vc_zfcpjclfbw = vc_zfcpjclfbw;
		}

		public Object getVc_gxmcsdsfyhjyxpjwjyz() {
			return vc_gxmcsdsfyhjyxpjwjyz;
		}

		public void setVc_gxmcsdsfyhjyxpjwjyz(Object vc_gxmcsdsfyhjyxpjwjyz) {
			this.vc_gxmcsdsfyhjyxpjwjyz = vc_gxmcsdsfyhjyxpjwjyz;
		}

		public Object getVc_bfdy() {
			return vc_bfdy;
		}

		public void setVc_bfdy(Object vc_bfdy) {
			this.vc_bfdy = vc_bfdy;
		}

		public Object getVc_bzhpbgssfsycyzcttfw() {
			return vc_bzhpbgssfsycyzcttfw;
		}

		public void setVc_bzhpbgssfsycyzcttfw(Object vc_bzhpbgssfsycyzcttfw) {
			this.vc_bzhpbgssfsycyzcttfw = vc_bzhpbgssfsycyzcttfw;
		}

		public Object getVc_mqsfsycyzcttfw() {
			return vc_mqsfsycyzcttfw;
		}

		public void setVc_mqsfsycyzcttfw(Object vc_mqsfsycyzcttfw) {
			this.vc_mqsfsycyzcttfw = vc_mqsfsycyzcttfw;
		}

		public Object getDt_trssc_time() {
			return dt_trssc_time;
		}

		public void setDt_trssc_time(Object dt_trssc_time) {
			this.dt_trssc_time = dt_trssc_time;
		}

		public Object getVc_ljscjgy() {
			return vc_ljscjgy;
		}

		public void setVc_ljscjgy(Object vc_ljscjgy) {
			this.vc_ljscjgy = vc_ljscjgy;
		}

		public Object getVc_sfpftyssc() {
			return vc_sfpftyssc;
		}

		public void setVc_sfpftyssc(Object vc_sfpftyssc) {
			this.vc_sfpftyssc = vc_sfpftyssc;
		}

		public Object getVc_hbsscspdw() {
			return vc_hbsscspdw;
		}

		public void setVc_hbsscspdw(Object vc_hbsscspdw) {
			this.vc_hbsscspdw = vc_hbsscspdw;
		}

		public Object getDt_hbsscsp_time() {
			return dt_hbsscsp_time;
		}

		public void setDt_hbsscsp_time(Object dt_hbsscsp_time) {
			this.dt_hbsscsp_time = dt_hbsscsp_time;
		}

		public Object getVc_hbsscspwh() {
			return vc_hbsscspwh;
		}

		public void setVc_hbsscspwh(Object vc_hbsscspwh) {
			this.vc_hbsscspwh = vc_hbsscspwh;
		}

		public Object getVc_sftghbjgys() {
			return vc_sftghbjgys;
		}

		public void setVc_sftghbjgys(Object vc_sftghbjgys) {
			this.vc_sftghbjgys = vc_sftghbjgys;
		}

		public Object getVc_hbjgysspdw() {
			return vc_hbjgysspdw;
		}

		public void setVc_hbjgysspdw(Object vc_hbjgysspdw) {
			this.vc_hbjgysspdw = vc_hbjgysspdw;
		}

		public Object getDt_hbjgyssp_time() {
			return dt_hbjgyssp_time;
		}

		public void setDt_hbjgyssp_time(Object dt_hbjgyssp_time) {
			this.dt_hbjgyssp_time = dt_hbjgyssp_time;
		}

		public Object getVc_hbjgysspwh() {
			return vc_hbjgysspwh;
		}

		public void setVc_hbjgysspwh(Object vc_hbjgysspwh) {
			this.vc_hbjgysspwh = vc_hbjgysspwh;
		}

		public Object getVc_sfjxgjghkj() {
			return vc_sfjxgjghkj;
		}

		public void setVc_sfjxgjghkj(Object vc_sfjxgjghkj) {
			this.vc_sfjxgjghkj = vc_sfjxgjghkj;
		}

		public Object getCl_jgkjhpjstszdzxqk() {
			return cl_jgkjhpjstszdzxqk;
		}

		public void setCl_jgkjhpjstszdzxqk(Object cl_jgkjhpjstszdzxqk) {
			this.cl_jgkjhpjstszdzxqk = cl_jgkjhpjstszdzxqk;
		}

		public Object getVc_sfyfqdpwxkz() {
			return vc_sfyfqdpwxkz;
		}

		public void setVc_sfyfqdpwxkz(Object vc_sfyfqdpwxkz) {
			this.vc_sfyfqdpwxkz = vc_sfyfqdpwxkz;
		}

		public Object getVc_sfazpwxkzdgdpfwrw() {
			return vc_sfazpwxkzdgdpfwrw;
		}

		public void setVc_sfazpwxkzdgdpfwrw(Object vc_sfazpwxkzdgdpfwrw) {
			this.vc_sfazpwxkzdgdpfwrw = vc_sfazpwxkzdgdpfwrw;
		}

		public Object getVc_sfxhjbhbmjxpwsbdj() {
			return vc_sfxhjbhbmjxpwsbdj;
		}

		public void setVc_sfxhjbhbmjxpwsbdj(Object vc_sfxhjbhbmjxpwsbdj) {
			this.vc_sfxhjbhbmjxpwsbdj = vc_sfxhjbhbmjxpwsbdj;
		}

		public Object getVc_sfjszejnpwf() {
			return vc_sfjszejnpwf;
		}

		public void setVc_sfjszejnpwf(Object vc_sfjszejnpwf) {
			this.vc_sfjszejnpwf = vc_sfjszejnpwf;
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

		public Object getCl_wzejnpwfyy() {
			return cl_wzejnpwfyy;
		}

		public void setCl_wzejnpwfyy(Object cl_wzejnpwfyy) {
			this.cl_wzejnpwfyy = cl_wzejnpwfyy;
		}

		public Object getVc_gqyfsly() {
			return vc_gqyfsly;
		}

		public void setVc_gqyfsly(Object vc_gqyfsly) {
			this.vc_gqyfsly = vc_gqyfsly;
		}

		public Object getVc_fstzwrw() {
			return vc_fstzwrw;
		}

		public void setVc_fstzwrw(Object vc_fstzwrw) {
			this.vc_fstzwrw = vc_fstzwrw;
		}

		public Object getVc_sjcsl() {
			return vc_sjcsl;
		}

		public void setVc_sjcsl(Object vc_sjcsl) {
			this.vc_sjcsl = vc_sjcsl;
		}

		public Object getVc_scfsclss() {
			return vc_scfsclss;
		}

		public void setVc_scfsclss(Object vc_scfsclss) {
			this.vc_scfsclss = vc_scfsclss;
		}

		public Object getVc_cll() {
			return vc_cll;
		}

		public void setVc_cll(Object vc_cll) {
			this.vc_cll = vc_cll;
		}

		public Object getVc_sffhfsclyq() {
			return vc_sffhfsclyq;
		}

		public void setVc_sffhfsclyq(Object vc_sffhfsclyq) {
			this.vc_sffhfsclyq = vc_sffhfsclyq;
		}

		public Object getVc_bfhqkms() {
			return vc_bfhqkms;
		}

		public void setVc_bfhqkms(Object vc_bfhqkms) {
			this.vc_bfhqkms = vc_bfhqkms;
		}

		public Object getVc_sfsxshfsyshscfsfl() {
			return vc_sfsxshfsyshscfsfl;
		}

		public void setVc_sfsxshfsyshscfsfl(Object vc_sfsxshfsyshscfsfl) {
			this.vc_sfsxshfsyshscfsfl = vc_sfsxshfsyshscfsfl;
		}

		public Object getVc_sfczgbjgdfspffsxw() {
			return vc_sfczgbjgdfspffsxw;
		}

		public void setVc_sfczgbjgdfspffsxw(Object vc_sfczgbjgdfspffsxw) {
			this.vc_sfczgbjgdfspffsxw = vc_sfczgbjgdfspffsxw;
		}

		public Object getCl_qksm() {
			return cl_qksm;
		}

		public void setCl_qksm(Object cl_qksm) {
			this.cl_qksm = cl_qksm;
		}

		public Object getCl_wxfwzyy() {
			return cl_wxfwzyy;
		}

		public void setCl_wxfwzyy(Object cl_wxfwzyy) {
			this.cl_wxfwzyy = cl_wxfwzyy;
		}

		public Object getVc_yicsl() {
			return vc_yicsl;
		}

		public void setVc_yicsl(Object vc_yicsl) {
			this.vc_yicsl = vc_yicsl;
		}

		public Object getVc_yiczcs() {
			return vc_yiczcs;
		}

		public void setVc_yiczcs(Object vc_yiczcs) {
			this.vc_yiczcs = vc_yiczcs;
		}

		public Object getVc_ercsl() {
			return vc_ercsl;
		}

		public void setVc_ercsl(Object vc_ercsl) {
			this.vc_ercsl = vc_ercsl;
		}

		public Object getVc_erczcs() {
			return vc_erczcs;
		}

		public void setVc_erczcs(Object vc_erczcs) {
			this.vc_erczcs = vc_erczcs;
		}

		public Object getVc_sancsl() {
			return vc_sancsl;
		}

		public void setVc_sancsl(Object vc_sancsl) {
			this.vc_sancsl = vc_sancsl;
		}

		public Object getVc_sanczcs() {
			return vc_sanczcs;
		}

		public void setVc_sanczcs(Object vc_sanczcs) {
			this.vc_sanczcs = vc_sanczcs;
		}

		public Object getVc_sicsl() {
			return vc_sicsl;
		}

		public void setVc_sicsl(Object vc_sicsl) {
			this.vc_sicsl = vc_sicsl;
		}

		public Object getVc_siczcs() {
			return vc_siczcs;
		}

		public void setVc_siczcs(Object vc_siczcs) {
			this.vc_siczcs = vc_siczcs;
		}

		public Object getVc_wucsl() {
			return vc_wucsl;
		}

		public void setVc_wucsl(Object vc_wucsl) {
			this.vc_wucsl = vc_wucsl;
		}

		public Object getVc_wuczcs() {
			return vc_wuczcs;
		}

		public void setVc_wuczcs(Object vc_wuczcs) {
			this.vc_wuczcs = vc_wuczcs;
		}

		public Object getVc_liucsl() {
			return vc_liucsl;
		}

		public void setVc_liucsl(Object vc_liucsl) {
			this.vc_liucsl = vc_liucsl;
		}

		public Object getVc_liuczcs() {
			return vc_liuczcs;
		}

		public void setVc_liuczcs(Object vc_liuczcs) {
			this.vc_liuczcs = vc_liuczcs;
		}

		public Object getVc_qt() {
			return vc_qt;
		}

		public void setVc_qt(Object vc_qt) {
			this.vc_qt = vc_qt;
		}

		public Object getVc_qtcsl() {
			return vc_qtcsl;
		}

		public void setVc_qtcsl(Object vc_qtcsl) {
			this.vc_qtcsl = vc_qtcsl;
		}

		public Object getVc_qtczcs() {
			return vc_qtczcs;
		}

		public void setVc_qtczcs(Object vc_qtczcs) {
			this.vc_qtczcs = vc_qtczcs;
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

		public Object getVc_zcnlscfscsjsfcgyn() {
			return vc_zcnlscfscsjsfcgyn;
		}

		public void setVc_zcnlscfscsjsfcgyn(Object vc_zcnlscfscsjsfcgyn) {
			this.vc_zcnlscfscsjsfcgyn = vc_zcnlscfscsjsfcgyn;
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

		public Object getVc_qtybgf() {
			return vc_qtybgf;
		}

		public void setVc_qtybgf(Object vc_qtybgf) {
			this.vc_qtybgf = vc_qtybgf;
		}

		public Object getVc_sfjxgfcc() {
			return vc_sfjxgfcc;
		}

		public void setVc_sfjxgfcc(Object vc_sfjxgfcc) {
			this.vc_sfjxgfcc = vc_sfjxgfcc;
		}

		public Object getVc_zhlycssffhhpyq() {
			return vc_zhlycssffhhpyq;
		}

		public void setVc_zhlycssffhhpyq(Object vc_zhlycssffhhpyq) {
			this.vc_zhlycssffhhpyq = vc_zhlycssffhhpyq;
		}

		public Object getVc_czfs() {
			return vc_czfs;
		}

		public void setVc_czfs(Object vc_czfs) {
			this.vc_czfs = vc_czfs;
		}

		public Object getVc_fqcshj() {
			return vc_fqcshj;
		}

		public void setVc_fqcshj(Object vc_fqcshj) {
			this.vc_fqcshj = vc_fqcshj;
		}

		public Object getVc_sfptfqzlss() {
			return vc_sfptfqzlss;
		}

		public void setVc_sfptfqzlss(Object vc_sfptfqzlss) {
			this.vc_sfptfqzlss = vc_sfptfqzlss;
		}

		public Object getVc_wptjsssmcw() {
			return vc_wptjsssmcw;
		}

		public void setVc_wptjsssmcw(Object vc_wptjsssmcw) {
			this.vc_wptjsssmcw = vc_wptjsssmcw;
		}

		public Object getVc_jqjgjcsfcb() {
			return vc_jqjgjcsfcb;
		}

		public void setVc_jqjgjcsfcb(Object vc_jqjgjcsfcb) {
			this.vc_jqjgjcsfcb = vc_jqjgjcsfcb;
		}

		public Object getVc_cbyzjjczw() {
			return vc_cbyzjjczw;
		}

		public void setVc_cbyzjjczw(Object vc_cbyzjjczw) {
			this.vc_cbyzjjczw = vc_cbyzjjczw;
		}

		public Object getVc_jcdw() {
			return vc_jcdw;
		}

		public void setVc_jcdw(Object vc_jcdw) {
			this.vc_jcdw = vc_jcdw;
		}

		public Object getDt_jc_time() {
			return dt_jc_time;
		}

		public void setDt_jc_time(Object dt_jc_time) {
			this.dt_jc_time = dt_jc_time;
		}

		public Object getVc_zxjczzsfaz() {
			return vc_zxjczzsfaz;
		}

		public void setVc_zxjczzsfaz(Object vc_zxjczzsfaz) {
			this.vc_zxjczzsfaz = vc_zxjczzsfaz;
		}

		public Object getDt_zxaz_time() {
			return dt_zxaz_time;
		}

		public void setDt_zxaz_time(Object dt_zxaz_time) {
			this.dt_zxaz_time = dt_zxaz_time;
		}

		public Object getVc_sfxhbbmlw() {
			return vc_sfxhbbmlw;
		}

		public void setVc_sfxhbbmlw(Object vc_sfxhbbmlw) {
			this.vc_sfxhbbmlw = vc_sfxhbbmlw;
		}

		public Object getVc_sfyxzc() {
			return vc_sfyxzc;
		}

		public void setVc_sfyxzc(Object vc_sfyxzc) {
			this.vc_sfyxzc = vc_sfyxzc;
		}

		public Object getVc_sfjgjy() {
			return vc_sfjgjy;
		}

		public void setVc_sfjgjy(Object vc_sfjgjy) {
			this.vc_sfjgjy = vc_sfjgjy;
		}

		public Object getDt_jy_time() {
			return dt_jy_time;
		}

		public void setDt_jy_time(Object dt_jy_time) {
			this.dt_jy_time = dt_jy_time;
		}

		public Object getVc_zxjcsjxsw() {
			return vc_zxjcsjxsw;
		}

		public void setVc_zxjcsjxsw(Object vc_zxjcsjxsw) {
			this.vc_zxjcsjxsw = vc_zxjcsjxsw;
		}

		public Object getVc_sfahpyqcqcs() {
			return vc_sfahpyqcqcs;
		}

		public void setVc_sfahpyqcqcs(Object vc_sfahpyqcqcs) {
			this.vc_sfahpyqcqcs = vc_sfahpyqcqcs;
		}

		public Object getVc_wptjsdssw() {
			return vc_wptjsdssw;
		}

		public void setVc_wptjsdssw(Object vc_wptjsdssw) {
			this.vc_wptjsdssw = vc_wptjsdssw;
		}

		public Object getVc_hpyqdwsfhjl() {
			return vc_hpyqdwsfhjl;
		}

		public void setVc_hpyqdwsfhjl(Object vc_hpyqdwsfhjl) {
			this.vc_hpyqdwsfhjl = vc_hpyqdwsfhjl;
		}

		public Object getVc_jlnsfybhmb() {
			return vc_jlnsfybhmb;
		}

		public void setVc_jlnsfybhmb(Object vc_jlnsfybhmb) {
			this.vc_jlnsfybhmb = vc_jlnsfybhmb;
		}

		public Object getDt_bhmbjs_time() {
			return dt_bhmbjs_time;
		}

		public void setDt_bhmbjs_time(Object dt_bhmbjs_time) {
			this.dt_bhmbjs_time = dt_bhmbjs_time;
		}

		public Object getVc_qyzbhjbhqk() {
			return vc_qyzbhjbhqk;
		}

		public void setVc_qyzbhjbhqk(Object vc_qyzbhjbhqk) {
			this.vc_qyzbhjbhqk = vc_qyzbhjbhqk;
		}

		public Object getVc_sflshpjpfyqdfxffdccs() {
			return vc_sflshpjpfyqdfxffdccs;
		}

		public void setVc_sflshpjpfyqdfxffdccs(Object vc_sflshpjpfyqdfxffdccs) {
			this.vc_sflshpjpfyqdfxffdccs = vc_sflshpjpfyqdfxffdccs;
		}

		public Object getVc_cswlsqkms() {
			return vc_cswlsqkms;
		}

		public void setVc_cswlsqkms(Object vc_cswlsqkms) {
			this.vc_cswlsqkms = vc_cswlsqkms;
		}

		public Object getVc_sfbztfhjsjyjya() {
			return vc_sfbztfhjsjyjya;
		}

		public void setVc_sfbztfhjsjyjya(Object vc_sfbztfhjsjyjya) {
			this.vc_sfbztfhjsjyjya = vc_sfbztfhjsjyjya;
		}

		public Object getVc_sfbztfhjsjyjyapgba() {
			return vc_sfbztfhjsjyjyapgba;
		}

		public void setVc_sfbztfhjsjyjyapgba(Object vc_sfbztfhjsjyjyapgba) {
			this.vc_sfbztfhjsjyjyapgba = vc_sfbztfhjsjyjyapgba;
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

		public DtUpdateTimeBean getDt_update_time() {
			return dt_update_time;
		}

		public void setDt_update_time(DtUpdateTimeBean dt_update_time) {
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

		public static class DtStartTimeBean {
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
			@Override
			public String toString() {
				return
						(year + 1900) + "." + (month + 1) + "." + date
						;
			}
		}

		public static class DtEndTimeBean {
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
			@Override
			public String toString() {
				return
						(year + 1900) + "." + (month + 1) + "." + date
						;
			}
		}

		public static class DtCreateTimeBean {
			/**
			 * date : 24
			 * day : 2
			 * hours : 18
			 * minutes : 1
			 * month : 9
			 * nanos : 0
			 * seconds : 57
			 * time : 1508839317000
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
			@Override
			public String toString() {
				return
						(year + 1900) + "." + (month + 1) + "." + date
						;
			}
		}

		public static class DtUpdateTimeBean {
			/**
			 * date : 24
			 * day : 2
			 * hours : 18
			 * minutes : 1
			 * month : 9
			 * nanos : 0
			 * seconds : 57
			 * time : 1508839317000
			 * timezoneOffset : -480
			 * year : 117
			 */
			@Override
			public String toString() {
				return
						(year + 1900) + "." + (month + 1) + "." + date
						;
			}
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
