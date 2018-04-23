package com.huaxin.yunnan.environment.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huaxin.yunnan.environment.MyApplication;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.Utils.ToastUtils;
import com.huaxin.yunnan.environment.activity.meaaagelog.MessageDetailActivity;
import com.huaxin.yunnan.environment.activity.meaaagelog.MessageLogActivity;
import com.huaxin.yunnan.environment.bean.LoginResultBean;
import com.huaxin.yunnan.environment.bean.MessageLogBean;
import com.huaxin.yunnan.environment.bean.XGBean;
import com.tencent.android.tpush.XGPushBaseReceiver;
import com.tencent.android.tpush.XGPushClickedResult;
import com.tencent.android.tpush.XGPushRegisterResult;
import com.tencent.android.tpush.XGPushShowedResult;
import com.tencent.android.tpush.XGPushTextMessage;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

/**
 * Created by zbw on 2017/12/4 14:31.
 */

public class MyXGPushBaseReceiver extends XGPushBaseReceiver {

	@Override
	public void onRegisterResult(Context context, int i, XGPushRegisterResult xgPushRegisterResult) {
		//注册回调
		Log.e("MyXGPushBaseReceiver", "注册回调,信息：" + xgPushRegisterResult.toString());
	}

	@Override
	public void onUnregisterResult(Context context, int i) {
		//反注册回调
		Log.e("MyXGPushBaseReceiver", "");
	}

	@Override
	public void onSetTagResult(Context context, int i, String s) {
		//设置标签回调
		Log.e("MyXGPushBaseReceiver", "");
	}

	@Override
	public void onDeleteTagResult(Context context, int i, String s) {
		//删除标签回调
		Log.e("MyXGPushBaseReceiver", "");
	}

	@Override
	public void onTextMessage(Context context, XGPushTextMessage xgPushTextMessage) {
		//应用内消息的回调
		Log.e("MyXGPushBaseReceiver", "应用内消息的回调,信息：" + xgPushTextMessage.toString());
	}

	@Override
	public void onNotifactionClickedResult(Context context, XGPushClickedResult xgPushClickedResult) {
		//通知被点击触发的回调
		if (context == null || xgPushClickedResult == null) {
			return;
		}
		Log.e("MyXGPushBaseReceiver", "MyXGPushBaseReceiver通知被点击触发的回调，信息：" + xgPushClickedResult.toString());
		String text = "";
		if (xgPushClickedResult.getActionType() == XGPushClickedResult.NOTIFACTION_CLICKED_TYPE) {
			// 通知在通知栏被点击啦。。。。。
			// 这个动作可以在activity的onResume也能监听，请看第3点相关内容
			text = "通知被打开 :" + xgPushClickedResult;
//			Toast.makeText(context, "广播接收到通知被点击:" + xgPushClickedResult.toString(), Toast.LENGTH_SHORT).show();
			String customContent = xgPushClickedResult.getCustomContent();
			if (customContent != null && customContent.length() != 0) {
				Gson g = new GsonBuilder().serializeNulls().create();
				XGBean mXGBen = g.fromJson(customContent, XGBean.class);
				String workItemInsId=mXGBen.getKey2();
				XGBean.Key1Bean.QueryDataBean dataBean = mXGBen.getKey1().getQueryData().get(0);
//				LogUtils.e("workItemInsIdL:"+workItemInsId);
//				LogUtils.e("QueryDataBean:"+dataBean.toString());
				Intent intent = new Intent(context, MessageDetailActivity.class);
				MessageLogBean.DataBean.QueryDataBean mQueryDataBean=new MessageLogBean.DataBean.QueryDataBean();
				mQueryDataBean.setTitle(dataBean.getTitle());
				mQueryDataBean.setContent_id(dataBean.getContent_id());
				mQueryDataBean.setVc_status(dataBean.getVc_status());
				mQueryDataBean.setRead_status(dataBean.getRead_status());
				mQueryDataBean.setType_id(dataBean.getType_id());
				mQueryDataBean.setNext_type_id(dataBean.getNext_type_id());
				mQueryDataBean.setName(dataBean.getName());
				mQueryDataBean.setT_main_news_id(dataBean.getT_main_news_id());
				mQueryDataBean.setTo_person(dataBean.getTo_person());
				mQueryDataBean.setActivity_ins_id(dataBean.getActivity_ins_id());
//				LogUtils.e("MyXGPushBaseReceiver:mQueryDataBean"+mQueryDataBean.toString());
////				MyApplication.getInstance().mQueryDataBean=mQueryDataBean;
				intent.putExtra("dataBean", mQueryDataBean);
				intent.putExtra("workItemInsId", workItemInsId);
				intent.putExtra("isXG","1");
				intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				context.startActivity(intent);
			} else {
				LogUtils.e("customContent有误！");
			}
		} else if (xgPushClickedResult.getActionType() == XGPushClickedResult.NOTIFACTION_DELETED_TYPE) {
			// APP自己处理通知被清除后的相关动作
			text = "通知被清除 :" + xgPushClickedResult;
//			ToastUtils.showShort(context, text);
		}
	}

	@Override
	public void onNotifactionShowedResult(Context context, XGPushShowedResult xgPushShowedResult) {
		//通知被展示触发的回调，可以在此保存APP收到的通知
		Log.e("MyXGPushBaseReceiver", "通知被展示触发的回调,信息：" + xgPushShowedResult.toString());
	}
}
