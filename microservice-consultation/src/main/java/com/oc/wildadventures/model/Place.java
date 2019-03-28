package com.oc.wildadventures.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*Declaration of the bean as an entity*/
@Entity
public class Place {

    /*Attributes*/

    /*Id is our unique key :@Id*/
    @Id
    /*auto incremented: @GeneratedValue ; Strategy = GenerationType. IDENTITY : La génération de la clé primaire se fera à partir d’une Identité propre au SGBD. Il utilise un type de colonne spéciale à la base de données.
    Exemple pour MySQL, il s’agit d’un AUTO_INCREMENT.*/
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int place_id;
    private String name;
    private String country;
    private String city;

    /*Contructor by default*/

    public Place() {
    }

    /*Contructor*/

    public Place(String name, String country, String city) {
        this.name = name;
        this.country = country;
        this.city = city;
    }

    /* Getters and Setters*/

    public int getPlace_id() { return place_id; }
    public void setPlace_id(int place_id) { this.place_id = place_id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    /*Serialization*/

    @Override
    public String toString() {
        return "Place{" +
                "place_id=" + place_id +
                ", name=" + name +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
