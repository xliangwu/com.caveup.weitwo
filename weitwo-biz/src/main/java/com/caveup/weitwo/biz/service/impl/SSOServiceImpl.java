package com.caveup.weitwo.biz.service.impl;

import java.util.Date;
import com.caveup.weitwo.biz.bean.Constants;
import com.caveup.weitwo.biz.bean.ErrorCode;
import com.caveup.weitwo.biz.bean.Result;
import com.caveup.weitwo.biz.domain.dataobject.Member;
import com.caveup.weitwo.biz.service.SSOService;
import com.caveup.weitwo.biz.util.PasswordUtil;

public class SSOServiceImpl extends AbstractDaoService implements SSOService {

    public Result isValidUser(String account, String passwd) {
        Result result = new Result();
        Member member = userMemberMapper.findByEmail(account, null);
        if (null != member) {
            if (PasswordUtil.authenticatePassword(member.getEncryptPassword(), passwd)) {
                if (!Constants.USER_STATUS_IN_ACTIVE.equals(member.getStatus())) {
                    member.setLoginCount(member.getLoginCount() + 1);
                    member.setLastLogin(new Date());
                    userMemberMapper.updateLogin(member);
                    result.setValid(true);
                } else {
                    result.setValid(false);
                    result.setErrorCode(ErrorCode.LOGIN_ACCOUNT_INACTIVE);
                }
            } else {
                result.setValid(false);
                result.setErrorCode(ErrorCode.LOGIN_INVALID_PASSWORD);
            }
        } else {
            result.setValid(false);
            result.setErrorCode(ErrorCode.LOGIN_INVALID_ACCOUNT);
        }

        return result;
    }

    public Member getUserByEmail(String account) {
        return userMemberMapper.findByEmail(account, null);
    }

    public Member getUserByPrimaryKey(long id) {
        return userMemberMapper.getUserByPrimaryKey(id);
    }

}
