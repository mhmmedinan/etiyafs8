package com.etiya.rentACar.dataAccess.abstracts;

import com.etiya.rentACar.entities.Transmission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransmissionRepository extends JpaRepository<Transmission,Integer> {
}
