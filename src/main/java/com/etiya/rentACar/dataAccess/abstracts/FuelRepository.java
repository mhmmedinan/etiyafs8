package com.etiya.rentACar.dataAccess.abstracts;

import com.etiya.rentACar.entities.Fuel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelRepository extends JpaRepository<Fuel,Integer> {
    Fuel getByName(String name);
}
