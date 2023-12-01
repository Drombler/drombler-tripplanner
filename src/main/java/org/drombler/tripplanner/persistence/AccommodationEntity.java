package org.drombler.tripplanner.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.net.URL;

@Entity
public class AccommodationEntity extends AbstractPoiEntity {

    @Enumerated(EnumType.STRING)
    private AccomodationStatus status;

    private URL homepage;

}
