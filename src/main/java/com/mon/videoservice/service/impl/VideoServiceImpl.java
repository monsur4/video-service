package com.mon.videoservice.service.impl;

import com.mon.videoservice.dto.VideoDto;
import com.mon.videoservice.repository.VideoRepository;
import com.mon.videoservice.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VideoServiceImpl implements VideoService {

    private final VideoRepository videoRepository;

    @Override
    public List<VideoDto> fetchAllVideoNames() {
        return null;
    }

    @Override
    public VideoDto fetchVideo(String name) {
        return null;
    }

    @Override
    public VideoDto saveVideo(VideoDto videoDto) {
        return null;
    }

    @Override
    public void deleteVideo(String name) {

    }
}
