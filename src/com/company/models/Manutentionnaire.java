package com.company.models;

public class Manutentionnaire extends Employe {

    int heures;

    public Manutentionnaire(String prenom, String nom, int age, int heures) {
        super(prenom, nom, age);
        this.heures = heures;
    }

    @Override
    double calculerSalaire() {
        return 20 * heures;
    }

}
