package com.mon.videoservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, code = HttpStatus.NOT_FOUND, reason = "video not found")
public class VideoNotFoundException extends RuntimeException{

    public VideoNotFoundException() {
    }

    public VideoNotFoundException(String message) {
        super(message);
    }
}
