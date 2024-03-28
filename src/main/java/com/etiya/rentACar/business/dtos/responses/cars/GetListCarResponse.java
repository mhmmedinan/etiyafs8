package com.etiya.rentACar.business.dtos.responses.cars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListCarResponse {
    private int rentalBranchId;
    private String rentalBranchCityName;
    private int modelId;
    private String modelName;
    private int kilometer;
    private String modelBrandName;

    private int modelYear;

    private String plate;

    private int state;

    private double dailyPrice;
}
