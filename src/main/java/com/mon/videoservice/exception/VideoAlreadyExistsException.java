package com.mon.videoservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "a video with same name already exists")
public class VideoAlreadyExistsException extends RuntimeException{
}
