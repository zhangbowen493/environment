package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * 污染源管理属性信息页面bean
 * Created by zbw on 2017/10/29 13:06.
 */

public class AttributeManagementBean {

	/**
	 * data : {"pageInfo":{"pageNum":1,"pageSize":20,"totalRowNum":1},"queryData":[{"uuid":"8a2e48d05fe1c654015fe1e554040664","wrybh":"YNHJ03","nd":"2017","sfzdy":"1","sfhjtjqy":"1","sfzxjkqy":"1","sfkzpwf":"0","sfgfjydw":"0","sfgfcsdw":"1","sffxy":"1","hbjgjb":"0","dlqyzjrl":500,"sflsdw":"1","hbcxdj":"0","sftgiso14000":"1","sftgqjscsh":"0","sffszdwry":"0","sffqzdwry":"1","sfgfzdwry":"1","sfwsclc":"0","sfsydw":"1","sfssgs":"1","sfyzgs":"0","sfjdxjc":"0","sfpwkgfh":"1","sfjljdyzd":"1","fspfbzsd":"0845","fqpfbzsd":"1730","fspfbz":"500","fqpfbz":"100","zspfbz":"50","zfpl":"0","zfsjdw":"1","sfqxgl":"0","qxyy":null,"wuuid":"71c3fd686aa444eca367a738fb700d04","vc_create_user":"admin","vc_create_mechanism":"402848bd4830fed70148312e0efb0631","vc_update_user":null,"vc_update_mechanism":null,"vc_status":null,"vc_workflow":null,"hbqylb":null,"zfkssj":"2017-11-01","zfjssj":"2017-11-30","qxsj":null,"dt_create_time":"2017-11-22","dt_update_time":null,"rownum_":1}]}
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
		 * pageInfo : {"pageNum":1,"pageSize":20,"totalRowNum":1}
		 * queryData : [{"uuid":"8a2e48d05fe1c654015fe1e554040664","wrybh":"YNHJ03","nd":"2017","sfzdy":"1","sfhjtjqy":"1","sfzxjkqy":"1","sfkzpwf":"0","sfgfjydw":"0","sfgfcsdw":"1","sffxy":"1","hbjgjb":"0","dlqyzjrl":500,"sflsdw":"1","hbcxdj":"0","sftgiso14000":"1","sftgqjscsh":"0","sffszdwry":"0","sffqzdwry":"1","sfgfzdwry":"1","sfwsclc":"0","sfsydw":"1","sfssgs":"1","sfyzgs":"0","sfjdxjc":"0","sfpwkgfh":"1","sfjljdyzd":"1","fspfbzsd":"0845","fqpfbzsd":"1730","fspfbz":"500","fqpfbz":"100","zspfbz":"50","zfpl":"0","zfsjdw":"1","sfqxgl":"0","qxyy":null,"wuuid":"71c3fd686aa444eca367a738fb700d04","vc_create_user":"admin","vc_create_mechanism":"402848bd4830fed70148312e0efb0631","vc_update_user":null,"vc_update_mechanism":null,"vc_status":null,"vc_workflow":null,"hbqylb":null,"zfkssj":"2017-11-01","zfjssj":"2017-11-30","qxsj":null,"dt_create_time":"2017-11-22","dt_update_time":null,"rownum_":1}]
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
			/**
			 * uuid : 8a2e48d05fe1c654015fe1e554040664
			 * wrybh : YNHJ03
			 * nd : 2017
			 * sfzdy : 1
			 * sfhjtjqy : 1
			 * sfzxjkqy : 1
			 * sfkzpwf : 0
			 * sfgfjydw : 0
			 * sfgfcsdw : 1
			 * sffxy : 1
			 * hbjgjb : 0
			 * dlqyzjrl : 500
			 * sflsdw : 1
			 * hbcxdj : 0
			 * sftgiso14000 : 1
			 * sftgqjscsh : 0
			 * sffszdwry : 0
			 * sffqzdwry : 1
			 * sfgfzdwry : 1
			 * sfwsclc : 0
			 * sfsydw : 1
			 * sfssgs : 1
			 * sfyzgs : 0
			 * sfjdxjc : 0
			 * sfpwkgfh : 1
			 * sfjljdyzd : 1
			 * fspfbzsd : 0845
			 * fqpfbzsd : 1730
			 * fspfbz : 500
			 * fqpfbz : 100
			 * zspfbz : 50
			 * zfpl : 0
			 * zfsjdw : 1
			 * sfqxgl : 0
			 * qxyy : null
			 * wuuid : 71c3fd686aa444eca367a738fb700d04
			 * vc_create_user : admin
			 * vc_create_mechanism : 402848bd4830fed70148312e0efb0631
			 * vc_update_user : null
			 * vc_update_mechanism : null
			 * vc_status : null
			 * vc_workflow : null
			 * hbqylb : null
			 * zfkssj : 2017-11-01
			 * zfjssj : 2017-11-30
			 * qxsj : null
			 * dt_create_time : 2017-11-22
			 * dt_update_time : null
			 * rownum_ : 1
			 */

			private String uuid;
			private String wrybh;
			private String nd;
			private String sfzdy;
			private String sfhjtjqy;
			private String sfzxjkqy;
			private String sfkzpwf;
			private String sfgfjydw;
			private String sfgfcsdw;
			private String sffxy;
			private String hbjgjb;
			private int dlqyzjrl;
			private String sflsdw;
			private String hbcxdj;
			private String sftgiso14000;
			private String sftgqjscsh;
			private String sffszdwry;
			private String sffqzdwry;
			private String sfgfzdwry;
			private String sfwsclc;
			private String sfsydw;
			private String sfssgs;
			private String sfyzgs;
			private String sfjdxjc;
			private String sfpwkgfh;
			private String sfjljdyzd;
			private String fspfbzsd;
			private String fqpfbzsd;
			private String fspfbz;
			private String fqpfbz;
			private String zspfbz;
			private String zfpl;
			private String zfsjdw;
			private String sfqxgl;
			private Object qxyy;
			private String wuuid;
			private String vc_create_user;
			private String vc_create_mechanism;
			private Object vc_update_user;
			private Object vc_update_mechanism;
			private Object vc_status;
			private Object vc_workflow;
			private Object hbqylb;
			private String zfkssj;
			private String zfjssj;
			private Object qxsj;
			private String dt_create_time;
			private Object dt_update_time;
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

			public String getNd() {
				return nd;
			}

			public void setNd(String nd) {
				this.nd = nd;
			}

			public String getSfzdy() {
				return sfzdy;
			}

			public void setSfzdy(String sfzdy) {
				this.sfzdy = sfzdy;
			}

			public String getSfhjtjqy() {
				return sfhjtjqy;
			}

			public void setSfhjtjqy(String sfhjtjqy) {
				this.sfhjtjqy = sfhjtjqy;
			}

			public String getSfzxjkqy() {
				return sfzxjkqy;
			}

			public void setSfzxjkqy(String sfzxjkqy) {
				this.sfzxjkqy = sfzxjkqy;
			}

			public String getSfkzpwf() {
				return sfkzpwf;
			}

			public void setSfkzpwf(String sfkzpwf) {
				this.sfkzpwf = sfkzpwf;
			}

			public String getSfgfjydw() {
				return sfgfjydw;
			}

			public void setSfgfjydw(String sfgfjydw) {
				this.sfgfjydw = sfgfjydw;
			}

			public String getSfgfcsdw() {
				return sfgfcsdw;
			}

			public void setSfgfcsdw(String sfgfcsdw) {
				this.sfgfcsdw = sfgfcsdw;
			}

			public String getSffxy() {
				return sffxy;
			}

			public void setSffxy(String sffxy) {
				this.sffxy = sffxy;
			}

			public String getHbjgjb() {
				return hbjgjb;
			}

			public void setHbjgjb(String hbjgjb) {
				this.hbjgjb = hbjgjb;
			}

			public int getDlqyzjrl() {
				return dlqyzjrl;
			}

			public void setDlqyzjrl(int dlqyzjrl) {
				this.dlqyzjrl = dlqyzjrl;
			}

			public String getSflsdw() {
				return sflsdw;
			}

			public void setSflsdw(String sflsdw) {
				this.sflsdw = sflsdw;
			}

			public String getHbcxdj() {
				return hbcxdj;
			}

			public void setHbcxdj(String hbcxdj) {
				this.hbcxdj = hbcxdj;
			}

			public String getSftgiso14000() {
				return sftgiso14000;
			}

			public void setSftgiso14000(String sftgiso14000) {
				this.sftgiso14000 = sftgiso14000;
			}

			public String getSftgqjscsh() {
				return sftgqjscsh;
			}

			public void setSftgqjscsh(String sftgqjscsh) {
				this.sftgqjscsh = sftgqjscsh;
			}

			public String getSffszdwry() {
				return sffszdwry;
			}

			public void setSffszdwry(String sffszdwry) {
				this.sffszdwry = sffszdwry;
			}

			public String getSffqzdwry() {
				return sffqzdwry;
			}

			public void setSffqzdwry(String sffqzdwry) {
				this.sffqzdwry = sffqzdwry;
			}

			public String getSfgfzdwry() {
				return sfgfzdwry;
			}

			public void setSfgfzdwry(String sfgfzdwry) {
				this.sfgfzdwry = sfgfzdwry;
			}

			public String getSfwsclc() {
				return sfwsclc;
			}

			public void setSfwsclc(String sfwsclc) {
				this.sfwsclc = sfwsclc;
			}

			public String getSfsydw() {
				return sfsydw;
			}

			public void setSfsydw(String sfsydw) {
				this.sfsydw = sfsydw;
			}

			public String getSfssgs() {
				return sfssgs;
			}

			public void setSfssgs(String sfssgs) {
				this.sfssgs = sfssgs;
			}

			public String getSfyzgs() {
				return sfyzgs;
			}

			public void setSfyzgs(String sfyzgs) {
				this.sfyzgs = sfyzgs;
			}

			public String getSfjdxjc() {
				return sfjdxjc;
			}

			public void setSfjdxjc(String sfjdxjc) {
				this.sfjdxjc = sfjdxjc;
			}

			public String getSfpwkgfh() {
				return sfpwkgfh;
			}

			public void setSfpwkgfh(String sfpwkgfh) {
				this.sfpwkgfh = sfpwkgfh;
			}

			public String getSfjljdyzd() {
				return sfjljdyzd;
			}

			public void setSfjljdyzd(String sfjljdyzd) {
				this.sfjljdyzd = sfjljdyzd;
			}

			public String getFspfbzsd() {
				return fspfbzsd;
			}

			public void setFspfbzsd(String fspfbzsd) {
				this.fspfbzsd = fspfbzsd;
			}

			public String getFqpfbzsd() {
				return fqpfbzsd;
			}

			public void setFqpfbzsd(String fqpfbzsd) {
				this.fqpfbzsd = fqpfbzsd;
			}

			public String getFspfbz() {
				return fspfbz;
			}

			public void setFspfbz(String fspfbz) {
				this.fspfbz = fspfbz;
			}

			public String getFqpfbz() {
				return fqpfbz;
			}

			public void setFqpfbz(String fqpfbz) {
				this.fqpfbz = fqpfbz;
			}

			public String getZspfbz() {
				return zspfbz;
			}

			public void setZspfbz(String zspfbz) {
				this.zspfbz = zspfbz;
			}

			public String getZfpl() {
				return zfpl;
			}

			public void setZfpl(String zfpl) {
				this.zfpl = zfpl;
			}

			public String getZfsjdw() {
				return zfsjdw;
			}

			public void setZfsjdw(String zfsjdw) {
				this.zfsjdw = zfsjdw;
			}

			public String getSfqxgl() {
				return sfqxgl;
			}

			public void setSfqxgl(String sfqxgl) {
				this.sfqxgl = sfqxgl;
			}

			public Object getQxyy() {
				return qxyy;
			}

			public void setQxyy(Object qxyy) {
				this.qxyy = qxyy;
			}

			public String getWuuid() {
				return wuuid;
			}

			public void setWuuid(String wuuid) {
				this.wuuid = wuuid;
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

			public Object getVc_update_user() {
				return vc_update_user;
			}

			public void setVc_update_user(Object vc_update_user) {
				this.vc_update_user = vc_update_user;
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

			public Object getHbqylb() {
				return hbqylb;
			}

			public void setHbqylb(Object hbqylb) {
				this.hbqylb = hbqylb;
			}

			public String getZfkssj() {
				return zfkssj;
			}

			public void setZfkssj(String zfkssj) {
				this.zfkssj = zfkssj;
			}

			public String getZfjssj() {
				return zfjssj;
			}

			public void setZfjssj(String zfjssj) {
				this.zfjssj = zfjssj;
			}

			public Object getQxsj() {
				return qxsj;
			}

			public void setQxsj(Object qxsj) {
				this.qxsj = qxsj;
			}

			public String getDt_create_time() {
				return dt_create_time;
			}

			public void setDt_create_time(String dt_create_time) {
				this.dt_create_time = dt_create_time;
			}

			public Object getDt_update_time() {
				return dt_update_time;
			}

			public void setDt_update_time(Object dt_update_time) {
				this.dt_update_time = dt_update_time;
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
