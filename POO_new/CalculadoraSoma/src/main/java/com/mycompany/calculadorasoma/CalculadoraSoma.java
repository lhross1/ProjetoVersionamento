/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadorasoma;

/**
 *
 * @author Aluno
 */

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CalculadoraSoma implements ActionListener {

    private JLabel label;
    private JLabel label2;
    private JTextField field;
    private JTextField field2;
    private JTextField field3;
    private JButton button;

    public void janela() {

        JFrame frame = new JFrame();
        JPanel painel = new JPanel();
      //JPanel painel2 = new JPanel();
        
        label = new JLabel("Digite o primeiro valor");
        label2 = new JLabel("Digite o segundo valor");
        field = new JTextField(15);
        field2 = new JTextField(15);
        field3 = new JTextField("Soma: ");
        button = new JButton("OK");
        
        painel.setLayout(new GridLayout(3,1));       
        
        painel.add(label);
        painel.add(field);
        painel.add(label2);
        painel.add(field2);
        painel.add(button);
        painel.add(field3);   
      
        frame.getContentPane().add(painel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 100);
        frame.setVisible(true);
       
//REGISTRA O EVENTO
        
         button.addActionListener(this);     
    }

    public void actionPerformed(ActionEvent evento) {
      
       int numeroUm, numeroDois, soma;
       numeroUm = Integer.parseInt(field.getText());
       numeroDois = Integer.parseInt(field2.getText());
       soma = numeroUm + numeroDois;
       
       field3.setText(String.valueOf(soma));
    
    } 

    public static void main(String[] args) {
        CalculadoraSoma captura = new CalculadoraSoma();
        captura.janela();
    }
}
