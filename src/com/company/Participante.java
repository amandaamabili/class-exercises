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
    public boolean verificarMaiorIdade(int idade) {
        return idade > 18;
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
        boolean verifyMaiority = this.verificarMaiorIdade(idade);
        if (verifyMaiority){
            System.out.println("voce vai pagar R$1.500.");
        }else {
            System.out.println("Voce vai pagar R$1.300.");
        }
    }

    void pagamentoCircuitoMedio(int idade){
        boolean verifyMaiority = this.verificarMaiorIdade(idade);

        if (verifyMaiority){
            System.out.println("voce vai pagar R$2.300.");
        }else {
            System.out.println("Voce vai pagar R$2.000");
        }
    }

    void pagamentoCircuitoAvancado(int idade){
        boolean verifyMaiority = this.verificarMaiorIdade(idade);

        if (verifyMaiority){
            System.out.println("voce vai pagar R$2.800.");

        }else {
            System.out.println("Voce nao tem permissao para participar nesse circuito");

        }
    }

    @Override
    public String toString() {
        return this.nome + " + " + this.inscricao;
    }
}