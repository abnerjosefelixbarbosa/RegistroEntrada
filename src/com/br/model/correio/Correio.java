package com.br.model.correio;

public class Correio {

    private int Id;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Correio{" +
                "Id=" + Id +
                '}';
    }
}
