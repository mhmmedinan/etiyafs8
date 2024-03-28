package com.etiya.rentACar.api.controllers;

import com.etiya.rentACar.business.abstracts.RentalBranchService;
import com.etiya.rentACar.business.dtos.requests.rentalbranches.CreateRentalBranchRequest;
import com.etiya.rentACar.business.dtos.responses.rentalbranches.CreatedRentalBranchResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rentalBranches")
@AllArgsConstructor
public class RentalBranchesController {

    private RentalBranchService rentalBranchService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedRentalBranchResponse add(@RequestBody CreateRentalBranchRequest createRentalBranchRequest){
        return rentalBranchService.add(createRentalBranchRequest);
    }


}
