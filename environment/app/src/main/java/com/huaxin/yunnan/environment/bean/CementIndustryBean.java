package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/10/26.
 */

public class CementIndustryBean {

    /**
     * data : [{"t_cement_control_id":"402880ce5ecccd84015eccd270b400b3","dt_begin_time":{"date":1,"day":0,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1506787200000,"timezoneOffset":-480,"year":117},"dt_end_time":{"date":7,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1507305600000,"timezoneOffset":-480,"year":117},"vc_place":"是对方还是","vc_xaminer":"三方通话","vc_law_number":"23456879","vc_recorder":"微软率","vc_sinspected_unit":"阿瑟帝国的","vc_xaminer_id":null,"vc_recorder_id":null,"vc_sinspected_unit_id":null,"vc_code_number":"123456789","vc_legal_representative":null,"vc_legal_id":null,"vc_site_supervisor":"阿斯顿发放","vc_site_id":null,"nb_age":null,"vc_work_unit":null,"vc_post":null,"vc_relationship":null,"vc_address":null,"vc_telephone":"12345667980","vc_postal_code":null,"vc_other_people":null,"vc_unit_name":"aaavv","ch_hbdwlx":"1","ch_supervision_type":"1,3","ch_sfqrzj":null,"ch_sfsqhb":null,"vc_szs":null,"vc_szx":null,"vc_szz":null,"vc_szxac":null,"vc_gyyq":null,"ch_shejicl":null,"vc_sjcl":null,"vc_hpbg":null,"vc_sycf":null,"vc_qtwzl":"1,2","vc_sbmc":null,"vc_sbxh":null,"ch_xmjsnrsfypfyz":null,"vc_xmjsnrsfypfyz_byzds":null,"ch_yxsfypfyz":null,"vc_yxsfypfyz_byzds":null,"vc_qyscxyxqk":null,"ch_sfjrzrgg":null,"vc_fhsczcd":null,"vc_bfhsczcd":null,"dt_xmcssj":null,"dt_pzlxsj":null,"dt_pzlxdw":null,"ch_lxpfwh":null,"vc_hpsfbl":null,"ch_bzhpyxpjbg":null,"vc_hpbzdw":null,"ch_bzsj":null,"ch_sfsyttfw":null,"ch_wpspsj":null,"vc_hbsscspdw":null,"vc_hbsscspsj":null,"vc_hbsscspwh":null,"ch_hbjgyssj":null,"vc_zzysbm":null,"ch_sfjxjg":null,"ch_jgcs":null,"vc_newjgsj":null,"ch_pzlxbm":null,"vc_gkj_lxpfwh":null,"dt_gkj_hpsfbl":null,"ch_wpspdw":null,"dt_spsj":null,"dt_spdw":null,"vc_sscspsj":null,"ch_spwh":null,"vc_hbzgyssj":null,"vc_hbzg_zzysbm":null,"vc_sfsyzcttfw":null,"dt_sfsycyzcttfw":null,"vc_scfscshj":null,"ch_tzwrw":null,"vc_csly":null,"vc_clssw":null,"ch_cllw":null,"vc_sjsfybg":null,"ch_pfqx":null,"vc_sfsjyiysy":null,"dt_sgnw":null,"ch_sfwfps":null,"ch_qtqksm":null,"dt_zxbz":null,"ch_jqjcsfdb":null,"vc_wryzw":null,"vc_ybgfhpzw":null,"ch_ybgfhpzw_nzly":null,"vc_ybgfhpzw_clssw":null,"ch_mqsjmcw":null,"ch_mqsjmcw_nzly":null,"vc_mqsjmcw_clssw":null,"ch_hpzsjwxhxpmcw":null,"ch_sygd":null,"ch_fqschj":null,"vc_hpbgyqczcs":null,"ch_hpbgyqczcs_czlw":null,"vc_sjsyclss":null,"ch_zscshj":null,"vc_zs_sfdb":null,"vc_hjyqwsfhjl":null,"ch_jlnsfybhmb":null,"dt_bhmbjssj":null,"vc_zbhjbhqk":null,"ch_sflscs":null,"vc_wlsqkms":null,"ch_sfbztfya":null,"ch_sfdyapg":null,"ch_sfjxndyl":null,"ch_sfcbwz":null,"cl_qthbbmjcqk":null,"cl_czzywt":null,"cl_jcyq":null,"dt_create_time":{"date":29,"day":5,"hours":16,"minutes":48,"month":8,"nanos":0,"seconds":17,"time":1506674897000,"timezoneOffset":-480,"year":117},"vc_create_user":"admin","vc_create_mechanism":"402848bd4830fed70148312e0efb0631","dt_update_time":{"date":18,"day":3,"hours":20,"minutes":34,"month":9,"nanos":0,"seconds":27,"time":1508330067000,"timezoneOffset":-480,"year":117},"vc_update_user":"admin","vc_uodate_mechanism":"402848bd4830fed70148312e0efb0631","vc_status":null,"instanceid":null,"del_status":"0","t_task_list_id":"1","rownum_":1}]
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
         * t_cement_control_id : 402880ce5ecccd84015eccd270b400b3
         * dt_begin_time : {"date":1,"day":0,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1506787200000,"timezoneOffset":-480,"year":117}
         * dt_end_time : {"date":7,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1507305600000,"timezoneOffset":-480,"year":117}
         * vc_place : 是对方还是
         * vc_xaminer : 三方通话
         * vc_law_number : 23456879
         * vc_recorder : 微软率
         * vc_sinspected_unit : 阿瑟帝国的
         * vc_xaminer_id : null
         * vc_recorder_id : null
         * vc_sinspected_unit_id : null
         * vc_code_number : 123456789
         * vc_legal_representative : null
         * vc_legal_id : null
         * vc_site_supervisor : 阿斯顿发放
         * vc_site_id : null
         * nb_age : null
         * vc_work_unit : null
         * vc_post : null
         * vc_relationship : null
         * vc_address : null
         * vc_telephone : 12345667980
         * vc_postal_code : null
         * vc_other_people : null
         * vc_unit_name : aaavv
         * ch_hbdwlx : 1
         * ch_supervision_type : 1,3
         * ch_sfqrzj : null
         * ch_sfsqhb : null
         * vc_szs : null
         * vc_szx : null
         * vc_szz : null
         * vc_szxac : null
         * vc_gyyq : null
         * ch_shejicl : null
         * vc_sjcl : null
         * vc_hpbg : null
         * vc_sycf : null
         * vc_qtwzl : 1,2
         * vc_sbmc : null
         * vc_sbxh : null
         * ch_xmjsnrsfypfyz : null
         * vc_xmjsnrsfypfyz_byzds : null
         * ch_yxsfypfyz : null
         * vc_yxsfypfyz_byzds : null
         * vc_qyscxyxqk : null
         * ch_sfjrzrgg : null
         * vc_fhsczcd : null
         * vc_bfhsczcd : null
         * dt_xmcssj : null
         * dt_pzlxsj : null
         * dt_pzlxdw : null
         * ch_lxpfwh : null
         * vc_hpsfbl : null
         * ch_bzhpyxpjbg : null
         * vc_hpbzdw : null
         * ch_bzsj : null
         * ch_sfsyttfw : null
         * ch_wpspsj : null
         * vc_hbsscspdw : null
         * vc_hbsscspsj : null
         * vc_hbsscspwh : null
         * ch_hbjgyssj : null
         * vc_zzysbm : null
         * ch_sfjxjg : null
         * ch_jgcs : null
         * vc_newjgsj : null
         * ch_pzlxbm : null
         * vc_gkj_lxpfwh : null
         * dt_gkj_hpsfbl : null
         * ch_wpspdw : null
         * dt_spsj : null
         * dt_spdw : null
         * vc_sscspsj : null
         * ch_spwh : null
         * vc_hbzgyssj : null
         * vc_hbzg_zzysbm : null
         * vc_sfsyzcttfw : null
         * dt_sfsycyzcttfw : null
         * vc_scfscshj : null
         * ch_tzwrw : null
         * vc_csly : null
         * vc_clssw : null
         * ch_cllw : null
         * vc_sjsfybg : null
         * ch_pfqx : null
         * vc_sfsjyiysy : null
         * dt_sgnw : null
         * ch_sfwfps : null
         * ch_qtqksm : null
         * dt_zxbz : null
         * ch_jqjcsfdb : null
         * vc_wryzw : null
         * vc_ybgfhpzw : null
         * ch_ybgfhpzw_nzly : null
         * vc_ybgfhpzw_clssw : null
         * ch_mqsjmcw : null
         * ch_mqsjmcw_nzly : null
         * vc_mqsjmcw_clssw : null
         * ch_hpzsjwxhxpmcw : null
         * ch_sygd : null
         * ch_fqschj : null
         * vc_hpbgyqczcs : null
         * ch_hpbgyqczcs_czlw : null
         * vc_sjsyclss : null
         * ch_zscshj : null
         * vc_zs_sfdb : null
         * vc_hjyqwsfhjl : null
         * ch_jlnsfybhmb : null
         * dt_bhmbjssj : null
         * vc_zbhjbhqk : null
         * ch_sflscs : null
         * vc_wlsqkms : null
         * ch_sfbztfya : null
         * ch_sfdyapg : null
         * ch_sfjxndyl : null
         * ch_sfcbwz : null
         * cl_qthbbmjcqk : null
         * cl_czzywt : null
         * cl_jcyq : null
         * dt_create_time : {"date":29,"day":5,"hours":16,"minutes":48,"month":8,"nanos":0,"seconds":17,"time":1506674897000,"timezoneOffset":-480,"year":117}
         * vc_create_user : admin
         * vc_create_mechanism : 402848bd4830fed70148312e0efb0631
         * dt_update_time : {"date":18,"day":3,"hours":20,"minutes":34,"month":9,"nanos":0,"seconds":27,"time":1508330067000,"timezoneOffset":-480,"year":117}
         * vc_update_user : admin
         * vc_uodate_mechanism : 402848bd4830fed70148312e0efb0631
         * vc_status : null
         * instanceid : null
         * del_status : 0
         * t_task_list_id : 1
         * rownum_ : 1
         */

        private String t_cement_control_id;
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
        private Object vc_legal_representative;
        private Object vc_legal_id;
        private String vc_site_supervisor;
        private Object vc_site_id;
        private Object nb_age;
        private Object vc_work_unit;
        private Object vc_post;
        private Object vc_relationship;
        private Object vc_address;
        private String vc_telephone;
        private Object vc_postal_code;
        private Object vc_other_people;
        private String vc_unit_name;
        private String ch_hbdwlx;
        private String ch_supervision_type;
        private Object ch_sfqrzj;
        private Object ch_sfsqhb;
        private Object vc_szs;
        private Object vc_szx;
        private Object vc_szz;
        private Object vc_szxac;
        private Object vc_gyyq;
        private Object ch_shejicl;
        private Object vc_sjcl;
        private Object vc_hpbg;
        private Object vc_sycf;
        private String vc_qtwzl;
        private Object vc_sbmc;
        private Object vc_sbxh;
        private Object ch_xmjsnrsfypfyz;
        private Object vc_xmjsnrsfypfyz_byzds;
        private Object ch_yxsfypfyz;
        private Object vc_yxsfypfyz_byzds;
        private Object vc_qyscxyxqk;
        private Object ch_sfjrzrgg;
        private Object vc_fhsczcd;
        private Object vc_bfhsczcd;
        private Object dt_xmcssj;
        private Object dt_pzlxsj;
        private Object dt_pzlxdw;
        private Object ch_lxpfwh;
        private Object vc_hpsfbl;
        private Object ch_bzhpyxpjbg;
        private Object vc_hpbzdw;
        private Object ch_bzsj;
        private Object ch_sfsyttfw;
        private Object ch_wpspsj;
        private Object vc_hbsscspdw;
        private Object vc_hbsscspsj;
        private Object vc_hbsscspwh;
        private Object ch_hbjgyssj;
        private Object vc_zzysbm;
        private Object ch_sfjxjg;
        private Object ch_jgcs;
        private Object vc_newjgsj;
        private Object ch_pzlxbm;
        private Object vc_gkj_lxpfwh;
        private Object dt_gkj_hpsfbl;
        private Object ch_wpspdw;
        private Object dt_spsj;
        private Object dt_spdw;
        private Object vc_sscspsj;
        private Object ch_spwh;
        private Object vc_hbzgyssj;
        private Object vc_hbzg_zzysbm;
        private Object vc_sfsyzcttfw;
        private Object dt_sfsycyzcttfw;
        private Object vc_scfscshj;
        private Object ch_tzwrw;
        private Object vc_csly;
        private Object vc_clssw;
        private Object ch_cllw;
        private Object vc_sjsfybg;
        private Object ch_pfqx;
        private Object vc_sfsjyiysy;
        private Object dt_sgnw;
        private Object ch_sfwfps;
        private Object ch_qtqksm;
        private Object dt_zxbz;
        private Object ch_jqjcsfdb;
        private Object vc_wryzw;
        private Object vc_ybgfhpzw;
        private Object ch_ybgfhpzw_nzly;
        private Object vc_ybgfhpzw_clssw;
        private Object ch_mqsjmcw;
        private Object ch_mqsjmcw_nzly;
        private Object vc_mqsjmcw_clssw;
        private Object ch_hpzsjwxhxpmcw;
        private Object ch_sygd;
        private Object ch_fqschj;
        private Object vc_hpbgyqczcs;
        private Object ch_hpbgyqczcs_czlw;
        private Object vc_sjsyclss;
        private Object ch_zscshj;
        private Object vc_zs_sfdb;
        private Object vc_hjyqwsfhjl;
        private Object ch_jlnsfybhmb;
        private Object dt_bhmbjssj;
        private Object vc_zbhjbhqk;
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
        private DtUpdateTimeBean dt_update_time;
        private String vc_update_user;
        private String vc_uodate_mechanism;
        private Object vc_status;
        private Object instanceid;
        private String del_status;
        private String t_task_list_id;
        private int rownum_;

        public String getT_cement_control_id() {
            return t_cement_control_id;
        }

        public void setT_cement_control_id(String t_cement_control_id) {
            this.t_cement_control_id = t_cement_control_id;
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

        public Object getVc_legal_representative() {
            return vc_legal_representative;
        }

        public void setVc_legal_representative(Object vc_legal_representative) {
            this.vc_legal_representative = vc_legal_representative;
        }

        public Object getVc_legal_id() {
            return vc_legal_id;
        }

        public void setVc_legal_id(Object vc_legal_id) {
            this.vc_legal_id = vc_legal_id;
        }

        public String getVc_site_supervisor() {
            return vc_site_supervisor;
        }

        public void setVc_site_supervisor(String vc_site_supervisor) {
            this.vc_site_supervisor = vc_site_supervisor;
        }

        public Object getVc_site_id() {
            return vc_site_id;
        }

        public void setVc_site_id(Object vc_site_id) {
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

        public String getVc_telephone() {
            return vc_telephone;
        }

        public void setVc_telephone(String vc_telephone) {
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

        public String getVc_unit_name() {
            return vc_unit_name;
        }

        public void setVc_unit_name(String vc_unit_name) {
            this.vc_unit_name = vc_unit_name;
        }

        public String getCh_hbdwlx() {
            return ch_hbdwlx;
        }

        public void setCh_hbdwlx(String ch_hbdwlx) {
            this.ch_hbdwlx = ch_hbdwlx;
        }

        public String getCh_supervision_type() {
            return ch_supervision_type;
        }

        public void setCh_supervision_type(String ch_supervision_type) {
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

        public Object getVc_szxac() {
            return vc_szxac;
        }

        public void setVc_szxac(Object vc_szxac) {
            this.vc_szxac = vc_szxac;
        }

        public Object getVc_gyyq() {
            return vc_gyyq;
        }

        public void setVc_gyyq(Object vc_gyyq) {
            this.vc_gyyq = vc_gyyq;
        }

        public Object getCh_shejicl() {
            return ch_shejicl;
        }

        public void setCh_shejicl(Object ch_shejicl) {
            this.ch_shejicl = ch_shejicl;
        }

        public Object getVc_sjcl() {
            return vc_sjcl;
        }

        public void setVc_sjcl(Object vc_sjcl) {
            this.vc_sjcl = vc_sjcl;
        }

        public Object getVc_hpbg() {
            return vc_hpbg;
        }

        public void setVc_hpbg(Object vc_hpbg) {
            this.vc_hpbg = vc_hpbg;
        }

        public Object getVc_sycf() {
            return vc_sycf;
        }

        public void setVc_sycf(Object vc_sycf) {
            this.vc_sycf = vc_sycf;
        }

        public String getVc_qtwzl() {
            return vc_qtwzl;
        }

        public void setVc_qtwzl(String vc_qtwzl) {
            this.vc_qtwzl = vc_qtwzl;
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

        public Object getCh_xmjsnrsfypfyz() {
            return ch_xmjsnrsfypfyz;
        }

        public void setCh_xmjsnrsfypfyz(Object ch_xmjsnrsfypfyz) {
            this.ch_xmjsnrsfypfyz = ch_xmjsnrsfypfyz;
        }

        public Object getVc_xmjsnrsfypfyz_byzds() {
            return vc_xmjsnrsfypfyz_byzds;
        }

        public void setVc_xmjsnrsfypfyz_byzds(Object vc_xmjsnrsfypfyz_byzds) {
            this.vc_xmjsnrsfypfyz_byzds = vc_xmjsnrsfypfyz_byzds;
        }

        public Object getCh_yxsfypfyz() {
            return ch_yxsfypfyz;
        }

        public void setCh_yxsfypfyz(Object ch_yxsfypfyz) {
            this.ch_yxsfypfyz = ch_yxsfypfyz;
        }

        public Object getVc_yxsfypfyz_byzds() {
            return vc_yxsfypfyz_byzds;
        }

        public void setVc_yxsfypfyz_byzds(Object vc_yxsfypfyz_byzds) {
            this.vc_yxsfypfyz_byzds = vc_yxsfypfyz_byzds;
        }

        public Object getVc_qyscxyxqk() {
            return vc_qyscxyxqk;
        }

        public void setVc_qyscxyxqk(Object vc_qyscxyxqk) {
            this.vc_qyscxyxqk = vc_qyscxyxqk;
        }

        public Object getCh_sfjrzrgg() {
            return ch_sfjrzrgg;
        }

        public void setCh_sfjrzrgg(Object ch_sfjrzrgg) {
            this.ch_sfjrzrgg = ch_sfjrzrgg;
        }

        public Object getVc_fhsczcd() {
            return vc_fhsczcd;
        }

        public void setVc_fhsczcd(Object vc_fhsczcd) {
            this.vc_fhsczcd = vc_fhsczcd;
        }

        public Object getVc_bfhsczcd() {
            return vc_bfhsczcd;
        }

        public void setVc_bfhsczcd(Object vc_bfhsczcd) {
            this.vc_bfhsczcd = vc_bfhsczcd;
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

        public Object getCh_lxpfwh() {
            return ch_lxpfwh;
        }

        public void setCh_lxpfwh(Object ch_lxpfwh) {
            this.ch_lxpfwh = ch_lxpfwh;
        }

        public Object getVc_hpsfbl() {
            return vc_hpsfbl;
        }

        public void setVc_hpsfbl(Object vc_hpsfbl) {
            this.vc_hpsfbl = vc_hpsfbl;
        }

        public Object getCh_bzhpyxpjbg() {
            return ch_bzhpyxpjbg;
        }

        public void setCh_bzhpyxpjbg(Object ch_bzhpyxpjbg) {
            this.ch_bzhpyxpjbg = ch_bzhpyxpjbg;
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

        public Object getCh_wpspsj() {
            return ch_wpspsj;
        }

        public void setCh_wpspsj(Object ch_wpspsj) {
            this.ch_wpspsj = ch_wpspsj;
        }

        public Object getVc_hbsscspdw() {
            return vc_hbsscspdw;
        }

        public void setVc_hbsscspdw(Object vc_hbsscspdw) {
            this.vc_hbsscspdw = vc_hbsscspdw;
        }

        public Object getVc_hbsscspsj() {
            return vc_hbsscspsj;
        }

        public void setVc_hbsscspsj(Object vc_hbsscspsj) {
            this.vc_hbsscspsj = vc_hbsscspsj;
        }

        public Object getVc_hbsscspwh() {
            return vc_hbsscspwh;
        }

        public void setVc_hbsscspwh(Object vc_hbsscspwh) {
            this.vc_hbsscspwh = vc_hbsscspwh;
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

        public Object getCh_sfjxjg() {
            return ch_sfjxjg;
        }

        public void setCh_sfjxjg(Object ch_sfjxjg) {
            this.ch_sfjxjg = ch_sfjxjg;
        }

        public Object getCh_jgcs() {
            return ch_jgcs;
        }

        public void setCh_jgcs(Object ch_jgcs) {
            this.ch_jgcs = ch_jgcs;
        }

        public Object getVc_newjgsj() {
            return vc_newjgsj;
        }

        public void setVc_newjgsj(Object vc_newjgsj) {
            this.vc_newjgsj = vc_newjgsj;
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

        public Object getCh_wpspdw() {
            return ch_wpspdw;
        }

        public void setCh_wpspdw(Object ch_wpspdw) {
            this.ch_wpspdw = ch_wpspdw;
        }

        public Object getDt_spsj() {
            return dt_spsj;
        }

        public void setDt_spsj(Object dt_spsj) {
            this.dt_spsj = dt_spsj;
        }

        public Object getDt_spdw() {
            return dt_spdw;
        }

        public void setDt_spdw(Object dt_spdw) {
            this.dt_spdw = dt_spdw;
        }

        public Object getVc_sscspsj() {
            return vc_sscspsj;
        }

        public void setVc_sscspsj(Object vc_sscspsj) {
            this.vc_sscspsj = vc_sscspsj;
        }

        public Object getCh_spwh() {
            return ch_spwh;
        }

        public void setCh_spwh(Object ch_spwh) {
            this.ch_spwh = ch_spwh;
        }

        public Object getVc_hbzgyssj() {
            return vc_hbzgyssj;
        }

        public void setVc_hbzgyssj(Object vc_hbzgyssj) {
            this.vc_hbzgyssj = vc_hbzgyssj;
        }

        public Object getVc_hbzg_zzysbm() {
            return vc_hbzg_zzysbm;
        }

        public void setVc_hbzg_zzysbm(Object vc_hbzg_zzysbm) {
            this.vc_hbzg_zzysbm = vc_hbzg_zzysbm;
        }

        public Object getVc_sfsyzcttfw() {
            return vc_sfsyzcttfw;
        }

        public void setVc_sfsyzcttfw(Object vc_sfsyzcttfw) {
            this.vc_sfsyzcttfw = vc_sfsyzcttfw;
        }

        public Object getDt_sfsycyzcttfw() {
            return dt_sfsycyzcttfw;
        }

        public void setDt_sfsycyzcttfw(Object dt_sfsycyzcttfw) {
            this.dt_sfsycyzcttfw = dt_sfsycyzcttfw;
        }

        public Object getVc_scfscshj() {
            return vc_scfscshj;
        }

        public void setVc_scfscshj(Object vc_scfscshj) {
            this.vc_scfscshj = vc_scfscshj;
        }

        public Object getCh_tzwrw() {
            return ch_tzwrw;
        }

        public void setCh_tzwrw(Object ch_tzwrw) {
            this.ch_tzwrw = ch_tzwrw;
        }

        public Object getVc_csly() {
            return vc_csly;
        }

        public void setVc_csly(Object vc_csly) {
            this.vc_csly = vc_csly;
        }

        public Object getVc_clssw() {
            return vc_clssw;
        }

        public void setVc_clssw(Object vc_clssw) {
            this.vc_clssw = vc_clssw;
        }

        public Object getCh_cllw() {
            return ch_cllw;
        }

        public void setCh_cllw(Object ch_cllw) {
            this.ch_cllw = ch_cllw;
        }

        public Object getVc_sjsfybg() {
            return vc_sjsfybg;
        }

        public void setVc_sjsfybg(Object vc_sjsfybg) {
            this.vc_sjsfybg = vc_sjsfybg;
        }

        public Object getCh_pfqx() {
            return ch_pfqx;
        }

        public void setCh_pfqx(Object ch_pfqx) {
            this.ch_pfqx = ch_pfqx;
        }

        public Object getVc_sfsjyiysy() {
            return vc_sfsjyiysy;
        }

        public void setVc_sfsjyiysy(Object vc_sfsjyiysy) {
            this.vc_sfsjyiysy = vc_sfsjyiysy;
        }

        public Object getDt_sgnw() {
            return dt_sgnw;
        }

        public void setDt_sgnw(Object dt_sgnw) {
            this.dt_sgnw = dt_sgnw;
        }

        public Object getCh_sfwfps() {
            return ch_sfwfps;
        }

        public void setCh_sfwfps(Object ch_sfwfps) {
            this.ch_sfwfps = ch_sfwfps;
        }

        public Object getCh_qtqksm() {
            return ch_qtqksm;
        }

        public void setCh_qtqksm(Object ch_qtqksm) {
            this.ch_qtqksm = ch_qtqksm;
        }

        public Object getDt_zxbz() {
            return dt_zxbz;
        }

        public void setDt_zxbz(Object dt_zxbz) {
            this.dt_zxbz = dt_zxbz;
        }

        public Object getCh_jqjcsfdb() {
            return ch_jqjcsfdb;
        }

        public void setCh_jqjcsfdb(Object ch_jqjcsfdb) {
            this.ch_jqjcsfdb = ch_jqjcsfdb;
        }

        public Object getVc_wryzw() {
            return vc_wryzw;
        }

        public void setVc_wryzw(Object vc_wryzw) {
            this.vc_wryzw = vc_wryzw;
        }

        public Object getVc_ybgfhpzw() {
            return vc_ybgfhpzw;
        }

        public void setVc_ybgfhpzw(Object vc_ybgfhpzw) {
            this.vc_ybgfhpzw = vc_ybgfhpzw;
        }

        public Object getCh_ybgfhpzw_nzly() {
            return ch_ybgfhpzw_nzly;
        }

        public void setCh_ybgfhpzw_nzly(Object ch_ybgfhpzw_nzly) {
            this.ch_ybgfhpzw_nzly = ch_ybgfhpzw_nzly;
        }

        public Object getVc_ybgfhpzw_clssw() {
            return vc_ybgfhpzw_clssw;
        }

        public void setVc_ybgfhpzw_clssw(Object vc_ybgfhpzw_clssw) {
            this.vc_ybgfhpzw_clssw = vc_ybgfhpzw_clssw;
        }

        public Object getCh_mqsjmcw() {
            return ch_mqsjmcw;
        }

        public void setCh_mqsjmcw(Object ch_mqsjmcw) {
            this.ch_mqsjmcw = ch_mqsjmcw;
        }

        public Object getCh_mqsjmcw_nzly() {
            return ch_mqsjmcw_nzly;
        }

        public void setCh_mqsjmcw_nzly(Object ch_mqsjmcw_nzly) {
            this.ch_mqsjmcw_nzly = ch_mqsjmcw_nzly;
        }

        public Object getVc_mqsjmcw_clssw() {
            return vc_mqsjmcw_clssw;
        }

        public void setVc_mqsjmcw_clssw(Object vc_mqsjmcw_clssw) {
            this.vc_mqsjmcw_clssw = vc_mqsjmcw_clssw;
        }

        public Object getCh_hpzsjwxhxpmcw() {
            return ch_hpzsjwxhxpmcw;
        }

        public void setCh_hpzsjwxhxpmcw(Object ch_hpzsjwxhxpmcw) {
            this.ch_hpzsjwxhxpmcw = ch_hpzsjwxhxpmcw;
        }

        public Object getCh_sygd() {
            return ch_sygd;
        }

        public void setCh_sygd(Object ch_sygd) {
            this.ch_sygd = ch_sygd;
        }

        public Object getCh_fqschj() {
            return ch_fqschj;
        }

        public void setCh_fqschj(Object ch_fqschj) {
            this.ch_fqschj = ch_fqschj;
        }

        public Object getVc_hpbgyqczcs() {
            return vc_hpbgyqczcs;
        }

        public void setVc_hpbgyqczcs(Object vc_hpbgyqczcs) {
            this.vc_hpbgyqczcs = vc_hpbgyqczcs;
        }

        public Object getCh_hpbgyqczcs_czlw() {
            return ch_hpbgyqczcs_czlw;
        }

        public void setCh_hpbgyqczcs_czlw(Object ch_hpbgyqczcs_czlw) {
            this.ch_hpbgyqczcs_czlw = ch_hpbgyqczcs_czlw;
        }

        public Object getVc_sjsyclss() {
            return vc_sjsyclss;
        }

        public void setVc_sjsyclss(Object vc_sjsyclss) {
            this.vc_sjsyclss = vc_sjsyclss;
        }

        public Object getCh_zscshj() {
            return ch_zscshj;
        }

        public void setCh_zscshj(Object ch_zscshj) {
            this.ch_zscshj = ch_zscshj;
        }

        public Object getVc_zs_sfdb() {
            return vc_zs_sfdb;
        }

        public void setVc_zs_sfdb(Object vc_zs_sfdb) {
            this.vc_zs_sfdb = vc_zs_sfdb;
        }

        public Object getVc_hjyqwsfhjl() {
            return vc_hjyqwsfhjl;
        }

        public void setVc_hjyqwsfhjl(Object vc_hjyqwsfhjl) {
            this.vc_hjyqwsfhjl = vc_hjyqwsfhjl;
        }

        public Object getCh_jlnsfybhmb() {
            return ch_jlnsfybhmb;
        }

        public void setCh_jlnsfybhmb(Object ch_jlnsfybhmb) {
            this.ch_jlnsfybhmb = ch_jlnsfybhmb;
        }

        public Object getDt_bhmbjssj() {
            return dt_bhmbjssj;
        }

        public void setDt_bhmbjssj(Object dt_bhmbjssj) {
            this.dt_bhmbjssj = dt_bhmbjssj;
        }

        public Object getVc_zbhjbhqk() {
            return vc_zbhjbhqk;
        }

        public void setVc_zbhjbhqk(Object vc_zbhjbhqk) {
            this.vc_zbhjbhqk = vc_zbhjbhqk;
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

        public static class DtBeginTimeBean {
            /**
             * date : 1
             * day : 0
             * hours : 0
             * minutes : 0
             * month : 9
             * nanos : 0
             * seconds : 0
             * time : 1506787200000
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
             * date : 7
             * day : 6
             * hours : 0
             * minutes : 0
             * month : 9
             * nanos : 0
             * seconds : 0
             * time : 1507305600000
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
             * date : 29
             * day : 5
             * hours : 16
             * minutes : 48
             * month : 8
             * nanos : 0
             * seconds : 17
             * time : 1506674897000
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
             * date : 18
             * day : 3
             * hours : 20
             * minutes : 34
             * month : 9
             * nanos : 0
             * seconds : 27
             * time : 1508330067000
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
