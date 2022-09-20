/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciotab;

/**
 *
 * @author Aluno
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Calculadora extends JPanel implements ActionListener  {

    private JLabel label;
    private JLabel label2;
    private JTextField field;
    private JTextField field2;
    private JTextField field3;
    private JLabel label3;
    private JButton mais;
    private JButton menos;
    private JButton multiplicacao;
    private JButton divisao;

    public Calculadora() {


        label = new JLabel("Digite o primeiro valor:");
        label2 = new JLabel("Digite o segundo valor:");
        field = new JTextField();
        field2 = new JTextField();
        label3 = new JLabel("Resultado:");
        field3 = new JTextField();
        mais = new JButton("+");
        mais.setFont(new Font("SansSerif", Font.BOLD, 16));
        menos = new JButton("-");
        menos.setFont(new Font("SansSerif", Font.BOLD, 20));
        multiplicacao = new JButton("*");
        multiplicacao.setFont(new Font("SansSerif", Font.BOLD, 24));
        divisao = new JButton("/");
        divisao.setFont(new Font("SansSerif", Font.BOLD, 18));

        setLayout(new GridLayout(5, 5));

        add(label);
        add(field);
        add(label2);
        add(field2);
        add(mais);
        add(menos);
        add(multiplicacao);
        add(divisao);
        add(label3);
        add(field3);


//REGISTRA O EVENTO
        mais.addActionListener(this);
        menos.addActionListener(this);
        divisao.addActionListener(this);
        multiplicacao.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evento) {

        float numeroUm, numeroDois, resultado;
        numeroUm = Float.parseFloat(field.getText());
        numeroDois = Float.parseFloat(field2.getText());

        resultado = 0;

        if (evento.getSource() == mais) {
            resultado = numeroUm + numeroDois;
        } else if (evento.getSource() == menos) {
            resultado = numeroUm - numeroDois;
        } else if (evento.getSource() == divisao) {
            resultado = numeroUm / numeroDois;
        } else if (evento.getSource() == multiplicacao) {
            resultado = numeroUm * numeroDois;
        }

        field3.setText(String.valueOf(resultado));

    }

    public static void main(String[] args) {
      
    }
}
