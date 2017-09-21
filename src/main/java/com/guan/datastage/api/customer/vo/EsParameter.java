
package com.guan.datastage.api.customer.vo;

import java.io.Serializable;

public class EsParameter implements Serializable
{

    private static final long serialVersionUID = -4951918229673507217L;
    private EsSetting settings;

    public EsSetting getSettings()
    {
        return settings;
    }

    public void setSettings( EsSetting settings )
    {
        this.settings = settings;
    }

}
