package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/10/25.
 */

public class LiveStockFarmBean {

    /**
     * data : [{"t_cqyzxcjc_record_id":"402880ce5f4ce4f6015f4dabbd9904be","dt_start_time":{"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117},"dt_end_time":{"date":28,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509120000000,"timezoneOffset":-480,"year":117},"vc_location":"啊士大夫v不","vc_jcr":"admin_1","vc_jcr_id":null,"vc_zfzh":null,"vc_jlr":"admin_1","vc_jlr_id":null,"vc_bjcdwmc":"但是非官方的都是","vc_bjcdwmc_id":null,"vc_zzjgdmzh":"213425342432","vc_fddbr":"生产线","vc_fddbrsfzh":"134253444465463","vc_xcfzr":"第三方","vc_xcfzrsfzh":"23454645345","nb_age":45,"vc_gzdw":"士大夫打啊果断","vc_duty":"而奋斗","vc_ybagx":null,"vc_address":null,"vc_telephone":null,"vc_yzbm":null,"cl_qtcjrxmjgzdw":null,"vc_hbdwmc":null,"vc_hbdwlx":null,"vc_hjjclx":"2,3","vc_sfqrzj":null,"vc_sfsqhb":null,"vc_county":null,"vc_town":null,"vc_czjy":null,"vc_yzfs":null,"vc_hpyqcncl":"4,5","vc_hpyqsl":null,"vc_hpyqdw":null,"vc_wsfhjl":null,"vc_sjcncl":null,"vc_sjsl":null,"vc_sjdw":null,"vc_sjwsfhjl":null,"vc_sfjyjyq":null,"vc_jyqlx":null,"vc_sfjyhjmgq":null,"vc_hjmgqlx":"2,3","dt_xmjs_time":null,"dt_xmjc_time":null,"vc_sfzghjyxpj":null,"vc_bzlx":null,"vc_bzdw":null,"dt_bz_time":null,"vc_sfjddjzhp":null,"vc_hpspdw":null,"dt_sp_time":null,"vc_spwh":null,"vc_hpsfyjsp":null,"vc_hpyqdyzgm":null,"vc_hpyqdyzdd":null,"vc_hpyqdyzms":null,"vc_sjyzgm":null,"vc_sjyzdd":null,"vc_sjyzms":null,"vc_yzgmddyzmssfyhppfyz":null,"vc_sftgjghbys":null,"vc_ysdw":null,"dt_ys_time":null,"vc_ysspwh":null,"vc_hpyqjsdwsclss":null,"vc_sjjcdwsclss":null,"vc_sfyhpyqyz":null,"vc_hpzclwsl":null,"vc_sjcll":null,"vc_sjsfyhpyqyz":null,"vc_wsclsssfzcyx":null,"vc_jqwpwsjczbhsjsfcb":null,"vc_cbyz":null,"vc_cbjcz":null,"vc_hpyqjsdfqclss":null,"vc_sjjcdss":null,"vc_fqclsssfyhpyqyz":null,"vc_fqclsssfzcyx":null,"vc_jqwpfqjczbhsjsfcb":null,"vc_fqcbyz":null,"vc_fqcbjcz":null,"vc_hpyqdjzcs":null,"vc_sjcqdjzcs":null,"vc_jzsfyhpyqyz":null,"vc_hpyqjsdgtfwclss":null,"vc_sjjcsss":null,"vc_gtfwsfyhpyqyz":null,"vc_hpgfcll":null,"vc_gfsjcll":null,"vc_cllsfyhpyqyz":null,"vc_gtfwclsssfzcyx":null,"vc_cqfqwhtdsfjwhhcl":null,"vc_yzccqsfcqqwflcs":null,"vc_sfcqgsflcs":null,"vc_pfksffhgfhjsyq":null,"vc_sfbzswrsgyjya":null,"vc_jyzccs":null,"vc_cqcs":null,"vc_sfcqcccs":null,"cl_jcsfxdwt":null,"cl_jcyq":null,"dt_create_time":{"date":24,"day":2,"hours":17,"minutes":16,"month":9,"nanos":0,"seconds":5,"time":1508836565000,"timezoneOffset":-480,"year":117},"vc_create_user":"admin","vc_create_mechanism":"402848bd4830fed70148312e0efb0631","dt_update_time":null,"vc_update_user":null,"vc_uodate_mechanism":null,"vc_status":null,"instanceid":null,"del_status":"0","t_task_list_id":"402880ce5f4bfed5015f4c23b0f70136","rownum_":1}]
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
        /**
         * t_cqyzxcjc_record_id : 402880ce5f4ce4f6015f4dabbd9904be
         * dt_start_time : {"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117}
         * dt_end_time : {"date":28,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509120000000,"timezoneOffset":-480,"year":117}
         * vc_location : 啊士大夫v不
         * vc_jcr : admin_1
         * vc_jcr_id : null
         * vc_zfzh : null
         * vc_jlr : admin_1
         * vc_jlr_id : null
         * vc_bjcdwmc : 但是非官方的都是
         * vc_bjcdwmc_id : null
         * vc_zzjgdmzh : 213425342432
         * vc_fddbr : 生产线
         * vc_fddbrsfzh : 134253444465463
         * vc_xcfzr : 第三方
         * vc_xcfzrsfzh : 23454645345
         * nb_age : 45
         * vc_gzdw : 士大夫打啊果断
         * vc_duty : 而奋斗
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
         * vc_county : null
         * vc_town : null
         * vc_czjy : null
         * vc_yzfs : null
         * vc_hpyqcncl : 4,5
         * vc_hpyqsl : null
         * vc_hpyqdw : null
         * vc_wsfhjl : null
         * vc_sjcncl : null
         * vc_sjsl : null
         * vc_sjdw : null
         * vc_sjwsfhjl : null
         * vc_sfjyjyq : null
         * vc_jyqlx : null
         * vc_sfjyhjmgq : null
         * vc_hjmgqlx : 2,3
         * dt_xmjs_time : null
         * dt_xmjc_time : null
         * vc_sfzghjyxpj : null
         * vc_bzlx : null
         * vc_bzdw : null
         * dt_bz_time : null
         * vc_sfjddjzhp : null
         * vc_hpspdw : null
         * dt_sp_time : null
         * vc_spwh : null
         * vc_hpsfyjsp : null
         * vc_hpyqdyzgm : null
         * vc_hpyqdyzdd : null
         * vc_hpyqdyzms : null
         * vc_sjyzgm : null
         * vc_sjyzdd : null
         * vc_sjyzms : null
         * vc_yzgmddyzmssfyhppfyz : null
         * vc_sftgjghbys : null
         * vc_ysdw : null
         * dt_ys_time : null
         * vc_ysspwh : null
         * vc_hpyqjsdwsclss : null
         * vc_sjjcdwsclss : null
         * vc_sfyhpyqyz : null
         * vc_hpzclwsl : null
         * vc_sjcll : null
         * vc_sjsfyhpyqyz : null
         * vc_wsclsssfzcyx : null
         * vc_jqwpwsjczbhsjsfcb : null
         * vc_cbyz : null
         * vc_cbjcz : null
         * vc_hpyqjsdfqclss : null
         * vc_sjjcdss : null
         * vc_fqclsssfyhpyqyz : null
         * vc_fqclsssfzcyx : null
         * vc_jqwpfqjczbhsjsfcb : null
         * vc_fqcbyz : null
         * vc_fqcbjcz : null
         * vc_hpyqdjzcs : null
         * vc_sjcqdjzcs : null
         * vc_jzsfyhpyqyz : null
         * vc_hpyqjsdgtfwclss : null
         * vc_sjjcsss : null
         * vc_gtfwsfyhpyqyz : null
         * vc_hpgfcll : null
         * vc_gfsjcll : null
         * vc_cllsfyhpyqyz : null
         * vc_gtfwclsssfzcyx : null
         * vc_cqfqwhtdsfjwhhcl : null
         * vc_yzccqsfcqqwflcs : null
         * vc_sfcqgsflcs : null
         * vc_pfksffhgfhjsyq : null
         * vc_sfbzswrsgyjya : null
         * vc_jyzccs : null
         * vc_cqcs : null
         * vc_sfcqcccs : null
         * cl_jcsfxdwt : null
         * cl_jcyq : null
         * dt_create_time : {"date":24,"day":2,"hours":17,"minutes":16,"month":9,"nanos":0,"seconds":5,"time":1508836565000,"timezoneOffset":-480,"year":117}
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

        private String t_cqyzxcjc_record_id;
        private DtStartTimeBean dt_start_time;
        private DtEndTimeBean dt_end_time;
        private String vc_location;
        private String vc_jcr;
        private Object vc_jcr_id;
        private Object vc_zfzh;
        private String vc_jlr;
        private Object vc_jlr_id;
        private String vc_bjcdwmc;
        private Object vc_bjcdwmc_id;
        private String vc_zzjgdmzh;
        private String vc_fddbr;
        private String vc_fddbrsfzh;
        private String vc_xcfzr;
        private String vc_xcfzrsfzh;
        private String nb_age;
        private String vc_gzdw;
        private String vc_duty;
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
        private Object vc_county;
        private Object vc_town;
        private Object vc_czjy;
        private Object vc_yzfs;
        private String vc_hpyqcncl;
        private Object vc_hpyqsl;
        private Object vc_hpyqdw;
        private Object vc_wsfhjl;
        private Object vc_sjcncl;
        private Object vc_sjsl;
        private Object vc_sjdw;
        private Object vc_sjwsfhjl;
        private Object vc_sfjyjyq;
        private Object vc_jyqlx;
        private Object vc_sfjyhjmgq;
        private String vc_hjmgqlx;
        private DtXmJsTime dt_xmjs_time;
        private DtXmJcTime dt_xmjc_time;
        private Object vc_sfzghjyxpj;
        private Object vc_bzlx;
        private Object vc_bzdw;
        private DtBzTime dt_bz_time;
        private Object vc_sfjddjzhp;
        private Object vc_hpspdw;
        private DtSpTime dt_sp_time;
        private Object vc_spwh;
        private Object vc_hpsfyjsp;
        private Object vc_hpyqdyzgm;
        private Object vc_hpyqdyzdd;
        private Object vc_hpyqdyzms;
        private Object vc_sjyzgm;
        private Object vc_sjyzdd;
        private Object vc_sjyzms;
        private Object vc_yzgmddyzmssfyhppfyz;
        private Object vc_sftgjghbys;
        private Object vc_ysdw;
        private DtYsTime dt_ys_time;
        private Object vc_ysspwh;
        private Object vc_hpyqjsdwsclss;
        private Object vc_sjjcdwsclss;
        private Object vc_sfyhpyqyz;
        private Object vc_hpzclwsl;
        private Object vc_sjcll;
        private Object vc_sjsfyhpyqyz;
        private Object vc_wsclsssfzcyx;
        private Object vc_jqwpwsjczbhsjsfcb;
        private Object vc_cbyz;
        private Object vc_cbjcz;
        private Object vc_hpyqjsdfqclss;
        private Object vc_sjjcdss;
        private Object vc_fqclsssfyhpyqyz;
        private Object vc_fqclsssfzcyx;
        private Object vc_jqwpfqjczbhsjsfcb;
        private Object vc_fqcbyz;
        private Object vc_fqcbjcz;
        private Object vc_hpyqdjzcs;
        private Object vc_sjcqdjzcs;
        private Object vc_jzsfyhpyqyz;
        private Object vc_hpyqjsdgtfwclss;
        private Object vc_sjjcsss;
        private Object vc_gtfwsfyhpyqyz;
        private Object vc_hpgfcll;
        private Object vc_gfsjcll;
        private Object vc_cllsfyhpyqyz;
        private Object vc_gtfwclsssfzcyx;
        private Object vc_cqfqwhtdsfjwhhcl;
        private Object vc_yzccqsfcqqwflcs;
        private Object vc_sfcqgsflcs;
        private Object vc_pfksffhgfhjsyq;
        private Object vc_sfbzswrsgyjya;
        private Object vc_jyzccs;
        private Object vc_cqcs;
        private Object vc_sfcqcccs;
        private Object cl_jcsfxdwt;
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

        public String getT_cqyzxcjc_record_id() {
            return t_cqyzxcjc_record_id;
        }

        public void setT_cqyzxcjc_record_id(String t_cqyzxcjc_record_id) {
            this.t_cqyzxcjc_record_id = t_cqyzxcjc_record_id;
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

        public Object getVc_zfzh() {
            return vc_zfzh;
        }

        public void setVc_zfzh(Object vc_zfzh) {
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

        public Object getVc_czjy() {
            return vc_czjy;
        }

        public void setVc_czjy(Object vc_czjy) {
            this.vc_czjy = vc_czjy;
        }

        public Object getVc_yzfs() {
            return vc_yzfs;
        }

        public void setVc_yzfs(Object vc_yzfs) {
            this.vc_yzfs = vc_yzfs;
        }

        public String getVc_hpyqcncl() {
            return vc_hpyqcncl;
        }

        public void setVc_hpyqcncl(String vc_hpyqcncl) {
            this.vc_hpyqcncl = vc_hpyqcncl;
        }

        public Object getVc_hpyqsl() {
            return vc_hpyqsl;
        }

        public void setVc_hpyqsl(Object vc_hpyqsl) {
            this.vc_hpyqsl = vc_hpyqsl;
        }

        public Object getVc_hpyqdw() {
            return vc_hpyqdw;
        }

        public void setVc_hpyqdw(Object vc_hpyqdw) {
            this.vc_hpyqdw = vc_hpyqdw;
        }

        public Object getVc_wsfhjl() {
            return vc_wsfhjl;
        }

        public void setVc_wsfhjl(Object vc_wsfhjl) {
            this.vc_wsfhjl = vc_wsfhjl;
        }

        public Object getVc_sjcncl() {
            return vc_sjcncl;
        }

        public void setVc_sjcncl(Object vc_sjcncl) {
            this.vc_sjcncl = vc_sjcncl;
        }

        public Object getVc_sjsl() {
            return vc_sjsl;
        }

        public void setVc_sjsl(Object vc_sjsl) {
            this.vc_sjsl = vc_sjsl;
        }

        public Object getVc_sjdw() {
            return vc_sjdw;
        }

        public void setVc_sjdw(Object vc_sjdw) {
            this.vc_sjdw = vc_sjdw;
        }

        public Object getVc_sjwsfhjl() {
            return vc_sjwsfhjl;
        }

        public void setVc_sjwsfhjl(Object vc_sjwsfhjl) {
            this.vc_sjwsfhjl = vc_sjwsfhjl;
        }

        public Object getVc_sfjyjyq() {
            return vc_sfjyjyq;
        }

        public void setVc_sfjyjyq(Object vc_sfjyjyq) {
            this.vc_sfjyjyq = vc_sfjyjyq;
        }

        public Object getVc_jyqlx() {
            return vc_jyqlx;
        }

        public void setVc_jyqlx(Object vc_jyqlx) {
            this.vc_jyqlx = vc_jyqlx;
        }

        public Object getVc_sfjyhjmgq() {
            return vc_sfjyhjmgq;
        }

        public void setVc_sfjyhjmgq(Object vc_sfjyhjmgq) {
            this.vc_sfjyhjmgq = vc_sfjyhjmgq;
        }

        public String getVc_hjmgqlx() {
            return vc_hjmgqlx;
        }

        public void setVc_hjmgqlx(String vc_hjmgqlx) {
            this.vc_hjmgqlx = vc_hjmgqlx;
        }

        public DtXmJsTime getDt_xmjs_time() {
            return dt_xmjs_time;
        }

        public void setDt_xmjs_time(DtXmJsTime dt_xmjs_time) {
            this.dt_xmjs_time = dt_xmjs_time;
        }

        public Object getVc_sfzghjyxpj() {
            return vc_sfzghjyxpj;
        }

        public void setVc_sfzghjyxpj(Object vc_sfzghjyxpj) {
            this.vc_sfzghjyxpj = vc_sfzghjyxpj;
        }

        public Object getVc_bzlx() {
            return vc_bzlx;
        }

        public void setVc_bzlx(Object vc_bzlx) {
            this.vc_bzlx = vc_bzlx;
        }

        public Object getVc_bzdw() {
            return vc_bzdw;
        }

        public void setVc_bzdw(Object vc_bzdw) {
            this.vc_bzdw = vc_bzdw;
        }



        public Object getVc_sfjddjzhp() {
            return vc_sfjddjzhp;
        }

        public void setVc_sfjddjzhp(Object vc_sfjddjzhp) {
            this.vc_sfjddjzhp = vc_sfjddjzhp;
        }

        public Object getVc_hpspdw() {
            return vc_hpspdw;
        }

        public void setVc_hpspdw(Object vc_hpspdw) {
            this.vc_hpspdw = vc_hpspdw;
        }

        public DtSpTime getDt_sp_time() {
            return dt_sp_time;
        }

        public void setDt_sp_time(DtSpTime dt_sp_time) {
            this.dt_sp_time = dt_sp_time;
        }

        public Object getVc_spwh() {
            return vc_spwh;
        }

        public void setVc_spwh(Object vc_spwh) {
            this.vc_spwh = vc_spwh;
        }

        public Object getVc_hpsfyjsp() {
            return vc_hpsfyjsp;
        }

        public void setVc_hpsfyjsp(Object vc_hpsfyjsp) {
            this.vc_hpsfyjsp = vc_hpsfyjsp;
        }

        public Object getVc_hpyqdyzgm() {
            return vc_hpyqdyzgm;
        }

        public void setVc_hpyqdyzgm(Object vc_hpyqdyzgm) {
            this.vc_hpyqdyzgm = vc_hpyqdyzgm;
        }

        public Object getVc_hpyqdyzdd() {
            return vc_hpyqdyzdd;
        }

        public void setVc_hpyqdyzdd(Object vc_hpyqdyzdd) {
            this.vc_hpyqdyzdd = vc_hpyqdyzdd;
        }

        public Object getVc_hpyqdyzms() {
            return vc_hpyqdyzms;
        }

        public void setVc_hpyqdyzms(Object vc_hpyqdyzms) {
            this.vc_hpyqdyzms = vc_hpyqdyzms;
        }

        public Object getVc_sjyzgm() {
            return vc_sjyzgm;
        }

        public void setVc_sjyzgm(Object vc_sjyzgm) {
            this.vc_sjyzgm = vc_sjyzgm;
        }

        public Object getVc_sjyzdd() {
            return vc_sjyzdd;
        }

        public void setVc_sjyzdd(Object vc_sjyzdd) {
            this.vc_sjyzdd = vc_sjyzdd;
        }

        public Object getVc_sjyzms() {
            return vc_sjyzms;
        }

        public void setVc_sjyzms(Object vc_sjyzms) {
            this.vc_sjyzms = vc_sjyzms;
        }

        public Object getVc_yzgmddyzmssfyhppfyz() {
            return vc_yzgmddyzmssfyhppfyz;
        }

        public void setVc_yzgmddyzmssfyhppfyz(Object vc_yzgmddyzmssfyhppfyz) {
            this.vc_yzgmddyzmssfyhppfyz = vc_yzgmddyzmssfyhppfyz;
        }

        public Object getVc_sftgjghbys() {
            return vc_sftgjghbys;
        }

        public void setVc_sftgjghbys(Object vc_sftgjghbys) {
            this.vc_sftgjghbys = vc_sftgjghbys;
        }

        public Object getVc_ysdw() {
            return vc_ysdw;
        }

        public void setVc_ysdw(Object vc_ysdw) {
            this.vc_ysdw = vc_ysdw;
        }

        public DtYsTime getDt_ys_time() {
            return dt_ys_time;
        }

        public void setDt_ys_time(DtYsTime dt_ys_time) {
            this.dt_ys_time = dt_ys_time;
        }

        public Object getVc_ysspwh() {
            return vc_ysspwh;
        }

        public void setVc_ysspwh(Object vc_ysspwh) {
            this.vc_ysspwh = vc_ysspwh;
        }

        public Object getVc_hpyqjsdwsclss() {
            return vc_hpyqjsdwsclss;
        }

        public void setVc_hpyqjsdwsclss(Object vc_hpyqjsdwsclss) {
            this.vc_hpyqjsdwsclss = vc_hpyqjsdwsclss;
        }

        public Object getVc_sjjcdwsclss() {
            return vc_sjjcdwsclss;
        }

        public void setVc_sjjcdwsclss(Object vc_sjjcdwsclss) {
            this.vc_sjjcdwsclss = vc_sjjcdwsclss;
        }

        public Object getVc_sfyhpyqyz() {
            return vc_sfyhpyqyz;
        }

        public void setVc_sfyhpyqyz(Object vc_sfyhpyqyz) {
            this.vc_sfyhpyqyz = vc_sfyhpyqyz;
        }

        public Object getVc_hpzclwsl() {
            return vc_hpzclwsl;
        }

        public void setVc_hpzclwsl(Object vc_hpzclwsl) {
            this.vc_hpzclwsl = vc_hpzclwsl;
        }

        public Object getVc_sjcll() {
            return vc_sjcll;
        }

        public void setVc_sjcll(Object vc_sjcll) {
            this.vc_sjcll = vc_sjcll;
        }

        public Object getVc_sjsfyhpyqyz() {
            return vc_sjsfyhpyqyz;
        }

        public void setVc_sjsfyhpyqyz(Object vc_sjsfyhpyqyz) {
            this.vc_sjsfyhpyqyz = vc_sjsfyhpyqyz;
        }

        public Object getVc_wsclsssfzcyx() {
            return vc_wsclsssfzcyx;
        }

        public void setVc_wsclsssfzcyx(Object vc_wsclsssfzcyx) {
            this.vc_wsclsssfzcyx = vc_wsclsssfzcyx;
        }

        public Object getVc_jqwpwsjczbhsjsfcb() {
            return vc_jqwpwsjczbhsjsfcb;
        }

        public void setVc_jqwpwsjczbhsjsfcb(Object vc_jqwpwsjczbhsjsfcb) {
            this.vc_jqwpwsjczbhsjsfcb = vc_jqwpwsjczbhsjsfcb;
        }

        public Object getVc_cbyz() {
            return vc_cbyz;
        }

        public void setVc_cbyz(Object vc_cbyz) {
            this.vc_cbyz = vc_cbyz;
        }

        public Object getVc_cbjcz() {
            return vc_cbjcz;
        }

        public void setVc_cbjcz(Object vc_cbjcz) {
            this.vc_cbjcz = vc_cbjcz;
        }

        public Object getVc_hpyqjsdfqclss() {
            return vc_hpyqjsdfqclss;
        }

        public void setVc_hpyqjsdfqclss(Object vc_hpyqjsdfqclss) {
            this.vc_hpyqjsdfqclss = vc_hpyqjsdfqclss;
        }

        public Object getVc_sjjcdss() {
            return vc_sjjcdss;
        }

        public void setVc_sjjcdss(Object vc_sjjcdss) {
            this.vc_sjjcdss = vc_sjjcdss;
        }

        public Object getVc_fqclsssfyhpyqyz() {
            return vc_fqclsssfyhpyqyz;
        }

        public void setVc_fqclsssfyhpyqyz(Object vc_fqclsssfyhpyqyz) {
            this.vc_fqclsssfyhpyqyz = vc_fqclsssfyhpyqyz;
        }

        public Object getVc_fqclsssfzcyx() {
            return vc_fqclsssfzcyx;
        }

        public void setVc_fqclsssfzcyx(Object vc_fqclsssfzcyx) {
            this.vc_fqclsssfzcyx = vc_fqclsssfzcyx;
        }

        public Object getVc_jqwpfqjczbhsjsfcb() {
            return vc_jqwpfqjczbhsjsfcb;
        }

        public void setVc_jqwpfqjczbhsjsfcb(Object vc_jqwpfqjczbhsjsfcb) {
            this.vc_jqwpfqjczbhsjsfcb = vc_jqwpfqjczbhsjsfcb;
        }

        public Object getVc_fqcbyz() {
            return vc_fqcbyz;
        }

        public void setVc_fqcbyz(Object vc_fqcbyz) {
            this.vc_fqcbyz = vc_fqcbyz;
        }

        public Object getVc_fqcbjcz() {
            return vc_fqcbjcz;
        }

        public void setVc_fqcbjcz(Object vc_fqcbjcz) {
            this.vc_fqcbjcz = vc_fqcbjcz;
        }

        public Object getVc_hpyqdjzcs() {
            return vc_hpyqdjzcs;
        }

        public void setVc_hpyqdjzcs(Object vc_hpyqdjzcs) {
            this.vc_hpyqdjzcs = vc_hpyqdjzcs;
        }

        public Object getVc_sjcqdjzcs() {
            return vc_sjcqdjzcs;
        }

        public void setVc_sjcqdjzcs(Object vc_sjcqdjzcs) {
            this.vc_sjcqdjzcs = vc_sjcqdjzcs;
        }

        public Object getVc_jzsfyhpyqyz() {
            return vc_jzsfyhpyqyz;
        }

        public void setVc_jzsfyhpyqyz(Object vc_jzsfyhpyqyz) {
            this.vc_jzsfyhpyqyz = vc_jzsfyhpyqyz;
        }

        public Object getVc_hpyqjsdgtfwclss() {
            return vc_hpyqjsdgtfwclss;
        }

        public void setVc_hpyqjsdgtfwclss(Object vc_hpyqjsdgtfwclss) {
            this.vc_hpyqjsdgtfwclss = vc_hpyqjsdgtfwclss;
        }

        public Object getVc_sjjcsss() {
            return vc_sjjcsss;
        }

        public void setVc_sjjcsss(Object vc_sjjcsss) {
            this.vc_sjjcsss = vc_sjjcsss;
        }

        public Object getVc_gtfwsfyhpyqyz() {
            return vc_gtfwsfyhpyqyz;
        }

        public void setVc_gtfwsfyhpyqyz(Object vc_gtfwsfyhpyqyz) {
            this.vc_gtfwsfyhpyqyz = vc_gtfwsfyhpyqyz;
        }

        public Object getVc_hpgfcll() {
            return vc_hpgfcll;
        }

        public void setVc_hpgfcll(Object vc_hpgfcll) {
            this.vc_hpgfcll = vc_hpgfcll;
        }

        public Object getVc_gfsjcll() {
            return vc_gfsjcll;
        }

        public void setVc_gfsjcll(Object vc_gfsjcll) {
            this.vc_gfsjcll = vc_gfsjcll;
        }

        public Object getVc_cllsfyhpyqyz() {
            return vc_cllsfyhpyqyz;
        }

        public void setVc_cllsfyhpyqyz(Object vc_cllsfyhpyqyz) {
            this.vc_cllsfyhpyqyz = vc_cllsfyhpyqyz;
        }

        public Object getVc_gtfwclsssfzcyx() {
            return vc_gtfwclsssfzcyx;
        }

        public void setVc_gtfwclsssfzcyx(Object vc_gtfwclsssfzcyx) {
            this.vc_gtfwclsssfzcyx = vc_gtfwclsssfzcyx;
        }

        public Object getVc_cqfqwhtdsfjwhhcl() {
            return vc_cqfqwhtdsfjwhhcl;
        }

        public void setVc_cqfqwhtdsfjwhhcl(Object vc_cqfqwhtdsfjwhhcl) {
            this.vc_cqfqwhtdsfjwhhcl = vc_cqfqwhtdsfjwhhcl;
        }

        public Object getVc_yzccqsfcqqwflcs() {
            return vc_yzccqsfcqqwflcs;
        }

        public void setVc_yzccqsfcqqwflcs(Object vc_yzccqsfcqqwflcs) {
            this.vc_yzccqsfcqqwflcs = vc_yzccqsfcqqwflcs;
        }

        public Object getVc_sfcqgsflcs() {
            return vc_sfcqgsflcs;
        }

        public void setVc_sfcqgsflcs(Object vc_sfcqgsflcs) {
            this.vc_sfcqgsflcs = vc_sfcqgsflcs;
        }

        public Object getVc_pfksffhgfhjsyq() {
            return vc_pfksffhgfhjsyq;
        }

        public void setVc_pfksffhgfhjsyq(Object vc_pfksffhgfhjsyq) {
            this.vc_pfksffhgfhjsyq = vc_pfksffhgfhjsyq;
        }

        public Object getVc_sfbzswrsgyjya() {
            return vc_sfbzswrsgyjya;
        }

        public void setVc_sfbzswrsgyjya(Object vc_sfbzswrsgyjya) {
            this.vc_sfbzswrsgyjya = vc_sfbzswrsgyjya;
        }

        public Object getVc_jyzccs() {
            return vc_jyzccs;
        }

        public void setVc_jyzccs(Object vc_jyzccs) {
            this.vc_jyzccs = vc_jyzccs;
        }

        public Object getVc_cqcs() {
            return vc_cqcs;
        }

        public void setVc_cqcs(Object vc_cqcs) {
            this.vc_cqcs = vc_cqcs;
        }

        public Object getVc_sfcqcccs() {
            return vc_sfcqcccs;
        }

        public void setVc_sfcqcccs(Object vc_sfcqcccs) {
            this.vc_sfcqcccs = vc_sfcqcccs;
        }

        public Object getCl_jcsfxdwt() {
            return cl_jcsfxdwt;
        }

        public void setCl_jcsfxdwt(Object cl_jcsfxdwt) {
            this.cl_jcsfxdwt = cl_jcsfxdwt;
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
                        (year+1900) + "." + (month+1) + "." + date
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
                        (year+1900) + "." + (month+1) + "." + date
                        ;
            }
        }

        public static class DtCreateTimeBean {
            /**
             * date : 24
             * day : 2
             * hours : 17
             * minutes : 16
             * month : 9
             * nanos : 0
             * seconds : 5
             * time : 1508836565000
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
                        (year+1900) + "." + (month+1) + "." + date
                        ;
            }

        }
        public static class DtYsTime {
            /**
             * date : 24
             * day : 2
             * hours : 17
             * minutes : 16
             * month : 9
             * nanos : 0
             * seconds : 5
             * time : 1508836565000
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
                        (year+1900) + "." + (month+1) + "." + date
                        ;
            }

        }
        public static class DtSpTime {
            /**
             * date : 24
             * day : 2
             * hours : 17
             * minutes : 16
             * month : 9
             * nanos : 0
             * seconds : 5
             * time : 1508836565000
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
                        (year+1900) + "." + (month+1) + "." + date
                        ;
            }

        }

        public DtBzTime getDt_bz_time() {
            return dt_bz_time;
        }

        public void setDt_bz_time(DtBzTime dt_bz_time) {
            this.dt_bz_time = dt_bz_time;
        }

        public static class DtBzTime {
            /**
             * date : 24
             * day : 2
             * hours : 17
             * minutes : 16
             * month : 9
             * nanos : 0
             * seconds : 5
             * time : 1508836565000
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
                        (year+1900) + "." + (month+1) + "." + date
                        ;
            }

        }

        public DtXmJcTime getDt_xmjc_time() {
            return dt_xmjc_time;
        }

        public void setDt_xmjc_time(DtXmJcTime dt_xmjc_time) {
            this.dt_xmjc_time = dt_xmjc_time;
        }

        public static class DtXmJcTime {
            /**
             * date : 24
             * day : 2
             * hours : 17
             * minutes : 16
             * month : 9
             * nanos : 0
             * seconds : 5
             * time : 1508836565000
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
                        (year+1900) + "." + (month+1) + "." + date
                        ;
            }

        }
        public static class DtXmJsTime {
            /**
             * date : 24
             * day : 2
             * hours : 17
             * minutes : 16
             * month : 9
             * nanos : 0
             * seconds : 5
             * time : 1508836565000
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
                        (year+1900) + "." + (month+1) + "." + date
                        ;
            }

        }

    }

    @Override
    public String toString() {
        return "LiveStockFarmBean{" +
                "msg='" + msg + '\'' +
                ", success='" + success + '\'' +
                ", data=" + data +
                '}';
    }
}
