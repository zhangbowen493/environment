package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * 16、城镇污水处理厂现场监察记录页面bean
 * Created by zbw on 2017/10/26 14:48.
 */

public class SewageTreatmentPlantMonitorBean {

	@Override
	public String toString() {
		return "SewageTreatmentPlantMonitorBean{" +
				"msg='" + msg + '\'' +
				", success='" + success + '\'' +
				", data=" + data +
				'}';
	}

	/**
	 * data : [{"t_czwsclcxcjc_record_id":"402880ce5f5795cd015f57c4d2f10384","dt_start_time":{"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117},"dt_end_time":{"date":28,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509120000000,"timezoneOffset":-480,"year":117},"vc_location":"涩涩的非常v","vc_jcr":"admin_1","vc_jcr_id":null,"vc_zfzh":"2134567890","vc_jlr":"超级管理员","vc_jlr_id":null,"vc_bjcdwmc":"为岁的法国","vc_bjcdwmc_id":null,"vc_zzjgdmzh":"1234567890","vc_fddbr":null,"vc_fddbrsfzh":null,"vc_xcfzr":null,"vc_xcfzrsfzh":null,"nb_age":null,"vc_gzdw":null,"vc_duty":null,"vc_ybagx":null,"vc_address":null,"vc_telephone":null,"vc_yzbm":null,"cl_qtcjrxmjgzdw":null,"vc_hbdwmc":null,"vc_hbdwlx":null,"vc_hjjclx":"2,3","vc_sfqrzj":null,"vc_sfsqhb":null,"vc_jcdds":null,"vc_jcddx":null,"vc_jcddz":null,"dt_construction_time":null,"dt_run_time":null,"vc_s_sjclnl":null,"vc_j_sjclnl":null,"vc_sffqjs":null,"vc_ptwgsfyqbjc":null,"vc_yxms":"2","vc_yydw":null,"dt_pz_time":null,"vc_pzdw":null,"vc_hb_lxpfwh":null,"dt_hb_sfblhpsx":null,"vc_hb_kgjs_time":null,"vc_hb_hjyxpjbglx":null,"vc_hb_hpbzdw":null,"dt_hb_bzsj":null,"vc_hb_hpspbm":null,"dt_hb_hpsp_time":null,"vc_hb_scsyxdspbm":null,"dt_hb_scsp_time":null,"vc_hb_spwh":null,"vc_hb_sftghbjgys":null,"dt_hb_ys_time":null,"vc_hb_zzysbm":null,"cl_hb_wysqksm":null,"vc_kj_sfzyzjxggkj":null,"dt_kj_gkj_time":null,"vc_kj_pzlxbm":null,"vc_kj_lxpfwh":null,"vc_kj_sfblhpsx":null,"vc_kj_hpspbm":null,"column_88":null,"dt_kj_hpsp_time":null,"vc_kj_gkjscsyxspbm":null,"dt_kj_gkjyxsp_time":null,"vc_kj_spwh":null,"vc_kj_sftghbjgys":null,"dt_kj_ys_time":null,"vc_kj_zzysbm":null,"cl_kj_wysqksm":null,"vc_jskcod":null,"vc_jsknh":null,"vc_jskbod":null,"vc_jskss":null,"vc_jskzl":null,"vc_jskzd":null,"vc_jskfdcj":null,"vc_jskzjsjs":null,"vc_cskcod":null,"vc_csknh":null,"vc_cskbod":null,"vc_cskss":null,"vc_cskzl":null,"vc_cskzd":null,"vc_cskfdcj":null,"vc_wscldwhdl":null,"vc_hdlsffhljgx":null,"vc_wspfqx":null,"vc_sfsjyysyd":null,"vc_szjb":null,"vc_sfssaggqsbdtpzplp":null,"cl_qksm":null,"vc_csksfgfhsz":null,"cl_qtqksm":null,"vc_zxjjbz":null,"vc_jqjcsfcb":null,"vc_cbwryz":null,"vc_cbbs":null,"vc_jcdw":null,"dt_jc_time":null,"vc_sfyxdss":null,"vc_xdfs":null,"vc_gzjsfzcsy":null,"vc_tnjsyqk":null,"vc_tswnncsl":null,"vc_nczzl":null,"vc_wnczfs":null,"vc_qtwnczfs":null,"vc_sffhbzyq":null,"vc_dfysclfssffhhpjpfyq":null,"vc_bfhqkms":null,"vc_sfjyzzddwjxwxfwjd":null,"vc_jddw":null,"vc_wnwfclfs":null,"vc_sffhhpjpfdxgyq":null,"vc_wnwf_bfhqkms":null,"vc_wxfwtzsfjqgf":null,"vc_sycsjczqksfxhbbmsb":null,"vc_sfzdlwxfwywsgffcshyjfa":null,"vc_wxfwcfkhcdsfsybs":null,"vc_sffhwxfwccgf":null,"vc_sfczwxfwyybgfhd":null,"vc_zcnyscfdcsjsfcgyn":null,"vc_rznccsfzxwxfwzyldzd":null,"vc_yscljyxgzz":null,"vc_ysl":null,"vc_pc":null,"vc_jsdwsfjywfjyxkz":null,"vc_sjczfs":null,"vc_cqy":null,"vc_qtcqy":null,"vc_eczldccsjsssfls":null,"vc_ecwlsqkms":null,"vc_zsy":null,"vc_qtzsy":null,"vc_jzcssfls":null,"vc_jzwlsqkms":null,"vc_zsjqjcsfdb":null,"vc_zs_jcdw":null,"dt_zsjc_time":null,"vc_gcsfahbbmyqazlzxjcsb":null,"vc_qyddszsffhgjyq":null,"vc_jcsbsfjxlbdys":null,"vc_yxsfzc":null,"vc_gzrysfqdhbbsgpxdzgzs":null,"vc_ywtzsfgf":null,"vc_gczkxtsfyxzc":null,"vc_zkxtqxsjccsfddsegy":null,"vc_zksjyzxsjsfyz":null,"vc_sfyhbbmlw":null,"vc_zk_ywtzsfgf":null,"vc_sflshpjpfyqdfxffdccs":null,"vc_hjfx_wlsqkms":null,"vc_sfbztfhjsjyjya":null,"vc_sfdtfhjsjyjyajxpgbba":null,"vc_sfayayqjxndyjyl":null,"vc_sfcbyjwz":null,"cl_qthbbmjcqk":null,"cl_czzywt":null,"cl_jcyq":null,"dt_create_time":{"date":26,"day":4,"hours":16,"minutes":19,"month":9,"nanos":0,"seconds":42,"time":1509005982000,"timezoneOffset":-480,"year":117},"vc_create_user":"admin","vc_create_mechanism":"402848bd4830fed70148312e0efb0631","dt_update_time":{"date":26,"day":4,"hours":16,"minutes":20,"month":9,"nanos":0,"seconds":9,"time":1509006009000,"timezoneOffset":-480,"year":117},"vc_update_user":"admin","vc_uodate_mechanism":"402848bd4830fed70148312e0efb0631","vc_status":null,"instanceid":null,"del_status":"0","t_task_list_id":"402880ce5f4bfed5015f4c23b0f70136","rownum_":1}]
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
					"t_czwsclcxcjc_record_id='" + t_czwsclcxcjc_record_id + '\'' +
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
					", vc_fddbr=" + vc_fddbr +
					", vc_fddbrsfzh=" + vc_fddbrsfzh +
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
					", vc_sfqrzj=" + vc_sfqrzj +
					", vc_sfsqhb=" + vc_sfsqhb +
					", vc_jcdds=" + vc_jcdds +
					", vc_jcddx=" + vc_jcddx +
					", vc_jcddz=" + vc_jcddz +
					", dt_construction_time=" + dt_construction_time +
					", dt_run_time=" + dt_run_time +
					", vc_s_sjclnl=" + vc_s_sjclnl +
					", vc_j_sjclnl=" + vc_j_sjclnl +
					", vc_sffqjs=" + vc_sffqjs +
					", vc_ptwgsfyqbjc=" + vc_ptwgsfyqbjc +
					", vc_yxms='" + vc_yxms + '\'' +
					", vc_yydw=" + vc_yydw +
					", dt_pz_time=" + dt_pz_time +
					", vc_pzdw=" + vc_pzdw +
					", vc_hb_lxpfwh=" + vc_hb_lxpfwh +
					", dt_hb_sfblhpsx=" + dt_hb_sfblhpsx +
					", vc_hb_kgjs_time=" + vc_hb_kgjs_time +
					", vc_hb_hjyxpjbglx=" + vc_hb_hjyxpjbglx +
					", vc_hb_hpbzdw=" + vc_hb_hpbzdw +
					", dt_hb_bzsj=" + dt_hb_bzsj +
					", vc_hb_hpspbm=" + vc_hb_hpspbm +
					", dt_hb_hpsp_time=" + dt_hb_hpsp_time +
					", vc_hb_scsyxdspbm=" + vc_hb_scsyxdspbm +
					", dt_hb_scsp_time=" + dt_hb_scsp_time +
					", vc_hb_spwh=" + vc_hb_spwh +
					", vc_hb_sftghbjgys=" + vc_hb_sftghbjgys +
					", dt_hb_ys_time=" + dt_hb_ys_time +
					", vc_hb_zzysbm=" + vc_hb_zzysbm +
					", cl_hb_wysqksm=" + cl_hb_wysqksm +
					", vc_kj_sfzyzjxggkj=" + vc_kj_sfzyzjxggkj +
					", dt_kj_gkj_time=" + dt_kj_gkj_time +
					", vc_kj_pzlxbm=" + vc_kj_pzlxbm +
					", vc_kj_lxpfwh=" + vc_kj_lxpfwh +
					", vc_kj_sfblhpsx=" + vc_kj_sfblhpsx +
					", vc_kj_hpspbm=" + vc_kj_hpspbm +
					", column_88=" + column_88 +
					", dt_kj_hpsp_time=" + dt_kj_hpsp_time +
					", vc_kj_gkjscsyxspbm=" + vc_kj_gkjscsyxspbm +
					", dt_kj_gkjyxsp_time=" + dt_kj_gkjyxsp_time +
					", vc_kj_spwh=" + vc_kj_spwh +
					", vc_kj_sftghbjgys=" + vc_kj_sftghbjgys +
					", dt_kj_ys_time=" + dt_kj_ys_time +
					", vc_kj_zzysbm=" + vc_kj_zzysbm +
					", cl_kj_wysqksm=" + cl_kj_wysqksm +
					", vc_jskcod=" + vc_jskcod +
					", vc_jsknh=" + vc_jsknh +
					", vc_jskbod=" + vc_jskbod +
					", vc_jskss=" + vc_jskss +
					", vc_jskzl=" + vc_jskzl +
					", vc_jskzd=" + vc_jskzd +
					", vc_jskfdcj=" + vc_jskfdcj +
					", vc_jskzjsjs=" + vc_jskzjsjs +
					", vc_cskcod=" + vc_cskcod +
					", vc_csknh=" + vc_csknh +
					", vc_cskbod=" + vc_cskbod +
					", vc_cskss=" + vc_cskss +
					", vc_cskzl=" + vc_cskzl +
					", vc_cskzd=" + vc_cskzd +
					", vc_cskfdcj=" + vc_cskfdcj +
					", vc_wscldwhdl=" + vc_wscldwhdl +
					", vc_hdlsffhljgx=" + vc_hdlsffhljgx +
					", vc_wspfqx=" + vc_wspfqx +
					", vc_sfsjyysyd=" + vc_sfsjyysyd +
					", vc_szjb=" + vc_szjb +
					", vc_sfssaggqsbdtpzplp=" + vc_sfssaggqsbdtpzplp +
					", cl_qksm=" + cl_qksm +
					", vc_csksfgfhsz=" + vc_csksfgfhsz +
					", cl_qtqksm=" + cl_qtqksm +
					", vc_zxjjbz=" + vc_zxjjbz +
					", vc_jqjcsfcb=" + vc_jqjcsfcb +
					", vc_cbwryz=" + vc_cbwryz +
					", vc_cbbs=" + vc_cbbs +
					", vc_jcdw=" + vc_jcdw +
					", dt_jc_time=" + dt_jc_time +
					", vc_sfyxdss=" + vc_sfyxdss +
					", vc_xdfs=" + vc_xdfs +
					", vc_gzjsfzcsy=" + vc_gzjsfzcsy +
					", vc_tnjsyqk=" + vc_tnjsyqk +
					", vc_tswnncsl=" + vc_tswnncsl +
					", vc_nczzl=" + vc_nczzl +
					", vc_wnczfs=" + vc_wnczfs +
					", vc_qtwnczfs=" + vc_qtwnczfs +
					", vc_sffhbzyq=" + vc_sffhbzyq +
					", vc_dfysclfssffhhpjpfyq=" + vc_dfysclfssffhhpjpfyq +
					", vc_bfhqkms=" + vc_bfhqkms +
					", vc_sfjyzzddwjxwxfwjd=" + vc_sfjyzzddwjxwxfwjd +
					", vc_jddw=" + vc_jddw +
					", vc_wnwfclfs=" + vc_wnwfclfs +
					", vc_sffhhpjpfdxgyq=" + vc_sffhhpjpfdxgyq +
					", vc_wnwf_bfhqkms=" + vc_wnwf_bfhqkms +
					", vc_wxfwtzsfjqgf=" + vc_wxfwtzsfjqgf +
					", vc_sycsjczqksfxhbbmsb=" + vc_sycsjczqksfxhbbmsb +
					", vc_sfzdlwxfwywsgffcshyjfa=" + vc_sfzdlwxfwywsgffcshyjfa +
					", vc_wxfwcfkhcdsfsybs=" + vc_wxfwcfkhcdsfsybs +
					", vc_sffhwxfwccgf=" + vc_sffhwxfwccgf +
					", vc_sfczwxfwyybgfhd=" + vc_sfczwxfwyybgfhd +
					", vc_zcnyscfdcsjsfcgyn=" + vc_zcnyscfdcsjsfcgyn +
					", vc_rznccsfzxwxfwzyldzd=" + vc_rznccsfzxwxfwzyldzd +
					", vc_yscljyxgzz=" + vc_yscljyxgzz +
					", vc_ysl=" + vc_ysl +
					", vc_pc=" + vc_pc +
					", vc_jsdwsfjywfjyxkz=" + vc_jsdwsfjywfjyxkz +
					", vc_sjczfs=" + vc_sjczfs +
					", vc_cqy=" + vc_cqy +
					", vc_qtcqy=" + vc_qtcqy +
					", vc_eczldccsjsssfls=" + vc_eczldccsjsssfls +
					", vc_ecwlsqkms=" + vc_ecwlsqkms +
					", vc_zsy=" + vc_zsy +
					", vc_qtzsy=" + vc_qtzsy +
					", vc_jzcssfls=" + vc_jzcssfls +
					", vc_jzwlsqkms=" + vc_jzwlsqkms +
					", vc_zsjqjcsfdb=" + vc_zsjqjcsfdb +
					", vc_zs_jcdw=" + vc_zs_jcdw +
					", dt_zsjc_time=" + dt_zsjc_time +
					", vc_gcsfahbbmyqazlzxjcsb=" + vc_gcsfahbbmyqazlzxjcsb +
					", vc_qyddszsffhgjyq=" + vc_qyddszsffhgjyq +
					", vc_jcsbsfjxlbdys=" + vc_jcsbsfjxlbdys +
					", vc_yxsfzc=" + vc_yxsfzc +
					", vc_gzrysfqdhbbsgpxdzgzs=" + vc_gzrysfqdhbbsgpxdzgzs +
					", vc_ywtzsfgf=" + vc_ywtzsfgf +
					", vc_gczkxtsfyxzc=" + vc_gczkxtsfyxzc +
					", vc_zkxtqxsjccsfddsegy=" + vc_zkxtqxsjccsfddsegy +
					", vc_zksjyzxsjsfyz=" + vc_zksjyzxsjsfyz +
					", vc_sfyhbbmlw=" + vc_sfyhbbmlw +
					", vc_zk_ywtzsfgf=" + vc_zk_ywtzsfgf +
					", vc_sflshpjpfyqdfxffdccs=" + vc_sflshpjpfyqdfxffdccs +
					", vc_hjfx_wlsqkms=" + vc_hjfx_wlsqkms +
					", vc_sfbztfhjsjyjya=" + vc_sfbztfhjsjyjya +
					", vc_sfdtfhjsjyjyajxpgbba=" + vc_sfdtfhjsjyjyajxpgbba +
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
		 * t_czwsclcxcjc_record_id : 402880ce5f5795cd015f57c4d2f10384
		 * dt_start_time : {"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117}
		 * dt_end_time : {"date":28,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509120000000,"timezoneOffset":-480,"year":117}
		 * vc_location : 涩涩的非常v
		 * vc_jcr : admin_1
		 * vc_jcr_id : null
		 * vc_zfzh : 2134567890
		 * vc_jlr : 超级管理员
		 * vc_jlr_id : null
		 * vc_bjcdwmc : 为岁的法国
		 * vc_bjcdwmc_id : null
		 * vc_zzjgdmzh : 1234567890
		 * vc_fddbr : null
		 * vc_fddbrsfzh : null
		 * vc_xcfzr : null
		 * vc_xcfzrsfzh : null
		 * nb_age : null
		 * vc_gzdw : null
		 * vc_duty : null
		 * vc_ybagx : null
		 * vc_address : null
		 * vc_telephone : null
		 * vc_yzbm : null
		 * cl_qtcjrxmjgzdw : null
		 * vc_hbdwmc : null
		 * vc_hbdwlx : null
		 * vc_hjjclx : 2,3
		 * vc_sfqrzj : null
		 * vc_sfsqhb : null
		 * vc_jcdds : null
		 * vc_jcddx : null
		 * vc_jcddz : null
		 * dt_construction_time : null
		 * dt_run_time : null
		 * vc_s_sjclnl : null
		 * vc_j_sjclnl : null
		 * vc_sffqjs : null
		 * vc_ptwgsfyqbjc : null
		 * vc_yxms : 2
		 * vc_yydw : null
		 * dt_pz_time : null
		 * vc_pzdw : null
		 * vc_hb_lxpfwh : null
		 * dt_hb_sfblhpsx : null
		 * vc_hb_kgjs_time : null
		 * vc_hb_hjyxpjbglx : null
		 * vc_hb_hpbzdw : null
		 * dt_hb_bzsj : null
		 * vc_hb_hpspbm : null
		 * dt_hb_hpsp_time : null
		 * vc_hb_scsyxdspbm : null
		 * dt_hb_scsp_time : null
		 * vc_hb_spwh : null
		 * vc_hb_sftghbjgys : null
		 * dt_hb_ys_time : null
		 * vc_hb_zzysbm : null
		 * cl_hb_wysqksm : null
		 * vc_kj_sfzyzjxggkj : null
		 * dt_kj_gkj_time : null
		 * vc_kj_pzlxbm : null
		 * vc_kj_lxpfwh : null
		 * vc_kj_sfblhpsx : null
		 * vc_kj_hpspbm : null
		 * column_88 : null
		 * dt_kj_hpsp_time : null
		 * vc_kj_gkjscsyxspbm : null
		 * dt_kj_gkjyxsp_time : null
		 * vc_kj_spwh : null
		 * vc_kj_sftghbjgys : null
		 * dt_kj_ys_time : null
		 * vc_kj_zzysbm : null
		 * cl_kj_wysqksm : null
		 * vc_jskcod : null
		 * vc_jsknh : null
		 * vc_jskbod : null
		 * vc_jskss : null
		 * vc_jskzl : null
		 * vc_jskzd : null
		 * vc_jskfdcj : null
		 * vc_jskzjsjs : null
		 * vc_cskcod : null
		 * vc_csknh : null
		 * vc_cskbod : null
		 * vc_cskss : null
		 * vc_cskzl : null
		 * vc_cskzd : null
		 * vc_cskfdcj : null
		 * vc_wscldwhdl : null
		 * vc_hdlsffhljgx : null
		 * vc_wspfqx : null
		 * vc_sfsjyysyd : null
		 * vc_szjb : null
		 * vc_sfssaggqsbdtpzplp : null
		 * cl_qksm : null
		 * vc_csksfgfhsz : null
		 * cl_qtqksm : null
		 * vc_zxjjbz : null
		 * vc_jqjcsfcb : null
		 * vc_cbwryz : null
		 * vc_cbbs : null
		 * vc_jcdw : null
		 * dt_jc_time : null
		 * vc_sfyxdss : null
		 * vc_xdfs : null
		 * vc_gzjsfzcsy : null
		 * vc_tnjsyqk : null
		 * vc_tswnncsl : null
		 * vc_nczzl : null
		 * vc_wnczfs : null
		 * vc_qtwnczfs : null
		 * vc_sffhbzyq : null
		 * vc_dfysclfssffhhpjpfyq : null
		 * vc_bfhqkms : null
		 * vc_sfjyzzddwjxwxfwjd : null
		 * vc_jddw : null
		 * vc_wnwfclfs : null
		 * vc_sffhhpjpfdxgyq : null
		 * vc_wnwf_bfhqkms : null
		 * vc_wxfwtzsfjqgf : null
		 * vc_sycsjczqksfxhbbmsb : null
		 * vc_sfzdlwxfwywsgffcshyjfa : null
		 * vc_wxfwcfkhcdsfsybs : null
		 * vc_sffhwxfwccgf : null
		 * vc_sfczwxfwyybgfhd : null
		 * vc_zcnyscfdcsjsfcgyn : null
		 * vc_rznccsfzxwxfwzyldzd : null
		 * vc_yscljyxgzz : null
		 * vc_ysl : null
		 * vc_pc : null
		 * vc_jsdwsfjywfjyxkz : null
		 * vc_sjczfs : null
		 * vc_cqy : null
		 * vc_qtcqy : null
		 * vc_eczldccsjsssfls : null
		 * vc_ecwlsqkms : null
		 * vc_zsy : null
		 * vc_qtzsy : null
		 * vc_jzcssfls : null
		 * vc_jzwlsqkms : null
		 * vc_zsjqjcsfdb : null
		 * vc_zs_jcdw : null
		 * dt_zsjc_time : null
		 * vc_gcsfahbbmyqazlzxjcsb : null
		 * vc_qyddszsffhgjyq : null
		 * vc_jcsbsfjxlbdys : null
		 * vc_yxsfzc : null
		 * vc_gzrysfqdhbbsgpxdzgzs : null
		 * vc_ywtzsfgf : null
		 * vc_gczkxtsfyxzc : null
		 * vc_zkxtqxsjccsfddsegy : null
		 * vc_zksjyzxsjsfyz : null
		 * vc_sfyhbbmlw : null
		 * vc_zk_ywtzsfgf : null
		 * vc_sflshpjpfyqdfxffdccs : null
		 * vc_hjfx_wlsqkms : null
		 * vc_sfbztfhjsjyjya : null
		 * vc_sfdtfhjsjyjyajxpgbba : null
		 * vc_sfayayqjxndyjyl : null
		 * vc_sfcbyjwz : null
		 * cl_qthbbmjcqk : null
		 * cl_czzywt : null
		 * cl_jcyq : null
		 * dt_create_time : {"date":26,"day":4,"hours":16,"minutes":19,"month":9,"nanos":0,"seconds":42,"time":1509005982000,"timezoneOffset":-480,"year":117}
		 * vc_create_user : admin
		 * vc_create_mechanism : 402848bd4830fed70148312e0efb0631
		 * dt_update_time : {"date":26,"day":4,"hours":16,"minutes":20,"month":9,"nanos":0,"seconds":9,"time":1509006009000,"timezoneOffset":-480,"year":117}
		 * vc_update_user : admin
		 * vc_uodate_mechanism : 402848bd4830fed70148312e0efb0631
		 * vc_status : null
		 * instanceid : null
		 * del_status : 0
		 * t_task_list_id : 402880ce5f4bfed5015f4c23b0f70136
		 * rownum_ : 1
		 */

		private String t_czwsclcxcjc_record_id;
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
		private Object vc_fddbr;
		private Object vc_fddbrsfzh;
		private Object vc_xcfzr;
		private Object vc_xcfzrsfzh;
		private Object nb_age;
		private Object vc_gzdw;
		private Object vc_duty;
		private Object vc_ybagx;
		private Object vc_address;
		private Object vc_telephone;
		private Object vc_yzbm;
		private Object cl_qtcjrxmjgzdw;
		private Object vc_hbdwmc;
		private Object vc_hbdwlx;
		private String vc_hjjclx;
		private Object vc_sfqrzj;
		private Object vc_sfsqhb;
		private Object vc_jcdds;
		private Object vc_jcddx;
		private Object vc_jcddz;
		private Object dt_construction_time;
		private Object dt_run_time;
		private Object vc_s_sjclnl;
		private Object vc_j_sjclnl;
		private Object vc_sffqjs;
		private Object vc_ptwgsfyqbjc;
		private String vc_yxms;
		private Object vc_yydw;
		private Object dt_pz_time;
		private Object vc_pzdw;
		private Object vc_hb_lxpfwh;
		private Object dt_hb_sfblhpsx;
		private Object vc_hb_kgjs_time;
		private Object vc_hb_hjyxpjbglx;
		private Object vc_hb_hpbzdw;
		private Object dt_hb_bzsj;
		private Object vc_hb_hpspbm;
		private Object dt_hb_hpsp_time;
		private Object vc_hb_scsyxdspbm;
		private Object dt_hb_scsp_time;
		private Object vc_hb_spwh;
		private Object vc_hb_sftghbjgys;
		private Object dt_hb_ys_time;
		private Object vc_hb_zzysbm;
		private Object cl_hb_wysqksm;
		private Object vc_kj_sfzyzjxggkj;
		private Object dt_kj_gkj_time;
		private Object vc_kj_pzlxbm;
		private Object vc_kj_lxpfwh;
		private Object vc_kj_sfblhpsx;
		private Object vc_kj_hpspbm;
		private Object column_88;
		private Object dt_kj_hpsp_time;
		private Object vc_kj_gkjscsyxspbm;
		private Object dt_kj_gkjyxsp_time;
		private Object vc_kj_spwh;
		private Object vc_kj_sftghbjgys;
		private Object dt_kj_ys_time;
		private Object vc_kj_zzysbm;
		private Object cl_kj_wysqksm;
		private Object vc_jskcod;
		private Object vc_jsknh;
		private Object vc_jskbod;
		private Object vc_jskss;
		private Object vc_jskzl;
		private Object vc_jskzd;
		private Object vc_jskfdcj;
		private Object vc_jskzjsjs;
		private Object vc_cskcod;
		private Object vc_csknh;
		private Object vc_cskbod;
		private Object vc_cskss;
		private Object vc_cskzl;
		private Object vc_cskzd;
		private Object vc_cskfdcj;
		private Object vc_wscldwhdl;
		private Object vc_hdlsffhljgx;
		private Object vc_wspfqx;
		private Object vc_sfsjyysyd;
		private Object vc_szjb;
		private Object vc_sfssaggqsbdtpzplp;
		private Object cl_qksm;
		private Object vc_csksfgfhsz;
		private Object cl_qtqksm;
		private Object vc_zxjjbz;
		private Object vc_jqjcsfcb;
		private Object vc_cbwryz;
		private Object vc_cbbs;
		private Object vc_jcdw;
		private Object dt_jc_time;
		private Object vc_sfyxdss;
		private Object vc_xdfs;
		private Object vc_gzjsfzcsy;
		private Object vc_tnjsyqk;
		private Object vc_tswnncsl;
		private Object vc_nczzl;
		private Object vc_wnczfs;
		private Object vc_qtwnczfs;
		private Object vc_sffhbzyq;
		private Object vc_dfysclfssffhhpjpfyq;
		private Object vc_bfhqkms;
		private Object vc_sfjyzzddwjxwxfwjd;
		private Object vc_jddw;
		private Object vc_wnwfclfs;
		private Object vc_sffhhpjpfdxgyq;
		private Object vc_wnwf_bfhqkms;
		private Object vc_wxfwtzsfjqgf;
		private Object vc_sycsjczqksfxhbbmsb;
		private Object vc_sfzdlwxfwywsgffcshyjfa;
		private Object vc_wxfwcfkhcdsfsybs;
		private Object vc_sffhwxfwccgf;
		private Object vc_sfczwxfwyybgfhd;
		private Object vc_zcnyscfdcsjsfcgyn;
		private Object vc_rznccsfzxwxfwzyldzd;
		private Object vc_yscljyxgzz;
		private Object vc_ysl;
		private Object vc_pc;
		private Object vc_jsdwsfjywfjyxkz;
		private Object vc_sjczfs;
		private Object vc_cqy;
		private Object vc_qtcqy;
		private Object vc_eczldccsjsssfls;
		private Object vc_ecwlsqkms;
		private Object vc_zsy;
		private Object vc_qtzsy;
		private Object vc_jzcssfls;
		private Object vc_jzwlsqkms;
		private Object vc_zsjqjcsfdb;
		private Object vc_zs_jcdw;
		private Object dt_zsjc_time;
		private Object vc_gcsfahbbmyqazlzxjcsb;
		private Object vc_qyddszsffhgjyq;
		private Object vc_jcsbsfjxlbdys;
		private Object vc_yxsfzc;
		private Object vc_gzrysfqdhbbsgpxdzgzs;
		private Object vc_ywtzsfgf;
		private Object vc_gczkxtsfyxzc;
		private Object vc_zkxtqxsjccsfddsegy;
		private Object vc_zksjyzxsjsfyz;
		private Object vc_sfyhbbmlw;
		private Object vc_zk_ywtzsfgf;
		private Object vc_sflshpjpfyqdfxffdccs;
		private Object vc_hjfx_wlsqkms;
		private Object vc_sfbztfhjsjyjya;
		private Object vc_sfdtfhjsjyjyajxpgbba;
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

		public String getT_czwsclcxcjc_record_id() {
			return t_czwsclcxcjc_record_id;
		}

		public void setT_czwsclcxcjc_record_id(String t_czwsclcxcjc_record_id) {
			this.t_czwsclcxcjc_record_id = t_czwsclcxcjc_record_id;
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

		public Object getVc_fddbr() {
			return vc_fddbr;
		}

		public void setVc_fddbr(Object vc_fddbr) {
			this.vc_fddbr = vc_fddbr;
		}

		public Object getVc_fddbrsfzh() {
			return vc_fddbrsfzh;
		}

		public void setVc_fddbrsfzh(Object vc_fddbrsfzh) {
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

		public Object getVc_jcdds() {
			return vc_jcdds;
		}

		public void setVc_jcdds(Object vc_jcdds) {
			this.vc_jcdds = vc_jcdds;
		}

		public Object getVc_jcddx() {
			return vc_jcddx;
		}

		public void setVc_jcddx(Object vc_jcddx) {
			this.vc_jcddx = vc_jcddx;
		}

		public Object getVc_jcddz() {
			return vc_jcddz;
		}

		public void setVc_jcddz(Object vc_jcddz) {
			this.vc_jcddz = vc_jcddz;
		}

		public Object getDt_construction_time() {
			return dt_construction_time;
		}

		public void setDt_construction_time(Object dt_construction_time) {
			this.dt_construction_time = dt_construction_time;
		}

		public Object getDt_run_time() {
			return dt_run_time;
		}

		public void setDt_run_time(Object dt_run_time) {
			this.dt_run_time = dt_run_time;
		}

		public Object getVc_s_sjclnl() {
			return vc_s_sjclnl;
		}

		public void setVc_s_sjclnl(Object vc_s_sjclnl) {
			this.vc_s_sjclnl = vc_s_sjclnl;
		}

		public Object getVc_j_sjclnl() {
			return vc_j_sjclnl;
		}

		public void setVc_j_sjclnl(Object vc_j_sjclnl) {
			this.vc_j_sjclnl = vc_j_sjclnl;
		}

		public Object getVc_sffqjs() {
			return vc_sffqjs;
		}

		public void setVc_sffqjs(Object vc_sffqjs) {
			this.vc_sffqjs = vc_sffqjs;
		}

		public Object getVc_ptwgsfyqbjc() {
			return vc_ptwgsfyqbjc;
		}

		public void setVc_ptwgsfyqbjc(Object vc_ptwgsfyqbjc) {
			this.vc_ptwgsfyqbjc = vc_ptwgsfyqbjc;
		}

		public String getVc_yxms() {
			return vc_yxms;
		}

		public void setVc_yxms(String vc_yxms) {
			this.vc_yxms = vc_yxms;
		}

		public Object getVc_yydw() {
			return vc_yydw;
		}

		public void setVc_yydw(Object vc_yydw) {
			this.vc_yydw = vc_yydw;
		}

		public Object getDt_pz_time() {
			return dt_pz_time;
		}

		public void setDt_pz_time(Object dt_pz_time) {
			this.dt_pz_time = dt_pz_time;
		}

		public Object getVc_pzdw() {
			return vc_pzdw;
		}

		public void setVc_pzdw(Object vc_pzdw) {
			this.vc_pzdw = vc_pzdw;
		}

		public Object getVc_hb_lxpfwh() {
			return vc_hb_lxpfwh;
		}

		public void setVc_hb_lxpfwh(Object vc_hb_lxpfwh) {
			this.vc_hb_lxpfwh = vc_hb_lxpfwh;
		}

		public Object getDt_hb_sfblhpsx() {
			return dt_hb_sfblhpsx;
		}

		public void setDt_hb_sfblhpsx(Object dt_hb_sfblhpsx) {
			this.dt_hb_sfblhpsx = dt_hb_sfblhpsx;
		}

		public Object getVc_hb_kgjs_time() {
			return vc_hb_kgjs_time;
		}

		public void setVc_hb_kgjs_time(Object vc_hb_kgjs_time) {
			this.vc_hb_kgjs_time = vc_hb_kgjs_time;
		}

		public Object getVc_hb_hjyxpjbglx() {
			return vc_hb_hjyxpjbglx;
		}

		public void setVc_hb_hjyxpjbglx(Object vc_hb_hjyxpjbglx) {
			this.vc_hb_hjyxpjbglx = vc_hb_hjyxpjbglx;
		}

		public Object getVc_hb_hpbzdw() {
			return vc_hb_hpbzdw;
		}

		public void setVc_hb_hpbzdw(Object vc_hb_hpbzdw) {
			this.vc_hb_hpbzdw = vc_hb_hpbzdw;
		}

		public Object getDt_hb_bzsj() {
			return dt_hb_bzsj;
		}

		public void setDt_hb_bzsj(Object dt_hb_bzsj) {
			this.dt_hb_bzsj = dt_hb_bzsj;
		}

		public Object getVc_hb_hpspbm() {
			return vc_hb_hpspbm;
		}

		public void setVc_hb_hpspbm(Object vc_hb_hpspbm) {
			this.vc_hb_hpspbm = vc_hb_hpspbm;
		}

		public Object getDt_hb_hpsp_time() {
			return dt_hb_hpsp_time;
		}

		public void setDt_hb_hpsp_time(Object dt_hb_hpsp_time) {
			this.dt_hb_hpsp_time = dt_hb_hpsp_time;
		}

		public Object getVc_hb_scsyxdspbm() {
			return vc_hb_scsyxdspbm;
		}

		public void setVc_hb_scsyxdspbm(Object vc_hb_scsyxdspbm) {
			this.vc_hb_scsyxdspbm = vc_hb_scsyxdspbm;
		}

		public Object getDt_hb_scsp_time() {
			return dt_hb_scsp_time;
		}

		public void setDt_hb_scsp_time(Object dt_hb_scsp_time) {
			this.dt_hb_scsp_time = dt_hb_scsp_time;
		}

		public Object getVc_hb_spwh() {
			return vc_hb_spwh;
		}

		public void setVc_hb_spwh(Object vc_hb_spwh) {
			this.vc_hb_spwh = vc_hb_spwh;
		}

		public Object getVc_hb_sftghbjgys() {
			return vc_hb_sftghbjgys;
		}

		public void setVc_hb_sftghbjgys(Object vc_hb_sftghbjgys) {
			this.vc_hb_sftghbjgys = vc_hb_sftghbjgys;
		}

		public Object getDt_hb_ys_time() {
			return dt_hb_ys_time;
		}

		public void setDt_hb_ys_time(Object dt_hb_ys_time) {
			this.dt_hb_ys_time = dt_hb_ys_time;
		}

		public Object getVc_hb_zzysbm() {
			return vc_hb_zzysbm;
		}

		public void setVc_hb_zzysbm(Object vc_hb_zzysbm) {
			this.vc_hb_zzysbm = vc_hb_zzysbm;
		}

		public Object getCl_hb_wysqksm() {
			return cl_hb_wysqksm;
		}

		public void setCl_hb_wysqksm(Object cl_hb_wysqksm) {
			this.cl_hb_wysqksm = cl_hb_wysqksm;
		}

		public Object getVc_kj_sfzyzjxggkj() {
			return vc_kj_sfzyzjxggkj;
		}

		public void setVc_kj_sfzyzjxggkj(Object vc_kj_sfzyzjxggkj) {
			this.vc_kj_sfzyzjxggkj = vc_kj_sfzyzjxggkj;
		}

		public Object getDt_kj_gkj_time() {
			return dt_kj_gkj_time;
		}

		public void setDt_kj_gkj_time(Object dt_kj_gkj_time) {
			this.dt_kj_gkj_time = dt_kj_gkj_time;
		}

		public Object getVc_kj_pzlxbm() {
			return vc_kj_pzlxbm;
		}

		public void setVc_kj_pzlxbm(Object vc_kj_pzlxbm) {
			this.vc_kj_pzlxbm = vc_kj_pzlxbm;
		}

		public Object getVc_kj_lxpfwh() {
			return vc_kj_lxpfwh;
		}

		public void setVc_kj_lxpfwh(Object vc_kj_lxpfwh) {
			this.vc_kj_lxpfwh = vc_kj_lxpfwh;
		}

		public Object getVc_kj_sfblhpsx() {
			return vc_kj_sfblhpsx;
		}

		public void setVc_kj_sfblhpsx(Object vc_kj_sfblhpsx) {
			this.vc_kj_sfblhpsx = vc_kj_sfblhpsx;
		}

		public Object getVc_kj_hpspbm() {
			return vc_kj_hpspbm;
		}

		public void setVc_kj_hpspbm(Object vc_kj_hpspbm) {
			this.vc_kj_hpspbm = vc_kj_hpspbm;
		}

		public Object getColumn_88() {
			return column_88;
		}

		public void setColumn_88(Object column_88) {
			this.column_88 = column_88;
		}

		public Object getDt_kj_hpsp_time() {
			return dt_kj_hpsp_time;
		}

		public void setDt_kj_hpsp_time(Object dt_kj_hpsp_time) {
			this.dt_kj_hpsp_time = dt_kj_hpsp_time;
		}

		public Object getVc_kj_gkjscsyxspbm() {
			return vc_kj_gkjscsyxspbm;
		}

		public void setVc_kj_gkjscsyxspbm(Object vc_kj_gkjscsyxspbm) {
			this.vc_kj_gkjscsyxspbm = vc_kj_gkjscsyxspbm;
		}

		public Object getDt_kj_gkjyxsp_time() {
			return dt_kj_gkjyxsp_time;
		}

		public void setDt_kj_gkjyxsp_time(Object dt_kj_gkjyxsp_time) {
			this.dt_kj_gkjyxsp_time = dt_kj_gkjyxsp_time;
		}

		public Object getVc_kj_spwh() {
			return vc_kj_spwh;
		}

		public void setVc_kj_spwh(Object vc_kj_spwh) {
			this.vc_kj_spwh = vc_kj_spwh;
		}

		public Object getVc_kj_sftghbjgys() {
			return vc_kj_sftghbjgys;
		}

		public void setVc_kj_sftghbjgys(Object vc_kj_sftghbjgys) {
			this.vc_kj_sftghbjgys = vc_kj_sftghbjgys;
		}

		public Object getDt_kj_ys_time() {
			return dt_kj_ys_time;
		}

		public void setDt_kj_ys_time(Object dt_kj_ys_time) {
			this.dt_kj_ys_time = dt_kj_ys_time;
		}

		public Object getVc_kj_zzysbm() {
			return vc_kj_zzysbm;
		}

		public void setVc_kj_zzysbm(Object vc_kj_zzysbm) {
			this.vc_kj_zzysbm = vc_kj_zzysbm;
		}

		public Object getCl_kj_wysqksm() {
			return cl_kj_wysqksm;
		}

		public void setCl_kj_wysqksm(Object cl_kj_wysqksm) {
			this.cl_kj_wysqksm = cl_kj_wysqksm;
		}

		public Object getVc_jskcod() {
			return vc_jskcod;
		}

		public void setVc_jskcod(Object vc_jskcod) {
			this.vc_jskcod = vc_jskcod;
		}

		public Object getVc_jsknh() {
			return vc_jsknh;
		}

		public void setVc_jsknh(Object vc_jsknh) {
			this.vc_jsknh = vc_jsknh;
		}

		public Object getVc_jskbod() {
			return vc_jskbod;
		}

		public void setVc_jskbod(Object vc_jskbod) {
			this.vc_jskbod = vc_jskbod;
		}

		public Object getVc_jskss() {
			return vc_jskss;
		}

		public void setVc_jskss(Object vc_jskss) {
			this.vc_jskss = vc_jskss;
		}

		public Object getVc_jskzl() {
			return vc_jskzl;
		}

		public void setVc_jskzl(Object vc_jskzl) {
			this.vc_jskzl = vc_jskzl;
		}

		public Object getVc_jskzd() {
			return vc_jskzd;
		}

		public void setVc_jskzd(Object vc_jskzd) {
			this.vc_jskzd = vc_jskzd;
		}

		public Object getVc_jskfdcj() {
			return vc_jskfdcj;
		}

		public void setVc_jskfdcj(Object vc_jskfdcj) {
			this.vc_jskfdcj = vc_jskfdcj;
		}

		public Object getVc_jskzjsjs() {
			return vc_jskzjsjs;
		}

		public void setVc_jskzjsjs(Object vc_jskzjsjs) {
			this.vc_jskzjsjs = vc_jskzjsjs;
		}

		public Object getVc_cskcod() {
			return vc_cskcod;
		}

		public void setVc_cskcod(Object vc_cskcod) {
			this.vc_cskcod = vc_cskcod;
		}

		public Object getVc_csknh() {
			return vc_csknh;
		}

		public void setVc_csknh(Object vc_csknh) {
			this.vc_csknh = vc_csknh;
		}

		public Object getVc_cskbod() {
			return vc_cskbod;
		}

		public void setVc_cskbod(Object vc_cskbod) {
			this.vc_cskbod = vc_cskbod;
		}

		public Object getVc_cskss() {
			return vc_cskss;
		}

		public void setVc_cskss(Object vc_cskss) {
			this.vc_cskss = vc_cskss;
		}

		public Object getVc_cskzl() {
			return vc_cskzl;
		}

		public void setVc_cskzl(Object vc_cskzl) {
			this.vc_cskzl = vc_cskzl;
		}

		public Object getVc_cskzd() {
			return vc_cskzd;
		}

		public void setVc_cskzd(Object vc_cskzd) {
			this.vc_cskzd = vc_cskzd;
		}

		public Object getVc_cskfdcj() {
			return vc_cskfdcj;
		}

		public void setVc_cskfdcj(Object vc_cskfdcj) {
			this.vc_cskfdcj = vc_cskfdcj;
		}

		public Object getVc_wscldwhdl() {
			return vc_wscldwhdl;
		}

		public void setVc_wscldwhdl(Object vc_wscldwhdl) {
			this.vc_wscldwhdl = vc_wscldwhdl;
		}

		public Object getVc_hdlsffhljgx() {
			return vc_hdlsffhljgx;
		}

		public void setVc_hdlsffhljgx(Object vc_hdlsffhljgx) {
			this.vc_hdlsffhljgx = vc_hdlsffhljgx;
		}

		public Object getVc_wspfqx() {
			return vc_wspfqx;
		}

		public void setVc_wspfqx(Object vc_wspfqx) {
			this.vc_wspfqx = vc_wspfqx;
		}

		public Object getVc_sfsjyysyd() {
			return vc_sfsjyysyd;
		}

		public void setVc_sfsjyysyd(Object vc_sfsjyysyd) {
			this.vc_sfsjyysyd = vc_sfsjyysyd;
		}

		public Object getVc_szjb() {
			return vc_szjb;
		}

		public void setVc_szjb(Object vc_szjb) {
			this.vc_szjb = vc_szjb;
		}

		public Object getVc_sfssaggqsbdtpzplp() {
			return vc_sfssaggqsbdtpzplp;
		}

		public void setVc_sfssaggqsbdtpzplp(Object vc_sfssaggqsbdtpzplp) {
			this.vc_sfssaggqsbdtpzplp = vc_sfssaggqsbdtpzplp;
		}

		public Object getCl_qksm() {
			return cl_qksm;
		}

		public void setCl_qksm(Object cl_qksm) {
			this.cl_qksm = cl_qksm;
		}

		public Object getVc_csksfgfhsz() {
			return vc_csksfgfhsz;
		}

		public void setVc_csksfgfhsz(Object vc_csksfgfhsz) {
			this.vc_csksfgfhsz = vc_csksfgfhsz;
		}

		public Object getCl_qtqksm() {
			return cl_qtqksm;
		}

		public void setCl_qtqksm(Object cl_qtqksm) {
			this.cl_qtqksm = cl_qtqksm;
		}

		public Object getVc_zxjjbz() {
			return vc_zxjjbz;
		}

		public void setVc_zxjjbz(Object vc_zxjjbz) {
			this.vc_zxjjbz = vc_zxjjbz;
		}

		public Object getVc_jqjcsfcb() {
			return vc_jqjcsfcb;
		}

		public void setVc_jqjcsfcb(Object vc_jqjcsfcb) {
			this.vc_jqjcsfcb = vc_jqjcsfcb;
		}

		public Object getVc_cbwryz() {
			return vc_cbwryz;
		}

		public void setVc_cbwryz(Object vc_cbwryz) {
			this.vc_cbwryz = vc_cbwryz;
		}

		public Object getVc_cbbs() {
			return vc_cbbs;
		}

		public void setVc_cbbs(Object vc_cbbs) {
			this.vc_cbbs = vc_cbbs;
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

		public Object getVc_sfyxdss() {
			return vc_sfyxdss;
		}

		public void setVc_sfyxdss(Object vc_sfyxdss) {
			this.vc_sfyxdss = vc_sfyxdss;
		}

		public Object getVc_xdfs() {
			return vc_xdfs;
		}

		public void setVc_xdfs(Object vc_xdfs) {
			this.vc_xdfs = vc_xdfs;
		}

		public Object getVc_gzjsfzcsy() {
			return vc_gzjsfzcsy;
		}

		public void setVc_gzjsfzcsy(Object vc_gzjsfzcsy) {
			this.vc_gzjsfzcsy = vc_gzjsfzcsy;
		}

		public Object getVc_tnjsyqk() {
			return vc_tnjsyqk;
		}

		public void setVc_tnjsyqk(Object vc_tnjsyqk) {
			this.vc_tnjsyqk = vc_tnjsyqk;
		}

		public Object getVc_tswnncsl() {
			return vc_tswnncsl;
		}

		public void setVc_tswnncsl(Object vc_tswnncsl) {
			this.vc_tswnncsl = vc_tswnncsl;
		}

		public Object getVc_nczzl() {
			return vc_nczzl;
		}

		public void setVc_nczzl(Object vc_nczzl) {
			this.vc_nczzl = vc_nczzl;
		}

		public Object getVc_wnczfs() {
			return vc_wnczfs;
		}

		public void setVc_wnczfs(Object vc_wnczfs) {
			this.vc_wnczfs = vc_wnczfs;
		}

		public Object getVc_qtwnczfs() {
			return vc_qtwnczfs;
		}

		public void setVc_qtwnczfs(Object vc_qtwnczfs) {
			this.vc_qtwnczfs = vc_qtwnczfs;
		}

		public Object getVc_sffhbzyq() {
			return vc_sffhbzyq;
		}

		public void setVc_sffhbzyq(Object vc_sffhbzyq) {
			this.vc_sffhbzyq = vc_sffhbzyq;
		}

		public Object getVc_dfysclfssffhhpjpfyq() {
			return vc_dfysclfssffhhpjpfyq;
		}

		public void setVc_dfysclfssffhhpjpfyq(Object vc_dfysclfssffhhpjpfyq) {
			this.vc_dfysclfssffhhpjpfyq = vc_dfysclfssffhhpjpfyq;
		}

		public Object getVc_bfhqkms() {
			return vc_bfhqkms;
		}

		public void setVc_bfhqkms(Object vc_bfhqkms) {
			this.vc_bfhqkms = vc_bfhqkms;
		}

		public Object getVc_sfjyzzddwjxwxfwjd() {
			return vc_sfjyzzddwjxwxfwjd;
		}

		public void setVc_sfjyzzddwjxwxfwjd(Object vc_sfjyzzddwjxwxfwjd) {
			this.vc_sfjyzzddwjxwxfwjd = vc_sfjyzzddwjxwxfwjd;
		}

		public Object getVc_jddw() {
			return vc_jddw;
		}

		public void setVc_jddw(Object vc_jddw) {
			this.vc_jddw = vc_jddw;
		}

		public Object getVc_wnwfclfs() {
			return vc_wnwfclfs;
		}

		public void setVc_wnwfclfs(Object vc_wnwfclfs) {
			this.vc_wnwfclfs = vc_wnwfclfs;
		}

		public Object getVc_sffhhpjpfdxgyq() {
			return vc_sffhhpjpfdxgyq;
		}

		public void setVc_sffhhpjpfdxgyq(Object vc_sffhhpjpfdxgyq) {
			this.vc_sffhhpjpfdxgyq = vc_sffhhpjpfdxgyq;
		}

		public Object getVc_wnwf_bfhqkms() {
			return vc_wnwf_bfhqkms;
		}

		public void setVc_wnwf_bfhqkms(Object vc_wnwf_bfhqkms) {
			this.vc_wnwf_bfhqkms = vc_wnwf_bfhqkms;
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

		public Object getVc_sfzdlwxfwywsgffcshyjfa() {
			return vc_sfzdlwxfwywsgffcshyjfa;
		}

		public void setVc_sfzdlwxfwywsgffcshyjfa(Object vc_sfzdlwxfwywsgffcshyjfa) {
			this.vc_sfzdlwxfwywsgffcshyjfa = vc_sfzdlwxfwywsgffcshyjfa;
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

		public Object getVc_zcnyscfdcsjsfcgyn() {
			return vc_zcnyscfdcsjsfcgyn;
		}

		public void setVc_zcnyscfdcsjsfcgyn(Object vc_zcnyscfdcsjsfcgyn) {
			this.vc_zcnyscfdcsjsfcgyn = vc_zcnyscfdcsjsfcgyn;
		}

		public Object getVc_rznccsfzxwxfwzyldzd() {
			return vc_rznccsfzxwxfwzyldzd;
		}

		public void setVc_rznccsfzxwxfwzyldzd(Object vc_rznccsfzxwxfwzyldzd) {
			this.vc_rznccsfzxwxfwzyldzd = vc_rznccsfzxwxfwzyldzd;
		}

		public Object getVc_yscljyxgzz() {
			return vc_yscljyxgzz;
		}

		public void setVc_yscljyxgzz(Object vc_yscljyxgzz) {
			this.vc_yscljyxgzz = vc_yscljyxgzz;
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

		public Object getVc_jsdwsfjywfjyxkz() {
			return vc_jsdwsfjywfjyxkz;
		}

		public void setVc_jsdwsfjywfjyxkz(Object vc_jsdwsfjywfjyxkz) {
			this.vc_jsdwsfjywfjyxkz = vc_jsdwsfjywfjyxkz;
		}

		public Object getVc_sjczfs() {
			return vc_sjczfs;
		}

		public void setVc_sjczfs(Object vc_sjczfs) {
			this.vc_sjczfs = vc_sjczfs;
		}

		public Object getVc_cqy() {
			return vc_cqy;
		}

		public void setVc_cqy(Object vc_cqy) {
			this.vc_cqy = vc_cqy;
		}

		public Object getVc_qtcqy() {
			return vc_qtcqy;
		}

		public void setVc_qtcqy(Object vc_qtcqy) {
			this.vc_qtcqy = vc_qtcqy;
		}

		public Object getVc_eczldccsjsssfls() {
			return vc_eczldccsjsssfls;
		}

		public void setVc_eczldccsjsssfls(Object vc_eczldccsjsssfls) {
			this.vc_eczldccsjsssfls = vc_eczldccsjsssfls;
		}

		public Object getVc_ecwlsqkms() {
			return vc_ecwlsqkms;
		}

		public void setVc_ecwlsqkms(Object vc_ecwlsqkms) {
			this.vc_ecwlsqkms = vc_ecwlsqkms;
		}

		public Object getVc_zsy() {
			return vc_zsy;
		}

		public void setVc_zsy(Object vc_zsy) {
			this.vc_zsy = vc_zsy;
		}

		public Object getVc_qtzsy() {
			return vc_qtzsy;
		}

		public void setVc_qtzsy(Object vc_qtzsy) {
			this.vc_qtzsy = vc_qtzsy;
		}

		public Object getVc_jzcssfls() {
			return vc_jzcssfls;
		}

		public void setVc_jzcssfls(Object vc_jzcssfls) {
			this.vc_jzcssfls = vc_jzcssfls;
		}

		public Object getVc_jzwlsqkms() {
			return vc_jzwlsqkms;
		}

		public void setVc_jzwlsqkms(Object vc_jzwlsqkms) {
			this.vc_jzwlsqkms = vc_jzwlsqkms;
		}

		public Object getVc_zsjqjcsfdb() {
			return vc_zsjqjcsfdb;
		}

		public void setVc_zsjqjcsfdb(Object vc_zsjqjcsfdb) {
			this.vc_zsjqjcsfdb = vc_zsjqjcsfdb;
		}

		public Object getVc_zs_jcdw() {
			return vc_zs_jcdw;
		}

		public void setVc_zs_jcdw(Object vc_zs_jcdw) {
			this.vc_zs_jcdw = vc_zs_jcdw;
		}

		public Object getDt_zsjc_time() {
			return dt_zsjc_time;
		}

		public void setDt_zsjc_time(Object dt_zsjc_time) {
			this.dt_zsjc_time = dt_zsjc_time;
		}

		public Object getVc_gcsfahbbmyqazlzxjcsb() {
			return vc_gcsfahbbmyqazlzxjcsb;
		}

		public void setVc_gcsfahbbmyqazlzxjcsb(Object vc_gcsfahbbmyqazlzxjcsb) {
			this.vc_gcsfahbbmyqazlzxjcsb = vc_gcsfahbbmyqazlzxjcsb;
		}

		public Object getVc_qyddszsffhgjyq() {
			return vc_qyddszsffhgjyq;
		}

		public void setVc_qyddszsffhgjyq(Object vc_qyddszsffhgjyq) {
			this.vc_qyddszsffhgjyq = vc_qyddszsffhgjyq;
		}

		public Object getVc_jcsbsfjxlbdys() {
			return vc_jcsbsfjxlbdys;
		}

		public void setVc_jcsbsfjxlbdys(Object vc_jcsbsfjxlbdys) {
			this.vc_jcsbsfjxlbdys = vc_jcsbsfjxlbdys;
		}

		public Object getVc_yxsfzc() {
			return vc_yxsfzc;
		}

		public void setVc_yxsfzc(Object vc_yxsfzc) {
			this.vc_yxsfzc = vc_yxsfzc;
		}

		public Object getVc_gzrysfqdhbbsgpxdzgzs() {
			return vc_gzrysfqdhbbsgpxdzgzs;
		}

		public void setVc_gzrysfqdhbbsgpxdzgzs(Object vc_gzrysfqdhbbsgpxdzgzs) {
			this.vc_gzrysfqdhbbsgpxdzgzs = vc_gzrysfqdhbbsgpxdzgzs;
		}

		public Object getVc_ywtzsfgf() {
			return vc_ywtzsfgf;
		}

		public void setVc_ywtzsfgf(Object vc_ywtzsfgf) {
			this.vc_ywtzsfgf = vc_ywtzsfgf;
		}

		public Object getVc_gczkxtsfyxzc() {
			return vc_gczkxtsfyxzc;
		}

		public void setVc_gczkxtsfyxzc(Object vc_gczkxtsfyxzc) {
			this.vc_gczkxtsfyxzc = vc_gczkxtsfyxzc;
		}

		public Object getVc_zkxtqxsjccsfddsegy() {
			return vc_zkxtqxsjccsfddsegy;
		}

		public void setVc_zkxtqxsjccsfddsegy(Object vc_zkxtqxsjccsfddsegy) {
			this.vc_zkxtqxsjccsfddsegy = vc_zkxtqxsjccsfddsegy;
		}

		public Object getVc_zksjyzxsjsfyz() {
			return vc_zksjyzxsjsfyz;
		}

		public void setVc_zksjyzxsjsfyz(Object vc_zksjyzxsjsfyz) {
			this.vc_zksjyzxsjsfyz = vc_zksjyzxsjsfyz;
		}

		public Object getVc_sfyhbbmlw() {
			return vc_sfyhbbmlw;
		}

		public void setVc_sfyhbbmlw(Object vc_sfyhbbmlw) {
			this.vc_sfyhbbmlw = vc_sfyhbbmlw;
		}

		public Object getVc_zk_ywtzsfgf() {
			return vc_zk_ywtzsfgf;
		}

		public void setVc_zk_ywtzsfgf(Object vc_zk_ywtzsfgf) {
			this.vc_zk_ywtzsfgf = vc_zk_ywtzsfgf;
		}

		public Object getVc_sflshpjpfyqdfxffdccs() {
			return vc_sflshpjpfyqdfxffdccs;
		}

		public void setVc_sflshpjpfyqdfxffdccs(Object vc_sflshpjpfyqdfxffdccs) {
			this.vc_sflshpjpfyqdfxffdccs = vc_sflshpjpfyqdfxffdccs;
		}

		public Object getVc_hjfx_wlsqkms() {
			return vc_hjfx_wlsqkms;
		}

		public void setVc_hjfx_wlsqkms(Object vc_hjfx_wlsqkms) {
			this.vc_hjfx_wlsqkms = vc_hjfx_wlsqkms;
		}

		public Object getVc_sfbztfhjsjyjya() {
			return vc_sfbztfhjsjyjya;
		}

		public void setVc_sfbztfhjsjyjya(Object vc_sfbztfhjsjyjya) {
			this.vc_sfbztfhjsjyjya = vc_sfbztfhjsjyjya;
		}

		public Object getVc_sfdtfhjsjyjyajxpgbba() {
			return vc_sfdtfhjsjyjyajxpgbba;
		}

		public void setVc_sfdtfhjsjyjyajxpgbba(Object vc_sfdtfhjsjyjyajxpgbba) {
			this.vc_sfdtfhjsjyjyajxpgbba = vc_sfdtfhjsjyjyajxpgbba;
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
			 * date : 26
			 * day : 4
			 * hours : 16
			 * minutes : 19
			 * month : 9
			 * nanos : 0
			 * seconds : 42
			 * time : 1509005982000
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
			@Override
			public String toString() {
				return
						(year + 1900) + "." + (month + 1) + "." + date
						;
			}

			/**
			 * date : 26
			 * day : 4
			 * hours : 16
			 * minutes : 20
			 * month : 9
			 * nanos : 0
			 * seconds : 9
			 * time : 1509006009000
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
