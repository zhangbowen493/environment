package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/11/13.
 */

public class ToDoListBean {

    /**
     * data : [{"todo_type_":"1","todo_type_name_":"待审核","type_":"发文管理","corp_name":"环境监察总队","title_":"标题为【测试V20171111】发文管理 需要您审核！","application_userid_":"admin","application_username_":"超级管理员","todoname_":"第二个流程","arrivetime_":"2017-11-11 20:35:30","workitem_ins_id_":"f6042aa64e23441dbfe50d42f7977b75","businessid_":"8a2e48d05fa93976015fab131a31251a"}]
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
         * todo_type_ : 1
         * todo_type_name_ : 待审核
         * type_ : 发文管理
         * corp_name : 环境监察总队
         * title_ : 标题为【测试V20171111】发文管理 需要您审核！
         * application_userid_ : admin
         * application_username_ : 超级管理员
         * todoname_ : 第二个流程
         * arrivetime_ : 2017-11-11 20:35:30
         * workitem_ins_id_ : f6042aa64e23441dbfe50d42f7977b75
         * businessid_ : 8a2e48d05fa93976015fab131a31251a
         */

        private String todo_type_;
        private String todo_type_name_;
        private String type_;
        private String corp_name;
        private String title_;
        private String application_userid_;
        private String application_username_;
        private String todoname_;
        private String arrivetime_;
        private String workitem_ins_id_;
        private String businessid_;

        public String getTodo_type_() {
            return todo_type_;
        }

        public void setTodo_type_(String todo_type_) {
            this.todo_type_ = todo_type_;
        }

        public String getTodo_type_name_() {
            return todo_type_name_;
        }

        public void setTodo_type_name_(String todo_type_name_) {
            this.todo_type_name_ = todo_type_name_;
        }

        public String getType_() {
            return type_;
        }

        public void setType_(String type_) {
            this.type_ = type_;
        }

        public String getCorp_name() {
            return corp_name;
        }

        public void setCorp_name(String corp_name) {
            this.corp_name = corp_name;
        }

        public String getTitle_() {
            return title_;
        }

        public void setTitle_(String title_) {
            this.title_ = title_;
        }

        public String getApplication_userid_() {
            return application_userid_;
        }

        public void setApplication_userid_(String application_userid_) {
            this.application_userid_ = application_userid_;
        }

        public String getApplication_username_() {
            return application_username_;
        }

        public void setApplication_username_(String application_username_) {
            this.application_username_ = application_username_;
        }

        public String getTodoname_() {
            return todoname_;
        }

        public void setTodoname_(String todoname_) {
            this.todoname_ = todoname_;
        }

        public String getArrivetime_() {
            return arrivetime_;
        }

        public void setArrivetime_(String arrivetime_) {
            this.arrivetime_ = arrivetime_;
        }

        public String getWorkitem_ins_id_() {
            return workitem_ins_id_;
        }

        public void setWorkitem_ins_id_(String workitem_ins_id_) {
            this.workitem_ins_id_ = workitem_ins_id_;
        }

        public String getBusinessid_() {
            return businessid_;
        }

        public void setBusinessid_(String businessid_) {
            this.businessid_ = businessid_;
        }
    }
}
