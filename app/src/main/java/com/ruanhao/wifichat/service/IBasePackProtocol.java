package com.ruanhao.wifichat.service;


import com.ruanhao.wifichat.protocol.P2pVersion;
import com.ruanhao.wifichat.protocol.SerialNumberUtils;
import com.ruanhao.wifichat.protocol.codec.Pack;

public abstract class IBasePackProtocol {
	
	protected Pack createPack(final String strSendUserName, final int nCommand, final String strContent) {
		Pack pack = new Pack();
		pack.setVersion(P2pVersion.ONE);
		pack.setSn(SerialNumberUtils.getNewNumIdx());
		pack.setSendName(strSendUserName);
		pack.setCommand(nCommand);
		pack.setContent(strContent);
		return pack;
	}
}
