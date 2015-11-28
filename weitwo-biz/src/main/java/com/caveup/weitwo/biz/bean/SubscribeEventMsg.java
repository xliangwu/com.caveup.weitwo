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
public class SubscribeEventMsg extends EventMessage {
	private String eventKey;
	private String ticket;

    @XmlElement(name = "EventKey")
    @XmlCDATA
	public String getEventKey() {
		return eventKey;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}

    @XmlElement(name = "Ticket")
    @XmlCDATA
	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "SubscribeEventMsg [eventKey=" + eventKey + ", ticket=" + ticket + ", toString()=" + super.toString()
				+ "]";
	}

}
