package com.mon.videoservice.controller;

import com.mon.videoservice.dto.ResponseDto;
import com.mon.videoservice.dto.VideoDto;
import com.mon.videoservice.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/video")
@RequiredArgsConstructor
@Validated
public class VideoController {

    private final VideoService videoService;

    @GetMapping("fetch-all")
    public ResponseDto<List<String>> fetchAll(){
        return ResponseDto.wrapSuccessResponse(
                videoService.fetchAllVideoNames()
        );
    }

    @GetMapping("fetch")
    public ResponseDto<VideoDto> fetch(@RequestParam("name") String name){
        return ResponseDto.wrapSuccessResponse(
                videoService.fetchVideo(name)
        );
    }

    @PostMapping("save")
    public void saveVideo(@ModelAttribute VideoDto videoDto){
        videoService.saveVideo(videoDto);
    }
}
