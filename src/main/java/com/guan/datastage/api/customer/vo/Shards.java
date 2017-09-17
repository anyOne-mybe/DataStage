
package com.guan.datastage.api.customer.vo;

import java.io.Serializable;

public class Shards implements Serializable
{

    private static final long serialVersionUID = -8975820648869389379L;

    private long total;
    private long successful;
    private long failed;

    public long getTotal()
    {
        return total;
    }

    public void setTotal( long total )
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

    public long getFailed()
    {
        return failed;
    }

    public void setFailed( long failed )
    {
        this.failed = failed;
    }

}
