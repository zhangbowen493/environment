package com.huaxin.yunnan.environment.net;


import android.app.Dialog;
import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huaxin.yunnan.environment.MyApplication;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.bean.BaseBean;
import com.huaxin.yunnan.environment.bean.ChoiceBean;
import com.huaxin.yunnan.environment.bean.CollectEvidenceBean;
import com.huaxin.yunnan.environment.bean.DeparterBean;
import com.huaxin.yunnan.environment.bean.LiveStockFarmBean;
import com.huaxin.yunnan.environment.bean.LoginResultBean;
import com.huaxin.yunnan.environment.bean.MailListBean;
import com.huaxin.yunnan.environment.bean.MessageLogBean;
import com.huaxin.yunnan.environment.bean.MetalBeneficationBean;
import com.huaxin.yunnan.environment.bean.PendAuditBean;
import com.huaxin.yunnan.environment.bean.PollutionSourceBean;
import com.huaxin.yunnan.environment.bean.RecordBean;
import com.huaxin.yunnan.environment.bean.RejectEditBean;
import com.huaxin.yunnan.environment.bean.ReviewHistoryBean;
import com.huaxin.yunnan.environment.bean.SelectManagerBean;
import com.huaxin.yunnan.environment.bean.SelectProcessBean;
import com.huaxin.yunnan.environment.bean.TaskNameBean;
import com.huaxin.yunnan.environment.bean.ToDoListBean;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.http.okhttp.request.RequestCall;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import static com.zhy.http.okhttp.OkHttpUtils.post;


public class NetTool {
	private final OkHttpClient okHttpClient;

	private static class SingleHoldr {
		private static final NetTool instance = new NetTool();
	}

	private NetTool() {
		//1.new出client对象
		okHttpClient = new OkHttpClient();
		okHttpClient.connectTimeoutMillis();
	}

	public static NetTool getInstance() {
		return SingleHoldr.instance;
	}

	//get请求
	public <T> Observable<T> rxGetNet(String url, final Class<T> clazz) {
		return Observable.just(url).map(new Function<String, String>() {
			@Override
			public String apply(@NonNull String s) throws Exception {
				Request request = new Request.Builder().url(s).build();
				Response response = okHttpClient.newCall(request).execute();
				String json = response.body().string();
				return json;
			}
		}).map(new Function<String, T>() {
			@Override
			public T apply(@NonNull String s) throws Exception {
				Gson gson = new Gson();
				T bean = gson.fromJson(s, clazz);
				return bean;
			}
		});
	}

	//post请求
	public Observable<String> rxPostNet(String url, final String userid, final String jsondata) {
		return Observable.just(url).map(new Function<String, String>() {

			@Override
			public String apply(@NonNull String s) throws Exception {

				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("userid", userid)
						.add("jsondata", jsondata).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				return response.body().string();
			}
		});
	}

	public Observable<LoginResultBean> rxPostNet1(String url, final String userid, final String jsondata) {
		return Observable.just(url).map(new Function<String, LoginResultBean>() {
			@Override
			public LoginResultBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("usercode", userid).add("passwd", jsondata).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();

				LoginResultBean result = gson.fromJson(response.body().string(), LoginResultBean.class);

				return result;
			}
		});
	}

	/**
	 * 任务详情接口
	 *
	 * @param url
	 * @param userid
	 * @param usertocken
	 * @return
	 */
	public Observable<TaskNameBean> rxPostNet2(String url, final String userid, final String usertocken) {
		return Observable.just(url).map(new Function<String, TaskNameBean>() {
			@Override
			public TaskNameBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("t_task_list_id", userid).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();

				TaskNameBean result = gson.fromJson(response.body().string(), TaskNameBean.class);

				return result;
			}
		});
	}

	/**
	 * 任务模板接口
	 *
	 * @param url
	 * @param userid
	 * @param usertocken
	 * @return
	 */
	public Observable<TaskNameBean> rxPostNet3(String url, final String userid, final String usertocken) {
		return Observable.just(url).map(new Function<String, TaskNameBean>() {
			@Override
			public TaskNameBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("t_task_list_id", userid).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();

				TaskNameBean result = gson.fromJson(response.body().string(), TaskNameBean.class);

				return result;
			}
		});
	}

	/**
	 * 通用接口
	 *
	 * @param url
	 * @param userid
	 * @param usertocken
	 * @return
	 */
	public Observable<RecordBean> rxRecordPostNet(String url, final String userid, final String usertocken) {
		return Observable.just(url).map(new Function<String, RecordBean>() {
			@Override
			public RecordBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("t_detail_id", userid).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();

				RecordBean result = gson.fromJson(response.body().string(), RecordBean.class);

				return result;
			}
		});
	}

	/**
	 * 畜禽养殖现场监察记录
	 *
	 * @param url
	 * @param userid
	 * @param usertocken
	 * @return
	 */
	public Observable<LiveStockFarmBean> rxLiveStockFarmPostNet(String url, final String userid, final String usertocken) {
		return Observable.just(url).map(new Function<String, LiveStockFarmBean>() {
			@Override
			public LiveStockFarmBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("t_detail_id", userid).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();

				LiveStockFarmBean result = gson.fromJson(response.body().string(), LiveStockFarmBean.class);

				return result;
			}
		});
	}

	/**
	 * 金属
	 *
	 * @param url
	 * @param userid
	 * @param usertocken
	 * @return
	 */
	public Observable<MetalBeneficationBean> rxMetalBeneficationPostNet(String url, final String userid, final String usertocken) {
		return Observable.just(url).map(new Function<String, MetalBeneficationBean>() {
			@Override
			public MetalBeneficationBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("t_detail_id", userid).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();

				MetalBeneficationBean result = gson.fromJson(response.body().string(), MetalBeneficationBean.class);

				return result;
			}
		});
	}

	//post请求
	public <T> Observable<String> rxPostNetT(String url, String uesername, final Class<T> clazz) {
		return Observable.just(url).map(new Function<String, String>() {

			@Override
			public String apply(@NonNull String s) throws Exception {

				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("key", String.valueOf(clazz)).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				return response.body().string();
			}
		});
	}

	/**
	 * 执法模板网络请求
	 *
	 * @param mContext
	 * @param t_detail_id
	 * @param url
	 * @param classOfT
	 * @param callBack
	 * @param dialog
	 * @param <T>
	 */
	public static <T> void templatePost(Context mContext, String t_detail_id, String url, final Class<T> classOfT, final CallBack callBack, final Dialog dialog) {
		dialog.show();
		RequestCall mRequestCall = post()
				.url(url)
				.addParams("t_detail_id", t_detail_id)
				.addParams("userToken", SpUtils.getString(mContext, "userToken"))
				.build();

		mRequestCall.execute(new StringCallback() {

			@Override
			public void onError(Call call, Exception e, int id) {
				dialog.dismiss();
				call.cancel();
				LogUtils.e("网络请求失败！" + e.toString());
			}

			@Override
			public void onResponse(String response, int id) {
				dialog.dismiss();
				LogUtils.e("response:" + response);
				Gson g = new GsonBuilder().serializeNulls().create();
				callBack.getResult(g.fromJson(response, classOfT));
			}
		});
	}

	/**
	 * 污染源详情网络请求
	 *
	 * @param mContext
	 * @param wuuid
	 * @param url
	 * @param classOfT
	 * @param callBack
	 * @param dialog
	 * @param <T>
	 */
	public static <T> void PollutionPost(Context mContext, String wuuid, String url, final Class<T> classOfT, final CallBack callBack, final Dialog dialog) {
		dialog.show();
		RequestCall mRequestCall = post()
				.url(url)
				.addParams("wuuid", wuuid)
				.addParams("userToken", SpUtils.getString(mContext, "userToken"))
				.build();

		mRequestCall.execute(new StringCallback() {

			@Override
			public void onError(Call call, Exception e, int id) {
				dialog.dismiss();
				call.cancel();
				LogUtils.e("网络请求失败！" + e.toString());
			}

			@Override
			public void onResponse(String response, int id) {
				dialog.dismiss();
				LogUtils.e("response:" + response);
				Gson g = new GsonBuilder().serializeNulls().create();
				callBack.getResult(g.fromJson(response, classOfT));
			}
		});
	}

	/**
	 * 污染源基本信息请求
	 *
	 * @param mContext
	 * @param wuuid
	 * @param url
	 * @param classOfT
	 * @param callBack
	 * @param dialog
	 * @param <T>
	 */
	public static <T> void PollutionJBPost(Context mContext, String wuuid, String url, final Class<T> classOfT, final CallBack callBack, final Dialog dialog) {
		dialog.show();
		RequestCall mRequestCall = post()
				.url(url)
				.addParams("uuid", wuuid)
				.addParams("userToken", SpUtils.getString(mContext, "userToken"))
				.build();

		mRequestCall.execute(new StringCallback() {

			@Override
			public void onError(Call call, Exception e, int id) {
				dialog.dismiss();
				call.cancel();
				LogUtils.e("网络请求失败！" + e.toString());
			}

			@Override
			public void onResponse(String response, int id) {
				dialog.dismiss();
				LogUtils.e("response:" + response);
				Gson g = new GsonBuilder().serializeNulls().create();
				callBack.getResult(g.fromJson(response, classOfT));
			}
		});
	}

	/**
	 * 污染源信息列表接口
	 *
	 * @param url
	 * @param usertocken
	 * @return
	 */
	public Observable<PollutionSourceBean> rxPollutionSourcePostNet(String url, final String PageNum, final String wrymc, final String usertocken) {
		return Observable.just(url).map(new Function<String, PollutionSourceBean>() {
			@Override
			public PollutionSourceBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("pageNum", PageNum).add("wrymc", wrymc).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();
//				Log.e("NetTool", response.body().string());
				PollutionSourceBean result = gson.fromJson(response.body().string(), PollutionSourceBean.class);

				return result;
			}
		});
	}

	/**
	 * 通讯录部门列表
	 *
	 * @param url
	 * @param usertocken
	 * @return
	 */
	public Observable<MailListBean> rxMaillistPostNet(String url, final String PageNum, final String wrymc, final String ouinfo_name, final String usertocken) {
		return Observable.just(url).map(new Function<String, MailListBean>() {
			@Override
			public MailListBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("pageNum", PageNum).add("ouinfo_name", wrymc).add("ouinfo_id", ouinfo_name).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();

				MailListBean result = gson.fromJson(response.body().string(), MailListBean.class);

				return result;
			}
		});
	}

	/**
	 * 部门成员列表
	 *
	 * @param url
	 * @param usertocken
	 * @return
	 */
	public Observable<DeparterBean> rxDepartPostNet(String url, final String PageNum, final String wrymc, final String ouinfo_name, final String usertocken) {
		return Observable.just(url).map(new Function<String, DeparterBean>() {
			@Override
			public DeparterBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("pageNum", PageNum).add("user_name", wrymc).add("ouinfo_id", ouinfo_name).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();

				DeparterBean result = gson.fromJson(response.body().string(), DeparterBean.class);

				return result;
			}
		});
	}


	/**
	 * 污染源信息列表接口
	 *
	 * @param url
	 * @param usertocken
	 * @return
	 */
	public Observable<PollutionSourceBean> rxPollutionSearchPostNet(String url, final String PageNum, final String usertocken) {
		return Observable.just(url).map(new Function<String, PollutionSourceBean>() {
			@Override
			public PollutionSourceBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("wrymc", PageNum).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();

				PollutionSourceBean result = gson.fromJson(response.body().string(), PollutionSourceBean.class);

				return result;
			}
		});
	}

	/**
	 * 图片列表接口
	 *
	 * @param url
	 * @param usertocken
	 * @return
	 */
	public Observable<CollectEvidenceBean> rxCollectEvidencePostNet(String url, final String PageNum, final String usertocken) {
		return Observable.just(url).map(new Function<String, CollectEvidenceBean>() {
			@Override
			public CollectEvidenceBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("PageNum", PageNum).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();

				CollectEvidenceBean result = gson.fromJson(response.body().string(), CollectEvidenceBean.class);

				return result;
			}
		});
	}

	/**
	 * 待办事项列表
	 *
	 * @param url
	 * @param usertocken
	 * @return
	 */
	public Observable<ToDoListBean> rxToDoListBeanPostNet(String url, final String functionId, final String usertocken) {
		return Observable.just(url).map(new Function<String, ToDoListBean>() {
			@Override
			public ToDoListBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("functionId", functionId).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();

				ToDoListBean result = gson.fromJson(response.body().string(), ToDoListBean.class);

				return result;
			}
		});
	}

	/**
	 * 选择环节列表
	 *
	 * @param url
	 * @param usertocken
	 * @return
	 */
	public Observable<ChoiceBean> rxChoiceBeanPostNet(String url, final String workitemInsId, final String usertocken) {
		return Observable.just(url).map(new Function<String, ChoiceBean>() {
			@Override
			public ChoiceBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("workitemInsId", workitemInsId).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();

				ChoiceBean result = gson.fromJson(response.body().string(), ChoiceBean.class);

				return result;
			}
		});
	}

	/**
	 * 审核历史列表
	 *
	 * @param url
	 * @param usertocken
	 * @return
	 */
	public Observable<ReviewHistoryBean> rxReviewHistoryBeanPostNet(String url, final String businessId, final String usertocken) {
		return Observable.just(url).map(new Function<String, ReviewHistoryBean>() {
			@Override
			public ReviewHistoryBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("businessId", businessId).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();

				ReviewHistoryBean result = gson.fromJson(response.body().string(), ReviewHistoryBean.class);

				return result;
			}
		});
	}

	/**
	 * 待审核/驳回信息明细
	 *
	 * @param url
	 * @param usertocken
	 * @return
	 */
	public Observable<PendAuditBean> rxPendAuditBeanPostNet(String url, final String businessId,final String userId, final String usertocken) {
		return Observable.just(url).map(new Function<String, PendAuditBean>() {
			@Override
			public PendAuditBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("businessId", businessId).add("userId", userId).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();
				Gson gson = new Gson();
				PendAuditBean result = gson.fromJson(response.body().string(), PendAuditBean.class);

				return result;
			}
		});
	}

	/**
	 * 删除图片
	 *
	 * @param url
	 * @param usertocken
	 * @return
	 */
	public Observable<BaseBean> rxDeletePictureBeanPostNet(String url, final String businessId, final String usertocken) {
		return Observable.just(url).map(new Function<String, BaseBean>() {
			@Override
			public BaseBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("file_name", businessId).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();

				BaseBean result = gson.fromJson(response.body().string(), BaseBean.class);

				return result;
			}
		});
	}

	/**
	 * 选择人员列表
	 *
	 * @param url
	 * @param usertocken
	 * @return
	 */
	public Observable<SelectManagerBean> rxSelectManagerBeanPostNet(String url, final String processId, final String processVer, final String actId, final String busiOrgId, final String usertocken) {
		return Observable.just(url).map(new Function<String, SelectManagerBean>() {
			@Override
			public SelectManagerBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("processId", processId).add("processVer", processVer).add("actId", actId).add("busiOrgId", busiOrgId).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();

				SelectManagerBean result = gson.fromJson(response.body().string(), SelectManagerBean.class);

				return result;
			}
		});
	}

	/**
	 * 待审核同意
	 *
	 * @param url
	 * @param usertocken
	 * @return
	 */
	public Observable<BaseBean> rxCommentAgreePostNet(String url, final String workitemInsId, final String businessId, final String actId,final String desc, final String busiOrgId, final String actType, final String userids, final String remindType, final String usertocken) {
		return Observable.just(url).map(new Function<String, BaseBean>() {
			@Override
			public BaseBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("workitemInsId", workitemInsId).add("businessId", businessId).add("busiOrgId", actId).add("desc", desc).add("actId", busiOrgId).add("actType", actType).add("userids", userids).add("remindType", remindType).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();

				BaseBean result = gson.fromJson(response.body().string(), BaseBean.class);

				return result;
			}
		});
	}

	/**
	 * 审核驳回
	 *
	 * @param url
	 * @param usertocken
	 * @return
	 */
	public Observable<BaseBean> rxRejectPostNet(String url, final String workitemInsId, final String businessId, final String busiOrgId, final String desc, final String remindType, final String usertocken) {
		return Observable.just(url).map(new Function<String, BaseBean>() {
			@Override
			public BaseBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("workitemInsId", workitemInsId).add("businessId", businessId).add("busiOrgId", busiOrgId).add("desc", desc).add("remindType", remindType).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();

				BaseBean result = gson.fromJson(response.body().string(), BaseBean.class);

				return result;
			}
		});
	}

	/**
	 * 关联流程列表
	 *
	 * @param url
	 * @param usertocken
	 * @return
	 */
	public Observable<SelectProcessBean> rxSelectProcessBeanPostNet(String url, final String busiUserId, final String busiOrgId, final String usertocken) {
		return Observable.just(url).map(new Function<String, SelectProcessBean>() {
			@Override
			public SelectProcessBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("busiUserId", busiUserId).add("busiOrgId", busiOrgId).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();

				SelectProcessBean result = gson.fromJson(response.body().string(), SelectProcessBean.class);

				return result;
			}
		});
	}

	/**
	 * 选择环节列表
	 *
	 * @param url
	 * @param usertocken
	 * @return
	 */
	public Observable<ChoiceBean> rxChoiceBean1PostNet(String url, final String processId, final String usertocken) {
		return Observable.just(url).map(new Function<String, ChoiceBean>() {
			@Override
			public ChoiceBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("processId", processId).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();

				ChoiceBean result = gson.fromJson(response.body().string(), ChoiceBean.class);

				return result;
			}
		});
	}

	/**
	 * 重新提交
	 *
	 * @param url
	 * @param usertocken
	 * @return
	 */
	public Observable<BaseBean> rxResubmitNet(String url, final String processId, final String processVer, final String activityId, final String businessId, final String busiOrgId, final String busiTypeProcId, final String processCorpId, final String desc, final String actId, final String actType, final String userids, final String remindType, final String usertocken) {
		return Observable.just(url).map(new Function<String, BaseBean>() {
			@Override
			public BaseBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("processId", processId).add("processVer", processVer).add("activityId", activityId).add("businessId", businessId).add("busiOrgId", busiOrgId).add("busiTypeProcId", busiTypeProcId).add("processCorpId", processCorpId).add("desc", desc).add("actId", actId).add("actType", actType).add("userids", userids).add("remindType", remindType).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();

				BaseBean result = gson.fromJson(response.body().string(), BaseBean.class);

				return result;
			}
		});
	}

	/**
	 * 驳回重新提交
	 *
	 * @param url
	 * @param usertocken
	 * @return
	 */
	public Observable<RejectEditBean> rxRejectEditBeanNet(String url, final String t_document_management_id, final String vc_document_priority_type, final String vc_document_number, final String vc_document_name, final String dt_document_end_time, final String vc_create_user, final String vc_create_mechanism, final String fileName, final String usertocken) {
		return Observable.just(url).map(new Function<String, RejectEditBean>() {
			@Override
			public RejectEditBean apply(@NonNull String s) throws Exception {
				PendAuditBean pendAuditBean = MyApplication.getInstance().getmPendAuditBean();
				if (pendAuditBean != null) {

				}
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder()
						.add("t_document_management_id", t_document_management_id + "")
						//文书类型
						.add("vc_document_priority_type", vc_document_priority_type + "")
						//文书编号
						.add("vc_document_number", vc_document_number + "")
						//标题
						.add("vc_document_name", vc_document_name + "")
						//文书截止日期
						.add("document_end_time", dt_document_end_time + "")
						.add("vc_create_user", pendAuditBean.getData().get(0).getVc_create_user() + "")
						.add("vc_create_mechanism", pendAuditBean.getData().get(0).getVc_create_mechanism() + "")
						//文件名称
						.add("fileName", fileName + "")
						.add("userToken", usertocken + "")

						.add("t_receipt_management_id", pendAuditBean.getData().get(0).getT_receipt_management_id() + "")
						//发起人
						.add("t_userinfo_id", vc_create_user + "")
						//发文单位
						.add("t_document_company_id", vc_create_mechanism + "")
						.add("create_time", pendAuditBean.getData().get(0).getCreate_time() + "")
						.add("vc_update_user", pendAuditBean.getData().get(0).getVc_update_user() + "")
						.add("update_time", pendAuditBean.getData().get(0).getUpdate_time() + "")
						.add("vc_uodate_mechanism", pendAuditBean.getData().get(0).getVc_uodate_mechanism() + "")
						.add("vc_status", pendAuditBean.getData().get(0).getVc_status() + "")
						.add("vc_workflow", pendAuditBean.getData().get(0).getVc_workflow() + "")
						.add("vc_status_id", pendAuditBean.getData().get(0).getVc_status_id() + "")
						.add("is_interior", pendAuditBean.getData().get(0).getIs_interior() + "")
						.add("audit_end_user", pendAuditBean.getData().get(0).getAudit_end_user() + "")
						.add("audit_end_org", pendAuditBean.getData().get(0).getAudit_end_org() + "")
						.add("orgname", pendAuditBean.getData().get(0).getOrgname() + "")
						.add("filePath", pendAuditBean.getData().get(0).getFilePath() + "")
						.build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();
				Gson gson = new Gson();

				RejectEditBean result = gson.fromJson(response.body().string(), RejectEditBean.class);
				return result;
			}
		});
	}

	/**
	 * 重新提交
	 *
	 * @param url
	 * @param usertocken
	 * @return
	 */
	public Observable<MessageLogBean> rxMessageLogBeanNet(String url, final String usertocken) {
		return Observable.just(url).map(new Function<String, MessageLogBean>() {
			@Override
			public MessageLogBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

				Gson gson = new Gson();
				MessageLogBean result = gson.fromJson(response.body().string(), MessageLogBean.class);

				return result;
			}
		});
	}

	/**
	 * 重新提交
	 *
	 * @param url
	 * @param usertocken
	 * @return
	 */
	public Observable<BaseBean> rxMessageDetailBeanNet(String url, final String t_main_news_id, final String to_person, final String next_type_id, final String activity_ins_id, final String type_id, final String usertocken) {
		return Observable.just(url).map(new Function<String, BaseBean>() {
			@Override
			public BaseBean apply(@NonNull String s) throws Exception {
				//3.传递键值对的FormBody构造的RquestBody
				RequestBody requestBody = new FormBody.Builder().add("t_main_news_id", t_main_news_id).add("to_person", to_person).add("next_type_id", next_type_id).add("activity_ins_id", activity_ins_id).add("type_id", type_id).add("userToken", usertocken).build();

				//2.构造Request
				Request request = new Request.Builder().url(s).post(requestBody).build();

				//4.执行call
				Response response = okHttpClient.newCall(request).execute();

                Gson gson = new Gson();

				BaseBean result = gson.fromJson(response.body().string(), BaseBean.class);

				return result;
			}
		});
	}



}
