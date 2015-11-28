package com.caveup.weitwo.biz.bean;

import javax.xml.bind.annotation.XmlElement;

public class NormalRequestMsg extends Message {

    private Long msgId;

    @XmlElement(name = "MsgId")
    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

	@Override
	public String toString() {
		return "NormalRequestMsg [msgId=" + msgId + ", toString()=" + super.toString() + "]";
	}

}
