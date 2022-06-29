package com.company;

import java.util.*;

public class InscricaoCircuito  implements CategoriaCircuito, Inscricao  {
//    private Participante participante;
    private  List<Participante> ppList = new ArrayList<Participante>();
    private List<Participante> pmList = new ArrayList<Participante>();
    private List<Participante> pgList = new ArrayList<Participante>();


    public InscricaoCircuito() {
    }

    public boolean verificarMaiorIdade(int idade) {
        return idade > maioridade;
    }

    public void realizarInscricao(Participante participante){
        try {
            System.out.println("Ola " + participante.nome + participante.sobrenome + " !!");
            System.out.println(participante);

            this.verificarCircuito(participante.inscricao, participante.idade, participante.nome, participante);
             } catch (InputMismatchException e){
            System.out.println(e.getMessage() );
        }

    }

    public void verificarCircuito(String inscricao, int idade, String nome, Participante participante){
        try{
            if (inscricao.equals("circuito_pequeno") ) {
                this.pagamentoCircuitoPequeno(idade, participante);
                return;
            }
            if (inscricao.equals("circuito_medio")) {
                this.pagamentoCircuitoMedio(idade, participante);
                return;
            }
            if (inscricao.equals("circuito_avancado")) {
                this.pagamentoCircuitoAvancado(idade,nome, participante );
                return;
            }
             }catch (Exception e){
            System.out.println(e.getMessage() );
        }


    }




    public void pagamentoCircuitoPequeno(int idade, Participante participante){
        try{
            boolean verifyMaiority = this.verificarMaiorIdade(idade);
        ppList.add(participante);

        if (verifyMaiority){
                System.out.println("voce vai pagar R$1.500.");
            }else {

                System.out.println("Voce vai pagar R$1.300.");
            }

        System.out.println(ppList.size());


        }catch (Exception e) {
            System.out.println(e.getMessage() );
        }

    }

    public void pagamentoCircuitoMedio(int idade, Participante participante){
        try{
            boolean verifyMaiority = this.verificarMaiorIdade(idade);
            pmList.add(participante);

            if (verifyMaiority){
                System.out.println("voce vai pagar R$2.300.");
            }else {
                System.out.println("Voce vai pagar R$2.000");
            }

             }catch (Exception e) {
            System.out.println(e.getMessage() );
        }

    }

    public void pagamentoCircuitoAvancado(int idade,  String nome, Participante participante) throws Error {
        try {
            boolean verifyMaiority = this.verificarMaiorIdade(idade);
            pgList.add(participante);

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
    public void realizarInscricao() {

    }
}
