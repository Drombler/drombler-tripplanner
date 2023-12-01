package org.drombler.tripplanner.persistence;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class DayPlanEntity {
    private LocalDate date;
}
