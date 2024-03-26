package com.etiya.rentACar.business.abstracts;

import com.etiya.rentACar.business.dtos.requests.CreateTransmissionRequest;
import com.etiya.rentACar.business.dtos.responses.transmissions.CreatedTransmissionResponse;

public interface TransmissionService {

    CreatedTransmissionResponse add(CreateTransmissionRequest createTransmissionRequest);
}
