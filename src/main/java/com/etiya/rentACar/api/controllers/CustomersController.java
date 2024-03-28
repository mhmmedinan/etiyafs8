package com.etiya.rentACar.api.controllers;

import com.etiya.rentACar.business.abstracts.CustomerService;
import com.etiya.rentACar.business.dtos.requests.customers.CreateCustomerRequest;
import com.etiya.rentACar.business.dtos.responses.customers.CreatedCustomerResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
@AllArgsConstructor
public class CustomersController {
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<?> add(@RequestBody CreateCustomerRequest createCustomerRequest){
        CreatedCustomerResponse response = customerService.add(createCustomerRequest);
        return ResponseEntity.ok(response);
    }

}
