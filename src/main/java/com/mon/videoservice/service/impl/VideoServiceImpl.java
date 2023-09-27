package com.mon.videoservice.service.impl;

import com.mon.videoservice.dto.VideoDto;
import com.mon.videoservice.service.VideoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    @Override
    public List<VideoDto> fetchAllVideos() {
        return null;
    }

    @Override
    public VideoDto fetchVideo(String name) {
        return null;
    }

    @Override
    public VideoDto addVideo(VideoDto videoDto) {
        return null;
    }

    @Override
    public void deleteVideo(String name) {

    }
}
