package com.mon.videoservice.service.impl;

import com.mon.videoservice.dto.VideoDto;
import com.mon.videoservice.exception.VideoNotFoundException;
import com.mon.videoservice.model.Video;
import com.mon.videoservice.repository.VideoRepository;
import com.mon.videoservice.service.VideoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class VideoServiceImpl implements VideoService {

    private final VideoRepository videoRepository;

    @Override
    public List<String> fetchAllVideoNames() {
        return videoRepository.fetchAllVideoNames();
    }

    @Override
    public VideoDto fetchVideo(String name) {
        if(!videoRepository.existsByName(name)) {
            log.error("video with the name [{}] was not found" , name);
            throw new VideoNotFoundException();
//            throw new VideoNotFoundException("video with name " + name + " was not found");
        }
        Video video = videoRepository.findByName(name);
        return VideoDto.builder()
                .name(video.getName())
                .tags(video.getTags())
                .data(video.getData())
                .build();
    }

    @Override
    public VideoDto saveVideo(VideoDto videoDto) {
        return null;
    }

    @Override
    public void deleteVideo(String name) {

    }
}
