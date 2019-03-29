package com.example.microserviceorders.dao;

import com.example.microserviceorders.model.Order;

public interface OrderRepositoryCustom {

    Order addOrder(Order order);
}
