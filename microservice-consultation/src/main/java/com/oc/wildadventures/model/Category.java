package com.oc.wildadventures.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/*Declaration of the bean as an entity*/
@Entity
public class Category implements Serializable {

    /*Attributes*/

    /*Id is our unique key :@Id*/
    @Id
    /*auto incremented: @GeneratedValue ; Strategy = GenerationType. IDENTITY : La génération de la clé primaire se fera à partir d’une Identité propre au SGBD. Il utilise un type de colonne spéciale à la base de données.
    Exemple pour MySQL, il s’agit d’un AUTO_INCREMENT.*/
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int category_id;
    private String name;
    private String description;

    /*Contructor by default*/

    public Category() {
    }

    /*Contructor*/

    public Category(String name) {
        this.name = name;
    }

    /* Getters and Setters*/

    public int getCategory_id() { return category_id; }
    public void setCategory_id(int category_id) { this.category_id = category_id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    /*Serialization*/

    @Override
    public String toString() {
        return "Category{" +
                "category_id=" + category_id +
                ", name='" + name + '\'' +
                ", description='" + description +'\'' +
                '}';
    }
}
