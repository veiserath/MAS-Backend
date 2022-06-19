package com.example.masimpl.Models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder(setterPrefix = "with")
public class CustomerService extends Person {

    @Id
    @GeneratedValue
    private Long id;

    private int solvedCases;

    @Override
    public String showPersonalData() {
        return null;
    }

    @Override
    public String toJSON() {
        return null;
    }

    @Override
    public Person fromJSON() {
        return null;
    }

    public double calculateSalary() {
        return solvedCases * 100;
    }
}
