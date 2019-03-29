package com.example.microserviceorders.service;

import com.example.microserviceorders.dao.OrderDao;
import com.example.microserviceorders.exceptions.OrderNotFoundException;
import com.example.microserviceorders.model.Adventure;
import com.example.microserviceorders.model.Order;
import com.example.microserviceorders.proxies.MicroServiceConsultationProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderDao orderDao;

    @Autowired
    MicroServiceConsultationProxy microServiceConsultationProxy;

    public List<Order> getOrderListByUserId(int userId) {
        List<Order> orders = new ArrayList<>();
        orders = orderDao.findOrdersByUserId(userId);
        //permet de récupérer les noms des aventures de chaque reservation
        //solution temporaire
        if(orders.isEmpty()){
            throw  new OrderNotFoundException("Aucune réservation trouvée pour l'utilisateur d''id : "+userId);
        }

        List<Integer> adventure_ids = new ArrayList<>();
        for(Order order : orders){
            adventure_ids.add(order.getAdventure_id());
        }
        List<Adventure> adventures = microServiceConsultationProxy.getAdventureNameById(adventure_ids);
        HashMap<Integer, String> adventuresMap= new HashMap<>();
        for(Adventure adventure : adventures){
            adventuresMap.put(adventure.getAdventure_id(),adventure.getName());
        }
        for(Order order: orders){
            order.setAdventure_name(adventuresMap.get(order.getAdventure_id()));
        }
        return orders;
    }

    public Order saveOrder(int userId, int adventureId, Order order) {
        order.setAdventure_id(adventureId);
        order.setUser_id(userId);
        order.setDate(new Date());
        order = orderDao.addOrder(order);
        return order;
    }
}
