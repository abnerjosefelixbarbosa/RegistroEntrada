package com.br.registro.entities.condomino;

public class Condomino {
    private final int id;
    private final String nome;
    private final int apartamento;
    private final String bloco;
    private final boolean condominio;

    public Condomino(int id, String nome, int apartamento, String bloco, boolean condominio) {
        this.id = id;
        this.nome = nome;
        this.apartamento = apartamento;
        this.bloco = bloco;
        this.condominio = condominio;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getApartamento() {
        return apartamento;
    }

    public String getBloco() {
        return bloco;
    }

    public boolean isCondominio() {
        return condominio;
    }

    @Override
    public String toString() {
        return "Condomino{" +
                "Id=" + this.id +
                ", Nome='" + this.nome + '\'' +
                ", Apartamento=" + this.apartamento +
                ", Bloco='" + this.bloco + '\'' +
                ", Condominio=" + this.condominio +
                '}';
    }
}
