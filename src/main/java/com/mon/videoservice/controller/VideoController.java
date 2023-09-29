package com.mon.videoservice.controller;

import com.mon.videoservice.dto.ResponseDto;
import com.mon.videoservice.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/video")
@RequiredArgsConstructor
public class VideoController {

    private final VideoService videoService;

    @GetMapping("fetch-all")
    public ResponseDto<List<String>> fetchAll(){
        return ResponseDto.wrapSuccessResponse(
                videoService.fetchAllVideoNames()
        );
    }
}
