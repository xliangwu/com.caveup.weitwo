package com.caveup.weitwo.biz.service.impl;

import com.caveup.weitwo.biz.mybatis.mapper.UserMemberMapper;

public abstract class AbstractDaoService {

    protected UserMemberMapper userMemberMapper;

    public UserMemberMapper getUserMemberMapper() {
        return userMemberMapper;
    }

    public void setUserMemberMapper(UserMemberMapper userMemberMapper) {
        this.userMemberMapper = userMemberMapper;
    }

}
