package com.br.business.registro;

import com.br.face.registro.RegistroFace;
import com.br.model.condomino.Condomino;
import com.br.model.prestador.Prestador;
import com.br.model.registro.Registro;

public class RegistroRule implements RegistroFace {
    @Override
    public String CriarPrestador(Registro Registro) {
        String Resultado = ValidarPrestador1(Registro.getPrestador(), Prestador  -> {
            String Resultado1 = "";

            if (Prestador.isAutonomo()) {
                if (Prestador.getNome().equals("")) {
                    Resultado1 = "Prestador obrigatório!";
                } else if (Prestador.getCPF().contains(" ")) {
                    Resultado1 = "CPF inválido!";
                }  else if (!Prestador.getEmpresa().equals("")) {
                    Resultado1 = "Empresa não obrigatória!";
                } else if (!Prestador.getCNPJ().contains(" ")) {
                    Resultado1 = "CNPJ não obrigatório!";
                } else if (Prestador.getCPF().equals("000.000.000-00")) {
                    Resultado1 = "CPF inválido!";
                } else if (Prestador.getCPF().equals("111.111.111-11")) {
                    Resultado1 = "CPF inválido!";
                } else if (Prestador.getCPF().equals("222.222.222-22")) {
                    Resultado1 = "CPF inválido!";
                } else if (Prestador.getCPF().equals("333.333.333-33")) {
                    Resultado1 = "CPF inválido!";
                } else if (Prestador.getCPF().equals("444.444.444-44")) {
                    Resultado1 = "CPF inválido!";
                } else if (Prestador.getCPF().equals("555.555.555-55")) {
                    Resultado1 = "CPF inválido!";
                } else if (Prestador.getCPF().equals("666.666.666-66")) {
                    Resultado1 = "CPF inválido!";
                } else if (Prestador.getCPF().equals("777.777.777-77")) {
                    Resultado1 = "CPF inválido!";
                } else if (Prestador.getCPF().equals("888.888.888-88")) {
                    Resultado1 = "CPF inválido!";
                } else if (Prestador.getCPF().equals("999.999.999-99")) {
                    Resultado1 = "CPF inválido!";
                }
            } else if (!Prestador.isAutonomo()) {
                if (Prestador.getNome().equals("")) {
                    Resultado1 = "Prestador obrigatório!";
                } else if (!Prestador.getCPF().contains(" ")) {
                    Resultado1 = "CPF não obrigatório!";
                }  else if (Prestador.getEmpresa().equals("")) {
                    Resultado1 = "Empresa obrigatória!";
                } else if (Prestador.getCNPJ().contains(" ")) {
                    Resultado1 = "CNPJ inválido!";
                } else if (Prestador.getCNPJ().equals("00.000.000/0000-00")) {
                    Resultado1 = "CNPJ inválido!";
                } else if (Prestador.getCNPJ().equals("11.111.111/1111-11")) {
                    Resultado1 = "CNPJ inválido!";
                } else if (Prestador.getCNPJ().equals("22.222.222/2222-22")) {
                    Resultado1 = "CNPJ inválido!";
                } else if (Prestador.getCNPJ().equals("33.333.333/3333-33")) {
                    Resultado1 = "CNPJ inválido!";
                } else if (Prestador.getCNPJ().equals("44.444.444/4444-44")) {
                    Resultado1 = "CNPJ inválido!";
                } else if (Prestador.getCNPJ().equals("55.555.555/5555-55")) {
                    Resultado1 = "CNPJ inválido!";
                } else if (Prestador.getCNPJ().equals("66.666.666/6666-66")) {
                    Resultado1 = "CNPJ inválido!";
                } else if (Prestador.getCNPJ().equals("77.777.777/7777-77")) {
                    Resultado1 = "CNPJ inválido!";
                } else if (Prestador.getCNPJ().equals("88.888.888/8888-88")) {
                    Resultado1 = "CNPJ inválido!";
                } else if (Prestador.getCNPJ().equals("99.999.999/9999-99")) {
                    Resultado1 = "CNPJ inválido!";
                }
            }

            return Resultado1;
        });

        return Resultado;
    }

    @Override
    public String CriarEntregador(Registro Registro) {
        return null;
    }

    @Override
    public String CriarVisitante(Registro Registro) {
        return null;
    }

    @Override
    public String CriarCorreio(Registro Registro) {
        return null;
    }

    @Override
    public String CriarCondomino(Registro Registro) {
        String Resultado = ValidarCondomino1(Registro.getCondomino(), Condomino -> {
            String Resultado1 = "";

            if (Condomino.isCondominio()) {
                if (Condomino.getNome().equals("")) {
                    Resultado1 = "Condomino obrigatório!";
                } else if (Condomino.getApartamento() == 0) {
                    Resultado1 = "Apartamento inválido!";
                }
            } else if (!Condomino.isCondominio()) {
                if (Condomino.getNome().equals("")) {
                    Resultado1 = "Condomino obrigatório!";
                } else if (Condomino.getApartamento() == 0) {
                    Resultado1 = "Apartamento inválido!";
                }
            }

            return Resultado1;
        });

        return Resultado;
    }

    static  String ValidarCondomino1(Condomino Condomino, ValidarCondomino ValidarCondomino) {
        String Resultado = ValidarCondomino.Condomino(Condomino);

        return Resultado;
    }

    static String ValidarPrestador1(Prestador Prestador, ValidarPrestador ValidarPrestador) {
        String Resultado = ValidarPrestador.Presdador(Prestador);

        return Resultado;
    }
}

@FunctionalInterface
interface ValidarPrestador {
    String Presdador(Prestador Prestador);
};

@FunctionalInterface
interface ValidarCondomino {
    String Condomino(Condomino Condomino);
}


