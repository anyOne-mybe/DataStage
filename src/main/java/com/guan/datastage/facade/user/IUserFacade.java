
package com.guan.datastage.facade.user;

import java.util.List;
import com.guan.datastage.domain.common.PagedResult;
import com.guan.datastage.domain.common.Pager;
import com.guan.datastage.domain.common.ServiceResponse;
import com.guan.datastage.domain.user.User;

public interface IUserFacade
{

    ServiceResponse<User> getUserById( Long userId );

    ServiceResponse<PagedResult<List<User>>> listUserByAge( int age,
            Pager pager );

}
