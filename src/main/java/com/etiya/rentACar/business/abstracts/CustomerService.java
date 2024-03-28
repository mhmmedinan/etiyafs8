package com.etiya.rentACar.business.abstracts;

import com.etiya.rentACar.business.dtos.requests.customers.CreateCustomerRequest;
import com.etiya.rentACar.business.dtos.responses.customers.CreatedCustomerResponse;

public interface CustomerService {

    CreatedCustomerResponse add(CreateCustomerRequest createCustomerRequest);
}
