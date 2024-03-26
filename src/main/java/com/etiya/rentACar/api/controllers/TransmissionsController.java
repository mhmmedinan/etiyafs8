package com.etiya.rentACar.api.controllers;

import com.etiya.rentACar.business.abstracts.TransmissionService;
import com.etiya.rentACar.business.dtos.requests.CreateTransmissionRequest;
import com.etiya.rentACar.business.dtos.responses.transmissions.CreatedTransmissionResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/transmissions")
@AllArgsConstructor
public class TransmissionsController {

    private TransmissionService transmissionService;

    @PostMapping
    public CreatedTransmissionResponse add(@RequestBody CreateTransmissionRequest createTransmissionRequest){
        return transmissionService.add(createTransmissionRequest);
    }

}
