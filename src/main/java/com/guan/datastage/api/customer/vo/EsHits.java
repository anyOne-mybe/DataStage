
package com.guan.datastage.api.customer.vo;

import java.io.Serializable;
import java.util.List;

public class EsHits<T> implements Serializable
{
    private static final long serialVersionUID = 7944524258193651314L;

    private int total;
    private int max_score;
    private List<HitContent<T>> hits;

    public int getTotal()
    {
        return total;
    }

    public void setTotal( int total )
    {
        this.total = total;
    }

    public int getMax_score()
    {
        return max_score;
    }

    public void setMax_score( int max_score )
    {
        this.max_score = max_score;
    }

    public List<HitContent<T>> getHits()
    {
        return hits;
    }

    public void setHits( List<HitContent<T>> hits )
    {
        this.hits = hits;
    }

}
