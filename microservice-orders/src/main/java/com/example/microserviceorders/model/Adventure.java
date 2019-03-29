package com.example.microserviceorders.model;

import org.hibernate.validator.constraints.Length;
import java.io.Serializable;
import java.util.Date;

/*Declaration of the bean as an entity*/
public class Adventure implements Serializable {

    /*Attributes*/

    private int adventure_id;
    private Date date_end;
    private Date date_start;
    private String description;
    private String name;
    private int number_of_participants;
    private float price;

    /*Contructor by default*/

    public Adventure() {
    }

    /*Contructor*/

    public Adventure(Date date_end, Date date_start, String description, @Length(min = 2, max = 40) String name, int number_of_participants, float price) {
        this.date_end = date_end;
        this.date_start = date_start;
        this.description = description;
        this.name = name;
        this.number_of_participants = number_of_participants;
        this.price = price;
    }

    /* Getters and Setters*/

    public int getAdventure_id() { return adventure_id; }
    public void setAdventure_id(int adventure_id) { this.adventure_id = adventure_id; }

    public Date getDate_end() { return date_end; }
    public void setDate_end(Date date_end) { this.date_end = date_end; }

    public Date getDate_start() { return date_start; }
    public void setDate_start(Date date_start) { this.date_start = date_start; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getNumber_of_participants() { return number_of_participants; }
    public void setNumber_of_participants(int number_of_participants) { this.number_of_participants = number_of_participants; }

    public float getPrice() { return price; }
    public void setPrice(float price) { this.price = price; }


    /*Serialization*/

    @Override
    public String toString() {
        return "Adventure{" +
                "adventure_id=" + adventure_id +
                ", date_end=" + date_end +
                ", date_start=" + date_start +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", number_of_participants=" + number_of_participants +
                ", price=" + price +
                '}';
    }
}
