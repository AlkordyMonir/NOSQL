package com.example.nosql.model;

import java.util.List;

public class Emprunteur {
    private String	Nom;

    public Emprunteur() {
    }

    private String	Adresse;
    private String	Numero_de_telephone;
    private List<Livre>	Liste_des_livres;

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getNumero_de_telephone() {
        return Numero_de_telephone;
    }

    public void setNumero_de_telephone(String numero_de_telephone) {
        Numero_de_telephone = numero_de_telephone;
    }

    public List<Livre> getListe_des_livres() {
        return Liste_des_livres;
    }

    public void setListe_des_livres(List<Livre> liste_des_livres) {
        Liste_des_livres = liste_des_livres;
    }

    public Emprunteur(String nom, String adresse, String numero_de_telephone, List<Livre> liste_des_livres) {
        Nom = nom;
        Adresse = adresse;
        Numero_de_telephone = numero_de_telephone;
        Liste_des_livres = liste_des_livres;
    }
}
