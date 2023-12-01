package org.drombler.tripplanner.persistence;

import jakarta.persistence.Entity;

import java.time.OffsetDateTime;

@Entity
public class TripDestinationEntity extends AbstractPoiEntity {

    private OffsetDateTime startDateTime;
    private OffsetDateTime endDateTime;

    private AccommodationEntity accommodation;


}
