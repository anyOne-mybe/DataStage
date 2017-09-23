
package com.guan.datastage.api.customer.vo;

import java.io.Serializable;

public class TransformationVO<T> implements Serializable
{
    private static final long serialVersionUID = -5185003530113115268L;

    private T orignal;
    private String value;
    private boolean success;

    public T getOrignal()
    {
        return orignal;
    }

    public void setOrignal( T orignal )
    {
        this.orignal = orignal;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue( String value )
    {
        this.value = value;
    }

    public boolean isSuccess()
    {
        return success;
    }

    public void setSuccess( boolean success )
    {
        this.success = success;
    }

}
