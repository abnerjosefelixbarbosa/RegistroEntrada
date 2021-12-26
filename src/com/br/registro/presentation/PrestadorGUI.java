package com.br.registro.presentation.prestador;

import com.br.registro.presentation.correio.CorreioGUI;
import com.br.registro.presentation.entregador.EntregadorGUI;
import com.br.registro.presentation.visitante.VisitanteGUI;
import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

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
        Menu();
        Cadastrar();
        Mascara();
    }

    private void Cadastrar() {
        cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                } catch (Exception Ex) {
                    JOptionPane.showMessageDialog(null, Ex.getMessage(), "Error", 0);

                }
            }
        });
    }

    private void LimparCampo() {
        prestador.setText("");
        cpf.setText("");
        empresa.setText("");
        cnpj.setText("");
        condomino.setText("");
        apartamento.setText("0");
        bloco.setText("");
    }

    private void Menu() {
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
    }

    private void Mascara() {
        try {
            MaskFormatter cpf = new MaskFormatter("###.###.###-##");
            MaskFormatter cnpj = new MaskFormatter("##.###.###/####-##");
            cpf.install(this.cpf);
            cnpj.install(this.cnpj);
        } catch (ParseException Ex) {
            Ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new PrestadorGUI();
    }
}
