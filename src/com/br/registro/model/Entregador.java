package com.br.registro.entities.entregador;

public class Entregador {
    private final int id;
    private final String nome;
    private final String empresa;

    public Entregador(int id, String nome, String empresa) {
        this.id = id;
        this.nome = nome;
        this.empresa = empresa;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    @Override
    public String toString() {
        return "Entregador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", empresa='" + empresa + '\'' +
                '}';
    }
}
