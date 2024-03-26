package com.etiya.rentACar.business.concretes;

import com.etiya.rentACar.business.abstracts.ModelService;
import com.etiya.rentACar.business.dtos.requests.CreateModelRequest;
import com.etiya.rentACar.business.dtos.requests.UpdateModelRequest;
import com.etiya.rentACar.business.dtos.responses.models.CreatedModelResponse;
import com.etiya.rentACar.business.dtos.responses.models.GetListModelResponse;
import com.etiya.rentACar.business.dtos.responses.models.UpdatedModelResponse;
import com.etiya.rentACar.core.utilities.mapping.ModelMapperService;
import com.etiya.rentACar.dataAccess.abstracts.ModelRepository;
import com.etiya.rentACar.entities.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {

    private ModelRepository modelRepository;
    private ModelMapperService modelMapperService;
    @Override
    public CreatedModelResponse add(CreateModelRequest createModelRequest) {
        Model mappedModel = modelMapperService.forRequest().map(createModelRequest,Model.class);
        Model createdModel = modelRepository.save(mappedModel);
        CreatedModelResponse response = modelMapperService.forResponse().map(createdModel,CreatedModelResponse.class);
        return response;


    }

    @Override
    public UpdatedModelResponse update(int id,UpdateModelRequest updateModelRequest) {
        Model model = modelRepository.findById(id).get();
        Model mappedModel = modelMapperService.forRequest().map(updateModelRequest,Model.class);
        mappedModel.setId(id);
        mappedModel.setCreatedDate(model.getCreatedDate());
        Model updatedModel = modelRepository.save(mappedModel);
        UpdatedModelResponse response = modelMapperService.forResponse().map(updatedModel,UpdatedModelResponse.class);
        return response;
    }

    @Override
    public List<GetListModelResponse> getList() {
        List<Model> models = modelRepository.findAll();
        List<GetListModelResponse> modelResponses = models.stream()
                .map(model -> modelMapperService.forResponse().map(model,GetListModelResponse.class))
                .collect(Collectors.toList());
        return modelResponses;
    }
}
