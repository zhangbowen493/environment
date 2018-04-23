package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/10/27.
 */

public class EnvironmentBean {

    /**
     * data : [{"t_sthjxcjc_record_id":"402880ce5f5795cd015f57c68e1903d6","dt_start_time":{"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117},"dt_end_time":{"date":28,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509120000000,"timezoneOffset":-480,"year":117},"vc_location":"撒旦发个你","vc_jcr":"admin_1,超级管理员","vc_jcr_id":null,"vc_zfzh":null,"vc_jlr":"啊撒地方","vc_jlr_id":null,"vc_bjcdwmc":"大理怡祥纸业有限公司","vc_bjcdwmc_id":null,"vc_zzjgdmzh":"622898222","vc_fddbr":"朱建平","vc_fddbrsfzh":null,"vc_xcfzr":null,"vc_xcfzrsfzh":null,"nb_age":23,"vc_gzdw":"世代相传v不","vc_duty":"文身断发","vc_ybagx":"啊是单纯v","vc_address":"闪电风暴","vc_telephone":null,"vc_yzbm":null,"cl_qtcjrxmjgzdw":null,"vc_hbdwmc":null,"vc_hbdwlx":null,"vc_hjjclx":null,"vc_sfqrzj":null,"vc_sfsqhb":null,"vc_city":null,"vc_country":null,"vc_zgbm":null,"vc_bhqmj":null,"vc_hxqmj":null,"vc_hcqmj":null,"vc_syqmj":null,"dt_bhqsp_time":null,"vc_bhqspbm":null,"vc_zybhdx":null,"vc_bhqjb":null,"dt_ghbz_time":null,"vc_ghbzqk":null,"vc_slzmgljg":null,"vc_pbzyjsry":null,"vc_zzbzztgh":null,"vc_nrjhbss":null,"vc_fwjxyzfjd":null,"vc_bhqqkygb":null,"vc_bhdxyxbh":null,"vc_snzqs":null,"vc_jcszqs":null,"vc_zqsldfdxj":null,"vc_ywlwzrq":null,"vc_wzm":null,"vc_rqwzzdmj":null,"vc_zcyzwxhyx":null,"vc_zyswhzw":null,"vc_rwyjwlwz":null,"vc_wzmc":null,"vc_zzmj":null,"vc_jzzylyhd":"4,5","vc_yjzzylyhd":null,"vc_rgjjlhzwmj":null,"vc_ygkzmjbl":null,"vc_zwzylyxzfw":null,"vc_sjhxqyhcq":null,"vc_yxgbmpz":null,"dt_pz_time":null,"vc_pzbm":null,"vc_ggstlyfa":null,"vc_jsphxscss":null,"vc_wrwpfcqcs":null,"vc_wrclcs":null,"vc_jqwrwjcsj":null,"vc_wpwrwsfcb":null,"vc_cbwryz":null,"vc_jcjsxms":null,"vc_sxwfjsxm":null,"vc_sfwyhxqhcqsyqn":null,"vc_hxqwfxm":null,"vc_hxqwfxmmc":null,"vc_hcqwfxm":null,"vc_hcqwfxmmc":null,"vc_syqwfxm":null,"vc_syqwfxmmc":null,"vc_bzwjlx":null,"vc_ybzxmgs":null,"vc_ybzxmmc":null,"vc_wbzwjlx":null,"vc_wbzxmgs":null,"vc_wbzxmmc":null,"vc_sfjdhpdj":null,"vc_jdhpdjxm":null,"vc_jdhpxmmc":null,"vc_wfhpspsx":null,"vc_whpspwjs":null,"vc_whpspmc":null,"vc_sfyjsp":null,"vc_yjspxms":null,"vc_yjspxmmc":null,"vc_wxmsyxsp":null,"vc_wxmsyxmc":null,"vc_wxmjghbys":null,"vc_wxmjghbysmc":null,"vc_fzcssfls":null,"vc_wlsdcss":null,"vc_wlsdcsmc":null,"vc_fzsszcyx":null,"vc_yxbzcdqy":null,"vc_yphxss":null,"vc_sfpffhgd":null,"vc_shsthj":null,"vc_czshxstgn":null,"vc_zdtfyjya":null,"vc_dqkzyjyl":null,"cl_jcfxdwt":null,"cl_jcyq":null,"dt_create_time":{"date":26,"day":4,"hours":16,"minutes":21,"month":9,"nanos":0,"seconds":36,"time":1509006096000,"timezoneOffset":-480,"year":117},"vc_create_user":"admin","vc_create_mechanism":"402848bd4830fed70148312e0efb0631","dt_update_time":{"date":26,"day":4,"hours":16,"minutes":21,"month":9,"nanos":0,"seconds":36,"time":1509006096000,"timezoneOffset":-480,"year":117},"vc_update_user":"admin","vc_uodate_mechanism":"402848bd4830fed70148312e0efb0631","vc_status":null,"instanceid":null,"del_status":"0","t_task_list_id":"402880ce5f4bfed5015f4c23b0f70136","rownum_":1}]
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
         * t_sthjxcjc_record_id : 402880ce5f5795cd015f57c68e1903d6
         * dt_start_time : {"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117}
         * dt_end_time : {"date":28,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509120000000,"timezoneOffset":-480,"year":117}
         * vc_location : 撒旦发个你
         * vc_jcr : admin_1,超级管理员
         * vc_jcr_id : null
         * vc_zfzh : null
         * vc_jlr : 啊撒地方
         * vc_jlr_id : null
         * vc_bjcdwmc : 大理怡祥纸业有限公司
         * vc_bjcdwmc_id : null
         * vc_zzjgdmzh : 622898222
         * vc_fddbr : 朱建平
         * vc_fddbrsfzh : null
         * vc_xcfzr : null
         * vc_xcfzrsfzh : null
         * nb_age : 23
         * vc_gzdw : 世代相传v不
         * vc_duty : 文身断发
         * vc_ybagx : 啊是单纯v
         * vc_address : 闪电风暴
         * vc_telephone : null
         * vc_yzbm : null
         * cl_qtcjrxmjgzdw : null
         * vc_hbdwmc : null
         * vc_hbdwlx : null
         * vc_hjjclx : null
         * vc_sfqrzj : null
         * vc_sfsqhb : null
         * vc_city : null
         * vc_country : null
         * vc_zgbm : null
         * vc_bhqmj : null
         * vc_hxqmj : null
         * vc_hcqmj : null
         * vc_syqmj : null
         * dt_bhqsp_time : null
         * vc_bhqspbm : null
         * vc_zybhdx : null
         * vc_bhqjb : null
         * dt_ghbz_time : null
         * vc_ghbzqk : null
         * vc_slzmgljg : null
         * vc_pbzyjsry : null
         * vc_zzbzztgh : null
         * vc_nrjhbss : null
         * vc_fwjxyzfjd : null
         * vc_bhqqkygb : null
         * vc_bhdxyxbh : null
         * vc_snzqs : null
         * vc_jcszqs : null
         * vc_zqsldfdxj : null
         * vc_ywlwzrq : null
         * vc_wzm : null
         * vc_rqwzzdmj : null
         * vc_zcyzwxhyx : null
         * vc_zyswhzw : null
         * vc_rwyjwlwz : null
         * vc_wzmc : null
         * vc_zzmj : null
         * vc_jzzylyhd : 4,5
         * vc_yjzzylyhd : null
         * vc_rgjjlhzwmj : null
         * vc_ygkzmjbl : null
         * vc_zwzylyxzfw : null
         * vc_sjhxqyhcq : null
         * vc_yxgbmpz : null
         * dt_pz_time : null
         * vc_pzbm : null
         * vc_ggstlyfa : null
         * vc_jsphxscss : null
         * vc_wrwpfcqcs : null
         * vc_wrclcs : null
         * vc_jqwrwjcsj : null
         * vc_wpwrwsfcb : null
         * vc_cbwryz : null
         * vc_jcjsxms : null
         * vc_sxwfjsxm : null
         * vc_sfwyhxqhcqsyqn : null
         * vc_hxqwfxm : null
         * vc_hxqwfxmmc : null
         * vc_hcqwfxm : null
         * vc_hcqwfxmmc : null
         * vc_syqwfxm : null
         * vc_syqwfxmmc : null
         * vc_bzwjlx : null
         * vc_ybzxmgs : null
         * vc_ybzxmmc : null
         * vc_wbzwjlx : null
         * vc_wbzxmgs : null
         * vc_wbzxmmc : null
         * vc_sfjdhpdj : null
         * vc_jdhpdjxm : null
         * vc_jdhpxmmc : null
         * vc_wfhpspsx : null
         * vc_whpspwjs : null
         * vc_whpspmc : null
         * vc_sfyjsp : null
         * vc_yjspxms : null
         * vc_yjspxmmc : null
         * vc_wxmsyxsp : null
         * vc_wxmsyxmc : null
         * vc_wxmjghbys : null
         * vc_wxmjghbysmc : null
         * vc_fzcssfls : null
         * vc_wlsdcss : null
         * vc_wlsdcsmc : null
         * vc_fzsszcyx : null
         * vc_yxbzcdqy : null
         * vc_yphxss : null
         * vc_sfpffhgd : null
         * vc_shsthj : null
         * vc_czshxstgn : null
         * vc_zdtfyjya : null
         * vc_dqkzyjyl : null
         * cl_jcfxdwt : null
         * cl_jcyq : null
         * dt_create_time : {"date":26,"day":4,"hours":16,"minutes":21,"month":9,"nanos":0,"seconds":36,"time":1509006096000,"timezoneOffset":-480,"year":117}
         * vc_create_user : admin
         * vc_create_mechanism : 402848bd4830fed70148312e0efb0631
         * dt_update_time : {"date":26,"day":4,"hours":16,"minutes":21,"month":9,"nanos":0,"seconds":36,"time":1509006096000,"timezoneOffset":-480,"year":117}
         * vc_update_user : admin
         * vc_uodate_mechanism : 402848bd4830fed70148312e0efb0631
         * vc_status : null
         * instanceid : null
         * del_status : 0
         * t_task_list_id : 402880ce5f4bfed5015f4c23b0f70136
         * rownum_ : 1
         */

        private String t_sthjxcjc_record_id;
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
        private Object vc_fddbrsfzh;
        private Object vc_xcfzr;
        private Object vc_xcfzrsfzh;
        private String nb_age;
        private String vc_gzdw;
        private String vc_duty;
        private String vc_ybagx;
        private String vc_address;
        private Object vc_telephone;
        private Object vc_yzbm;
        private Object cl_qtcjrxmjgzdw;
        private Object vc_hbdwmc;
        private Object vc_hbdwlx;
        private Object vc_hjjclx;
        private Object vc_sfqrzj;
        private Object vc_sfsqhb;
        private Object vc_city;
        private Object vc_country;
        private Object vc_zgbm;
        private Object vc_bhqmj;
        private Object vc_hxqmj;
        private Object vc_hcqmj;
        private Object vc_syqmj;
        private Object dt_bhqsp_time;
        private Object vc_bhqspbm;
        private Object vc_zybhdx;
        private Object vc_bhqjb;
        private Object dt_ghbz_time;
        private Object vc_ghbzqk;
        private Object vc_slzmgljg;
        private Object vc_pbzyjsry;
        private Object vc_zzbzztgh;
        private Object vc_nrjhbss;
        private Object vc_fwjxyzfjd;
        private Object vc_bhqqkygb;
        private Object vc_bhdxyxbh;
        private Object vc_snzqs;
        private Object vc_jcszqs;
        private Object vc_zqsldfdxj;
        private Object vc_ywlwzrq;
        private Object vc_wzm;
        private Object vc_rqwzzdmj;
        private Object vc_zcyzwxhyx;
        private Object vc_zyswhzw;
        private Object vc_rwyjwlwz;
        private Object vc_wzmc;
        private Object vc_zzmj;
        private String vc_jzzylyhd;
        private Object vc_yjzzylyhd;
        private Object vc_rgjjlhzwmj;
        private Object vc_ygkzmjbl;
        private Object vc_zwzylyxzfw;
        private Object vc_sjhxqyhcq;
        private Object vc_yxgbmpz;
        private Object dt_pz_time;
        private Object vc_pzbm;
        private Object vc_ggstlyfa;
        private Object vc_jsphxscss;
        private Object vc_wrwpfcqcs;
        private Object vc_wrclcs;
        private Object vc_jqwrwjcsj;
        private Object vc_wpwrwsfcb;
        private Object vc_cbwryz;
        private Object vc_jcjsxms;
        private Object vc_sxwfjsxm;
        private Object vc_sfwyhxqhcqsyqn;
        private Object vc_hxqwfxm;
        private Object vc_hxqwfxmmc;
        private Object vc_hcqwfxm;
        private Object vc_hcqwfxmmc;
        private Object vc_syqwfxm;
        private Object vc_syqwfxmmc;
        private Object vc_bzwjlx;
        private Object vc_ybzxmgs;
        private Object vc_ybzxmmc;
        private Object vc_wbzwjlx;
        private Object vc_wbzxmgs;
        private Object vc_wbzxmmc;
        private Object vc_sfjdhpdj;
        private Object vc_jdhpdjxm;
        private Object vc_jdhpxmmc;
        private Object vc_wfhpspsx;
        private Object vc_whpspwjs;
        private Object vc_whpspmc;
        private Object vc_sfyjsp;
        private Object vc_yjspxms;
        private Object vc_yjspxmmc;
        private Object vc_wxmsyxsp;
        private Object vc_wxmsyxmc;
        private Object vc_wxmjghbys;
        private Object vc_wxmjghbysmc;
        private Object vc_fzcssfls;
        private Object vc_wlsdcss;
        private Object vc_wlsdcsmc;
        private Object vc_fzsszcyx;
        private Object vc_yxbzcdqy;
        private Object vc_yphxss;
        private Object vc_sfpffhgd;
        private Object vc_shsthj;
        private Object vc_czshxstgn;
        private Object vc_zdtfyjya;
        private Object vc_dqkzyjyl;
        private Object cl_jcfxdwt;
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

        public String getT_sthjxcjc_record_id() {
            return t_sthjxcjc_record_id;
        }

        public void setT_sthjxcjc_record_id(String t_sthjxcjc_record_id) {
            this.t_sthjxcjc_record_id = t_sthjxcjc_record_id;
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

        public Object getVc_country() {
            return vc_country;
        }

        public void setVc_country(Object vc_country) {
            this.vc_country = vc_country;
        }

        public Object getVc_zgbm() {
            return vc_zgbm;
        }

        public void setVc_zgbm(Object vc_zgbm) {
            this.vc_zgbm = vc_zgbm;
        }

        public Object getVc_bhqmj() {
            return vc_bhqmj;
        }

        public void setVc_bhqmj(Object vc_bhqmj) {
            this.vc_bhqmj = vc_bhqmj;
        }

        public Object getVc_hxqmj() {
            return vc_hxqmj;
        }

        public void setVc_hxqmj(Object vc_hxqmj) {
            this.vc_hxqmj = vc_hxqmj;
        }

        public Object getVc_hcqmj() {
            return vc_hcqmj;
        }

        public void setVc_hcqmj(Object vc_hcqmj) {
            this.vc_hcqmj = vc_hcqmj;
        }

        public Object getVc_syqmj() {
            return vc_syqmj;
        }

        public void setVc_syqmj(Object vc_syqmj) {
            this.vc_syqmj = vc_syqmj;
        }

        public Object getDt_bhqsp_time() {
            return dt_bhqsp_time;
        }

        public void setDt_bhqsp_time(Object dt_bhqsp_time) {
            this.dt_bhqsp_time = dt_bhqsp_time;
        }

        public Object getVc_bhqspbm() {
            return vc_bhqspbm;
        }

        public void setVc_bhqspbm(Object vc_bhqspbm) {
            this.vc_bhqspbm = vc_bhqspbm;
        }

        public Object getVc_zybhdx() {
            return vc_zybhdx;
        }

        public void setVc_zybhdx(Object vc_zybhdx) {
            this.vc_zybhdx = vc_zybhdx;
        }

        public Object getVc_bhqjb() {
            return vc_bhqjb;
        }

        public void setVc_bhqjb(Object vc_bhqjb) {
            this.vc_bhqjb = vc_bhqjb;
        }

        public Object getDt_ghbz_time() {
            return dt_ghbz_time;
        }

        public void setDt_ghbz_time(Object dt_ghbz_time) {
            this.dt_ghbz_time = dt_ghbz_time;
        }

        public Object getVc_ghbzqk() {
            return vc_ghbzqk;
        }

        public void setVc_ghbzqk(Object vc_ghbzqk) {
            this.vc_ghbzqk = vc_ghbzqk;
        }

        public Object getVc_slzmgljg() {
            return vc_slzmgljg;
        }

        public void setVc_slzmgljg(Object vc_slzmgljg) {
            this.vc_slzmgljg = vc_slzmgljg;
        }

        public Object getVc_pbzyjsry() {
            return vc_pbzyjsry;
        }

        public void setVc_pbzyjsry(Object vc_pbzyjsry) {
            this.vc_pbzyjsry = vc_pbzyjsry;
        }

        public Object getVc_zzbzztgh() {
            return vc_zzbzztgh;
        }

        public void setVc_zzbzztgh(Object vc_zzbzztgh) {
            this.vc_zzbzztgh = vc_zzbzztgh;
        }

        public Object getVc_nrjhbss() {
            return vc_nrjhbss;
        }

        public void setVc_nrjhbss(Object vc_nrjhbss) {
            this.vc_nrjhbss = vc_nrjhbss;
        }

        public Object getVc_fwjxyzfjd() {
            return vc_fwjxyzfjd;
        }

        public void setVc_fwjxyzfjd(Object vc_fwjxyzfjd) {
            this.vc_fwjxyzfjd = vc_fwjxyzfjd;
        }

        public Object getVc_bhqqkygb() {
            return vc_bhqqkygb;
        }

        public void setVc_bhqqkygb(Object vc_bhqqkygb) {
            this.vc_bhqqkygb = vc_bhqqkygb;
        }

        public Object getVc_bhdxyxbh() {
            return vc_bhdxyxbh;
        }

        public void setVc_bhdxyxbh(Object vc_bhdxyxbh) {
            this.vc_bhdxyxbh = vc_bhdxyxbh;
        }

        public Object getVc_snzqs() {
            return vc_snzqs;
        }

        public void setVc_snzqs(Object vc_snzqs) {
            this.vc_snzqs = vc_snzqs;
        }

        public Object getVc_jcszqs() {
            return vc_jcszqs;
        }

        public void setVc_jcszqs(Object vc_jcszqs) {
            this.vc_jcszqs = vc_jcszqs;
        }

        public Object getVc_zqsldfdxj() {
            return vc_zqsldfdxj;
        }

        public void setVc_zqsldfdxj(Object vc_zqsldfdxj) {
            this.vc_zqsldfdxj = vc_zqsldfdxj;
        }

        public Object getVc_ywlwzrq() {
            return vc_ywlwzrq;
        }

        public void setVc_ywlwzrq(Object vc_ywlwzrq) {
            this.vc_ywlwzrq = vc_ywlwzrq;
        }

        public Object getVc_wzm() {
            return vc_wzm;
        }

        public void setVc_wzm(Object vc_wzm) {
            this.vc_wzm = vc_wzm;
        }

        public Object getVc_rqwzzdmj() {
            return vc_rqwzzdmj;
        }

        public void setVc_rqwzzdmj(Object vc_rqwzzdmj) {
            this.vc_rqwzzdmj = vc_rqwzzdmj;
        }

        public Object getVc_zcyzwxhyx() {
            return vc_zcyzwxhyx;
        }

        public void setVc_zcyzwxhyx(Object vc_zcyzwxhyx) {
            this.vc_zcyzwxhyx = vc_zcyzwxhyx;
        }

        public Object getVc_zyswhzw() {
            return vc_zyswhzw;
        }

        public void setVc_zyswhzw(Object vc_zyswhzw) {
            this.vc_zyswhzw = vc_zyswhzw;
        }

        public Object getVc_rwyjwlwz() {
            return vc_rwyjwlwz;
        }

        public void setVc_rwyjwlwz(Object vc_rwyjwlwz) {
            this.vc_rwyjwlwz = vc_rwyjwlwz;
        }

        public Object getVc_wzmc() {
            return vc_wzmc;
        }

        public void setVc_wzmc(Object vc_wzmc) {
            this.vc_wzmc = vc_wzmc;
        }

        public Object getVc_zzmj() {
            return vc_zzmj;
        }

        public void setVc_zzmj(Object vc_zzmj) {
            this.vc_zzmj = vc_zzmj;
        }

        public String getVc_jzzylyhd() {
            return vc_jzzylyhd;
        }

        public void setVc_jzzylyhd(String vc_jzzylyhd) {
            this.vc_jzzylyhd = vc_jzzylyhd;
        }

        public Object getVc_yjzzylyhd() {
            return vc_yjzzylyhd;
        }

        public void setVc_yjzzylyhd(Object vc_yjzzylyhd) {
            this.vc_yjzzylyhd = vc_yjzzylyhd;
        }

        public Object getVc_rgjjlhzwmj() {
            return vc_rgjjlhzwmj;
        }

        public void setVc_rgjjlhzwmj(Object vc_rgjjlhzwmj) {
            this.vc_rgjjlhzwmj = vc_rgjjlhzwmj;
        }

        public Object getVc_ygkzmjbl() {
            return vc_ygkzmjbl;
        }

        public void setVc_ygkzmjbl(Object vc_ygkzmjbl) {
            this.vc_ygkzmjbl = vc_ygkzmjbl;
        }

        public Object getVc_zwzylyxzfw() {
            return vc_zwzylyxzfw;
        }

        public void setVc_zwzylyxzfw(Object vc_zwzylyxzfw) {
            this.vc_zwzylyxzfw = vc_zwzylyxzfw;
        }

        public Object getVc_sjhxqyhcq() {
            return vc_sjhxqyhcq;
        }

        public void setVc_sjhxqyhcq(Object vc_sjhxqyhcq) {
            this.vc_sjhxqyhcq = vc_sjhxqyhcq;
        }

        public Object getVc_yxgbmpz() {
            return vc_yxgbmpz;
        }

        public void setVc_yxgbmpz(Object vc_yxgbmpz) {
            this.vc_yxgbmpz = vc_yxgbmpz;
        }

        public Object getDt_pz_time() {
            return dt_pz_time;
        }

        public void setDt_pz_time(Object dt_pz_time) {
            this.dt_pz_time = dt_pz_time;
        }

        public Object getVc_pzbm() {
            return vc_pzbm;
        }

        public void setVc_pzbm(Object vc_pzbm) {
            this.vc_pzbm = vc_pzbm;
        }

        public Object getVc_ggstlyfa() {
            return vc_ggstlyfa;
        }

        public void setVc_ggstlyfa(Object vc_ggstlyfa) {
            this.vc_ggstlyfa = vc_ggstlyfa;
        }

        public Object getVc_jsphxscss() {
            return vc_jsphxscss;
        }

        public void setVc_jsphxscss(Object vc_jsphxscss) {
            this.vc_jsphxscss = vc_jsphxscss;
        }

        public Object getVc_wrwpfcqcs() {
            return vc_wrwpfcqcs;
        }

        public void setVc_wrwpfcqcs(Object vc_wrwpfcqcs) {
            this.vc_wrwpfcqcs = vc_wrwpfcqcs;
        }

        public Object getVc_wrclcs() {
            return vc_wrclcs;
        }

        public void setVc_wrclcs(Object vc_wrclcs) {
            this.vc_wrclcs = vc_wrclcs;
        }

        public Object getVc_jqwrwjcsj() {
            return vc_jqwrwjcsj;
        }

        public void setVc_jqwrwjcsj(Object vc_jqwrwjcsj) {
            this.vc_jqwrwjcsj = vc_jqwrwjcsj;
        }

        public Object getVc_wpwrwsfcb() {
            return vc_wpwrwsfcb;
        }

        public void setVc_wpwrwsfcb(Object vc_wpwrwsfcb) {
            this.vc_wpwrwsfcb = vc_wpwrwsfcb;
        }

        public Object getVc_cbwryz() {
            return vc_cbwryz;
        }

        public void setVc_cbwryz(Object vc_cbwryz) {
            this.vc_cbwryz = vc_cbwryz;
        }

        public Object getVc_jcjsxms() {
            return vc_jcjsxms;
        }

        public void setVc_jcjsxms(Object vc_jcjsxms) {
            this.vc_jcjsxms = vc_jcjsxms;
        }

        public Object getVc_sxwfjsxm() {
            return vc_sxwfjsxm;
        }

        public void setVc_sxwfjsxm(Object vc_sxwfjsxm) {
            this.vc_sxwfjsxm = vc_sxwfjsxm;
        }

        public Object getVc_sfwyhxqhcqsyqn() {
            return vc_sfwyhxqhcqsyqn;
        }

        public void setVc_sfwyhxqhcqsyqn(Object vc_sfwyhxqhcqsyqn) {
            this.vc_sfwyhxqhcqsyqn = vc_sfwyhxqhcqsyqn;
        }

        public Object getVc_hxqwfxm() {
            return vc_hxqwfxm;
        }

        public void setVc_hxqwfxm(Object vc_hxqwfxm) {
            this.vc_hxqwfxm = vc_hxqwfxm;
        }

        public Object getVc_hxqwfxmmc() {
            return vc_hxqwfxmmc;
        }

        public void setVc_hxqwfxmmc(Object vc_hxqwfxmmc) {
            this.vc_hxqwfxmmc = vc_hxqwfxmmc;
        }

        public Object getVc_hcqwfxm() {
            return vc_hcqwfxm;
        }

        public void setVc_hcqwfxm(Object vc_hcqwfxm) {
            this.vc_hcqwfxm = vc_hcqwfxm;
        }

        public Object getVc_hcqwfxmmc() {
            return vc_hcqwfxmmc;
        }

        public void setVc_hcqwfxmmc(Object vc_hcqwfxmmc) {
            this.vc_hcqwfxmmc = vc_hcqwfxmmc;
        }

        public Object getVc_syqwfxm() {
            return vc_syqwfxm;
        }

        public void setVc_syqwfxm(Object vc_syqwfxm) {
            this.vc_syqwfxm = vc_syqwfxm;
        }

        public Object getVc_syqwfxmmc() {
            return vc_syqwfxmmc;
        }

        public void setVc_syqwfxmmc(Object vc_syqwfxmmc) {
            this.vc_syqwfxmmc = vc_syqwfxmmc;
        }

        public Object getVc_bzwjlx() {
            return vc_bzwjlx;
        }

        public void setVc_bzwjlx(Object vc_bzwjlx) {
            this.vc_bzwjlx = vc_bzwjlx;
        }

        public Object getVc_ybzxmgs() {
            return vc_ybzxmgs;
        }

        public void setVc_ybzxmgs(Object vc_ybzxmgs) {
            this.vc_ybzxmgs = vc_ybzxmgs;
        }

        public Object getVc_ybzxmmc() {
            return vc_ybzxmmc;
        }

        public void setVc_ybzxmmc(Object vc_ybzxmmc) {
            this.vc_ybzxmmc = vc_ybzxmmc;
        }

        public Object getVc_wbzwjlx() {
            return vc_wbzwjlx;
        }

        public void setVc_wbzwjlx(Object vc_wbzwjlx) {
            this.vc_wbzwjlx = vc_wbzwjlx;
        }

        public Object getVc_wbzxmgs() {
            return vc_wbzxmgs;
        }

        public void setVc_wbzxmgs(Object vc_wbzxmgs) {
            this.vc_wbzxmgs = vc_wbzxmgs;
        }

        public Object getVc_wbzxmmc() {
            return vc_wbzxmmc;
        }

        public void setVc_wbzxmmc(Object vc_wbzxmmc) {
            this.vc_wbzxmmc = vc_wbzxmmc;
        }

        public Object getVc_sfjdhpdj() {
            return vc_sfjdhpdj;
        }

        public void setVc_sfjdhpdj(Object vc_sfjdhpdj) {
            this.vc_sfjdhpdj = vc_sfjdhpdj;
        }

        public Object getVc_jdhpdjxm() {
            return vc_jdhpdjxm;
        }

        public void setVc_jdhpdjxm(Object vc_jdhpdjxm) {
            this.vc_jdhpdjxm = vc_jdhpdjxm;
        }

        public Object getVc_jdhpxmmc() {
            return vc_jdhpxmmc;
        }

        public void setVc_jdhpxmmc(Object vc_jdhpxmmc) {
            this.vc_jdhpxmmc = vc_jdhpxmmc;
        }

        public Object getVc_wfhpspsx() {
            return vc_wfhpspsx;
        }

        public void setVc_wfhpspsx(Object vc_wfhpspsx) {
            this.vc_wfhpspsx = vc_wfhpspsx;
        }

        public Object getVc_whpspwjs() {
            return vc_whpspwjs;
        }

        public void setVc_whpspwjs(Object vc_whpspwjs) {
            this.vc_whpspwjs = vc_whpspwjs;
        }

        public Object getVc_whpspmc() {
            return vc_whpspmc;
        }

        public void setVc_whpspmc(Object vc_whpspmc) {
            this.vc_whpspmc = vc_whpspmc;
        }

        public Object getVc_sfyjsp() {
            return vc_sfyjsp;
        }

        public void setVc_sfyjsp(Object vc_sfyjsp) {
            this.vc_sfyjsp = vc_sfyjsp;
        }

        public Object getVc_yjspxms() {
            return vc_yjspxms;
        }

        public void setVc_yjspxms(Object vc_yjspxms) {
            this.vc_yjspxms = vc_yjspxms;
        }

        public Object getVc_yjspxmmc() {
            return vc_yjspxmmc;
        }

        public void setVc_yjspxmmc(Object vc_yjspxmmc) {
            this.vc_yjspxmmc = vc_yjspxmmc;
        }

        public Object getVc_wxmsyxsp() {
            return vc_wxmsyxsp;
        }

        public void setVc_wxmsyxsp(Object vc_wxmsyxsp) {
            this.vc_wxmsyxsp = vc_wxmsyxsp;
        }

        public Object getVc_wxmsyxmc() {
            return vc_wxmsyxmc;
        }

        public void setVc_wxmsyxmc(Object vc_wxmsyxmc) {
            this.vc_wxmsyxmc = vc_wxmsyxmc;
        }

        public Object getVc_wxmjghbys() {
            return vc_wxmjghbys;
        }

        public void setVc_wxmjghbys(Object vc_wxmjghbys) {
            this.vc_wxmjghbys = vc_wxmjghbys;
        }

        public Object getVc_wxmjghbysmc() {
            return vc_wxmjghbysmc;
        }

        public void setVc_wxmjghbysmc(Object vc_wxmjghbysmc) {
            this.vc_wxmjghbysmc = vc_wxmjghbysmc;
        }

        public Object getVc_fzcssfls() {
            return vc_fzcssfls;
        }

        public void setVc_fzcssfls(Object vc_fzcssfls) {
            this.vc_fzcssfls = vc_fzcssfls;
        }

        public Object getVc_wlsdcss() {
            return vc_wlsdcss;
        }

        public void setVc_wlsdcss(Object vc_wlsdcss) {
            this.vc_wlsdcss = vc_wlsdcss;
        }

        public Object getVc_wlsdcsmc() {
            return vc_wlsdcsmc;
        }

        public void setVc_wlsdcsmc(Object vc_wlsdcsmc) {
            this.vc_wlsdcsmc = vc_wlsdcsmc;
        }

        public Object getVc_fzsszcyx() {
            return vc_fzsszcyx;
        }

        public void setVc_fzsszcyx(Object vc_fzsszcyx) {
            this.vc_fzsszcyx = vc_fzsszcyx;
        }

        public Object getVc_yxbzcdqy() {
            return vc_yxbzcdqy;
        }

        public void setVc_yxbzcdqy(Object vc_yxbzcdqy) {
            this.vc_yxbzcdqy = vc_yxbzcdqy;
        }

        public Object getVc_yphxss() {
            return vc_yphxss;
        }

        public void setVc_yphxss(Object vc_yphxss) {
            this.vc_yphxss = vc_yphxss;
        }

        public Object getVc_sfpffhgd() {
            return vc_sfpffhgd;
        }

        public void setVc_sfpffhgd(Object vc_sfpffhgd) {
            this.vc_sfpffhgd = vc_sfpffhgd;
        }

        public Object getVc_shsthj() {
            return vc_shsthj;
        }

        public void setVc_shsthj(Object vc_shsthj) {
            this.vc_shsthj = vc_shsthj;
        }

        public Object getVc_czshxstgn() {
            return vc_czshxstgn;
        }

        public void setVc_czshxstgn(Object vc_czshxstgn) {
            this.vc_czshxstgn = vc_czshxstgn;
        }

        public Object getVc_zdtfyjya() {
            return vc_zdtfyjya;
        }

        public void setVc_zdtfyjya(Object vc_zdtfyjya) {
            this.vc_zdtfyjya = vc_zdtfyjya;
        }

        public Object getVc_dqkzyjyl() {
            return vc_dqkzyjyl;
        }

        public void setVc_dqkzyjyl(Object vc_dqkzyjyl) {
            this.vc_dqkzyjyl = vc_dqkzyjyl;
        }

        public Object getCl_jcfxdwt() {
            return cl_jcfxdwt;
        }

        public void setCl_jcfxdwt(Object cl_jcfxdwt) {
            this.cl_jcfxdwt = cl_jcfxdwt;
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
             * date : 26
             * day : 4
             * hours : 16
             * minutes : 21
             * month : 9
             * nanos : 0
             * seconds : 36
             * time : 1509006096000
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

        public static class DtUpdateTimeBean {
            /**
             * date : 26
             * day : 4
             * hours : 16
             * minutes : 21
             * month : 9
             * nanos : 0
             * seconds : 36
             * time : 1509006096000
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
}
