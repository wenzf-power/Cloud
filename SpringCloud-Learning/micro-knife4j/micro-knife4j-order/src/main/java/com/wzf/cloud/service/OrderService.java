package com.wzf.cloud.service;

import com.wzf.cloud.domain.Order;


public interface OrderService {
    void create(Order order);

    Order getOrder(Long id);

    void update(Order order);

    void delete(Long id);
}
