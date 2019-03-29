package com.example.microserviceorders.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.math.BigDecimal;

public class Payment {

    public Payment(){}

    private String accountNumber;
    private BigDecimal amount;
    private String currency;
    //Maybe the credit card number
    private String Identification;
    //maybe the credit card "secret" number
    private String SecondaryIdentification;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getIdentification() {
        return Identification;
    }

    public void setIdentification(String identification) {
        Identification = identification;
    }

    public String getSecondaryIdentification() {
        return SecondaryIdentification;
    }

    public void setSecondaryIdentification(String secondaryIdentification) {
        SecondaryIdentification = secondaryIdentification;
    }
}
