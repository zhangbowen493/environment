package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/10/31.
 */

public class MailListBean {

    /**
     * data : [{"total":1,"id":"402880f15f4d0d8a015f4e37733808e4","name":"法规处","parent_id":"402880fb5f1ebbc6015f1ed5b27d01a0","rownum_":1},{"total":1,"id":"402880f15f4d0d8a015f4e387c45090b","name":"环保厅","parent_id":"402880fb5f1ebbc6015f1ed5b27d01a0","rownum_":2},{"total":2,"id":"402880f15f4d0d8a015f4e393bca0931","name":"环评处","parent_id":"402880fb5f1ebbc6015f1ed5b27d01a0","rownum_":3},{"total":6,"id":"402880f15f4d0d8a015f4e39f200095a","name":"稽查科","parent_id":"402880fb5f1ebbc6015f1ed5b27d01a0","rownum_":4},{"total":2,"id":"402880f15f4d0d8a015f4e3ac2c40981","name":"监测处","parent_id":"402880fb5f1ebbc6015f1ed5b27d01a0","rownum_":5},{"total":6,"id":"402880f15f4d0d8a015f4e3b659709c5","name":"监察科","parent_id":"402880fb5f1ebbc6015f1ed5b27d01a0","rownum_":6},{"total":1,"id":"402880f15f4d0d8a015f4e3c08aa09ec","name":"局长","parent_id":"402880fb5f1ebbc6015f1ed5b27d01a0","rownum_":7},{"total":1,"id":"402880f15f4d0d8a015f4e3c9ffb0a13","name":"人事处","parent_id":"402880fb5f1ebbc6015f1ed5b27d01a0","rownum_":8},{"total":7,"id":"402880f15f4d0d8a015f4e3d15900a3a","name":"收费科","parent_id":"402880fb5f1ebbc6015f1ed5b27d01a0","rownum_":9},{"total":2,"id":"402880f15f4d0d8a015f4e3d927c0a62","name":"污控处","parent_id":"402880fb5f1ebbc6015f1ed5b27d01a0","rownum_":10},{"total":7,"id":"402880f15f4d0d8a015f4e3e0e3b0a8b","name":"信访科","parent_id":"402880fb5f1ebbc6015f1ed5b27d01a0","rownum_":11},{"total":1,"id":"402880f15f4d0d8a015f4e405a820ad9","name":"总量处","parent_id":"402880fb5f1ebbc6015f1ed5b27d01a0","rownum_":12},{"total":7,"id":"402880fb5f1edbae015f1ee5e4830173","name":"办公室","parent_id":"402880fb5f1ebbc6015f1ed5b27d01a0","rownum_":13}]
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
         * total : 1
         * id : 402880f15f4d0d8a015f4e37733808e4
         * name : 法规处
         * parent_id : 402880fb5f1ebbc6015f1ed5b27d01a0
         * rownum_ : 1
         */

        private String total;
        private String id;
        private String name;
        private String parent_id;
        private int rownum_;

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getParent_id() {
            return parent_id;
        }

        public void setParent_id(String parent_id) {
            this.parent_id = parent_id;
        }

        public int getRownum_() {
            return rownum_;
        }

        public void setRownum_(int rownum_) {
            this.rownum_ = rownum_;
        }
    }
}
