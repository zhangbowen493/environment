package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/11/14.
 */

public class ReviewHistoryBean {

    /**
     * data : [{"workitem_ins_id":"5068879778f04599983837b005ccb8fd","proc_instance_id":"b2bd26afcc8f43988463801d250c2218","activity_ins_id":"77a372c7128d436380da369c6902bb6e","activity_id":"86b0e48e1a5b4f6cadbd3e5a1d397da9","activity_name":"第一流程","status":4,"status_name":"审核完成","arrive_time":"2017-11-11 20:35:30","complete_time":"2017-11-11 20:35:30","audit_user_id":"admin","audit_user_name":"超级管理员","businessid":"8a2e48d05fa93976015fab131a31251a","opinion":"请查阅","orgid":"402848bd4830fed70148312e0efb0631","orgname":"云南省环境监察总队","auditlunc":"第一次"},{"workitem_ins_id":"f6042aa64e23441dbfe50d42f7977b75","proc_instance_id":"b2bd26afcc8f43988463801d250c2218","activity_ins_id":"054ba22350b847bba4666019901a526e","activity_id":"269d4af961d341f18b34190a346c0d0e","activity_name":"第二个流程","status":1,"status_name":"待审核","arrive_time":"2017-11-11 20:35:30","complete_time":null,"audit_user_id":"admin","audit_user_name":"超级管理员","businessid":"8a2e48d05fa93976015fab131a31251a","opinion":" ","orgid":"402848bd4830fed70148312e0efb0631","orgname":"云南省环境监察总队","auditlunc":"第一次"}]
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
         * workitem_ins_id : 5068879778f04599983837b005ccb8fd
         * proc_instance_id : b2bd26afcc8f43988463801d250c2218
         * activity_ins_id : 77a372c7128d436380da369c6902bb6e
         * activity_id : 86b0e48e1a5b4f6cadbd3e5a1d397da9
         * activity_name : 第一流程
         * status : 4
         * status_name : 审核完成
         * arrive_time : 2017-11-11 20:35:30
         * complete_time : 2017-11-11 20:35:30
         * audit_user_id : admin
         * audit_user_name : 超级管理员
         * businessid : 8a2e48d05fa93976015fab131a31251a
         * opinion : 请查阅
         * orgid : 402848bd4830fed70148312e0efb0631
         * orgname : 云南省环境监察总队
         * auditlunc : 第一次
         */

        private String workitem_ins_id;
        private String proc_instance_id;
        private String activity_ins_id;
        private String activity_id;
        private String activity_name;
        private int status;
        private String status_name;
        private String arrive_time;
        private String complete_time;
        private String audit_user_id;
        private String audit_user_name;
        private String businessid;
        private String opinion;
        private String orgid;
        private String orgname;
        private String auditlunc;

        public String getWorkitem_ins_id() {
            return workitem_ins_id;
        }

        public void setWorkitem_ins_id(String workitem_ins_id) {
            this.workitem_ins_id = workitem_ins_id;
        }

        public String getProc_instance_id() {
            return proc_instance_id;
        }

        public void setProc_instance_id(String proc_instance_id) {
            this.proc_instance_id = proc_instance_id;
        }

        public String getActivity_ins_id() {
            return activity_ins_id;
        }

        public void setActivity_ins_id(String activity_ins_id) {
            this.activity_ins_id = activity_ins_id;
        }

        public String getActivity_id() {
            return activity_id;
        }

        public void setActivity_id(String activity_id) {
            this.activity_id = activity_id;
        }

        public String getActivity_name() {
            return activity_name;
        }

        public void setActivity_name(String activity_name) {
            this.activity_name = activity_name;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getStatus_name() {
            return status_name;
        }

        public void setStatus_name(String status_name) {
            this.status_name = status_name;
        }

        public String getArrive_time() {
            return arrive_time;
        }

        public void setArrive_time(String arrive_time) {
            this.arrive_time = arrive_time;
        }

        public String getComplete_time() {
            return complete_time;
        }

        public void setComplete_time(String complete_time) {
            this.complete_time = complete_time;
        }

        public String getAudit_user_id() {
            return audit_user_id;
        }

        public void setAudit_user_id(String audit_user_id) {
            this.audit_user_id = audit_user_id;
        }

        public String getAudit_user_name() {
            return audit_user_name;
        }

        public void setAudit_user_name(String audit_user_name) {
            this.audit_user_name = audit_user_name;
        }

        public String getBusinessid() {
            return businessid;
        }

        public void setBusinessid(String businessid) {
            this.businessid = businessid;
        }

        public String getOpinion() {
            return opinion;
        }

        public void setOpinion(String opinion) {
            this.opinion = opinion;
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

        public String getAuditlunc() {
            return auditlunc;
        }

        public void setAuditlunc(String auditlunc) {
            this.auditlunc = auditlunc;
        }
    }
}
