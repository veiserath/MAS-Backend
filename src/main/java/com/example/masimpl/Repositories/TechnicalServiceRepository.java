package com.example.masimpl.Repositories;

import com.example.masimpl.Models.TechnicalService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TechnicalServiceRepository extends JpaRepository<TechnicalService, Long> {

}
