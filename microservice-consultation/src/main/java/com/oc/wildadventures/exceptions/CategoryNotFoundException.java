package com.oc.wildadventures.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException(String s) {

        /*Give the message to the parent class (RuntimeException)*/
        super(s);
    }
}

