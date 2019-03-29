package com.example.microserviceorders.proxies;

import com.example.microserviceorders.model.Payment;
import com.example.microserviceorders.model.PaymentApiResponse;

public class PaymentApiProxyBouchon implements PaymentApiProxy{

    @Override
    public PaymentApiResponse postPaymentData(Payment payment) {

        PaymentApiResponse paymentApiResponse = new PaymentApiResponse();
        if(payment == null || payment.getAccountNumber() == null){
            paymentApiResponse.setCode("400");
            paymentApiResponse.setErrorDescription("Some payment error");
        }else{
            paymentApiResponse.setCode("200");
            paymentApiResponse.setResponse(payment);
        }

        return paymentApiResponse;
    }
}
