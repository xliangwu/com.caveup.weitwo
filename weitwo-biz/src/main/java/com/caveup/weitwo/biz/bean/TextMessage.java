package com.caveup.weitwo.biz.bean;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.internal.txw2.annotation.XmlCDATA;

@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"toUserName", "fromUserName","createTime", "msgType","content", "msgId"})
@XmlRootElement(name = "xml")
public class TextMessage {
    
    private String toUserName;
    private String fromUserName;
    private Long createTime;
    private String msgType;
    private String content;
    private Long msgId;
    
    @XmlElement(name="ToUserName")
    @XmlCDATA
    public String getToUserName() {
        return toUserName;
    }
    
    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }
    
    @XmlElement(name="FromUserName")
    @XmlCDATA
    public String getFromUserName() {
        return fromUserName;
    }
    
    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }
    
    @XmlElement(name="CreateTime") 
    public Long getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
    
    @XmlElement(name="MsgType")
    @XmlCDATA
    public String getMsgType() {
        return msgType;
    }
    
    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }
    
    @XmlElement(name="Content")
    @XmlCDATA
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    @XmlElement(name="MsgId") 
    public Long getMsgId() {
        return msgId;
    }
    
    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }
}
