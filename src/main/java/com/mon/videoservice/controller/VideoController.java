package com.mon.videoservice.controller;

import com.mon.videoservice.dto.ResponseDto;
import com.mon.videoservice.dto.VideoDto;
import com.mon.videoservice.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Resource> fetch(@RequestParam("name") String name){
        return ResponseEntity
                .status(HttpStatus.OK)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + name +".mp4")
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(new ByteArrayResource(videoService.fetchVideo(name).getData()));
    }

    @PostMapping("save")
    public void saveVideo(@ModelAttribute VideoDto videoDto){
        videoService.saveVideo(videoDto);
    }
}
