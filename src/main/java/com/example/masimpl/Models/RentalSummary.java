package com.example.masimpl.Models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder(setterPrefix = "with")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class RentalSummary {
    @Id
    @GeneratedValue
    private Long id;

    private double kilometersDriven;
    private double timeElapsed;
    private double taxAmount;

    @Enumerated
    private PaymentMethod paymentMethod;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
