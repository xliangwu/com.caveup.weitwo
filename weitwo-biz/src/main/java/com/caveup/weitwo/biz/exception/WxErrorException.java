package com.caveup.weitwo.biz.exception;

import com.caveup.weitwo.biz.bean.WeixinError;

public class WxErrorException extends Exception {

    private static final long serialVersionUID = -7512973854681476382L;
    private WeixinError error;

    public WxErrorException(WeixinError error) {
        super(error.toString());
        this.error = error;
    }

    public WeixinError getError() {
        return error;
    }
}
