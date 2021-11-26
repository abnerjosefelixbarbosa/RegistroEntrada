package com.br.model.registro;

import com.br.model.condomino.Condomino;
import com.br.model.correio.Correio;
import com.br.model.entregador.Entregador;
import com.br.model.prestador.Prestador;
import com.br.model.visitante.Visitante;

import java.util.Date;

public class Registro {

    private int Id;
    private Date DataHora;
    private Entregador Entregador;
    private Prestador Prestador;
    private Correio Correio;
    private Condomino Condomino;
    private Visitante Visitante;

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

    public com.br.model.entregador.Entregador getEntregador() {
        return Entregador;
    }

    public void setEntregador(com.br.model.entregador.Entregador entregador) {
        Entregador = entregador;
    }

    public com.br.model.prestador.Prestador getPrestador() {
        return Prestador;
    }

    public void setPrestador(com.br.model.prestador.Prestador prestador) {
        Prestador = prestador;
    }

    public com.br.model.correio.Correio getCorreio() {
        return Correio;
    }

    public void setCorreio(com.br.model.correio.Correio correio) {
        Correio = correio;
    }

    public com.br.model.condomino.Condomino getCondomino() {
        return Condomino;
    }

    public void setCondomino(com.br.model.condomino.Condomino condomino) {
        Condomino = condomino;
    }

    public com.br.model.visitante.Visitante getVisitante() {
        return Visitante;
    }

    public void setVisitante(com.br.model.visitante.Visitante visitante) {
        Visitante = visitante;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "Id=" + Id +
                ", DataHora=" + DataHora +
                ", Entregador=" + Entregador +
                ", Prestador=" + Prestador +
                ", Correio=" + Correio +
                ", Condomino=" + Condomino +
                ", Visitante=" + Visitante +
                '}';
    }

}
