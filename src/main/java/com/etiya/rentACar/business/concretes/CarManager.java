package com.etiya.rentACar.business.concretes;

import com.etiya.rentACar.business.abstracts.CarService;
import com.etiya.rentACar.business.dtos.requests.CreateCarRequest;
import com.etiya.rentACar.business.dtos.responses.cars.CreatedCarResponse;
import com.etiya.rentACar.business.dtos.responses.cars.GetListCarResponse;
import com.etiya.rentACar.core.utilities.mapping.ModelMapperService;
import com.etiya.rentACar.dataAccess.abstracts.CarRepository;
import com.etiya.rentACar.entities.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CarManager implements CarService {

    private CarRepository carRepository;
    private ModelMapperService modelMapperService;
    @Override
    public CreatedCarResponse add(CreateCarRequest createCarRequest) {
        Car mappedCar = modelMapperService.forRequest().map(createCarRequest,Car.class);
        mappedCar.setId(0);
        Car createdCar = carRepository.save(mappedCar);
        CreatedCarResponse response = modelMapperService.forResponse()
                .map(createdCar,CreatedCarResponse.class);
        return response;
    }

    @Override
    public List<GetListCarResponse> getList() {
        List<Car> cars = carRepository.findAll();
        List<GetListCarResponse> responses = cars.stream().map(
                car->modelMapperService.forResponse().map(car,GetListCarResponse.class)
        ).collect(Collectors.toList());
        return responses;
    }
}
