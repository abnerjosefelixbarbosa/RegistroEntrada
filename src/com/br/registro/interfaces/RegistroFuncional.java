package com.br.registro.interfaces;

import com.br.registro.model.Registro;

@FunctionalInterface
public interface RegistroFuncional {
    String Aplicar(Registro registro);
}
