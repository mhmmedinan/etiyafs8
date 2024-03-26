package com.etiya.rentACar.business.dtos.responses.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListModelResponse {

    private int id;
    private String name;
    private String fuelName;
    private String brandName;
    private int transmissionId;
    private String transmissionName;

}
