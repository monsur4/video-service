package com.mon.videoservice.service.impl;

import com.mon.videoservice.dto.VideoDto;
import com.mon.videoservice.exception.GenericException;
import com.mon.videoservice.exception.VideoAlreadyExistsException;
import com.mon.videoservice.exception.VideoNotFoundException;
import com.mon.videoservice.model.Video;
import com.mon.videoservice.repository.VideoRepository;
import com.mon.videoservice.service.VideoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
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
                .genre(video.getGenre())
                .data(video.getData())
                .build();
    }

    @Override
    public void saveVideo(VideoDto videoDto) {
        if(videoRepository.existsByName(videoDto.getName()))
            throw new VideoAlreadyExistsException();
        try {
            Video video = new Video();
            video.setName(videoDto.getName());
            video.setGenre(videoDto.getGenre());
            video.setData(videoDto.getVideoFile().getBytes());
            videoRepository.save(video);
        }catch (IOException e){
            log.error("error occurred when reading bytes from multipart file");
            throw new GenericException();
        }
    }

    @Override
    public void deleteVideoByName(String name) {
        videoRepository.deleteByName(name);
    }
}
