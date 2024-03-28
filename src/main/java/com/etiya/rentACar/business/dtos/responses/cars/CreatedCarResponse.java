package com.etiya.rentACar.business.dtos.responses.cars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatedCarResponse {
    private int rentalBranchId;
    private int modelId;

    private int modelYear;

    private String plate;

    private int state;

    private double dailyPrice;
}
