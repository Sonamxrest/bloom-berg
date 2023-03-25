package com.example.assignment.config;

import com.example.assignment.dto.ResponseDto;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResponseMapper {
    public static ResponseDto RESPONSE_DTO = new ResponseDto();

    public static ObjectMapper OBJECT_MAAPPER = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
}
