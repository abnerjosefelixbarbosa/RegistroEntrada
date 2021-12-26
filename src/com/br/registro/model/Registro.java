package com.br.registro.entities.registro;

import com.br.registro.entities.condomino.Condomino;
import com.br.registro.entities.correio.Correio;
import com.br.registro.entities.entregador.Entregador;
import com.br.registro.entities.prestador.Prestador;
import com.br.registro.entities.visitante.Visitante;

import java.util.Date;

public class Registro {
    private final int id;
    private final Date dataHora;
    private final Entregador entregador;
    private final Prestador prestador;
    private final Correio correio;
    private final Condomino condomino;
    private final Visitante visitante;

    public Registro(int id, Date dataHora, Entregador entregador, Prestador prestador, Correio correio, Condomino condomino, Visitante visitante) {
        this.id = id;
        this.dataHora = dataHora;
        this.entregador = entregador;
        this.prestador = prestador;
        this.correio = correio;
        this.condomino = condomino;
        this.visitante = visitante;
    }

    public int getId() {
        return id;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public Correio getCorreio() {
        return correio;
    }

    public Condomino getCondomino() {
        return condomino;
    }

    public Visitante getVisitante() {
        return visitante;
    }
}
