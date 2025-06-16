package com.zackjinji.springbootmall.service;

import com.zackjinji.springbootmall.dto.CreateOrderRequest;
import com.zackjinji.springbootmall.model.Order;

public interface OrderService {


    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);



}
