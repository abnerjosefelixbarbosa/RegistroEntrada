package com.br.registro.business.validarregistro;

import com.br.registro.entities.registro.Registro;
import com.br.registro.interfaces.registro.Registro1;
import com.br.registro.interfaces.registrointerfaces.RegistroInterfaces;

public class ValidarRegistro implements RegistroInterfaces {
    @Override
    public String AdicionarRegistroPrestador(Registro registro) {
        Registro1 r = (Registro val) -> {
            var res = "";
            var prestador = val.getPrestador().getNome().isEmpty();
            var cpf = val.getPrestador().getCpf().contains(" ");
            var cpf1 = val.getPrestador().getCpf().equals("   .   .   -  ");
            var cpf2 = val.getPrestador().getCpf().equals("000.000.000-00");
            var cpf3 = val.getPrestador().getCpf().equals("111.111.111-11");
            var cpf4 = val.getPrestador().getCpf().equals("222.222.222-22");
            var cpf5 = val.getPrestador().getCpf().equals("333.333.333-33");
            var cpf6 = val.getPrestador().getCpf().equals("444.444.444-44");
            var cpf7 = val.getPrestador().getCpf().equals("555.555.555-55");
            var cpf8 = val.getPrestador().getCpf().equals("666.666.666-66");
            var cpf9 = val.getPrestador().getCpf().equals("777.777.777-77");
            var cpf10 = val.getPrestador().getCpf().equals("888.888.888-88");
            var cpf11 = val.getPrestador().getCpf().equals("999.999.999-99");
            var empresa = val.getPrestador().getEmpresa().isEmpty();
            var cnpj = val.getPrestador().getCnpj().contains(" ");
            var cnpj1 = val.getPrestador().getCnpj().equals("  .   .   /    -  ");
            var cnpj2 = val.getPrestador().getCnpj().equals("00.000.000/0000-00");
            var cnpj3 = val.getPrestador().getCnpj().equals("11.111.111/1111-11");
            var cnpj4 = val.getPrestador().getCnpj().equals("22.222.222/2222-22");
            var cnpj5 = val.getPrestador().getCnpj().equals("33.333.333/3333-33");
            var cnpj6 = val.getPrestador().getCnpj().equals("44.444.444/4444-44");
            var cnpj7 = val.getPrestador().getCnpj().equals("55.555.555/5555-55");
            var cnpj8 = val.getPrestador().getCnpj().equals("66.666.666/6666-66");
            var cnpj9 = val.getPrestador().getCnpj().equals("77.777.777/7777-77");
            var cnpj10 = val.getPrestador().getCnpj().equals("88.888.888/8888-88");
            var cnpj11 = val.getPrestador().getCnpj().equals("99.999.999/9999-99");
            var autonomo = val.getPrestador().isAutonomo();
            var condomino = val.getCondomino().getNome().isEmpty();
            var apartamento = val.getCondomino().getApartamento() == 0;

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
                    res = "Condomino obrigatório!";
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

        return r.Aplicar(registro);
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
