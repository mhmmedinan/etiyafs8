package com.etiya.rentACar.business.abstracts;

import com.etiya.rentACar.business.dtos.requests.CreateModelRequest;
import com.etiya.rentACar.business.dtos.requests.UpdateModelRequest;
import com.etiya.rentACar.business.dtos.responses.models.CreatedModelResponse;
import com.etiya.rentACar.business.dtos.responses.models.GetListModelResponse;
import com.etiya.rentACar.business.dtos.responses.models.UpdatedModelResponse;

import java.util.List;

public interface ModelService{

    CreatedModelResponse add(CreateModelRequest createModelRequest);
    UpdatedModelResponse update(int id,UpdateModelRequest updateModelRequest);
    List<GetListModelResponse> getList();
}
