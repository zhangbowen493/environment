package com.huaxin.yunnan.environment.bean;

/**
 * Created by longzeqiu on 2017/11/9.
 */

public class BaseBean {
    private String msg;
    private String success;
    private String workItemInsId;

    public String getWorkItemInsId() {
        return workItemInsId;
    }

    public void setWorkItemInsId(String workItemInsId) {
        this.workItemInsId = workItemInsId;
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
}
