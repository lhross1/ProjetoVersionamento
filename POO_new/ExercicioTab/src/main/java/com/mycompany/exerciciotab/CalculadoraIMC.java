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

public class CalculadoraIMC extends JPanel {

    public JLabel peso;
    public JTextField pesoDigitado;
    public JLabel altura;
    public JTextField alturaDigitada;
    public JButton button;
    public JLabel imc;
    public JTextField imcResultante;

    public CalculadoraIMC () {

        
        peso = new JLabel("Digite o peso");
        pesoDigitado = new JTextField();
        altura = new JLabel("Digite a altura");
        alturaDigitada = new JTextField();
        button = new JButton("Calcular");
        imc = new JLabel("IMC:");
        imcResultante = new JTextField();

        add(peso);
        add(pesoDigitado);
        add(altura);
        add(alturaDigitada);
        add(button);
        add(imc);
        add(imcResultante);

        setLayout(new GridLayout(8, 1));

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

            imc = peso / (altura * altura);

            imcResultante.setText(String.valueOf(imc));

        }

    }

    public static void main(String[] args) {   

    }

}
