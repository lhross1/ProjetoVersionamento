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

public class ConversorMoedas extends JPanel {

    public JLabel label;
    public JLabel label2;
    public JLabel label3;
    public JComboBox moedas1;
    public JComboBox moedas2;
    public JTextField resultado;
    public JButton calcular;

    public ConversorMoedas() {


        label3 = new JLabel("Selecione a moeda");
        label = new JLabel("Selecione a moeda");
        moedas1 = new JComboBox();
        moedas2 = new JComboBox();
        label2 = new JLabel("Resultado:");
        resultado = new JTextField();
        calcular = new JButton("Calcular");
        moedas1.addItem("Real");
        moedas1.addItem("Euro");
        moedas1.addItem("Dolar");
        moedas2.addItem("Real");
        moedas2.addItem("Euro");
        moedas2.addItem("Dolar");

        add(label);
        add(moedas1);
        add(label3);
        add(moedas2);
        add(calcular);
        add(label2);
        add(resultado);

        setLayout(new GridLayout(8, 1));


        ButtonHandler handler = new ButtonHandler();
        calcular.addActionListener(handler);

    }

    public class ButtonHandler implements ActionListener {
        //TRATA EVENTO DO BOTÃO

        public void actionPerformed(ActionEvent event) {

            if (moedas1.getSelectedItem() == "Real" && moedas2.getSelectedItem() == "Real") {
                resultado.setText("1");
            } else if (moedas1.getSelectedItem() == "Dolar" && moedas2.getSelectedItem() == "Dolar") {
                resultado.setText("1");
            } else if (moedas1.getSelectedItem() == "Euro" && moedas2.getSelectedItem() == "Euro") {
                resultado.setText("1");
            } else if (moedas1.getSelectedItem() == "Real" && moedas2.getSelectedItem() == "Dolar") {
                resultado.setText("0,19");
            } else if (moedas1.getSelectedItem() == "Real" && moedas2.getSelectedItem() == "Euro") {
                resultado.setText("0,19");
            } else if (moedas1.getSelectedItem() == "Dolar" && moedas2.getSelectedItem() == "Euro") {
                resultado.setText("0,19");
            } else if (moedas1.getSelectedItem() == "Dolar" && moedas2.getSelectedItem() == "Real") {
                resultado.setText("5,19");
            } else if (moedas1.getSelectedItem() == "Euro" && moedas2.getSelectedItem() == "Dolar") {
                resultado.setText("1");
            } else if (moedas1.getSelectedItem() == "Euro" && moedas2.getSelectedItem() == "Real") {
                resultado.setText("5,18");
            }
        }
    }

    public static void main(String[] args) {
     

    }

}
