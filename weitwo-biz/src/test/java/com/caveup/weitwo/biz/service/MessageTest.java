package com.caveup.weitwo.biz.service;

import static org.junit.Assert.*;
import java.io.InputStream;
import javax.annotation.Resource;
import javax.xml.bind.JAXBException;
import org.junit.Test;
import org.springframework.util.Assert;
import com.caveup.weitwo.biz.bean.RequestMessage;


public class MessageTest extends TestSupport {
    
    @Resource
    private MessageService messageService;
    
    @Test
    public void testTextMessage() throws JAXBException {
        Assert.notNull(messageService);
        InputStream is = this.getClass().getResourceAsStream("/messages/TextMsg.xml");
        RequestMessage tm =  messageService.unmarshallerRequestMessage(is);
        Assert.notNull(tm);
    }
    
    @Test
    public void testVoiceMessage() throws JAXBException {
        Assert.notNull(messageService);
        InputStream is = this.getClass().getResourceAsStream("/messages/VoiceMsg.xml");
        RequestMessage vm =  messageService.unmarshallerRequestMessage(is);
        Assert.notNull(vm);
    }
    
    @Test
    public void testVideoMessage() throws JAXBException {
        Assert.notNull(messageService);
        InputStream is = this.getClass().getResourceAsStream("/messages/VideoMsg.xml");
        RequestMessage vm =  messageService.unmarshallerRequestMessage(is);
        Assert.notNull(vm);
    }
    
    @Test
    public void testShortVideoMessage() throws JAXBException {
        Assert.notNull(messageService);
        InputStream is = this.getClass().getResourceAsStream("/messages/ShortVideoMsg.xml");
        RequestMessage vm =  messageService.unmarshallerRequestMessage(is);
        Assert.notNull(vm);
    }

    @Test
    public void testLocationMessage() throws JAXBException {
        Assert.notNull(messageService);
        InputStream is = this.getClass().getResourceAsStream("/messages/LocationMsg.xml");
        RequestMessage vm =  messageService.unmarshallerRequestMessage(is);
        Assert.notNull(vm);
    }
    
    @Test
    public void testLinkMessage() throws JAXBException {
        Assert.notNull(messageService);
        InputStream is = this.getClass().getResourceAsStream("/messages/LinkMsg.xml");
        RequestMessage vm =  messageService.unmarshallerRequestMessage(is);
        Assert.notNull(vm);
    }
}
