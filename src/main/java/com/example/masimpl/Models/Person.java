package com.example.masimpl.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;

@SuperBuilder(setterPrefix = "with")
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@Getter
@Setter

public abstract class Person {
    private String name;
    private String lastName;
    private String PESEL;
    private String postalService;

    public abstract String showPersonalData();

    public abstract String toJSON();

    public abstract Person fromJSON();
}