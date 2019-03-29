package com.example.microserviceorders.service;

import com.example.microserviceorders.exceptions.PaymentException;
import com.example.microserviceorders.model.Payment;
import com.example.microserviceorders.model.PaymentApiResponse;
import com.example.microserviceorders.proxies.PaymentApiProxy;
import com.example.microserviceorders.proxies.PaymentApiProxyBouchon;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PaymentApiProxy paymentApiProxy;

    public PaymentApiResponse postPaymentRequest(Payment payment){

        paymentApiProxy = new PaymentApiProxyBouchon();
        PaymentApiResponse paymentApiResponse = paymentApiProxy.postPaymentData(payment);

        if(paymentApiResponse.getCode().equals("400")){
            throw  new PaymentException("Payment Refused");
        }

        return paymentApiResponse;
    }
}
