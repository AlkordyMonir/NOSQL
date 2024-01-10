package com.example.nosql.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document(collation = "books")
public class Livre {
    @Id
    private String id;
    private String 	Titre;
    private Auteur auteur;
    private String  Catégorie;
    private String ISBN ;
    private Boolean Disponibilite;
    private Date Date_de_publication;
}
