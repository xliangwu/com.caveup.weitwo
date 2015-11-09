package com.caveup.weitwo.biz.core;

import com.caveup.weitwo.biz.bean.WeiConfig;

public class WeiApiUrlTemplate {

    private static final String WX_URL_ACCESS_TOKEN = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential";
    private static final String WX_URL_QR_CODE_TICKET = "https://api.weixin.qq.com/cgi-bin/qrcode/create?";
    private static final String WX_URL_QR_CODE_IMAGE = "https://mp.weixin.qq.com/cgi-bin/showqrcode?";

    public String getAccessTokenUrl(WeiConfig config) {
        StringBuilder url = new StringBuilder(WX_URL_ACCESS_TOKEN);
        url.append("&appid=").append(config.getCorpId());
        url.append("&secret=").append(config.getCorpSecret());
        return url.toString();
    }

    public String getQrCodeTiket(String token) {
        StringBuffer url = new StringBuffer(WX_URL_QR_CODE_TICKET);
        url.append("&access_token=").append(token);
        return url.toString();
    }

    public String getQrCode(String ticket) {
        StringBuffer url = new StringBuffer(WX_URL_QR_CODE_IMAGE);
        url.append("&ticket=").append(ticket);
        return url.toString();
    }
}
