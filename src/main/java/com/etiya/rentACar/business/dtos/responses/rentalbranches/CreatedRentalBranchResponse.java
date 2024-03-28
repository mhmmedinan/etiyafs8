package com.etiya.rentACar.business.dtos.responses.rentalbranches;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatedRentalBranchResponse {
    private int cityId;
    private LocalDateTime createdDate;
}
