
package com.guan.datastage.api.customer.business;

import com.guan.datastage.api.customer.domain.Customer;
import com.guan.datastage.api.customer.vo.AddResponse;
import com.guan.datastage.api.customer.vo.CreateIndexResponse;

public interface ICustomerBusiness
{
    AddResponse addCustomer( Customer customer );

    CreateIndexResponse createCustomerFullNameIndex( Integer shards,
            Integer replicas );

    void accurateSearchCustomerAliseName( String aliasName );

}
