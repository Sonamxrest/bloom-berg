package com.example.assignment;

import com.example.assignment.config.ResponseMapper;
import com.example.assignment.controller.OrderController;
import com.example.assignment.dao.OrderDao;
import com.example.assignment.dto.OrderDto;
import com.example.assignment.model.Order;
import com.example.assignment.service.OrderService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(OrderController.class)
public class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private OrderService orderService;
//
//    @Test
//    public void testGetUserById() throws Exception {
//        when(orderService.getAll())
//                .thenReturn(
//                        (ResponseMapper.
//                                RESPONSE_DTO
//                                .successResponse("200","Success", Arrays.asList(new OrderDto()))
//                ));
//        mockMvc.perform(get("/v1/Order"))
//                .andExpect(status().isOk());
//    }
}
