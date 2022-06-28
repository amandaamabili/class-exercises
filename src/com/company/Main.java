package com.company;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<Participante> participantsTotals = new ArrayList<>();


        InscricaoCircuito p1= new InscricaoCircuito("5.863.817", "Amanda Amabili", "Beirao Honorio", 27,"48998316108", "48998316109", "O+", "circuito_pequeno");
        InscricaoCircuito p2= new InscricaoCircuito("5.863.817", "Rossini", "Beirao Honorio", 27,"48998316108", "48998316109", "O+", "circuito_avancado");

//        participantsTotals.add(p1);
//        participantsTotals.add(p2);

       participantsTotals.stream()
               .filter(participante -> participante.getInscricao().equals("circuito_pequeno"))
               .collect(Collectors.toList())
               .forEach(System.out::println);

        p1.realizarInscricao();
        p2.realizarInscricao();


    }
}
