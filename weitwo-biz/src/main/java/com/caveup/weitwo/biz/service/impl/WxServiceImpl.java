package com.caveup.weitwo.biz.service.impl;

import java.util.Arrays;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;
import com.caveup.weitwo.biz.bean.EncryptType;
import com.caveup.weitwo.biz.bean.WeiConfig;
import com.caveup.weitwo.biz.service.WxService;

public class WxServiceImpl implements WxService, InitializingBean {

    private WeiConfig weiConfig;

    @Override
    public boolean checkSignature(String signature, String timestamp, String nonce, String echostr) {
        String[] inputs = new String[] { weiConfig.getToken(), timestamp, nonce };
        Arrays.sort(inputs);
        StringBuilder sb = new StringBuilder();
        for (String a : inputs) {
            sb.append(a);
        }
        String shaStr = DigestUtils.shaHex(sb.toString());
        return shaStr.equals(signature);
    }

    @Override
    public String getEchoTxt(String echostr) {
        if (this.weiConfig.getEncryptType() == EncryptType.PLAINTEXT.ordinal()) {
            return echostr;
        } else if (this.weiConfig.getEncryptType() == EncryptType.COMPATIBILITY.ordinal()) {
            return echostr;
        } else if (this.weiConfig.getEncryptType() == EncryptType.ENCRYPTION.ordinal()) {
            // TODO
        }
        return null;
    }

    @Override
    public WeiConfig getWeiConfig() {
        return weiConfig;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(weiConfig, "Property 'weiConfig' should be non-empty");
    }

    public void setWeiConfig(WeiConfig weiConfig) {
        this.weiConfig = weiConfig;
    }

}
