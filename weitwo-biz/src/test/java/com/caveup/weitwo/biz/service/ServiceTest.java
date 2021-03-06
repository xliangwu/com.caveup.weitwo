package com.caveup.weitwo.biz.service;

import javax.annotation.Resource;
import org.junit.Test;
import org.springframework.util.Assert;
import com.caveup.weitwo.biz.core.WeiSession;
import com.caveup.weitwo.biz.domain.dataobject.Member;

public class ServiceTest extends TestSupport {

    @Resource
    private AccessTokenService accessTokenService;

    @Resource
    private WxService wxService;

    @Resource
    private SSOService ssoService;

    @Test
    public void testAccessToken() {
        Assert.notNull(accessTokenService);
        accessTokenService.refresh(true);
        Assert.notNull(WeiSession.getInstance().getAccessToken());
        System.out.println(WeiSession.getInstance().getAccessToken());

        // again
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        accessTokenService.refresh(false);
        Assert.notNull(WeiSession.getInstance().getAccessToken());
        System.out.println(WeiSession.getInstance().getAccessToken());
    }

    @Test
    public void testSign() {
        boolean valid = wxService.checkSignature("11", "11111", "111", "23424234");
        Assert.isTrue(!valid, "valid request");
    }

    @Test
    public void testMember() {
        Member member = ssoService.getUserByPrimaryKey(-1L);
        Assert.isNull(member);
    }
}
