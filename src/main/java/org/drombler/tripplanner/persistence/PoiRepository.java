package org.drombler.tripplanner.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PoiRepository extends JpaRepository<PoiEntity, Long> {
}
