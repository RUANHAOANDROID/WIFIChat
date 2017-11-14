package com.ruanhao.wifichat.service.parcelable;

import com.google.gson.Gson;

import android.os.Parcel;
import android.os.Parcelable;

/** 
* Created by xiang.shen on 2017年5月8日.
*
*/
public class ReplyMessage implements Parcelable{
	
	private int cmd;
	private int packet_no;
	private int msg_id;
	
	public int getCmd() {
		return cmd;
	}

	public void setCmd(int cmd) {
		this.cmd = cmd;
	}

	public int getPacket_no() {
		return packet_no;
	}

	public void setPacket_no(int packet_no) {
		this.packet_no = packet_no;
	}

	public int getMsg_id() {
		return msg_id;
	}

	public void setMsg_id(int msg_id) {
		this.msg_id = msg_id;
	}
	
	public String toJson() {
		return new Gson().toJson(this);
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
