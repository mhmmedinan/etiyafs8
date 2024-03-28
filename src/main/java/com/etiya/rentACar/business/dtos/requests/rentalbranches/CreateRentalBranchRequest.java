package com.etiya.rentACar.business.dtos.requests.rentalbranches;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRentalBranchRequest {
    private int cityId;
}
