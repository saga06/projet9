package com.oc.microservicecomment.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CommentNotFoundException extends RuntimeException {
    public CommentNotFoundException(String s) {
        /*Give the message to the parent class (RuntimeException)*/
        super(s);
    }
}

