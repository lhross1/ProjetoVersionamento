/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.buttonframe2;

/**
 *
 * @author Aluno
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonFrame2 extends JFrame {

    private JButton botaoPrata;
    private JButton botaoOuro;

    public ButtonFrame2() {
        super("Testando Botões");
        setLayout(new GridLayout(1, 2));
        botaoPrata = new JButton("Prata");
        add(botaoPrata);
        botaoOuro = new JButton("Ouro");
        add(botaoOuro);
//CRIA NOVO BUTTON HANDLER PARA TRATAMENTO DE EVENTO DE BOTÃO
        ButtonHandler handler = new ButtonHandler();
        botaoOuro.addActionListener(handler);
        botaoPrata.addActionListener(handler);
    }
//CLASSE INTERNA PARA TRATAMENTO DO BOTÃO

    public class ButtonHandler implements ActionListener {
//TRATA EVENTO DO BOTÃO

        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(ButtonFrame2.this,
                    String.format("Você pressionou: %s", event.getActionCommand()));

        }
    }

    public static void main(String[] args) {
        ButtonFrame2 buttonFrame = new ButtonFrame2();
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(275, 210);
        buttonFrame.setVisible(true);
    }
}
