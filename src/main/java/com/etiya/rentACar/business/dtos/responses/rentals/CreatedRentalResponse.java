package com.etiya.rentACar.business.dtos.responses.rentals;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatedRentalResponse {
    private int carId;
    private int customerId;
    private LocalDate rentStartDate;
    private LocalDate rentEndDate;
    private int rentStartKilometer;
}
