package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/11/19.
 */

public class SelectProcessBean {

    /**
     * data : [{"proc_id":"44af483c681d48bcba465fb4e6de872c","proc_version":"1","proc_category":"d4b5c38d242d4d408237900c87462760","proc_name":"发文测试","proc_desc":null,"start_node":null,"builder":"402848bd4830fed70148312e0efb0631","busitype_proc_id":"3C3FA77026DA417ABFC6A0220BA33314","processcorpid":"402848bd4830fed70148312e0efb0631"}]
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
         * proc_id : 44af483c681d48bcba465fb4e6de872c
         * proc_version : 1
         * proc_category : d4b5c38d242d4d408237900c87462760
         * proc_name : 发文测试
         * proc_desc : null
         * start_node : null
         * builder : 402848bd4830fed70148312e0efb0631
         * busitype_proc_id : 3C3FA77026DA417ABFC6A0220BA33314
         * processcorpid : 402848bd4830fed70148312e0efb0631
         */

        private String proc_id;
        private String proc_version;
        private String proc_category;
        private String proc_name;
        private Object proc_desc;
        private Object start_node;
        private String builder;
        private String busitype_proc_id;
        private String processcorpid;

        public String getProc_id() {
            return proc_id;
        }

        public void setProc_id(String proc_id) {
            this.proc_id = proc_id;
        }

        public String getProc_version() {
            return proc_version;
        }

        public void setProc_version(String proc_version) {
            this.proc_version = proc_version;
        }

        public String getProc_category() {
            return proc_category;
        }

        public void setProc_category(String proc_category) {
            this.proc_category = proc_category;
        }

        public String getProc_name() {
            return proc_name;
        }

        public void setProc_name(String proc_name) {
            this.proc_name = proc_name;
        }

        public Object getProc_desc() {
            return proc_desc;
        }

        public void setProc_desc(Object proc_desc) {
            this.proc_desc = proc_desc;
        }

        public Object getStart_node() {
            return start_node;
        }

        public void setStart_node(Object start_node) {
            this.start_node = start_node;
        }

        public String getBuilder() {
            return builder;
        }

        public void setBuilder(String builder) {
            this.builder = builder;
        }

        public String getBusitype_proc_id() {
            return busitype_proc_id;
        }

        public void setBusitype_proc_id(String busitype_proc_id) {
            this.busitype_proc_id = busitype_proc_id;
        }

        public String getProcesscorpid() {
            return processcorpid;
        }

        public void setProcesscorpid(String processcorpid) {
            this.processcorpid = processcorpid;
        }
    }
}
