package com.company.models;

public class Vendeur extends Commercial {

    public Vendeur(String prenom, String nom, int age, double chiffreAffaire) {
        super(prenom, nom, age, chiffreAffaire);
    }

    @Override
    double calculerSalaire() {
        return chiffreAffaire * 0.20;
    }

}
