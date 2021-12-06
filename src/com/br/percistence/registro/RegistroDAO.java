package com.br.percistence.registro;

import com.br.face.registro.RegistroFace;
import com.br.model.registro.Registro;
import com.br.percistence.banco.Banco;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class RegistroDAO implements RegistroFace {
    @Override
    public String CriarPrestador(Registro registro) {
        String resultado = "";
        String sql1 = "INSERT INTO registro (DataHora) VALUES (?)";
        String sql2 = "INSERT INTO prestador (Id,Nome,CPF,Empresa,CNPJ,Autonomo) VALUES (?,?,?,?,?,?)";
        String sql3 = "INSERT INTO registroprestador (IdRegistro,IdPrestador) VALUES (?,?)";
        Connection con = null;
        PreparedStatement pstm = null;

        try {
           con = new Banco().Conexao();
           pstm = (PreparedStatement) con.prepareStatement(sql1);
           DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           pstm.setString(1, dateFormat.format(registro.getDataHora()));
           pstm.execute();
           pstm = (PreparedStatement) con.prepareStatement(sql2);
           int Id = SelectRegistro();
           pstm.setInt(1,Id);
           pstm.setString(2,registro.getPrestador().getNome());
           pstm.setString(3,registro.getPrestador().getCPF());
           pstm.setString(4,registro.getPrestador().getEmpresa());
           pstm.setString(5,registro.getPrestador().getCNPJ());
           pstm.setBoolean(6,registro.getPrestador().isAutonomo());
           pstm.execute();
           pstm = (PreparedStatement) con.prepareStatement(sql3);
           pstm.setInt(1,Id);
           pstm.setInt(2,Id);
           pstm.execute();
        } catch (Exception ex) {
            resultado = ex.getMessage();
        } finally {
            try {
                if (pstm != null) pstm.close();
                if (con != null) con.close();
            } catch (Exception ex) {
                resultado = ex.getMessage();
            }
        }

        return resultado;
    }

    @Override
    public String CriarEntregador(Registro registro) {
        String resultado = "";
        String sql1 = "";
        String sql2 = "";
        String sql3 = "";
        Connection con = null;
        PreparedStatement pstm = null;

        try {

        } catch (Exception ex) {
            resultado = ex.getMessage();
        } finally {
            try {
                if (con != null) con.close();
                if (pstm != null) pstm.close();
            } catch (Exception ex) {
                resultado = ex.getMessage();
            }
        }

        return resultado;
    }

    @Override
    public String CriarVisitante(Registro registro) {
        String resultado = "";

        return resultado;
    }

    @Override
    public String CriarCorreio(Registro registro) {
        String resultado = "";

        return resultado;
    }

    @Override
    public String CriarCondomino(Registro registro) {
        String resultado = "";
        String sql1 = "INSERT INTO condomino (Id,Nome,Apartamento,Bloco,Condominio) VALUES (?,?,?,?,?)";
        String sql2 = "INSERT INTO registrocondomino (IdRegistro,IdCondomino) VALUES (?,?)";
        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = new Banco().Conexao();
            pstm = (PreparedStatement) con.prepareStatement(sql1);
            int id = SelectRegistro();
            pstm.setInt(1,id);
            pstm.setString(2,registro.getCondomino().getNome());
            pstm.setInt(3,registro.getCondomino().getApartamento());
            pstm.setString(4, registro.getCondomino().getBloco());
            pstm.setBoolean(5,registro.getCondomino().isCondominio());
            pstm.execute();
            pstm = (PreparedStatement) con.prepareStatement(sql2);
            pstm.setInt(1,id);
            pstm.setInt(2,id);
            pstm.execute();
        } catch (Exception ex) {
            resultado = ex.getMessage();
        } finally {
            try {
                if (pstm != null)  pstm.close();
                if (con != null)  con.close();
            } catch (Exception ex) {
                resultado = ex.getMessage();
            }
        }

        return resultado;
    }

    private int SelectRegistro() {
        int resultado = 0;
        String SQL = "SELECT MAX(id) as Id FROM registro";
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            con = new Banco().Conexao();
            pstm = (PreparedStatement) con.prepareStatement(SQL);
            rset = pstm.executeQuery();
            while (rset.next()) {
                resultado = rset.getInt("Id");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rset != null)  rset.close();
                if (pstm != null)  pstm.close();
                if (con != null)  con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return resultado;
    }

    public String CriarPrestadorCondomino(Registro registro) {
        String resultado = "";
        String resultado1 = CriarPrestador(registro);
        String resultado2 = CriarCondomino(registro);

        if (!resultado1.equals("")) resultado = resultado1;
        else if (!resultado2.equals("")) resultado = resultado2;

        return  resultado;
    }

    public String CriarEntregadorCondomino(Registro registro) {
        String resultado = "";
        String resultado1 = CriarPrestador(registro);
        String resultado2 = CriarCondomino(registro);

        if (!resultado1.equals("")) resultado = resultado1;
        else if (!resultado2.equals("")) resultado = resultado2;

        return  resultado;
    }
}
