package com.company.models;

public class Technicien extends Employe {

    int unites;

    public Technicien(String prenom, String nom, int age, int unites) {
        super(prenom, nom, age);
        this.unites = unites;
    }

    @Override
    double calculerSalaire() {
        return unites * 5;
    }

}
