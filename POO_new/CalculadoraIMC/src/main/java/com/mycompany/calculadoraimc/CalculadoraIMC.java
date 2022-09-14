/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.calculadoraimc;

/**
 *
 * @author Aluno
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CalculadoraIMC {

    public JLabel peso;
    public JTextField pesoDigitado;
    public JLabel altura;
    public JTextField alturaDigitada;
    public JButton button;
    public JLabel imc;
    public JTextField imcResultante;

    public void janela() {

        JFrame jframe = new JFrame("CalculadoraIMC");
        JPanel jpanel = new JPanel();

         peso = new JLabel("Digite o peso");
         pesoDigitado = new JTextField();
         altura = new JLabel("Digite a altura");
         alturaDigitada = new JTextField();
         button = new JButton("Calcular");
         imc = new JLabel("IMC:");
         imcResultante = new JTextField();
        
        jpanel.add(peso);
        jpanel.add(pesoDigitado);
        jpanel.add(altura);
        jpanel.add(alturaDigitada);
        jpanel.add(button);
        jpanel.add(imc);
        jpanel.add(imcResultante);
        
       jpanel.setLayout(new GridLayout(8, 1));
        
        jframe.getContentPane().add(jpanel);
        jframe.pack();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(300, 200);
        jframe.setVisible(true);

        ButtonHandler handler = new ButtonHandler();
        button.addActionListener(handler);

    }
    //CLASSE INTERNA PARA TRATAMENTO DO BOTÃO

    public class ButtonHandler implements ActionListener {
        //TRATA EVENTO DO BOTÃO

        public void actionPerformed(ActionEvent event) {

            float imc, altura, peso;
             altura = Float.parseFloat(alturaDigitada.getText());
              peso = Float.parseFloat(pesoDigitado.getText());
              
              imc = peso/(altura*altura);
           
            imcResultante.setText(String.valueOf(imc));
            
        }

    }


public static void main(String[] args) {
      CalculadoraIMC captura = new CalculadoraIMC();
        captura.janela();  
        
        
    }

}