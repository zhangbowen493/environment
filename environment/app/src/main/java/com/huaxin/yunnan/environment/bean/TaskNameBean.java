package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/10/24.
 */

public class TaskNameBean {

    /**
     * data : {"t_task_list_id":"4028b8815f354907015f356ecbaa0112","vc_task_name":"aaaa","vc_task_type":"5","dt_task_start_time":{"date":9,"day":1,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1507478400000,"timezoneOffset":-480,"year":117},"dt_task_end_time":{"date":23,"day":1,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1508688000000,"timezoneOffset":-480,"year":117},"vc_company_name":"大理怡祥纸业有限公司","task_jcr":[{"vc_user_id":"8ace25884b073a4f014b0a0300cf03ee","vc_user_name":"admin_1"},{"vc_user_id":"admin","vc_user_name":"超级管理员"}],"task_zfmb":[{"vc_zfmbmc":"通用现场检查记录","vc_url":"A001004013"},{"vc_zfmbmc":"合成氨行业现场监察记录","vc_url":"A001004004"},{"vc_zfmbmc":"畜禽养殖现场监察记录","vc_url":"A001004002"},{"vc_zfmbmc":"火电企业现场监察记录","vc_url":"A001004005"}]}
     * msg :
     * success : 1
     */

    private DataBean data;
    private String msg;
    private String success;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

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

    public static class DataBean {
        /**
         * t_task_list_id : 4028b8815f354907015f356ecbaa0112
         * vc_task_name : aaaa
         * vc_task_type : 5
         * dt_task_start_time : {"date":9,"day":1,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1507478400000,"timezoneOffset":-480,"year":117}
         * dt_task_end_time : {"date":23,"day":1,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1508688000000,"timezoneOffset":-480,"year":117}
         * vc_company_name : 大理怡祥纸业有限公司
         * task_jcr : [{"vc_user_id":"8ace25884b073a4f014b0a0300cf03ee","vc_user_name":"admin_1"},{"vc_user_id":"admin","vc_user_name":"超级管理员"}]
         * task_zfmb : [{"vc_zfmbmc":"通用现场检查记录","vc_url":"A001004013"},{"vc_zfmbmc":"合成氨行业现场监察记录","vc_url":"A001004004"},{"vc_zfmbmc":"畜禽养殖现场监察记录","vc_url":"A001004002"},{"vc_zfmbmc":"火电企业现场监察记录","vc_url":"A001004005"}]
         */

        private String t_task_list_id;
        private String vc_task_name;
        private String vc_task_type;
        private String task_start_time;
        private String dt_task_start_time;
        private String dt_task_end_time;

        public String getDt_task_end_time() {
            return dt_task_end_time;
        }

        public void setDt_task_end_time(String dt_task_end_time) {
            this.dt_task_end_time = dt_task_end_time;
        }

        public String getDt_task_start_time() {
            return dt_task_start_time;
        }

        public void setDt_task_start_time(String dt_task_start_time) {
            this.dt_task_start_time = dt_task_start_time;
        }

        private String task_end_time;
        private String vc_company_name;
        private String vc_noter_name;

        public String getVc_noter_name() {
            return vc_noter_name;
        }

        public void setVc_noter_name(String vc_noter_name) {
            this.vc_noter_name = vc_noter_name;
        }

        private List<TaskJcrBean> task_jcr;
        private List<TaskZfmbBean> task_zfmb;

        public String getT_task_list_id() {
            return t_task_list_id;
        }

        public void setT_task_list_id(String t_task_list_id) {
            this.t_task_list_id = t_task_list_id;
        }

        public String getVc_task_name() {
            return vc_task_name;
        }

        public void setVc_task_name(String vc_task_name) {
            this.vc_task_name = vc_task_name;
        }

        public String getVc_task_type() {
            return vc_task_type;
        }

        public void setVc_task_type(String vc_task_type) {
            this.vc_task_type = vc_task_type;
        }

        public String getTask_start_time() {
            return task_start_time;
        }

        public void setTask_start_time(String task_start_time) {
            this.task_start_time = task_start_time;
        }

        public String getTask_end_time() {
            return task_end_time;
        }

        public void setTask_end_time(String task_end_time) {
            this.task_end_time = task_end_time;
        }

        public String getVc_company_name() {
            return vc_company_name;
        }

        public void setVc_company_name(String vc_company_name) {
            this.vc_company_name = vc_company_name;
        }

        public List<TaskJcrBean> getTask_jcr() {
            return task_jcr;
        }

        public void setTask_jcr(List<TaskJcrBean> task_jcr) {
            this.task_jcr = task_jcr;
        }

        public List<TaskZfmbBean> getTask_zfmb() {
            return task_zfmb;
        }

        public void setTask_zfmb(List<TaskZfmbBean> task_zfmb) {
            this.task_zfmb = task_zfmb;
        }

        public static class DtTaskStartTimeBean {
            /**
             * date : 9
             * day : 1
             * hours : 0
             * minutes : 0
             * month : 9
             * nanos : 0
             * seconds : 0
             * time : 1507478400000
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

        public static class DtTaskEndTimeBean {
            /**
             * date : 23
             * day : 1
             * hours : 0
             * minutes : 0
             * month : 9
             * nanos : 0
             * seconds : 0
             * time : 1508688000000
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

        public static class TaskJcrBean {
            /**
             * vc_user_id : 8ace25884b073a4f014b0a0300cf03ee
             * vc_user_name : admin_1
             */

            private String vc_user_id;
            private String vc_user_name;

            public String getVc_user_id() {
                return vc_user_id;
            }

            public void setVc_user_id(String vc_user_id) {
                this.vc_user_id = vc_user_id;
            }

            public String getVc_user_name() {
                return vc_user_name;
            }

            public void setVc_user_name(String vc_user_name) {
                this.vc_user_name = vc_user_name;
            }
        }

        public static class TaskZfmbBean {
            /**
             * vc_zfmbmc : 通用现场检查记录
             * vc_url : A001004013
             */

            private String vc_zfmbmc;
            private String vc_url;

            public String getVc_zfmbmc() {
                return vc_zfmbmc;
            }

            public void setVc_zfmbmc(String vc_zfmbmc) {
                this.vc_zfmbmc = vc_zfmbmc;
            }

            public String getVc_url() {
                return vc_url;
            }

            public void setVc_url(String vc_url) {
                this.vc_url = vc_url;
            }
        }
    }
}
