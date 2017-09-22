
package com.guan.datastage.api.customer.vo;

import java.io.Serializable;

public class EsFileNameAnalyze implements Serializable
{

    private static final long serialVersionUID = -5646255986181322354L;
    private AnalyzerProperties aliasName;

    public AnalyzerProperties getAliasName()
    {
        return aliasName;
    }

    public void setAliasName( AnalyzerProperties aliasName )
    {
        this.aliasName = aliasName;
    }

}
