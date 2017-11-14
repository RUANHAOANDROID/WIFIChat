package com.ruanhao.wifichat.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Window;

import com.ruanhao.wifichat.WiFiChat;


public class BaseActivity extends Activity {
	protected WiFiChat app = WiFiChat.instance();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 设置无标题
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		// 垂直显示
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		app.getActivityManager().pushActivity(this);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		app.getActivityManager().popActivity(this);
	}

	public void startActivity(Class<?> cls) {
		Intent intent = new Intent(this, cls);
		startActivity(intent);
	}

	public void startActivity(Class<?> cls, String key, Bundle bundle) {
		Intent intent = new Intent(this, cls);
		intent.putExtra(key, bundle);
		startActivity(intent);
	}

	public void startActivity(Class<?> cls, String key, Parcelable parcelable) {
		Intent intent = new Intent(this, cls);
		intent.putExtra(key, parcelable);
		startActivity(intent);
	}
}
