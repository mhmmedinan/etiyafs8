package com.etiya.rentACar.business.concretes;

import com.etiya.rentACar.business.abstracts.CustomerService;
import com.etiya.rentACar.business.dtos.requests.customers.CreateCustomerRequest;
import com.etiya.rentACar.business.dtos.responses.customers.CreatedCustomerResponse;
import com.etiya.rentACar.core.utilities.mapping.ModelMapperService;
import com.etiya.rentACar.dataAccess.abstracts.CustomerRepository;
import com.etiya.rentACar.entities.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerManager implements CustomerService {
    private CustomerRepository customerRepository;
    private ModelMapperService modelMapperService;
    @Override
    public CreatedCustomerResponse add(CreateCustomerRequest createCustomerRequest) {
        Customer mappedCustomer = modelMapperService.forRequest().map(createCustomerRequest,Customer.class);
        Customer createdCustomer = customerRepository.save(mappedCustomer);
        CreatedCustomerResponse response = modelMapperService.forResponse().
                map(createdCustomer,CreatedCustomerResponse.class);
        return response;
    }
}
