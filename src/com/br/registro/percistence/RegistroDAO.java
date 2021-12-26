package com.br.registro.percistence.registrodao;

import com.br.registro.interfaces.registro.Registro1;
import com.br.registro.interfaces.registrointerfaces.RegistroInterfaces;
import com.br.registro.entities.registro.Registro;
import com.br.registro.percistence.banco.Banco;
import com.mysql.jdbc.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class RegistroDAO implements RegistroInterfaces {
    private Banco b = new Banco();

    @Override
    public String AdicionarRegistroPrestador(Registro registro) {
        Registro1 r = (Registro val) -> {
            String res = "";
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String sql1 = "INSERT INTO registro (DataHora) VALUES (?)";
            String sql2 = "INSERT INTO prestador (Id,Nome,CPF,Empresa,CNPJ,Autonomo) VALUES (?,?,?,?,?,?)";
            String sql3 = "INSERT INTO registroprestador (IdRegistro,IdPrestador) VALUES (?,?)";

            try {
                Connection con = b.getConnection();
                PreparedStatement ps1 = con.prepareStatement(sql1);
                PreparedStatement ps2 = con.prepareStatement(sql2);
                PreparedStatement ps3 = con.prepareStatement(sql3);
                ps1.setDate(1, Date.valueOf(df.format(registro.getDataHora())));
                ps1.executeUpdate();
                ps1.close();
                con.close();
                res = "Prestador registrado!";
            } catch (Exception ex) {
                res = ex.getMessage();
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

    private int SelectRegistro() {
        int res = 0;
        String sql = "SELECT MAX(id) as Id FROM registro";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = new Banco().getConnection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                res = rs.getInt("Id");
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return res;
    }
}
