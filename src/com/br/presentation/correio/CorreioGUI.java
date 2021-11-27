package com.br.presentation.correio;

import com.br.presentation.entregador.EntregadorGUI;
import com.br.presentation.prestador.PrestadorGUI;
import com.br.presentation.visitante.VisitanteGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CorreioGUI extends JFrame {
    private JPanel Panel1;
    private JMenuBar MenuBar1;
    private JMenu PrestadorMenu;
    private JMenu EntregadorMenu;
    private JMenu VisitanteMenu;
    private JMenu CorreioMenu;
    private JMenuItem CriarPrestador;
    private JMenuItem CriarEntregador;
    private JMenuItem CriarVisitante;
    private JMenuItem CriarCorreio;
    private JTextField Condomino;
    private JTextField Apartamento;
    private JTextField Bloco;
    private JCheckBox Condominio;
    private JButton Cadas;

    public CorreioGUI() {
        setContentPane(Panel1);
        setTitle("correio");
        setSize(1900,1000);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setVisible(true);
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

    }

    public static void main(String[] args) {
        new CorreioGUI();
    }
}
