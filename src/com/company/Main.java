package com.company;

import com.company.models.*;

public class Main {

    public static void main(String[] args) {

        Personnel personnel = new Personnel();

        Manutentionnaire manutentionnaire = new Manutentionnaire("toto", "titi", 40, 50);
        Technicien technicien = new Technicien("ytrt", "dffd", 40, 500);
        Representant representant = new Representant("fjfdl", "dksml", 22, 60000);

        personnel.ajouterEmploye(manutentionnaire);
        personnel.ajouterEmploye(technicien);
        personnel.ajouterEmploye(representant);

        personnel.afficherSalaires();

        System.out.println(personnel.salaireMoyen());

    }
}
