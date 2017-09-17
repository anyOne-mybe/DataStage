
package com.guan.datastage.service.user;

import java.util.List;

import com.guan.datastage.commom.exception.BaseBusinessException;
import com.guan.datastage.domain.common.PagedResult;
import com.guan.datastage.domain.common.Pager;
import com.guan.datastage.domain.user.User;

public interface IUserService
{
    /**
     * 根据用户id查询用户信息
     * 
     * @param userId
     * @return
     * @throws BaseBusinessException
     */
    User getUserById( Long userId ) throws BaseBusinessException;

    PagedResult<List<User>> listUserByAge( int age, Pager pager )
            throws BaseBusinessException;

}
