package com.br.registro.presentation;

//import com.br.registro.business.registro.RegistroRule;

import com.br.registro.business.RegistroRule;
import com.br.registro.model.Condomino;
import com.br.registro.model.Correio;
import com.br.registro.model.Registro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;

public class CorreioGUI extends JFrame {
    private JPanel panel1;
    private JMenuBar MenuBar1;
    private JMenu prestadorMenu;
    private JMenu entregadorMenu;
    private JMenu visitanteMenu;
    private JMenu correioMenu;
    private JMenuItem CriarPrestador;
    private JMenuItem CriarEntregador;
    private JMenuItem CriarVisitante;
    private JMenuItem CriarCorreio;
    private JTextField condomino;
    private JTextField apartamento;
    private JTextField bloco;
    private JCheckBox condominio;
    private JButton cadastrar;

    public CorreioGUI() {
        setContentPane(panel1);
        setTitle("correio");
        setSize(1900,1000);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setVisible(true);
        apartamento.setText("0");
        Menu.run();
        Cadastrar.run();
    }

    private Runnable Menu = () -> {
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
    };

    private Runnable Cadastrar = () -> {
        cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Correio cor = new Correio(0);
                    Condomino con = new Condomino(0,condomino.getText(),Integer.parseInt(apartamento.getText()),bloco.getText(),condominio.isSelected());
                    Registro r = new Registro(0,new Date(System.currentTimeMillis()),null,null,cor,con,null);
                    RegistroRule rr = new RegistroRule();
                    String res = rr.AdicionarRegistroCorreio(r);

                    JOptionPane.showMessageDialog(null,res);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
                    apartamento.setText("0");
                }
            }
        });
    };

    public static void main(String[] args) { new CorreioGUI(); }
}
