package com.br.presentation.entregador;

import com.br.presentation.correio.CorreioGUI;
import com.br.presentation.prestador.PrestadorGUI;
import com.br.presentation.visitante.VisitanteGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntregadorGUI extends  JFrame{
    private JPanel Panel1;
    private JMenu PrestadorMenu;
    private JMenu EntregadorMenu;
    private JMenuBar MenuBar1;
    private JMenu VisitanteMenu;
    private JMenu CorreioMenu;
    private JMenuItem CriarPrestador;
    private JMenuItem CriarEntregador;
    private JMenuItem CriarVisitante;
    private JMenuItem CriarCorreio;
    private JTextField Entregador;
    private JTextField Empresa;
    private JButton Cadastrar;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JCheckBox condominioCheckBox;

    public EntregadorGUI() {
        setContentPane(Panel1);
        setTitle("entregador");
        setSize(1900, 1000);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setVisible(true);
        Menu();
        Cadastrar();
    }

    private  void Menu() {
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

    private  void Cadastrar() {
        Cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }

    public static void main(String[] args) {
         new EntregadorGUI();
    }
}
