package com.example.masimpl.Models;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Builder(setterPrefix = "with")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Car {
    @Id
    @GeneratedValue
    private Long id;

    private String brand;
    private String model;
    private String vehicleRegistrationPlate;
    private String color;
    private double fuelLeft;
    private double averageFuelConsumption;

    private String cityLocation;

    private static double pricePerMinute;

    @OneToMany(mappedBy = "car")
    @ToString.Exclude
    private Set<CarDamage> carDamages;


    public boolean willThereBeEnoughFuel(double distance) {
        return averageFuelConsumption * distance / 100 < fuelLeft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Car car = (Car) o;
        return id != null && Objects.equals(id, car.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
