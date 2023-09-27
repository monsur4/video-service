package com.mon.videoservice.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class VideoDto {
    private String name;

    private String[] tags;

    private MultipartFile videoFile;
}
