package com.caveup.weitwo.biz.json;

import com.caveup.weitwo.biz.bean.AccessToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CusGsonBuilder {

    public static final GsonBuilder INSTANCE = new GsonBuilder();

    static {
        INSTANCE.disableHtmlEscaping();
        INSTANCE.registerTypeAdapter(AccessToken.class, new AccessTokenAdapter());
    }

    public static Gson create() {
        return INSTANCE.create();
    }

}
