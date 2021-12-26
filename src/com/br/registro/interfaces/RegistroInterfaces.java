package com.br.registro.interfaces;

import com.br.registro.model.Registro;

public interface RegistroInterfaces {
    String AdicionarRegistroPrestador(Registro registro);
    String AdicionarRegistroEntregador(Registro registro);
    String AdicionarRegistroVisitante(Registro registro);
    String AdicionarRegistroCorreio(Registro registro);
}
