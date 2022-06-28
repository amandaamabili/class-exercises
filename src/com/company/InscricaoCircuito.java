package com.company;

import java.util.InputMismatchException;
import java.util.List;

public class InscricaoCircuito  implements CategoriaCircuito, Inscricao  {
    private Participante participante;
    private List<Participante> ppList = List.of();
    private List<Participante> pmList = List.of();
    private List<Participante> pgList = List.of();


    public InscricaoCircuito(Participante participante) {
        this.participante = participante;
        System.out.println(participante.inscricao );
    }


    public void realizarInscricao(Participante participante){
        //validar qual o tipo de inscrição
        ppList.add(participante);

    }

    public boolean verificarMaiorIdade(int idade) {
        return idade > maioridade;
    }

    public void realizarInscricao(){

        try {
            System.out.println("Ola " + participante.nome + participante.sobrenome + " !!");
            this.verificarCircuito(participante.inscricao, participante.idade, participante.nome);
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
}
