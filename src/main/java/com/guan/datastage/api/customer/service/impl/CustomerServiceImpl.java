
package com.guan.datastage.api.customer.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.guan.datastage.api.customer.business.ICustomerBusiness;
import com.guan.datastage.api.customer.domain.Customer;
import com.guan.datastage.api.customer.service.ICustomerService;
import com.guan.datastage.api.customer.vo.AddResponse;
import com.guan.datastage.api.customer.vo.CreateIndexResponse;

@Named
public class CustomerServiceImpl implements ICustomerService
{

    @Inject
    private ICustomerBusiness customerBusiness;

    @Override
    public AddResponse addCustomer( Customer customer )
    {
        return customerBusiness.addCustomer( customer );
    }

    @Override
    public CreateIndexResponse createCustomerFullNameIndex( Integer shards,
            Integer replicas )
    {
        return customerBusiness.createCustomerFullNameIndex( shards, replicas );
    }

}
