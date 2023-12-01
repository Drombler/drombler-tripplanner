package org.drombler.tripplanner.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TripBrainstormEntity {
    @Id
    private Long id;
}
