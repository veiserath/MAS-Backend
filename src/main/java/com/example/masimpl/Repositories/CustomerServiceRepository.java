package com.example.masimpl.Repositories;

import com.example.masimpl.Models.CustomerService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerServiceRepository extends JpaRepository<CustomerService, Long> {

}
