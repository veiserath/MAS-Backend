package com.example.masimpl.Repositories;

import com.example.masimpl.Models.CarDamage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource //   http://localhost:8080/carDamagescarDamages
public interface CarDamageRepository extends JpaRepository<CarDamage, Long> {

}
