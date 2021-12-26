package com.br.registro.percistence;

import com.mysql.jdbc.Connection;
import java.sql.*;

public class Banco {
    public static java.sql.Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/registroentrada", "root", "");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return con;
    }

    public static boolean getTeste() {
        Connection con = null;
        boolean res = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/registroentrada", "root", "");
            res = true;
        } catch (Exception ex) {}

        return res;
    }
}
