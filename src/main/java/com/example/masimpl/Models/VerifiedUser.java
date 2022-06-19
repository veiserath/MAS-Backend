package com.example.masimpl.Models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder(setterPrefix = "with")
public class VerifiedUser extends UnverifiedUser {

    String personalId;
    String drivingLicense;


}
