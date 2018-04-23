package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/10/25.
 */

public class RecordBean {

    /**
     * data : [{"t_zdxcjcjl_id":"402880ce5f4ce4f6015f4d9bcf0a03f5","dt_kssj":{"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117},"dt_jssj":{"date":28,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509120000000,"timezoneOffset":-480,"year":117},"vc_dd":"速度放缓","vc_bjcdwmc":"大理怡祥纸业有限公司","vc_zzjgdm":"622898222","vc_jcr":"admin_1,超级管理员","vc_zfzh":null,"vc_jlr":"测试3记录人","vc_fddbr":"朱建平","vc_jcr_id":null,"vc_jlr_id":null,"vc_bjcdwmc_id":null,"vc_xcfzr":null,"vc_sfzh":null,"nb_nl":null,"vc_gzdw":"的是法国vc","vc_zw":null,"vc_ybagx":null,"vc_dz":"是最低消费吧防汛","vc_dh":null,"vc_yzbm":null,"vc_qtcjrxmygzdw":null,"vc_sfqrzj":null,"vc_sfsqhb":null,"cl_qygk":null,"cl_hbsxjrw":null,"cl_wrfzssxcjcqk":null,"cl_wsfhjlqk":null,"cl_hjfxjyjglqk":null,"cl_qthbbmjcqk":null,"cl_czzywt":null,"cl_jcyq":null,"dt_create_time":{"date":24,"day":2,"hours":16,"minutes":58,"month":9,"nanos":0,"seconds":41,"time":1508835521000,"timezoneOffset":-480,"year":117},"vc_create_user":"admin","vc_create_mechanism":"402848bd4830fed70148312e0efb0631","dt_update_time":{"date":24,"day":2,"hours":16,"minutes":58,"month":9,"nanos":0,"seconds":41,"time":1508835521000,"timezoneOffset":-480,"year":117},"vc_update_user":"admin","vc_uodate_mechanism":"402848bd4830fed70148312e0efb0631","vc_status":null,"instanceid":null,"del_status":"0","t_task_list_id":"402880ce5f4bfed5015f4c23b0f70136","rownum_":1}]
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
         * t_zdxcjcjl_id : 402880ce5f4ce4f6015f4d9bcf0a03f5
         * dt_kssj : {"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117}
         * dt_jssj : {"date":28,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509120000000,"timezoneOffset":-480,"year":117}
         * vc_dd : 速度放缓
         * vc_bjcdwmc : 大理怡祥纸业有限公司
         * vc_zzjgdm : 622898222
         * vc_jcr : admin_1,超级管理员
         * vc_zfzh : null
         * vc_jlr : 测试3记录人
         * vc_fddbr : 朱建平
         * vc_jcr_id : null
         * vc_jlr_id : null
         * vc_bjcdwmc_id : null
         * vc_xcfzr : null
         * vc_sfzh : null
         * nb_nl : null
         * vc_gzdw : 的是法国vc
         * vc_zw : null
         * vc_ybagx : null
         * vc_dz : 是最低消费吧防汛
         * vc_dh : null
         * vc_yzbm : null
         * vc_qtcjrxmygzdw : null
         * vc_sfqrzj : null
         * vc_sfsqhb : null
         * cl_qygk : null
         * cl_hbsxjrw : null
         * cl_wrfzssxcjcqk : null
         * cl_wsfhjlqk : null
         * cl_hjfxjyjglqk : null
         * cl_qthbbmjcqk : null
         * cl_czzywt : null
         * cl_jcyq : null
         * dt_create_time : {"date":24,"day":2,"hours":16,"minutes":58,"month":9,"nanos":0,"seconds":41,"time":1508835521000,"timezoneOffset":-480,"year":117}
         * vc_create_user : admin
         * vc_create_mechanism : 402848bd4830fed70148312e0efb0631
         * dt_update_time : {"date":24,"day":2,"hours":16,"minutes":58,"month":9,"nanos":0,"seconds":41,"time":1508835521000,"timezoneOffset":-480,"year":117}
         * vc_update_user : admin
         * vc_uodate_mechanism : 402848bd4830fed70148312e0efb0631
         * vc_status : null
         * instanceid : null
         * del_status : 0
         * t_task_list_id : 402880ce5f4bfed5015f4c23b0f70136
         * rownum_ : 1
         */

        private String t_zdxcjcjl_id;
        private DtKssjBean dt_kssj;
        private DtJssjBean dt_jssj;
        private String vc_dd;
        private String vc_bjcdwmc;
        private String vc_zzjgdm;
        private String vc_jcr;
        private Object vc_zfzh;
        private String vc_jlr;
        private String vc_fddbr;
        private Object vc_jcr_id;
        private Object vc_jlr_id;
        private Object vc_bjcdwmc_id;
        private Object vc_xcfzr;
        private Object vc_sfzh;
        private Object nb_nl;
        private String vc_gzdw;
        private Object vc_zw;
        private Object vc_ybagx;
        private String vc_dz;
        private Object vc_dh;
        private Object vc_yzbm;
        private Object vc_qtcjrxmygzdw;
        private Object vc_sfqrzj;
        private Object vc_sfsqhb;
        private Object cl_qygk;
        private Object cl_hbsxjrw;
        private Object cl_wrfzssxcjcqk;
        private Object cl_wsfhjlqk;
        private Object cl_hjfxjyjglqk;
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



        public String getT_zdxcjcjl_id() {
            return t_zdxcjcjl_id;
        }

        public void setT_zdxcjcjl_id(String t_zdxcjcjl_id) {
            this.t_zdxcjcjl_id = t_zdxcjcjl_id;
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

        public String getVc_fddbr() {
            return vc_fddbr;
        }

        public void setVc_fddbr(String vc_fddbr) {
            this.vc_fddbr = vc_fddbr;
        }

        public Object getVc_jcr_id() {
            return vc_jcr_id;
        }

        public void setVc_jcr_id(Object vc_jcr_id) {
            this.vc_jcr_id = vc_jcr_id;
        }

        public Object getVc_jlr_id() {
            return vc_jlr_id;
        }

        public void setVc_jlr_id(Object vc_jlr_id) {
            this.vc_jlr_id = vc_jlr_id;
        }

        public Object getVc_bjcdwmc_id() {
            return vc_bjcdwmc_id;
        }

        public void setVc_bjcdwmc_id(Object vc_bjcdwmc_id) {
            this.vc_bjcdwmc_id = vc_bjcdwmc_id;
        }

        public Object getVc_xcfzr() {
            return vc_xcfzr;
        }

        public void setVc_xcfzr(Object vc_xcfzr) {
            this.vc_xcfzr = vc_xcfzr;
        }

        public Object getVc_sfzh() {
            return vc_sfzh;
        }

        public void setVc_sfzh(Object vc_sfzh) {
            this.vc_sfzh = vc_sfzh;
        }

        public Object getNb_nl() {
            return nb_nl;
        }

        public void setNb_nl(Object nb_nl) {
            this.nb_nl = nb_nl;
        }

        public String getVc_gzdw() {
            return vc_gzdw;
        }

        public void setVc_gzdw(String vc_gzdw) {
            this.vc_gzdw = vc_gzdw;
        }

        public Object getVc_zw() {
            return vc_zw;
        }

        public void setVc_zw(Object vc_zw) {
            this.vc_zw = vc_zw;
        }

        public Object getVc_ybagx() {
            return vc_ybagx;
        }

        public void setVc_ybagx(Object vc_ybagx) {
            this.vc_ybagx = vc_ybagx;
        }

        public String getVc_dz() {
            return vc_dz;
        }

        public void setVc_dz(String vc_dz) {
            this.vc_dz = vc_dz;
        }

        public Object getVc_dh() {
            return vc_dh;
        }

        public void setVc_dh(Object vc_dh) {
            this.vc_dh = vc_dh;
        }

        public Object getVc_yzbm() {
            return vc_yzbm;
        }

        public void setVc_yzbm(Object vc_yzbm) {
            this.vc_yzbm = vc_yzbm;
        }

        public Object getVc_qtcjrxmygzdw() {
            return vc_qtcjrxmygzdw;
        }

        public void setVc_qtcjrxmygzdw(Object vc_qtcjrxmygzdw) {
            this.vc_qtcjrxmygzdw = vc_qtcjrxmygzdw;
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

        public Object getCl_qygk() {
            return cl_qygk;
        }

        public void setCl_qygk(Object cl_qygk) {
            this.cl_qygk = cl_qygk;
        }

        public Object getCl_hbsxjrw() {
            return cl_hbsxjrw;
        }

        public void setCl_hbsxjrw(Object cl_hbsxjrw) {
            this.cl_hbsxjrw = cl_hbsxjrw;
        }

        public Object getCl_wrfzssxcjcqk() {
            return cl_wrfzssxcjcqk;
        }

        public void setCl_wrfzssxcjcqk(Object cl_wrfzssxcjcqk) {
            this.cl_wrfzssxcjcqk = cl_wrfzssxcjcqk;
        }

        public Object getCl_wsfhjlqk() {
            return cl_wsfhjlqk;
        }

        public void setCl_wsfhjlqk(Object cl_wsfhjlqk) {
            this.cl_wsfhjlqk = cl_wsfhjlqk;
        }

        public Object getCl_hjfxjyjglqk() {
            return cl_hjfxjyjglqk;
        }

        public void setCl_hjfxjyjglqk(Object cl_hjfxjyjglqk) {
            this.cl_hjfxjyjglqk = cl_hjfxjyjglqk;
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

        public DtKssjBean getDt_kssj() {
            return dt_kssj;
        }

        public void setDt_kssj(DtKssjBean dt_kssj) {
            this.dt_kssj = dt_kssj;
        }

        public DtJssjBean getDt_jssj() {
            return dt_jssj;
        }

        public void setDt_jssj(DtJssjBean dt_jssj) {
            this.dt_jssj = dt_jssj;
        }

        public DtCreateTimeBean getDt_create_time() {
            return dt_create_time;
        }

        public void setDt_create_time(DtCreateTimeBean dt_create_time) {
            this.dt_create_time = dt_create_time;
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

        public static class DtKssjBean {

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

        public static class DtJssjBean {
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
             * hours : 16
             * minutes : 58
             * month : 9
             * nanos : 0
             * seconds : 41
             * time : 1508835521000
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
             * date : 24
             * day : 2
             * hours : 16
             * minutes : 58
             * month : 9
             * nanos : 0
             * seconds : 41
             * time : 1508835521000
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
