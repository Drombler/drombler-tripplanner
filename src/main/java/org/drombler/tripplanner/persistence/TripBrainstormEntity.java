package org.drombler.tripplanner.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class TripBrainstormEntity {
    @Id
    private Long id;

    private String name;

    private List<PoiEntity> pois;
}
