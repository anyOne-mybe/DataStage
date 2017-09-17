
package com.guan.datastage.business.user.impl;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import com.guan.datastage.business.user.IUserBusiness;
import com.guan.datastage.commom.exception.BaseBusinessException;
import com.guan.datastage.data.user.IUserData;
import com.guan.datastage.domain.common.PagedResult;
import com.guan.datastage.domain.common.Pager;
import com.guan.datastage.domain.user.User;

@Named
public class UserBusinessImpl implements IUserBusiness
{
    @Inject
    private IUserData userData;

    @Override
    public User getUserById( Long userId ) throws BaseBusinessException
    {
        return userData.getUserById( userId );
    }

    @Override
    public PagedResult<List<User>> listUserByAge( int age, Pager pager )
            throws BaseBusinessException
    {
        return userData.listUsersPage( pager, age );
    }

}
