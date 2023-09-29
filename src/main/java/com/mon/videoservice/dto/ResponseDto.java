package com.mon.videoservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDto<T>{
    private String message;
    private int responseCode;
    private T data;

    public static <T> ResponseDto<T> wrapSuccessResponse(T data){
        ResponseDto<T> responseDto = new ResponseDto<T>();
        responseDto.setResponseCode(0);
        responseDto.setMessage("success");
        responseDto.setData(data);
        return responseDto;
    }
}
