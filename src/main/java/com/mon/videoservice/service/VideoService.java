package com.mon.videoservice.service;

import com.mon.videoservice.dto.VideoDto;

import java.util.List;

public interface VideoService {

    List<String> fetchAllVideoNames();

    VideoDto fetchVideo(String name);

    void saveVideo(VideoDto videoDto);

    void deleteVideo(String name);
}
