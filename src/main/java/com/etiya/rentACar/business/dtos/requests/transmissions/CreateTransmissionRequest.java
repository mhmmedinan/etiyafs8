package com.etiya.rentACar.business.dtos.requests.transmissions;

import com.etiya.rentACar.entities.Brand;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTransmissionRequest {
    private String name;

}
