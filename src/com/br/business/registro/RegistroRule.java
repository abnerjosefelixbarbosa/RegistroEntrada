package com.br.business.registro;

import com.br.face.registro.RegistroFace;
import com.br.model.registro.Registro;
import com.br.percistence.registro.RegistroDAO;
import static com.br.business.validarregistro.ValidarRegistro.*;

public class RegistroRule implements RegistroFace {
    RegistroDAO registroDAO = new RegistroDAO();

    @Override
    public String CriarPrestador(Registro registro) {
        String resultado = ValidarPrestador(registro.getPrestador());
        String resultado1 = "";

        if (!resultado.equals("")) {
            resultado1 = resultado;
        }

        return resultado1;
    }

    @Override
    public String CriarEntregador(Registro registro) {
        String resultado = ValidarEntregador(registro.getEntregador());
        String resultado1 = "";

        if (!resultado.equals("")) {
            resultado1 = resultado;
        }

        return resultado1;
    }

    @Override
    public String CriarVisitante(Registro registro) {
        String resultado = ValidarVisitante(registro.getVisitante());
        String resultado1 = "";

        if (!resultado.equals("")) {
            resultado1 = resultado;
        }

        return resultado1;
    }

    @Override
    public String CriarCorreio(Registro registro) {
        String resultado = ValidarCorreio(registro.getCorreio());
        String resultado1 = "";

        if (!resultado.equals("")) {
            resultado1 = resultado;
        }

        return resultado1;
    }

    @Override
    public String CriarCondomino(Registro registro) {
        String resultado = ValidarCondomino(registro.getCondomino());
        String resultado1 = "";

        if (!resultado.equals("")) {
            resultado1 = resultado;
        }

        return resultado1;
    }

    public String CriarPrestadorCondomino(Registro registro) {
        String resultado = "";
        String resultado1 = CriarPrestador(registro);
        String resultado2 = CriarCondomino(registro);
        String resultado3 = registroDAO.CriarPrestadorCondomino(registro);

        if (!resultado1.equals("")) resultado = resultado1;
        else if (!resultado2.equals("")) resultado = resultado2;
        else resultado = resultado3;

        return resultado;
    }

    public String CriarEntregadorCondomino(Registro registro) {
        String resultado = "";
        String resultado1 = CriarEntregador(registro);
        String resultado2 = CriarCondomino(registro);
        //String resultado3 = registroDAO.CriarPrestadorCondomino(registro);

        if (!resultado1.equals("")) resultado = resultado1;
        else if (!resultado2.equals("")) resultado = resultado2;
        //else resultado = resultado3;

        return  resultado;
    }
}


