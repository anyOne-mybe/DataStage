
package com.guan.datastage.api.customer.facade;

import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.guan.datastage.api.customer.domain.Customer;
import com.guan.datastage.api.customer.vo.AddResponse;
import com.guan.datastage.api.customer.vo.CreateIndexResponse;
import com.guan.datastage.domain.common.ServiceResponse;

@Path( "/customer" )
@Produces( MediaType.APPLICATION_JSON )
public interface ICustomerFacade
{
    @PUT
    @Path( "/fullNameIndex" )
    ServiceResponse<CreateIndexResponse> createCustomerFullNameIndex(
            @QueryParam( "shards" ) Integer shards,
            @QueryParam( "replicas" ) Integer replicas );

    @POST
    @Path( "/add" )
    ServiceResponse<AddResponse> addCustomer( Customer customer );
    
    
}
