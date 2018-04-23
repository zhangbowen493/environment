package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * 12、污染源调查询问笔录页面bean
 * Created by zbw on 2017/10/26 14:48.
 */
public class PollutionSurveryTakeDownBean {
	/**
	 * data : [{"t_wrydcxw_record_id":"402880ce5f9ad4be015f9ad83b530197","dt_start_time":{"date":6,"day":1,"hours":0,"minutes":0,"month":10,"nanos":0,"seconds":0,"time":1509897600000,"timezoneOffset":-480,"year":117},"dt_end_time":{"date":31,"day":2,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509379200000,"timezoneOffset":-480,"year":117},"vc_location":"速度sd","vc_xwr":"超级管理员","vc_xwr_id":null,"vc_zfzh":"3333","vc_jlr":"超级管理员","vc_jlr_id":null,"vc_zzjgdm":"34324","vc_bxwrxm":"胜负彩","vc_sfzh":"441881199505017218","nb_age":343,"vc_gzdw":"速度","vc_duty":"速度","vc_ybagx":"速度","vc_address":"速度","vc_telephone":"2323","vc_yzbm":"343243","vc_qtcjtcxwrxmjgzdw":"市场","vc_hjjclx":"2,3","vc_sfsqhb":"1","vc_sfqrzj":"1","cl_xwnr":"阿斯顿","dt_create_time":{"date":8,"day":3,"hours":16,"minutes":55,"month":10,"nanos":0,"seconds":27,"time":1510131327000,"timezoneOffset":-480,"year":117},"vc_create_user":"admin","vc_create_mechanism":"402848bd4830fed70148312e0efb0631","dt_update_time":{"date":8,"day":3,"hours":17,"minutes":15,"month":10,"nanos":0,"seconds":17,"time":1510132517000,"timezoneOffset":-480,"year":117},"vc_update_user":"admin","vc_uodate_mechanism":"402848bd4830fed70148312e0efb0631","vc_status":null,"instanceid":null,"del_status":"0","t_task_list_id":"402880ce5f8f2fb5015f904e0b242231","start_time":"2017-11-06","end_time":"2017-10-31","rownum_":1}]
	 * msg :
	 * success : 1
	 */

	private String msg;
	private String success;
	private List<DataBean> data;

	@Override
	public String toString() {
		return "PollutionSurveryTakeDownBean{" +
				"msg='" + msg + '\'' +
				", success='" + success + '\'' +
				", data=" + data +
				'}';
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

	public List<DataBean> getData() {
		return data;
	}

	public void setData(List<DataBean> data) {
		this.data = data;
	}


	public static class DataBean {
		/**
		 * t_wrydcxw_record_id : 402880ce5f9ad4be015f9ad83b530197
		 * dt_start_time : {"date":6,"day":1,"hours":0,"minutes":0,"month":10,"nanos":0,"seconds":0,"time":1509897600000,"timezoneOffset":-480,"year":117}
		 * dt_end_time : {"date":31,"day":2,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509379200000,"timezoneOffset":-480,"year":117}
		 * vc_location : 速度sd
		 * vc_xwr : 超级管理员
		 * vc_xwr_id : null
		 * vc_zfzh : 3333
		 * vc_jlr : 超级管理员
		 * vc_jlr_id : null
		 * vc_zzjgdm : 34324
		 * vc_bxwrxm : 胜负彩
		 * vc_sfzh : 441881199505017218
		 * nb_age : 343
		 * vc_gzdw : 速度
		 * vc_duty : 速度
		 * vc_ybagx : 速度
		 * vc_address : 速度
		 * vc_telephone : 2323
		 * vc_yzbm : 343243
		 * vc_qtcjtcxwrxmjgzdw : 市场
		 * vc_hjjclx : 2,3
		 * vc_sfsqhb : 1
		 * vc_sfqrzj : 1
		 * cl_xwnr : 阿斯顿
		 * dt_create_time : {"date":8,"day":3,"hours":16,"minutes":55,"month":10,"nanos":0,"seconds":27,"time":1510131327000,"timezoneOffset":-480,"year":117}
		 * vc_create_user : admin
		 * vc_create_mechanism : 402848bd4830fed70148312e0efb0631
		 * dt_update_time : {"date":8,"day":3,"hours":17,"minutes":15,"month":10,"nanos":0,"seconds":17,"time":1510132517000,"timezoneOffset":-480,"year":117}
		 * vc_update_user : admin
		 * vc_uodate_mechanism : 402848bd4830fed70148312e0efb0631
		 * vc_status : null
		 * instanceid : null
		 * del_status : 0
		 * t_task_list_id : 402880ce5f8f2fb5015f904e0b242231
		 * start_time : 2017-11-06
		 * end_time : 2017-10-31
		 * rownum_ : 1
		 */

		private String t_wrydcxw_record_id;
		private DtStartTimeBean dt_start_time;
		private DtEndTimeBean dt_end_time;
		private String vc_location;
		private String vc_xwr;
		private Object vc_xwr_id;
		private String vc_zfzh;
		private String vc_jlr;
		private Object vc_jlr_id;
		private String vc_zzjgdm;
		private String vc_bxwrxm;
		private String vc_sfzh;
		private int nb_age;
		private String vc_gzdw;
		private String vc_duty;
		private String vc_ybagx;
		private String vc_address;
		private String vc_telephone;
		private String vc_yzbm;
		private String vc_qtcjtcxwrxmjgzdw;
		private String vc_hjjclx;
		private String vc_sfsqhb;
		private String vc_sfqrzj;
		private String cl_xwnr;
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
		private String start_time;
		private String end_time;
		private int rownum_;

		public String getT_wrydcxw_record_id() {
			return t_wrydcxw_record_id;
		}

		public void setT_wrydcxw_record_id(String t_wrydcxw_record_id) {
			this.t_wrydcxw_record_id = t_wrydcxw_record_id;
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

		public String getVc_xwr() {
			return vc_xwr;
		}

		public void setVc_xwr(String vc_xwr) {
			this.vc_xwr = vc_xwr;
		}

		public Object getVc_xwr_id() {
			return vc_xwr_id;
		}

		public void setVc_xwr_id(Object vc_xwr_id) {
			this.vc_xwr_id = vc_xwr_id;
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

		public String getVc_zzjgdm() {
			return vc_zzjgdm;
		}

		public void setVc_zzjgdm(String vc_zzjgdm) {
			this.vc_zzjgdm = vc_zzjgdm;
		}

		public String getVc_bxwrxm() {
			return vc_bxwrxm;
		}

		public void setVc_bxwrxm(String vc_bxwrxm) {
			this.vc_bxwrxm = vc_bxwrxm;
		}

		public String getVc_sfzh() {
			return vc_sfzh;
		}

		public void setVc_sfzh(String vc_sfzh) {
			this.vc_sfzh = vc_sfzh;
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

		public String getVc_telephone() {
			return vc_telephone;
		}

		public void setVc_telephone(String vc_telephone) {
			this.vc_telephone = vc_telephone;
		}

		public String getVc_yzbm() {
			return vc_yzbm;
		}

		public void setVc_yzbm(String vc_yzbm) {
			this.vc_yzbm = vc_yzbm;
		}

		public String getVc_qtcjtcxwrxmjgzdw() {
			return vc_qtcjtcxwrxmjgzdw;
		}

		public void setVc_qtcjtcxwrxmjgzdw(String vc_qtcjtcxwrxmjgzdw) {
			this.vc_qtcjtcxwrxmjgzdw = vc_qtcjtcxwrxmjgzdw;
		}

		public String getVc_hjjclx() {
			return vc_hjjclx;
		}

		public void setVc_hjjclx(String vc_hjjclx) {
			this.vc_hjjclx = vc_hjjclx;
		}

		public String getVc_sfsqhb() {
			return vc_sfsqhb;
		}

		public void setVc_sfsqhb(String vc_sfsqhb) {
			this.vc_sfsqhb = vc_sfsqhb;
		}

		public String getVc_sfqrzj() {
			return vc_sfqrzj;
		}

		public void setVc_sfqrzj(String vc_sfqrzj) {
			this.vc_sfqrzj = vc_sfqrzj;
		}

		public String getCl_xwnr() {
			return cl_xwnr;
		}

		public void setCl_xwnr(String cl_xwnr) {
			this.cl_xwnr = cl_xwnr;
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

		public String getStart_time() {
			return start_time;
		}

		public void setStart_time(String start_time) {
			this.start_time = start_time;
		}

		public String getEnd_time() {
			return end_time;
		}

		public void setEnd_time(String end_time) {
			this.end_time = end_time;
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
			 * date : 6
			 * day : 1
			 * hours : 0
			 * minutes : 0
			 * month : 10
			 * nanos : 0
			 * seconds : 0
			 * time : 1509897600000
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
			 * date : 31
			 * day : 2
			 * hours : 0
			 * minutes : 0
			 * month : 9
			 * nanos : 0
			 * seconds : 0
			 * time : 1509379200000
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
			 * date : 8
			 * day : 3
			 * hours : 16
			 * minutes : 55
			 * month : 10
			 * nanos : 0
			 * seconds : 27
			 * time : 1510131327000
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
			 * date : 8
			 * day : 3
			 * hours : 17
			 * minutes : 15
			 * month : 10
			 * nanos : 0
			 * seconds : 17
			 * time : 1510132517000
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
