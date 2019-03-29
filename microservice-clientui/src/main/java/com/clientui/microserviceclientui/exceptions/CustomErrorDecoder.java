package com.clientui.microserviceclientui.exceptions;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {

    /*If no condition is done, we send the default error*/
    private final ErrorDecoder defaultErrorDecoder = new Default();
    /*If a 404 error exists, we send a custom error*/
    @Override
    public Exception decode(String methodKey, Response response) {
        if(response.status() == 404)  {
            return new AdventureNotFoundException("Aventure non trouvée");
        }
        return defaultErrorDecoder.decode(methodKey, response);
    }
}
