package com.etiya.rentACar.business.dtos.responses.customers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatedCustomerResponse {

    private String userName;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String companyName;
}
