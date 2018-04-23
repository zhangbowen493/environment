package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/11/22.
 */

public class RejectEditBean {

    /**
     * data : [{"t_document_management_id":"297e91a45fe1c04e015fe32c564d128c","t_receipt_management_id":null,"vc_document_name":"手机端驳回保存测试","vc_document_number":"手机端驳回保存测试","document_end_time":"2017-11-22","t_userinfo_id":"手机端驳回保存测试","t_document_company_id":"云南省环境监察总队","vc_document_priority_type":"0","vc_create_user":"admin","create_time":"2017-11-22","vc_create_mechanism":"402848bd4830fed70148312e0efb0631","vc_update_user":null,"update_time":"2017-11-22","vc_uodate_mechanism":null,"vc_status":"3","vc_workflow":"550cabd4f342447da8e25503a5ec59e0","vc_status_id":"0","is_interior":"0","audit_end_user":"admin","audit_end_org":"402848bd4830fed70148312e0efb0631","t_document_company_name":"云南省环境监察总队","filePath":"http://120.27.124.2:9090/ynhjjc/hjjcMobile/E002002/upload.act?bizId=297e91a45fe1c04e015fe32c564d128c&fileId=297e91a45fe1c04e015fe32f9c211299&bizType=E002002&fileName=datetype.png,","fileName":"datetype.png,"}]
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
         * t_document_management_id : 297e91a45fe1c04e015fe32c564d128c
         * t_receipt_management_id : null
         * vc_document_name : 手机端驳回保存测试
         * vc_document_number : 手机端驳回保存测试
         * document_end_time : 2017-11-22
         * t_userinfo_id : 手机端驳回保存测试
         * t_document_company_id : 云南省环境监察总队
         * vc_document_priority_type : 0
         * vc_create_user : admin
         * create_time : 2017-11-22
         * vc_create_mechanism : 402848bd4830fed70148312e0efb0631
         * vc_update_user : null
         * update_time : 2017-11-22
         * vc_uodate_mechanism : null
         * vc_status : 3
         * vc_workflow : 550cabd4f342447da8e25503a5ec59e0
         * vc_status_id : 0
         * is_interior : 0
         * audit_end_user : admin
         * audit_end_org : 402848bd4830fed70148312e0efb0631
         * t_document_company_name : 云南省环境监察总队
         * filePath : http://120.27.124.2:9090/ynhjjc/hjjcMobile/E002002/upload.act?bizId=297e91a45fe1c04e015fe32c564d128c&fileId=297e91a45fe1c04e015fe32f9c211299&bizType=E002002&fileName=datetype.png,
         * fileName : datetype.png,
         */

        private String t_document_management_id;
        private Object t_receipt_management_id;
        private String vc_document_name;
        private String vc_document_number;
        private String document_end_time;
        private String t_userinfo_id;
        private String t_document_company_id;
        private String vc_document_priority_type;
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
        private String audit_end_user;
        private String audit_end_org;
        private String t_document_company_name;
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

        public String getVc_document_number() {
            return vc_document_number;
        }

        public void setVc_document_number(String vc_document_number) {
            this.vc_document_number = vc_document_number;
        }

        public String getDocument_end_time() {
            return document_end_time;
        }

        public void setDocument_end_time(String document_end_time) {
            this.document_end_time = document_end_time;
        }

        public String getT_userinfo_id() {
            return t_userinfo_id;
        }

        public void setT_userinfo_id(String t_userinfo_id) {
            this.t_userinfo_id = t_userinfo_id;
        }

        public String getT_document_company_id() {
            return t_document_company_id;
        }

        public void setT_document_company_id(String t_document_company_id) {
            this.t_document_company_id = t_document_company_id;
        }

        public String getVc_document_priority_type() {
            return vc_document_priority_type;
        }

        public void setVc_document_priority_type(String vc_document_priority_type) {
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

        public String getAudit_end_user() {
            return audit_end_user;
        }

        public void setAudit_end_user(String audit_end_user) {
            this.audit_end_user = audit_end_user;
        }

        public String getAudit_end_org() {
            return audit_end_org;
        }

        public void setAudit_end_org(String audit_end_org) {
            this.audit_end_org = audit_end_org;
        }

        public String getT_document_company_name() {
            return t_document_company_name;
        }

        public void setT_document_company_name(String t_document_company_name) {
            this.t_document_company_name = t_document_company_name;
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
