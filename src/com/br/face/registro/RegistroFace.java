package com.br.face.registro;

import com.br.model.registro.Registro;

public interface RegistroFace {
    public String CriarPrestador(Registro registro);
    public String CriarEntregador(Registro registro);
    public String CriarVisitante(Registro registro);
    public String CriarCorreio(Registro registro);
    public String CriarCondomino(Registro registro);
}


