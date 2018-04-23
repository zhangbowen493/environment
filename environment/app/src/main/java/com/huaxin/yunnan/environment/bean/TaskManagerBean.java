package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by zbw on 2017/10/24 09:45.
 */

public class TaskManagerBean {


	/**
	 * data : {"pageInfo":{"pageNum":1,"pageSize":20,"totalRowNum":3},"queryData":[{"t_task_list_id":"402880ce5f700552015f704558ae049a","dt_task_start_time":"2017-10-03","dt_task_end_time":"2017-10-26","vc_company_name":"云南庆林科技有限公司大理灯龙河污水处理厂","vc_task_name":"新增名称2","rownum_":1},{"t_task_list_id":"402880ce5f8f2fb5015f904e0b242231","dt_task_start_time":"2017-11-06","dt_task_end_time":"2017-11-11","vc_company_name":"云南庆林科技有限公司大理灯龙河污水处理厂","vc_task_name":"测试V001","rownum_":2},{"t_task_list_id":"8a2e48d05fc0bc86015fc0d6e7c60792","dt_task_start_time":"2017-11-09","dt_task_end_time":"2017-11-15","vc_company_name":"勐海热水塘金矿有限公司","vc_task_name":"11","rownum_":3}]}
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
		@Override
		public String toString() {
			return "DataBean{" +
					"pageInfo=" + pageInfo +
					", queryData=" + queryData +
					'}';
		}

		/**
		 * pageInfo : {"pageNum":1,"pageSize":20,"totalRowNum":3}
		 * queryData : [{"t_task_list_id":"402880ce5f700552015f704558ae049a","dt_task_start_time":"2017-10-03","dt_task_end_time":"2017-10-26","vc_company_name":"云南庆林科技有限公司大理灯龙河污水处理厂","vc_task_name":"新增名称2","rownum_":1},{"t_task_list_id":"402880ce5f8f2fb5015f904e0b242231","dt_task_start_time":"2017-11-06","dt_task_end_time":"2017-11-11","vc_company_name":"云南庆林科技有限公司大理灯龙河污水处理厂","vc_task_name":"测试V001","rownum_":2},{"t_task_list_id":"8a2e48d05fc0bc86015fc0d6e7c60792","dt_task_start_time":"2017-11-09","dt_task_end_time":"2017-11-15","vc_company_name":"勐海热水塘金矿有限公司","vc_task_name":"11","rownum_":3}]
		 */

		private PageInfoBean pageInfo;
		private List<QueryDataBean> queryData;

		public PageInfoBean getPageInfo() {
			return pageInfo;
		}

		public void setPageInfo(PageInfoBean pageInfo) {
			this.pageInfo = pageInfo;
		}

		public List<QueryDataBean> getQueryData() {
			return queryData;
		}

		public void setQueryData(List<QueryDataBean> queryData) {
			this.queryData = queryData;
		}

		public static class PageInfoBean {
			@Override
			public String toString() {
				return "PageInfoBean{" +
						"pageNum=" + pageNum +
						", pageSize=" + pageSize +
						", totalRowNum=" + totalRowNum +
						'}';
			}

			/**
			 * pageNum : 1
			 * pageSize : 20
			 * totalRowNum : 3
			 */

			private int pageNum;
			private int pageSize;
			private int totalRowNum;

			public int getPageNum() {
				return pageNum;
			}

			public void setPageNum(int pageNum) {
				this.pageNum = pageNum;
			}

			public int getPageSize() {
				return pageSize;
			}

			public void setPageSize(int pageSize) {
				this.pageSize = pageSize;
			}

			public int getTotalRowNum() {
				return totalRowNum;
			}

			public void setTotalRowNum(int totalRowNum) {
				this.totalRowNum = totalRowNum;
			}
		}

		public static class QueryDataBean {
			@Override
			public String toString() {
				return "QueryDataBean{" +
						"t_task_list_id='" + t_task_list_id + '\'' +
						", dt_task_start_time='" + dt_task_start_time + '\'' +
						", dt_task_end_time='" + dt_task_end_time + '\'' +
						", vc_company_name='" + vc_company_name + '\'' +
						", vc_task_name='" + vc_task_name + '\'' +
						", rownum_=" + rownum_ +
						'}';
			}

			/**
			 * t_task_list_id : 402880ce5f700552015f704558ae049a
			 * dt_task_start_time : 2017-10-03
			 * dt_task_end_time : 2017-10-26
			 * vc_company_name : 云南庆林科技有限公司大理灯龙河污水处理厂
			 * vc_task_name : 新增名称2
			 * rownum_ : 1
			 */

			private String t_task_list_id;
			private String dt_task_start_time;
			private String dt_task_end_time;
			private String vc_company_name;
			private String vc_task_name;
			private int rownum_;

			public String getT_task_list_id() {
				return t_task_list_id;
			}

			public void setT_task_list_id(String t_task_list_id) {
				this.t_task_list_id = t_task_list_id;
			}

			public String getDt_task_start_time() {
				return dt_task_start_time;
			}

			public void setDt_task_start_time(String dt_task_start_time) {
				this.dt_task_start_time = dt_task_start_time;
			}

			public String getDt_task_end_time() {
				return dt_task_end_time;
			}

			public void setDt_task_end_time(String dt_task_end_time) {
				this.dt_task_end_time = dt_task_end_time;
			}

			public String getVc_company_name() {
				return vc_company_name;
			}

			public void setVc_company_name(String vc_company_name) {
				this.vc_company_name = vc_company_name;
			}

			public String getVc_task_name() {
				return vc_task_name;
			}

			public void setVc_task_name(String vc_task_name) {
				this.vc_task_name = vc_task_name;
			}

			public int getRownum_() {
				return rownum_;
			}

			public void setRownum_(int rownum_) {
				this.rownum_ = rownum_;
			}
		}
	}

	@Override
	public String toString() {
		return "TaskManagerBean{" +
				"data=" + data +
				", msg='" + msg + '\'' +
				", success='" + success + '\'' +
				'}';
	}
}
