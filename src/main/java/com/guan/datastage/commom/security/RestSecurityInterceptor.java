
package com.guan.datastage.commom.security;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

/**
 * 类说明
 * 
 * @author ****
 * @date 2017年8月5日 新建
 */
public class RestSecurityInterceptor extends AbstractPhaseInterceptor<Message>
{

    public RestSecurityInterceptor()
    {
        super( Phase.RECEIVE );
    }

    public RestSecurityInterceptor( String phase )
    {
        super( Phase.RECEIVE );
    }

    @SuppressWarnings( {"unchecked", "rawtypes"} )
    @Override
    public void handleMessage( Message message ) throws Fault
    {
        System.out.println( message );
        Map<String, List> headers = (Map<String, List>)message
                .get( Message.PROTOCOL_HEADERS );
        String token = "hrsj MCC ";
        String base64Token = Base64.encodeBase64String( token.getBytes() );

        headers.put( "Authorization",
                Collections.singletonList( "Base 64 " + base64Token ) );
    }

    public static void main( String[] args )
    {
        String token = "hrsj MCC ";
        String base64Token = Base64.encodeBase64String( token.getBytes() );
        System.out.println( base64Token );
    }

}
