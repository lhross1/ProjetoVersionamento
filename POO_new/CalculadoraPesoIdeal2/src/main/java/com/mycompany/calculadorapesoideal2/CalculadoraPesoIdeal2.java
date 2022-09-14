/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.calculadorapesoideal2;

/**
 *
 * @author Aluno
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CalculadoraPesoIdeal2 {

    public JRadioButton masculino;
    public JRadioButton feminino;
    public JLabel altura;
    public JTextField alturaDigitada;
    public JLabel digiteoSexo;
    public JLabel pesoIdeal;
    public JTextField resultado;

    public JButton calcular;
    public ButtonGroup bg;

    public void janela() {

        JFrame jframe = new JFrame("Calculadora de peso Ideal");
        JPanel jpanel = new JPanel();

        masculino = new JRadioButton("Masculino");
        feminino = new JRadioButton("Feminino");
         digiteoSexo = new JLabel("Selecione o sexo:");
         altura = new JLabel("Digite a altura:");
         alturaDigitada = new JTextField();
         pesoIdeal = new JLabel("O peso ideal é:");
         resultado = new JTextField("");
         calcular = new JButton("Calcular");


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
      

        jframe.getContentPane().add(jpanel);
        jframe.pack();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(200, 200);
        jframe.setVisible(true);

        //CRIA NOVO BUTTON HANDLER PARA TRATAMENTO DE EVENTO DE BOTÃO
        ButtonHandler handler = new ButtonHandler();
       
        calcular.addActionListener(handler);
       // masculino.addActionListener(handler);
        //feminino.addActionListener(handler);

    }

    //CLASSE INTERNA PARA TRATAMENTO DO BOTÃO
    public class ButtonHandler implements ActionListener {
    //TRATA EVENTO DO BOTÃO

        public void actionPerformed(ActionEvent event) {
           
            float altura, pesoIdeal;
            pesoIdeal = 0;
            altura = Float.parseFloat(alturaDigitada.getText());
            
            
           if(masculino.isSelected()){ 
            pesoIdeal = (float) ((altura*72.7)-58);
               resultado.setText(String.valueOf(pesoIdeal));
           
           }else if(feminino.isSelected()){
             pesoIdeal = (float) ((altura*62.1)-44.7);
               resultado.setText(String.valueOf(pesoIdeal));
           } 

        }   
    }

    public static void main(String[] args) {
     CalculadoraPesoIdeal2 captura = new CalculadoraPesoIdeal2();
        captura.janela();  
        
       
        
    }
    
}