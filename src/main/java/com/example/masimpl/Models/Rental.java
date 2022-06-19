package com.example.masimpl.Models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder(setterPrefix = "with")
public class Rental {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Car car;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private String startCity;
    private String endCity;


}
