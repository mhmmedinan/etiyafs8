package com.etiya.rentACar.dataAccess.abstracts;

import com.etiya.rentACar.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model,Integer> {
}
