package com.etiya.rentACar.business.concretes;

import com.etiya.rentACar.business.abstracts.TransmissionService;
import com.etiya.rentACar.business.dtos.requests.transmissions.CreateTransmissionRequest;
import com.etiya.rentACar.business.dtos.responses.transmissions.CreatedTransmissionResponse;
import com.etiya.rentACar.core.utilities.mapping.ModelMapperService;
import com.etiya.rentACar.dataAccess.abstracts.TransmissionRepository;
import com.etiya.rentACar.entities.Transmission;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransmissionManager implements TransmissionService {

    private TransmissionRepository transmissionRepository;
    private ModelMapperService modelMapperService;


    @Override
    public CreatedTransmissionResponse add(CreateTransmissionRequest createTransmissionRequest) {
        Transmission mappedTransmission = modelMapperService.forRequest().
                map(createTransmissionRequest,Transmission.class);
        Transmission createdTransmission = transmissionRepository.save(mappedTransmission);
        CreatedTransmissionResponse response = modelMapperService.forResponse()
                .map(createdTransmission, CreatedTransmissionResponse.class);
        return response;

    }
}
