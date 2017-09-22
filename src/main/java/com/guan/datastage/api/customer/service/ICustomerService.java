
package com.guan.datastage.api.customer.service;

import java.util.List;
import java.util.Map;

import com.guan.datastage.api.customer.domain.Customer;
import com.guan.datastage.api.customer.vo.AddResponse;
import com.guan.datastage.api.customer.vo.AnalyzerResult;
import com.guan.datastage.api.customer.vo.CreateIndexResponse;
import com.guan.datastage.api.customer.vo.EsMappingProperties;
import com.guan.datastage.api.customer.vo.MappingResult;
import com.guan.datastage.commom.exception.BaseBusinessException;

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

    List<Map<String, Object>> transformationDatas(
            List<Map<String, Object>> datas, String fileName )
            throws BaseBusinessException;

    MappingResult customerFullNameMapping(
            EsMappingProperties esMappingProperties )
            throws BaseBusinessException;

    AnalyzerResult analyze( String text, String tokenizer )
            throws BaseBusinessException;

}
