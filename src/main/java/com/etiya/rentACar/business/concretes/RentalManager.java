package com.etiya.rentACar.business.concretes;

import com.etiya.rentACar.business.abstracts.CarService;
import com.etiya.rentACar.business.abstracts.RentalService;
import com.etiya.rentACar.business.dtos.requests.rentals.CreateRentalRequest;
import com.etiya.rentACar.business.dtos.responses.cars.GetListCarResponse;
import com.etiya.rentACar.business.dtos.responses.rentals.CreatedRentalResponse;
import com.etiya.rentACar.core.exceptions.types.BusinessException;
import com.etiya.rentACar.core.utilities.mapping.ModelMapperService;
import com.etiya.rentACar.dataAccess.abstracts.RentalRepository;
import com.etiya.rentACar.entities.Car;
import com.etiya.rentACar.entities.Customer;
import com.etiya.rentACar.entities.Rental;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RentalManager implements RentalService {
    private RentalRepository rentalRepository;
    private ModelMapperService modelMapperService;
    private CarService carService;
    @Override
    public CreatedRentalResponse add(CreateRentalRequest createRentalRequest) {
        checkIfCarState(createRentalRequest.getCarId());
        GetListCarResponse response = carService.getByCarId(createRentalRequest.getCarId());
        Car car = new Car();
        car.setId(createRentalRequest.getCarId());

        Customer customer = new Customer();
        customer.setId(createRentalRequest.getCustomerId());

        Rental mappedRental = new Rental();
        mappedRental.setRentStartDate(createRentalRequest.getRentStartDate());
        mappedRental.setRentEndDate(createRentalRequest.getRentEndDate());
        mappedRental.setRentStartKilometer(response.getKilometer());
        mappedRental.setCar(car);
        mappedRental.setCustomer(customer);
        Rental createdRental = rentalRepository.save(mappedRental);
        carService.updateCarState(createRentalRequest.getCarId(),2);
        CreatedRentalResponse createdRentalResponse = modelMapperService.forResponse()
                .map(createdRental,CreatedRentalResponse.class);
        return createdRentalResponse;
    }

    private void checkIfCarState(int carId){
        GetListCarResponse response = carService.getByCarId(carId);
        if(response.getState()==2)
            throw new BusinessException("This vehicle has been rented before. Rental status is passive!");
    }
    

}
