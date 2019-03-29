package com.oc.microservicecomment.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Comment implements Serializable {

    @Id
    /*auto incremented: @GeneratedValue ; Strategy = GenerationType. IDENTITY : La génération de la clé primaire se fera à partir d’une Identité propre au SGBD. Il utilise un type de colonne spéciale à la base de données.
    Exemple pour MySQL, il s’agit d’un AUTO_INCREMENT.*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="comment_id")
    private int id;
    @Column(name="comment")
    private String commentaire;
    @Column(name="date")
    private Date dateComment;
    @Column(name="adventure_id")
    private int idAdventure;
    @Column(name="user_id")
    private int idUser;

    public Comment() {

    }

    public Comment(String commentaire, Date dateComment, int idAdventure, int idUser) {
        this.commentaire = commentaire;
        this.dateComment = dateComment;
        this.idAdventure = idAdventure;
        this.idUser = idUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDateComment() {
        return dateComment;
    }

    public void setDateComment(Date dateComment) {
        this.dateComment = dateComment;
    }

    public int getIdAdventure() {
        return idAdventure;
    }

    public void setIdAdventure(int idAdventure) {
        this.idAdventure = idAdventure;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "idComment=" + id +
                ", commentaire='" + commentaire + '\'' +
                ", dateComment=" + dateComment +
                ", idAdventure=" + idAdventure +
                ", idUser=" + idUser +
                '}';
    }
}
