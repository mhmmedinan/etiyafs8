package com.etiya.rentACar.api.controllers;

import com.etiya.rentACar.business.abstracts.BrandService;
import com.etiya.rentACar.business.dtos.requests.CreateBrandRequest;
import com.etiya.rentACar.business.dtos.responses.brands.CreatedBrandResponse;
import com.etiya.rentACar.business.dtos.responses.brands.GetListBrandResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/brands")
public class BrandsController {
    private BrandService brandService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)//201
    public CreatedBrandResponse add(@Valid @RequestBody CreateBrandRequest createBrandRequest){
        return brandService.add(createBrandRequest);
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GetListBrandResponse> getList(){
        return brandService.getList();
    }


    @GetMapping("{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<GetListBrandResponse> getByName(String name){
        return brandService.getByName(name);
    }
}