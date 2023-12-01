package org.drombler.tripplanner.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import org.springframework.util.MimeType;

import java.net.URL;

@Entity
public class InfoEntity {
    @Id
    private Long id;

    private String text;

    private URL url;

    private MimeType contentType;

    @Lob
    private byte[] content;

}
