
package com.guan.datastage.commom.exception;

public class BaseRuntimeException extends Exception
{

    private static final long serialVersionUID = 2880442119725694599L;
    private int status;
    private String message;

    public BaseRuntimeException( int status,String message )
    {
        super();
        this.status = status;
        this.message = message;
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus( int status )
    {
        this.status = status;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage( String message )
    {
        this.message = message;
    }

}
