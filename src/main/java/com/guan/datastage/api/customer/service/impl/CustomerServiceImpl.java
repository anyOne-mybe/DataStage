
package com.guan.datastage.api.customer.service.impl;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import com.guan.datastage.api.customer.business.ICustomerBusiness;
import com.guan.datastage.api.customer.domain.Customer;
import com.guan.datastage.api.customer.service.ICustomerService;
import com.guan.datastage.api.customer.vo.AddResponse;
import com.guan.datastage.api.customer.vo.CreateIndexResponse;
import com.guan.datastage.commom.exception.BaseBusinessException;

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

    @Override
    public List<Map<String, Object>> transformationDatas(
            List<Map<String, Object>> datas, String fileName )
            throws BaseBusinessException
    {
        for ( Map<String, Object> data : datas )
        {
            handleEachData( data, fileName );
        }
        return null;
    }

    private void handleEachData( Map<String, Object> data, String fileName )
    {
        String aliasName = data.get( fileName ).toString();
        // 精确查找客户全名表
        customerBusiness.accurateSearchCustomerAliseName( aliasName );

    }

}
