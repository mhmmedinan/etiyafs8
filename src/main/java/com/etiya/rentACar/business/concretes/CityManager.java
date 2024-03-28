package com.etiya.rentACar.business.concretes;

import com.etiya.rentACar.business.abstracts.CityService;
import com.etiya.rentACar.business.dtos.requests.cities.CreateCityRequest;
import com.etiya.rentACar.business.dtos.responses.cities.CreatedCityResponse;
import com.etiya.rentACar.core.utilities.mapping.ModelMapperService;
import com.etiya.rentACar.dataAccess.abstracts.CityRepository;
import com.etiya.rentACar.entities.City;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CityManager implements CityService {

    private CityRepository cityRepository;
    private ModelMapperService mapperService;
    @Override
    public CreatedCityResponse add(CreateCityRequest createCityRequest) {
        City mappedCity = mapperService.forRequest().map(createCityRequest,City.class);
        City createdCity = cityRepository.save(mappedCity);
        CreatedCityResponse response = mapperService.forResponse().map(createdCity,CreatedCityResponse.class);
        return response;
    }
}
