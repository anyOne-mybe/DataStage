
package com.guan.datastage.commom.util;

import java.lang.reflect.Field;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.guan.datastage.commom.constants.ErrooCode;
import com.guan.datastage.commom.exception.PamaterCheckException;

/**
 * 类说明
 * 
 * @author ****
 * @date 2017年8月4日 新建
 */
public class ParameterCheckUtil
{

    private static final Logger logger = LoggerFactory
            .getLogger( ParameterCheckUtil.class );

    public static <T> void checkPameterNotNull( T value, String fieldName )
    {
        checkNullValue( value, fieldName );
    }

    public static <T> void checkObjectPameterNotNull( T object,
            String fieldName )
    {

        Object value = getFieldValue( object, fieldName );

        checkNullValue( value, fieldName );
    }

    public static void checkStringBlank( String valueStr, String fieldName )
    {

        if ( StringUtils.isBlank( valueStr ) )
        {
            logger.error(
                    String.format( "parameter '%s' is of blank ", fieldName ) );
            throw new PamaterCheckException(
                    ErrooCode.System.CODE_PARAMETER_NULL,
                    ErrooCode.System.MSG_PARAMETER_NULL );
        }
    }

    private static <T> Object getFieldValue( T object, String fieldName )
    {
        try
        {
            Field field = object.getClass().getDeclaredField( fieldName );
            field.setAccessible( true );
            return field.get( object );
        } catch ( Exception e )
        {
            logger.error( String.format( "parameter object no such field of %s",
                    fieldName ) );
            throw new PamaterCheckException(
                    ErrooCode.System.CODE_PARAMETER_NULL,
                    ErrooCode.System.MSG_PARAMETER_NULL );
        }
    }

    private static void checkNullValue( Object value, String fieldName )
    {
        if ( value == null )
        {
            logger.error( String.format( "parameter '%s' is find of null value",
                    fieldName ) );
            throw new PamaterCheckException(
                    ErrooCode.System.CODE_PARAMETER_NULL,
                    ErrooCode.System.MSG_PARAMETER_NULL );
        }
    }

}
