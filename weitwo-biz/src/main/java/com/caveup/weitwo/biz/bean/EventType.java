package com.caveup.weitwo.biz.bean;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "EventType")
@XmlEnum
public enum EventType {
	@XmlEnumValue("subscribe")
	SUBSCRIBE,
	@XmlEnumValue("unsubscribe")
	UN_SUBSCRIBE,
	@XmlEnumValue("SCAN")
	SCAN,
	@XmlEnumValue("LOCATION")
	LOCATION,
	@XmlEnumValue("CLICK")
	CLICK,
	@XmlEnumValue("VIEW")
	VIEW
}
