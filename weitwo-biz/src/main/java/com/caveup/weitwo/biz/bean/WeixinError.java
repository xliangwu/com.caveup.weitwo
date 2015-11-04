package com.caveup.weitwo.biz.bean;

import java.io.Serializable;
import com.caveup.weitwo.biz.json.CusGsonBuilder;

/**
 * parse from JSON text
 * 
 * @author xw80329 下午11:38:41
 */
public class WeixinError implements JSON<WeixinError>, Serializable {

    private static final long serialVersionUID = -108832093466635074L;

    private int errcode;
    private String errmsg;

    @Override
    public void fromJson(String json) {
        WeixinError t = CusGsonBuilder.create().fromJson(json, WeixinError.class);
        this.errcode = t.getErrcode();
        this.errmsg = t.getErrmsg();
    }

    @Override
    public String toJson() {
        return CusGsonBuilder.create().toJson(this);
    }

    @Override
    public String toString() {
        return "WeixinError [errcode=" + errcode + ", errmsg=" + errmsg + "]";
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

}
