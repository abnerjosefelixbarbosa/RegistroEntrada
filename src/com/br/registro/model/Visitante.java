package com.br.registro.model;

public class Visitante {
    private final int id;
    private final String nome;

    public Visitante(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "Id=" + id +
                ", Nome='" + nome + '\'' +
                '}';
    }
}
