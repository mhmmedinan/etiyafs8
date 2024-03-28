package com.etiya.rentACar.business.abstracts;

import com.etiya.rentACar.business.dtos.requests.CreateRentalBranchRequest;
import com.etiya.rentACar.business.dtos.responses.rentalbranches.CreatedRentalBranchResponse;

public interface RentalBranchService {

    CreatedRentalBranchResponse add(CreateRentalBranchRequest createRentalBranchRequest);
}
