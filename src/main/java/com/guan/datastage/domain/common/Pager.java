
package com.guan.datastage.domain.common;

import java.io.Serializable;

/**
 * 类说明
 * 
 * @author ****
 * @date 2017年7月17日 新建
 */
public class Pager implements Serializable
{

    private static final long serialVersionUID = 1363818005641187651L;

    private int pageSize;
    private int currentPage;
    private long totalRows;

    public int getPageSize()
    {
        return pageSize;
    }

    public void setPageSize( int pageSize )
    {
        this.pageSize = pageSize;
    }

    public int getCurrentPage()
    {
        return currentPage;
    }

    public void setCurrentPage( int currentPage )
    {
        this.currentPage = currentPage;
    }

    public long getTotalRows()
    {
        return totalRows;
    }

    public void setTotalRows( long totalRows )
    {
        this.totalRows = totalRows;
    }

    public long getTotalPages()
    {
        return pageSize == 0 ? 0 : (totalRows + pageSize - 1) / pageSize;
    }

}
