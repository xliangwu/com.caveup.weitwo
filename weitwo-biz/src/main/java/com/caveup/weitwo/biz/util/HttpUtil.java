package com.caveup.weitwo.biz.util;

import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;

public class HttpUtil {

    public static String openUrl(String url, HttpClient client, HttpHost httpProxy) throws RuntimeException {
        try {
            HttpGet httpGet = new HttpGet(url);
            if (httpProxy != null) {
                RequestConfig config = RequestConfig.custom().setProxy(httpProxy).build();
                httpGet.setConfig(config);
            }
            HttpResponse response = client.execute(httpGet);
            String responseText = new BasicResponseHandler().handleResponse(response);
            return responseText;
        } catch (ClientProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
