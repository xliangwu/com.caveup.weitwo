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
public class LocationRequestMsg extends NormalRequestMsg {
	private Double location_X;
	private Double location_Y;
	private Integer scale;
	private String label;

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

	@Override
	public String toString() {
		return "LocationRequestMsg [location_X=" + location_X + ", location_Y=" + location_Y + ", scale=" + scale
				+ ", label=" + label + ", toString()=" + super.toString() + "]";
	}
}
