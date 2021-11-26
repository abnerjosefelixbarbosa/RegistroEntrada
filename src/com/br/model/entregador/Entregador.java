package com.br.model.entregador;

public class Entregador {

    private int Id;
    private String Nome;
    private String Empresa;

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

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    @Override
    public String toString() {
        return "Entregador{" +
                "Id=" + Id +
                ", Nome='" + Nome + '\'' +
                ", Empresa='" + Empresa + '\'' +
                '}';
    }

}
