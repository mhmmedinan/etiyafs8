package com.etiya.rentACar.api.controllers;

import com.etiya.rentACar.business.abstracts.RentalService;
import com.etiya.rentACar.business.dtos.requests.rentals.CreateRentalRequest;
import com.etiya.rentACar.business.dtos.responses.rentals.CreatedRentalResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rentals")
@AllArgsConstructor
public class RentalsController {

    private RentalService rentalService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedRentalResponse add(@RequestBody CreateRentalRequest createRentalRequest){
        return rentalService.add(createRentalRequest);
    }
}
