package com.company;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<Participante> participantsTotals = new ArrayList<>();


        Participante p1= new Participante( "5.863.817", "Amanda Amabili", "Beirao Honorio", 27,"48998316108", "48998316109", "O+", "circuito_pequeno");
        Participante p2= new Participante("5.863.817", "Rossini", "Beirao Honorio", 27,"48998316108", "48998316109", "O+", "circuito_avancado");

        InscricaoCircuito inscricaop1 = new InscricaoCircuito();
        InscricaoCircuito inscricaop2 = new InscricaoCircuito();


//        participantsTotals.stream()
//               .filter(participante -> participante.getInscricao().equals("circuito_pequeno"))
//               .collect(Collectors.toList())
//               .forEach(System.out::println);



        inscricaop1.realizarInscricao(p1);
        inscricaop2.realizarInscricao(p2);


    }
}
