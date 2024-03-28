package com.etiya.rentACar.business.abstracts;

import com.etiya.rentACar.business.dtos.requests.CreateCityRequest;
import com.etiya.rentACar.business.dtos.responses.cities.CreatedCityResponse;

public interface CityService {

    CreatedCityResponse add(CreateCityRequest createCityRequest);
}
