package org.drombler.tripplanner.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class TripEntity {
    @Id
    private Long id;


    @Enumerated(EnumType.STRING)
    private TripStatus status;
}
