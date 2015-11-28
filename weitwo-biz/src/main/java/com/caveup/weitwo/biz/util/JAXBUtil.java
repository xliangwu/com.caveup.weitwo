package com.caveup.weitwo.biz.util;

import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBUtil {
	public static Writer marshalData(Object object) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(object.getClass());

		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");// 编码格式
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);// 是否格式化生成的xml串
		// 是否省略xml头信息（<?xml version="1.0" encoding="gb2312" standalone="yes"?>）
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);
		Writer writer = new StringWriter();
		marshaller.marshal(object, writer);
		return writer;
	}

	// 解组数据
	@SuppressWarnings("unchecked")
	public static <T> T unmarshalData(Reader xml, Class<T> clazz) throws JAXBException  {
		JAXBContext context = JAXBContext.newInstance(clazz);

		Unmarshaller unmarshaller = context.createUnmarshaller();

		T object = (T) unmarshaller.unmarshal(xml);

		return object;
	}
}
