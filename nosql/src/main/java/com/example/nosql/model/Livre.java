package com.example.nosql.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


import java.util.Date;

@Document("boo")
public class Livre {
    public Livre(String id, String titre, Auteur auteur, String categorie, String ISBN, Boolean disponibilite, Date date_de_publication) {
        this.id = id;
        Titre = titre;
       // this.auteur = auteur;
        Categorie = categorie;
        this.ISBN = ISBN;
        Disponibilite = disponibilite;
        Date_de_publication = date_de_publication;
    }

    @Id
    private String id;

    public Livre(String id, String titre, String categorie, String ISBN, Boolean disponibilite) {
        this.id = id;
        Titre = titre;
        Categorie = categorie;
        this.ISBN = ISBN;
        Disponibilite = disponibilite;
    }

    public Livre(String id, String titre, String categorie, String ISBN, Boolean disponibilite, Date date_de_publication) {
        this.id = id;
        Titre = titre;
        Categorie = categorie;
        this.ISBN = ISBN;
        Disponibilite = disponibilite;
        Date_de_publication = date_de_publication;
    }

    @Autowired
    @Field
    private String 	Titre;
    //@Autowired
    //@Field
   // private Auteur auteur;
    @Autowired
    @Field
    private String  Categorie;
    private String ISBN ;
    @Autowired
    @Field
    private Boolean Disponibilite;

    public Livre() {
    }

    @Autowired
    @Field
    private Date Date_de_publication;

    public Livre(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

   // public Auteur getAuteur() {
      //  return auteur;
   // }

   // public void setAuteur(Auteur auteur) {
    //    this.auteur = auteur;
    //}

    public String getCategorie() {
        return Categorie;
    }

    public void setCategorie(String categorie) {
        Categorie = categorie;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Boolean getDisponibilite() {
        return Disponibilite;
    }

    public void setDisponibilite(Boolean disponibilite) {
        Disponibilite = disponibilite;
    }

    public Date getDate_de_publication() {
        return Date_de_publication;
    }

    public void setDate_de_publication(Date date_de_publication) {
        Date_de_publication = date_de_publication;
    }
}
