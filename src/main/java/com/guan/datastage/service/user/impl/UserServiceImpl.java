
package com.guan.datastage.service.user.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.guan.datastage.business.user.IUserBusiness;
import com.guan.datastage.commom.exception.BaseBusinessException;
import com.guan.datastage.commom.util.ParameterCheckUtil;
import com.guan.datastage.domain.common.PagedResult;
import com.guan.datastage.domain.common.Pager;
import com.guan.datastage.domain.user.User;
import com.guan.datastage.service.user.IUserService;

@Named
public class UserServiceImpl implements IUserService
{
    @Inject
    private IUserBusiness userBusiness;

    @Override
    public User getUserById( Long userId ) throws BaseBusinessException
    {
        // 入参简单校验
        ParameterCheckUtil.checkPameterNotNull( userId, "userId" );

        return userBusiness.getUserById( userId );
    }

    @Override
    public PagedResult<List<User>> listUserByAge( int age, Pager pager )
            throws BaseBusinessException
    {
        return userBusiness.listUserByAge( age, pager );
    }

}
