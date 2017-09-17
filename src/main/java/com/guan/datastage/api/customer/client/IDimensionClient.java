
package com.guan.datastage.api.customer.client;

import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path( "/multy" )
@Consumes( MediaType.APPLICATION_JSON )
@Produces( MediaType.APPLICATION_JSON )
public interface IDimensionClient
{
    @POST
    @Path( "/test" )
    String test123( Map<String, String> params );
}
