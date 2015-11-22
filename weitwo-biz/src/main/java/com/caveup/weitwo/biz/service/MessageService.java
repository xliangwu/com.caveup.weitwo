package com.caveup.weitwo.biz.service;

import java.io.InputStream;
import javax.xml.bind.JAXBException;
import com.caveup.weitwo.biz.bean.RequestMessage;

public interface MessageService {

    public RequestMessage unmarshallerRequestMessage(InputStream xml) throws JAXBException;

}
