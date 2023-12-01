package org.drombler.tripplanner.persistence;

import jakarta.persistence.Embeddable;

import java.time.LocalDate;

@Embeddable
public class Child {
    private LocalDate dateOfBirth;
}
