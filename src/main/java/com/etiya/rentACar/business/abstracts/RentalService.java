package com.etiya.rentACar.business.abstracts;

import com.etiya.rentACar.business.dtos.requests.rentals.CreateRentalRequest;
import com.etiya.rentACar.business.dtos.responses.rentals.CreatedRentalResponse;

public interface RentalService {

    CreatedRentalResponse add(CreateRentalRequest createRentalRequest);
}
