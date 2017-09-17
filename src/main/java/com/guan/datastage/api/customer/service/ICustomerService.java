
package com.guan.datastage.api.customer.service;

import com.guan.datastage.api.customer.domain.Customer;
import com.guan.datastage.api.customer.vo.AddResponse;

public interface ICustomerService
{

    AddResponse addCustomer( Customer customer );

}
