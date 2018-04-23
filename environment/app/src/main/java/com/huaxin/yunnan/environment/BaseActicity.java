package com.huaxin.yunnan.environment;

import android.Manifest;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.tencent.android.tpush.XGPushClickedResult;
import com.tencent.android.tpush.XGPushManager;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BaseActicity extends AppCompatActivity {

    protected YNProgressDialog yNProgressDialog;
    protected PopupWindow mPopupWindow;
    protected LayoutInflater mInflater;
    private Map<Integer, Runnable> allowablePermissionRunnables = new HashMap<>();
    private Map<Integer, Runnable> disallowablePermissionRunnables = new HashMap<>();

    /**
     * 是否禁止旋转屏幕
     **/
    private boolean isAllowScreenRoate = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        // 判断是否从推送通知栏打开的
        XGPushClickedResult click = XGPushManager.onActivityStarted(this);
        if (click != null) {
            //从推送通知栏打开-Service打开Activity会重新执行Laucher流程
            //查看是不是全新打开的面板
            if (isTaskRoot()) {
                return;
            }
            //如果有面板存在则关闭当前的面板
            finish();
        }
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        mInflater = getLayoutInflater();
        //是否禁止屏幕旋转
        if (!isAllowScreenRoate) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            try {
                Class decorViewClazz = Class.forName("com.android.internal.policy.DecorView");
//                //透明状态栏·
//                getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                Field field = decorViewClazz.getDeclaredField("mSemiTransparentStatusBarColor");
                field.setAccessible(true);
                field.setInt(getWindow().getDecorView(), Color.TRANSPARENT);  //改为透明
            } catch (Exception e) {
            }
        }
        MyApplication.getInstance().mScreenManager.pushActivity(this);
    }

    protected void initProgressDialog() {
        yNProgressDialog = YNProgressDialog.create(this, getResources().getString(R.string.common_loading), true, new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                yNProgressDialog.dismiss();
            }
        });
    }

    protected void initTitleBackView() {
        View main_back = findViewById(R.id.title_text);
        main_back.setClickable(true);
        main_back.setVisibility(View.VISIBLE);
        main_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                onBack(v);
            }
        });
    }

    String[] permissions = {Manifest.permission.GET_ACCOUNTS, Manifest.permission.READ_CONTACTS, Manifest.permission.CALL_PHONE, Manifest.permission.CAMERA, Manifest.permission.MOUNT_UNMOUNT_FILESYSTEMS, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE};

    public void applyPermission() {
        for (int i = 0; i < permissions.length; i++) {
            if (Build.VERSION.SDK_INT >= 23) {
                int check = ContextCompat.checkSelfPermission(this, permissions[i]);
                // 权限是否已经 授权 GRANTED---授权  DINIED---拒绝
                if (check == PackageManager.PERMISSION_GRANTED) {
                } else {
                    requestPermissions(new String[]{Manifest.permission.GET_ACCOUNTS, Manifest.permission.READ_CONTACTS, Manifest.permission.CALL_PHONE, Manifest.permission.CAMERA, Manifest.permission.MOUNT_UNMOUNT_FILESYSTEMS, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE}, 1);
                }
            } else {
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//            useCamera();
        } else {
            // 没有获取 到权限，从新请求，或者关闭app
            Toast.makeText(this, "需要存储权限", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * 标题上的返回按钮点击事件处理
     *
     * @param v
     */
    public void onBack(View v) {
        this.finish();
    }


    /**
     * 列表选择popupWindow
     *
     * @param parentView        父View
     * @param itemTexts         列表项文本集合
     * @param itemClickListener 列表项点击事件
     */

    public void showListPopupWindow(View parentView, ArrayList<String> itemTexts, AdapterView.OnItemClickListener itemClickListener) {
        View popupView = getLayoutInflater().inflate(R.layout.common_popup_list, null);
        ListView listView = (ListView) popupView.findViewById(R.id.listView);
        ListPopupWindowAdapter adapter = new ListPopupWindowAdapter(itemTexts);
        Button cancelButton = (Button) popupView.findViewById(R.id.cancel_buttona);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPopupWindow.dismiss();
            }
        });
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(itemClickListener);
        popupView.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (mPopupWindow != null && mPopupWindow.isShowing() && event.getAction() == KeyEvent.ACTION_DOWN) {
                    if (keyCode == KeyEvent.KEYCODE_BACK) {
                        mPopupWindow.dismiss();
                        return true;
                    }
                }
                return false;
            }
        });

        mPopupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);
        mPopupWindow.setTouchable(true);
        mPopupWindow.setOutsideTouchable(true);
        mPopupWindow.setAnimationStyle(R.style.PopupWindowAnimation);
        mPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                WindowManager.LayoutParams lp = getWindow().getAttributes();
                lp.alpha = 1.0f;
                getWindow().setAttributes(lp);
            }
        });
        //
        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.alpha = 0.8f;
        getWindow().setAttributes(lp);
        mPopupWindow.showAtLocation(parentView, Gravity.BOTTOM, 0, 0);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
    }

    class ListPopupWindowAdapter extends BaseAdapter {
        /**
         * 列表对话框文本列表
         */
        private ArrayList<String> itemTexts;
        /**
         * 列表对话框logo列表
         */
        private ArrayList<Integer> itemImages;

        public ListPopupWindowAdapter(ArrayList<String> itemTexts) {
            this.itemTexts = itemTexts;
        }

        public ListPopupWindowAdapter(ArrayList<String> itemTexts, ArrayList<Integer> itemImages) {
            this.itemTexts = itemTexts;
            this.itemImages = itemImages;
        }

        @Override
        public int getCount() {
            return itemTexts.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = mInflater.inflate(R.layout.common_popup_list_item, null);
            }
            ImageView itemIv = (ImageView) convertView.findViewById(R.id.iv_item);
            TextView itemTv = (TextView) convertView.findViewById(R.id.name);
            if (itemImages != null) {
                itemIv.setVisibility(View.VISIBLE);
                itemIv.setBackgroundResource(itemImages.get(position));
            }
            itemTv.setText(itemTexts.get(position));
            return convertView;
        }
    }


}
