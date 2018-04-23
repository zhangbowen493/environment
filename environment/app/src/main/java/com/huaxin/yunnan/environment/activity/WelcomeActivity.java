package com.huaxin.yunnan.environment.activity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.Utils.LogUtils;
import com.huaxin.yunnan.environment.activity.map.CheckPermissionsActivity;

public class WelcomeActivity extends CheckPermissionsActivity {

	private String customContent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
	}

	@Override
	protected void onResume() {
		super.onResume();
//		applyPermission();1
	}

	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] paramArrayOfInt) {
		super.onRequestPermissionsResult(requestCode, permissions, paramArrayOfInt);
		if (requestCode == 0) {
			new Handler().postDelayed(new Runnable() {
				public void run() {
					Intent mainIntent = new Intent(WelcomeActivity.this, LoginActivity.class);
					WelcomeActivity.this.startActivity(mainIntent);
					WelcomeActivity.this.finish();
				}
			}, 3000);
		}
	}

	/**
	 * 检测是否所有的权限都已经授权
	 *
	 * @param grantResults
	 * @return
	 * @since 2.5.0
	 */
	private boolean verifyPermissions(int[] grantResults) {
		for (int result : grantResults) {
			if (result != PackageManager.PERMISSION_GRANTED) {
				return false;
			}
		}
		return true;
	}
}
