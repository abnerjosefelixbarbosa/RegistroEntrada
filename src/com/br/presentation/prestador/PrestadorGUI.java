package com.br.presentation.prestador;

import com.br.model.condomino.Condomino;
import com.br.model.prestador.Prestador;
import com.br.model.registro.Registro;
import com.br.presentation.entregador.EntregadorGUI;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Date;

public class PrestadorGUI extends JFrame {

    private JPanel Panel1;
    private JTextField Prestador;
    private JFormattedTextField CPF;
    private JTextField Empresa;
    private JFormattedTextField CNPJ;
    private JCheckBox Autonomo;
    private JButton Cadastrar;
    private JMenuItem CriarPrestador;
    private JMenuItem CriarEntregador;
    private JMenuItem CriarVisitante;
    private JMenuItem CriarCorreio;
    private JTextField Condomino;
    private JTextField Apartamento;
    private JTextField Bloco;
    private JCheckBox Condominio;

    public PrestadorGUI() {
        setContentPane(Panel1);
        setTitle("prestador");
        setSize(1900, 1000);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setVisible(true);
        Apartamento.setText("0");
        Menu();
        Cadastrar();
        Mascara();
    }

    private void Cadastrar() {
        Cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    var Registro = new Registro();
                    var Prestador1 = new Prestador();
                    var Condomino1 = new Condomino();
                    var data = new Date(System.currentTimeMillis());
                    Registro.setDataHora(data);
                    Prestador1.setNome(Prestador.getText());
                    Prestador1.setCPF(CPF.getText());
                    Prestador1.setEmpresa(Empresa.getText());
                    Prestador1.setCNPJ(CNPJ.getText());
                    Prestador1.setAutonomo(Autonomo.isSelected());
                    Condomino1.setNome(Condomino.getText());
                    Condomino1.setApartamento(Integer.parseInt(Apartamento.getText()));
                    Condomino1.setBloco(Bloco.getText());
                    Condomino1.setCondominio(Condominio.isSelected());
                    Registro.setPrestador(Prestador1);
                    Registro.setCondomino(Condomino1);
                } catch (Exception Ex) {
                    JOptionPane.showMessageDialog(null, Ex.getMessage(), "Error", 0);
                    Apartamento.setText("0");
                }
            }
        });
    }

    private void Menu() {
        CriarPrestador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PrestadorGUI();

                dispose();
            }
        });

        CriarEntregador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EntregadorGUI();

                dispose();
            }
        });

        CriarVisitante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "CriarVisitante");
            }
        });

        CriarCorreio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "CriarCorreio");
            }
        });
    }

    private void Mascara() {
        try {
            var CPF = new MaskFormatter("###.###.###-##");
            var CNPJ = new MaskFormatter("##.###.###/####-##");
            CPF.install(this.CPF);
            CNPJ.install(this.CNPJ);
        } catch (ParseException Ex) {
            Ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new PrestadorGUI();
    }
}
