package org.drombler.tripplanner.persistence;

import jakarta.persistence.Id;

import java.util.List;

public class TravelGroupEntity {
    @Id
    private Long id;

    private String name;
    private Integer numAdults;
    private List<ChildEmbeddable> children;
}
