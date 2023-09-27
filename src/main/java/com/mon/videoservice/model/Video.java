package com.mon.videoservice.model;

import jakarta.persistence.*;

@Table
@Entity(name = "video")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @Lob
    private String[] tags;

    @Lob
    private byte[] data;
}
