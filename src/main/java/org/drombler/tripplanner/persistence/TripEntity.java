package org.drombler.tripplanner.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

import java.time.OffsetDateTime;
import java.util.List;

@Entity
public class TripEntity {
    @Id
    private Long id;


    @Enumerated(EnumType.STRING)
    private TripStatus status;

    private OffsetDateTime startDateTime;
    private OffsetDateTime endDateTime;

    private List<TripDestinationEntity> destinations;

    private List<CommentEntity> comments;
}
