package com.br.presentation.visitante;

import com.br.presentation.correio.CorreioGUI;
import com.br.presentation.entregador.EntregadorGUI;
import com.br.presentation.prestador.PrestadorGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JTextField Apartamanto;
    private JTextField Bloco;
    private JCheckBox Condominio;

    public VisitanteGUI() {
        setContentPane(Panel1);
        setTitle("visitante");
        setSize(1900, 1000);
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
        new VisitanteGUI();
    }
}
