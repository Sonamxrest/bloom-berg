package com.example.assignment.config;


import jakarta.persistence.AttributeConverter;
import org.apache.logging.log4j.util.Base64Util;

import java.util.Base64;

@jakarta.persistence.Converter
public class DefaultConverter implements AttributeConverter<Object, String> {
    @Override
    public String convertToDatabaseColumn(Object attribute) {
        return Base64Util.encode(attribute.toString());
    }

    @Override
    public Object convertToEntityAttribute(String dbData) {
        return new String(Base64.getDecoder().decode(dbData));
    }
}
