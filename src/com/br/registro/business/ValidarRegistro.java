package com.br.registro.business;

import com.br.registro.model.Registro;
import com.br.registro.interfaces.RegistroFuncional;

public class ValidarRegistro {

    public RegistroFuncional AdicionarRegistroPrestador = (Registro val) -> {
        String res = "";
        boolean prestador = val.getPrestador().getNome().isEmpty();
        boolean cpf = val.getPrestador().getCpf().contains(" ");
        boolean cpf1 = val.getPrestador().getCpf().equals("   .   .   -  ");
        boolean cpf2 = val.getPrestador().getCpf().equals("000.000.000-00");
        boolean cpf3 = val.getPrestador().getCpf().equals("111.111.111-11");
        boolean cpf4 = val.getPrestador().getCpf().equals("222.222.222-22");
        boolean cpf5 = val.getPrestador().getCpf().equals("333.333.333-33");
        boolean cpf6 = val.getPrestador().getCpf().equals("444.444.444-44");
        boolean cpf7 = val.getPrestador().getCpf().equals("555.555.555-55");
        boolean cpf8 = val.getPrestador().getCpf().equals("666.666.666-66");
        boolean cpf9 = val.getPrestador().getCpf().equals("777.777.777-77");
        boolean cpf10 = val.getPrestador().getCpf().equals("888.888.888-88");
        boolean cpf11 = val.getPrestador().getCpf().equals("999.999.999-99");
        boolean empresa = val.getPrestador().getEmpresa().isEmpty();
        boolean cnpj = val.getPrestador().getCnpj().contains(" ");
        boolean cnpj1 = val.getPrestador().getCnpj().equals("  .   .   /    -  ");
        boolean cnpj2 = val.getPrestador().getCnpj().equals("00.000.000/0000-00");
        boolean cnpj3 = val.getPrestador().getCnpj().equals("11.111.111/1111-11");
        boolean cnpj4 = val.getPrestador().getCnpj().equals("22.222.222/2222-22");
        boolean cnpj5 = val.getPrestador().getCnpj().equals("33.333.333/3333-33");
        boolean cnpj6 = val.getPrestador().getCnpj().equals("44.444.444/4444-44");
        boolean cnpj7 = val.getPrestador().getCnpj().equals("55.555.555/5555-55");
        boolean cnpj8 = val.getPrestador().getCnpj().equals("66.666.666/6666-66");
        boolean cnpj9 = val.getPrestador().getCnpj().equals("77.777.777/7777-77");
        boolean cnpj10 = val.getPrestador().getCnpj().equals("88.888.888/8888-88");
        boolean cnpj11 = val.getPrestador().getCnpj().equals("99.999.999/9999-99");
        boolean autonomo = val.getPrestador().isAutonomo();
        boolean condomino = val.getCondomino().getNome().isEmpty();
        boolean apartamento = val.getCondomino().getApartamento() == 0;

        while (true) {
            if (autonomo) {
                if (prestador) {
                    res = "Nome do prestador obrigatório";
                    break;
                }
                if (cpf || cpf1 || cpf2 || cpf3 || cpf4 || cpf5 || cpf6 || cpf7 || cpf8 || cpf9 || cpf10 || cpf11) {
                    res = "CPF inválido!";
                    break;
                }
                if (!empresa) {
                    res = "Empresa não obrigatória!";
                    break;
                }
                if (!cnpj1) {
                    res = "CNPJ não obrigatório!";
                    break;
                }
            }
            if (!autonomo) {
                if (prestador) {
                    res = "Nome do prestador obrigatório";
                    break;
                }
                if (!cpf1) {
                    res = "CPF não obrigatório!";
                    break;
                }
                if (empresa) {
                    res = "Empresa obrigatória!";
                    break;
                }
                if (cnpj || cnpj1 || cnpj2 || cnpj3 || cnpj4 || cnpj5 || cnpj6 || cnpj7 || cnpj8 || cnpj9 || cnpj10 || cnpj11) {
                    res = "CNPJ inválido!";
                    break;
                }
            }
            if (condomino) {
                res = "Nome do condomino obrigatório!";
                break;
            }
            if (apartamento) {
                res = "Número do apartamento inválido!";
                break;
            }
            break;
        }

        return res;
    };

    public RegistroFuncional AdicionarRegistroEntregador = (Registro val) -> {
            String res = "";
            boolean entregador = val.getEntregador().getNome().isEmpty();
            boolean empresa = val.getEntregador().getEmpresa().isEmpty();
            boolean condomino = val.getCondomino().getNome().isEmpty();
            boolean apartamento = val.getCondomino().getApartamento() == 0;

            while (true) {
                if (entregador) {
                    res = "Nome do entregador obrigatório";
                    break;
                }
                if (empresa) {
                    res = "Nome da empresa obrigatória";
                    break;
                }
                if (condomino) {
                    res = "Nome do condomino obrigatório!";
                    break;
                }
                if (apartamento) {
                    res = "Número do apartamento inválido!";
                    break;
                }
                break;
            }

            return res;
    };

    public RegistroFuncional AdicionarRegistroVisitante = (Registro val) -> {
        String res = "";
        boolean visitante = val.getVisitante().getNome().isEmpty();
        boolean condomino = val.getCondomino().getNome().isEmpty();
        boolean apartamento = val.getCondomino().getApartamento() == 0;

        while (true) {
            if (visitante) {
                res = "Nome do visitante obrigatório!";
                break;
            }
            if (condomino) {
                res = "Nome do condomino obrigatório!";
                break;
            }
            if (apartamento) {
                res = "Número do apartamento inválido!";
                break;
            }
            break;
        }

        return res;
    };

    public RegistroFuncional AdicionarRegistroCorreio = (Registro val) -> {
        String res = "";
        boolean condomino = val.getCondomino().getNome().isEmpty();
        boolean apartamento = val.getCondomino().getApartamento() == 0;

        while (true) {
            if (condomino) {
                res = "Nome do condomino obrigatório!";
                break;
            }
            if (apartamento) {
                res = "Número do apartamento inválido!";
                break;
            }
            break;
        }

        return res;
    };
}
