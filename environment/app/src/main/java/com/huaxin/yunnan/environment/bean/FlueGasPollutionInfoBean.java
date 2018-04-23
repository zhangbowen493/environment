package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * 污染源废气排放口信息bean
 * Created by longzeqiu on 2017/10/28.
 */

public class FlueGasPollutionInfoBean {
	@Override
	public String toString() {
		return "FlueGasPollutionInfoBean{" +
				"data=" + data +
				", msg='" + msg + '\'' +
				", success='" + success + '\'' +
				'}';
	}

	/**
	 * data : {"pageInfo":{"pageNum":1,"pageSize":20,"totalRowNum":1},"queryData":[{"uuid":"402880495f0fa643015f0fa927bc0066","wrybh":"622898222","pfkbh":"456","pfkmc":"456","pfkwz":"456","zxbz":"456","pfklx":"0","pfgl":"0","pfkgd":456,"pqtjmj":456,"cknj":456,"rszl":"456","rsfs":"456","cjgdmc":"456","sfazzxjksb":"0","jdd":5,"jdf":4,"jdm":5,"wdd":4,"wdf":5,"wdm":4,"bz":"4564","wuuid":"402880495f04f3a1015f05815f49019c","vc_create_user":null,"dt_create_time":null,"vc_create_mechanism":null,"vc_update_user":null,"dt_update_time":null,"vc_update_mechanism":null,"vc_status":null,"vc_workflow":null,"rownum_":1}]}
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
		 * pageInfo : {"pageNum":1,"pageSize":20,"totalRowNum":1}
		 * queryData : [{"uuid":"402880495f0fa643015f0fa927bc0066","wrybh":"622898222","pfkbh":"456","pfkmc":"456","pfkwz":"456","zxbz":"456","pfklx":"0","pfgl":"0","pfkgd":456,"pqtjmj":456,"cknj":456,"rszl":"456","rsfs":"456","cjgdmc":"456","sfazzxjksb":"0","jdd":5,"jdf":4,"jdm":5,"wdd":4,"wdf":5,"wdm":4,"bz":"4564","wuuid":"402880495f04f3a1015f05815f49019c","vc_create_user":null,"dt_create_time":null,"vc_create_mechanism":null,"vc_update_user":null,"dt_update_time":null,"vc_update_mechanism":null,"vc_status":null,"vc_workflow":null,"rownum_":1}]
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
			 * totalRowNum : 1
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
						"uuid='" + uuid + '\'' +
						", wrybh='" + wrybh + '\'' +
						", pfkbh='" + pfkbh + '\'' +
						", pfkmc='" + pfkmc + '\'' +
						", pfkwz='" + pfkwz + '\'' +
						", zxbz='" + zxbz + '\'' +
						", pfklx='" + pfklx + '\'' +
						", pfgl='" + pfgl + '\'' +
						", pfkgd=" + pfkgd +
						", pqtjmj=" + pqtjmj +
						", cknj=" + cknj +
						", rszl='" + rszl + '\'' +
						", rsfs='" + rsfs + '\'' +
						", cjgdmc='" + cjgdmc + '\'' +
						", sfazzxjksb='" + sfazzxjksb + '\'' +
						", jdd=" + jdd +
						", jdf=" + jdf +
						", jdm=" + jdm +
						", wdd=" + wdd +
						", wdf=" + wdf +
						", wdm=" + wdm +
						", bz='" + bz + '\'' +
						", wuuid='" + wuuid + '\'' +
						", vc_create_user=" + vc_create_user +
						", dt_create_time=" + dt_create_time +
						", vc_create_mechanism=" + vc_create_mechanism +
						", vc_update_user=" + vc_update_user +
						", dt_update_time=" + dt_update_time +
						", vc_update_mechanism=" + vc_update_mechanism +
						", vc_status=" + vc_status +
						", vc_workflow=" + vc_workflow +
						", rownum_=" + rownum_ +
						'}';
			}

			/**
			 * uuid : 402880495f0fa643015f0fa927bc0066
			 * wrybh : 622898222
			 * pfkbh : 456
			 * pfkmc : 456
			 * pfkwz : 456
			 * zxbz : 456
			 * pfklx : 0
			 * pfgl : 0
			 * pfkgd : 456
			 * pqtjmj : 456
			 * cknj : 456
			 * rszl : 456
			 * rsfs : 456
			 * cjgdmc : 456
			 * sfazzxjksb : 0
			 * jdd : 5
			 * jdf : 4
			 * jdm : 5
			 * wdd : 4
			 * wdf : 5
			 * wdm : 4
			 * bz : 4564
			 * wuuid : 402880495f04f3a1015f05815f49019c
			 * vc_create_user : null
			 * dt_create_time : null
			 * vc_create_mechanism : null
			 * vc_update_user : null
			 * dt_update_time : null
			 * vc_update_mechanism : null
			 * vc_status : null
			 * vc_workflow : null
			 * rownum_ : 1
			 */

			private String uuid;
			private String wrybh;
			private String pfkbh;
			private String pfkmc;
			private String pfkwz;
			private String zxbz;
			private String pfklx;
			private String pfgl;
			private int pfkgd;
			private int pqtjmj;
			private int cknj;
			private String rszl;
			private String rsfs;
			private String cjgdmc;
			private String sfazzxjksb;
			private int jdd;
			private int jdf;
			private int jdm;
			private int wdd;
			private int wdf;
			private int wdm;
			private String bz;
			private String wuuid;
			private Object vc_create_user;
			private Object dt_create_time;
			private Object vc_create_mechanism;
			private Object vc_update_user;
			private Object dt_update_time;
			private Object vc_update_mechanism;
			private Object vc_status;
			private Object vc_workflow;
			private int rownum_;

			public String getUuid() {
				return uuid;
			}

			public void setUuid(String uuid) {
				this.uuid = uuid;
			}

			public String getWrybh() {
				return wrybh;
			}

			public void setWrybh(String wrybh) {
				this.wrybh = wrybh;
			}

			public String getPfkbh() {
				return pfkbh;
			}

			public void setPfkbh(String pfkbh) {
				this.pfkbh = pfkbh;
			}

			public String getPfkmc() {
				return pfkmc;
			}

			public void setPfkmc(String pfkmc) {
				this.pfkmc = pfkmc;
			}

			public String getPfkwz() {
				return pfkwz;
			}

			public void setPfkwz(String pfkwz) {
				this.pfkwz = pfkwz;
			}

			public String getZxbz() {
				return zxbz;
			}

			public void setZxbz(String zxbz) {
				this.zxbz = zxbz;
			}

			public String getPfklx() {
				return pfklx;
			}

			public void setPfklx(String pfklx) {
				this.pfklx = pfklx;
			}

			public String getPfgl() {
				return pfgl;
			}

			public void setPfgl(String pfgl) {
				this.pfgl = pfgl;
			}

			public int getPfkgd() {
				return pfkgd;
			}

			public void setPfkgd(int pfkgd) {
				this.pfkgd = pfkgd;
			}

			public int getPqtjmj() {
				return pqtjmj;
			}

			public void setPqtjmj(int pqtjmj) {
				this.pqtjmj = pqtjmj;
			}

			public int getCknj() {
				return cknj;
			}

			public void setCknj(int cknj) {
				this.cknj = cknj;
			}

			public String getRszl() {
				return rszl;
			}

			public void setRszl(String rszl) {
				this.rszl = rszl;
			}

			public String getRsfs() {
				return rsfs;
			}

			public void setRsfs(String rsfs) {
				this.rsfs = rsfs;
			}

			public String getCjgdmc() {
				return cjgdmc;
			}

			public void setCjgdmc(String cjgdmc) {
				this.cjgdmc = cjgdmc;
			}

			public String getSfazzxjksb() {
				return sfazzxjksb;
			}

			public void setSfazzxjksb(String sfazzxjksb) {
				this.sfazzxjksb = sfazzxjksb;
			}

			public int getJdd() {
				return jdd;
			}

			public void setJdd(int jdd) {
				this.jdd = jdd;
			}

			public int getJdf() {
				return jdf;
			}

			public void setJdf(int jdf) {
				this.jdf = jdf;
			}

			public int getJdm() {
				return jdm;
			}

			public void setJdm(int jdm) {
				this.jdm = jdm;
			}

			public int getWdd() {
				return wdd;
			}

			public void setWdd(int wdd) {
				this.wdd = wdd;
			}

			public int getWdf() {
				return wdf;
			}

			public void setWdf(int wdf) {
				this.wdf = wdf;
			}

			public int getWdm() {
				return wdm;
			}

			public void setWdm(int wdm) {
				this.wdm = wdm;
			}

			public String getBz() {
				return bz;
			}

			public void setBz(String bz) {
				this.bz = bz;
			}

			public String getWuuid() {
				return wuuid;
			}

			public void setWuuid(String wuuid) {
				this.wuuid = wuuid;
			}

			public Object getVc_create_user() {
				return vc_create_user;
			}

			public void setVc_create_user(Object vc_create_user) {
				this.vc_create_user = vc_create_user;
			}

			public Object getDt_create_time() {
				return dt_create_time;
			}

			public void setDt_create_time(Object dt_create_time) {
				this.dt_create_time = dt_create_time;
			}

			public Object getVc_create_mechanism() {
				return vc_create_mechanism;
			}

			public void setVc_create_mechanism(Object vc_create_mechanism) {
				this.vc_create_mechanism = vc_create_mechanism;
			}

			public Object getVc_update_user() {
				return vc_update_user;
			}

			public void setVc_update_user(Object vc_update_user) {
				this.vc_update_user = vc_update_user;
			}

			public Object getDt_update_time() {
				return dt_update_time;
			}

			public void setDt_update_time(Object dt_update_time) {
				this.dt_update_time = dt_update_time;
			}

			public Object getVc_update_mechanism() {
				return vc_update_mechanism;
			}

			public void setVc_update_mechanism(Object vc_update_mechanism) {
				this.vc_update_mechanism = vc_update_mechanism;
			}

			public Object getVc_status() {
				return vc_status;
			}

			public void setVc_status(Object vc_status) {
				this.vc_status = vc_status;
			}

			public Object getVc_workflow() {
				return vc_workflow;
			}

			public void setVc_workflow(Object vc_workflow) {
				this.vc_workflow = vc_workflow;
			}

			public int getRownum_() {
				return rownum_;
			}

			public void setRownum_(int rownum_) {
				this.rownum_ = rownum_;
			}
		}
	}
}
