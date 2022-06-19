package com.example.masimpl.Repositories;

import com.example.masimpl.Models.TechnicalService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource // http://localhost:8080/technicalServices/
public interface TechnicalServiceRepository extends JpaRepository<TechnicalService, Long> {

}
