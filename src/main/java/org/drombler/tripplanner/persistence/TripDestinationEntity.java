package org.drombler.tripplanner.persistence;

import jakarta.persistence.Id;

import java.time.OffsetDateTime;
import java.util.List;

public class TripDestinationEntity {
    @Id
    private Long id;

    private String name;

    private OffsetDateTime startDateTime;
    private OffsetDateTime endDateTime;

    private List<PoiEntity> pois;
}
