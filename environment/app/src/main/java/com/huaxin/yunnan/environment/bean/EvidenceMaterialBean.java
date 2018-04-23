package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * 14、取证材料页面bean
 * Created by zbw on 2017/10/26 14:46.
 */

public class EvidenceMaterialBean {
	@Override
	public String toString() {
		return "EvidenceMaterialBean{" +
				"msg='" + msg + '\'' +
				", success='" + success + '\'' +
				", data=" + data +
				'}';
	}

	/**
	 * data : [{"t_forensic_materials_id":"402880ce5f5795cd015f57c3010802e3","vc_picture_id":null,"vc_material_name":"啊是单线程","vc_photographer":"admin_1,超级管理员","dt_shooting_time":{"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117},"vc_shooting_location":"啊是单线程","vc_proof_object":"大理怡祥纸业有限公司","vc_law_enforcement_officials":"测试3记录人","vc_law_enforcement_officials_i":null,"vc_law_enforcement_certificate":null,"vc_remarks":null,"dt_create_time":{"date":26,"day":4,"hours":16,"minutes":17,"month":9,"nanos":0,"seconds":54,"time":1509005874000,"timezoneOffset":-480,"year":117},"vc_create_user":"admin","vc_create_mechanism":"402848bd4830fed70148312e0efb0631","dt_update_time":{"date":26,"day":4,"hours":16,"minutes":17,"month":9,"nanos":0,"seconds":54,"time":1509005874000,"timezoneOffset":-480,"year":117},"vc_update_user":"admin","vc_uodate_mechanism":"402848bd4830fed70148312e0efb0631","vc_status":null,"instanceid":null,"del_status":"0","t_task_list_id":"402880ce5f4bfed5015f4c23b0f70136","rownum_":1}]
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
					"t_forensic_materials_id='" + t_forensic_materials_id + '\'' +
					", vc_picture_id=" + vc_picture_id +
					", vc_material_name='" + vc_material_name + '\'' +
					", vc_photographer='" + vc_photographer + '\'' +
					", dt_shooting_time=" + dt_shooting_time +
					", vc_shooting_location='" + vc_shooting_location + '\'' +
					", vc_proof_object='" + vc_proof_object + '\'' +
					", vc_law_enforcement_officials='" + vc_law_enforcement_officials + '\'' +
					", vc_law_enforcement_officials_i=" + vc_law_enforcement_officials_i +
					", vc_law_enforcement_certificate=" + vc_law_enforcement_certificate +
					", vc_remarks=" + vc_remarks +
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
		 * t_forensic_materials_id : 402880ce5f5795cd015f57c3010802e3
		 * vc_picture_id : null
		 * vc_material_name : 啊是单线程
		 * vc_photographer : admin_1,超级管理员
		 * dt_shooting_time : {"date":27,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1509033600000,"timezoneOffset":-480,"year":117}
		 * vc_shooting_location : 啊是单线程
		 * vc_proof_object : 大理怡祥纸业有限公司
		 * vc_law_enforcement_officials : 测试3记录人
		 * vc_law_enforcement_officials_i : null
		 * vc_law_enforcement_certificate : null
		 * vc_remarks : null
		 * dt_create_time : {"date":26,"day":4,"hours":16,"minutes":17,"month":9,"nanos":0,"seconds":54,"time":1509005874000,"timezoneOffset":-480,"year":117}
		 * vc_create_user : admin
		 * vc_create_mechanism : 402848bd4830fed70148312e0efb0631
		 * dt_update_time : {"date":26,"day":4,"hours":16,"minutes":17,"month":9,"nanos":0,"seconds":54,"time":1509005874000,"timezoneOffset":-480,"year":117}
		 * vc_update_user : admin
		 * vc_uodate_mechanism : 402848bd4830fed70148312e0efb0631
		 * vc_status : null
		 * instanceid : null
		 * del_status : 0
		 * t_task_list_id : 402880ce5f4bfed5015f4c23b0f70136
		 * rownum_ : 1
		 */

		private String t_forensic_materials_id;
		private Object vc_picture_id;
		private String vc_material_name;
		private String vc_photographer;
		private DtShootingTimeBean dt_shooting_time;
		private String vc_shooting_location;
		private String vc_proof_object;
		private String vc_law_enforcement_officials;
		private Object vc_law_enforcement_officials_i;
		private Object vc_law_enforcement_certificate;
		private Object vc_remarks;
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

		public String getT_forensic_materials_id() {
			return t_forensic_materials_id;
		}

		public void setT_forensic_materials_id(String t_forensic_materials_id) {
			this.t_forensic_materials_id = t_forensic_materials_id;
		}

		public Object getVc_picture_id() {
			return vc_picture_id;
		}

		public void setVc_picture_id(Object vc_picture_id) {
			this.vc_picture_id = vc_picture_id;
		}

		public String getVc_material_name() {
			return vc_material_name;
		}

		public void setVc_material_name(String vc_material_name) {
			this.vc_material_name = vc_material_name;
		}

		public String getVc_photographer() {
			return vc_photographer;
		}

		public void setVc_photographer(String vc_photographer) {
			this.vc_photographer = vc_photographer;
		}

		public DtShootingTimeBean getDt_shooting_time() {
			return dt_shooting_time;
		}

		public void setDt_shooting_time(DtShootingTimeBean dt_shooting_time) {
			this.dt_shooting_time = dt_shooting_time;
		}

		public String getVc_shooting_location() {
			return vc_shooting_location;
		}

		public void setVc_shooting_location(String vc_shooting_location) {
			this.vc_shooting_location = vc_shooting_location;
		}

		public String getVc_proof_object() {
			return vc_proof_object;
		}

		public void setVc_proof_object(String vc_proof_object) {
			this.vc_proof_object = vc_proof_object;
		}

		public String getVc_law_enforcement_officials() {
			return vc_law_enforcement_officials;
		}

		public void setVc_law_enforcement_officials(String vc_law_enforcement_officials) {
			this.vc_law_enforcement_officials = vc_law_enforcement_officials;
		}

		public Object getVc_law_enforcement_officials_i() {
			return vc_law_enforcement_officials_i;
		}

		public void setVc_law_enforcement_officials_i(Object vc_law_enforcement_officials_i) {
			this.vc_law_enforcement_officials_i = vc_law_enforcement_officials_i;
		}

		public Object getVc_law_enforcement_certificate() {
			return vc_law_enforcement_certificate;
		}

		public void setVc_law_enforcement_certificate(Object vc_law_enforcement_certificate) {
			this.vc_law_enforcement_certificate = vc_law_enforcement_certificate;
		}

		public Object getVc_remarks() {
			return vc_remarks;
		}

		public void setVc_remarks(Object vc_remarks) {
			this.vc_remarks = vc_remarks;
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

		public static class DtShootingTimeBean {
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
						(year + 1900) + "." + (month + 1) + "." + date
						;
			}
		}

		public static class DtCreateTimeBean {
			/**
			 * date : 26
			 * day : 4
			 * hours : 16
			 * minutes : 17
			 * month : 9
			 * nanos : 0
			 * seconds : 54
			 * time : 1509005874000
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
						(year + 1900) + "." + (month + 1) + "." + date
						;
			}
		}

		public static class DtUpdateTimeBean {
			/**
			 * date : 26
			 * day : 4
			 * hours : 16
			 * minutes : 17
			 * month : 9
			 * nanos : 0
			 * seconds : 54
			 * time : 1509005874000
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
						(year + 1900) + "." + (month + 1) + "." + date
						;
			}
		}
	}
}
