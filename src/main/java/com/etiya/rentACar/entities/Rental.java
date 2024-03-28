package com.etiya.rentACar.entities;

import com.etiya.rentACar.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cache;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rentals")
public class Rental extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "carId",nullable = false)
    private Car car;

    @ManyToOne
    @JoinColumn(name = "customerId",nullable = false)
    private Customer customer;

    @Column(name ="rentStartDate",nullable=false)
    private LocalDate rentStartDate;

    @Column(name ="rentEndDate",nullable = false)
    private LocalDate rentEndDate;

    @Column(name ="returnDate")
    private LocalDate returnDate;

    @Column(name ="rentStartKilometer",nullable=false)
    private int rentStartKilometer;

    @Column(name ="rentEndKilometer")
    private int rentEndKilometer;

}
