package com.example.assignment.model;

import com.example.assignment.config.DefaultConverter;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "order_table")
public class Order extends BaseEntity<Long> {

    @Convert(converter = DefaultConverter.class)
    @Column(nullable = false, unique = true)
    private String dealId;

    @Column(nullable = false)
    @Convert(converter = DefaultConverter.class)
    private String isoCode;

    @Column(nullable = false)
    @Convert(converter = DefaultConverter.class)
    private String timestamp;

    @Column(nullable = false)
    private BigDecimal amount;

}
