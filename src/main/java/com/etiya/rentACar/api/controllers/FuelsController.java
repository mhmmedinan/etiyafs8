package com.etiya.rentACar.api.controllers;

import com.etiya.rentACar.business.abstracts.FuelService;
import com.etiya.rentACar.business.dtos.requests.CreateFuelRequest;
import com.etiya.rentACar.business.dtos.responses.fuels.CreatedFuelResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/fuels")
public class FuelsController {

    private FuelService fuelService;

    @PostMapping
    public CreatedFuelResponse add(@RequestBody CreateFuelRequest createFuelRequest){
        return fuelService.add(createFuelRequest);
    }
}
