package com.mon.videoservice.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Builder
public class VideoDto {
    private String name;

    private String[] tags;

    private byte[] data;
}
