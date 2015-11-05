package com.caveup.weitwo.biz.core;

import com.caveup.weitwo.biz.bean.WeiConfig;

public class WeiApiUrlTemplate {

    private static final String WX_URL_ACCESS_TOKEN = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential";

    public String getAccessTokenUrl(WeiConfig config) {
        StringBuilder url = new StringBuilder(WX_URL_ACCESS_TOKEN);
        url.append("&appid=").append(config.getCorpId());
        url.append("&secret=").append(config.getCorpSecret());
        return url.toString();
    }
}
