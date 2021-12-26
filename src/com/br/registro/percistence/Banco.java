package com.br.registro.percistence.banco;

import com.mysql.jdbc.Connection;
import java.sql.*;

public class Banco {
    private Connection con;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/registroentrada", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return this.con;
    }

    public boolean TesteConexao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/registroentrada", "root", "");
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
