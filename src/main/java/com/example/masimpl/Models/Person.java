package com.example.masimpl.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;

@SuperBuilder(setterPrefix = "with")
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Person {
    String name;
    String lastName;
    String PESEL;
    String postalService;

    public abstract String showPersonalData();

    public abstract String toJSON();

    public abstract Person fromJSON();
}