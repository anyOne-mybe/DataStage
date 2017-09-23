
package com.guan.datastage.api.customer.business.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.bouncycastle.jce.provider.BrokenJCEBlockCipher.BrokePBEWithMD5AndDES;

import com.guan.datastage.api.customer.business.ICustomerBusiness;
import com.guan.datastage.api.customer.client.ICustomerElasticSearchClient;
import com.guan.datastage.api.customer.domain.Customer;
import com.guan.datastage.api.customer.vo.AddResponse;
import com.guan.datastage.api.customer.vo.AnalyzerResult;
import com.guan.datastage.api.customer.vo.CreateIndexResponse;
import com.guan.datastage.api.customer.vo.EsIndex;
import com.guan.datastage.api.customer.vo.EsMappingProperties;
import com.guan.datastage.api.customer.vo.EsMatchPhrase;
import com.guan.datastage.api.customer.vo.EsParameter;
import com.guan.datastage.api.customer.vo.EsQueryParam;
import com.guan.datastage.api.customer.vo.EsSetting;
import com.guan.datastage.api.customer.vo.EsToken;
import com.guan.datastage.api.customer.vo.MappingResult;

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

    @Override
    public void accurateSearchCustomerAliseName( String aliasName )
    {
        String meatchString = getMatchString( aliasName, null );
        EsQueryParam queryParam = new EsQueryParam();
        EsMatchPhrase query = new EsMatchPhrase();
        Map<String, String> match_phrase = new HashMap<>();
        match_phrase.put( "aliasName", meatchString );
        query.setMatch_phrase( match_phrase );
        queryParam.setQuery( query );
        
        
        
        
    }

    /**
     * 分词为查询条件字符串
     * 
     * @param value
     * @return
     */
    private String getMatchString( String value, String analyzeToken )
    {
        if ( StringUtils.isAllBlank( analyzeToken ) )
        {
            analyzeToken = "ik_smart";
        }

        AnalyzerResult analyzerResult = analyze( value, analyzeToken );
        List<EsToken> tokens = analyzerResult.getTokens();
        StringBuilder sb = new StringBuilder();
        if ( !CollectionUtils.isEmpty( tokens ) )
        {
            for ( EsToken token : tokens )
            {
                sb.append( token.getToken() ).append( StringUtils.SPACE );
            }
        }

        return sb.toString();
    }

    @Override
    public MappingResult customerFullNameMapping(
            EsMappingProperties esMappingProperties )
    {
        return customerElasticSearchClient
                .customerFullNameMapping( esMappingProperties );

    }

    @Override
    public AnalyzerResult analyze( String text, String tokenizer )
    {
        return customerElasticSearchClient.analyze( text, tokenizer );
    }

}
