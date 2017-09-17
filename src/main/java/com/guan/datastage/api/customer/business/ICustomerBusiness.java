
package com.guan.datastage.api.customer.business;

import com.guan.datastage.api.customer.domain.Customer;
import com.guan.datastage.api.customer.vo.AddResponse;

public interface ICustomerBusiness
{
    AddResponse addCustomer( Customer customer );

}
