
package com.guan.datastage.api.customer.vo;

import java.io.Serializable;

public class MappingResult implements Serializable
{
    private static final long serialVersionUID = -5546327759778348384L;
    private Boolean acknowledged;

    public Boolean getAcknowledged()
    {
        return acknowledged;
    }

    public void setAcknowledged( Boolean acknowledged )
    {
        this.acknowledged = acknowledged;
    }

}
