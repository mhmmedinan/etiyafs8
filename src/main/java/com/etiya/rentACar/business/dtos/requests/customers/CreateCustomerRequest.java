package com.etiya.rentACar.business.dtos.requests.customers;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerRequest {


    private String userName;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String companyName;
}
