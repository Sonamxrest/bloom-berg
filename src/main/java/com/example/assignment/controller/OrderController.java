package com.example.assignment.controller;

import com.example.assignment.dto.OrderDto;
import com.example.assignment.service.OrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/Order")
@RequiredArgsConstructor
@Slf4j
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> saveOrder( @Valid  @RequestBody OrderDto orderDto) {
        log.info("Requesting order :- {}", orderDto.toString());
        return orderService.save(orderDto);
    }

    @GetMapping
    public ResponseEntity<?> allOrders() {
        log.info("Requesting all order");
        return orderService.getAll();
    }


}
