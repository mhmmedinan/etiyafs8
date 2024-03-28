package com.etiya.rentACar.business.dtos.responses.cities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatedCityResponse {
    private int id;
    private String name;
    private LocalDateTime createdDate;
}
