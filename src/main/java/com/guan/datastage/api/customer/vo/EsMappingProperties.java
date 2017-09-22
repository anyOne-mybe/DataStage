
package com.guan.datastage.api.customer.vo;

import java.io.Serializable;

public class EsMappingProperties implements Serializable
{

    private static final long serialVersionUID = -2181465574885238092L;

    private EsFileNameAnalyze properties;

    public EsFileNameAnalyze getProperties()
    {
        return properties;
    }

    public void setProperties( EsFileNameAnalyze properties )
    {
        this.properties = properties;
    }

}
