package com.caveup.weitwo.biz.bean;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name = "xml")
public class LocationEventMsg extends EventMessage {
	private Double latitude;
	private Double longitude;
	private Double precision;

	@XmlElement(name = "Latitude")
	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	@XmlElement(name = "Longitude")
	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	@XmlElement(name = "Precision")
	public Double getPrecision() {
		return precision;
	}

	public void setPrecision(Double precision) {
		this.precision = precision;
	}

	@Override
	public String toString() {
		return "LocationEventMsg [latitude=" + latitude + ", longitude=" + longitude + ", precision=" + precision
				+ ", toString()=" + super.toString() + "]";
	}
}
