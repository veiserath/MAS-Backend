package com.example.masimpl.Models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder(setterPrefix = "with")
public class TechnicalService extends Person {

    public static final double SALARY_BONUS = 21.37;

    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime dateOfHire;


    @OneToMany(mappedBy = "technicalService")
    @ToString.Exclude
    private Set<CarDamage> carDamagesFixed;

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
        return 5000;
    }

    public double calculateTimeInCompany() {
        return ChronoUnit.DAYS.between(dateOfHire, LocalDateTime.now()) * SALARY_BONUS;
    }
}
