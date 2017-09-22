
package com.guan.datastage.api.customer.vo;

import java.io.Serializable;
import java.util.List;

public class AnalyzerResult implements Serializable
{

    private static final long serialVersionUID = 5257338172175569940L;
    private List<EsToken> tokens;

    public List<EsToken> getTokens()
    {
        return tokens;
    }

    public void setTokens( List<EsToken> tokens )
    {
        this.tokens = tokens;
    }

}
