
package com.guan.datastage.data.user.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guan.datastage.dao.user.UserMapper;
import com.guan.datastage.data.user.IUserData;
import com.guan.datastage.domain.common.PagedResult;
import com.guan.datastage.domain.common.Pager;
import com.guan.datastage.domain.user.User;
import com.guan.datastage.domain.user.UserExample;
import com.guan.datastage.domain.user.UserExample.Criteria;

/**
 * 类说明
 * 
 * @author ****
 * @date 2017年8月4日 新建
 */
@Named
public class UserDataImpl implements IUserData
{

    @Inject
    private UserMapper userMapper;

    @Override
    public User getUserById( Long userId )
    {
        return userMapper.selectByPrimaryKey( userId );
    }

    @Override
    public List<User> getUserByIds( List<Long> userIds )
    {
        UserExample example = new UserExample();
        Criteria criteria = example.createCriteria();
        criteria.andIdIn( userIds );

        return userMapper.selectByExample( example );
    }

    @Override
    public PagedResult<List<User>> listUsersPage( Pager pager, int age )
    {
        // 设置分页查询
        PageHelper.startPage( pager.getCurrentPage(), pager.getPageSize() );
        UserExample example = new UserExample();
        Criteria criteria = example.createCriteria();
        criteria.andAgeEqualTo( age );

        List<User> users = userMapper.selectByExample( example );

        // 获取分页信息
        PageInfo<User> pageInfo = new PageInfo<User>( users );
        PagedResult<List<User>> pagedResults = new PagedResult<>();
        pagedResults.setDatas( users );
        pagedResults.setPager( pager );
        pager.setTotalRows( pageInfo.getTotal() );

        return pagedResults;
    }

}
