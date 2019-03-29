package com.example.microserviceorders.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class PaymentException extends RuntimeException {

    public PaymentException(String s){
        super(s);
    }
}
