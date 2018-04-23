package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/10/29.
 */

public class WastewaterTreatmentBean {

    /**
     * data : {"pageInfo":{"pageNum":1,"pageSize":20,"totalRowNum":1},"queryData":[{"uuid":"8a2e48d05fe1c654015fe231f56018ca","wrybh":"YNHJ03","sclssbh":"SCLSS-03","sclssmc":"水处理器","fslb":"0","pwkbh":"03","gdzcyz":100,"ztz":100,"sjclnl":200,"sjclnli":200,"fsclff":"02","nyxfy":5,"ssyxzt":"1","bz":"无","wuuid":"71c3fd686aa444eca367a738fb700d04","vc_create_user":"admin","vc_create_mechanism":"402848bd4830fed70148312e0efb0631","vc_update_user":"admin","vc_update_mechanism":"402848bd4830fed70148312e0efb0631","vc_status":null,"vc_workflow":null,"tyrq":"2017-11-30","dt_create_time":"2017-11-22","dt_update_time":"2017-11-22","rownum_":1}]}
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
         * queryData : [{"uuid":"8a2e48d05fe1c654015fe231f56018ca","wrybh":"YNHJ03","sclssbh":"SCLSS-03","sclssmc":"水处理器","fslb":"0","pwkbh":"03","gdzcyz":100,"ztz":100,"sjclnl":200,"sjclnli":200,"fsclff":"02","nyxfy":5,"ssyxzt":"1","bz":"无","wuuid":"71c3fd686aa444eca367a738fb700d04","vc_create_user":"admin","vc_create_mechanism":"402848bd4830fed70148312e0efb0631","vc_update_user":"admin","vc_update_mechanism":"402848bd4830fed70148312e0efb0631","vc_status":null,"vc_workflow":null,"tyrq":"2017-11-30","dt_create_time":"2017-11-22","dt_update_time":"2017-11-22","rownum_":1}]
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
             * uuid : 8a2e48d05fe1c654015fe231f56018ca
             * wrybh : YNHJ03
             * sclssbh : SCLSS-03
             * sclssmc : 水处理器
             * fslb : 0
             * pwkbh : 03
             * gdzcyz : 100
             * ztz : 100
             * sjclnl : 200
             * sjclnli : 200
             * fsclff : 02
             * nyxfy : 5
             * ssyxzt : 1
             * bz : 无
             * wuuid : 71c3fd686aa444eca367a738fb700d04
             * vc_create_user : admin
             * vc_create_mechanism : 402848bd4830fed70148312e0efb0631
             * vc_update_user : admin
             * vc_update_mechanism : 402848bd4830fed70148312e0efb0631
             * vc_status : null
             * vc_workflow : null
             * tyrq : 2017-11-30
             * dt_create_time : 2017-11-22
             * dt_update_time : 2017-11-22
             * rownum_ : 1
             */

            private String uuid;
            private String wrybh;
            private String sclssbh;
            private String sclssmc;
            private String fslb;
            private String pwkbh;
            private int gdzcyz;
            private int ztz;
            private int sjclnl;
            private int sjclnli;
            private String fsclff;
            private int nyxfy;
            private String ssyxzt;
            private String bz;
            private String wuuid;
            private String vc_create_user;
            private String vc_create_mechanism;
            private String vc_update_user;
            private String vc_update_mechanism;
            private Object vc_status;
            private Object vc_workflow;
            private String tyrq;
            private String dt_create_time;
            private String dt_update_time;
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

            public String getSclssbh() {
                return sclssbh;
            }

            public void setSclssbh(String sclssbh) {
                this.sclssbh = sclssbh;
            }

            public String getSclssmc() {
                return sclssmc;
            }

            public void setSclssmc(String sclssmc) {
                this.sclssmc = sclssmc;
            }

            public String getFslb() {
                return fslb;
            }

            public void setFslb(String fslb) {
                this.fslb = fslb;
            }

            public String getPwkbh() {
                return pwkbh;
            }

            public void setPwkbh(String pwkbh) {
                this.pwkbh = pwkbh;
            }

            public int getGdzcyz() {
                return gdzcyz;
            }

            public void setGdzcyz(int gdzcyz) {
                this.gdzcyz = gdzcyz;
            }

            public int getZtz() {
                return ztz;
            }

            public void setZtz(int ztz) {
                this.ztz = ztz;
            }

            public int getSjclnl() {
                return sjclnl;
            }

            public void setSjclnl(int sjclnl) {
                this.sjclnl = sjclnl;
            }

            public int getSjclnli() {
                return sjclnli;
            }

            public void setSjclnli(int sjclnli) {
                this.sjclnli = sjclnli;
            }

            public String getFsclff() {
                return fsclff;
            }

            public void setFsclff(String fsclff) {
                this.fsclff = fsclff;
            }

            public int getNyxfy() {
                return nyxfy;
            }

            public void setNyxfy(int nyxfy) {
                this.nyxfy = nyxfy;
            }

            public String getSsyxzt() {
                return ssyxzt;
            }

            public void setSsyxzt(String ssyxzt) {
                this.ssyxzt = ssyxzt;
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

            public String getVc_update_user() {
                return vc_update_user;
            }

            public void setVc_update_user(String vc_update_user) {
                this.vc_update_user = vc_update_user;
            }

            public String getVc_update_mechanism() {
                return vc_update_mechanism;
            }

            public void setVc_update_mechanism(String vc_update_mechanism) {
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

            public String getTyrq() {
                return tyrq;
            }

            public void setTyrq(String tyrq) {
                this.tyrq = tyrq;
            }

            public String getDt_create_time() {
                return dt_create_time;
            }

            public void setDt_create_time(String dt_create_time) {
                this.dt_create_time = dt_create_time;
            }

            public String getDt_update_time() {
                return dt_update_time;
            }

            public void setDt_update_time(String dt_update_time) {
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
