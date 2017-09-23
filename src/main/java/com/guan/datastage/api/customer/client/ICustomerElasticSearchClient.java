
package com.guan.datastage.api.customer.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.guan.datastage.api.customer.constants.ElasticSearchProperties;
import com.guan.datastage.api.customer.domain.Customer;
import com.guan.datastage.api.customer.vo.AddResponse;
import com.guan.datastage.api.customer.vo.AnalyzerResult;
import com.guan.datastage.api.customer.vo.CreateIndexResponse;
import com.guan.datastage.api.customer.vo.EsMappingProperties;
import com.guan.datastage.api.customer.vo.EsParameter;
import com.guan.datastage.api.customer.vo.EsQueryParam;
import com.guan.datastage.api.customer.vo.EsSearchResponse;
import com.guan.datastage.api.customer.vo.MappingResult;

@Path( "/" + ElasticSearchProperties.CUSTOMER_FULL_NAME_INDEX )
@Produces( MediaType.APPLICATION_JSON )
@Consumes( MediaType.APPLICATION_JSON )
public interface ICustomerElasticSearchClient
{

    /**
     * 创建客户全名Index
     * 
     * @return
     */
    @PUT
    @Path( "" )
    CreateIndexResponse createCustomerFullNameIndex();

    /**
     * 创建客户全名Index，自定义配置
     * 
     * @return
     */
    @PUT
    @Path( "" )
    CreateIndexResponse createCustomerFullNameIndex( EsParameter parameter );

    /**
     * 客户全名插入数据
     * 
     * @param customer
     * @return
     */
    @POST
    @Path( "/" + ElasticSearchProperties.CUSTOMER_FULL_NAME_TYPE )
    AddResponse addCustomer( Customer customer );

    /**
     * 分词mapping
     * 
     * @param analyzerProperties
     * @return
     */
    @POST
    @Path( "/" + ElasticSearchProperties.CUSTOMER_FULL_NAME_TYPE + "/_mapping" )
    MappingResult customerFullNameMapping(
            EsMappingProperties esMappingProperties );

    @GET
    @Path( "/_analyze" )
    AnalyzerResult analyze( @QueryParam( "text" ) String text,
            @QueryParam( "tokenizer" ) String tokenizer );

    @POST
    @Path( "/" + ElasticSearchProperties.CUSTOMER_FULL_NAME_TYPE + "/_search" )
    EsSearchResponse<Customer> matchePhraseQuery( EsQueryParam queryParam );

}
