
package com.guan.datastage.api.customer.domain;

import java.io.Serializable;

public class Customer implements Serializable
{

    private static final long serialVersionUID = -3241022781932789601L;
    private Long id;
    private String name;

    public Long getId()
    {
        return id;
    }

    public void setId( Long id )
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

}
