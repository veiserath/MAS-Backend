package com.example.masimpl.Models;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@Builder(setterPrefix = "with", builderMethodName = "requiredArgs")
@AllArgsConstructor
@ToString
@Entity
@NoArgsConstructor

public class Complaint {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Rental rental;
    private String reasonForComplaint;
    private String customerSuggestionForSolving;



    public static ComplaintBuilder builder(final Rental rental) {
        return new ComplaintBuilder().withRental(rental);
    }

    public boolean fileAComplaint(String reasonForComplaint, String customerSuggestionForSolving) {
        return true;
    }

}
