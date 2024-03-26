package com.etiya.rentACar.api.controllers;

import com.etiya.rentACar.business.abstracts.ModelService;
import com.etiya.rentACar.business.dtos.requests.CreateModelRequest;
import com.etiya.rentACar.business.dtos.requests.UpdateModelRequest;
import com.etiya.rentACar.business.dtos.responses.models.CreatedModelResponse;
import com.etiya.rentACar.business.dtos.responses.models.GetListModelResponse;
import com.etiya.rentACar.business.dtos.responses.models.UpdatedModelResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/models")
@AllArgsConstructor
public class ModelsController {
    private ModelService modelService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedModelResponse add(@RequestBody CreateModelRequest createModelRequest){
        return modelService.add(createModelRequest);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public UpdatedModelResponse update(@PathVariable int id, @RequestBody UpdateModelRequest updateModelRequest){
        return modelService.update(id,updateModelRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GetListModelResponse> getList(){
        return modelService.getList();
    }
}
