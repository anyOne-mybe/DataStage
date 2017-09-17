
package com.guan.datastage.api.customer.business.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.guan.datastage.api.customer.business.ICustomerBusiness;
import com.guan.datastage.api.customer.client.ICustomerElasticSearchClient;
import com.guan.datastage.api.customer.domain.Customer;
import com.guan.datastage.api.customer.vo.AddResponse;

@Named
public class CustomerBusinessImpl implements ICustomerBusiness
{

    @Inject
    private ICustomerElasticSearchClient customerElasticSearchClient;

    @Override
    public AddResponse addCustomer( Customer customer )
    {
        AddResponse response = customerElasticSearchClient
                .addCustomer( customer );

        return response;
    }

}
