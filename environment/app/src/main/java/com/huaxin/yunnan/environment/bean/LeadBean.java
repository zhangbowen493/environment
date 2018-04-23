package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/10/27.
 */

public class LeadBean {

    /**
     * data : [{"t_qian_control_id":"402880ce5f5795cd015f57c12d82028c","dt_begin_time":{"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117},"dt_end_time":{"date":28,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509120000000,"timezoneOffset":-480,"year":117},"vc_place":"东风风神","vc_xaminer":"admin_1,超级管理员","vc_law_number":null,"vc_recorder":"admin_1","vc_sinspected_unit":"大理怡祥纸业有限公司","vc_xaminer_id":null,"vc_recorder_id":null,"vc_sinspected_unit_id":"402880495f04f3a1015f05815f49019c","vc_code_number":"622898222","vc_legal_representative":"朱建平","vc_legal_id":null,"vc_site_supervisor":"阿三","vc_site_id":null,"nb_age":null,"vc_work_unit":null,"vc_post":null,"vc_relationship":null,"vc_address":null,"vc_telephone":null,"vc_postal_code":null,"vc_other_people":null,"vc_unit_name":null,"ch_hbdwlx":"1","ch_supervision_type":"1,2","ch_sfqrzj":null,"ch_sfsqhb":null,"vc_szs":null,"vc_szx":null,"vc_szz":null,"vc_szxzc":null,"vc_gyyq":null,"vc_pq":null,"ch_jcxczt":null,"vc_qycp":null,"vc_cqcl":"12","vc_dqcl":null,"vc_lscl":null,"vc_qtcl":null,"vc_sczyyfl":null,"vc_sczyyfl2":null,"vc_qtscgy":null,"vc_cqjlscgy":null,"vc_qtscgy2":null,"vc_lsscgy":null,"vc_zysczzjsb":null,"ch_sfygyyqjs":null,"vc_bfdy":null,"ch_wrfzsffhyq":null,"vc_wddxms":null,"vc_hpbzdw":null,"dt_hpbzsj":null,"vc_hpspdw":null,"dt_hpspsj":null,"vc_hpspwh":null,"vc_sscpfdw":null,"dt_sscpfsj":null,"vc_sscpfwh":null,"vc_hbjgysdw":null,"dt_hbjgyssj":null,"vc_hbjgyswh":null,"ch_sfqzbagdpw":null,"ch_sfjxpwdj":null,"ch_sfzejnwf":null,"vc_synjnpwf":null,"vc_yjnpwf":null,"vc_wjnyy":null,"vc_wsjsxfs":null,"vc_tzwrw":null,"vc_sjcsl":null,"ch_sfptjswsclz":null,"vc_wscll":null,"ch_fssfwp":null,"ch_fsclsfybg":null,"vc_wscll2":null,"ch_fsflfs":null,"ch_fstpfs":null,"vc_bgqksm":null,"vc_zywxfw":"1,2","vc_csl1":null,"vc_czcs1":null,"vc_csl2":null,"vc_czcs2":null,"vc_csl3":null,"vc_czcs3":null,"vc_csl4":null,"vc_czcs4":null,"vc_csl5":null,"vc_czcs5":null,"vc_csl6":null,"vc_czcs6":null,"vc_csl7":null,"vc_czcs7":null,"vc_csl8":null,"vc_czcs8":null,"vc_qtwxfw":"千瓦时","vc_csl":null,"vc_czcs":null,"ch_czqksfsb":null,"vc_wsbdynx":null,"ch_sfsybs":null,"ch_qtwxfwtzsfzqgf":null,"ch_sffhccgf":null,"ch_lscfsfcgyn":null,"ch_sfjyyjdc":null,"ch_sfzxldzd":null,"ch_yscsfyzz":null,"vc_ysl":null,"vc_pc":null,"ch_jsdwsfyzz":null,"vc_sjczfs":null,"vc_qtybgf":null,"ch_sfgfcc":null,"ch_zhlycssffhhpyq":null,"vc_cqfs":null,"vc_fqcshj":null,"ch_sfptfqzlss":null,"vc_wptjsssmc":null,"ch_sfcb":null,"vc_cbyzjczw":null,"vc_jcdw":null,"dt_jcsj":null,"ch_zxjczzsfaz":null,"dt_azsj":null,"ch_sflw":null,"ch_sfyxzc":null,"ch_sfjgxy":null,"dt_xysj":null,"vc_zxjcsjxsw":null,"ch_sfcqjz":null,"vc_wptjsdssw":null,"vc_wsfhjl":null,"ch_sfcqjz2":null,"dt_jcsj2":null,"vc_wsfhjl2":null,"ch_sflscs":null,"vc_wlsqkms":null,"ch_sfbztfya":null,"ch_sfdyapg":null,"ch_sfjxndyl":null,"ch_sfcbwz":null,"cl_qthbbmjcqk":null,"cl_czzywt":null,"cl_jcyq":null,"dt_create_time":{"date":26,"day":4,"hours":16,"minutes":15,"month":9,"nanos":0,"seconds":44,"time":1509005744000,"timezoneOffset":-480,"year":117},"vc_create_user":"admin","vc_create_mechanism":"402848bd4830fed70148312e0efb0631","dt_update_time":{"date":26,"day":4,"hours":16,"minutes":15,"month":9,"nanos":0,"seconds":44,"time":1509005744000,"timezoneOffset":-480,"year":117},"vc_update_user":"admin","vc_uodate_mechanism":"402848bd4830fed70148312e0efb0631","vc_status":null,"instanceid":null,"del_status":"0","t_task_list_id":"402880ce5f4bfed5015f4c23b0f70136","rownum_":1}]
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
         * t_qian_control_id : 402880ce5f5795cd015f57c12d82028c
         * dt_begin_time : {"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117}
         * dt_end_time : {"date":28,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509120000000,"timezoneOffset":-480,"year":117}
         * vc_place : 东风风神
         * vc_xaminer : admin_1,超级管理员
         * vc_law_number : null
         * vc_recorder : admin_1
         * vc_sinspected_unit : 大理怡祥纸业有限公司
         * vc_xaminer_id : null
         * vc_recorder_id : null
         * vc_sinspected_unit_id : 402880495f04f3a1015f05815f49019c
         * vc_code_number : 622898222
         * vc_legal_representative : 朱建平
         * vc_legal_id : null
         * vc_site_supervisor : 阿三
         * vc_site_id : null
         * nb_age : null
         * vc_work_unit : null
         * vc_post : null
         * vc_relationship : null
         * vc_address : null
         * vc_telephone : null
         * vc_postal_code : null
         * vc_other_people : null
         * vc_unit_name : null
         * ch_hbdwlx : 1
         * ch_supervision_type : 1,2
         * ch_sfqrzj : null
         * ch_sfsqhb : null
         * vc_szs : null
         * vc_szx : null
         * vc_szz : null
         * vc_szxzc : null
         * vc_gyyq : null
         * vc_pq : null
         * ch_jcxczt : null
         * vc_qycp : null
         * vc_cqcl : 12
         * vc_dqcl : null
         * vc_lscl : null
         * vc_qtcl : null
         * vc_sczyyfl : null
         * vc_sczyyfl2 : null
         * vc_qtscgy : null
         * vc_cqjlscgy : null
         * vc_qtscgy2 : null
         * vc_lsscgy : null
         * vc_zysczzjsb : null
         * ch_sfygyyqjs : null
         * vc_bfdy : null
         * ch_wrfzsffhyq : null
         * vc_wddxms : null
         * vc_hpbzdw : null
         * dt_hpbzsj : null
         * vc_hpspdw : null
         * dt_hpspsj : null
         * vc_hpspwh : null
         * vc_sscpfdw : null
         * dt_sscpfsj : null
         * vc_sscpfwh : null
         * vc_hbjgysdw : null
         * dt_hbjgyssj : null
         * vc_hbjgyswh : null
         * ch_sfqzbagdpw : null
         * ch_sfjxpwdj : null
         * ch_sfzejnwf : null
         * vc_synjnpwf : null
         * vc_yjnpwf : null
         * vc_wjnyy : null
         * vc_wsjsxfs : null
         * vc_tzwrw : null
         * vc_sjcsl : null
         * ch_sfptjswsclz : null
         * vc_wscll : null
         * ch_fssfwp : null
         * ch_fsclsfybg : null
         * vc_wscll2 : null
         * ch_fsflfs : null
         * ch_fstpfs : null
         * vc_bgqksm : null
         * vc_zywxfw : 1,2
         * vc_csl1 : null
         * vc_czcs1 : null
         * vc_csl2 : null
         * vc_czcs2 : null
         * vc_csl3 : null
         * vc_czcs3 : null
         * vc_csl4 : null
         * vc_czcs4 : null
         * vc_csl5 : null
         * vc_czcs5 : null
         * vc_csl6 : null
         * vc_czcs6 : null
         * vc_csl7 : null
         * vc_czcs7 : null
         * vc_csl8 : null
         * vc_czcs8 : null
         * vc_qtwxfw : 千瓦时
         * vc_csl : null
         * vc_czcs : null
         * ch_czqksfsb : null
         * vc_wsbdynx : null
         * ch_sfsybs : null
         * ch_qtwxfwtzsfzqgf : null
         * ch_sffhccgf : null
         * ch_lscfsfcgyn : null
         * ch_sfjyyjdc : null
         * ch_sfzxldzd : null
         * ch_yscsfyzz : null
         * vc_ysl : null
         * vc_pc : null
         * ch_jsdwsfyzz : null
         * vc_sjczfs : null
         * vc_qtybgf : null
         * ch_sfgfcc : null
         * ch_zhlycssffhhpyq : null
         * vc_cqfs : null
         * vc_fqcshj : null
         * ch_sfptfqzlss : null
         * vc_wptjsssmc : null
         * ch_sfcb : null
         * vc_cbyzjczw : null
         * vc_jcdw : null
         * dt_jcsj : null
         * ch_zxjczzsfaz : null
         * dt_azsj : null
         * ch_sflw : null
         * ch_sfyxzc : null
         * ch_sfjgxy : null
         * dt_xysj : null
         * vc_zxjcsjxsw : null
         * ch_sfcqjz : null
         * vc_wptjsdssw : null
         * vc_wsfhjl : null
         * ch_sfcqjz2 : null
         * dt_jcsj2 : null
         * vc_wsfhjl2 : null
         * ch_sflscs : null
         * vc_wlsqkms : null
         * ch_sfbztfya : null
         * ch_sfdyapg : null
         * ch_sfjxndyl : null
         * ch_sfcbwz : null
         * cl_qthbbmjcqk : null
         * cl_czzywt : null
         * cl_jcyq : null
         * dt_create_time : {"date":26,"day":4,"hours":16,"minutes":15,"month":9,"nanos":0,"seconds":44,"time":1509005744000,"timezoneOffset":-480,"year":117}
         * vc_create_user : admin
         * vc_create_mechanism : 402848bd4830fed70148312e0efb0631
         * dt_update_time : {"date":26,"day":4,"hours":16,"minutes":15,"month":9,"nanos":0,"seconds":44,"time":1509005744000,"timezoneOffset":-480,"year":117}
         * vc_update_user : admin
         * vc_uodate_mechanism : 402848bd4830fed70148312e0efb0631
         * vc_status : null
         * instanceid : null
         * del_status : 0
         * t_task_list_id : 402880ce5f4bfed5015f4c23b0f70136
         * rownum_ : 1
         */

        private String t_qian_control_id;
        private DtBeginTimeBean dt_begin_time;
        private DtEndTimeBean dt_end_time;
        private String vc_place;
        private String vc_xaminer;
        private Object vc_law_number;
        private String vc_recorder;
        private String vc_sinspected_unit;
        private Object vc_xaminer_id;
        private Object vc_recorder_id;
        private String vc_sinspected_unit_id;
        private String vc_code_number;
        private String vc_legal_representative;
        private Object vc_legal_id;
        private String vc_site_supervisor;
        private Object vc_site_id;
        private Object nb_age;
        private Object vc_work_unit;
        private Object vc_post;
        private Object vc_relationship;
        private Object vc_address;
        private Object vc_telephone;
        private Object vc_postal_code;
        private Object vc_other_people;
        private Object vc_unit_name;
        private String ch_hbdwlx;
        private String ch_supervision_type;
        private Object ch_sfqrzj;
        private Object ch_sfsqhb;
        private Object vc_szs;
        private Object vc_szx;
        private Object vc_szz;
        private Object vc_szxzc;
        private Object vc_gyyq;
        private Object vc_pq;
        private Object ch_jcxczt;
        private Object vc_qycp;
        private String vc_cqcl;
        private Object vc_dqcl;
        private Object vc_lscl;
        private Object vc_qtcl;
        private Object vc_sczyyfl;
        private Object vc_sczyyfl2;
        private Object vc_qtscgy;
        private Object vc_cqjlscgy;
        private Object vc_qtscgy2;
        private Object vc_lsscgy;
        private Object vc_zysczzjsb;
        private Object ch_sfygyyqjs;
        private Object vc_bfdy;
        private Object ch_wrfzsffhyq;
        private Object vc_wddxms;
        private Object vc_hpbzdw;
        private Object dt_hpbzsj;
        private Object vc_hpspdw;
        private Object dt_hpspsj;
        private Object vc_hpspwh;
        private Object vc_sscpfdw;
        private Object dt_sscpfsj;
        private Object vc_sscpfwh;
        private Object vc_hbjgysdw;
        private Object dt_hbjgyssj;
        private Object vc_hbjgyswh;
        private Object ch_sfqzbagdpw;
        private Object ch_sfjxpwdj;
        private Object ch_sfzejnwf;
        private Object vc_synjnpwf;
        private Object vc_yjnpwf;
        private Object vc_wjnyy;
        private Object vc_wsjsxfs;
        private Object vc_tzwrw;
        private Object vc_sjcsl;
        private Object ch_sfptjswsclz;
        private Object vc_wscll;
        private Object ch_fssfwp;
        private Object ch_fsclsfybg;
        private Object vc_wscll2;
        private Object ch_fsflfs;
        private Object ch_fstpfs;
        private Object vc_bgqksm;
        private String vc_zywxfw;
        private Object vc_csl1;
        private Object vc_czcs1;
        private Object vc_csl2;
        private Object vc_czcs2;
        private Object vc_csl3;
        private Object vc_czcs3;
        private Object vc_csl4;
        private Object vc_czcs4;
        private Object vc_csl5;
        private Object vc_czcs5;
        private Object vc_csl6;
        private Object vc_czcs6;
        private Object vc_csl7;
        private Object vc_czcs7;
        private Object vc_csl8;
        private Object vc_czcs8;
        private String vc_qtwxfw;
        private Object vc_csl;
        private Object vc_czcs;
        private Object ch_czqksfsb;
        private Object vc_wsbdynx;
        private Object ch_sfsybs;
        private Object ch_qtwxfwtzsfzqgf;
        private Object ch_sffhccgf;
        private Object ch_lscfsfcgyn;
        private Object ch_sfjyyjdc;
        private Object ch_sfzxldzd;
        private Object ch_yscsfyzz;
        private Object vc_ysl;
        private Object vc_pc;
        private Object ch_jsdwsfyzz;
        private Object vc_sjczfs;
        private Object vc_qtybgf;
        private Object ch_sfgfcc;
        private Object ch_zhlycssffhhpyq;
        private Object vc_cqfs;
        private Object vc_fqcshj;
        private Object ch_sfptfqzlss;
        private Object vc_wptjsssmc;
        private Object ch_sfcb;
        private Object vc_cbyzjczw;
        private Object vc_jcdw;
        private Object dt_jcsj;
        private Object ch_zxjczzsfaz;
        private Object dt_azsj;
        private Object ch_sflw;
        private Object ch_sfyxzc;
        private Object ch_sfjgxy;
        private Object dt_xysj;
        private Object vc_zxjcsjxsw;
        private Object ch_sfcqjz;
        private Object vc_wptjsdssw;
        private Object vc_wsfhjl;
        private Object ch_sfcqjz2;
        private Object dt_jcsj2;
        private Object vc_wsfhjl2;
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

        public String getT_qian_control_id() {
            return t_qian_control_id;
        }

        public void setT_qian_control_id(String t_qian_control_id) {
            this.t_qian_control_id = t_qian_control_id;
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

        public Object getVc_law_number() {
            return vc_law_number;
        }

        public void setVc_law_number(Object vc_law_number) {
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

        public String getVc_sinspected_unit_id() {
            return vc_sinspected_unit_id;
        }

        public void setVc_sinspected_unit_id(String vc_sinspected_unit_id) {
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

        public Object getVc_szxzc() {
            return vc_szxzc;
        }

        public void setVc_szxzc(Object vc_szxzc) {
            this.vc_szxzc = vc_szxzc;
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

        public Object getCh_jcxczt() {
            return ch_jcxczt;
        }

        public void setCh_jcxczt(Object ch_jcxczt) {
            this.ch_jcxczt = ch_jcxczt;
        }

        public Object getVc_qycp() {
            return vc_qycp;
        }

        public void setVc_qycp(Object vc_qycp) {
            this.vc_qycp = vc_qycp;
        }

        public String getVc_cqcl() {
            return vc_cqcl;
        }

        public void setVc_cqcl(String vc_cqcl) {
            this.vc_cqcl = vc_cqcl;
        }

        public Object getVc_dqcl() {
            return vc_dqcl;
        }

        public void setVc_dqcl(Object vc_dqcl) {
            this.vc_dqcl = vc_dqcl;
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

        public Object getVc_sczyyfl() {
            return vc_sczyyfl;
        }

        public void setVc_sczyyfl(Object vc_sczyyfl) {
            this.vc_sczyyfl = vc_sczyyfl;
        }

        public Object getVc_sczyyfl2() {
            return vc_sczyyfl2;
        }

        public void setVc_sczyyfl2(Object vc_sczyyfl2) {
            this.vc_sczyyfl2 = vc_sczyyfl2;
        }

        public Object getVc_qtscgy() {
            return vc_qtscgy;
        }

        public void setVc_qtscgy(Object vc_qtscgy) {
            this.vc_qtscgy = vc_qtscgy;
        }

        public Object getVc_cqjlscgy() {
            return vc_cqjlscgy;
        }

        public void setVc_cqjlscgy(Object vc_cqjlscgy) {
            this.vc_cqjlscgy = vc_cqjlscgy;
        }

        public Object getVc_qtscgy2() {
            return vc_qtscgy2;
        }

        public void setVc_qtscgy2(Object vc_qtscgy2) {
            this.vc_qtscgy2 = vc_qtscgy2;
        }

        public Object getVc_lsscgy() {
            return vc_lsscgy;
        }

        public void setVc_lsscgy(Object vc_lsscgy) {
            this.vc_lsscgy = vc_lsscgy;
        }

        public Object getVc_zysczzjsb() {
            return vc_zysczzjsb;
        }

        public void setVc_zysczzjsb(Object vc_zysczzjsb) {
            this.vc_zysczzjsb = vc_zysczzjsb;
        }

        public Object getCh_sfygyyqjs() {
            return ch_sfygyyqjs;
        }

        public void setCh_sfygyyqjs(Object ch_sfygyyqjs) {
            this.ch_sfygyyqjs = ch_sfygyyqjs;
        }

        public Object getVc_bfdy() {
            return vc_bfdy;
        }

        public void setVc_bfdy(Object vc_bfdy) {
            this.vc_bfdy = vc_bfdy;
        }

        public Object getCh_wrfzsffhyq() {
            return ch_wrfzsffhyq;
        }

        public void setCh_wrfzsffhyq(Object ch_wrfzsffhyq) {
            this.ch_wrfzsffhyq = ch_wrfzsffhyq;
        }

        public Object getVc_wddxms() {
            return vc_wddxms;
        }

        public void setVc_wddxms(Object vc_wddxms) {
            this.vc_wddxms = vc_wddxms;
        }

        public Object getVc_hpbzdw() {
            return vc_hpbzdw;
        }

        public void setVc_hpbzdw(Object vc_hpbzdw) {
            this.vc_hpbzdw = vc_hpbzdw;
        }

        public Object getDt_hpbzsj() {
            return dt_hpbzsj;
        }

        public void setDt_hpbzsj(Object dt_hpbzsj) {
            this.dt_hpbzsj = dt_hpbzsj;
        }

        public Object getVc_hpspdw() {
            return vc_hpspdw;
        }

        public void setVc_hpspdw(Object vc_hpspdw) {
            this.vc_hpspdw = vc_hpspdw;
        }

        public Object getDt_hpspsj() {
            return dt_hpspsj;
        }

        public void setDt_hpspsj(Object dt_hpspsj) {
            this.dt_hpspsj = dt_hpspsj;
        }

        public Object getVc_hpspwh() {
            return vc_hpspwh;
        }

        public void setVc_hpspwh(Object vc_hpspwh) {
            this.vc_hpspwh = vc_hpspwh;
        }

        public Object getVc_sscpfdw() {
            return vc_sscpfdw;
        }

        public void setVc_sscpfdw(Object vc_sscpfdw) {
            this.vc_sscpfdw = vc_sscpfdw;
        }

        public Object getDt_sscpfsj() {
            return dt_sscpfsj;
        }

        public void setDt_sscpfsj(Object dt_sscpfsj) {
            this.dt_sscpfsj = dt_sscpfsj;
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

        public Object getDt_hbjgyssj() {
            return dt_hbjgyssj;
        }

        public void setDt_hbjgyssj(Object dt_hbjgyssj) {
            this.dt_hbjgyssj = dt_hbjgyssj;
        }

        public Object getVc_hbjgyswh() {
            return vc_hbjgyswh;
        }

        public void setVc_hbjgyswh(Object vc_hbjgyswh) {
            this.vc_hbjgyswh = vc_hbjgyswh;
        }

        public Object getCh_sfqzbagdpw() {
            return ch_sfqzbagdpw;
        }

        public void setCh_sfqzbagdpw(Object ch_sfqzbagdpw) {
            this.ch_sfqzbagdpw = ch_sfqzbagdpw;
        }

        public Object getCh_sfjxpwdj() {
            return ch_sfjxpwdj;
        }

        public void setCh_sfjxpwdj(Object ch_sfjxpwdj) {
            this.ch_sfjxpwdj = ch_sfjxpwdj;
        }

        public Object getCh_sfzejnwf() {
            return ch_sfzejnwf;
        }

        public void setCh_sfzejnwf(Object ch_sfzejnwf) {
            this.ch_sfzejnwf = ch_sfzejnwf;
        }

        public Object getVc_synjnpwf() {
            return vc_synjnpwf;
        }

        public void setVc_synjnpwf(Object vc_synjnpwf) {
            this.vc_synjnpwf = vc_synjnpwf;
        }

        public Object getVc_yjnpwf() {
            return vc_yjnpwf;
        }

        public void setVc_yjnpwf(Object vc_yjnpwf) {
            this.vc_yjnpwf = vc_yjnpwf;
        }

        public Object getVc_wjnyy() {
            return vc_wjnyy;
        }

        public void setVc_wjnyy(Object vc_wjnyy) {
            this.vc_wjnyy = vc_wjnyy;
        }

        public Object getVc_wsjsxfs() {
            return vc_wsjsxfs;
        }

        public void setVc_wsjsxfs(Object vc_wsjsxfs) {
            this.vc_wsjsxfs = vc_wsjsxfs;
        }

        public Object getVc_tzwrw() {
            return vc_tzwrw;
        }

        public void setVc_tzwrw(Object vc_tzwrw) {
            this.vc_tzwrw = vc_tzwrw;
        }

        public Object getVc_sjcsl() {
            return vc_sjcsl;
        }

        public void setVc_sjcsl(Object vc_sjcsl) {
            this.vc_sjcsl = vc_sjcsl;
        }

        public Object getCh_sfptjswsclz() {
            return ch_sfptjswsclz;
        }

        public void setCh_sfptjswsclz(Object ch_sfptjswsclz) {
            this.ch_sfptjswsclz = ch_sfptjswsclz;
        }

        public Object getVc_wscll() {
            return vc_wscll;
        }

        public void setVc_wscll(Object vc_wscll) {
            this.vc_wscll = vc_wscll;
        }

        public Object getCh_fssfwp() {
            return ch_fssfwp;
        }

        public void setCh_fssfwp(Object ch_fssfwp) {
            this.ch_fssfwp = ch_fssfwp;
        }

        public Object getCh_fsclsfybg() {
            return ch_fsclsfybg;
        }

        public void setCh_fsclsfybg(Object ch_fsclsfybg) {
            this.ch_fsclsfybg = ch_fsclsfybg;
        }

        public Object getVc_wscll2() {
            return vc_wscll2;
        }

        public void setVc_wscll2(Object vc_wscll2) {
            this.vc_wscll2 = vc_wscll2;
        }

        public Object getCh_fsflfs() {
            return ch_fsflfs;
        }

        public void setCh_fsflfs(Object ch_fsflfs) {
            this.ch_fsflfs = ch_fsflfs;
        }

        public Object getCh_fstpfs() {
            return ch_fstpfs;
        }

        public void setCh_fstpfs(Object ch_fstpfs) {
            this.ch_fstpfs = ch_fstpfs;
        }

        public Object getVc_bgqksm() {
            return vc_bgqksm;
        }

        public void setVc_bgqksm(Object vc_bgqksm) {
            this.vc_bgqksm = vc_bgqksm;
        }

        public String getVc_zywxfw() {
            return vc_zywxfw;
        }

        public void setVc_zywxfw(String vc_zywxfw) {
            this.vc_zywxfw = vc_zywxfw;
        }

        public Object getVc_csl1() {
            return vc_csl1;
        }

        public void setVc_csl1(Object vc_csl1) {
            this.vc_csl1 = vc_csl1;
        }

        public Object getVc_czcs1() {
            return vc_czcs1;
        }

        public void setVc_czcs1(Object vc_czcs1) {
            this.vc_czcs1 = vc_czcs1;
        }

        public Object getVc_csl2() {
            return vc_csl2;
        }

        public void setVc_csl2(Object vc_csl2) {
            this.vc_csl2 = vc_csl2;
        }

        public Object getVc_czcs2() {
            return vc_czcs2;
        }

        public void setVc_czcs2(Object vc_czcs2) {
            this.vc_czcs2 = vc_czcs2;
        }

        public Object getVc_csl3() {
            return vc_csl3;
        }

        public void setVc_csl3(Object vc_csl3) {
            this.vc_csl3 = vc_csl3;
        }

        public Object getVc_czcs3() {
            return vc_czcs3;
        }

        public void setVc_czcs3(Object vc_czcs3) {
            this.vc_czcs3 = vc_czcs3;
        }

        public Object getVc_csl4() {
            return vc_csl4;
        }

        public void setVc_csl4(Object vc_csl4) {
            this.vc_csl4 = vc_csl4;
        }

        public Object getVc_czcs4() {
            return vc_czcs4;
        }

        public void setVc_czcs4(Object vc_czcs4) {
            this.vc_czcs4 = vc_czcs4;
        }

        public Object getVc_csl5() {
            return vc_csl5;
        }

        public void setVc_csl5(Object vc_csl5) {
            this.vc_csl5 = vc_csl5;
        }

        public Object getVc_czcs5() {
            return vc_czcs5;
        }

        public void setVc_czcs5(Object vc_czcs5) {
            this.vc_czcs5 = vc_czcs5;
        }

        public Object getVc_csl6() {
            return vc_csl6;
        }

        public void setVc_csl6(Object vc_csl6) {
            this.vc_csl6 = vc_csl6;
        }

        public Object getVc_czcs6() {
            return vc_czcs6;
        }

        public void setVc_czcs6(Object vc_czcs6) {
            this.vc_czcs6 = vc_czcs6;
        }

        public Object getVc_csl7() {
            return vc_csl7;
        }

        public void setVc_csl7(Object vc_csl7) {
            this.vc_csl7 = vc_csl7;
        }

        public Object getVc_czcs7() {
            return vc_czcs7;
        }

        public void setVc_czcs7(Object vc_czcs7) {
            this.vc_czcs7 = vc_czcs7;
        }

        public Object getVc_csl8() {
            return vc_csl8;
        }

        public void setVc_csl8(Object vc_csl8) {
            this.vc_csl8 = vc_csl8;
        }

        public Object getVc_czcs8() {
            return vc_czcs8;
        }

        public void setVc_czcs8(Object vc_czcs8) {
            this.vc_czcs8 = vc_czcs8;
        }

        public String getVc_qtwxfw() {
            return vc_qtwxfw;
        }

        public void setVc_qtwxfw(String vc_qtwxfw) {
            this.vc_qtwxfw = vc_qtwxfw;
        }

        public Object getVc_csl() {
            return vc_csl;
        }

        public void setVc_csl(Object vc_csl) {
            this.vc_csl = vc_csl;
        }

        public Object getVc_czcs() {
            return vc_czcs;
        }

        public void setVc_czcs(Object vc_czcs) {
            this.vc_czcs = vc_czcs;
        }

        public Object getCh_czqksfsb() {
            return ch_czqksfsb;
        }

        public void setCh_czqksfsb(Object ch_czqksfsb) {
            this.ch_czqksfsb = ch_czqksfsb;
        }

        public Object getVc_wsbdynx() {
            return vc_wsbdynx;
        }

        public void setVc_wsbdynx(Object vc_wsbdynx) {
            this.vc_wsbdynx = vc_wsbdynx;
        }

        public Object getCh_sfsybs() {
            return ch_sfsybs;
        }

        public void setCh_sfsybs(Object ch_sfsybs) {
            this.ch_sfsybs = ch_sfsybs;
        }

        public Object getCh_qtwxfwtzsfzqgf() {
            return ch_qtwxfwtzsfzqgf;
        }

        public void setCh_qtwxfwtzsfzqgf(Object ch_qtwxfwtzsfzqgf) {
            this.ch_qtwxfwtzsfzqgf = ch_qtwxfwtzsfzqgf;
        }

        public Object getCh_sffhccgf() {
            return ch_sffhccgf;
        }

        public void setCh_sffhccgf(Object ch_sffhccgf) {
            this.ch_sffhccgf = ch_sffhccgf;
        }

        public Object getCh_lscfsfcgyn() {
            return ch_lscfsfcgyn;
        }

        public void setCh_lscfsfcgyn(Object ch_lscfsfcgyn) {
            this.ch_lscfsfcgyn = ch_lscfsfcgyn;
        }

        public Object getCh_sfjyyjdc() {
            return ch_sfjyyjdc;
        }

        public void setCh_sfjyyjdc(Object ch_sfjyyjdc) {
            this.ch_sfjyyjdc = ch_sfjyyjdc;
        }

        public Object getCh_sfzxldzd() {
            return ch_sfzxldzd;
        }

        public void setCh_sfzxldzd(Object ch_sfzxldzd) {
            this.ch_sfzxldzd = ch_sfzxldzd;
        }

        public Object getCh_yscsfyzz() {
            return ch_yscsfyzz;
        }

        public void setCh_yscsfyzz(Object ch_yscsfyzz) {
            this.ch_yscsfyzz = ch_yscsfyzz;
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

        public Object getCh_jsdwsfyzz() {
            return ch_jsdwsfyzz;
        }

        public void setCh_jsdwsfyzz(Object ch_jsdwsfyzz) {
            this.ch_jsdwsfyzz = ch_jsdwsfyzz;
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

        public Object getCh_sfgfcc() {
            return ch_sfgfcc;
        }

        public void setCh_sfgfcc(Object ch_sfgfcc) {
            this.ch_sfgfcc = ch_sfgfcc;
        }

        public Object getCh_zhlycssffhhpyq() {
            return ch_zhlycssffhhpyq;
        }

        public void setCh_zhlycssffhhpyq(Object ch_zhlycssffhhpyq) {
            this.ch_zhlycssffhhpyq = ch_zhlycssffhhpyq;
        }

        public Object getVc_cqfs() {
            return vc_cqfs;
        }

        public void setVc_cqfs(Object vc_cqfs) {
            this.vc_cqfs = vc_cqfs;
        }

        public Object getVc_fqcshj() {
            return vc_fqcshj;
        }

        public void setVc_fqcshj(Object vc_fqcshj) {
            this.vc_fqcshj = vc_fqcshj;
        }

        public Object getCh_sfptfqzlss() {
            return ch_sfptfqzlss;
        }

        public void setCh_sfptfqzlss(Object ch_sfptfqzlss) {
            this.ch_sfptfqzlss = ch_sfptfqzlss;
        }

        public Object getVc_wptjsssmc() {
            return vc_wptjsssmc;
        }

        public void setVc_wptjsssmc(Object vc_wptjsssmc) {
            this.vc_wptjsssmc = vc_wptjsssmc;
        }

        public Object getCh_sfcb() {
            return ch_sfcb;
        }

        public void setCh_sfcb(Object ch_sfcb) {
            this.ch_sfcb = ch_sfcb;
        }

        public Object getVc_cbyzjczw() {
            return vc_cbyzjczw;
        }

        public void setVc_cbyzjczw(Object vc_cbyzjczw) {
            this.vc_cbyzjczw = vc_cbyzjczw;
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

        public Object getCh_zxjczzsfaz() {
            return ch_zxjczzsfaz;
        }

        public void setCh_zxjczzsfaz(Object ch_zxjczzsfaz) {
            this.ch_zxjczzsfaz = ch_zxjczzsfaz;
        }

        public Object getDt_azsj() {
            return dt_azsj;
        }

        public void setDt_azsj(Object dt_azsj) {
            this.dt_azsj = dt_azsj;
        }

        public Object getCh_sflw() {
            return ch_sflw;
        }

        public void setCh_sflw(Object ch_sflw) {
            this.ch_sflw = ch_sflw;
        }

        public Object getCh_sfyxzc() {
            return ch_sfyxzc;
        }

        public void setCh_sfyxzc(Object ch_sfyxzc) {
            this.ch_sfyxzc = ch_sfyxzc;
        }

        public Object getCh_sfjgxy() {
            return ch_sfjgxy;
        }

        public void setCh_sfjgxy(Object ch_sfjgxy) {
            this.ch_sfjgxy = ch_sfjgxy;
        }

        public Object getDt_xysj() {
            return dt_xysj;
        }

        public void setDt_xysj(Object dt_xysj) {
            this.dt_xysj = dt_xysj;
        }

        public Object getVc_zxjcsjxsw() {
            return vc_zxjcsjxsw;
        }

        public void setVc_zxjcsjxsw(Object vc_zxjcsjxsw) {
            this.vc_zxjcsjxsw = vc_zxjcsjxsw;
        }

        public Object getCh_sfcqjz() {
            return ch_sfcqjz;
        }

        public void setCh_sfcqjz(Object ch_sfcqjz) {
            this.ch_sfcqjz = ch_sfcqjz;
        }

        public Object getVc_wptjsdssw() {
            return vc_wptjsdssw;
        }

        public void setVc_wptjsdssw(Object vc_wptjsdssw) {
            this.vc_wptjsdssw = vc_wptjsdssw;
        }

        public Object getVc_wsfhjl() {
            return vc_wsfhjl;
        }

        public void setVc_wsfhjl(Object vc_wsfhjl) {
            this.vc_wsfhjl = vc_wsfhjl;
        }

        public Object getCh_sfcqjz2() {
            return ch_sfcqjz2;
        }

        public void setCh_sfcqjz2(Object ch_sfcqjz2) {
            this.ch_sfcqjz2 = ch_sfcqjz2;
        }

        public Object getDt_jcsj2() {
            return dt_jcsj2;
        }

        public void setDt_jcsj2(Object dt_jcsj2) {
            this.dt_jcsj2 = dt_jcsj2;
        }

        public Object getVc_wsfhjl2() {
            return vc_wsfhjl2;
        }

        public void setVc_wsfhjl2(Object vc_wsfhjl2) {
            this.vc_wsfhjl2 = vc_wsfhjl2;
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
             * minutes : 15
             * month : 9
             * nanos : 0
             * seconds : 44
             * time : 1509005744000
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
             * minutes : 15
             * month : 9
             * nanos : 0
             * seconds : 44
             * time : 1509005744000
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
