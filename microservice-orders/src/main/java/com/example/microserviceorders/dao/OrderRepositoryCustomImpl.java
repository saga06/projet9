package com.example.microserviceorders.dao;

import com.example.microserviceorders.model.Order;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

public class OrderRepositoryCustomImpl implements OrderRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public Order addOrder(Order order){
        Query query  = em.createNativeQuery("INSERT INTO orders (user_id, adventure_id, date) VALUES( :user_id, :adventure_id, :date)");
        query.setParameter("user_id", order.getUser_id());
        query.setParameter("adventure_id", order.getAdventure_id());
        query.setParameter("date", order.getDate());
        query.executeUpdate();
        return order;
    }
}
