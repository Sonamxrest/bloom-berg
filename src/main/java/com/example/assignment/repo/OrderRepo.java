package com.example.assignment.repo;

import com.example.assignment.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends BaseRepository<Order,Long> {
}
