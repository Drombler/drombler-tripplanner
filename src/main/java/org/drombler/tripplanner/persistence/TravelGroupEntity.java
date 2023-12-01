package org.drombler.tripplanner.persistence;

import java.util.List;

public class TravelGroupEntity {
    private String name;
    private Integer numAdults;
    private List<ChildEmbeddable> children;
}
