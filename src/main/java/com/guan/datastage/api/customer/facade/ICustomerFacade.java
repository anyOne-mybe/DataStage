
package com.guan.datastage.api.customer.facade;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.guan.datastage.api.customer.domain.Customer;
import com.guan.datastage.api.customer.vo.AddResponse;
import com.guan.datastage.domain.common.ServiceResponse;

@Path( "/customer" )
@Produces( MediaType.APPLICATION_JSON )
public interface ICustomerFacade
{

    @POST
    @Path( "/add" )
    ServiceResponse<AddResponse> addCustomer( Customer customer );
}
