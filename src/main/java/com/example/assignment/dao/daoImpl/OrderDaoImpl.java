package com.example.assignment.dao.daoImpl;

import com.example.assignment.dao.BaseDaoImpl;
import com.example.assignment.dao.OrderDao;
import com.example.assignment.model.Order;
import com.example.assignment.repo.OrderRepo;
import org.springframework.stereotype.Service;

@Service
public class OrderDaoImpl  extends BaseDaoImpl<Order, Long> implements OrderDao {

    private final OrderRepo orderRepo;

    public OrderDaoImpl(OrderRepo orderRepo) {
        super(orderRepo);
        this.orderRepo = orderRepo;
    }
}
