package com.huaxin.yunnan.environment.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huaxin.yunnan.environment.BaseDialog;
import com.huaxin.yunnan.environment.MyApplication;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.activity.LoginActivity;
import com.huaxin.yunnan.environment.activity.PwdChangeActivity;
import com.huaxin.yunnan.environment.activity.maillist.MailListActivity;
import com.huaxin.yunnan.environment.activity.meaaagelog.MessageLogActivity;
import com.huaxin.yunnan.environment.activity.todo.ToDoActivity;
import com.tencent.android.tpush.XGPushManager;

/**
 * Created by longzeqiu on 2017/9/28.
 */

public class MyFragment extends BaseFragment implements View.OnClickListener {
    private RelativeLayout rl_changePwd;
    private ImageView iv_document_processing;
    private TextView tv_document_processing;
    private ImageView iv_process_process;
    private TextView tv_visit_weibo_menu;
    private ImageView iv_mail_list;
    private TextView tv_mail_list;
    private RelativeLayout rl_phone_list;
    private ImageView iv_message_log;
    private TextView tv_message_log;
    private RelativeLayout rl_message_log;
    private ImageView iv_modify_password;
    private TextView tv_modify_password;
    private ImageView iv_log_out;
    private TextView tv_log_out;
    private RelativeLayout rl_todo;
    private RelativeLayout rl_logout;
    private BaseDialog baseDialog;
    private TextView tv_user_name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_my, container, false);

        initView(view);


        return view;
    }

    private void initView(View view) {
        rl_changePwd = view.findViewById(R.id.rl_changePwd);
        rl_changePwd.setOnClickListener(this);
        tv_user_name = ((TextView) view.findViewById(R.id.tv_username));
        tv_user_name.setText(SpUtils.getString(getContext(), "name"));

        rl_phone_list = (RelativeLayout) view.findViewById(R.id.rl_phone_list);
        rl_phone_list.setOnClickListener(this);

        rl_message_log = (RelativeLayout) view.findViewById(R.id.rl_message_log);
        rl_message_log.setOnClickListener(this);
        rl_logout = (RelativeLayout) view.findViewById(R.id.rl_logout);
        rl_logout.setOnClickListener(this);
        rl_todo = (RelativeLayout) view.findViewById(R.id.rl_todo);
        rl_todo.setOnClickListener(this);
    }

    @Override
    protected void lazyLoad() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rl_changePwd:
                startActivity(new Intent(getActivity(), PwdChangeActivity.class));
                break;
            case R.id.rl_phone_list:
                startActivity(new Intent(getActivity(), MailListActivity.class));
                break;
            case R.id.rl_message_log:
                startActivity(new Intent(getActivity(), MessageLogActivity.class));
                break;
            case R.id.rl_todo:
                startActivity(new Intent(getActivity(), ToDoActivity.class));
                break;
            case R.id.rl_logout:
                //退出登录
                showNormalDialog();
                break;
            default:
                break;
        }
    }

    private void showNormalDialog() {
        baseDialog = new BaseDialog(getActivity());
        baseDialog.setMessage("是否确定退出?");
        baseDialog.setYesOnclickListener("确定", new BaseDialog.onYesOnclickListener() {
            @Override
            public void onYesClick() {
                //信鸽反注册
                XGPushManager.unregisterPush(getActivity().getApplicationContext());
                MyApplication.getInstance().mScreenManager.popAlls();
                startActivity(new Intent(getActivity(), LoginActivity.class));
                baseDialog.dismiss();
            }
        });
        baseDialog.setNoOnclickListener("取消", new BaseDialog.onNoOnclickListener() {
            @Override
            public void onNoClick() {
                baseDialog.dismiss();
                return;
            }
        });
        baseDialog.show();
    }
}
