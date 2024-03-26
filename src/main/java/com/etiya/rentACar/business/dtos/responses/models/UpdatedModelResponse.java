package com.etiya.rentACar.business.dtos.responses.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatedModelResponse {
    private int id;
    private String name;
    private int brandId;
    private int fuelId;
    private int transmissionId;
}
