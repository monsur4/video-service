package com.mon.videoservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Table
@Entity(name = "video")
@Data
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @Column(length = 1024)
    private String[] genre;

    @Lob
    private byte[] data;
}
