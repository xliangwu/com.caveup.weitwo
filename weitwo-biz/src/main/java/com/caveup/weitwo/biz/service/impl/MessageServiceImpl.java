package com.caveup.weitwo.biz.service.impl;

import java.io.Reader;
import java.io.Writer;

import javax.xml.bind.JAXBException;

import com.caveup.weitwo.biz.bean.Message;
import com.caveup.weitwo.biz.service.MessageService;
import com.caveup.weitwo.biz.util.JAXBUtil;

public class MessageServiceImpl implements MessageService {

    @Override
    public <T> T unmarshallerReqMsg(Reader xml, Class<T> clazz) throws JAXBException {
        return JAXBUtil.unmarshalData(xml, clazz);
    }

	@Override
	public Writer marshallerResMsg(Message response) throws JAXBException {
		return JAXBUtil.marshalData(response);
	}
    
}
