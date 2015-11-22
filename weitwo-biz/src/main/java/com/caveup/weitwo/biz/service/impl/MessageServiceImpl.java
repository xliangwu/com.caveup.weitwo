package com.caveup.weitwo.biz.service.impl;

import java.io.InputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import com.caveup.weitwo.biz.bean.RequestMessage;
import com.caveup.weitwo.biz.service.MessageService;

public class MessageServiceImpl implements MessageService {

    @Override
    public RequestMessage unmarshallerRequestMessage(InputStream xml) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(RequestMessage.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();  
        RequestMessage tm = (RequestMessage) unmarshaller.unmarshal(xml);
        return tm;
    }


}
