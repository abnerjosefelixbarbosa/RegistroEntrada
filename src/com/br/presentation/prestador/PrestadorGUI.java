package com.br.presentation.prestador;

import com.br.business.registro.RegistroRule;
import com.br.model.condomino.Condomino;
import com.br.model.prestador.Prestador;
import com.br.model.registro.Registro;
import com.br.presentation.correio.CorreioGUI;
import com.br.presentation.entregador.EntregadorGUI;
import com.br.presentation.visitante.VisitanteGUI;
import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Date;

public class PrestadorGUI extends JFrame {

    private JPanel Panel1;
    private JTextField Prestador;
    private JFormattedTextField CPF;
    private JTextField Empresa;
    private JFormattedTextField CNPJ;
    private JCheckBox Autonomo;
    private JButton Cadastrar;
    private JMenuItem CriarPrestador;
    private JMenuItem CriarEntregador;
    private JMenuItem CriarVisitante;
    private JMenuItem CriarCorreio;
    private JTextField Condomino;
    private JTextField Apartamento;
    private JTextField Bloco;
    private JCheckBox Condominio;

    public PrestadorGUI() {
        setContentPane(Panel1);
        setTitle("prestador");
        setSize(1900, 1000);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setVisible(true);
        Apartamento.setText("0");
        Menu();
        Cadastrar();
        Mascara();
    }

    private void Cadastrar() {
        Cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Registro registro = new Registro();
                    Prestador prestador1 = new Prestador();
                    Condomino condomino1 = new Condomino();
                    RegistroRule registroRule = new RegistroRule();

                    registro.setDataHora(new Date(System.currentTimeMillis()));
                    prestador1.setNome(Prestador.getText());
                    prestador1.setCPF(CPF.getText());
                    prestador1.setEmpresa(Empresa.getText());
                    prestador1.setCNPJ(CNPJ.getText());
                    prestador1.setAutonomo(Autonomo.isSelected());
                    condomino1.setNome(Condomino.getText());
                    condomino1.setApartamento(Integer.parseInt(Apartamento.getText()));
                    condomino1.setBloco(Bloco.getText());
                    condomino1.setCondominio(Condominio.isSelected());
                    registro.setPrestador(prestador1);
                    registro.setCondomino(condomino1);
                    String resultado = registroRule.CriarPrestadorCondomino(registro);

                    if (!resultado.equals("")) {
                        JOptionPane.showMessageDialog(null, resultado, "Error", 0);
                    } else {
                        JOptionPane.showMessageDialog(null, "Prestador cadastrado!", "Mensagem", 1);
                    }
                } catch (Exception Ex) {
                    JOptionPane.showMessageDialog(null, Ex.getMessage(), "Error", 0);
                    Apartamento.setText("0");
                }
            }
        });
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

    private void Mascara() {
        try {
            var CPF = new MaskFormatter("###.###.###-##");
            var CNPJ = new MaskFormatter("##.###.###/####-##");
            CPF.install(this.CPF);
            CNPJ.install(this.CNPJ);
        } catch (ParseException Ex) {
            Ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new PrestadorGUI();
    }
}
