
package com.guan.datastage.commom.exception;

/**
 * 类说明
 * 
 * @author ****
 * @date 2017年8月4日 新建
 */
public class PamaterCheckException extends BaseBusinessException
{
    private static final long serialVersionUID = 326471832103244291L;

    public PamaterCheckException( int status,String message )
    {
        super( status, message );
    }
}
