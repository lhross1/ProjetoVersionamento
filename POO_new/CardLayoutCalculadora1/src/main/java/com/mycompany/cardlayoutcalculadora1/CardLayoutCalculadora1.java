/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.cardlayoutcalculadora1;

/**
 *
 * @author Aluno
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutCalculadora1 {

    public JLabel peso;
    public JTextField pesoDigitado;
    public JLabel altura;
    public JTextField alturaDigitada;
    public JButton button;
    public JLabel imc;
    public JTextField imcResultante;

    public JRadioButton masculino;
    public JRadioButton feminino;
    public JLabel altura1;
    public JTextField alturaDigitada1;
    public JLabel digiteoSexo;
    public JLabel pesoIdeal;
    public JTextField resultado;

    public JButton calcular;
    public ButtonGroup bg;

    JPanel cards;
    private String calculadoraIMC = "calculadoraIMC";
    private String calculadoraPesoIdeal = " calculadoraPesoIdeal";
    private String calculadoraPesoIdeal2 = " calculadoraPesoIdeal2";

    public void janela() {
        JFrame jframe = new JFrame();
        JPanel jpanel1 = new JPanel();
        String comboBoxItems[] = {calculadoraIMC, calculadoraPesoIdeal,calculadoraPesoIdeal2};
        JComboBox cb = new JComboBox(comboBoxItems);
        jpanel1.add(cb);

// Criando os Cards
        JPanel card1 = new JPanel();
        peso = new JLabel("Digite o peso");
        pesoDigitado = new JTextField();
        altura = new JLabel("Digite a altura");
        alturaDigitada = new JTextField();
        button = new JButton("Calcular");
        imc = new JLabel("IMC:");
        imcResultante = new JTextField();

        card1.add(peso);
        card1.add(pesoDigitado);
        card1.add(altura);
        card1.add(alturaDigitada);
        card1.add(button);
        card1.add(imc);
        card1.add(imcResultante);

        card1.setLayout(new GridLayout(8, 1));

        JPanel card2 = new JPanel();
        masculino = new JRadioButton("Masculino");
        feminino = new JRadioButton("Feminino");
        digiteoSexo = new JLabel("Selecione o sexo:");
        altura1 = new JLabel("Digite a altura1:");
        alturaDigitada1 = new JTextField();
        pesoIdeal = new JLabel("O peso ideal é:");
        resultado = new JTextField("");
        calcular = new JButton("Calcular");

        ButtonGroup bg = new ButtonGroup();
        bg.add(masculino);
        bg.add(feminino);

        card2.setLayout(new GridLayout(8, 1));

        card2.add(digiteoSexo);
        card2.add(masculino);
        card2.add(feminino);
        card2.add(altura1);
        card2.add(alturaDigitada1);
        card2.add(pesoIdeal);
        card2.add(calcular);
        card2.add(resultado);
        
        JPanel card3 = new JPanel();
        card3.add(new CalculadoraPesoIdeal2());
        

// Adicionando Cards a um CardsLayout
        cards = new JPanel(new CardLayout());
        cards.add(card1, calculadoraIMC);
        cards.add(card2, calculadoraPesoIdeal);
        cards.add(card3, calculadoraPesoIdeal2);
        jframe.add(jpanel1, BorderLayout.PAGE_START);
        jframe.add(cards, BorderLayout.CENTER);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setBounds(100, 100, 300, 300);
        jframe.setVisible(true);

        //Handler Combobox
        Handler handler = new Handler();
        cb.addItemListener(handler);

        //Handler Peso Ideal
        ButtonHandler handler1 = new ButtonHandler();
        calcular.addActionListener(handler1);

        //Handler IMC
        ButtonHandler2 handler2 = new ButtonHandler2();
        button.addActionListener(handler2);

    }

     //Handler Combobox
    public class Handler implements ItemListener {

        public void itemStateChanged(ItemEvent event) {
            CardLayout cl = (CardLayout) (cards.getLayout());
            cl.show(cards, (String) event.getItem());
        }
    }

     //Handler Peso Ideal
    public class ButtonHandler implements ActionListener {
        //TRATA EVENTO DO BOTÃO

        public void actionPerformed(ActionEvent event) {

            float altura1, pesoIdeal;
            pesoIdeal = 0;
            altura1 = Float.parseFloat(alturaDigitada1.getText());

            if (masculino.isSelected()) {
                pesoIdeal = (float) ((altura1 * 72.7) - 58);
                resultado.setText(String.valueOf(pesoIdeal));

            } else if (feminino.isSelected()) {
                pesoIdeal = (float) ((altura1 * 62.1) - 44.7);
                resultado.setText(String.valueOf(pesoIdeal));
            }

        }
    }

    //Handler IMC
    public class ButtonHandler2 implements ActionListener {
        //TRATA EVENTO DO BOTÃO

        public void actionPerformed(ActionEvent event) {

            float imc, altura, peso;
            altura = Float.parseFloat(alturaDigitada.getText());
            peso = Float.parseFloat(pesoDigitado.getText());

            imc = peso / (altura * altura);

            imcResultante.setText(String.valueOf(imc));

        }

    }
    //Classe Calculadora Peso Ideal
    public class CalculadoraPesoIdeal2 extends JPanel{
    
    public JRadioButton masculino;
    public JRadioButton feminino;
    public JLabel altura1;
    public JTextField altura1Digitada1;
    public JLabel digiteoSexo;
    public JLabel pesoIdeal;
    public JTextField resultado;

    public JButton calcular;
    public ButtonGroup bg;

    public CalculadoraPesoIdeal2() {


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
    
    }

    public static void main(String[] args) {
        CardLayoutCalculadora1 cLayoutExemplo = new CardLayoutCalculadora1();
        cLayoutExemplo.janela();
    }
}
