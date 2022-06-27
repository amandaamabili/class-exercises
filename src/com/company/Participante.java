package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Participante extends Pessoa{

    public Participante(String rg, String nome, String sobrenome, int idade, String numeroCelular, String numeroEmergencia, String grupoSanguineo, String inscricao) {
    this.rg = rg ;
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.idade = idade;
    this.numeroCelular = numeroCelular;
    this.numeroEmergencia = numeroEmergencia;
    this.grupoSanguineo = grupoSanguineo;
    this.inscricao = inscricao;

    }


    @Override
    public boolean verificarMaiorIdade() {
        return false;
    }

    void verificarInscricao(){
        try {
            System.out.println("Ola " + nome + sobrenome + " !!");
            this.verificarCircuito(inscricao, idade);
            }catch (InputMismatchException ex){
            System.out.println(ex.getMessage() );
        }

    }

    void verificarCircuito(String inscricao, int idade){
        if (inscricao.equals("circuito_pequeno") ) {
            this.pagamentoCircuitoPequeno(idade);
        }
        if (inscricao.equals("circuito_medio")) {
            this.pagamentoCircuitoMedio(idade);
        }
        if (inscricao.equals("circuito_avancado")) {
            this.pagamentoCircuitoAvancado(idade);
        }

}

    void pagamentoCircuitoPequeno(int idade){
        ArrayList<Object> participantes2Km = new ArrayList<>();
        participantes2Km.add(nome);
        if (idade < 18){
            System.out.println("Voce vai pagar R$1.300.");
        }
            System.out.println("voce vai pagar R$1.500.");
        System.out.println("lista" + participantes2Km);

    }

    void pagamentoCircuitoMedio(int idade){
        if (idade < 18){
            System.out.println("Voce vai pagar R$2.000");
        }
            System.out.println("voce vai pagar R$2.300.");
    }

    void pagamentoCircuitoAvancado(int idade){
        if (idade < 18){
            System.out.println("Voce nao tem permissao para participar nesse circuito");
        }
            System.out.println("voce vai pagar R$2.800.");
    }


    void addParticipantInList(){

    }

    @Override
    public String toString() {
        return this.nome + " + " + this.inscricao;
    }
}