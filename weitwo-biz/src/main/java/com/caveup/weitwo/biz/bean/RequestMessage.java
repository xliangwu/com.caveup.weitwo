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
@XmlType(propOrder = { "toUserName", "fromUserName", "createTime", "msgType", "mediaId", "format", "recognition",
        "thumbMediaId", "location_X", "location_Y", "scale", "label", "msgId" })
@XmlRootElement(name = "xml")
public class RequestMessage {

    private String toUserName;
    private String fromUserName;
    private Long createTime;
    private String msgType;
    private Long msgId;

    // voice msg
    private String mediaId;
    private String format;
    private String recognition;

    // video msg
    private String thumbMediaId;

    // location msg
    private Double location_X;
    private Double location_Y;
    private Integer scale;
    private String label;

    @XmlElement(name = "ToUserName")
    @XmlCDATA
    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    @XmlElement(name = "FromUserName")
    @XmlCDATA
    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    @XmlElement(name = "CreateTime")
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @XmlElement(name = "MsgType")
    @XmlCDATA
    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    @XmlElement(name = "MsgId")
    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    @XmlElement(name = "MediaId")
    @XmlCDATA
    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    @XmlElement(name = "Format")
    @XmlCDATA
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @XmlElement(name = "Recognition")
    @XmlCDATA
    public String getRecognition() {
        return recognition;
    }

    public void setRecognition(String recognition) {
        this.recognition = recognition;
    }
    
    @XmlElement(name = "ThumbMediaId")
    @XmlCDATA
    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }

    @XmlElement(name = "Location_X")
    public Double getLocation_X() {
        return location_X;
    }

    public void setLocation_X(Double location_X) {
        this.location_X = location_X;
    }

    @XmlElement(name = "Location_Y")
    public Double getLocation_Y() {
        return location_Y;
    }

    public void setLocation_Y(Double location_Y) {
        this.location_Y = location_Y;
    }

    @XmlElement(name = "Scale")
    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    @XmlElement(name = "Label")
    @XmlCDATA
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
