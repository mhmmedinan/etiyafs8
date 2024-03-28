package com.etiya.rentACar.api.controllers;

import com.etiya.rentACar.business.abstracts.CarService;
import com.etiya.rentACar.business.dtos.requests.cars.CreateCarRequest;
import com.etiya.rentACar.business.dtos.responses.cars.CreatedCarResponse;
import com.etiya.rentACar.business.dtos.responses.cars.GetListCarResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cars")
@AllArgsConstructor
public class CarsController {
    private CarService carService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedCarResponse add(@RequestBody CreateCarRequest createCarRequest){
        return carService.add(createCarRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GetListCarResponse> getList(){
        return carService.getList();
    }

}
