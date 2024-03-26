package com.etiya.rentACar.business.dtos.responses.fuels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatedFuelResponse {

    private int id;
    private String name;
}
