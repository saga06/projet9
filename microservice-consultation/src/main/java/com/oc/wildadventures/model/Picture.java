package com.oc.wildadventures.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*Declaration of the bean as an entity*/
@Entity
public class Picture {

    /*Attributes*/

    /*Id is our unique key :@Id*/
    @Id
    /*auto incremented: @GeneratedValue ; Strategy = GenerationType. IDENTITY : La génération de la clé primaire se fera à partir d’une Identité propre au SGBD. Il utilise un type de colonne spéciale à la base de données.
    Exemple pour MySQL, il s’agit d’un AUTO_INCREMENT.*/
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int picture_id;
    private int adventure_id;
    private String path;

    /*Contructor by default*/

    public Picture() {
    }

    /*Contructor*/

    public Picture(int adventure_id, String path) {
        this.adventure_id = adventure_id;
        this.path = path;
    }

    /* Getters and Setters*/

    public int getPicture_id() { return picture_id; }
    public void setPicture_id(int picture_id) { this.picture_id = picture_id; }

    public int getAdventure_id() { return adventure_id; }
    public void setAdventure_id(int adventure_id) { this.adventure_id = adventure_id; }

    public String getPath() { return path; }
    public void setPath(String path) { this.path = path; }

    /*Serialization*/

    @Override
    public String toString() {
        return "Picture{" +
                "picture_id=" + picture_id +
                ", adventure_id=" + adventure_id +
                ", path='" + path + '\'' +
                '}';
    }
}
