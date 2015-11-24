package com.caveup.weitwo.biz.service;

import com.caveup.weitwo.biz.bean.Result;
import com.caveup.weitwo.biz.domain.dataobject.Member;

/**
 * 
 * @author xw80329 下午11:17:16
 */
public interface SSOService {

    public Result isValidUser(String email, String passwd);

    public Member getUserByEmail(String email);

    public Member getUserByPrimaryKey(long id);

}
