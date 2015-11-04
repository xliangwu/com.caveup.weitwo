package com.caveup.weitwo.biz.bean;

import java.io.Serializable;
import com.caveup.weitwo.biz.json.CusGsonBuilder;

/**
 * parse from JSON text
 * 
 * @author xw80329 下午11:38:41
 */
public class AccessToken implements JSON<AccessToken>, Serializable {

    private static final long serialVersionUID = -108832093466635074L;

    private String accessToken;
    private int expiresIn = -1;

    @Override
    public void fromJson(String json) {
        AccessToken t = CusGsonBuilder.create().fromJson(json, AccessToken.class);
        this.accessToken = t.getAccessToken();
        this.expiresIn = t.getExpiresIn();
    }

    @Override
    public String toJson() {
        return CusGsonBuilder.create().toJson(this);
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    @Override
    public String toString() {
        return "AccessToken [accessToken=" + accessToken + ", expiresIn=" + expiresIn + "]";
    }

}
