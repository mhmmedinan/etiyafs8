package com.etiya.rentACar.business.abstracts;

import com.etiya.rentACar.business.dtos.requests.CreateCarRequest;
import com.etiya.rentACar.business.dtos.responses.cars.CreatedCarResponse;
import com.etiya.rentACar.business.dtos.responses.cars.GetListCarResponse;

import java.util.List;

public interface CarService {

    CreatedCarResponse add(CreateCarRequest createCarRequest);
    List<GetListCarResponse> getList();
}
