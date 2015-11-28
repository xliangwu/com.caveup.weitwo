package com.caveup.weitwo.biz.bean;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ResponseType")
@XmlEnum
public enum MessageType {
	
	@XmlEnumValue("text")
	TEXT("text"),
    @XmlEnumValue("image")
	IMAGE("image"),
    @XmlEnumValue("voice")
	VOICE("voice"),
    @XmlEnumValue("video")
	VIDEO("video"),
	
	//request
	@XmlEnumValue("shortvideo")
	SHORT_VIDEO("shortvideo"),
	@XmlEnumValue("location")
	LOCATION("location"),
	@XmlEnumValue("link")
	LINK("link"),
	@XmlEnumValue("event")
	EVENT("event"),
	
	//response
	@XmlEnumValue("music")
	MUSIC("music"),
    @XmlEnumValue("news")
	NEWS("news");
	
    String content;

    MessageType(String content) {
        this.content = content;
    }
    
    public String value() {
        return content;
    }
}
