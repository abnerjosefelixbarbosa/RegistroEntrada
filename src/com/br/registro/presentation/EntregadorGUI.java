package com.br.registro.presentation;

import com.br.registro.business.RegistroRule;
import com.br.registro.model.Condomino;
import com.br.registro.model.Entregador;
import com.br.registro.model.Registro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class EntregadorGUI extends  JFrame{
    private JPanel panel1;
    private JMenu prestadorMenu;
    private JMenu entregadorMenu;
    private JMenuBar menuBar1;
    private JMenu visitanteMenu;
    private JMenu correioMenu;
    private JMenuItem CriarPrestador;
    private JMenuItem CriarEntregador;
    private JMenuItem CriarVisitante;
    private JMenuItem CriarCorreio;
    private JTextField entregador;
    private JTextField empresa;
    private JButton cadastrar;
    private JTextField condomino;
    private JTextField apartamento;
    private JTextField bloco;
    private JCheckBox condominio;

    public EntregadorGUI() {
        setContentPane(panel1);
        setTitle("entregador");
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
                    Entregador en = new Entregador(0,entregador.getText(),empresa.getText());
                    Condomino c = new Condomino(0,condomino.getText(),Integer.parseInt(apartamento.getText()),bloco.getText(),condominio.isSelected());
                    Registro r = new Registro(0,new Date(System.currentTimeMillis()),en,null,null,c,null);
                    RegistroRule rr = new RegistroRule();
                    String res = rr.AdicionarRegistroEntregador(r);

                    JOptionPane.showMessageDialog(null,res);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",0);
                    apartamento.setText("0");
                }
            }
        });
    };

    public static void main(String[] args) { new EntregadorGUI(); }
}
