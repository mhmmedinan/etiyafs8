package com.etiya.rentACar.business.abstracts;

import com.etiya.rentACar.business.dtos.requests.fuels.CreateFuelRequest;
import com.etiya.rentACar.business.dtos.responses.fuels.CreatedFuelResponse;

public interface FuelService {

    CreatedFuelResponse add(CreateFuelRequest createFuelRequest);
}
