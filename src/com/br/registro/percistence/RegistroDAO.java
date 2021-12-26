package com.br.registro.percistence;

import com.br.registro.interfaces.RegistroFuncional;
import com.br.registro.interfaces.RegistroInterfaces;
import com.br.registro.model.Registro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class RegistroDAO implements RegistroInterfaces {
    @Override
    public String AdicionarRegistroPrestador(Registro registro) {
        RegistroFuncional rf = (Registro val) -> {
            String res = "";
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String sql1 = "INSERT INTO registro (DataHora) VALUES (?)";
            String sql2 = "INSERT INTO prestador (Id,Nome,CPF,Empresa,CNPJ,Autonomo) VALUES (?,?,?,?,?,?)";
            String sql3 = "INSERT INTO condomino (Id,Nome,Apartamento,Bloco,Condominio) VALUES (?,?,?,?,?)";
            String sql4 = "INSERT INTO registroprestador (IdRegistro,IdPrestador) VALUES (?,?)";
            String sql5 = "INSERT INTO registrocondomino (IdRegistro,IdCondomino) VALUES (?,?)";
            Connection con = Banco.getConnection();
            PreparedStatement ps1 = null;
            PreparedStatement ps2 = null;
            PreparedStatement ps3 = null;
            PreparedStatement ps4 = null;
            PreparedStatement ps5 = null;
            int id = 0;

            try {
                ps1 = con.prepareStatement(sql1);
                ps2 = con.prepareStatement(sql2);
                ps3 = con.prepareStatement(sql3);
                ps4 = con.prepareStatement(sql4);
                ps5 = con.prepareStatement(sql5);
                ps1.setString(1, df.format(registro.getDataHora()));
                ps1.execute();
                id = SelectRegistro();
                ps2.setInt(1,id);
                ps2.setString(2,val.getPrestador().getNome());
                ps2.setString(3,val.getPrestador().getCpf());
                ps2.setString(4,val.getPrestador().getEmpresa());
                ps2.setString(5,val.getPrestador().getCnpj());
                ps2.setBoolean(6,val.getPrestador().isAutonomo());
                ps2.execute();
                ps3.setInt(1,id);
                ps3.setString(2,val.getCondomino().getNome());
                ps3.setInt(3,val.getCondomino().getApartamento());
                ps3.setString(4,val.getCondomino().getBloco());
                ps3.setBoolean(5,val.getCondomino().isCondominio());
                ps3.execute();
                ps4.setInt(1,id);
                ps4.setInt(2,id);
                ps4.execute();
                ps5.setInt(1,id);
                ps5.setInt(2,id);
                ps5.execute();
                ps1.close();
                ps2.close();
                ps3.close();
                ps4.close();
                ps5.close();
                con.close();
                res = "Prestador registrado!";
            } catch (Exception ex) {
                res = ex.getMessage();
            }

            return res;
        };


        return rf.Aplicar(registro);
    }

    @Override
    public String AdicionarRegistroEntregador(Registro registro) {
        RegistroFuncional rf = (Registro val) -> {
            String res = "";
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String sql1 = "INSERT INTO registro (DataHora) VALUES (?)";
            String sql2 = "INSERT INTO entregador (Id,Nome,Empresa) VALUES (?,?,?)";
            String sql3 = "INSERT INTO condomino (Id,Nome,Apartamento,Bloco,Condominio) VALUES (?,?,?,?,?)";
            String sql4 = "INSERT INTO registroentregador (IdEntregador,IdRegistro) VALUES (?,?)";
            String sql5 = "INSERT INTO registrocondomino (IdRegistro,IdCondomino) VALUES (?,?)";
            Connection con = Banco.getConnection();
            PreparedStatement ps1 = null;
            PreparedStatement ps2 = null;
            PreparedStatement ps3 = null;
            PreparedStatement ps4 = null;
            PreparedStatement ps5 = null;
            int id = 0;

            try {
                ps1 = con.prepareStatement(sql1);
                ps2 = con.prepareStatement(sql2);
                ps3 = con.prepareStatement(sql3);
                ps4 = con.prepareStatement(sql4);
                ps5 = con.prepareStatement(sql5);
                ps1.setString(1,df.format(registro.getDataHora()));
                ps1.execute();
                id = SelectRegistro();
                ps2.setInt(1,id);
                ps2.setString(2,val.getEntregador().getNome());
                ps2.setString(3,val.getEntregador().getEmpresa());
                ps2.execute();
                ps3.setInt(1,id);
                ps3.setString(2,val.getCondomino().getNome());
                ps3.setInt(3,val.getCondomino().getApartamento());
                ps3.setString(4,val.getCondomino().getBloco());
                ps3.setBoolean(5,val.getCondomino().isCondominio());
                ps3.execute();
                ps4.setInt(1,id);
                ps4.setInt(2,id);
                ps4.execute();
                ps5.setInt(1,id);
                ps5.setInt(2,id);
                ps5.execute();
                ps1.close();
                ps2.close();
                ps3.close();
                ps4.close();
                ps5.close();
                con.close();
                res = "Entregador registrado!";
            } catch (Exception ex) {
                res = ex.getMessage();
            }

            return res;
        };

        return rf.Aplicar(registro);
    }

    @Override
    public String AdicionarRegistroVisitante(Registro registro) {
        RegistroFuncional rf = (Registro val) -> {
            String res = "";
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String sql1 = "INSERT INTO registro (DataHora) VALUES (?)";
            String sql2 = "INSERT INTO visitante (Id,Nome) VALUES (?,?)";
            String sql3 = "INSERT INTO condomino (Id,Nome,Apartamento,Bloco,Condominio) VALUES (?,?,?,?,?)";
            String sql4 = "INSERT INTO registrovisitante (IdRegistro,IdVisitante) VALUES (?,?)";
            String sql5 = "INSERT INTO registrocondomino (IdRegistro,IdCondomino) VALUES (?,?)";
            Connection con = Banco.getConnection();
            PreparedStatement ps1 = null;
            PreparedStatement ps2 = null;
            PreparedStatement ps3 = null;
            PreparedStatement ps4 = null;
            PreparedStatement ps5 = null;
            int id = 0;

            try {
                ps1 = con.prepareStatement(sql1);
                ps2 = con.prepareStatement(sql2);
                ps3 = con.prepareStatement(sql3);
                ps4 = con.prepareStatement(sql4);
                ps5 = con.prepareStatement(sql5);
                ps1.setString(1,df.format(registro.getDataHora()));
                ps1.execute();
                id = SelectRegistro();
                ps2.setInt(1,id);
                ps2.setString(2,val.getVisitante().getNome());
                ps2.execute();
                ps3.setInt(1,id);
                ps3.setString(2,val.getCondomino().getNome());
                ps3.setInt(3,val.getCondomino().getApartamento());
                ps3.setString(4,val.getCondomino().getBloco());
                ps3.setBoolean(5,val.getCondomino().isCondominio());
                ps3.execute();
                ps4.setInt(1,id);
                ps4.setInt(2,id);
                ps4.execute();
                ps5.setInt(1,id);
                ps5.setInt(2,id);
                ps5.execute();
                ps1.close();
                ps2.close();
                ps3.close();
                ps4.close();
                ps5.close();
                con.close();
                res = "Visitante registrado!";
            } catch (Exception ex) {
                res = ex.getMessage();
            }

            return res;
        };

        return rf.Aplicar(registro);
    }

    @Override
    public String AdicionarRegistroCorreio(Registro registro) {
        RegistroFuncional rf = (Registro val) -> {
            String res = "";
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String sql1 = "INSERT INTO registro (DataHora) VALUES (?)";
            String sql2 = "INSERT INTO correio (Id) VALUES (?)";
            String sql3 = "INSERT INTO condomino (Id,Nome,Apartamento,Bloco,Condominio) VALUES (?,?,?,?,?)";
            String sql4 = "INSERT INTO registrocorreio (IdCorreio,IdRegistro) VALUES (?,?)";
            String sql5 = "INSERT INTO registrocondomino (IdRegistro,IdCondomino) VALUES (?,?)";
            Connection con = Banco.getConnection();
            PreparedStatement ps1 = null;
            PreparedStatement ps2 = null;
            PreparedStatement ps3 = null;
            PreparedStatement ps4 = null;
            PreparedStatement ps5 = null;
            int id = 0;

            try {
                ps1 = con.prepareStatement(sql1);
                ps2 = con.prepareStatement(sql2);
                ps3 = con.prepareStatement(sql3);
                ps4 = con.prepareStatement(sql4);
                ps5 = con.prepareStatement(sql5);
                ps1.setString(1,df.format(registro.getDataHora()));
                ps1.execute();
                id = SelectRegistro();
                ps2.setInt(1,id);
                ps2.execute();
                ps3.setInt(1,id);
                ps3.setString(2,val.getCondomino().getNome());
                ps3.setInt(3,val.getCondomino().getApartamento());
                ps3.setString(4,val.getCondomino().getBloco());
                ps3.setBoolean(5,val.getCondomino().isCondominio());
                ps3.execute();
                ps4.setInt(1,id);
                ps4.setInt(2,id);
                ps4.execute();
                ps5.setInt(1,id);
                ps5.setInt(2,id);
                ps5.execute();
                ps1.close();
                ps2.close();
                ps3.close();
                ps4.close();
                ps5.close();
                con.close();
                res = "Correio registrado!";
            } catch (Exception ex) {
                res = ex.getMessage();
            }

            return res;
        };

        return rf.Aplicar(registro);
    }

    private int SelectRegistro() {
        int res = 0;
        String sql = "SELECT MAX(id) as Id FROM registro";
        java.sql.Connection con = null;
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
