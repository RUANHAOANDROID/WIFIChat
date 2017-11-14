package com.ruanhao.wifichat.protocol.v1;

import com.google.gson.Gson;

import android.os.Parcel;
import android.os.Parcelable;

/** 
* Created by xiang.shen on 2017年5月5日.
*
*/
public class Entry implements Parcelable {
	
	private String name;
	private String ipAdderss;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIpAdderss() {
		return ipAdderss;
	}

	public void setIpAdderss(String ipAdderss) {
		this.ipAdderss = ipAdderss;
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
		
	}

}
