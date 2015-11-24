package com.caveup.weitwo.biz.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import com.caveup.weitwo.biz.domain.dataobject.Member;

public interface UserMemberMapper {

    /**
     * get the member by given account
     * 
     * @return
     */
    Member findByEmail(@Param("email") String email, @Param("type") String type);

    /**
     * Save a member
     * 
     * @param member
     */
    void insert(Member member) throws Exception;

    /**
     * Update a member
     * 
     * @param member
     */
    void updateLogin(Member member);

    /**
     * Query by id
     * 
     * @param id
     * @return
     */
    Member findById(@Param("id") long id);

    /**
     * 
     * @param id
     * @return
     */
    Member getUserByPrimaryKey(@Param("id") long id);

    /**
     * 
     * @param member
     */
    void updateMemberById(Member member);

    /**
     * 
     * @param id
     */
    void deleteMemberById(@Param("id") String id);

}
