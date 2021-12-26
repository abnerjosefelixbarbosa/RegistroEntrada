package com.br.registro.entities.correio;

public class Correio {
    private int id;

    public Correio(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Correio{" +
                "Id=" + id +
                '}';
    }
}
