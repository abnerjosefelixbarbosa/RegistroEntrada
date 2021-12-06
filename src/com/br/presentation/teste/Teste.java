package com.br.presentation.teste;

import com.br.percistence.banco.Banco;

public class Teste {
    static void TesteBanco() {
        new Banco().TesteConexao();
    }

    public static void main(String[] args) {
        TesteBanco();
    }
}
