package com.example.assignment.dto;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
public class ResponseDto {

    private String code;

    private String message;

    private Object data;

    private String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));


    /**
     * @param code
     * @param message
     * @param data
     * @return ResponseEntity<ResponseDto>()
     * @description Return Success Response
     */

    public ResponseEntity<?> successResponse(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
        return new ResponseEntity<>(this, HttpStatus.OK);
    }

    /**
     * @param code
     * @param message
     * @param data
     * @param httpStatus
     * @return ResponseEntity<ResponseDto>()
     * @description Return Failed Response
     */
    public ResponseEntity<?> failureResponse(String code, String message, Object data, HttpStatus httpStatus) {
        this.code = code;
        this.message = message;
        this.data = data;
        return new ResponseEntity<>(this, httpStatus);
    }
}
