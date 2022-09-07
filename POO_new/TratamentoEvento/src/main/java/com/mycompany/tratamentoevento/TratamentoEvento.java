/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tratamentoevento;

/**
 *
 * @author Aluno
 */
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;

public class TratamentoEvento implements ActionListener {

    private JButton botao;
    private int cont = 0;
    private JLabel label;

    public void janela() {

        JFrame frame = new JFrame();
        botao = new JButton("                                                          ");
        JPanel painel = new JPanel();
        label = new JLabel();

        painel.add(botao, BorderLayout.NORTH);
        painel.add(label, BorderLayout.SOUTH);

        // jpanel.add(b, BorderLayout.WEST);
//REGISTRA O EVENTO
        botao.addActionListener(this);
        frame.getContentPane().add(painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        botao.setText("Botão foi clicado!");

//ALTERA A FONTE
        botao.setFont(new Font("SansSerif", Font.BOLD, 20));
        label.setText("Botão Clicado " + cont + " vez(es)");
        cont++;

    }

    public static void main(String[] args) {
        TratamentoEvento captura = new TratamentoEvento();
        captura.janela();
    }
}
