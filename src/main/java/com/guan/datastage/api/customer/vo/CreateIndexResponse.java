
package com.guan.datastage.api.customer.vo;

import java.io.Serializable;

public class CreateIndexResponse implements Serializable
{
    private static final long serialVersionUID = -3598670897583761358L;

    private boolean acknowledged;
    private boolean shards_acknowledged;
    private String index;

    public boolean isAcknowledged()
    {
        return acknowledged;
    }

    public void setAcknowledged( boolean acknowledged )
    {
        this.acknowledged = acknowledged;
    }

    public boolean isShards_acknowledged()
    {
        return shards_acknowledged;
    }

    public void setShards_acknowledged( boolean shards_acknowledged )
    {
        this.shards_acknowledged = shards_acknowledged;
    }

    public String getIndex()
    {
        return index;
    }

    public void setIndex( String index )
    {
        this.index = index;
    }

}
