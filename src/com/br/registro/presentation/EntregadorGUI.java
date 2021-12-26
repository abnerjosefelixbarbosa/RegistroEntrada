package com.br.presentation.entregador;

import com.br.business.registro.RegistroRule;
import com.br.model.condomino.Condomino;
import com.br.model.entregador.Entregador;
import com.br.model.prestador.Prestador;
import com.br.model.registro.Registro;
import com.br.presentation.correio.CorreioGUI;
import com.br.presentation.prestador.PrestadorGUI;
import com.br.presentation.visitante.VisitanteGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

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
    private JTextField Condomino;
    private JTextField Apartamento;
    private JTextField Bloco;
    private JCheckBox Condominio;

    public EntregadorGUI() {
        setContentPane(Panel1);
        setTitle("entregador");
        setSize(1900, 1000);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setVisible(true);
        Apartamento.setText("0");
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
                try {
                    Registro registro = new Registro();
                    Entregador entregador1 = new Entregador();
                    Condomino condomino1 = new Condomino();
                    RegistroRule registroRule = new RegistroRule();
                    Date data = new Date(System.currentTimeMillis());

                    registro.setDataHora(data);
                    entregador1.setNome(Entregador.getText());
                    entregador1.setEmpresa(Empresa.getText());
                    condomino1.setNome(Condomino.getText());
                    condomino1.setApartamento(Integer.parseInt(Apartamento.getText()));
                    condomino1.setBloco(Bloco.getText());
                    condomino1.setCondominio(Condominio.isSelected());
                    registro.setEntregador(entregador1);
                    registro.setCondomino(condomino1);
                    String resultado = registroRule.CriarEntregadorCondomino(registro);

                    if (!resultado.equals("")) {
                        JOptionPane.showMessageDialog(null,resultado,"Error",0);
                    } else {
                        JOptionPane.showMessageDialog(null,"Entregador registrado!","Menssagem",1);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",0);
                    Apartamento.setText("0");
                }
            }
        });
    }

    public static void main(String[] args) {
         new EntregadorGUI();
    }
}
