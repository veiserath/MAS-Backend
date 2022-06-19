package com.example.masimpl.Repositories;

import com.example.masimpl.Models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource // http://localhost:8080/cars
public interface CarRepository extends JpaRepository<Car, Long> {

}
