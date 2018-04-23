package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by zbw on 2017/10/24 17:25.
 */

public class LawTemplateBean {

	/**
	 * data : [{"t_cqyzxcjc_record_id":"402880ce5f4ce4f6015f4dabbd9904be","dt_start_time":{"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117},"dt_end_time":{"date":28,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509120000000,"timezoneOffset":-480,"year":117},"vc_bjcdwmc":"但是非官方的都是","rownum_":1},{"t_cqyzxcjc_record_id":"4028b8815f4cf914015f4da0c4b2051e","dt_start_time":{"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117},"dt_end_time":{"date":28,"day":6,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509120000000,"timezoneOffset":-480,"year":117},"vc_bjcdwmc":"德国法国和","rownum_":2}]
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
		 * vc_bjcdwmc : 但是非官方的都是
		 * rownum_ : 1
		 */

		private String t_detail_id;
		private String dt_start_time;
		private String dt_end_time;
		private String vc_bjcdwmc;
		private int rownum_;

		public String getT_detail_id() {
			return t_detail_id;
		}

		public void setT_detail_id(String t_detail_id) {
			this.t_detail_id = t_detail_id;
		}

		public String getDt_start_time() {
			return dt_start_time;
		}

		public void setDt_start_time(String dt_start_time) {
			this.dt_start_time = dt_start_time;
		}

		public String getDt_end_time() {
			return dt_end_time;
		}

		public void setDt_end_time(String dt_end_time) {
			this.dt_end_time = dt_end_time;
		}

		public String getVc_bjcdwmc() {
			return vc_bjcdwmc;
		}

		public void setVc_bjcdwmc(String vc_bjcdwmc) {
			this.vc_bjcdwmc = vc_bjcdwmc;
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
	}

	@Override
	public String toString() {
		return "LawTemplateBean{" +
				"msg='" + msg + '\'' +
				", success='" + success + '\'' +
				", data=" + data +
				'}';
	}
}
