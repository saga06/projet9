package com.clientui.microserviceclientui.beans;

import org.hibernate.validator.constraints.Length;

import java.util.Date;
import java.util.List;
import java.util.Locale;

public class AdventureBean {

    private int adventure_id;
    private Date date_end;
    private Date date_start;
    private String description;
    private CategoryBean category;
    private PlaceBean place;
    private String name;
    private int number_of_participants;
    private float price;
    private List<PictureBean> pictures;

    public AdventureBean() {
    }

    public int getAdventure_id() {
        return adventure_id;
    }

    public void setAdventure_id(int adventure_id) {
        this.adventure_id = adventure_id;
    }

    public Date getDate_end() {
        return date_end;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }

    public Date getDate_start() {
        return date_start;
    }

    public void setDate_start(Date date_start) {
        this.date_start = date_start;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryBean getCategory() {
        return category;
    }

    public void setCategory(CategoryBean category) {
        this.category = category;
    }

    public PlaceBean getPlace() {
        return place;
    }

    public void setPlace(PlaceBean place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber_of_participants() {
        return number_of_participants;
    }

    public void setNumber_of_participants(int number_of_participants) {
        this.number_of_participants = number_of_participants;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public List<PictureBean> getPictures() {
        return pictures;
    }

    public void setPictures(List<PictureBean> pictures) {
        this.pictures = pictures;
    }


}
