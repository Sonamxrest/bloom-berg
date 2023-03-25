package com.example.assignment.service;

import com.example.assignment.dao.BaseDao;
import com.example.assignment.dto.OrderDto;
import com.example.assignment.model.Order;
import org.springframework.http.ResponseEntity;

public interface OrderService extends BaseService<Order, Long> {
    ResponseEntity<?> save(OrderDto orderDto);
    ResponseEntity<?> getAll();
}
