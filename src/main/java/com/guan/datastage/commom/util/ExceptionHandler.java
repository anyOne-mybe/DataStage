
package com.guan.datastage.commom.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.guan.datastage.commom.constants.ErrooCode;
import com.guan.datastage.commom.exception.BaseBusinessException;
import com.guan.datastage.commom.exception.BaseRuntimeException;
import com.guan.datastage.domain.common.ServiceResponse;

public class ExceptionHandler
{
    private static final Logger logger = LoggerFactory
            .getLogger( ExceptionHandler.class );

    public static <T> void handleException( ServiceResponse<T> response,
            Exception e )
    {

        if ( e instanceof BaseRuntimeException )
        {
            BaseRuntimeException baseRuntimeException = (BaseRuntimeException)e;
            response.setStatus( baseRuntimeException.getStatus() );
            response.setMessage( baseRuntimeException.getMessage() );

        } else if ( e instanceof BaseBusinessException )
        {
            BaseBusinessException baseBusinessException = (BaseBusinessException)e;
            response.setStatus( baseBusinessException.getStatus() );
            response.setMessage( baseBusinessException.getMessage() );
        } else
        {
            response.setStatus( ErrooCode.System.CODE_UNKNOWN_ERROR );
            response.setMessage( ErrooCode.System.MSG_UNKNOWN_ERROR );
        }

        logger.error( "Catch system error :", e );
    }

}
