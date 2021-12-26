package com.br.registro.presentation;

import com.br.registro.business.RegistroRule;
import com.br.registro.model.Condomino;
import com.br.registro.model.Prestador;
import com.br.registro.model.Registro;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Date;

public class PrestadorGUI extends JFrame {

    private JPanel panel1;
    private JTextField prestador;
    private JFormattedTextField cpf;
    private JTextField empresa;
    private JFormattedTextField cnpj;
    private JCheckBox autonomo;
    private JButton cadastrar;
    private JMenuItem criarPrestador;
    private JMenuItem criarEntregador;
    private JMenuItem criarVisitante;
    private JMenuItem criarCorreio;
    private JTextField condomino;
    private JTextField apartamento;
    private JTextField bloco;
    private JCheckBox condominio;

    public PrestadorGUI() {
        setContentPane(panel1);
        setTitle("prestador");
        setSize(1900, 1000);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setVisible(true);
        apartamento.setText("0");
        Menu.run();
        Cadastrar.run();
        Mascara.run();
    }

    private Runnable Menu = () -> {
        criarPrestador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PrestadorGUI();
                dispose();
            }
        });

        criarEntregador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EntregadorGUI();
                dispose();
            }
        });

        criarVisitante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VisitanteGUI();
                dispose();
            }
        });

        criarCorreio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CorreioGUI();
                dispose();
            }
        });
    };

    private Runnable Mascara = () -> {
        try {
            MaskFormatter cpf = new MaskFormatter("###.###.###-##");
            MaskFormatter cnpj = new MaskFormatter("##.###.###/####-##");
            cpf.install(this.cpf);
            cnpj.install(this.cnpj);
        } catch (ParseException Ex) {
            Ex.printStackTrace();
        }
    };

    private Runnable Cadastrar = () -> {
        cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Prestador p = new Prestador(0,prestador.getText(),cpf.getText(),empresa.getText(),cnpj.getText(),autonomo.isSelected());
                    Condomino c = new Condomino(0,condomino.getText(),Integer.parseInt(apartamento.getText()),bloco.getText(),condominio.isSelected());
                    Registro r = new Registro(0,new Date(System.currentTimeMillis()),null,p,null,c,null);
                    RegistroRule rr = new RegistroRule();
                    String res = rr.AdicionarRegistroPrestador(r);

                    JOptionPane.showMessageDialog(null,res);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",0);
                    apartamento.setText("0");
                }
            }
        });
    };

    public static void main(String[] args) {new PrestadorGUI();}
}
