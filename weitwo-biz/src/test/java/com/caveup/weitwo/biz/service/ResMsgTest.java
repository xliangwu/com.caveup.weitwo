package com.caveup.weitwo.biz.service;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.xml.bind.JAXBException;

import org.junit.Test;
import org.springframework.util.Assert;

import com.caveup.weitwo.biz.bean.ImageResponseMsg;
import com.caveup.weitwo.biz.bean.MusicResponseMsg;
import com.caveup.weitwo.biz.bean.NewsItem;
import com.caveup.weitwo.biz.bean.NewsResponseMsg;
import com.caveup.weitwo.biz.bean.MessageType;
import com.caveup.weitwo.biz.bean.TextResponseMsg;
import com.caveup.weitwo.biz.bean.VideoResponseMsg;
import com.caveup.weitwo.biz.bean.VoiceResponseMsg;

public class ResMsgTest extends TestSupport {

	@Resource
	private MessageService messageService;

	@Test
	public void testTextMessage() throws JAXBException {
		TextResponseMsg rm = new TextResponseMsg();
		rm.setContent("<#@>11");
		rm.setCreateTime(123456l);
		rm.setFromUserName("aa");
		rm.setMsgType(MessageType.TEXT);
		rm.setToUserName("cc");

		StringWriter writer = (StringWriter) messageService.marshallerResMsg(rm);
		String result = writer.toString();
		System.out.println(result);
		Assert.notNull(result);
	}
	
	@Test
	public void testImageMessage() throws JAXBException {
		ImageResponseMsg rm = new ImageResponseMsg();
		rm.setMediaId("abcderf");
		rm.setCreateTime(123456l);
		rm.setFromUserName("aa");
		rm.setMsgType(MessageType.IMAGE);
		rm.setToUserName("cc");

		StringWriter writer = (StringWriter) messageService.marshallerResMsg(rm);
		
		String result = writer.toString();
		System.out.println(result);
		Assert.notNull(result);
	}
	
	@Test
	public void testVoiceMessage() throws JAXBException {
		VoiceResponseMsg rm = new VoiceResponseMsg();
		rm.setMediaId("abcderf");
		rm.setCreateTime(123456l);
		rm.setFromUserName("aa");
		rm.setMsgType(MessageType.VOICE);
		rm.setToUserName("cc");

		StringWriter writer = (StringWriter) messageService.marshallerResMsg(rm);
		
		String result = writer.toString();
		System.out.println(result);
		Assert.notNull(result);
	}
	
	@Test
	public void testVideoMessage() throws JAXBException {
		VideoResponseMsg rm = new VideoResponseMsg();
		rm.setMediaId("abcderf");
		rm.setTitle("EEEE");
		rm.setDescription("ffff");
		rm.setCreateTime(123456l);
		rm.setFromUserName("aa");
		rm.setMsgType(MessageType.VIDEO);
		rm.setToUserName("cc");

		StringWriter writer = (StringWriter) messageService.marshallerResMsg(rm);
		
		String result = writer.toString();
		System.out.println(result);
		Assert.notNull(result);
	}
	
	@Test
	public void testMusicMessage() throws JAXBException {
		MusicResponseMsg rm = new MusicResponseMsg();
		rm.setDescription("aaa");
		rm.setHQMusicUrl("bbb");
		rm.setMusicUrl("ccc");
		rm.setThumbMediaId("ddd");
		rm.setTitle("EEEE");
		rm.setDescription("ffff");
		rm.setCreateTime(123456l);
		rm.setFromUserName("aa");
		rm.setMsgType(MessageType.MUSIC);
		rm.setToUserName("cc");

		StringWriter writer = (StringWriter) messageService.marshallerResMsg(rm);
		
		String result = writer.toString();
		System.out.println(result);
		Assert.notNull(result);
	}
	
	@Test
	public void testPicMessage() throws JAXBException {
		NewsResponseMsg rm = new NewsResponseMsg();
		rm.setCreateTime(123456l);
		rm.setFromUserName("aa");
		rm.setMsgType(MessageType.NEWS);
		rm.setToUserName("cc");
		
		List<NewsItem> items = new ArrayList<NewsItem>();
		NewsItem item1 = new NewsItem("4", "5", "6", "7");
		NewsItem item2 = new NewsItem("41", "51", "61", "71");
		items.add(item1);
		items.add(item2);
		
		rm.setArticles(items);
		rm.setArticleCount(2);

		StringWriter writer = (StringWriter) messageService.marshallerResMsg(rm);
		
		String result = writer.toString();
		System.out.println(result);
		Assert.notNull(result);
	}
}
