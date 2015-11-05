package com.caveup.weitwo.biz.service;

import java.util.Observer;
import com.caveup.weitwo.biz.bean.WeiConfig;

public interface AccessTokenService extends Observer {

    public void setWeiConfig(WeiConfig config);

    public void refresh(boolean force);
}
