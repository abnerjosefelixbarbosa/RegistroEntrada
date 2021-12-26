package com.br.registro.model;

public class Prestador {
    private final int id;
    private final String nome;
    private final String cpf;
    private final String empresa;
    private final String cnpj;
    private final boolean autonomo;

    public Prestador(int id, String nome, String cpf, String empresa, String cnpj, boolean autonomo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.empresa = empresa;
        this.cnpj = cnpj;
        this.autonomo = autonomo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public boolean isAutonomo() {
        return autonomo;
    }

    @Override
    public String toString() {
        return "Prestador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", empresa='" + empresa + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", autonomo=" + autonomo +
                '}';
    }
}
