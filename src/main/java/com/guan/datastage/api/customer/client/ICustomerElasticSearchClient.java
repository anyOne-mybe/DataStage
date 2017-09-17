
package com.guan.datastage.api.customer.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.guan.datastage.api.customer.constants.ElasticSearchProperties;
import com.guan.datastage.api.customer.domain.Customer;
import com.guan.datastage.api.customer.vo.AddResponse;

@Path( "/" + ElasticSearchProperties.CUSTOMER_FULL_NAME_INDEX )
@Produces( MediaType.APPLICATION_JSON )
@Consumes( MediaType.APPLICATION_JSON )
public interface ICustomerElasticSearchClient
{

    @POST
    @Path( "/" + ElasticSearchProperties.CUSTOMER_FULL_NAME_TYPE + "" )
    AddResponse addCustomer( Customer customer );
}
