package org.drombler.tripplanner.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CommentEntity {
    @Id
    private Long id;

    private CommentEntity parentComment;

    private String text;
}
