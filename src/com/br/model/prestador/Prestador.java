package com.br.model.prestador;

public class Prestador {

    private int Id;
    private String Nome;
    private String CPF;
    private String Empresa;
    private String CNPJ;
    private boolean Autonomo;

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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public boolean isAutonomo() {
        return Autonomo;
    }

    public void setAutonomo(boolean autonomo) {
        Autonomo = autonomo;
    }

    @Override
    public String toString() {
        return "Prestador{" +
                "Id=" + Id +
                ", Nome='" + Nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", Empresa='" + Empresa + '\'' +
                ", Autonomo=" + Autonomo +
                '}';
    }
}
