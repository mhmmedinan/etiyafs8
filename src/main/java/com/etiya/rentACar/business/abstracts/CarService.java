package com.etiya.rentACar.business.abstracts;

import com.etiya.rentACar.business.dtos.requests.cars.CreateCarRequest;
import com.etiya.rentACar.business.dtos.responses.cars.CreatedCarResponse;
import com.etiya.rentACar.business.dtos.responses.cars.GetListCarResponse;
import com.etiya.rentACar.entities.Car;

import java.util.List;

public interface CarService {

    CreatedCarResponse add(CreateCarRequest createCarRequest);
    List<GetListCarResponse> getList();
    //
    GetListCarResponse getByCarId(int id);

    void updateCarState(int carId,int state);
}
