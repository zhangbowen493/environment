package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/11/14.
 */

public class PendAuditBean {

    @Override
    public String toString() {
        return "PendAuditBean{" +
                "msg='" + msg + '\'' +
                ", success='" + success + '\'' +
                ", data=" + data +
                '}';
    }

    /**
     * data : [{"t_document_management_id":"4028b8815fb9cefb015fba01ca080462","t_receipt_management_id":null,"vc_document_name":"aa","vc_document_number":null,"document_end_time":null,"t_userinfo_id":null,"t_document_company_id":"402848bd4830fed70148312e0efb0631","vc_document_priority_type":null,"vc_create_user":"admin","create_time":"2017-11-14","vc_create_mechanism":"402848bd4830fed70148312e0efb0631","vc_update_user":null,"update_time":"2017-11-14","vc_uodate_mechanism":null,"vc_status":"3","vc_workflow":"5ee206676fdd4e5eaa4f2d81240b09fe","vc_status_id":"0","is_interior":"0","audit_end_user":null,"audit_end_org":null,"orgname":"云南省环境监察总队","filePath":"","fileName":""}]
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
        @Override
        public String toString() {
            return "DataBean{" +
                    "t_document_management_id='" + t_document_management_id + '\'' +
                    ", t_receipt_management_id=" + t_receipt_management_id +
                    ", vc_document_name='" + vc_document_name + '\'' +
                    ", vc_document_number=" + vc_document_number +
                    ", document_end_time=" + document_end_time +
                    ", t_userinfo_id=" + t_userinfo_id +
                    ", t_document_company_id='" + t_document_company_id + '\'' +
                    ", vc_document_priority_type=" + vc_document_priority_type +
                    ", vc_create_user='" + vc_create_user + '\'' +
                    ", create_time='" + create_time + '\'' +
                    ", vc_create_mechanism='" + vc_create_mechanism + '\'' +
                    ", vc_update_user=" + vc_update_user +
                    ", update_time='" + update_time + '\'' +
                    ", vc_uodate_mechanism=" + vc_uodate_mechanism +
                    ", vc_status='" + vc_status + '\'' +
                    ", vc_workflow='" + vc_workflow + '\'' +
                    ", vc_status_id='" + vc_status_id + '\'' +
                    ", is_interior='" + is_interior + '\'' +
                    ", audit_end_user=" + audit_end_user +
                    ", audit_end_org=" + audit_end_org +
                    ", orgname='" + orgname + '\'' +
                    ", filePath='" + filePath + '\'' +
                    ", fileName='" + fileName + '\'' +
                    '}';
        }

        /**
         * t_document_management_id : 4028b8815fb9cefb015fba01ca080462
         * t_receipt_management_id : null
         * vc_document_name : aa
         * vc_document_number : null
         * document_end_time : null
         * t_userinfo_id : null
         * t_document_company_id : 402848bd4830fed70148312e0efb0631
         * vc_document_priority_type : null
         * vc_create_user : admin
         * create_time : 2017-11-14
         * vc_create_mechanism : 402848bd4830fed70148312e0efb0631
         * vc_update_user : null
         * update_time : 2017-11-14
         * vc_uodate_mechanism : null
         * vc_status : 3
         * vc_workflow : 5ee206676fdd4e5eaa4f2d81240b09fe
         * vc_status_id : 0
         * is_interior : 0
         * audit_end_user : null
         * audit_end_org : null
         * orgname : 云南省环境监察总队
         * filePath :
         * fileName :
         */

        private String t_document_management_id;
        private Object t_receipt_management_id;
        private String vc_document_name;
        private Object vc_document_number;
        private Object document_end_time;
        private Object t_userinfo_id;
        private String t_document_company_id;
        private Object vc_document_priority_type;
        private String vc_create_user;
        private String create_time;
        private String vc_create_mechanism;
        private Object vc_update_user;
        private String update_time;
        private Object vc_uodate_mechanism;
        private String vc_status;
        private String vc_workflow;
        private String vc_status_id;
        private String is_interior;
        private Object audit_end_user;
        private Object audit_end_org;
        private String orgname;
        private String filePath;
        private String fileName;

        public String getT_document_management_id() {
            return t_document_management_id;
        }

        public void setT_document_management_id(String t_document_management_id) {
            this.t_document_management_id = t_document_management_id;
        }

        public Object getT_receipt_management_id() {
            return t_receipt_management_id;
        }

        public void setT_receipt_management_id(Object t_receipt_management_id) {
            this.t_receipt_management_id = t_receipt_management_id;
        }

        public String getVc_document_name() {
            return vc_document_name;
        }

        public void setVc_document_name(String vc_document_name) {
            this.vc_document_name = vc_document_name;
        }

        public Object getVc_document_number() {
            return vc_document_number;
        }

        public void setVc_document_number(Object vc_document_number) {
            this.vc_document_number = vc_document_number;
        }

        public Object getDocument_end_time() {
            return document_end_time;
        }

        public void setDocument_end_time(Object document_end_time) {
            this.document_end_time = document_end_time;
        }

        public Object getT_userinfo_id() {
            return t_userinfo_id;
        }

        public void setT_userinfo_id(Object t_userinfo_id) {
            this.t_userinfo_id = t_userinfo_id;
        }

        public String getT_document_company_id() {
            return t_document_company_id;
        }

        public void setT_document_company_id(String t_document_company_id) {
            this.t_document_company_id = t_document_company_id;
        }

        public Object getVc_document_priority_type() {
            return vc_document_priority_type;
        }

        public void setVc_document_priority_type(Object vc_document_priority_type) {
            this.vc_document_priority_type = vc_document_priority_type;
        }

        public String getVc_create_user() {
            return vc_create_user;
        }

        public void setVc_create_user(String vc_create_user) {
            this.vc_create_user = vc_create_user;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
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

        public String getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }

        public Object getVc_uodate_mechanism() {
            return vc_uodate_mechanism;
        }

        public void setVc_uodate_mechanism(Object vc_uodate_mechanism) {
            this.vc_uodate_mechanism = vc_uodate_mechanism;
        }

        public String getVc_status() {
            return vc_status;
        }

        public void setVc_status(String vc_status) {
            this.vc_status = vc_status;
        }

        public String getVc_workflow() {
            return vc_workflow;
        }

        public void setVc_workflow(String vc_workflow) {
            this.vc_workflow = vc_workflow;
        }

        public String getVc_status_id() {
            return vc_status_id;
        }

        public void setVc_status_id(String vc_status_id) {
            this.vc_status_id = vc_status_id;
        }

        public String getIs_interior() {
            return is_interior;
        }

        public void setIs_interior(String is_interior) {
            this.is_interior = is_interior;
        }

        public Object getAudit_end_user() {
            return audit_end_user;
        }

        public void setAudit_end_user(Object audit_end_user) {
            this.audit_end_user = audit_end_user;
        }

        public Object getAudit_end_org() {
            return audit_end_org;
        }

        public void setAudit_end_org(Object audit_end_org) {
            this.audit_end_org = audit_end_org;
        }

        public String getOrgname() {
            return orgname;
        }

        public void setOrgname(String orgname) {
            this.orgname = orgname;
        }

        public String getFilePath() {
            return filePath;
        }

        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }
    }
}
