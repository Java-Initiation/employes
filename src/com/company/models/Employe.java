package com.company.models;

public abstract class Employe {

    protected String prenom, nom;
    protected int age;

    public Employe(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }

    abstract double calculerSalaire();

}
