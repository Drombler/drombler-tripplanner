package org.drombler.tripplanner.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PoiEntity {
    @Id
    private Long id;
}
