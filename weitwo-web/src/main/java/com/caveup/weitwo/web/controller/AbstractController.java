package com.caveup.weitwo.web.controller;

import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import com.caveup.weitwo.biz.bean.Constants;
import com.caveup.weitwo.biz.service.WxService;

public abstract class AbstractController implements Serializable {

    private static final long serialVersionUID = 1L;

    @Autowired
    protected WxService wxService;

    protected boolean isLogined(HttpServletRequest req) {
        return null == req.getSession().getAttribute(Constants.KEY_SESSION_USER);
    }

    public WxService getWxService() {
        return wxService;
    }

    public void setWxService(WxService wxService) {
        this.wxService = wxService;
    }
}
