package org.drombler.tripplanner.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<TripEntity, Long> {
}
