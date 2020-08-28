package com.company.models;

public class ManutARisque extends Manutentionnaire implements ARsique {

    public ManutARisque(String prenom, String nom, int age, int heures) {
        super(prenom, nom, age, heures);
    }

    @Override
    double calculerSalaire() {
        return super.calculerSalaire() + PRIME;
    }
}
