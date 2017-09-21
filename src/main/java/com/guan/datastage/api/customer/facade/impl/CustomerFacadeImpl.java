
package com.guan.datastage.api.customer.facade.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.guan.datastage.api.customer.domain.Customer;
import com.guan.datastage.api.customer.facade.ICustomerFacade;
import com.guan.datastage.api.customer.service.ICustomerService;
import com.guan.datastage.api.customer.vo.AddResponse;
import com.guan.datastage.api.customer.vo.CreateIndexResponse;
import com.guan.datastage.commom.util.ExceptionHandler;
import com.guan.datastage.domain.common.ServiceResponse;

@Named
public class CustomerFacadeImpl implements ICustomerFacade
{

    @Inject
    private ICustomerService customerService;

    @Override
    public ServiceResponse<AddResponse> addCustomer( Customer customer )
    {
        ServiceResponse<AddResponse> response = new ServiceResponse<>();

        try
        {
            AddResponse data = customerService.addCustomer( customer );
            response.setData( data );
        } catch ( Exception e )
        {
            ExceptionHandler.handleException( response, e );
        }
        return response;
    }

    @Override
    public ServiceResponse<CreateIndexResponse> createCustomerFullNameIndex(
            Integer shards, Integer replicas )
    {
        ServiceResponse<CreateIndexResponse> response = new ServiceResponse<>();

        try
        {
            CreateIndexResponse data = customerService
                    .createCustomerFullNameIndex( shards, replicas );
            response.setData( data );
        } catch ( Exception e )
        {
            ExceptionHandler.handleException( response, e );
        }
        return response;
    }

}
