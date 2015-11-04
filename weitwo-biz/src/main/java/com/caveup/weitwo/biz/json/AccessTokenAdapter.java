package com.caveup.weitwo.biz.json;

import java.lang.reflect.Type;
import com.caveup.weitwo.biz.bean.AccessToken;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class AccessTokenAdapter implements JsonDeserializer<AccessToken> {

    public AccessToken deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        AccessToken accessToken = new AccessToken();
        JsonObject accessTokenJsonObject = json.getAsJsonObject();

        if (accessTokenJsonObject.get("access_token") != null
                && !accessTokenJsonObject.get("access_token").isJsonNull()) {
            accessToken.setAccessToken(GsonHelper.getAsString(accessTokenJsonObject.get("access_token")));
        }
        if (accessTokenJsonObject.get("expires_in") != null && !accessTokenJsonObject.get("expires_in").isJsonNull()) {
            accessToken.setExpiresIn(GsonHelper.getAsPrimitiveInt(accessTokenJsonObject.get("expires_in")));
        }
        return accessToken;
    }

}
