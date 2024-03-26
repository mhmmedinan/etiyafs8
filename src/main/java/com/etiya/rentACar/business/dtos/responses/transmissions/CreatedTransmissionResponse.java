package com.etiya.rentACar.business.dtos.responses.transmissions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatedTransmissionResponse {
    private int id;
    private String name;
}
