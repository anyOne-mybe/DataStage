
package com.guan.datastage.api.customer.vo;

import java.io.Serializable;
import java.util.Map;

public class EsMatchPhrase implements Serializable
{
    private static final long serialVersionUID = 2189753764427829036L;

    private Map<String, String> match_phrase;

    public Map<String, String> getMatch_phrase()
    {
        return match_phrase;
    }

    public void setMatch_phrase( Map<String, String> match_phrase )
    {
        this.match_phrase = match_phrase;
    }

}
