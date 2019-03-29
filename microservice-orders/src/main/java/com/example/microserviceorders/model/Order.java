package com.example.microserviceorders.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order implements Serializable {

    @Id
    @GeneratedValue
    private int order_id;
    private int user_id;
    private int adventure_id;
    private Date date;

    @Transient
    @JsonInclude()
    private String adventure_name;

    public String getAdventure_name() {
        return adventure_name;
    }

    public void setAdventure_name(String adventure_name) {
        this.adventure_name = adventure_name;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getAdventure_id() {
        return adventure_id;
    }

    public void setAdventure_id(int adventure_id) {
        this.adventure_id = adventure_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
