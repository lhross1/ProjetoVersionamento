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

public class CalculadoraSoma extends JPanel implements ActionListener {

    private JLabel label;
    private JLabel label2;
    private JTextField field;
    private JTextField field2;
    private JTextField field3;
    private JButton button;

    public CalculadoraSoma() {

       
        
        label = new JLabel("Digite o primeiro valor");
        label2 = new JLabel("Digite o segundo valor");
        field = new JTextField(15);
        field2 = new JTextField(15);
        field3 = new JTextField("Soma: ");
        button = new JButton("OK");
        
        setLayout(new GridLayout(3,1));       
        
        add(label);
        add(field);
        add(label2);
        add(field2);
        add(button);
        add(field3);   
      
       
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
        
    }
}
