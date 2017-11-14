package com.ruanhao.wifichat.service.parcelable;


import android.os.Parcel;
import android.os.Parcelable;

import com.ruanhao.wifichat.protocol.constant.EnumMsgType;

/** 
* Created by xiang.shen on 2017年5月8日.
*
*/
public class UserMessage implements Parcelable{
	
	private long id;
	private EnumMsgType type;
	private String content;
	private long msg_time;
	private String sendUsername;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EnumMsgType getType() {
		return type;
	}

	public void setType(EnumMsgType type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getMsg_time() {
		return msg_time;
	}

	public void setMsg_time(long msg_time) {
		this.msg_time = msg_time;
	}
	
	public String getSendUsername() {
		return sendUsername;
	}

	public void setSendUsername(String sendUsername) {
		this.sendUsername = sendUsername;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// TODO Auto-generated method stub
		
	}

}
