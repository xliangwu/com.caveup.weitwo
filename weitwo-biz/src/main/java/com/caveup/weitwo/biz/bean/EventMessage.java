package com.caveup.weitwo.biz.bean;

import javax.xml.bind.annotation.XmlElement;

import org.eclipse.persistence.oxm.annotations.XmlCDATA;

public class EventMessage extends Message{
	private EventType eventType;

    @XmlElement(name = "Event")
    @XmlCDATA
	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	@Override
	public String toString() {
		return "EventMessage [eventType=" + eventType + ", toString()=" + super.toString() + "]";
	}

}
