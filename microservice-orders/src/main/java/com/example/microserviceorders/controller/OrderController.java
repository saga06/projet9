package com.example.microserviceorders.controller;

import com.example.microserviceorders.dao.OrderDao;
import com.example.microserviceorders.exceptions.OrderNotFoundException;
import com.example.microserviceorders.exceptions.PaymentException;
import com.example.microserviceorders.model.MsOrderRequest;
import com.example.microserviceorders.model.MsOrderResponse;
import com.example.microserviceorders.model.Order;
import com.example.microserviceorders.model.PaymentApiResponse;
import com.example.microserviceorders.proxies.MicroServiceConsultationProxy;
import com.example.microserviceorders.service.OrderService;
import com.example.microserviceorders.service.PaymentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(description = "orders handling")
@RestController
@CrossOrigin(origins = "*")
public class OrderController {

    @Autowired
    OrderDao orderDao;

    @Autowired
    PaymentService paymentService;

    @Autowired
    OrderService orderService;

    @Autowired
    MicroServiceConsultationProxy microServiceConsultationProxy;


    @GetMapping(value="order_for_user/{user_id}")
    public List<Order> orderListByUserId(@PathVariable("user_id") int userId) throws OrderNotFoundException{
        List<Order> orders = new ArrayList<>();
        try{
            orders = orderService.getOrderListByUserId(userId);
        }catch (OrderNotFoundException e){
            throw e;
        }
        return orders;
    }


    @PostMapping(value="do_order")
    public MsOrderResponse doOrder(@RequestBody MsOrderRequest request){
        MsOrderResponse msOrderResponse = new MsOrderResponse();

        try{
            PaymentApiResponse paymentApiResponse = paymentService.postPaymentRequest(request.getPayment());
            msOrderResponse.setPayment(paymentApiResponse.getResponse());
        }catch (PaymentException e){
            throw e;
        }

        Order order = new Order();
        order = orderService.saveOrder(request.getUserId(), request.getAdventureId(), order);
        msOrderResponse.setOrder(order);
        return msOrderResponse;
    }
}
