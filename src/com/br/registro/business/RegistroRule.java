package com.br.registro.business;

import com.br.registro.interfaces.RegistroInterfaces;
import com.br.registro.model.Registro;
import com.br.registro.percistence.RegistroDAO;

public class RegistroRule implements RegistroInterfaces {
    @Override
    public String AdicionarRegistroPrestador(Registro registro) {
        RegistroDAO rd = new RegistroDAO();
        ValidarRegistro vr = new ValidarRegistro();
        String res = vr.AdicionarRegistroPrestador.Aplicar(registro);

        if (res.equals("")) res = rd.AdicionarRegistroPrestador(registro);

        return res;
    }

    @Override
    public String AdicionarRegistroEntregador(Registro registro) {
        RegistroDAO rd = new RegistroDAO();
        ValidarRegistro vr = new ValidarRegistro();
        String res = vr.AdicionarRegistroEntregador.Aplicar(registro);

        if (res.equals("")) res = rd.AdicionarRegistroEntregador(registro);

        return res;
    }

    @Override
    public String AdicionarRegistroVisitante(Registro registro) {
        RegistroDAO rd = new RegistroDAO();
        ValidarRegistro vr = new ValidarRegistro();
        String res = vr.AdicionarRegistroVisitante.Aplicar(registro);

        if (res.equals("")) res = rd.AdicionarRegistroVisitante(registro);

        return res;
    }

    @Override
    public String AdicionarRegistroCorreio(Registro registro) {
        RegistroDAO rd = new RegistroDAO();
        ValidarRegistro vr = new ValidarRegistro();
        String res = vr.AdicionarRegistroCorreio.Aplicar(registro);

        if (res.equals("")) res = rd.AdicionarRegistroCorreio(registro);

        return res;
    }
}
