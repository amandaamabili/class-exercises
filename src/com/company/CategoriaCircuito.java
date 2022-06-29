package com.company;

public interface CategoriaCircuito {

    int maioridade = 18;

    void verificarCircuito(String inscricao, int idade, String nome, Participante participante);
    void pagamentoCircuitoPequeno(int idade, Participante participante);
    void pagamentoCircuitoMedio(int idade, Participante participante);
    void pagamentoCircuitoAvancado(int idade,  String nome, Participante participante);
    }
