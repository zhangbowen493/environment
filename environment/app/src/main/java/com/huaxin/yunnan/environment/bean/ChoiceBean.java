package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/11/13.
 */

public class ChoiceBean {

    /**
     * data : {"activityId":"269d4af961d341f18b34190a346c0d0e","nextActList":[{"actId":"ba1c9932c05d4f0fbeaaff13d40de9e7","assignRule":0,"actName":"结束活动","actType":4}],"processId":"6b2b766bcde1474a9de2a748ddade399","processVer":"1","activityInsId":"054ba22350b847bba4666019901a526e","procInstanceId":"b2bd26afcc8f43988463801d250c2218"}
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
         * activityId : 269d4af961d341f18b34190a346c0d0e
         * nextActList : [{"actId":"ba1c9932c05d4f0fbeaaff13d40de9e7","assignRule":0,"actName":"结束活动","actType":4}]
         * processId : 6b2b766bcde1474a9de2a748ddade399
         * processVer : 1
         * activityInsId : 054ba22350b847bba4666019901a526e
         * procInstanceId : b2bd26afcc8f43988463801d250c2218
         */

        private String activityId;
        private String processId;
        private String processVer;
        private String activityInsId;
        private String procInstanceId;
        private List<NextActListBean> nextActList;

        public String getActivityId() {
            return activityId;
        }

        public void setActivityId(String activityId) {
            this.activityId = activityId;
        }

        public String getProcessId() {
            return processId;
        }

        public void setProcessId(String processId) {
            this.processId = processId;
        }

        public String getProcessVer() {
            return processVer;
        }

        public void setProcessVer(String processVer) {
            this.processVer = processVer;
        }

        public String getActivityInsId() {
            return activityInsId;
        }

        public void setActivityInsId(String activityInsId) {
            this.activityInsId = activityInsId;
        }

        public String getProcInstanceId() {
            return procInstanceId;
        }

        public void setProcInstanceId(String procInstanceId) {
            this.procInstanceId = procInstanceId;
        }

        public List<NextActListBean> getNextActList() {
            return nextActList;
        }

        public void setNextActList(List<NextActListBean> nextActList) {
            this.nextActList = nextActList;
        }

        public static class NextActListBean {
            /**
             * actId : ba1c9932c05d4f0fbeaaff13d40de9e7
             * assignRule : 0
             * actName : 结束活动
             * actType : 4
             */

            private String actId;
            private String assignRule;
            private String actName;
            private String actType;

            public String getActId() {
                return actId;
            }

            public void setActId(String actId) {
                this.actId = actId;
            }

            public String getAssignRule() {
                return assignRule;
            }

            public void setAssignRule(String assignRule) {
                this.assignRule = assignRule;
            }

            public String getActName() {
                return actName;
            }

            public void setActName(String actName) {
                this.actName = actName;
            }

            public String getActType() {
                return actType;
            }

            public void setActType(String actType) {
                this.actType = actType;
            }
        }
    }
}
