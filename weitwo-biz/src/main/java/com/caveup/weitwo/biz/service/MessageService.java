package com.caveup.weitwo.biz.service;

import java.io.Reader;
import java.io.Writer;

import javax.xml.bind.JAXBException;

import com.caveup.weitwo.biz.bean.Message;

public interface MessageService {

    public <T> T unmarshallerReqMsg(Reader xml, Class<T> clazz) throws JAXBException;
    
    public Writer marshallerResMsg(Message response) throws JAXBException;

}
