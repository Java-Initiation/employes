package com.company.models;

public class TechnARisque extends Technicien implements ARsique {

    public TechnARisque(String prenom, String nom, int age, int unites) {
        super(prenom, nom, age, unites);
    }

    @Override
    double calculerSalaire() {
        return super.calculerSalaire() + PRIME;
    }

}
