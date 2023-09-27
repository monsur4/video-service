package com.mon.videoservice.service;

import com.mon.videoservice.dto.VideoDto;

import java.util.List;

public interface VideoService {

    List<VideoDto> fetchAllVideos();

    VideoDto fetchVideo(String name);

    VideoDto addVideo(VideoDto videoDto);

    void deleteVideo(String name);
}
