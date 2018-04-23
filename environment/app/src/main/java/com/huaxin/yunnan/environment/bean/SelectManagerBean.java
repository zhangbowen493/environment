package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/11/15.
 */

public class SelectManagerBean {

    /**
     * data : [{"userid":"admin","username":"超级管理员","orgid":"402848bd4830fed70148312e0efb0631","orgname":"云南省环境监察总队"}]
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
         * userid : admin
         * username : 超级管理员
         * orgid : 402848bd4830fed70148312e0efb0631
         * orgname : 云南省环境监察总队
         */

        private String userid;
        private String username;
        private String orgid;
        private String orgname;

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getOrgid() {
            return orgid;
        }

        public void setOrgid(String orgid) {
            this.orgid = orgid;
        }

        public String getOrgname() {
            return orgname;
        }

        public void setOrgname(String orgname) {
            this.orgname = orgname;
        }
    }
}
