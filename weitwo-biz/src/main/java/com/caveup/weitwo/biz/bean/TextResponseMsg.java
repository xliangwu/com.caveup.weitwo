package com.caveup.weitwo.biz.bean;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlCDATA;

@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name = "xml")
public class TextResponseMsg extends Message {

    private String content;

    @XmlElement(name = "Content")
    @XmlCDATA
    public String getContent() {
        return content;
    }

    @XmlCDATA
    public void setContent(String content) {
        this.content = content;
    }
}
