package com.etiya.rentACar.business.concretes;

import com.etiya.rentACar.business.abstracts.FuelService;
import com.etiya.rentACar.business.dtos.requests.fuels.CreateFuelRequest;
import com.etiya.rentACar.business.dtos.responses.fuels.CreatedFuelResponse;
import com.etiya.rentACar.dataAccess.abstracts.FuelRepository;
import com.etiya.rentACar.entities.Fuel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FuelManager implements FuelService {
    private FuelRepository fuelRepository;

    @Override
    public CreatedFuelResponse add(CreateFuelRequest createFuelRequest) {
        Fuel mappedFuel = new Fuel();
        mappedFuel.setName(createFuelRequest.getName());
        Fuel createdFuel = fuelRepository.save(mappedFuel);
        CreatedFuelResponse response = new CreatedFuelResponse();
        response.setId(createdFuel.getId());
        response.setName(createdFuel.getName());
        return response;
    }
}
