package com.huaxin.yunnan.environment.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2017/10/29.
 */

public class EssentialInformaBean {

    /**
     * data : {"pageInfo":{"pageNum":1,"pageSize":20,"totalRowNum":1},"queryData":[{"uuid":"402880495f04f3a1015f05815f49019c","wrybh":"622898222","wrymc":"大理怡祥纸业有限公司","cymc":"大理怡祥纸业有限公司","wryjc":"大理怡祥纸业有限公司","zzjgdn":"622898222","yyzzdm":"622898222","sssf":"44","ssds":"4402","ssqx":"440233","ssjd":"440233103","qfgwgdm":"1","gxgs":"1","ztz":95600000,"hbtz":234000,"lsgx":"1","jjlx":"1","hydm":"4","qygm":"2","dwlx":"3","frdb":"朱建平","lxdh":"1563453234","czhm":"0872-8882805","dwdz":"云南省大理白族自治州大理市创新工业园区4号路北侧","yzbm":"563464","hblxr":"朱建平","hbrlxdh":"1563434344","hblxrlxdz":"云南省大理白族自治州大理市创新工业园区4号路北侧","wzh":"www.ljs.com","dzyx":"123@qq.com","jdd":12,"jdf":23,"jdm":12,"wdd":23,"wdf":33,"wdm":23,"zzdmj":4530,"szgyymc":"创新工业园区","kysj":{"date":11,"day":3,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1507651200000,"timezoneOffset":-480,"year":117},"tysj":{"date":11,"day":3,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1507651200000,"timezoneOffset":-480,"year":117},"zhgkjsj":{"date":20,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1508428800000,"timezoneOffset":-480,"year":117},"pwsbdm":"62","pwxkzbh":"622","wryjs":"阿斯蒂芬","sczt":"正常","sfqxgl":"1","qxsj":{"date":12,"day":4,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1507737600000,"timezoneOffset":-480,"year":117},"qxyy":"阿斯蒂芬","bz":"阿斯蒂芬啊","xxdz":"创新工业园区4号路北侧","status":"1","geotype":null,"geoid":null,"vc_create_user":null,"dt_create_time":null,"vc_create_mechanism":null,"vc_update_user":null,"dt_update_time":null,"vc_update_mechanism":null,"vc_workflow":null,"rownum_":1}]}
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
         * pageInfo : {"pageNum":1,"pageSize":20,"totalRowNum":1}
         * queryData : [{"uuid":"402880495f04f3a1015f05815f49019c","wrybh":"622898222","wrymc":"大理怡祥纸业有限公司","cymc":"大理怡祥纸业有限公司","wryjc":"大理怡祥纸业有限公司","zzjgdn":"622898222","yyzzdm":"622898222","sssf":"44","ssds":"4402","ssqx":"440233","ssjd":"440233103","qfgwgdm":"1","gxgs":"1","ztz":95600000,"hbtz":234000,"lsgx":"1","jjlx":"1","hydm":"4","qygm":"2","dwlx":"3","frdb":"朱建平","lxdh":"1563453234","czhm":"0872-8882805","dwdz":"云南省大理白族自治州大理市创新工业园区4号路北侧","yzbm":"563464","hblxr":"朱建平","hbrlxdh":"1563434344","hblxrlxdz":"云南省大理白族自治州大理市创新工业园区4号路北侧","wzh":"www.ljs.com","dzyx":"123@qq.com","jdd":12,"jdf":23,"jdm":12,"wdd":23,"wdf":33,"wdm":23,"zzdmj":4530,"szgyymc":"创新工业园区","kysj":{"date":11,"day":3,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1507651200000,"timezoneOffset":-480,"year":117},"tysj":{"date":11,"day":3,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1507651200000,"timezoneOffset":-480,"year":117},"zhgkjsj":{"date":20,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1508428800000,"timezoneOffset":-480,"year":117},"pwsbdm":"62","pwxkzbh":"622","wryjs":"阿斯蒂芬","sczt":"正常","sfqxgl":"1","qxsj":{"date":12,"day":4,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1507737600000,"timezoneOffset":-480,"year":117},"qxyy":"阿斯蒂芬","bz":"阿斯蒂芬啊","xxdz":"创新工业园区4号路北侧","status":"1","geotype":null,"geoid":null,"vc_create_user":null,"dt_create_time":null,"vc_create_mechanism":null,"vc_update_user":null,"dt_update_time":null,"vc_update_mechanism":null,"vc_workflow":null,"rownum_":1}]
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
             * pageSize : 20
             * totalRowNum : 1
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

        public static class QueryDataBean {
            /**
             * uuid : 402880495f04f3a1015f05815f49019c
             * wrybh : 622898222
             * wrymc : 大理怡祥纸业有限公司
             * cymc : 大理怡祥纸业有限公司
             * wryjc : 大理怡祥纸业有限公司
             * zzjgdn : 622898222
             * yyzzdm : 622898222
             * sssf : 44
             * ssds : 4402
             * ssqx : 440233
             * ssjd : 440233103
             * qfgwgdm : 1
             * gxgs : 1
             * ztz : 95600000
             * hbtz : 234000
             * lsgx : 1
             * jjlx : 1
             * hydm : 4
             * qygm : 2
             * dwlx : 3
             * frdb : 朱建平
             * lxdh : 1563453234
             * czhm : 0872-8882805
             * dwdz : 云南省大理白族自治州大理市创新工业园区4号路北侧
             * yzbm : 563464
             * hblxr : 朱建平
             * hbrlxdh : 1563434344
             * hblxrlxdz : 云南省大理白族自治州大理市创新工业园区4号路北侧
             * wzh : www.ljs.com
             * dzyx : 123@qq.com
             * jdd : 12
             * jdf : 23
             * jdm : 12
             * wdd : 23
             * wdf : 33
             * wdm : 23
             * zzdmj : 4530
             * szgyymc : 创新工业园区
             * kysj : {"date":11,"day":3,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1507651200000,"timezoneOffset":-480,"year":117}
             * tysj : {"date":11,"day":3,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1507651200000,"timezoneOffset":-480,"year":117}
             * zhgkjsj : {"date":20,"day":5,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1508428800000,"timezoneOffset":-480,"year":117}
             * pwsbdm : 62
             * pwxkzbh : 622
             * wryjs : 阿斯蒂芬
             * sczt : 正常
             * sfqxgl : 1
             * qxsj : {"date":12,"day":4,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1507737600000,"timezoneOffset":-480,"year":117}
             * qxyy : 阿斯蒂芬
             * bz : 阿斯蒂芬啊
             * xxdz : 创新工业园区4号路北侧
             * status : 1
             * geotype : null
             * geoid : null
             * vc_create_user : null
             * dt_create_time : null
             * vc_create_mechanism : null
             * vc_update_user : null
             * dt_update_time : null
             * vc_update_mechanism : null
             * vc_workflow : null
             * rownum_ : 1
             */

            private String uuid;
            private String wrybh;
            private String wrymc;
            private String cymc;
            private String wryjc;
            private String zzjgdn;
            private String yyzzdm;
            private String sssf;
            private String ssds;
            private String ssqx;
            private String ssjd;
            private String qfgwgdm;
            private String gxgs;
            private String ztz;
            private String hbtz;
            private String lsgx;
            private String jjlx;
            private String hydm;
            private String qygm;
            private String dwlx;
            private String frdb;
            private String lxdh;
            private String czhm;
            private String dwdz;
            private String yzbm;
            private String hblxr;
            private String hbrlxdh;
            private String hblxrlxdz;
            private String wzh;
            private String dzyx;
            private String jdd;
            private String jdf;
            private String jdm;
            private String wdd;
            private String wdf;
            private String wdm;
            private String zzdmj;
            private String szgyymc;
            private String kysj;
            private String tysj;
            private String zhgkjsj;
            private String pwsbdm;
            private String pwxkzbh;
            private String wryjs;
            private String sczt;
            private String sfqxgl;
            private String qxsj;
            private String qxyy;
            private String bz;
            private String xxdz;
            private String status;
            private Object geotype;
            private Object geoid;
            private Object vc_create_user;
            private Object dt_create_time;
            private Object vc_create_mechanism;
            private Object vc_update_user;
            private Object dt_update_time;
            private Object vc_update_mechanism;
            private Object vc_workflow;
            private int rownum_;

            public String getKysj() {
                return kysj;
            }

            public void setKysj(String kysj) {
                this.kysj = kysj;
            }

            public String getTysj() {
                return tysj;
            }

            public void setTysj(String tysj) {
                this.tysj = tysj;
            }

            public String getZhgkjsj() {
                return zhgkjsj;
            }

            public void setZhgkjsj(String zhgkjsj) {
                this.zhgkjsj = zhgkjsj;
            }

            public String getQxsj() {
                return qxsj;
            }

            public void setQxsj(String qxsj) {
                this.qxsj = qxsj;
            }

            public String getUuid() {
                return uuid;
            }

            public void setUuid(String uuid) {
                this.uuid = uuid;
            }

            public String getWrybh() {
                return wrybh;
            }

            public void setWrybh(String wrybh) {
                this.wrybh = wrybh;
            }

            public String getWrymc() {
                return wrymc;
            }

            public void setWrymc(String wrymc) {
                this.wrymc = wrymc;
            }

            public String getCymc() {
                return cymc;
            }

            public void setCymc(String cymc) {
                this.cymc = cymc;
            }

            public String getWryjc() {
                return wryjc;
            }

            public void setWryjc(String wryjc) {
                this.wryjc = wryjc;
            }

            public String getZzjgdn() {
                return zzjgdn;
            }

            public void setZzjgdn(String zzjgdn) {
                this.zzjgdn = zzjgdn;
            }

            public String getYyzzdm() {
                return yyzzdm;
            }

            public void setYyzzdm(String yyzzdm) {
                this.yyzzdm = yyzzdm;
            }

            public String getSssf() {
                return sssf;
            }

            public void setSssf(String sssf) {
                this.sssf = sssf;
            }

            public String getSsds() {
                return ssds;
            }

            public void setSsds(String ssds) {
                this.ssds = ssds;
            }

            public String getSsqx() {
                return ssqx;
            }

            public void setSsqx(String ssqx) {
                this.ssqx = ssqx;
            }

            public String getSsjd() {
                return ssjd;
            }

            public void setSsjd(String ssjd) {
                this.ssjd = ssjd;
            }

            public String getQfgwgdm() {
                return qfgwgdm;
            }

            public void setQfgwgdm(String qfgwgdm) {
                this.qfgwgdm = qfgwgdm;
            }

            public String getGxgs() {
                return gxgs;
            }

            public void setGxgs(String gxgs) {
                this.gxgs = gxgs;
            }

            public String getZtz() {
                return ztz;
            }

            public void setZtz(String ztz) {
                this.ztz = ztz;
            }

            public String getHbtz() {
                return hbtz;
            }

            public void setHbtz(String hbtz) {
                this.hbtz = hbtz;
            }

            public String getLsgx() {
                return lsgx;
            }

            public void setLsgx(String lsgx) {
                this.lsgx = lsgx;
            }

            public String getJjlx() {
                return jjlx;
            }

            public void setJjlx(String jjlx) {
                this.jjlx = jjlx;
            }

            public String getHydm() {
                return hydm;
            }

            public void setHydm(String hydm) {
                this.hydm = hydm;
            }

            public String getQygm() {
                return qygm;
            }

            public void setQygm(String qygm) {
                this.qygm = qygm;
            }

            public String getDwlx() {
                return dwlx;
            }

            public void setDwlx(String dwlx) {
                this.dwlx = dwlx;
            }

            public String getFrdb() {
                return frdb;
            }

            public void setFrdb(String frdb) {
                this.frdb = frdb;
            }

            public String getLxdh() {
                return lxdh;
            }

            public void setLxdh(String lxdh) {
                this.lxdh = lxdh;
            }

            public String getCzhm() {
                return czhm;
            }

            public void setCzhm(String czhm) {
                this.czhm = czhm;
            }

            public String getDwdz() {
                return dwdz;
            }

            public void setDwdz(String dwdz) {
                this.dwdz = dwdz;
            }

            public String getYzbm() {
                return yzbm;
            }

            public void setYzbm(String yzbm) {
                this.yzbm = yzbm;
            }

            public String getHblxr() {
                return hblxr;
            }

            public void setHblxr(String hblxr) {
                this.hblxr = hblxr;
            }

            public String getHbrlxdh() {
                return hbrlxdh;
            }

            public void setHbrlxdh(String hbrlxdh) {
                this.hbrlxdh = hbrlxdh;
            }

            public String getHblxrlxdz() {
                return hblxrlxdz;
            }

            public void setHblxrlxdz(String hblxrlxdz) {
                this.hblxrlxdz = hblxrlxdz;
            }

            public String getWzh() {
                return wzh;
            }

            public void setWzh(String wzh) {
                this.wzh = wzh;
            }

            public String getDzyx() {
                return dzyx;
            }

            public void setDzyx(String dzyx) {
                this.dzyx = dzyx;
            }

            public String getJdd() {
                return jdd;
            }

            public void setJdd(String jdd) {
                this.jdd = jdd;
            }

            public String getJdf() {
                return jdf;
            }

            public void setJdf(String jdf) {
                this.jdf = jdf;
            }

            public String getJdm() {
                return jdm;
            }

            public void setJdm(String jdm) {
                this.jdm = jdm;
            }

            public String getWdd() {
                return wdd;
            }

            public void setWdd(String wdd) {
                this.wdd = wdd;
            }

            public String getWdf() {
                return wdf;
            }

            public void setWdf(String wdf) {
                this.wdf = wdf;
            }

            public String getWdm() {
                return wdm;
            }

            public void setWdm(String wdm) {
                this.wdm = wdm;
            }

            public String getZzdmj() {
                return zzdmj;
            }

            public void setZzdmj(String zzdmj) {
                this.zzdmj = zzdmj;
            }

            public String getSzgyymc() {
                return szgyymc;
            }

            public void setSzgyymc(String szgyymc) {
                this.szgyymc = szgyymc;
            }

//            public KysjBean getKysj() {
//                return kysj;
//            }
//
//            public void setKysj(KysjBean kysj) {
//                this.kysj = kysj;
//            }
//
//            public TysjBean getTysj() {
//                return tysj;
//            }
//
//            public void setTysj(TysjBean tysj) {
//                this.tysj = tysj;
//            }
//
//            public ZhgkjsjBean getZhgkjsj() {
//                return zhgkjsj;
//            }
//
//            public void setZhgkjsj(ZhgkjsjBean zhgkjsj) {
//                this.zhgkjsj = zhgkjsj;
//            }

            public String getPwsbdm() {
                return pwsbdm;
            }

            public void setPwsbdm(String pwsbdm) {
                this.pwsbdm = pwsbdm;
            }

            public String getPwxkzbh() {
                return pwxkzbh;
            }

            public void setPwxkzbh(String pwxkzbh) {
                this.pwxkzbh = pwxkzbh;
            }

            public String getWryjs() {
                return wryjs;
            }

            public void setWryjs(String wryjs) {
                this.wryjs = wryjs;
            }

            public String getSczt() {
                return sczt;
            }

            public void setSczt(String sczt) {
                this.sczt = sczt;
            }

            public String getSfqxgl() {
                return sfqxgl;
            }

            public void setSfqxgl(String sfqxgl) {
                this.sfqxgl = sfqxgl;
            }

//            public QxsjBean getQxsj() {
//                return qxsj;
//            }
//
//            public void setQxsj(QxsjBean qxsj) {
//                this.qxsj = qxsj;
//            }

            public String getQxyy() {
                return qxyy;
            }

            public void setQxyy(String qxyy) {
                this.qxyy = qxyy;
            }

            public String getBz() {
                return bz;
            }

            public void setBz(String bz) {
                this.bz = bz;
            }

            public String getXxdz() {
                return xxdz;
            }

            public void setXxdz(String xxdz) {
                this.xxdz = xxdz;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public Object getGeotype() {
                return geotype;
            }

            public void setGeotype(Object geotype) {
                this.geotype = geotype;
            }

            public Object getGeoid() {
                return geoid;
            }

            public void setGeoid(Object geoid) {
                this.geoid = geoid;
            }

            public Object getVc_create_user() {
                return vc_create_user;
            }

            public void setVc_create_user(Object vc_create_user) {
                this.vc_create_user = vc_create_user;
            }

            public Object getDt_create_time() {
                return dt_create_time;
            }

            public void setDt_create_time(Object dt_create_time) {
                this.dt_create_time = dt_create_time;
            }

            public Object getVc_create_mechanism() {
                return vc_create_mechanism;
            }

            public void setVc_create_mechanism(Object vc_create_mechanism) {
                this.vc_create_mechanism = vc_create_mechanism;
            }

            public Object getVc_update_user() {
                return vc_update_user;
            }

            public void setVc_update_user(Object vc_update_user) {
                this.vc_update_user = vc_update_user;
            }

            public Object getDt_update_time() {
                return dt_update_time;
            }

            public void setDt_update_time(Object dt_update_time) {
                this.dt_update_time = dt_update_time;
            }

            public Object getVc_update_mechanism() {
                return vc_update_mechanism;
            }

            public void setVc_update_mechanism(Object vc_update_mechanism) {
                this.vc_update_mechanism = vc_update_mechanism;
            }

            public Object getVc_workflow() {
                return vc_workflow;
            }

            public void setVc_workflow(Object vc_workflow) {
                this.vc_workflow = vc_workflow;
            }

            public int getRownum_() {
                return rownum_;
            }

            public void setRownum_(int rownum_) {
                this.rownum_ = rownum_;
            }

            public static class KysjBean {
                /**
                 * date : 11
                 * day : 3
                 * hours : 0
                 * minutes : 0
                 * month : 9
                 * nanos : 0
                 * seconds : 0
                 * time : 1507651200000
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
                @Override
                public String toString() {
                    return
                            (year+1900) + "." + (month+1) + "." + date
                            ;
                }
            }

            public static class TysjBean {
                /**
                 * date : 11
                 * day : 3
                 * hours : 0
                 * minutes : 0
                 * month : 9
                 * nanos : 0
                 * seconds : 0
                 * time : 1507651200000
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
                @Override
                public String toString() {
                    return
                            (year+1900) + "." + (month+1) + "." + date
                            ;
                }
            }

            public static class ZhgkjsjBean {
                /**
                 * date : 20
                 * day : 5
                 * hours : 0
                 * minutes : 0
                 * month : 9
                 * nanos : 0
                 * seconds : 0
                 * time : 1508428800000
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
                @Override
                public String toString() {
                    return
                            (year+1900) + "." + (month+1) + "." + date
                            ;
                }
            }

            public static class QxsjBean {
                /**
                 * date : 12
                 * day : 4
                 * hours : 0
                 * minutes : 0
                 * month : 9
                 * nanos : 0
                 * seconds : 0
                 * time : 1507737600000
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

                @Override
                public String toString() {
                    return
                            (year+1900) + "." + (month+1) + "." + date
                            ;
                }
            }
        }
    }
}
