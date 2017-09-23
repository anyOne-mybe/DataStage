
package com.guan.datastage.api.customer.vo;

import java.io.Serializable;

public class EsQueryParam implements Serializable
{

    private static final long serialVersionUID = -6318139044398189443L;

    private EsMatchPhrase query;

    public EsMatchPhrase getQuery()
    {
        return query;
    }

    public void setQuery( EsMatchPhrase query )
    {
        this.query = query;
    }

}
