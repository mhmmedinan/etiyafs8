package com.etiya.rentACar.entities;

import com.etiya.rentACar.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rentalBranches")
@Entity
public class RentalBranch extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "cityId")
    private City city;


    @OneToMany(mappedBy = "rentalBranch")
    private List<Car> cars;
}
