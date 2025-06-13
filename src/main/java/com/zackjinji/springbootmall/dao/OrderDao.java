package com.zackjinji.springbootmall.dao;

import com.zackjinji.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer createOrder(Integer userId, Integer  totalAmount);

    void createOrderItems (Integer orderId, List<OrderItem> orderItemList);
}
