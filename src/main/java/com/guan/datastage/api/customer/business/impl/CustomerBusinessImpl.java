
package com.guan.datastage.api.customer.business.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.guan.datastage.api.customer.business.ICustomerBusiness;
import com.guan.datastage.api.customer.client.ICustomerElasticSearchClient;
import com.guan.datastage.api.customer.domain.Customer;
import com.guan.datastage.api.customer.vo.AddResponse;
import com.guan.datastage.api.customer.vo.CreateIndexResponse;
import com.guan.datastage.api.customer.vo.EsIndex;
import com.guan.datastage.api.customer.vo.EsParameter;
import com.guan.datastage.api.customer.vo.EsSetting;

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

    @Override
    public CreateIndexResponse createCustomerFullNameIndex( Integer shards,
            Integer replicas )
    {

        if ( null != shards || null != replicas )
        {
            EsParameter parameter = new EsParameter();
            EsSetting setting = new EsSetting();
            parameter.setSettings( setting );
            EsIndex index = new EsIndex();
            setting.setIndex( index );
            if ( null != shards )
            {
                index.setNumber_of_shards( shards );
            }
            if ( null != replicas )
            {
                index.setNumber_of_replicas( replicas );
            }

            return customerElasticSearchClient
                    .createCustomerFullNameIndex( parameter );
        }

        return customerElasticSearchClient.createCustomerFullNameIndex();

    }

}
