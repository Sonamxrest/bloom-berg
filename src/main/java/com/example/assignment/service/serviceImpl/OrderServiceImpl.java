package com.example.assignment.service.serviceImpl;

import com.example.assignment.config.ResponseMapper;
import com.example.assignment.dao.OrderDao;
import com.example.assignment.dto.OrderDto;
import com.example.assignment.model.Order;
import com.example.assignment.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class OrderServiceImpl extends BaseServiceImpl<Order, Long> implements OrderService {

    private final OrderDao orderDao;

    public OrderServiceImpl(OrderDao orderDao) {
        super(orderDao);
        this.orderDao = orderDao;
    }

    @Override
    public ResponseEntity<?> save(OrderDto orderDto) {
        try {
            Order order = ResponseMapper.OBJECT_MAAPPER.convertValue(orderDto, Order.class);
            order = orderDao.save(order);
            log.info("Successfully saved order :- {}", order);
            return ResponseMapper.RESPONSE_DTO.successResponse("200", "Successfully Saved Order", order);
        } catch (IllegalArgumentException ie) {
            log.error("Illegal Argument Exception :-", ie);
            return ResponseMapper.RESPONSE_DTO.failureResponse("400", ie.getMessage(), ie, HttpStatus.BAD_REQUEST);

        }
    }
    @Override
    public ResponseEntity<?> getAll() {
        try {
            List<Order> order = orderDao.findAll();
            List<OrderDto> orderDtos = Arrays.asList(ResponseMapper.OBJECT_MAAPPER.convertValue(order, OrderDto[].class));
            log.info("Successfully retrived order :- {}", order);
            return ResponseMapper.RESPONSE_DTO.successResponse("200", "Successfully Retrieved Order", orderDtos);
        } catch (IllegalArgumentException ie) {
            log.error("Illegal Argument Exception :-", ie);
            return ResponseMapper.RESPONSE_DTO.failureResponse("400", ie.getMessage(), ie, HttpStatus.BAD_REQUEST);

        }
    }
}
