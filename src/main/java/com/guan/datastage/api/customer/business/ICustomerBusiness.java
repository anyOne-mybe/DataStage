
package com.guan.datastage.api.customer.business;

import java.util.List;

import com.guan.datastage.api.customer.domain.Customer;
import com.guan.datastage.api.customer.vo.AddResponse;
import com.guan.datastage.api.customer.vo.AnalyzerResult;
import com.guan.datastage.api.customer.vo.CreateIndexResponse;
import com.guan.datastage.api.customer.vo.EsMappingProperties;
import com.guan.datastage.api.customer.vo.MappingResult;

public interface ICustomerBusiness
{
    AddResponse addCustomer( Customer customer );

    CreateIndexResponse createCustomerFullNameIndex( Integer shards,
            Integer replicas );

    List<Customer> accurateSearchCustomerAliseName( String aliasName );

    MappingResult customerFullNameMapping(
            EsMappingProperties esMappingProperties );

    AnalyzerResult analyze( String text, String tokenizer );

}
