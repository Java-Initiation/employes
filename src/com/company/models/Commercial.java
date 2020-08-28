package com.company.models;

public abstract class Commercial extends Employe {

    protected double chiffreAffaire;

    public Commercial(String prenom, String nom, int age, double chiffreAffaire) {
        super(prenom, nom, age);
        this.chiffreAffaire = chiffreAffaire;
    }

}
