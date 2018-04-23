package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/10/31.
 */

public class DeparterBean {

    /**
     * data : [{"id":"eb3ffb7d74014883bdc96b2aed0cf53b","name":"鲜思才","telephone":"17787117193","mobile":null,"ouinfoname":"办公室","jobtitle_id":"副调研员","rownum_":1},{"id":"9ae22e0ec668434da2fd11ccfb0a3886","name":"徐园园","telephone":"17787116305","mobile":null,"ouinfoname":"办公室","jobtitle_id":null,"rownum_":2},{"id":"34f85aa2fd644bc39349e2dc8a6a347a","name":"甘毅","telephone":"18082762771","mobile":null,"ouinfoname":"办公室","jobtitle_id":null,"rownum_":3},{"id":"b240104760664abea3418e5b5ed3648f","name":"李越","telephone":"18082762973","mobile":null,"ouinfoname":"办公室","jobtitle_id":"办公室副主任","rownum_":4},{"id":"57f81b139be145b08cf52dbdfc8296b1","name":"易南","telephone":"18082763575","mobile":null,"ouinfoname":"办公室","jobtitle_id":null,"rownum_":5},{"id":"ab1ed2943d5c40d382ffc7b2f3b876e8","name":"杨志春","telephone":"18082763586","mobile":null,"ouinfoname":"办公室","jobtitle_id":null,"rownum_":6},{"id":"d37b4280c8ea411da12d9b0cc2a2bd09","name":"屈真荣","telephone":"18082763625","mobile":null,"ouinfoname":"办公室","jobtitle_id":null,"rownum_":7}]
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
         * id : eb3ffb7d74014883bdc96b2aed0cf53b
         * name : 鲜思才
         * telephone : 17787117193
         * mobile : null
         * ouinfoname : 办公室
         * jobtitle_id : 副调研员
         * rownum_ : 1
         */

        private String id;
        private String name;
        private String telephone;
        private Object mobile;
        private String ouinfoname;
        private String jobtitle_id;
        private int rownum_;

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

        public String getTelephone() {
            return telephone;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        public Object getMobile() {
            return mobile;
        }

        public void setMobile(Object mobile) {
            this.mobile = mobile;
        }

        public String getOuinfoname() {
            return ouinfoname;
        }

        public void setOuinfoname(String ouinfoname) {
            this.ouinfoname = ouinfoname;
        }

        public String getJobtitle_id() {
            return jobtitle_id;
        }

        public void setJobtitle_id(String jobtitle_id) {
            this.jobtitle_id = jobtitle_id;
        }

        public int getRownum_() {
            return rownum_;
        }

        public void setRownum_(int rownum_) {
            this.rownum_ = rownum_;
        }
    }
}
