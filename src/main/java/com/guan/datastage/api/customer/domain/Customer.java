
package com.guan.datastage.api.customer.domain;

import java.io.Serializable;

public class Customer implements Serializable
{

    private static final long serialVersionUID = -3241022781932789601L;
    private String id;
    private String name;
    private String customerCode;

    public String getId()
    {
        return id;
    }

    public void setId( String id )
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

    public String getCustomerCode()
    {
        return customerCode;
    }

    public void setCustomerCode( String customerCode )
    {
        this.customerCode = customerCode;
    }

}
