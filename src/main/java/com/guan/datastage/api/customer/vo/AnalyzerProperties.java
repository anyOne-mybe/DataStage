
package com.guan.datastage.api.customer.vo;

import java.io.Serializable;

public class AnalyzerProperties implements Serializable
{

    private static final long serialVersionUID = 7274582894667164287L;

    private String type;
    private String analyzer;
    private String search_analyzer;

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public String getAnalyzer()
    {
        return analyzer;
    }

    public void setAnalyzer( String analyzer )
    {
        this.analyzer = analyzer;
    }

    public String getSearch_analyzer()
    {
        return search_analyzer;
    }

    public void setSearch_analyzer( String search_analyzer )
    {
        this.search_analyzer = search_analyzer;
    }

}
