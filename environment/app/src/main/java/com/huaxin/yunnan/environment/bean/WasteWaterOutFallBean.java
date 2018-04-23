package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/10/29.
 */

public class WasteWaterOutFallBean {

    /**
     * data : {"pageInfo":{"pageNum":1,"pageSize":20,"totalRowNum":1},"queryData":[{"uuid":"402880495f0f4d0f015f0f4defc90034","wrybh":"622898222","pwkbh":"DFG","pwkmc":"FDG","pwkwz":"FDG","pfqxlb":"0","pfgl":"0","jnwsstdm":"DFG","code_pipenetwork":"DFG","outentercode":"DFG","outentername":"DSFG","estuarylongitude":45,"estuarylatitude":45,"zxbz":"FG","sfazzxjksb":"0","indicate":"DFG","jdd":2,"jdf":2,"jdm":2,"wdd":2,"wdf":2,"wdm":2,"bz":"DFSDF","wuuid":"402880495f04f3a1015f05815f49019c","vc_create_user":null,"dt_create_time":null,"vc_create_mechanism":null,"vc_update_user":null,"dt_update_time":null,"vc_update_mechanism":null,"vc_status":null,"vc_workflow":null,"rownum_":1}]}
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
         * queryData : [{"uuid":"402880495f0f4d0f015f0f4defc90034","wrybh":"622898222","pwkbh":"DFG","pwkmc":"FDG","pwkwz":"FDG","pfqxlb":"0","pfgl":"0","jnwsstdm":"DFG","code_pipenetwork":"DFG","outentercode":"DFG","outentername":"DSFG","estuarylongitude":45,"estuarylatitude":45,"zxbz":"FG","sfazzxjksb":"0","indicate":"DFG","jdd":2,"jdf":2,"jdm":2,"wdd":2,"wdf":2,"wdm":2,"bz":"DFSDF","wuuid":"402880495f04f3a1015f05815f49019c","vc_create_user":null,"dt_create_time":null,"vc_create_mechanism":null,"vc_update_user":null,"dt_update_time":null,"vc_update_mechanism":null,"vc_status":null,"vc_workflow":null,"rownum_":1}]
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
             * uuid : 402880495f0f4d0f015f0f4defc90034
             * wrybh : 622898222
             * pwkbh : DFG
             * pwkmc : FDG
             * pwkwz : FDG
             * pfqxlb : 0
             * pfgl : 0
             * jnwsstdm : DFG
             * code_pipenetwork : DFG
             * outentercode : DFG
             * outentername : DSFG
             * estuarylongitude : 45
             * estuarylatitude : 45
             * zxbz : FG
             * sfazzxjksb : 0
             * indicate : DFG
             * jdd : 2
             * jdf : 2
             * jdm : 2
             * wdd : 2
             * wdf : 2
             * wdm : 2
             * bz : DFSDF
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
            private String pwkbh;
            private String pwkmc;
            private String pwkwz;
            private String pfqxlb;
            private String pfgl;
            private String jnwsstdm;
            private String code_pipenetwork;
            private String outentercode;
            private String outentername;
            private String estuarylongitude;
            private String estuarylatitude;
            private String zxbz;
            private String sfazzxjksb;
            private String indicate;
            private String jdd;
            private String jdf;
            private String jdm;
            private String wdd;
            private String wdf;
            private String wdm;
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

            public String getPwkbh() {
                return pwkbh;
            }

            public void setPwkbh(String pwkbh) {
                this.pwkbh = pwkbh;
            }

            public String getPwkmc() {
                return pwkmc;
            }

            public void setPwkmc(String pwkmc) {
                this.pwkmc = pwkmc;
            }

            public String getPwkwz() {
                return pwkwz;
            }

            public void setPwkwz(String pwkwz) {
                this.pwkwz = pwkwz;
            }

            public String getPfqxlb() {
                return pfqxlb;
            }

            public void setPfqxlb(String pfqxlb) {
                this.pfqxlb = pfqxlb;
            }

            public String getPfgl() {
                return pfgl;
            }

            public void setPfgl(String pfgl) {
                this.pfgl = pfgl;
            }

            public String getJnwsstdm() {
                return jnwsstdm;
            }

            public void setJnwsstdm(String jnwsstdm) {
                this.jnwsstdm = jnwsstdm;
            }

            public String getCode_pipenetwork() {
                return code_pipenetwork;
            }

            public void setCode_pipenetwork(String code_pipenetwork) {
                this.code_pipenetwork = code_pipenetwork;
            }

            public String getOutentercode() {
                return outentercode;
            }

            public void setOutentercode(String outentercode) {
                this.outentercode = outentercode;
            }

            public String getOutentername() {
                return outentername;
            }

            public void setOutentername(String outentername) {
                this.outentername = outentername;
            }

            public String getEstuarylongitude() {
                return estuarylongitude;
            }

            public void setEstuarylongitude(String estuarylongitude) {
                this.estuarylongitude = estuarylongitude;
            }

            public String getEstuarylatitude() {
                return estuarylatitude;
            }

            public void setEstuarylatitude(String estuarylatitude) {
                this.estuarylatitude = estuarylatitude;
            }

            public String getZxbz() {
                return zxbz;
            }

            public void setZxbz(String zxbz) {
                this.zxbz = zxbz;
            }

            public String getSfazzxjksb() {
                return sfazzxjksb;
            }

            public void setSfazzxjksb(String sfazzxjksb) {
                this.sfazzxjksb = sfazzxjksb;
            }

            public String getIndicate() {
                return indicate;
            }

            public void setIndicate(String indicate) {
                this.indicate = indicate;
            }

            public String getJdd() {
                return jdd;
            }

            public void setJdd(String jdd) {
                this.jdd = jdd;
            }

            public String getJdf() {
                return jdf;
            }

            public void setJdf(String jdf) {
                this.jdf = jdf;
            }

            public String getJdm() {
                return jdm;
            }

            public void setJdm(String jdm) {
                this.jdm = jdm;
            }

            public String getWdd() {
                return wdd;
            }

            public void setWdd(String wdd) {
                this.wdd = wdd;
            }

            public String getWdf() {
                return wdf;
            }

            public void setWdf(String wdf) {
                this.wdf = wdf;
            }

            public String getWdm() {
                return wdm;
            }

            public void setWdm(String wdm) {
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
