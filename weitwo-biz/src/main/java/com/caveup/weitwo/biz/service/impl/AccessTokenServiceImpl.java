package com.caveup.weitwo.biz.service.impl;

import static com.caveup.weitwo.biz.core.Const.K_ACCESS_TOKEN_AHEAD;
import java.util.Observable;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.caveup.weitwo.biz.bean.AccessToken;
import com.caveup.weitwo.biz.bean.WeiConfig;
import com.caveup.weitwo.biz.bean.WeixinError;
import com.caveup.weitwo.biz.core.WeiApiUrlTemplate;
import com.caveup.weitwo.biz.core.WeiSession;
import com.caveup.weitwo.biz.exception.WxErrorException;
import com.caveup.weitwo.biz.service.AccessTokenService;
import com.caveup.weitwo.biz.util.HttpUtil;

/**
 * Not Thread Safe
 * 
 * @author xw80329 下午10:15:31
 */
public class AccessTokenServiceImpl implements AccessTokenService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccessTokenServiceImpl.class);

    private volatile long lastRefreshTime = -1;
    private WeiConfig weiConfig;
    private WeiApiUrlTemplate urlTemplate;
    private HttpClient httpClient;
    private HttpHost httpProxy;

    @Override
    public void update(Observable o, Object arg) {
        this.refresh(true);
    }

    @Override
    public void refresh(boolean force) {
        WeiSession session = WeiSession.getInstance();
        AccessToken token = session.getAccessToken();
        long expires = null == token ? -1 : token.getExpiresIn();
        boolean expired = System.currentTimeMillis() >= lastRefreshTime + expires + K_ACCESS_TOKEN_AHEAD;
        boolean refreshed = force || expired;

        if (refreshed) {
            token = getAccessToken();
            session.updateAccessToken(token);
        }
    }

    private AccessToken getAccessToken() {
        lastRefreshTime = System.currentTimeMillis();
        try {
            String response = HttpUtil.openUrl(urlTemplate.getAccessTokenUrl(weiConfig), httpClient, httpProxy);
            WeixinError error = new WeixinError();
            error.fromJson(response);
            if (error.getErrcode() != 0) {
                throw new WxErrorException(error);
            }
            AccessToken accessToken = new AccessToken();
            accessToken.fromJson(response);
            return accessToken;
        } catch (Exception e) {
            LOGGER.error("Get access token failed with " + e.getMessage(), e);
        }
        return null;
    }

    public WeiConfig getWeiConfig() {
        return weiConfig;
    }

    public void setWeiConfig(WeiConfig weiConfig) {
        this.weiConfig = weiConfig;
        String httpProxyHost = weiConfig.getHttpProxyHost();
        int httpProxyPort = weiConfig.getHttpProxyPort();
        String httpProxyUsername = weiConfig.getHttpProxyUsername();
        String httpProxyPasswd = weiConfig.getHttpProxyPassword();

        if (StringUtils.isNotBlank(httpProxyHost)) {
            if (StringUtils.isNotBlank(httpProxyUsername)) {
                CredentialsProvider credsProvider = new BasicCredentialsProvider();
                credsProvider.setCredentials(new AuthScope(httpProxyHost, httpProxyPort),
                        new UsernamePasswordCredentials(httpProxyUsername, httpProxyPasswd));
                httpClient = HttpClients.custom().setDefaultCredentialsProvider(credsProvider).build();
            } else {
                httpClient = HttpClients.createDefault();
            }
            httpProxy = new HttpHost(httpProxyHost, httpProxyPort);
        } else {
            httpClient = HttpClients.createDefault();
        }
    }

    public void setUrlTemplate(WeiApiUrlTemplate urlTemplate) {
        this.urlTemplate = urlTemplate;
    }

}
