
package com.guan.datastage.api.customer.vo;

import java.io.Serializable;

public class EsIndex implements Serializable
{

    private static final long serialVersionUID = 3543551630648233495L;
    private Integer number_of_shards;
    private Integer number_of_replicas;

    public Integer getNumber_of_shards()
    {
        return number_of_shards;
    }

    public void setNumber_of_shards( Integer number_of_shards )
    {
        this.number_of_shards = number_of_shards;
    }

    public Integer getNumber_of_replicas()
    {
        return number_of_replicas;
    }

    public void setNumber_of_replicas( Integer number_of_replicas )
    {
        this.number_of_replicas = number_of_replicas;
    }

}
