package com.etiya.rentACar.business.dtos.requests.cities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCityRequest {

    private String name;
}
