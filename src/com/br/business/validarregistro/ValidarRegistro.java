package com.br.business.validarregistro;

import com.br.model.condomino.Condomino;
import com.br.model.correio.Correio;
import com.br.model.entregador.Entregador;
import com.br.model.prestador.Prestador;
import com.br.model.visitante.Visitante;

public class ValidarRegistro  {
    public static String ValidarCondomino(Condomino condomino) {
        String resultado = "";

        if (condomino.isCondominio()) {
            if (condomino.getNome().equals("")) {
                resultado = "Condomino obrigatório!";
            } else if (condomino.getApartamento() == 0) {
                resultado = "Apartamento inválido!";
            }
        } else if (!condomino.isCondominio()) {
            if (condomino.getNome().equals("")) {
                resultado = "Condomino obrigatório!";
            } else if (condomino.getApartamento() == 0) {
                resultado = "Apartamento inválido!";
            }
        }

        return resultado;
    }

    public static String ValidarPrestador(Prestador prestador) {
        String resultado = "";

        if (prestador.isAutonomo()) {
            if (prestador.getNome().equals("")) {
                resultado = "Prestador obrigatório!";
            } else if (prestador.getCPF().contains(" ")) {
                resultado = "CPF inválido!";
            }  else if (!prestador.getEmpresa().equals("")) {
                resultado = "Empresa não obrigatória!";
            } else if (!prestador.getCNPJ().contains(" ")) {
                resultado = "CNPJ não obrigatório!";
            } else if (prestador.getCPF().equals("000.000.000-00")) {
                resultado = "CPF inválido!";
            } else if (prestador.getCPF().equals("111.111.111-11")) {
                resultado = "CPF inválido!";
            } else if (prestador.getCPF().equals("222.222.222-22")) {
                resultado = "CPF inválido!";
            } else if (prestador.getCPF().equals("333.333.333-33")) {
                resultado = "CPF inválido!";
            } else if (prestador.getCPF().equals("444.444.444-44")) {
                resultado = "CPF inválido!";
            } else if (prestador.getCPF().equals("555.555.555-55")) {
                resultado = "CPF inválido!";
            } else if (prestador.getCPF().equals("666.666.666-66")) {
                resultado = "CPF inválido!";
            } else if (prestador.getCPF().equals("777.777.777-77")) {
                resultado = "CPF inválido!";
            } else if (prestador.getCPF().equals("888.888.888-88")) {
                resultado = "CPF inválido!";
            } else if (prestador.getCPF().equals("999.999.999-99")) {
                resultado = "CPF inválido!";
            }
        } else if (!prestador.isAutonomo()) {
            if (prestador.getNome().equals("")) {
                resultado = "Prestador obrigatório!";
            } else if (!prestador.getCPF().contains(" ")) {
                resultado = "CPF não obrigatório!";
            }  else if (prestador.getEmpresa().equals("")) {
                resultado = "Empresa obrigatória!";
            } else if (prestador.getCNPJ().contains(" ")) {
                resultado = "CNPJ inválido!";
            } else if (prestador.getCNPJ().equals("00.000.000/0000-00")) {
                resultado = "CNPJ inválido!";
            } else if (prestador.getCNPJ().equals("11.111.111/1111-11")) {
                resultado = "CNPJ inválido!";
            } else if (prestador.getCNPJ().equals("22.222.222/2222-22")) {
                resultado = "CNPJ inválido!";
            } else if (prestador.getCNPJ().equals("33.333.333/3333-33")) {
                resultado = "CNPJ inválido!";
            } else if (prestador.getCNPJ().equals("44.444.444/4444-44")) {
                resultado = "CNPJ inválido!";
            } else if (prestador.getCNPJ().equals("55.555.555/5555-55")) {
                resultado = "CNPJ inválido!";
            } else if (prestador.getCNPJ().equals("66.666.666/6666-66")) {
                resultado = "CNPJ inválido!";
            } else if (prestador.getCNPJ().equals("77.777.777/7777-77")) {
                resultado = "CNPJ inválido!";
            } else if (prestador.getCNPJ().equals("88.888.888/8888-88")) {
                resultado = "CNPJ inválido!";
            } else if (prestador.getCNPJ().equals("99.999.999/9999-99")) {
                resultado = "CNPJ inválido!";
            }
        }

        return resultado;
    }

    public static  String ValidarEntregador(Entregador entregador) {
        String resultado = "";

        if (entregador.getNome().equals("")) {
            resultado = "Entregador obrigatório!";
        } else if (entregador.getEmpresa().equals("")) {
            resultado = "Empresa obrigatória!";
        }

        return resultado;
    }

     public static  String ValidarVisitante(Visitante visitante) {
        String resultado = "";

        if (visitante.getNome().equals("")) {
            resultado = "Visitante obrigatório";
        }

        return  resultado;
    }

    public static  String ValidarCorreio(Correio correio) {
        String resultado = "";

        return resultado;
    }
}
