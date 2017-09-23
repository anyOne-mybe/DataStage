
package com.guan.datastage.api.customer.vo;

import java.io.Serializable;

public class EsSearchResponse<T> implements Serializable
{
    private static final long serialVersionUID = -6156763835829454338L;

    private int took;
    private boolean timed_out;
    private EsShard _shards;
    private EsHits<T> hits;

    public int getTook()
    {
        return took;
    }

    public void setTook( int took )
    {
        this.took = took;
    }

    public boolean isTimed_out()
    {
        return timed_out;
    }

    public void setTimed_out( boolean timed_out )
    {
        this.timed_out = timed_out;
    }

    public EsShard get_shards()
    {
        return _shards;
    }

    public void set_shards( EsShard _shards )
    {
        this._shards = _shards;
    }

    public EsHits<T> getHits()
    {
        return hits;
    }

    public void setHits( EsHits<T> hits )
    {
        this.hits = hits;
    }

}
