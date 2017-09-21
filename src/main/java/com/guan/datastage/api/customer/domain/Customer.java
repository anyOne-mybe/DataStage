
package com.guan.datastage.api.customer.domain;

import java.io.Serializable;

public class Customer implements Serializable
{

    private static final long serialVersionUID = -3241022781932789601L;
    /**
     * 客户编码
     */
    private String customerCode;
    /**
     * 客户别名
     */
    private String aliasName;
    /**
     * 真实名称
     */
    private String realName;

    public String getCustomerCode()
    {
        return customerCode;
    }

    public void setCustomerCode( String customerCode )
    {
        this.customerCode = customerCode;
    }

    public String getAliasName()
    {
        return aliasName;
    }

    public void setAliasName( String aliasName )
    {
        this.aliasName = aliasName;
    }

    public String getRealName()
    {
        return realName;
    }

    public void setRealName( String realName )
    {
        this.realName = realName;
    }

}
