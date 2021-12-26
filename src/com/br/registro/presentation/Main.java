package com.br.registro.presentation;

import com.br.registro.business.RegistroRule;
import com.br.registro.model.*;

import java.util.Date;

public class Main extends Thread {
    static Runnable AdicionarRegistroPrestador = () -> {
        try {
            String cpf1 = "111.111.111-11";
            String cpf2 = "   .   .   -  ";
            String cpf3 = "556.130.790-80";
            String cnpj1 = "11.111.111/1111-11";
            String cnpj2 = "  .   .   /    -  ";
            String cnpj3 = "65.358.429/0001-09";
            RegistroRule rr = new RegistroRule();
            Prestador p = new Prestador(0,"AB",cpf3,"",cnpj2,true);
            Condomino c = new Condomino(0,"AB",15, "A",true);
            Registro r = new Registro(0,new Date(System.currentTimeMillis()),null, p, null, c, null);
            String res = rr.AdicionarRegistroPrestador(r);

            System.out.println(res);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    };

    static  Runnable AdicionarRegistroEntregador = () -> {
        try {
            RegistroRule rr = new RegistroRule();
            Entregador e = new Entregador(0,"AC","AC S/A");
            Condomino c = new Condomino(0,"AC",15,"A",true);
            Registro r = new Registro(0,new Date(System.currentTimeMillis()),e,null,null,c,null);
            String res = rr.AdicionarRegistroEntregador(r);

            System.out.println(res);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    };

    static Runnable AdicionarRegistroVisitante = () -> {
        try {
            RegistroRule rr = new RegistroRule();
            Visitante v = new Visitante(0,"AD");
            Condomino c = new Condomino(0,"AD",15,"A",true);
            Registro r = new Registro(0,new Date(System.currentTimeMillis()),null,null,null,c,v);
            String res = rr.AdicionarRegistroVisitante(r);

            System.out.println(res);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    };

    static Runnable AdicionarRegistroCorreio = () -> {
        try {
            RegistroRule rr = new RegistroRule();
            Correio cor = new Correio(0);
            Condomino con = new Condomino(0,"AE",15,"A",true);
            Registro r = new Registro(0,new Date(System.currentTimeMillis()),null,null,cor,con,null);
            String res = rr.AdicionarRegistroCorreio(r);

            System.out.println(res);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    };

    public static void main(String[] args) {
        try {
            new Thread(AdicionarRegistroCorreio).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
