package com.br.registro.presentation;

//import com.br.registro.business.registro_prestador.RegistroPrestador;

import com.br.registro.business.RegistroRule;
import com.br.registro.model.Condomino;
import com.br.registro.model.Registro;
import com.br.registro.model.Visitante;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class VisitanteGUI extends JFrame {
    private JMenuBar menuBar1;
    private JMenu prestadorMenu;
    private JMenu entregadorMenu;
    private JMenu visitanteMenu;
    private JMenu correioMenu;
    private JMenuItem CriarCorreio;
    private JMenuItem CriarVisitante;
    private JMenuItem CriarEntregador;
    private JMenuItem CriarPrestador;
    private JPanel panel1;
    private JButton cadastrar;
    private JTextField visitante;
    private JTextField condomino;
    private JTextField apartamento;
    private JTextField bloco;
    private JCheckBox condominio;

    public VisitanteGUI() {
        setContentPane(panel1);
        setTitle("visitante");
        setSize(1900, 1000);
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
                    Visitante v = new Visitante(0,visitante.getText());
                    Condomino c = new Condomino(0,condomino.getText(),Integer.parseInt(apartamento.getText()),bloco.getText(),condominio.isSelected());
                    Registro r = new Registro(0,new Date(System.currentTimeMillis()),null,null,null,c,v);
                    RegistroRule rr = new RegistroRule();
                    String res = rr.AdicionarRegistroVisitante(r);

                    JOptionPane.showMessageDialog(null,res);
                } catch (Exception Ex) {
                    JOptionPane.showMessageDialog(null, Ex.getMessage(), "Error", 0);
                    apartamento.setText("0");
                }
            }
        });
    };

    public static void main(String[] args) {
        new VisitanteGUI();
    }
}
