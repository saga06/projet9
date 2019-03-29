package com.example.microserviceorders.dao;


import com.example.microserviceorders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface OrderDao extends JpaRepository<Order, Integer>, OrderRepositoryCustom {

    @Query("SELECT o FROM Order o WHERE o.user_id= :user_id")
    List<Order> findOrdersByUserId(int user_id);

}
