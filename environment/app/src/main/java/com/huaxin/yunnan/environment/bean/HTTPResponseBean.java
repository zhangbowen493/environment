package com.huaxin.yunnan.environment.bean;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.huaxin.yunnan.environment.Utils.LogUtils;

import java.lang.reflect.Type;

/**
 * 网络请求返回类
 * Created by zbw on 2017/1/12.
 */

public class HTTPResponseBean {
//    {"retCode":"fail","retMsg":"请求参数有误","retSign":""}

    /** 请求状态 */
    @SerializedName("success")
    public String success;
    /** 返回信息 */
    @SerializedName("msg")
    public String msg;
    /** 请求返回的数据 */
    @SerializedName("data")
    public Object data;
    /** token信息 */
    @SerializedName("userToken")
    public String userToken;

    /**
     * 获取返回结果实体类
     * @param mClass
     * @return
     */
    public Object getPesponseBean( Class mClass ){
        LogUtils.e("getPesponseBean=====", data.toString());
        Gson g = new GsonBuilder().serializeNulls().create();

       return g.fromJson(data.toString(),mClass);
    }
/**
     * 获取返回结果实体类(解list使用)
     * @param type
     * @return
     */
    public Object getPesponseBean(Type type){
        LogUtils.e("getPesponseBean=====", data.toString());
        Gson g = new GsonBuilder().serializeNulls().create();
       return g.fromJson(data.toString(),type);
    }

}
