package com.huaxin.yunnan.environment.fragment;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;

import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.YNProgressDialog;

/**
 * Created by longzeqiu on 2017/9/25.
 */

public abstract class BaseFragment extends Fragment {
    protected boolean isVisible;
    protected YNProgressDialog yNProgressDialog;
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (getUserVisibleHint()){
            isVisible=true;
            onVisible();
        }else {
            isVisible=false;
            onInvisible();
        }
    }

    /**
     * visible->lazyLoad
     */
    protected void onVisible() {
        lazyLoad();
    }
    /**
     * 显示时加载数据,需要这样的使用
     * 注意声明 isPrepared，先初始化
     * 生命周期会先执行 setUserVisibleHint 再执行onActivityCreated
     * 在 onActivityCreated 之后第一次显示加载数据，只加载一次
     */
    protected abstract void lazyLoad();
    protected void onInvisible() {

    }

    protected void initProgressDialog() {
        yNProgressDialog = YNProgressDialog.create(getContext(), getResources().getString(R.string.common_loading), true, new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                yNProgressDialog.dismiss();
            }
        });
    }
}
