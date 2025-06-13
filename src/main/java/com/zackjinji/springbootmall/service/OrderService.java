package com.zackjinji.springbootmall.service;

import com.zackjinji.springbootmall.dto.CreateOrderRequest;
import com.zackjinji.springbootmall.model.Order;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
