
package com.guan.datastage.api.customer.service;

import com.guan.datastage.api.customer.domain.Customer;
import com.guan.datastage.api.customer.vo.AddResponse;
import com.guan.datastage.api.customer.vo.CreateIndexResponse;

public interface ICustomerService
{

    /**
     * 创建客户全名Index
     * 
     * @param shards
     *            分片数量
     * @param replicas
     *            备份数量
     * @return
     */
    CreateIndexResponse createCustomerFullNameIndex( Integer shards,
            Integer replicas );

    /**
     * 创建客户
     * 
     * @param customer
     * @return
     */
    AddResponse addCustomer( Customer customer );

}
