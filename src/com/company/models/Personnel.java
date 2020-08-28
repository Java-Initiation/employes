package com.company.models;

import java.util.ArrayList;

public class Personnel {

    static final int MAX_EMPLOYE = 5;

    ArrayList<Employe> staff = new ArrayList<>();

    public void ajouterEmploye(Employe employe){
        if (staff.size() < MAX_EMPLOYE)
            staff.add(employe);
        else
            System.out.println("On ne peut plus ajouter d'employés");
    }

    public double salaireMoyen(){
        double sum = 0.0;
        for (Employe employe: staff) {
            sum += employe.calculerSalaire();
        }
        return sum / staff.size();
    }

    public void afficherSalaires(){
        for (Employe employe: staff) {
            System.out.println(employe.nom + " : " + employe.calculerSalaire());
        }
    }

}
