package com.huaxin.yunnan.environment.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by longzeqiu on 2017/11/30.
 */

public class MessageLogBean implements Serializable{


    /**
     * data : {"pageInfo":{"pageNum":1,"pageSize":100000,"totalRowNum":7},"queryData":[{"title":"你现在有一个标题为+a+的待办事项要处理","content_id":"韩春明","vc_status":"1","read_status":"0","type_id":"402880ea600cacbc01600cad97df0049","dt_create_time":{"date":30,"day":4,"hours":19,"minutes":28,"month":10,"nanos":0,"seconds":12,"time":1512041292000,"timezoneOffset":-480,"year":117},"next_type_id":"5fea06e56a2049c083536c0f49bbe3cd","name":"待办事项","rownum_":1},{"title":"你现在有一个标题为+a+的待办事项要处理","content_id":"求泷泽","vc_status":"1","read_status":"0","type_id":"40288195600c436e01600c5182db0202","dt_create_time":{"date":30,"day":4,"hours":17,"minutes":46,"month":10,"nanos":0,"seconds":36,"time":1512035196000,"timezoneOffset":-480,"year":117},"next_type_id":"77d35f9d584d4493b7d02b02d3c5b4a7","name":"待办事项","rownum_":2},{"title":"你现在有一个标题为+a+的待办事项要处理","content_id":"大象","vc_status":"1","read_status":"0","type_id":"40288195600c436e01600c464e3400ae","dt_create_time":{"date":30,"day":4,"hours":17,"minutes":34,"month":10,"nanos":0,"seconds":3,"time":1512034443000,"timezoneOffset":-480,"year":117},"next_type_id":"68c6154d5afd4c828863fb64b9fad4f8","name":"待办事项","rownum_":3},{"title":"你现在有一个标题为+a+的待办事项要处理","content_id":"老虎3","vc_status":"3","read_status":"0","type_id":"402880ea600b29c801600b2dd71b00d9","dt_create_time":{"date":30,"day":4,"hours":12,"minutes":27,"month":10,"nanos":0,"seconds":43,"time":1512016063000,"timezoneOffset":-480,"year":117},"next_type_id":null,"name":"待办事项","rownum_":4},{"title":"你现在有一个标题为+a+的待办事项要处理","content_id":"老虎2","vc_status":"1","read_status":"0","type_id":"402880ea600b29c801600b2d4cca0094","dt_create_time":{"date":30,"day":4,"hours":12,"minutes":27,"month":10,"nanos":0,"seconds":3,"time":1512016023000,"timezoneOffset":-480,"year":117},"next_type_id":null,"name":"待办事项","rownum_":5},{"title":"你现在有一个标题为+a+的待办事项要处理","content_id":"对对队","vc_status":"1","read_status":"0","type_id":"402880ea600afb4f01600b07e48900fb","dt_create_time":{"date":30,"day":4,"hours":11,"minutes":46,"month":10,"nanos":0,"seconds":44,"time":1512013604000,"timezoneOffset":-480,"year":117},"next_type_id":null,"name":"待办事项","rownum_":6},{"title":"你现在有一个标题为+a+的待办事项要处理","content_id":"行不行","vc_status":"1","read_status":"0","type_id":"402880ea600af23201600af2d7b10049","dt_create_time":{"date":30,"day":4,"hours":11,"minutes":26,"month":10,"nanos":0,"seconds":41,"time":1512012401000,"timezoneOffset":-480,"year":117},"next_type_id":null,"name":"待办事项","rownum_":7}]}
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

    public static class DataBean implements Serializable{
        /**
         * pageInfo : {"pageNum":1,"pageSize":100000,"totalRowNum":7}
         * queryData : [{"title":"你现在有一个标题为+a+的待办事项要处理","content_id":"韩春明","vc_status":"1","read_status":"0","type_id":"402880ea600cacbc01600cad97df0049","dt_create_time":{"date":30,"day":4,"hours":19,"minutes":28,"month":10,"nanos":0,"seconds":12,"time":1512041292000,"timezoneOffset":-480,"year":117},"next_type_id":"5fea06e56a2049c083536c0f49bbe3cd","name":"待办事项","rownum_":1},{"title":"你现在有一个标题为+a+的待办事项要处理","content_id":"求泷泽","vc_status":"1","read_status":"0","type_id":"40288195600c436e01600c5182db0202","dt_create_time":{"date":30,"day":4,"hours":17,"minutes":46,"month":10,"nanos":0,"seconds":36,"time":1512035196000,"timezoneOffset":-480,"year":117},"next_type_id":"77d35f9d584d4493b7d02b02d3c5b4a7","name":"待办事项","rownum_":2},{"title":"你现在有一个标题为+a+的待办事项要处理","content_id":"大象","vc_status":"1","read_status":"0","type_id":"40288195600c436e01600c464e3400ae","dt_create_time":{"date":30,"day":4,"hours":17,"minutes":34,"month":10,"nanos":0,"seconds":3,"time":1512034443000,"timezoneOffset":-480,"year":117},"next_type_id":"68c6154d5afd4c828863fb64b9fad4f8","name":"待办事项","rownum_":3},{"title":"你现在有一个标题为+a+的待办事项要处理","content_id":"老虎3","vc_status":"3","read_status":"0","type_id":"402880ea600b29c801600b2dd71b00d9","dt_create_time":{"date":30,"day":4,"hours":12,"minutes":27,"month":10,"nanos":0,"seconds":43,"time":1512016063000,"timezoneOffset":-480,"year":117},"next_type_id":null,"name":"待办事项","rownum_":4},{"title":"你现在有一个标题为+a+的待办事项要处理","content_id":"老虎2","vc_status":"1","read_status":"0","type_id":"402880ea600b29c801600b2d4cca0094","dt_create_time":{"date":30,"day":4,"hours":12,"minutes":27,"month":10,"nanos":0,"seconds":3,"time":1512016023000,"timezoneOffset":-480,"year":117},"next_type_id":null,"name":"待办事项","rownum_":5},{"title":"你现在有一个标题为+a+的待办事项要处理","content_id":"对对队","vc_status":"1","read_status":"0","type_id":"402880ea600afb4f01600b07e48900fb","dt_create_time":{"date":30,"day":4,"hours":11,"minutes":46,"month":10,"nanos":0,"seconds":44,"time":1512013604000,"timezoneOffset":-480,"year":117},"next_type_id":null,"name":"待办事项","rownum_":6},{"title":"你现在有一个标题为+a+的待办事项要处理","content_id":"行不行","vc_status":"1","read_status":"0","type_id":"402880ea600af23201600af2d7b10049","dt_create_time":{"date":30,"day":4,"hours":11,"minutes":26,"month":10,"nanos":0,"seconds":41,"time":1512012401000,"timezoneOffset":-480,"year":117},"next_type_id":null,"name":"待办事项","rownum_":7}]
         */

        private PageInfoBean pageInfo;
        private List<QueryDataBean> queryData;

        public PageInfoBean getPageInfo() {
            return pageInfo;
        }

        public void setPageInfo(PageInfoBean pageInfo) {
            this.pageInfo = pageInfo;
        }

        public List<QueryDataBean> getQueryData() {
            return queryData;
        }

        public void setQueryData(List<QueryDataBean> queryData) {
            this.queryData = queryData;
        }

        public static class PageInfoBean {
            /**
             * pageNum : 1
             * pageSize : 100000
             * totalRowNum : 7
             */

            private int pageNum;
            private int pageSize;
            private int totalRowNum;

            public int getPageNum() {
                return pageNum;
            }

            public void setPageNum(int pageNum) {
                this.pageNum = pageNum;
            }

            public int getPageSize() {
                return pageSize;
            }

            public void setPageSize(int pageSize) {
                this.pageSize = pageSize;
            }

            public int getTotalRowNum() {
                return totalRowNum;
            }

            public void setTotalRowNum(int totalRowNum) {
                this.totalRowNum = totalRowNum;
            }
        }

        public static class QueryDataBean implements Serializable{
            @Override
            public String toString() {
                return "QueryDataBean{" +
                        "to_person='" + to_person + '\'' +
                        ", t_main_news_id='" + t_main_news_id + '\'' +
                        ", activity_ins_id='" + activity_ins_id + '\'' +
                        ", title='" + title + '\'' +
                        ", content_id='" + content_id + '\'' +
                        ", vc_status='" + vc_status + '\'' +
                        ", read_status='" + read_status + '\'' +
                        ", type_id='" + type_id + '\'' +
                        ", dt_create_time=" + dt_create_time +
                        ", next_type_id='" + next_type_id + '\'' +
                        ", name='" + name + '\'' +
                        ", rownum_=" + rownum_ +
                        '}';
            }

            /**
             * title : 你现在有一个标题为+a+的待办事项要处理
             * content_id : 韩春明
             * vc_status : 1
             * read_status : 0
             * type_id : 402880ea600cacbc01600cad97df0049
             * dt_create_time : {"date":30,"day":4,"hours":19,"minutes":28,"month":10,"nanos":0,"seconds":12,"time":1512041292000,"timezoneOffset":-480,"year":117}
             * next_type_id : 5fea06e56a2049c083536c0f49bbe3cd
             * name : 待办事项
             * rownum_ : 1
             */
            private String to_person;

            public String getTo_person() {
                return to_person;
            }

            public void setTo_person(String to_person) {
                this.to_person = to_person;
            }

            //"t_main_news_id": "402880EA601243F201601248CF020127",
            private String t_main_news_id;
            public  String getT_main_news_id() {
                return t_main_news_id;
            }public void   setT_main_news_id(String t_main_news_id) {
                this.t_main_news_id = t_main_news_id;
            }
            private String activity_ins_id;

            public String getActivity_ins_id() {
                return activity_ins_id;
            }

            public void setActivity_ins_id(String activity_ins_id) {
                this.activity_ins_id = activity_ins_id;
            }

            private String title;
            private String content_id;
            private String vc_status;
            private String read_status;
            private String type_id;
            private DtCreateTimeBean dt_create_time;
            private String next_type_id;
            private String name;
            private int rownum_;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getContent_id() {
                return content_id;
            }

            public void setContent_id(String content_id) {
                this.content_id = content_id;
            }

            public String getVc_status() {
                return vc_status;
            }

            public void setVc_status(String vc_status) {
                this.vc_status = vc_status;
            }

            public String getRead_status() {
                return read_status;
            }

            public void setRead_status(String read_status) {
                this.read_status = read_status;
            }

            public String getType_id() {
                return type_id;
            }

            public void setType_id(String type_id) {
                this.type_id = type_id;
            }

            public DtCreateTimeBean getDt_create_time() {
                return dt_create_time;
            }

            public void setDt_create_time(DtCreateTimeBean dt_create_time) {
                this.dt_create_time = dt_create_time;
            }

            public String getNext_type_id() {
                return next_type_id;
            }

            public void setNext_type_id(String next_type_id) {
                this.next_type_id = next_type_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getRownum_() {
                return rownum_;
            }

            public void setRownum_(int rownum_) {
                this.rownum_ = rownum_;
            }

            public static class DtCreateTimeBean implements Serializable{
                /**
                 * date : 30
                 * day : 4
                 * hours : 19
                 * minutes : 28
                 * month : 10
                 * nanos : 0
                 * seconds : 12
                 * time : 1512041292000
                 * timezoneOffset : -480
                 * year : 117
                 */

                private int date;
                private int day;
                private int hours;
                private int minutes;
                private int month;
                private int nanos;
                private int seconds;
                private long time;
                private int timezoneOffset;
                private int year;

                public int getDate() {
                    return date;
                }

                public void setDate(int date) {
                    this.date = date;
                }

                public int getDay() {
                    return day;
                }

                public void setDay(int day) {
                    this.day = day;
                }

                public int getHours() {
                    return hours;
                }

                public void setHours(int hours) {
                    this.hours = hours;
                }

                public int getMinutes() {
                    return minutes;
                }

                public void setMinutes(int minutes) {
                    this.minutes = minutes;
                }

                public int getMonth() {
                    return month;
                }

                public void setMonth(int month) {
                    this.month = month;
                }

                public int getNanos() {
                    return nanos;
                }

                public void setNanos(int nanos) {
                    this.nanos = nanos;
                }

                public int getSeconds() {
                    return seconds;
                }

                public void setSeconds(int seconds) {
                    this.seconds = seconds;
                }

                public long getTime() {
                    return time;
                }

                public void setTime(long time) {
                    this.time = time;
                }

                public int getTimezoneOffset() {
                    return timezoneOffset;
                }

                public void setTimezoneOffset(int timezoneOffset) {
                    this.timezoneOffset = timezoneOffset;
                }

                public int getYear() {
                    return year;
                }

                public void setYear(int year) {
                    this.year = year;
                }
            }
        }
    }
}
