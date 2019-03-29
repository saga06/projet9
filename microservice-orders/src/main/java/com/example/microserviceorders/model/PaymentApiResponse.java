package com.example.microserviceorders.model;

public class PaymentApiResponse {

    private String code;

    private Payment response;

    private  String errorDescription;

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Payment getResponse() {
        return response;
    }

    public void setResponse(Payment response) {
        this.response = response;
    }
}
