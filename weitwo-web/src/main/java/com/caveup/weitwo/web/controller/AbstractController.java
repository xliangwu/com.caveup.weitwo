package com.caveup.weitwo.web.controller;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import com.caveup.weitwo.biz.service.WxService;

public abstract class AbstractController implements Serializable {

    private static final long serialVersionUID = 1L;

    @Autowired
    protected WxService wxService;

    public WxService getWxService() {
        return wxService;
    }

    public void setWxService(WxService wxService) {
        this.wxService = wxService;
    }
}
