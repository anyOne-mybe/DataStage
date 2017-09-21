
package com.guan.datastage.api.customer.vo;

import java.io.Serializable;

public class EsSetting implements Serializable
{

    private static final long serialVersionUID = -5412303863482684500L;
    private EsIndex index;

    public EsIndex getIndex()
    {
        return index;
    }

    public void setIndex( EsIndex index )
    {
        this.index = index;
    }

}
