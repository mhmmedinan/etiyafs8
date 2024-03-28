package com.etiya.rentACar.entities;

import com.etiya.rentACar.core.entities.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="transmissions")
public class Transmission extends BaseEntity {
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "transmission")
    private List<Model> models;
}

//RentalBranch => city,car
//City => ankara,
//Rental ==> customerId,rentalbranchid
//customer
//user => firstname,lastname,email,password
//id 1 olan bir araç kiralandıysa state durumu değişsin.
//id 2 olan bir araç kiralandı.
// id si 3 olan aracı kiralarken eski aracın tekrar state durumunun available olması gerekiyor.



