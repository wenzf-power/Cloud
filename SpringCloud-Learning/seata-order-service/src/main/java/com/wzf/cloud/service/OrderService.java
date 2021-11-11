package com.wzf.cloud.service;


import com.wzf.cloud.domain.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
