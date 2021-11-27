package com.br.face.registro;

import com.br.model.registro.Registro;

public interface RegistroFace {
    public String CriarPrestador(Registro Registro);
    public String CriarEntregador(Registro Registro);
    public String CriarVisitante(Registro Registro);
    public String CriarCorreio(Registro Registro);
    public String CriarCondomino(Registro Registro);
}
