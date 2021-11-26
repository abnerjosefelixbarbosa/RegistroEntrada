package com.br.model.visitante;

public class Visitante {

    private int Id;
    private String Nome;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "Id=" + Id +
                ", Nome='" + Nome + '\'' +
                '}';
    }
}
