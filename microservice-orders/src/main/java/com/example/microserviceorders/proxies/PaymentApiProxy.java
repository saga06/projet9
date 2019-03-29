package com.example.microserviceorders.proxies;

import com.example.microserviceorders.model.Payment;
import com.example.microserviceorders.model.PaymentApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(name = "payment", url = "whatever")
public interface PaymentApiProxy {

    @PostMapping
    PaymentApiResponse postPaymentData(@RequestParam("payment")Payment payment);
}
