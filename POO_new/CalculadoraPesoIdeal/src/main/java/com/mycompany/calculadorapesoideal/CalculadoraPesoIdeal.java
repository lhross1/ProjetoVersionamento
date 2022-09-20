/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.calculadorapesoideal;

/**
 *
 * @author Aluno
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CalculadoraPesoIdeal implements ActionListener {

    private JRadioButton masculino;
    private JRadioButton feminino;
    private JLabel altura;
    private JTextField alturaDigitada;
    private JLabel digiteoSexo;
    private JLabel pesoIdeal;
    private JTextField resultado;
    private JComboBox sexo;

    private JButton calcular;
    private ButtonGroup bg;

    public void janela() {

        JFrame jframe = new JFrame("Calculadora de peso Ideal");
        JPanel jpanel = new JPanel();

        masculino = new JRadioButton("Masculino");
        feminino = new JRadioButton("Feminino");
        digiteoSexo = new JLabel("Selecione o sexo:");
        altura = new JLabel("Digite a altura:");
        alturaDigitada = new JTextField();
        pesoIdeal = new JLabel("O peso ideal é:");
        resultado = new JTextField();
        calcular = new JButton("Calcular");
        sexo = new JComboBox();
        sexo.addItem("Masculino");
        sexo.addItem("Feminino");

        ButtonGroup bg = new ButtonGroup();
        bg.add(masculino);
        bg.add(feminino);

        jpanel.setLayout(new GridLayout(8, 1));

        jpanel.add(digiteoSexo);
        jpanel.add(masculino);
        jpanel.add(feminino);
        jpanel.add(altura);
        jpanel.add(alturaDigitada);
        jpanel.add(pesoIdeal);
        jpanel.add(calcular);
        jpanel.add(resultado);
        //jpanel.add(sexo);

        jframe.getContentPane().add(jpanel);
        jframe.pack();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(200, 200);
        jframe.setVisible(true);

        //REGISTRA O EVENTO
        //REGISTRA O EVENTO
        calcular.addActionListener(this);

    }

    public void actionPerformed(ActionEvent evento) {

        if (masculino.isSelected()) {
            resultado.setText("teste");
        } else {

        }

    }

    public static void main(String[] args) {
        CalculadoraPesoIdeal captura = new CalculadoraPesoIdeal();
        captura.janela();

    }
}
