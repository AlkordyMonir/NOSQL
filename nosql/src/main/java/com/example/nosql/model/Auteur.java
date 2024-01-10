package com.example.nosql.model;

import java.util.Date;
import java.util.List;

public class Auteur {
    public Auteur(String nom, String biographie, Date date_de_naissance, List<Livre> liste_des_livres) {
        Nom = nom;
        Biographie = biographie;
        Date_de_naissance = date_de_naissance;
        Liste_des_livres = liste_des_livres;
    }

    public Auteur() {
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getBiographie() {
        return Biographie;
    }

    public void setBiographie(String biographie) {
        Biographie = biographie;
    }

    public Date getDate_de_naissance() {
        return Date_de_naissance;
    }

    public void setDate_de_naissance(Date date_de_naissance) {
        Date_de_naissance = date_de_naissance;
    }

    public List<Livre> getListe_des_livres() {
        return Liste_des_livres;
    }

    public void setListe_des_livres(List<Livre> liste_des_livres) {
        Liste_des_livres = liste_des_livres;
    }

    private String	Nom;
    private String	Biographie;
    private Date  Date_de_naissance;
    private List <Livre> Liste_des_livres;

}