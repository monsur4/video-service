package com.mon.videoservice.service;

import com.mon.videoservice.dto.VideoDto;

import java.util.List;

public interface VideoService {

    List<VideoDto> fetchAllVideoNames();

    VideoDto fetchVideo(String name);

    VideoDto saveVideo(VideoDto videoDto);

    void deleteVideo(String name);
}
