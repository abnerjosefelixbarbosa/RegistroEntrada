package com.br.registro.interfaces.registrointerfaces;

import com.br.registro.entities.registro.Registro;

public interface RegistroInterfaces {
    String AdicionarRegistroPrestador(Registro registro);
    String AdicionarRegistroEntregador(Registro registro);
    String AdicionarRegistroVisitante(Registro registro);
    String AdicionarRegistroCorreio(Registro registro);
}
