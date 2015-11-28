package com.caveup.weitwo.biz.service;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;
import javax.xml.bind.JAXBException;
import org.junit.Test;
import org.springframework.util.Assert;

import com.caveup.weitwo.biz.bean.ImageRequestMsg;
import com.caveup.weitwo.biz.bean.LinkRequestMsg;
import com.caveup.weitwo.biz.bean.LocationEventMsg;
import com.caveup.weitwo.biz.bean.LocationRequestMsg;
import com.caveup.weitwo.biz.bean.MenuEventMsg;
import com.caveup.weitwo.biz.bean.Message;
import com.caveup.weitwo.biz.bean.SubscribeEventMsg;
import com.caveup.weitwo.biz.bean.TextRequestMsg;
import com.caveup.weitwo.biz.bean.VideoRequestMsg;
import com.caveup.weitwo.biz.bean.VoiceRequestMsg;


public class ReqMsgTest extends TestSupport {
    
    @Resource
    private MessageService messageService;
    
    @Test
    public void testTextMessage() throws JAXBException, UnsupportedEncodingException {
        Assert.notNull(messageService);
        InputStream is = this.getClass().getResourceAsStream("/messages/TextMsg.xml");
        InputStreamReader sr = new InputStreamReader(is, "utf-8");
        Message tm =  messageService.unmarshallerReqMsg(sr, TextRequestMsg.class);
        System.out.println(tm.toString());
        Assert.notNull(tm);
    }
    
    @Test
    public void testImageMessage() throws JAXBException, UnsupportedEncodingException {
        Assert.notNull(messageService);
        InputStream is = this.getClass().getResourceAsStream("/messages/ImageMsg.xml");
        InputStreamReader sr = new InputStreamReader(is, "utf-8");
        Message tm =  messageService.unmarshallerReqMsg(sr, ImageRequestMsg.class);
        System.out.println(tm.toString());
        Assert.notNull(tm);
    }
    
    @Test
    public void testVoiceMessage() throws JAXBException, UnsupportedEncodingException {
        Assert.notNull(messageService);
        InputStream is = this.getClass().getResourceAsStream("/messages/VoiceMsg.xml");
        InputStreamReader sr = new InputStreamReader(is, "utf-8");
        Message tm =  messageService.unmarshallerReqMsg(sr, VoiceRequestMsg.class);
        System.out.println(tm.toString());
        Assert.notNull(tm);
    }
    
    @Test
    public void testVideoMessage() throws JAXBException, UnsupportedEncodingException {
        Assert.notNull(messageService);
        InputStream is = this.getClass().getResourceAsStream("/messages/VideoMsg.xml");
        InputStreamReader sr = new InputStreamReader(is, "utf-8");
        Message tm =  messageService.unmarshallerReqMsg(sr, VideoRequestMsg.class);
        System.out.println(tm.toString());
        Assert.notNull(tm);
    }
    
    @Test
    public void testShortVideoMessage() throws JAXBException, UnsupportedEncodingException {
        Assert.notNull(messageService);
        InputStream is = this.getClass().getResourceAsStream("/messages/ShortVideoMsg.xml");
        InputStreamReader sr = new InputStreamReader(is, "utf-8");
        Message tm =  messageService.unmarshallerReqMsg(sr, VideoRequestMsg.class);
        System.out.println(tm.toString());
        Assert.notNull(tm);
    }

    @Test
    public void testLocationMessage() throws JAXBException, UnsupportedEncodingException {
        Assert.notNull(messageService);
        InputStream is = this.getClass().getResourceAsStream("/messages/LocationMsg.xml");
        InputStreamReader sr = new InputStreamReader(is, "utf-8");
        Message tm =  messageService.unmarshallerReqMsg(sr, LocationRequestMsg.class);
        System.out.println(tm.toString());
        Assert.notNull(tm);
    }
    
    @Test
    public void testLinkMessage() throws JAXBException, UnsupportedEncodingException {
        Assert.notNull(messageService);
        InputStream is = this.getClass().getResourceAsStream("/messages/LinkMsg.xml");
        InputStreamReader sr = new InputStreamReader(is, "utf-8");
        Message tm =  messageService.unmarshallerReqMsg(sr, LinkRequestMsg.class);
        System.out.println(tm.toString());
        Assert.notNull(tm);
    }
    
    @Test
    public void testNormalSubscribeEvent() throws JAXBException, UnsupportedEncodingException {
        Assert.notNull(messageService);
        InputStream is = this.getClass().getResourceAsStream("/messages/NormalSubscribeEvent.xml");
        InputStreamReader sr = new InputStreamReader(is, "utf-8");
        Message tm =  messageService.unmarshallerReqMsg(sr, SubscribeEventMsg.class);
        System.out.println(tm.toString());
        Assert.notNull(tm);
    }
    
    @Test
    public void test2SubscribeEvent() throws JAXBException, UnsupportedEncodingException {
        Assert.notNull(messageService);
        InputStream is = this.getClass().getResourceAsStream("/messages/2SubscribeEvent.xml");
        InputStreamReader sr = new InputStreamReader(is, "utf-8");
        Message tm =  messageService.unmarshallerReqMsg(sr, SubscribeEventMsg.class);
        System.out.println(tm.toString());
        Assert.notNull(tm);
    }
    
    @Test
    public void testScanEvent() throws JAXBException, UnsupportedEncodingException {
        Assert.notNull(messageService);
        InputStream is = this.getClass().getResourceAsStream("/messages/ScanEvent.xml");
        InputStreamReader sr = new InputStreamReader(is, "utf-8");
        Message tm =  messageService.unmarshallerReqMsg(sr, SubscribeEventMsg.class);
        System.out.println(tm.toString());
        Assert.notNull(tm);
    }
    
    @Test
    public void testLocationEvent() throws JAXBException, UnsupportedEncodingException {
        Assert.notNull(messageService);
        InputStream is = this.getClass().getResourceAsStream("/messages/LocationEvent.xml");
        InputStreamReader sr = new InputStreamReader(is, "utf-8");
        Message tm =  messageService.unmarshallerReqMsg(sr, LocationEventMsg.class);
        System.out.println(tm.toString());
        Assert.notNull(tm);
    }
    
    @Test
    public void testMenu1Event() throws JAXBException, UnsupportedEncodingException {
        Assert.notNull(messageService);
        InputStream is = this.getClass().getResourceAsStream("/messages/Menu1Event.xml");
        InputStreamReader sr = new InputStreamReader(is, "utf-8");
        Message tm =  messageService.unmarshallerReqMsg(sr, MenuEventMsg.class);
        System.out.println(tm.toString());
        Assert.notNull(tm);
    }
    
    @Test
    public void testMenu2Event() throws JAXBException, UnsupportedEncodingException {
        Assert.notNull(messageService);
        InputStream is = this.getClass().getResourceAsStream("/messages/Menu2Event.xml");
        InputStreamReader sr = new InputStreamReader(is, "utf-8");
        Message tm =  messageService.unmarshallerReqMsg(sr, MenuEventMsg.class);
        System.out.println(tm.toString());
        Assert.notNull(tm);
    }
}
