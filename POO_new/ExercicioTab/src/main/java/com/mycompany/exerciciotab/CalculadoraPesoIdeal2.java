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

public class CalculadoraPesoIdeal2 extends JPanel {

    public JRadioButton masculino;
    public JRadioButton feminino;
    public JLabel altura1;
    public JTextField altura1Digitada1;
    public JLabel digiteoSexo;
    public JLabel pesoIdeal;
    public JTextField resultado;

    public JButton calcular;
    public ButtonGroup bg;

    public  CalculadoraPesoIdeal2() {

         masculino = new JRadioButton("Masculino");
         feminino = new JRadioButton("Feminino");
         digiteoSexo = new JLabel("Selecione o sexo:");
         altura1 = new JLabel("Digite a altura:");
         altura1Digitada1 = new JTextField();
         pesoIdeal = new JLabel("O peso ideal é:");
         resultado = new JTextField("");
         calcular = new JButton("Calcular");


        ButtonGroup bg = new ButtonGroup();
        bg.add(masculino);
        bg.add(feminino);

        setLayout(new GridLayout(8, 1));

        add(digiteoSexo);
        add(masculino);
        add(feminino);
        add(altura1);
        add(altura1Digitada1);
        add(pesoIdeal);
        add(calcular);
        add(resultado);
      

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
           
            float altura1, pesoIdeal;
            pesoIdeal = 0;
            altura1 = Float.parseFloat(altura1Digitada1.getText());
            
            
           if(masculino.isSelected()){ 
            pesoIdeal = (float) ((altura1*72.7)-58);
               resultado.setText(String.valueOf(pesoIdeal));
           
           }else if(feminino.isSelected()){
             pesoIdeal = (float) ((altura1*62.1)-44.7);
               resultado.setText(String.valueOf(pesoIdeal));
           } 

        }   
    }

    public static void main(String[] args) {
     
        
       
        
    }
    
}
