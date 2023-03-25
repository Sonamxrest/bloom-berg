package com.example.assignment.dto;

import com.example.assignment.model.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class OrderDto  {

    @NotNull(message = "Deal Id Cannot Be null")
    @NotEmpty(message = "Deal Id Cannot be Empty")
    private String dealId;

    @NotNull(message = "isoCode Cannot Be null")
    @NotEmpty(message = "Deal Id Cannot be Empty")
    private String isoCode;

    private String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyDDmm"));

    @NotNull(message = "amount Cannot Be null")
    @Min(value = 500, message = "Amount must be at least 500")
    private BigDecimal amount;

}
