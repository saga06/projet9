package com.oc.wildadventures.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/*Declaration of the bean as an entity*/
@Entity
public class Adventure implements Serializable {

    /*Attributes*/

    /*Id is our unique key :@Id*/
    @Id
    /*auto incremented: @GeneratedValue ; Strategy = GenerationType. IDENTITY : La génération de la clé primaire se fera à partir d’une Identité propre au SGBD. Il utilise un type de colonne spéciale à la base de données.
    Exemple pour MySQL, il s’agit d’un AUTO_INCREMENT.*/
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int adventure_id;
    private Date date_end;
    private Date date_start;
    private String description;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="category_id")
    private Category category;
    @OneToOne
    @JoinColumn(name = "place_id")
    private Place place;
    /* Test the lenght of the name => @Lenght*/
    @Length (min=2, max = 40)
    private String name;
    private int number_of_participants;
    private float price;
    @OneToMany
    @JoinColumn(name ="adventure_id")
    private List <Picture> pictures;


    /*Contructor by default*/

    public Adventure() {
    }

    /*Contructor*/

    public Adventure(Date date_end, Date date_start, String description, @Length(min = 2, max = 40) String name, int number_of_participants, float price, Category category, Place place, List <Picture> pictures) {
        this.date_end = date_end;
        this.date_start = date_start;
        this.description = description;
        this.name = name;
        this.number_of_participants = number_of_participants;
        this.price = price;
        this.category= category;
        this.place=place;
        this.pictures=pictures;
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

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    public Place getPlace() { return place; }
    public void setPlace(Place place) { this.place = place; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getNumber_of_participants() { return number_of_participants; }
    public void setNumber_of_participants(int number_of_participants) { this.number_of_participants = number_of_participants; }

    public float getPrice() { return price; }
    public void setPrice(float price) { this.price = price; }

    public List<Picture> getPictures() { return pictures; }
    public void setPictures(List<Picture> pictures) { this.pictures = pictures; }

    /*Serialization*/

    @Override
    public String toString() {
        return "Adventure{" +
                "adventure_id=" + adventure_id +
                ", date_end=" + date_end +
                ", date_start=" + date_start +
                ", description='" + description + '\'' +
                ", category'" + category.toString() + '\'' +
                ", place'" + place.toString() + '\'' +
                ", name='" + name + '\'' +
                ", number_of_participants=" + number_of_participants +
                ", price=" + price +
                '}';
    }
}
