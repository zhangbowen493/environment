package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/10/29.
 */

public class ProductEquipInfoBean {

    /**
     * data : {"pageInfo":{"pageNum":1,"pageSize":20,"totalRowNum":1},"queryData":[{"uuid":"402880495f13b317015f13b3d01f004b","wrybh":"622898222","xh":23,"sbmc":"4sd","ggxh":"2d2","sl":23,"wuuid":"402880495f04f3a1015f05815f49019c","vc_create_user":null,"dt_create_time":null,"vc_create_mechanism":null,"vc_update_user":null,"dt_update_time":null,"vc_update_mechanism":null,"vc_status":null,"vc_workflow":null,"rownum_":1}]}
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
         * queryData : [{"uuid":"402880495f13b317015f13b3d01f004b","wrybh":"622898222","xh":23,"sbmc":"4sd","ggxh":"2d2","sl":23,"wuuid":"402880495f04f3a1015f05815f49019c","vc_create_user":null,"dt_create_time":null,"vc_create_mechanism":null,"vc_update_user":null,"dt_update_time":null,"vc_update_mechanism":null,"vc_status":null,"vc_workflow":null,"rownum_":1}]
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
             * uuid : 402880495f13b317015f13b3d01f004b
             * wrybh : 622898222
             * xh : 23
             * sbmc : 4sd
             * ggxh : 2d2
             * sl : 23
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
            private String xh;
            private String sbmc;
            private String ggxh;
            private String sl;
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

            public String getXh() {
                return xh;
            }

            public void setXh(String xh) {
                this.xh = xh;
            }

            public String getSbmc() {
                return sbmc;
            }

            public void setSbmc(String sbmc) {
                this.sbmc = sbmc;
            }

            public String getGgxh() {
                return ggxh;
            }

            public void setGgxh(String ggxh) {
                this.ggxh = ggxh;
            }

            public String getSl() {
                return sl;
            }

            public void setSl(String sl) {
                this.sl = sl;
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
