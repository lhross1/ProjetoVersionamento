/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.buttonframe3;

/**
 *
 * @author Aluno
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonFrame3 extends JFrame {

    private JButton botaoUm;
    private JButton botaoDois;
    private JLabel label;
  

    public ButtonFrame3() {
        super("Testando Botões");
        setLayout(new GridLayout(2, 1));
        botaoUm = new JButton("Botão 1");
        add(botaoUm);
        botaoDois = new JButton("Botão 2");
        add(botaoDois);
        label = new JLabel("Clique no Botão");
        add(label);
//CRIA NOVO BUTTON HANDLER PARA TRATAMENTO DE EVENTO DE BOTÃO
        ButtonHandler handler = new ButtonHandler();
        botaoUm.addActionListener(handler);
        botaoDois.addActionListener(handler);
    }
//CLASSE INTERNA PARA TRATAMENTO DO BOTÃO

    public class ButtonHandler implements ActionListener {
//TRATA EVENTO DO BOTÃO

        public void actionPerformed(ActionEvent event) {
            
            label.setText("Você clicou no "+event.getActionCommand());
         
        }
    }

    public static void main(String[] args) {
        ButtonFrame3 buttonFrame = new ButtonFrame3();
        
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(275, 210);
        buttonFrame.setVisible(true);
    }
}
