package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Participante extends Pessoa implements CategoriaCompeticao{

    public String numeroCelular;
    public String numeroEmergencia;
    public String inscricao;

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
        return idade > maioridade;
    }

    public void verificarInscricao(){
        try {
            System.out.println("Ola " + nome + sobrenome + " !!");
            this.verificarCircuito(inscricao, idade, nome);
            } catch (InputMismatchException e){
            System.out.println(e.getMessage() );
        }

    }

   public void verificarCircuito(String inscricao, int idade, String nome){
        try{
            if (inscricao.equals("circuito_pequeno") ) {
                this.pagamentoCircuitoPequeno(idade);
            }
            if (inscricao.equals("circuito_medio")) {
                this.pagamentoCircuitoMedio(idade);
            }
            if (inscricao.equals("circuito_avancado")) {
                this.pagamentoCircuitoAvancado(idade,nome );
            }
        }catch (Exception e){
            System.out.println(e.getMessage() );

        }


}

   public void pagamentoCircuitoPequeno(int idade){
        try{
            boolean verifyMaiority = this.verificarMaiorIdade(idade);
            if (verifyMaiority){
                System.out.println("voce vai pagar R$1.500.");
            }else {
                System.out.println("Voce vai pagar R$1.300.");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage() );
        }

    }

   public void pagamentoCircuitoMedio(int idade){
        try{
            boolean verifyMaiority = this.verificarMaiorIdade(idade);

            if (verifyMaiority){
                System.out.println("voce vai pagar R$2.300.");
            }else {
                System.out.println("Voce vai pagar R$2.000");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage() );
        }

    }

   public void pagamentoCircuitoAvancado(int idade,  String nome) throws Error {
        try {
            boolean verifyMaiority = this.verificarMaiorIdade(idade);

            if (verifyMaiority){
                System.out.println("voce vai pagar R$2.800.");

            }else {
                throw new Error( nome + " Por ser menor de idade não tem autorizacao para participar nessa categoria");
            }
        }catch (Exception e){
            System.out.println(e.getMessage() );
        }

    }

    @Override
    public String toString() {
        return this.nome + " + " + this.inscricao;
    }
    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getNumeroEmergencia() {
        return numeroEmergencia;
    }

    public void setNumeroEmergencia(String numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }
}