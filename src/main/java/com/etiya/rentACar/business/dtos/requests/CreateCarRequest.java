package com.etiya.rentACar.business.dtos.requests;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequest {

    private int rentalBranchId;
    private int modelId;

    private int modelYear;

    private String plate;

    private int state;

    private double dailyPrice;
}
