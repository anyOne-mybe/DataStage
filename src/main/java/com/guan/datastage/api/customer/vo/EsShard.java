
package com.guan.datastage.api.customer.vo;

import java.io.Serializable;

public class EsShard implements Serializable
{
    private static final long serialVersionUID = -7497150818752242213L;

    private int total;
    private long successful;
    private long skipped;
    private long failed;

    public int getTotal()
    {
        return total;
    }

    public void setTotal( int total )
    {
        this.total = total;
    }

    public long getSuccessful()
    {
        return successful;
    }

    public void setSuccessful( long successful )
    {
        this.successful = successful;
    }

    public long getSkipped()
    {
        return skipped;
    }

    public void setSkipped( long skipped )
    {
        this.skipped = skipped;
    }

    public long getFailed()
    {
        return failed;
    }

    public void setFailed( long failed )
    {
        this.failed = failed;
    }

}
