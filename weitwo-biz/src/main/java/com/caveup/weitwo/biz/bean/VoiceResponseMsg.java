package com.caveup.weitwo.biz.bean;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlCDATA;
import org.eclipse.persistence.oxm.annotations.XmlPath;

@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name = "xml")
public class VoiceResponseMsg extends Message{
	
    private String mediaId;
    
    @XmlPath("Voice/MediaId/text()")
    @XmlCDATA
    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String media_id) {
        this.mediaId = media_id;
    }

}
