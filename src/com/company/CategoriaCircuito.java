package com.company;

public interface CategoriaCircuito {

    int maioridade = 18;

    void verificarCircuito(String inscricao, int idade, String nome);
    void pagamentoCircuitoPequeno(int idade);
    void pagamentoCircuitoMedio(int idade);
    void pagamentoCircuitoAvancado(int idade,  String nome);
    }