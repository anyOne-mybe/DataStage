
package com.guan.datastage.api.customer.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;

import com.guan.datastage.api.customer.business.ICustomerBusiness;
import com.guan.datastage.api.customer.domain.Customer;
import com.guan.datastage.api.customer.service.ICustomerService;
import com.guan.datastage.api.customer.vo.AddResponse;
import com.guan.datastage.api.customer.vo.AnalyzerResult;
import com.guan.datastage.api.customer.vo.CreateIndexResponse;
import com.guan.datastage.api.customer.vo.EsMappingProperties;
import com.guan.datastage.api.customer.vo.MappingResult;
import com.guan.datastage.api.customer.vo.TransformationVO;
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
    public List<TransformationVO<Map<String, Object>>> transformationDatas(
            List<Map<String, Object>> datas, String fileName )
            throws BaseBusinessException
    {
        List<TransformationVO<Map<String, Object>>> results = new ArrayList<>();
        TransformationVO<Map<String, Object>> eachResult = null;
        for ( Map<String, Object> data : datas )
        {
            eachResult = handleEachData( data, fileName );
            results.add( eachResult );
        }

        return results;
    }

    private TransformationVO<Map<String, Object>> handleEachData(
            Map<String, Object> orignal, String fileName )
    {
        String aliasName = orignal.get( fileName ).toString();
        TransformationVO<Map<String, Object>> transformationVO = new TransformationVO<>();
        transformationVO.setOrignal( orignal );
        ;

        // 1.精确匹配
        boolean isMatch = isAccurateMatch( aliasName, transformationVO );
        if ( isMatch )
        {
            transformationVO.setSuccess( true );

        }

        // 2.模糊匹配

        // 3.找不到

        return transformationVO;
    }

    private boolean isAccurateMatch( String aliasName,
            TransformationVO<Map<String, Object>> transformationVO )
    {
        // 精确查找客户全名表
        List<Customer> customers = customerBusiness
                .accurateSearchCustomerAliseName( aliasName );

        for ( Customer customer : customers )
        {
            if ( StringUtils.equals( aliasName, customer.getAliasName() ) )
            {
                transformationVO.setValue( customer.getRealName() );
                return true;
            }
        }
        return false;
    }

    @Override
    public MappingResult customerFullNameMapping(
            EsMappingProperties esMappingProperties )
            throws BaseBusinessException
    {
        return customerBusiness.customerFullNameMapping( esMappingProperties );
    }

    @Override
    public AnalyzerResult analyze( String text, String tokenizer )
            throws BaseBusinessException
    {
        return customerBusiness.analyze( text, tokenizer );
    }

}
