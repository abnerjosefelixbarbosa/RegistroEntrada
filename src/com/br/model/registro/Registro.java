package com.br.model.registro;

import com.br.model.condomino.Condomino;
import com.br.model.prestador.Prestador;

import java.util.Date;

public class Registro {

    private int Id;
    private Date DataHora;
    private Prestador Prestador;
    private Condomino Condomino;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Date getDataHora() {
        return DataHora;
    }

    public void setDataHora(Date dataHora) {
        DataHora = dataHora;
    }

    public com.br.model.prestador.Prestador getPrestador() {
        return Prestador;
    }

    public void setPrestador(com.br.model.prestador.Prestador prestador) {
        Prestador = prestador;
    }

    public com.br.model.condomino.Condomino getCondomino() {
        return Condomino;
    }

    public void setCondomino(com.br.model.condomino.Condomino condomino) {
        Condomino = condomino;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "Id=" + Id +
                ", DataHora=" + DataHora +
                ", Prestador=" + Prestador +
                ", Condomino=" + Condomino +
                '}';
    }
}
