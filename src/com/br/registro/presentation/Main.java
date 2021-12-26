package com.br.registro.presentation.main;

import com.br.registro.business.RegistroRule;
import com.br.registro.model.Condomino;
import com.br.registro.model.Prestador;
import com.br.registro.model.Registro;
import com.br.registro.percistence.Banco;

import java.util.Date;

public class Main extends Thread {
    static void AdicionarRegistroPrestador() {
        try {
            String cpf1 = "111.111.111-11";
            String cpf2 = "   .   .   -  ";
            String cpf3 = "556.130.790-80";
            String cnpj1 = "11.111.111/1111-11";
            String cnpj2 = "  .   .   /    -  ";
            String cnpj3 = "65.358.429/0001-09";
            RegistroRule rr = new RegistroRule();
            Prestador p = new Prestador(0, "AB", cpf3, "", cnpj2, true);
            Condomino c = new Condomino(0, "AB", 15, "", false);
            Registro r = new Registro(0, new Date(System.currentTimeMillis()), null, p, null, c, null);
            String res = rr.AdicionarRegistroPrestador(r);
            Banco b = new Banco();

            System.out.println(res);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            new Thread(t1).start();
            sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static Runnable t1 = new Runnable() {
        @Override
        public void run() {
            AdicionarRegistroPrestador();
        }
    };
}
