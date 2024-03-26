package com.etiya.rentACar.business.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateModelRequest {
    private String name;
    private int brandId;
    private int fuelId;
    private int transmissionId;
}
