package com.ruanhao.wifichat.ui.chat.image;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.ruanhao.wifichat.R;
import com.ruanhao.wifichat.utlis.GlideLoder;
import com.ruanhao.wifichat.utlis.ImageLoader;


import cn.bluemobi.dylan.photoview.library.PhotoView;

public class ChatImagesActivity extends Activity {
	PhotoView imageView;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		intent = getIntent();
		setContentView(R.layout.p2p_activity_images);
		imageView = (PhotoView) findViewById(R.id.chat_image);
		ImageLoader imageLoader=new GlideLoder(this);
		imageLoader.loadImage(imageView, intent.getStringExtra("url"));
	}
}
