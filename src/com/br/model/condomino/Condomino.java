package com.br.model.condomino;

public class Condomino {

    private int Id;
    private String Nome;
    private int Apartamento;
    private String Bloco;
    private boolean Condominio;

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

    public int getApartamento() {
        return Apartamento;
    }

    public void setApartamento(int apartamento) {
        Apartamento = apartamento;
    }

    public String getBloco() {
        return Bloco;
    }

    public void setBloco(String bloco) {
        Bloco = bloco;
    }

    public boolean isCondominio() {
        return Condominio;
    }

    public void setCondominio(boolean condominio) {
        Condominio = condominio;
    }

    @Override
    public String toString() {
        return "Condomino{" +
                "Id=" + Id +
                ", Nome='" + Nome + '\'' +
                ", Apartamento=" + Apartamento +
                ", Bloco='" + Bloco + '\'' +
                ", Condominio=" + Condominio +
                '}';
    }
}
