package com.br.presentation.visitante;

import com.br.business.registro.RegistroRule;
import com.br.model.condomino.Condomino;
import com.br.model.entregador.Entregador;
import com.br.model.registro.Registro;
import com.br.model.visitante.Visitante;
import com.br.presentation.correio.CorreioGUI;
import com.br.presentation.entregador.EntregadorGUI;
import com.br.presentation.prestador.PrestadorGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class VisitanteGUI extends JFrame {
    private JMenuBar MenuBar1;
    private JMenu PrestadorMenu;
    private JMenu EntregadorMenu;
    private JMenu VisitanteMenu;
    private JMenu CorreioMenu;
    private JMenuItem CriarCorreio;
    private JMenuItem CriarVisitante;
    private JMenuItem CriarEntregador;
    private JMenuItem CriarPrestador;
    private JPanel Panel1;
    private JButton Cadastrar;
    private JTextField Visitante;
    private JTextField Condomino;
    private JTextField Apartamento;
    private JTextField Bloco;
    private JCheckBox Condominio;

    public VisitanteGUI() {
        setContentPane(Panel1);
        setTitle("visitante");
        setSize(1900, 1000);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setVisible(true);
        Apartamento.setText("0");
        Menu();
        Cadastrar();
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
                new VisitanteGUI();

                dispose();
            }
        });

        CriarCorreio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CorreioGUI();

                dispose();
            }
        });
    }

    private void Cadastrar() {
        Cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Registro Registro = new Registro();
                    Visitante Visitante1 = new Visitante();
                    Condomino Condomino1 = new Condomino();
                    RegistroRule RegistroRule = new RegistroRule();
                    Date Data = new Date(System.currentTimeMillis());

                    Registro.setDataHora(Data);
                    Visitante1.setNome(Visitante.getText());
                    Condomino1.setNome(Condomino.getText());
                    Condomino1.setApartamento(Integer.parseInt(Apartamento.getText()));
                    Condomino1.setBloco(Bloco.getText());
                    Condomino1.setCondominio(Condominio.isSelected());
                    Registro.setVisitante(Visitante1);
                    Registro.setCondomino(Condomino1);
                    String Resultado = RegistroRule.CriarVisitante(Registro);

                    if (!Resultado.equals("")) {
                        JOptionPane.showMessageDialog(null, Resultado, "Error", 0);
                    } else {
                        JOptionPane.showMessageDialog(null, "Visitante registrado!", "Mensagem", 1);
                    }
                } catch (Exception Ex) {
                    JOptionPane.showMessageDialog(null, Ex.getMessage(), "Error", 0);
                    Apartamento.setText("0");
                }
            }
        });
    }

    public static void main(String[] args) {
        new VisitanteGUI();
    }
}
