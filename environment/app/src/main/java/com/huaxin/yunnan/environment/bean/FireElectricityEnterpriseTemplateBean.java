package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * 4、火电企业现场监察记录页面bean
 * Created by zbw on 2017/10/26 14:46.
 */

public class FireElectricityEnterpriseTemplateBean {

	@Override
	public String toString() {
		return "FireElectricityEnterpriseTemplateBean{" +
				"msg='" + msg + '\'' +
				", success='" + success + '\'' +
				", data=" + data +
				'}';
	}

	/**
	 * data : [{"t_hdqyxcjc_record_id":"402880ce5f4ce4f6015f4dac321004e1","dt_start_time":{"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117},"dt_end_time":{"date":28,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509120000000,"timezoneOffset":-480,"year":117},"vc_location":"阿道夫士大夫","vc_jcr":"admin_1,超级管理员","vc_jcr_id":null,"vc_zfzh":"1234543654","vc_jlr":"admin_1","vc_jlr_id":null,"vc_bjcdwmc":"大理怡祥纸业有限公司","vc_bjcdwmc_id":null,"vc_zzjgdmzh":"622898222","vc_fddbr":"朱建平","vc_fddbrsfzh":null,"vc_xcfzr":"山东肥城","vc_xcfzrsfzh":null,"nb_age":null,"vc_gzdw":null,"vc_duty":null,"vc_ybagx":null,"vc_address":null,"vc_telephone":null,"vc_yzbm":null,"cl_qtcjrxmjgzdw":null,"vc_hbdwmc":null,"vc_hbdwlx":null,"vc_hjjclx":null,"vc_sfqrzj":null,"vc_sfsqhb":null,"vc_city":null,"vc_county":null,"vc_town":null,"vc_szc":null,"vc_dm":null,"vc_xyzzj":null,"vc_gjtjz":null,"vc_jzzj":null,"vc_pbgl":null,"vc_qlfdjz":null,"dt_sj_time":null,"vc_pzlxbm":null,"vc_lxpfwh":null,"vc_bzhjyxpjbg":"4","vc_hpbzdw":null,"dt_bzwcss_time":null,"vc_sfjddjbzhp":null,"vc_hpspdw":null,"dt_hpsp_time":null,"vc_hpspwh":null,"vc_sfczyjsp":null,"vc_rmlfjhdl":null,"vc_xzgmddscgy":null,"vc_bfdy":null,"dt_jctrssc_time":null,"vc_ljscsj":null,"vc_sfjhbbmpftysscjyqssc":null,"vc_sscspdw":null,"dt_sscsp_time":null,"vc_sscspwh":null,"vc_sftghbjgys":null,"dt_jgys_time":null,"vc_ysdw":null,"vc_ysspwh":null,"vc_sfjxgxjgjhkj":null,"vc_xjjshkjhpzdzxqk":null,"vc_sfyfqdwrwpfxkz":null,"vc_sfazpwxkzdgdpfwrw":null,"vc_ffbmjsj":null,"vc_sfcgyxq":null,"vc_xkzlx":null,"vc_yxq":null,"dt_nj_time":null,"vc_sfayqtbqywrwpfsqdjb":null,"vc_sfagdjnpwf":null,"dt_jfks_time":null,"dt_jfjs_time":null,"vc_gjnpwf":null,"vc_yqccss":null,"cl_qyscydsshdccssfls":null,"vc_wlsqkms":null,"vc_yqzxjcxts":null,"vc_sflwbscsj":null,"vc_sfwtdsfyw":null,"vc_sbyxwhf":null,"vc_sfcyywzz":null,"vc_zzzbh":null,"vc_sfjyfmhc":null,"vc_ysysj":null,"vc_xdcl":null,"vc_sfptjyscfsshwsclcs":null,"vc_wptqksm":null,"vc_sfdfsxhly":null,"vc_fsxhwptqkms":null,"vc_sfpbzszlss":null,"vc_jtfzcs":null,"cl_qtwrzlssjcs":null,"vc_zzyxjz":null,"vc_ssscfh":null,"vc_tjjz":null,"vc_tjsj":null,"vc_sfxhbbmjxsmbg":null,"vc_hbbmjb":null,"vc_cysj":null,"vc_ljfd":null,"vc_ymxh":null,"vc_shshy":null,"vc_ympjhl":null,"vc_tlsssffhyq":null,"vc_naxhl":null,"vc_ympjhdy":null,"vc_tssssffhyq":null,"dt_xcjc_time":null,"vc_yqtlsssfyx":null,"vc_yqccsssfzzyx":null,"vc_wryzxjcxtsfzzyx":null,"vc_cemsxtxszdzxjcwrwyz":null,"vc_sfywzdsbywjltz":null,"vc_zxjcybqsfyhgz":null,"vc_sfzyxqn":null,"vc_sfagdjxbd":null,"vc_syjdwryzxjcsbsjsftgshbtsh":null,"cl_gjzzxjcsssj":null,"cl_zksfbskzxtsssj":null,"vc_ydplzt":null,"vc_ccjz":null,"dt_ccks_time":null,"dt_ccjs_time":null,"vc_sozg":null,"vc_sozd":null,"vc_noxzg":null,"vc_noxzd":null,"vc_yczg":null,"vc_yczd":null,"vc_hjjczmc":null,"dt_jc_time":null,"vc_jcjz":null,"vc_so":null,"vc_nox":null,"vc_yc":null,"vc_wrwpfsfcb":null,"vc_cbyz":null,"vc_gffzcssfgf":null,"vc_fmhlzdgygfzhlyl":null,"vc_zyzy":null,"vc_hzysjl":null,"vc_gygfsglsdf":null,"vc_fmhcjccs":null,"vc_fmhlztlsgdssfs":null,"vc_ssgcsfcqlfycfyscs":null,"vc_sffxytdqk":null,"vc_sfyxgtsxfsjfs":null,"vc_hpyqwsfhjl":null,"vc_jlnsfybhmb":null,"dt_bhmbjs_time":null,"vc_zbhjbhqkms":null,"vc_sflsfxffsccs":null,"vc_fxffxswlsqkms":null,"vc_sfbztfhjsjyjya":null,"vc_sfdtfhjsjyjyapgba":null,"vc_sfjxndyjyl":null,"vc_sfcbyjwz":null,"cl_qthbbmjcqk":null,"cl_czzywt":null,"cl_jcyq":null,"dt_create_time":{"date":24,"day":2,"hours":17,"minutes":16,"month":9,"nanos":0,"seconds":35,"time":1508836595000,"timezoneOffset":-480,"year":117},"vc_create_user":"admin","vc_create_mechanism":"402848bd4830fed70148312e0efb0631","dt_update_time":{"date":24,"day":2,"hours":17,"minutes":16,"month":9,"nanos":0,"seconds":35,"time":1508836595000,"timezoneOffset":-480,"year":117},"vc_update_user":"admin","vc_uodate_mechanism":"402848bd4830fed70148312e0efb0631","vc_status":null,"instanceid":null,"del_status":"0","t_task_list_id":"402880ce5f4bfed5015f4c23b0f70136","rownum_":1}]
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
					"t_hdqyxcjc_record_id='" + t_hdqyxcjc_record_id + '\'' +
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
					", vc_fddbrsfzh=" + vc_fddbrsfzh +
					", vc_xcfzr='" + vc_xcfzr + '\'' +
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
					", vc_hjjclx=" + vc_hjjclx +
					", vc_sfqrzj=" + vc_sfqrzj +
					", vc_sfsqhb=" + vc_sfsqhb +
					", vc_city=" + vc_city +
					", vc_county=" + vc_county +
					", vc_town=" + vc_town +
					", vc_szc=" + vc_szc +
					", vc_dm=" + vc_dm +
					", vc_xyzzj=" + vc_xyzzj +
					", vc_gjtjz=" + vc_gjtjz +
					", vc_jzzj=" + vc_jzzj +
					", vc_pbgl=" + vc_pbgl +
					", vc_qlfdjz=" + vc_qlfdjz +
					", dt_sj_time=" + dt_sj_time +
					", vc_pzlxbm=" + vc_pzlxbm +
					", vc_lxpfwh=" + vc_lxpfwh +
					", vc_bzhjyxpjbg='" + vc_bzhjyxpjbg + '\'' +
					", vc_hpbzdw=" + vc_hpbzdw +
					", dt_bzwcss_time=" + dt_bzwcss_time +
					", vc_sfjddjbzhp=" + vc_sfjddjbzhp +
					", vc_hpspdw=" + vc_hpspdw +
					", dt_hpsp_time=" + dt_hpsp_time +
					", vc_hpspwh=" + vc_hpspwh +
					", vc_sfczyjsp=" + vc_sfczyjsp +
					", vc_rmlfjhdl=" + vc_rmlfjhdl +
					", vc_xzgmddscgy=" + vc_xzgmddscgy +
					", vc_bfdy=" + vc_bfdy +
					", dt_jctrssc_time=" + dt_jctrssc_time +
					", vc_ljscsj=" + vc_ljscsj +
					", vc_sfjhbbmpftysscjyqssc=" + vc_sfjhbbmpftysscjyqssc +
					", vc_sscspdw=" + vc_sscspdw +
					", dt_sscsp_time=" + dt_sscsp_time +
					", vc_sscspwh=" + vc_sscspwh +
					", vc_sftghbjgys=" + vc_sftghbjgys +
					", dt_jgys_time=" + dt_jgys_time +
					", vc_ysdw=" + vc_ysdw +
					", vc_ysspwh=" + vc_ysspwh +
					", vc_sfjxgxjgjhkj=" + vc_sfjxgxjgjhkj +
					", vc_xjjshkjhpzdzxqk=" + vc_xjjshkjhpzdzxqk +
					", vc_sfyfqdwrwpfxkz=" + vc_sfyfqdwrwpfxkz +
					", vc_sfazpwxkzdgdpfwrw=" + vc_sfazpwxkzdgdpfwrw +
					", vc_ffbmjsj=" + vc_ffbmjsj +
					", vc_sfcgyxq=" + vc_sfcgyxq +
					", vc_xkzlx=" + vc_xkzlx +
					", vc_yxq=" + vc_yxq +
					", dt_nj_time=" + dt_nj_time +
					", vc_sfayqtbqywrwpfsqdjb=" + vc_sfayqtbqywrwpfsqdjb +
					", vc_sfagdjnpwf=" + vc_sfagdjnpwf +
					", dt_jfks_time=" + dt_jfks_time +
					", dt_jfjs_time=" + dt_jfjs_time +
					", vc_gjnpwf=" + vc_gjnpwf +
					", vc_yqccss=" + vc_yqccss +
					", cl_qyscydsshdccssfls=" + cl_qyscydsshdccssfls +
					", vc_wlsqkms=" + vc_wlsqkms +
					", vc_yqzxjcxts=" + vc_yqzxjcxts +
					", vc_sflwbscsj=" + vc_sflwbscsj +
					", vc_sfwtdsfyw=" + vc_sfwtdsfyw +
					", vc_sbyxwhf=" + vc_sbyxwhf +
					", vc_sfcyywzz=" + vc_sfcyywzz +
					", vc_zzzbh=" + vc_zzzbh +
					", vc_sfjyfmhc=" + vc_sfjyfmhc +
					", vc_ysysj=" + vc_ysysj +
					", vc_xdcl=" + vc_xdcl +
					", vc_sfptjyscfsshwsclcs=" + vc_sfptjyscfsshwsclcs +
					", vc_wptqksm=" + vc_wptqksm +
					", vc_sfdfsxhly=" + vc_sfdfsxhly +
					", vc_fsxhwptqkms=" + vc_fsxhwptqkms +
					", vc_sfpbzszlss=" + vc_sfpbzszlss +
					", vc_jtfzcs=" + vc_jtfzcs +
					", cl_qtwrzlssjcs=" + cl_qtwrzlssjcs +
					", vc_zzyxjz=" + vc_zzyxjz +
					", vc_ssscfh=" + vc_ssscfh +
					", vc_tjjz=" + vc_tjjz +
					", vc_tjsj=" + vc_tjsj +
					", vc_sfxhbbmjxsmbg=" + vc_sfxhbbmjxsmbg +
					", vc_hbbmjb=" + vc_hbbmjb +
					", vc_cysj=" + vc_cysj +
					", vc_ljfd=" + vc_ljfd +
					", vc_ymxh=" + vc_ymxh +
					", vc_shshy=" + vc_shshy +
					", vc_ympjhl=" + vc_ympjhl +
					", vc_tlsssffhyq=" + vc_tlsssffhyq +
					", vc_naxhl=" + vc_naxhl +
					", vc_ympjhdy=" + vc_ympjhdy +
					", vc_tssssffhyq=" + vc_tssssffhyq +
					", dt_xcjc_time=" + dt_xcjc_time +
					", vc_yqtlsssfyx=" + vc_yqtlsssfyx +
					", vc_yqccsssfzzyx=" + vc_yqccsssfzzyx +
					", vc_wryzxjcxtsfzzyx=" + vc_wryzxjcxtsfzzyx +
					", vc_cemsxtxszdzxjcwrwyz=" + vc_cemsxtxszdzxjcwrwyz +
					", vc_sfywzdsbywjltz=" + vc_sfywzdsbywjltz +
					", vc_zxjcybqsfyhgz=" + vc_zxjcybqsfyhgz +
					", vc_sfzyxqn=" + vc_sfzyxqn +
					", vc_sfagdjxbd=" + vc_sfagdjxbd +
					", vc_syjdwryzxjcsbsjsftgshbtsh=" + vc_syjdwryzxjcsbsjsftgshbtsh +
					", cl_gjzzxjcsssj=" + cl_gjzzxjcsssj +
					", cl_zksfbskzxtsssj=" + cl_zksfbskzxtsssj +
					", vc_ydplzt=" + vc_ydplzt +
					", vc_ccjz=" + vc_ccjz +
					", dt_ccks_time=" + dt_ccks_time +
					", dt_ccjs_time=" + dt_ccjs_time +
					", vc_sozg=" + vc_sozg +
					", vc_sozd=" + vc_sozd +
					", vc_noxzg=" + vc_noxzg +
					", vc_noxzd=" + vc_noxzd +
					", vc_yczg=" + vc_yczg +
					", vc_yczd=" + vc_yczd +
					", vc_hjjczmc=" + vc_hjjczmc +
					", dt_jc_time=" + dt_jc_time +
					", vc_jcjz=" + vc_jcjz +
					", vc_so=" + vc_so +
					", vc_nox=" + vc_nox +
					", vc_yc=" + vc_yc +
					", vc_wrwpfsfcb=" + vc_wrwpfsfcb +
					", vc_cbyz=" + vc_cbyz +
					", vc_gffzcssfgf=" + vc_gffzcssfgf +
					", vc_fmhlzdgygfzhlyl=" + vc_fmhlzdgygfzhlyl +
					", vc_zyzy=" + vc_zyzy +
					", vc_hzysjl=" + vc_hzysjl +
					", vc_gygfsglsdf=" + vc_gygfsglsdf +
					", vc_fmhcjccs=" + vc_fmhcjccs +
					", vc_fmhlztlsgdssfs=" + vc_fmhlztlsgdssfs +
					", vc_ssgcsfcqlfycfyscs=" + vc_ssgcsfcqlfycfyscs +
					", vc_sffxytdqk=" + vc_sffxytdqk +
					", vc_sfyxgtsxfsjfs=" + vc_sfyxgtsxfsjfs +
					", vc_hpyqwsfhjl=" + vc_hpyqwsfhjl +
					", vc_jlnsfybhmb=" + vc_jlnsfybhmb +
					", dt_bhmbjs_time=" + dt_bhmbjs_time +
					", vc_zbhjbhqkms=" + vc_zbhjbhqkms +
					", vc_sflsfxffsccs=" + vc_sflsfxffsccs +
					", vc_fxffxswlsqkms=" + vc_fxffxswlsqkms +
					", vc_sfbztfhjsjyjya=" + vc_sfbztfhjsjyjya +
					", vc_sfdtfhjsjyjyapgba=" + vc_sfdtfhjsjyjyapgba +
					", vc_sfjxndyjyl=" + vc_sfjxndyjyl +
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
		 * t_hdqyxcjc_record_id : 402880ce5f4ce4f6015f4dac321004e1
		 * dt_start_time : {"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117}
		 * dt_end_time : {"date":28,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509120000000,"timezoneOffset":-480,"year":117}
		 * vc_location : 阿道夫士大夫
		 * vc_jcr : admin_1,超级管理员
		 * vc_jcr_id : null
		 * vc_zfzh : 1234543654
		 * vc_jlr : admin_1
		 * vc_jlr_id : null
		 * vc_bjcdwmc : 大理怡祥纸业有限公司
		 * vc_bjcdwmc_id : null
		 * vc_zzjgdmzh : 622898222
		 * vc_fddbr : 朱建平
		 * vc_fddbrsfzh : null
		 * vc_xcfzr : 山东肥城
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
		 * vc_hjjclx : null
		 * vc_sfqrzj : null
		 * vc_sfsqhb : null
		 * vc_city : null
		 * vc_county : null
		 * vc_town : null
		 * vc_szc : null
		 * vc_dm : null
		 * vc_xyzzj : null
		 * vc_gjtjz : null
		 * vc_jzzj : null
		 * vc_pbgl : null
		 * vc_qlfdjz : null
		 * dt_sj_time : null
		 * vc_pzlxbm : null
		 * vc_lxpfwh : null
		 * vc_bzhjyxpjbg : 4
		 * vc_hpbzdw : null
		 * dt_bzwcss_time : null
		 * vc_sfjddjbzhp : null
		 * vc_hpspdw : null
		 * dt_hpsp_time : null
		 * vc_hpspwh : null
		 * vc_sfczyjsp : null
		 * vc_rmlfjhdl : null
		 * vc_xzgmddscgy : null
		 * vc_bfdy : null
		 * dt_jctrssc_time : null
		 * vc_ljscsj : null
		 * vc_sfjhbbmpftysscjyqssc : null
		 * vc_sscspdw : null
		 * dt_sscsp_time : null
		 * vc_sscspwh : null
		 * vc_sftghbjgys : null
		 * dt_jgys_time : null
		 * vc_ysdw : null
		 * vc_ysspwh : null
		 * vc_sfjxgxjgjhkj : null
		 * vc_xjjshkjhpzdzxqk : null
		 * vc_sfyfqdwrwpfxkz : null
		 * vc_sfazpwxkzdgdpfwrw : null
		 * vc_ffbmjsj : null
		 * vc_sfcgyxq : null
		 * vc_xkzlx : null
		 * vc_yxq : null
		 * dt_nj_time : null
		 * vc_sfayqtbqywrwpfsqdjb : null
		 * vc_sfagdjnpwf : null
		 * dt_jfks_time : null
		 * dt_jfjs_time : null
		 * vc_gjnpwf : null
		 * vc_yqccss : null
		 * cl_qyscydsshdccssfls : null
		 * vc_wlsqkms : null
		 * vc_yqzxjcxts : null
		 * vc_sflwbscsj : null
		 * vc_sfwtdsfyw : null
		 * vc_sbyxwhf : null
		 * vc_sfcyywzz : null
		 * vc_zzzbh : null
		 * vc_sfjyfmhc : null
		 * vc_ysysj : null
		 * vc_xdcl : null
		 * vc_sfptjyscfsshwsclcs : null
		 * vc_wptqksm : null
		 * vc_sfdfsxhly : null
		 * vc_fsxhwptqkms : null
		 * vc_sfpbzszlss : null
		 * vc_jtfzcs : null
		 * cl_qtwrzlssjcs : null
		 * vc_zzyxjz : null
		 * vc_ssscfh : null
		 * vc_tjjz : null
		 * vc_tjsj : null
		 * vc_sfxhbbmjxsmbg : null
		 * vc_hbbmjb : null
		 * vc_cysj : null
		 * vc_ljfd : null
		 * vc_ymxh : null
		 * vc_shshy : null
		 * vc_ympjhl : null
		 * vc_tlsssffhyq : null
		 * vc_naxhl : null
		 * vc_ympjhdy : null
		 * vc_tssssffhyq : null
		 * dt_xcjc_time : null
		 * vc_yqtlsssfyx : null
		 * vc_yqccsssfzzyx : null
		 * vc_wryzxjcxtsfzzyx : null
		 * vc_cemsxtxszdzxjcwrwyz : null
		 * vc_sfywzdsbywjltz : null
		 * vc_zxjcybqsfyhgz : null
		 * vc_sfzyxqn : null
		 * vc_sfagdjxbd : null
		 * vc_syjdwryzxjcsbsjsftgshbtsh : null
		 * cl_gjzzxjcsssj : null
		 * cl_zksfbskzxtsssj : null
		 * vc_ydplzt : null
		 * vc_ccjz : null
		 * dt_ccks_time : null
		 * dt_ccjs_time : null
		 * vc_sozg : null
		 * vc_sozd : null
		 * vc_noxzg : null
		 * vc_noxzd : null
		 * vc_yczg : null
		 * vc_yczd : null
		 * vc_hjjczmc : null
		 * dt_jc_time : null
		 * vc_jcjz : null
		 * vc_so : null
		 * vc_nox : null
		 * vc_yc : null
		 * vc_wrwpfsfcb : null
		 * vc_cbyz : null
		 * vc_gffzcssfgf : null
		 * vc_fmhlzdgygfzhlyl : null
		 * vc_zyzy : null
		 * vc_hzysjl : null
		 * vc_gygfsglsdf : null
		 * vc_fmhcjccs : null
		 * vc_fmhlztlsgdssfs : null
		 * vc_ssgcsfcqlfycfyscs : null
		 * vc_sffxytdqk : null
		 * vc_sfyxgtsxfsjfs : null
		 * vc_hpyqwsfhjl : null
		 * vc_jlnsfybhmb : null
		 * dt_bhmbjs_time : null
		 * vc_zbhjbhqkms : null
		 * vc_sflsfxffsccs : null
		 * vc_fxffxswlsqkms : null
		 * vc_sfbztfhjsjyjya : null
		 * vc_sfdtfhjsjyjyapgba : null
		 * vc_sfjxndyjyl : null
		 * vc_sfcbyjwz : null
		 * cl_qthbbmjcqk : null
		 * cl_czzywt : null
		 * cl_jcyq : null
		 * dt_create_time : {"date":24,"day":2,"hours":17,"minutes":16,"month":9,"nanos":0,"seconds":35,"time":1508836595000,"timezoneOffset":-480,"year":117}
		 * vc_create_user : admin
		 * vc_create_mechanism : 402848bd4830fed70148312e0efb0631
		 * dt_update_time : {"date":24,"day":2,"hours":17,"minutes":16,"month":9,"nanos":0,"seconds":35,"time":1508836595000,"timezoneOffset":-480,"year":117}
		 * vc_update_user : admin
		 * vc_uodate_mechanism : 402848bd4830fed70148312e0efb0631
		 * vc_status : null
		 * instanceid : null
		 * del_status : 0
		 * t_task_list_id : 402880ce5f4bfed5015f4c23b0f70136
		 * rownum_ : 1
		 */

		private String t_hdqyxcjc_record_id;
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
		private Object vc_fddbrsfzh;
		private String vc_xcfzr;
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
		private Object vc_hjjclx;
		private Object vc_sfqrzj;
		private Object vc_sfsqhb;
		private Object vc_city;
		private Object vc_county;
		private Object vc_town;
		private Object vc_szc;
		private Object vc_dm;
		private Object vc_xyzzj;
		private Object vc_gjtjz;
		private Object vc_jzzj;
		private Object vc_pbgl;
		private Object vc_qlfdjz;
		private Object dt_sj_time;
		private Object vc_pzlxbm;
		private Object vc_lxpfwh;
		private String vc_bzhjyxpjbg;
		private Object vc_hpbzdw;
		private Object dt_bzwcss_time;
		private Object vc_sfjddjbzhp;
		private Object vc_hpspdw;
		private Object dt_hpsp_time;
		private Object vc_hpspwh;
		private Object vc_sfczyjsp;
		private Object vc_rmlfjhdl;
		private Object vc_xzgmddscgy;
		private Object vc_bfdy;
		private Object dt_jctrssc_time;
		private Object vc_ljscsj;
		private Object vc_sfjhbbmpftysscjyqssc;
		private Object vc_sscspdw;
		private Object dt_sscsp_time;
		private Object vc_sscspwh;
		private Object vc_sftghbjgys;
		private Object dt_jgys_time;
		private Object vc_ysdw;
		private Object vc_ysspwh;
		private Object vc_sfjxgxjgjhkj;
		private Object vc_xjjshkjhpzdzxqk;
		private Object vc_sfyfqdwrwpfxkz;
		private Object vc_sfazpwxkzdgdpfwrw;
		private Object vc_ffbmjsj;
		private Object vc_sfcgyxq;
		private Object vc_xkzlx;
		private Object vc_yxq;
		private Object dt_nj_time;
		private Object vc_sfayqtbqywrwpfsqdjb;
		private Object vc_sfagdjnpwf;
		private Object dt_jfks_time;
		private Object dt_jfjs_time;
		private Object vc_gjnpwf;
		private Object vc_yqccss;
		private Object cl_qyscydsshdccssfls;
		private Object vc_wlsqkms;
		private Object vc_yqzxjcxts;
		private Object vc_sflwbscsj;
		private Object vc_sfwtdsfyw;
		private Object vc_sbyxwhf;
		private Object vc_sfcyywzz;
		private Object vc_zzzbh;
		private Object vc_sfjyfmhc;
		private Object vc_ysysj;
		private Object vc_xdcl;
		private Object vc_sfptjyscfsshwsclcs;
		private Object vc_wptqksm;
		private Object vc_sfdfsxhly;
		private Object vc_fsxhwptqkms;
		private Object vc_sfpbzszlss;
		private Object vc_jtfzcs;
		private Object cl_qtwrzlssjcs;
		private Object vc_zzyxjz;
		private Object vc_ssscfh;
		private Object vc_tjjz;
		private Object vc_tjsj;
		private Object vc_sfxhbbmjxsmbg;
		private Object vc_hbbmjb;
		private Object vc_cysj;
		private Object vc_ljfd;
		private Object vc_ymxh;
		private Object vc_shshy;
		private Object vc_ympjhl;
		private Object vc_tlsssffhyq;
		private Object vc_naxhl;
		private Object vc_ympjhdy;
		private Object vc_tssssffhyq;
		private Object dt_xcjc_time;
		private Object vc_yqtlsssfyx;
		private Object vc_yqccsssfzzyx;
		private Object vc_wryzxjcxtsfzzyx;
		private Object vc_cemsxtxszdzxjcwrwyz;
		private Object vc_sfywzdsbywjltz;
		private Object vc_zxjcybqsfyhgz;
		private Object vc_sfzyxqn;
		private Object vc_sfagdjxbd;
		private Object vc_syjdwryzxjcsbsjsftgshbtsh;
		private Object cl_gjzzxjcsssj;
		private Object cl_zksfbskzxtsssj;
		private Object vc_ydplzt;
		private Object vc_ccjz;
		private Object dt_ccks_time;
		private Object dt_ccjs_time;
		private Object vc_sozg;
		private Object vc_sozd;
		private Object vc_noxzg;
		private Object vc_noxzd;
		private Object vc_yczg;
		private Object vc_yczd;
		private Object vc_hjjczmc;
		private Object dt_jc_time;
		private Object vc_jcjz;
		private Object vc_so;
		private Object vc_nox;
		private Object vc_yc;
		private Object vc_wrwpfsfcb;
		private Object vc_cbyz;
		private Object vc_gffzcssfgf;
		private Object vc_fmhlzdgygfzhlyl;
		private Object vc_zyzy;
		private Object vc_hzysjl;
		private Object vc_gygfsglsdf;
		private Object vc_fmhcjccs;
		private Object vc_fmhlztlsgdssfs;
		private Object vc_ssgcsfcqlfycfyscs;
		private Object vc_sffxytdqk;
		private Object vc_sfyxgtsxfsjfs;
		private Object vc_hpyqwsfhjl;
		private Object vc_jlnsfybhmb;
		private Object dt_bhmbjs_time;
		private Object vc_zbhjbhqkms;
		private Object vc_sflsfxffsccs;
		private Object vc_fxffxswlsqkms;
		private Object vc_sfbztfhjsjyjya;
		private Object vc_sfdtfhjsjyjyapgba;
		private Object vc_sfjxndyjyl;
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

		public String getT_hdqyxcjc_record_id() {
			return t_hdqyxcjc_record_id;
		}

		public void setT_hdqyxcjc_record_id(String t_hdqyxcjc_record_id) {
			this.t_hdqyxcjc_record_id = t_hdqyxcjc_record_id;
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

		public Object getVc_fddbrsfzh() {
			return vc_fddbrsfzh;
		}

		public void setVc_fddbrsfzh(Object vc_fddbrsfzh) {
			this.vc_fddbrsfzh = vc_fddbrsfzh;
		}

		public String getVc_xcfzr() {
			return vc_xcfzr;
		}

		public void setVc_xcfzr(String vc_xcfzr) {
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

		public Object getVc_szc() {
			return vc_szc;
		}

		public void setVc_szc(Object vc_szc) {
			this.vc_szc = vc_szc;
		}

		public Object getVc_dm() {
			return vc_dm;
		}

		public void setVc_dm(Object vc_dm) {
			this.vc_dm = vc_dm;
		}

		public Object getVc_xyzzj() {
			return vc_xyzzj;
		}

		public void setVc_xyzzj(Object vc_xyzzj) {
			this.vc_xyzzj = vc_xyzzj;
		}

		public Object getVc_gjtjz() {
			return vc_gjtjz;
		}

		public void setVc_gjtjz(Object vc_gjtjz) {
			this.vc_gjtjz = vc_gjtjz;
		}

		public Object getVc_jzzj() {
			return vc_jzzj;
		}

		public void setVc_jzzj(Object vc_jzzj) {
			this.vc_jzzj = vc_jzzj;
		}

		public Object getVc_pbgl() {
			return vc_pbgl;
		}

		public void setVc_pbgl(Object vc_pbgl) {
			this.vc_pbgl = vc_pbgl;
		}

		public Object getVc_qlfdjz() {
			return vc_qlfdjz;
		}

		public void setVc_qlfdjz(Object vc_qlfdjz) {
			this.vc_qlfdjz = vc_qlfdjz;
		}

		public Object getDt_sj_time() {
			return dt_sj_time;
		}

		public void setDt_sj_time(Object dt_sj_time) {
			this.dt_sj_time = dt_sj_time;
		}

		public Object getVc_pzlxbm() {
			return vc_pzlxbm;
		}

		public void setVc_pzlxbm(Object vc_pzlxbm) {
			this.vc_pzlxbm = vc_pzlxbm;
		}

		public Object getVc_lxpfwh() {
			return vc_lxpfwh;
		}

		public void setVc_lxpfwh(Object vc_lxpfwh) {
			this.vc_lxpfwh = vc_lxpfwh;
		}

		public String getVc_bzhjyxpjbg() {
			return vc_bzhjyxpjbg;
		}

		public void setVc_bzhjyxpjbg(String vc_bzhjyxpjbg) {
			this.vc_bzhjyxpjbg = vc_bzhjyxpjbg;
		}

		public Object getVc_hpbzdw() {
			return vc_hpbzdw;
		}

		public void setVc_hpbzdw(Object vc_hpbzdw) {
			this.vc_hpbzdw = vc_hpbzdw;
		}

		public Object getDt_bzwcss_time() {
			return dt_bzwcss_time;
		}

		public void setDt_bzwcss_time(Object dt_bzwcss_time) {
			this.dt_bzwcss_time = dt_bzwcss_time;
		}

		public Object getVc_sfjddjbzhp() {
			return vc_sfjddjbzhp;
		}

		public void setVc_sfjddjbzhp(Object vc_sfjddjbzhp) {
			this.vc_sfjddjbzhp = vc_sfjddjbzhp;
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

		public Object getVc_sfczyjsp() {
			return vc_sfczyjsp;
		}

		public void setVc_sfczyjsp(Object vc_sfczyjsp) {
			this.vc_sfczyjsp = vc_sfczyjsp;
		}

		public Object getVc_rmlfjhdl() {
			return vc_rmlfjhdl;
		}

		public void setVc_rmlfjhdl(Object vc_rmlfjhdl) {
			this.vc_rmlfjhdl = vc_rmlfjhdl;
		}

		public Object getVc_xzgmddscgy() {
			return vc_xzgmddscgy;
		}

		public void setVc_xzgmddscgy(Object vc_xzgmddscgy) {
			this.vc_xzgmddscgy = vc_xzgmddscgy;
		}

		public Object getVc_bfdy() {
			return vc_bfdy;
		}

		public void setVc_bfdy(Object vc_bfdy) {
			this.vc_bfdy = vc_bfdy;
		}

		public Object getDt_jctrssc_time() {
			return dt_jctrssc_time;
		}

		public void setDt_jctrssc_time(Object dt_jctrssc_time) {
			this.dt_jctrssc_time = dt_jctrssc_time;
		}

		public Object getVc_ljscsj() {
			return vc_ljscsj;
		}

		public void setVc_ljscsj(Object vc_ljscsj) {
			this.vc_ljscsj = vc_ljscsj;
		}

		public Object getVc_sfjhbbmpftysscjyqssc() {
			return vc_sfjhbbmpftysscjyqssc;
		}

		public void setVc_sfjhbbmpftysscjyqssc(Object vc_sfjhbbmpftysscjyqssc) {
			this.vc_sfjhbbmpftysscjyqssc = vc_sfjhbbmpftysscjyqssc;
		}

		public Object getVc_sscspdw() {
			return vc_sscspdw;
		}

		public void setVc_sscspdw(Object vc_sscspdw) {
			this.vc_sscspdw = vc_sscspdw;
		}

		public Object getDt_sscsp_time() {
			return dt_sscsp_time;
		}

		public void setDt_sscsp_time(Object dt_sscsp_time) {
			this.dt_sscsp_time = dt_sscsp_time;
		}

		public Object getVc_sscspwh() {
			return vc_sscspwh;
		}

		public void setVc_sscspwh(Object vc_sscspwh) {
			this.vc_sscspwh = vc_sscspwh;
		}

		public Object getVc_sftghbjgys() {
			return vc_sftghbjgys;
		}

		public void setVc_sftghbjgys(Object vc_sftghbjgys) {
			this.vc_sftghbjgys = vc_sftghbjgys;
		}

		public Object getDt_jgys_time() {
			return dt_jgys_time;
		}

		public void setDt_jgys_time(Object dt_jgys_time) {
			this.dt_jgys_time = dt_jgys_time;
		}

		public Object getVc_ysdw() {
			return vc_ysdw;
		}

		public void setVc_ysdw(Object vc_ysdw) {
			this.vc_ysdw = vc_ysdw;
		}

		public Object getVc_ysspwh() {
			return vc_ysspwh;
		}

		public void setVc_ysspwh(Object vc_ysspwh) {
			this.vc_ysspwh = vc_ysspwh;
		}

		public Object getVc_sfjxgxjgjhkj() {
			return vc_sfjxgxjgjhkj;
		}

		public void setVc_sfjxgxjgjhkj(Object vc_sfjxgxjgjhkj) {
			this.vc_sfjxgxjgjhkj = vc_sfjxgxjgjhkj;
		}

		public Object getVc_xjjshkjhpzdzxqk() {
			return vc_xjjshkjhpzdzxqk;
		}

		public void setVc_xjjshkjhpzdzxqk(Object vc_xjjshkjhpzdzxqk) {
			this.vc_xjjshkjhpzdzxqk = vc_xjjshkjhpzdzxqk;
		}

		public Object getVc_sfyfqdwrwpfxkz() {
			return vc_sfyfqdwrwpfxkz;
		}

		public void setVc_sfyfqdwrwpfxkz(Object vc_sfyfqdwrwpfxkz) {
			this.vc_sfyfqdwrwpfxkz = vc_sfyfqdwrwpfxkz;
		}

		public Object getVc_sfazpwxkzdgdpfwrw() {
			return vc_sfazpwxkzdgdpfwrw;
		}

		public void setVc_sfazpwxkzdgdpfwrw(Object vc_sfazpwxkzdgdpfwrw) {
			this.vc_sfazpwxkzdgdpfwrw = vc_sfazpwxkzdgdpfwrw;
		}

		public Object getVc_ffbmjsj() {
			return vc_ffbmjsj;
		}

		public void setVc_ffbmjsj(Object vc_ffbmjsj) {
			this.vc_ffbmjsj = vc_ffbmjsj;
		}

		public Object getVc_sfcgyxq() {
			return vc_sfcgyxq;
		}

		public void setVc_sfcgyxq(Object vc_sfcgyxq) {
			this.vc_sfcgyxq = vc_sfcgyxq;
		}

		public Object getVc_xkzlx() {
			return vc_xkzlx;
		}

		public void setVc_xkzlx(Object vc_xkzlx) {
			this.vc_xkzlx = vc_xkzlx;
		}

		public Object getVc_yxq() {
			return vc_yxq;
		}

		public void setVc_yxq(Object vc_yxq) {
			this.vc_yxq = vc_yxq;
		}

		public Object getDt_nj_time() {
			return dt_nj_time;
		}

		public void setDt_nj_time(Object dt_nj_time) {
			this.dt_nj_time = dt_nj_time;
		}

		public Object getVc_sfayqtbqywrwpfsqdjb() {
			return vc_sfayqtbqywrwpfsqdjb;
		}

		public void setVc_sfayqtbqywrwpfsqdjb(Object vc_sfayqtbqywrwpfsqdjb) {
			this.vc_sfayqtbqywrwpfsqdjb = vc_sfayqtbqywrwpfsqdjb;
		}

		public Object getVc_sfagdjnpwf() {
			return vc_sfagdjnpwf;
		}

		public void setVc_sfagdjnpwf(Object vc_sfagdjnpwf) {
			this.vc_sfagdjnpwf = vc_sfagdjnpwf;
		}

		public Object getDt_jfks_time() {
			return dt_jfks_time;
		}

		public void setDt_jfks_time(Object dt_jfks_time) {
			this.dt_jfks_time = dt_jfks_time;
		}

		public Object getDt_jfjs_time() {
			return dt_jfjs_time;
		}

		public void setDt_jfjs_time(Object dt_jfjs_time) {
			this.dt_jfjs_time = dt_jfjs_time;
		}

		public Object getVc_gjnpwf() {
			return vc_gjnpwf;
		}

		public void setVc_gjnpwf(Object vc_gjnpwf) {
			this.vc_gjnpwf = vc_gjnpwf;
		}

		public Object getVc_yqccss() {
			return vc_yqccss;
		}

		public void setVc_yqccss(Object vc_yqccss) {
			this.vc_yqccss = vc_yqccss;
		}

		public Object getCl_qyscydsshdccssfls() {
			return cl_qyscydsshdccssfls;
		}

		public void setCl_qyscydsshdccssfls(Object cl_qyscydsshdccssfls) {
			this.cl_qyscydsshdccssfls = cl_qyscydsshdccssfls;
		}

		public Object getVc_wlsqkms() {
			return vc_wlsqkms;
		}

		public void setVc_wlsqkms(Object vc_wlsqkms) {
			this.vc_wlsqkms = vc_wlsqkms;
		}

		public Object getVc_yqzxjcxts() {
			return vc_yqzxjcxts;
		}

		public void setVc_yqzxjcxts(Object vc_yqzxjcxts) {
			this.vc_yqzxjcxts = vc_yqzxjcxts;
		}

		public Object getVc_sflwbscsj() {
			return vc_sflwbscsj;
		}

		public void setVc_sflwbscsj(Object vc_sflwbscsj) {
			this.vc_sflwbscsj = vc_sflwbscsj;
		}

		public Object getVc_sfwtdsfyw() {
			return vc_sfwtdsfyw;
		}

		public void setVc_sfwtdsfyw(Object vc_sfwtdsfyw) {
			this.vc_sfwtdsfyw = vc_sfwtdsfyw;
		}

		public Object getVc_sbyxwhf() {
			return vc_sbyxwhf;
		}

		public void setVc_sbyxwhf(Object vc_sbyxwhf) {
			this.vc_sbyxwhf = vc_sbyxwhf;
		}

		public Object getVc_sfcyywzz() {
			return vc_sfcyywzz;
		}

		public void setVc_sfcyywzz(Object vc_sfcyywzz) {
			this.vc_sfcyywzz = vc_sfcyywzz;
		}

		public Object getVc_zzzbh() {
			return vc_zzzbh;
		}

		public void setVc_zzzbh(Object vc_zzzbh) {
			this.vc_zzzbh = vc_zzzbh;
		}

		public Object getVc_sfjyfmhc() {
			return vc_sfjyfmhc;
		}

		public void setVc_sfjyfmhc(Object vc_sfjyfmhc) {
			this.vc_sfjyfmhc = vc_sfjyfmhc;
		}

		public Object getVc_ysysj() {
			return vc_ysysj;
		}

		public void setVc_ysysj(Object vc_ysysj) {
			this.vc_ysysj = vc_ysysj;
		}

		public Object getVc_xdcl() {
			return vc_xdcl;
		}

		public void setVc_xdcl(Object vc_xdcl) {
			this.vc_xdcl = vc_xdcl;
		}

		public Object getVc_sfptjyscfsshwsclcs() {
			return vc_sfptjyscfsshwsclcs;
		}

		public void setVc_sfptjyscfsshwsclcs(Object vc_sfptjyscfsshwsclcs) {
			this.vc_sfptjyscfsshwsclcs = vc_sfptjyscfsshwsclcs;
		}

		public Object getVc_wptqksm() {
			return vc_wptqksm;
		}

		public void setVc_wptqksm(Object vc_wptqksm) {
			this.vc_wptqksm = vc_wptqksm;
		}

		public Object getVc_sfdfsxhly() {
			return vc_sfdfsxhly;
		}

		public void setVc_sfdfsxhly(Object vc_sfdfsxhly) {
			this.vc_sfdfsxhly = vc_sfdfsxhly;
		}

		public Object getVc_fsxhwptqkms() {
			return vc_fsxhwptqkms;
		}

		public void setVc_fsxhwptqkms(Object vc_fsxhwptqkms) {
			this.vc_fsxhwptqkms = vc_fsxhwptqkms;
		}

		public Object getVc_sfpbzszlss() {
			return vc_sfpbzszlss;
		}

		public void setVc_sfpbzszlss(Object vc_sfpbzszlss) {
			this.vc_sfpbzszlss = vc_sfpbzszlss;
		}

		public Object getVc_jtfzcs() {
			return vc_jtfzcs;
		}

		public void setVc_jtfzcs(Object vc_jtfzcs) {
			this.vc_jtfzcs = vc_jtfzcs;
		}

		public Object getCl_qtwrzlssjcs() {
			return cl_qtwrzlssjcs;
		}

		public void setCl_qtwrzlssjcs(Object cl_qtwrzlssjcs) {
			this.cl_qtwrzlssjcs = cl_qtwrzlssjcs;
		}

		public Object getVc_zzyxjz() {
			return vc_zzyxjz;
		}

		public void setVc_zzyxjz(Object vc_zzyxjz) {
			this.vc_zzyxjz = vc_zzyxjz;
		}

		public Object getVc_ssscfh() {
			return vc_ssscfh;
		}

		public void setVc_ssscfh(Object vc_ssscfh) {
			this.vc_ssscfh = vc_ssscfh;
		}

		public Object getVc_tjjz() {
			return vc_tjjz;
		}

		public void setVc_tjjz(Object vc_tjjz) {
			this.vc_tjjz = vc_tjjz;
		}

		public Object getVc_tjsj() {
			return vc_tjsj;
		}

		public void setVc_tjsj(Object vc_tjsj) {
			this.vc_tjsj = vc_tjsj;
		}

		public Object getVc_sfxhbbmjxsmbg() {
			return vc_sfxhbbmjxsmbg;
		}

		public void setVc_sfxhbbmjxsmbg(Object vc_sfxhbbmjxsmbg) {
			this.vc_sfxhbbmjxsmbg = vc_sfxhbbmjxsmbg;
		}

		public Object getVc_hbbmjb() {
			return vc_hbbmjb;
		}

		public void setVc_hbbmjb(Object vc_hbbmjb) {
			this.vc_hbbmjb = vc_hbbmjb;
		}

		public Object getVc_cysj() {
			return vc_cysj;
		}

		public void setVc_cysj(Object vc_cysj) {
			this.vc_cysj = vc_cysj;
		}

		public Object getVc_ljfd() {
			return vc_ljfd;
		}

		public void setVc_ljfd(Object vc_ljfd) {
			this.vc_ljfd = vc_ljfd;
		}

		public Object getVc_ymxh() {
			return vc_ymxh;
		}

		public void setVc_ymxh(Object vc_ymxh) {
			this.vc_ymxh = vc_ymxh;
		}

		public Object getVc_shshy() {
			return vc_shshy;
		}

		public void setVc_shshy(Object vc_shshy) {
			this.vc_shshy = vc_shshy;
		}

		public Object getVc_ympjhl() {
			return vc_ympjhl;
		}

		public void setVc_ympjhl(Object vc_ympjhl) {
			this.vc_ympjhl = vc_ympjhl;
		}

		public Object getVc_tlsssffhyq() {
			return vc_tlsssffhyq;
		}

		public void setVc_tlsssffhyq(Object vc_tlsssffhyq) {
			this.vc_tlsssffhyq = vc_tlsssffhyq;
		}

		public Object getVc_naxhl() {
			return vc_naxhl;
		}

		public void setVc_naxhl(Object vc_naxhl) {
			this.vc_naxhl = vc_naxhl;
		}

		public Object getVc_ympjhdy() {
			return vc_ympjhdy;
		}

		public void setVc_ympjhdy(Object vc_ympjhdy) {
			this.vc_ympjhdy = vc_ympjhdy;
		}

		public Object getVc_tssssffhyq() {
			return vc_tssssffhyq;
		}

		public void setVc_tssssffhyq(Object vc_tssssffhyq) {
			this.vc_tssssffhyq = vc_tssssffhyq;
		}

		public Object getDt_xcjc_time() {
			return dt_xcjc_time;
		}

		public void setDt_xcjc_time(Object dt_xcjc_time) {
			this.dt_xcjc_time = dt_xcjc_time;
		}

		public Object getVc_yqtlsssfyx() {
			return vc_yqtlsssfyx;
		}

		public void setVc_yqtlsssfyx(Object vc_yqtlsssfyx) {
			this.vc_yqtlsssfyx = vc_yqtlsssfyx;
		}

		public Object getVc_yqccsssfzzyx() {
			return vc_yqccsssfzzyx;
		}

		public void setVc_yqccsssfzzyx(Object vc_yqccsssfzzyx) {
			this.vc_yqccsssfzzyx = vc_yqccsssfzzyx;
		}

		public Object getVc_wryzxjcxtsfzzyx() {
			return vc_wryzxjcxtsfzzyx;
		}

		public void setVc_wryzxjcxtsfzzyx(Object vc_wryzxjcxtsfzzyx) {
			this.vc_wryzxjcxtsfzzyx = vc_wryzxjcxtsfzzyx;
		}

		public Object getVc_cemsxtxszdzxjcwrwyz() {
			return vc_cemsxtxszdzxjcwrwyz;
		}

		public void setVc_cemsxtxszdzxjcwrwyz(Object vc_cemsxtxszdzxjcwrwyz) {
			this.vc_cemsxtxszdzxjcwrwyz = vc_cemsxtxszdzxjcwrwyz;
		}

		public Object getVc_sfywzdsbywjltz() {
			return vc_sfywzdsbywjltz;
		}

		public void setVc_sfywzdsbywjltz(Object vc_sfywzdsbywjltz) {
			this.vc_sfywzdsbywjltz = vc_sfywzdsbywjltz;
		}

		public Object getVc_zxjcybqsfyhgz() {
			return vc_zxjcybqsfyhgz;
		}

		public void setVc_zxjcybqsfyhgz(Object vc_zxjcybqsfyhgz) {
			this.vc_zxjcybqsfyhgz = vc_zxjcybqsfyhgz;
		}

		public Object getVc_sfzyxqn() {
			return vc_sfzyxqn;
		}

		public void setVc_sfzyxqn(Object vc_sfzyxqn) {
			this.vc_sfzyxqn = vc_sfzyxqn;
		}

		public Object getVc_sfagdjxbd() {
			return vc_sfagdjxbd;
		}

		public void setVc_sfagdjxbd(Object vc_sfagdjxbd) {
			this.vc_sfagdjxbd = vc_sfagdjxbd;
		}

		public Object getVc_syjdwryzxjcsbsjsftgshbtsh() {
			return vc_syjdwryzxjcsbsjsftgshbtsh;
		}

		public void setVc_syjdwryzxjcsbsjsftgshbtsh(Object vc_syjdwryzxjcsbsjsftgshbtsh) {
			this.vc_syjdwryzxjcsbsjsftgshbtsh = vc_syjdwryzxjcsbsjsftgshbtsh;
		}

		public Object getCl_gjzzxjcsssj() {
			return cl_gjzzxjcsssj;
		}

		public void setCl_gjzzxjcsssj(Object cl_gjzzxjcsssj) {
			this.cl_gjzzxjcsssj = cl_gjzzxjcsssj;
		}

		public Object getCl_zksfbskzxtsssj() {
			return cl_zksfbskzxtsssj;
		}

		public void setCl_zksfbskzxtsssj(Object cl_zksfbskzxtsssj) {
			this.cl_zksfbskzxtsssj = cl_zksfbskzxtsssj;
		}

		public Object getVc_ydplzt() {
			return vc_ydplzt;
		}

		public void setVc_ydplzt(Object vc_ydplzt) {
			this.vc_ydplzt = vc_ydplzt;
		}

		public Object getVc_ccjz() {
			return vc_ccjz;
		}

		public void setVc_ccjz(Object vc_ccjz) {
			this.vc_ccjz = vc_ccjz;
		}

		public Object getDt_ccks_time() {
			return dt_ccks_time;
		}

		public void setDt_ccks_time(Object dt_ccks_time) {
			this.dt_ccks_time = dt_ccks_time;
		}

		public Object getDt_ccjs_time() {
			return dt_ccjs_time;
		}

		public void setDt_ccjs_time(Object dt_ccjs_time) {
			this.dt_ccjs_time = dt_ccjs_time;
		}

		public Object getVc_sozg() {
			return vc_sozg;
		}

		public void setVc_sozg(Object vc_sozg) {
			this.vc_sozg = vc_sozg;
		}

		public Object getVc_sozd() {
			return vc_sozd;
		}

		public void setVc_sozd(Object vc_sozd) {
			this.vc_sozd = vc_sozd;
		}

		public Object getVc_noxzg() {
			return vc_noxzg;
		}

		public void setVc_noxzg(Object vc_noxzg) {
			this.vc_noxzg = vc_noxzg;
		}

		public Object getVc_noxzd() {
			return vc_noxzd;
		}

		public void setVc_noxzd(Object vc_noxzd) {
			this.vc_noxzd = vc_noxzd;
		}

		public Object getVc_yczg() {
			return vc_yczg;
		}

		public void setVc_yczg(Object vc_yczg) {
			this.vc_yczg = vc_yczg;
		}

		public Object getVc_yczd() {
			return vc_yczd;
		}

		public void setVc_yczd(Object vc_yczd) {
			this.vc_yczd = vc_yczd;
		}

		public Object getVc_hjjczmc() {
			return vc_hjjczmc;
		}

		public void setVc_hjjczmc(Object vc_hjjczmc) {
			this.vc_hjjczmc = vc_hjjczmc;
		}

		public Object getDt_jc_time() {
			return dt_jc_time;
		}

		public void setDt_jc_time(Object dt_jc_time) {
			this.dt_jc_time = dt_jc_time;
		}

		public Object getVc_jcjz() {
			return vc_jcjz;
		}

		public void setVc_jcjz(Object vc_jcjz) {
			this.vc_jcjz = vc_jcjz;
		}

		public Object getVc_so() {
			return vc_so;
		}

		public void setVc_so(Object vc_so) {
			this.vc_so = vc_so;
		}

		public Object getVc_nox() {
			return vc_nox;
		}

		public void setVc_nox(Object vc_nox) {
			this.vc_nox = vc_nox;
		}

		public Object getVc_yc() {
			return vc_yc;
		}

		public void setVc_yc(Object vc_yc) {
			this.vc_yc = vc_yc;
		}

		public Object getVc_wrwpfsfcb() {
			return vc_wrwpfsfcb;
		}

		public void setVc_wrwpfsfcb(Object vc_wrwpfsfcb) {
			this.vc_wrwpfsfcb = vc_wrwpfsfcb;
		}

		public Object getVc_cbyz() {
			return vc_cbyz;
		}

		public void setVc_cbyz(Object vc_cbyz) {
			this.vc_cbyz = vc_cbyz;
		}

		public Object getVc_gffzcssfgf() {
			return vc_gffzcssfgf;
		}

		public void setVc_gffzcssfgf(Object vc_gffzcssfgf) {
			this.vc_gffzcssfgf = vc_gffzcssfgf;
		}

		public Object getVc_fmhlzdgygfzhlyl() {
			return vc_fmhlzdgygfzhlyl;
		}

		public void setVc_fmhlzdgygfzhlyl(Object vc_fmhlzdgygfzhlyl) {
			this.vc_fmhlzdgygfzhlyl = vc_fmhlzdgygfzhlyl;
		}

		public Object getVc_zyzy() {
			return vc_zyzy;
		}

		public void setVc_zyzy(Object vc_zyzy) {
			this.vc_zyzy = vc_zyzy;
		}

		public Object getVc_hzysjl() {
			return vc_hzysjl;
		}

		public void setVc_hzysjl(Object vc_hzysjl) {
			this.vc_hzysjl = vc_hzysjl;
		}

		public Object getVc_gygfsglsdf() {
			return vc_gygfsglsdf;
		}

		public void setVc_gygfsglsdf(Object vc_gygfsglsdf) {
			this.vc_gygfsglsdf = vc_gygfsglsdf;
		}

		public Object getVc_fmhcjccs() {
			return vc_fmhcjccs;
		}

		public void setVc_fmhcjccs(Object vc_fmhcjccs) {
			this.vc_fmhcjccs = vc_fmhcjccs;
		}

		public Object getVc_fmhlztlsgdssfs() {
			return vc_fmhlztlsgdssfs;
		}

		public void setVc_fmhlztlsgdssfs(Object vc_fmhlztlsgdssfs) {
			this.vc_fmhlztlsgdssfs = vc_fmhlztlsgdssfs;
		}

		public Object getVc_ssgcsfcqlfycfyscs() {
			return vc_ssgcsfcqlfycfyscs;
		}

		public void setVc_ssgcsfcqlfycfyscs(Object vc_ssgcsfcqlfycfyscs) {
			this.vc_ssgcsfcqlfycfyscs = vc_ssgcsfcqlfycfyscs;
		}

		public Object getVc_sffxytdqk() {
			return vc_sffxytdqk;
		}

		public void setVc_sffxytdqk(Object vc_sffxytdqk) {
			this.vc_sffxytdqk = vc_sffxytdqk;
		}

		public Object getVc_sfyxgtsxfsjfs() {
			return vc_sfyxgtsxfsjfs;
		}

		public void setVc_sfyxgtsxfsjfs(Object vc_sfyxgtsxfsjfs) {
			this.vc_sfyxgtsxfsjfs = vc_sfyxgtsxfsjfs;
		}

		public Object getVc_hpyqwsfhjl() {
			return vc_hpyqwsfhjl;
		}

		public void setVc_hpyqwsfhjl(Object vc_hpyqwsfhjl) {
			this.vc_hpyqwsfhjl = vc_hpyqwsfhjl;
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

		public Object getVc_zbhjbhqkms() {
			return vc_zbhjbhqkms;
		}

		public void setVc_zbhjbhqkms(Object vc_zbhjbhqkms) {
			this.vc_zbhjbhqkms = vc_zbhjbhqkms;
		}

		public Object getVc_sflsfxffsccs() {
			return vc_sflsfxffsccs;
		}

		public void setVc_sflsfxffsccs(Object vc_sflsfxffsccs) {
			this.vc_sflsfxffsccs = vc_sflsfxffsccs;
		}

		public Object getVc_fxffxswlsqkms() {
			return vc_fxffxswlsqkms;
		}

		public void setVc_fxffxswlsqkms(Object vc_fxffxswlsqkms) {
			this.vc_fxffxswlsqkms = vc_fxffxswlsqkms;
		}

		public Object getVc_sfbztfhjsjyjya() {
			return vc_sfbztfhjsjyjya;
		}

		public void setVc_sfbztfhjsjyjya(Object vc_sfbztfhjsjyjya) {
			this.vc_sfbztfhjsjyjya = vc_sfbztfhjsjyjya;
		}

		public Object getVc_sfdtfhjsjyjyapgba() {
			return vc_sfdtfhjsjyjyapgba;
		}

		public void setVc_sfdtfhjsjyjyapgba(Object vc_sfdtfhjsjyjyapgba) {
			this.vc_sfdtfhjsjyjyapgba = vc_sfdtfhjsjyjyapgba;
		}

		public Object getVc_sfjxndyjyl() {
			return vc_sfjxndyjyl;
		}

		public void setVc_sfjxndyjyl(Object vc_sfjxndyjyl) {
			this.vc_sfjxndyjyl = vc_sfjxndyjyl;
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
			 * hours : 17
			 * minutes : 16
			 * month : 9
			 * nanos : 0
			 * seconds : 35
			 * time : 1508836595000
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

		public static class DtUpdateTimeBean {
			@Override
			public String toString() {
				return
						(year + 1900) + "." + (month + 1) + "." + date
						;
			}

			/**
			 * date : 24
			 * day : 2
			 * hours : 17
			 * minutes : 16
			 * month : 9
			 * nanos : 0
			 * seconds : 35
			 * time : 1508836595000
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
