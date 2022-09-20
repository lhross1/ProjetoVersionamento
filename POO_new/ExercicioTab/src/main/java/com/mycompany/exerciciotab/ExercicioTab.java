/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerciciotab;

/**
 *
 * @author Aluno
 */
import javax.swing.*;

public class ExercicioTab {

    private String calculadoraIMC = "calculadoraIMC";
    private String calculadoraPesoIdeal = "calculadoraPesoIdeal";
    private String calculadora = "calculadora";
    private String calculadoraSoma = "calculadoraSoma";
    private String conversorMoedas = "conversorMoedas";

    public void janela() {
        JFrame jframe = new JFrame();
        JTabbedPane tabbedPane = new JTabbedPane();

//Criando as Tabs
        JPanel tab1 = new JPanel();
        tab1.add(new CalculadoraIMC());
       
        JPanel tab2 = new JPanel();
        tab2.add(new CalculadoraPesoIdeal2());
       
        JPanel tab3 = new JPanel();
        tab3.add(new Calculadora());
        
        JPanel tab4 = new JPanel();
        tab4.add(new CalculadoraSoma());
         
        JPanel tab5 = new JPanel();
        tab5.add(new ConversorMoedas());

//Adicionando as Tabs ao JTabbedPane
        tabbedPane.addTab(calculadoraIMC, tab1);
        tabbedPane.addTab(calculadoraPesoIdeal, tab2);
        tabbedPane.addTab(calculadora, tab3);
        tabbedPane.addTab(calculadoraSoma, tab4);
        tabbedPane.addTab(conversorMoedas, tab5);
      
        

//ajustando a jframe
        jframe.add(tabbedPane);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setBounds(800, 300, 800, 300);
        jframe.setVisible(true);
    }

    public static void main(String[] args) {
        ExercicioTab tExemplo = new ExercicioTab();
        tExemplo.janela();
    }
}