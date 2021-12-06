package com.br.percistence.banco;

import com.mysql.jdbc.Connection;
import java.sql.*;

public class Banco {
    public Connection Conexao() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/registroentrada", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return con;
    }

    public void TesteConexao() {
        Connection con;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/registroentrada", "root", "");
            System.out.println("Conectado");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
