package com.caveup.weitwo.biz.core;

import static com.caveup.weitwo.biz.core.Const.K_ACCESS_TOKEN;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import com.caveup.weitwo.biz.bean.AccessToken;

/**
 * Cache
 * 
 * @author xw80329 下午10:20:19
 */
public final class WeiSession implements Serializable {

    private static final long serialVersionUID = -3110602174761588640L;

    private static final Map<String, Object> CACHE = new ConcurrentHashMap<String, Object>();
    private static final WeiSession SESSION = new WeiSession();

    /** private **/
    private WeiSession() {
    }

    public static WeiSession getInstance() {
        return SESSION;
    }

    public void addObject(String key, Object value) {
        CACHE.put(key, value);
    }

    public Object getObject(String key) {
        return CACHE.get(key);
    }

    public boolean containsKey(String key) {
        return CACHE.containsKey(key);
    }

    public AccessToken getAccessToken() {
        if (CACHE.containsKey(K_ACCESS_TOKEN)) {
            return (AccessToken) this.getObject(K_ACCESS_TOKEN);
        }
        return null;
    }

    public void updateAccessToken(AccessToken token) {
        this.addObject(K_ACCESS_TOKEN, token);
    }

    public void clear() {
        CACHE.clear();
    }

}
