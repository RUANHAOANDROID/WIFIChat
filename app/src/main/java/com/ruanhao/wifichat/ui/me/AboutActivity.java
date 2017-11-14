package com.ruanhao.wifichat.ui.me;



import android.os.Bundle;

import com.ruanhao.wifichat.R;
import com.ruanhao.wifichat.ui.BaseActivity;
import com.ruanhao.wifichat.widget.TitleView;

public class AboutActivity extends BaseActivity {
	private TitleView titleView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		titleView = (TitleView) findViewById(R.id.title);
		titleView.setTitle("关于");
	}
}
