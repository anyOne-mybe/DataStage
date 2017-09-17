
package com.guan.datastage.facade.user.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.guan.datastage.commom.util.ExceptionHandler;
import com.guan.datastage.domain.common.PagedResult;
import com.guan.datastage.domain.common.Pager;
import com.guan.datastage.domain.common.ServiceResponse;
import com.guan.datastage.domain.user.User;
import com.guan.datastage.facade.user.IUserFacade;
import com.guan.datastage.service.user.IUserService;

@Named
public class UserFacadeImpl implements IUserFacade
{

    @Inject
    private IUserService userService;

    @Override
    public ServiceResponse<User> getUserById( Long userId )
    {
        ServiceResponse<User> response = new ServiceResponse<User>();

        try
        {
            User data = userService.getUserById( userId );
            response.setData( data );
        } catch ( Exception e )
        {
            ExceptionHandler.handleException( response, e );
        }

        return response;
    }

    @Override
    public ServiceResponse<PagedResult<List<User>>> listUserByAge( int age,
            Pager pager )
    {
        ServiceResponse<PagedResult<List<User>>> response = new ServiceResponse<PagedResult<List<User>>>();

        try
        {
            PagedResult<List<User>> data = userService.listUserByAge( age,
                    pager );
            response.setData( data );
        } catch ( Exception e )
        {
            ExceptionHandler.handleException( response, e );
        }

        return response;
    }

}
