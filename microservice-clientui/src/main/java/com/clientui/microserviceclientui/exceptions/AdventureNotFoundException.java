package com.clientui.microserviceclientui.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AdventureNotFoundException extends RuntimeException {
    public AdventureNotFoundException(String message) {
        /*Give the message to the parent class (RuntimeException)*/
        super(message);
    }
}
