package com.caveup.weitwo.biz;

import org.junit.Test;
import com.caveup.weitwo.biz.bean.AccessToken;
import com.caveup.weitwo.biz.bean.WeixinError;

public class BeanTest {

    @Test
    public void test1() {
        String josn = "{\"access_token\":\"JTGYX8SwAGKJu25N0nXes-C1BLY9YhezEXhV0oMsR10Gwk1nrXGksq2PzvtszwyJ5O0yB9xs4yc0oynAguv-f8dNsX87-CRfBOqVmKQGsDgSGYhAIAIWO\",\"expires_in\":7200}";
        AccessToken token = new AccessToken();
        token.fromJson(josn);
        System.out.println(token);

        josn = "{\"errcode\":40013,\"errmsg\":\"invalid appid hint: [w50954vr18]\"}";
        WeixinError error = new WeixinError();
        error.fromJson(josn);
        System.out.println(error);
    }
}
