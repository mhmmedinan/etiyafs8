package com.etiya.rentACar.api.controllers;

import com.etiya.rentACar.business.abstracts.CityService;
import com.etiya.rentACar.business.dtos.requests.CreateCityRequest;
import com.etiya.rentACar.business.dtos.responses.cities.CreatedCityResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/cities")
@AllArgsConstructor
public class CitiesController {
    private CityService cityService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedCityResponse add(@RequestBody CreateCityRequest createCityRequest){
        return cityService.add(createCityRequest);
    }
}
