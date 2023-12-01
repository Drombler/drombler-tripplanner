package org.drombler.tripplanner.persistence;

import jakarta.persistence.MappedSuperclass;

import java.time.OffsetDateTime;

@MappedSuperclass
public class PlanEntity {
    private OffsetDateTime startDateTime;
    private OffsetDateTime endDateTime;
}
