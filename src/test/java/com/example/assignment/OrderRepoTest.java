package com.example.assignment;

import com.example.assignment.dao.OrderDao;
import com.example.assignment.dao.daoImpl.OrderDaoImpl;
import com.example.assignment.model.Order;
import com.example.assignment.repo.OrderRepo;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class OrderRepoTest {

    @Mock private OrderRepo orderRepo;
    private OrderDao orderDao;

    @BeforeEach
    void setUp()
    {
        this.orderDao
                = new OrderDaoImpl(this.orderRepo);
    }

    @Test
    void getAllOrder()
    {
        orderDao.findAll();
        verify(orderRepo).findAll();
    }

    @Test
    void saveOrder() {
        Order o = new Order();
        o.setAmount(new BigDecimal(500));
        o.setDealId("as");
        o.setIsoCode("500");
        o = orderDao.save(o);
        Assert.assertTrue(o== null);
    }




}

