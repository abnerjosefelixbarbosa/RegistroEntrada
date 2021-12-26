package com.br.registro.business.registrorule;

import com.br.registro.business.validarregistro.ValidarRegistro;
import com.br.registro.interfaces.registrointerfaces.RegistroInterfaces;
import com.br.registro.entities.registro.Registro;
import com.br.registro.percistence.registrodao.RegistroDAO;

import java.sql.Date;

public class RegistroRule implements RegistroInterfaces {
    private RegistroDAO rd = new RegistroDAO();
    private ValidarRegistro vr = new ValidarRegistro();

    @Override
    public String AdicionarRegistroPrestador(Registro registro) {
        String res = vr.AdicionarRegistroPrestador(registro);

        if (!res.equals("")) res = rd.AdicionarRegistroPrestador(registro);

        return res;
    }

    @Override
    public String AdicionarRegistroEntregador(Registro registro) {
        return null;
    }

    @Override
    public String AdicionarRegistroVisitante(Registro registro) {
        return null;
    }

    @Override
    public String AdicionarRegistroCorreio(Registro registro) {
        return null;
    }
}
