
package com.guan.datastage.domain.common;

import java.io.Serializable;

/**
 * 类说明
 * 
 * @author ****
 * @date 2017年7月17日 新建
 */
public class PagedResult<T> implements Serializable

{

    private static final long serialVersionUID = 8504696759197272356L;

    private T datas;
    private Pager pager;

    public T getDatas()
    {
        return datas;
    }

    public void setDatas( T datas )
    {
        this.datas = datas;
    }

    public Pager getPager()
    {
        return pager;
    }

    public void setPager( Pager pager )
    {
        this.pager = pager;
    }

}
