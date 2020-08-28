package com.company.models;

public class Representant extends Commercial {

    public Representant(String prenom, String nom, int age, double chiffreAffaire) {
        super(prenom, nom, age, chiffreAffaire);
    }

    @Override
    double calculerSalaire() {
        return chiffreAffaire * 0.10;
    }

}
