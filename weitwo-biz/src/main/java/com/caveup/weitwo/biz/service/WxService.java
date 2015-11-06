package com.caveup.weitwo.biz.service;

import com.caveup.weitwo.biz.bean.WeiConfig;

public interface WxService {

    /**
     * @param signature
     * @param timestamp
     * @param nonce
     * @param echostr
     * @return
     */
    public boolean checkSignature(String signature, String timestamp, String nonce, String echostr);

    /**
     * return echo text message
     * 
     * @return
     */
    public String getEchoTxt(String echostr);

    /**
     * Get Weixin global CONFIG
     * 
     * @return
     */
    public WeiConfig getWeiConfig();
}
