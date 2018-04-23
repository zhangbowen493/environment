package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/10/28.
 */

public class PollutionSourceBean {

    /**
     * data : {"pageInfo":{"pageNum":1,"pageSize":20,"totalRowNum":2},"queryData":[{"uuid":"42c6873977194cc8a494fdfbd3bc3f8a","wrymc":"云南庆林科技有限公司大理灯龙河污水处理厂","lxdh":null,"hblxr":null,"rownum_":1},{"uuid":"402880495f04f3a1015f05815f49019c","wrymc":"大理怡祥纸业有限公司","lxdh":"1563453234","hblxr":"朱建平","rownum_":2}]}
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
         * pageInfo : {"pageNum":1,"pageSize":20,"totalRowNum":2}
         * queryData : [{"uuid":"42c6873977194cc8a494fdfbd3bc3f8a","wrymc":"云南庆林科技有限公司大理灯龙河污水处理厂","lxdh":null,"hblxr":null,"rownum_":1},{"uuid":"402880495f04f3a1015f05815f49019c","wrymc":"大理怡祥纸业有限公司","lxdh":"1563453234","hblxr":"朱建平","rownum_":2}]
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
             * totalRowNum : 2
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
             * uuid : 42c6873977194cc8a494fdfbd3bc3f8a
             * wrymc : 云南庆林科技有限公司大理灯龙河污水处理厂
             * lxdh : null
             * hblxr : null
             * rownum_ : 1
             */

            private String uuid;
            private String wrymc;
            private Object lxdh;
            private Object hblxr;
            private int rownum_;

            public String getUuid() {
                return uuid;
            }

            public void setUuid(String uuid) {
                this.uuid = uuid;
            }

            public String getWrymc() {
                return wrymc;
            }

            public void setWrymc(String wrymc) {
                this.wrymc = wrymc;
            }

            public Object getLxdh() {
                return lxdh;
            }

            public void setLxdh(Object lxdh) {
                this.lxdh = lxdh;
            }

            public Object getHblxr() {
                return hblxr;
            }

            public void setHblxr(Object hblxr) {
                this.hblxr = hblxr;
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
