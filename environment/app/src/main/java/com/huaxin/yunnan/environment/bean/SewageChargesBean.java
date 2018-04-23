package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/10/27.
 */

public class SewageChargesBean {

    /**
     * data : [{"t_pwfzsjcxc_record_id":"402880ce5f5795cd015f57cf54fd04c7","dt_start_time":{"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117},"dt_end_time":{"date":28,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509120000000,"timezoneOffset":-480,"year":117},"vc_location":"顺丰大概不","vc_jcsy":"啊撒地方v","vc_bjcdw":"是德国法国风格化","vc_bjcdw_id":null,"vc_fr":"阿斯顿","vc_ywfzr":"啊啊啊啊啊时代","vc_duty":null,"vc_telephone":null,"vc_jlr":"admin_1","vc_jlr_id":null,"vc_jcry":null,"vc_jcry_id":null,"vc_zfzh":null,"vc_sfqrzj":null,"vc_sfsqhb":null,"vc_qtcjrxmjgzdw":null,"vc_jcnr":null,"dt_create_time":{"date":26,"day":4,"hours":16,"minutes":31,"month":9,"nanos":0,"seconds":11,"time":1509006671000,"timezoneOffset":-480,"year":117},"vc_create_user":"admin","vc_create_mechanism":"402848bd4830fed70148312e0efb0631","dt_update_time":null,"vc_update_user":null,"vc_uodate_mechanism":null,"vc_status":null,"instanceid":null,"del_status":"0","t_task_list_id":"402880ce5f4bfed5015f4c23b0f70136","rownum_":1}]
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
         * t_pwfzsjcxc_record_id : 402880ce5f5795cd015f57cf54fd04c7
         * dt_start_time : {"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117}
         * dt_end_time : {"date":28,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509120000000,"timezoneOffset":-480,"year":117}
         * vc_location : 顺丰大概不
         * vc_jcsy : 啊撒地方v
         * vc_bjcdw : 是德国法国风格化
         * vc_bjcdw_id : null
         * vc_fr : 阿斯顿
         * vc_ywfzr : 啊啊啊啊啊时代
         * vc_duty : null
         * vc_telephone : null
         * vc_jlr : admin_1
         * vc_jlr_id : null
         * vc_jcry : null
         * vc_jcry_id : null
         * vc_zfzh : null
         * vc_sfqrzj : null
         * vc_sfsqhb : null
         * vc_qtcjrxmjgzdw : null
         * vc_jcnr : null
         * dt_create_time : {"date":26,"day":4,"hours":16,"minutes":31,"month":9,"nanos":0,"seconds":11,"time":1509006671000,"timezoneOffset":-480,"year":117}
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

        private String t_pwfzsjcxc_record_id;
        private DtStartTimeBean dt_start_time;
        private DtEndTimeBean dt_end_time;
        private String vc_location;
        private String vc_jcsy;
        private String vc_bjcdw;
        private Object vc_bjcdw_id;
        private String vc_fr;
        private String vc_ywfzr;
        private Object vc_duty;
        private Object vc_telephone;
        private String vc_jlr;
        private Object vc_jlr_id;
        private Object vc_jcry;
        private Object vc_jcry_id;
        private Object vc_zfzh;
        private Object vc_sfqrzj;
        private Object vc_sfsqhb;
        private Object vc_qtcjrxmjgzdw;
        private Object vc_jcnr;
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

        public String getT_pwfzsjcxc_record_id() {
            return t_pwfzsjcxc_record_id;
        }

        public void setT_pwfzsjcxc_record_id(String t_pwfzsjcxc_record_id) {
            this.t_pwfzsjcxc_record_id = t_pwfzsjcxc_record_id;
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

        public String getVc_jcsy() {
            return vc_jcsy;
        }

        public void setVc_jcsy(String vc_jcsy) {
            this.vc_jcsy = vc_jcsy;
        }

        public String getVc_bjcdw() {
            return vc_bjcdw;
        }

        public void setVc_bjcdw(String vc_bjcdw) {
            this.vc_bjcdw = vc_bjcdw;
        }

        public Object getVc_bjcdw_id() {
            return vc_bjcdw_id;
        }

        public void setVc_bjcdw_id(Object vc_bjcdw_id) {
            this.vc_bjcdw_id = vc_bjcdw_id;
        }

        public String getVc_fr() {
            return vc_fr;
        }

        public void setVc_fr(String vc_fr) {
            this.vc_fr = vc_fr;
        }

        public String getVc_ywfzr() {
            return vc_ywfzr;
        }

        public void setVc_ywfzr(String vc_ywfzr) {
            this.vc_ywfzr = vc_ywfzr;
        }

        public Object getVc_duty() {
            return vc_duty;
        }

        public void setVc_duty(Object vc_duty) {
            this.vc_duty = vc_duty;
        }

        public Object getVc_telephone() {
            return vc_telephone;
        }

        public void setVc_telephone(Object vc_telephone) {
            this.vc_telephone = vc_telephone;
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

        public Object getVc_jcry() {
            return vc_jcry;
        }

        public void setVc_jcry(Object vc_jcry) {
            this.vc_jcry = vc_jcry;
        }

        public Object getVc_jcry_id() {
            return vc_jcry_id;
        }

        public void setVc_jcry_id(Object vc_jcry_id) {
            this.vc_jcry_id = vc_jcry_id;
        }

        public Object getVc_zfzh() {
            return vc_zfzh;
        }

        public void setVc_zfzh(Object vc_zfzh) {
            this.vc_zfzh = vc_zfzh;
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

        public Object getVc_qtcjrxmjgzdw() {
            return vc_qtcjrxmjgzdw;
        }

        public void setVc_qtcjrxmjgzdw(Object vc_qtcjrxmjgzdw) {
            this.vc_qtcjrxmjgzdw = vc_qtcjrxmjgzdw;
        }

        public Object getVc_jcnr() {
            return vc_jcnr;
        }

        public void setVc_jcnr(Object vc_jcnr) {
            this.vc_jcnr = vc_jcnr;
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
             * date : 26
             * day : 4
             * hours : 16
             * minutes : 31
             * month : 9
             * nanos : 0
             * seconds : 11
             * time : 1509006671000
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
