package org.drombler.tripplanner.persistence;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.List;

@MappedSuperclass
public class AbstractPoiEntity {
    @Id
    private Long id;

    private String name;

    private Double lat;
    private Double lng;

    private List<InfoEntity> infoList;

    private List<CommentEntity> comments;

    @ElementCollection
    @CollectionTable
    private List<Rating> ratings;
}
