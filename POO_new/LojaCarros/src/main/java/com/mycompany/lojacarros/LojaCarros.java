/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.lojacarros;

/**
 *
 * @author Aluno
 */
import javax.swing.*;

public class LojaCarros {

    private String carros = "Carros";
    private String clientes = "Clientes";
    private String vendas = "Vendas";

    public void janela() {
        JFrame jframe = new JFrame("LojaCarros");
        JTabbedPane tabbedPane = new JTabbedPane();
//Criando as Tabs
        JPanel tab1 = new JPanel();
        tab1.add(new Carros());
        
        JPanel tab2 = new JPanel();
         tab2.add(new Clientes());
       
        JPanel tab3 = new JPanel();
        tab3.add(new Vendas());
        
//Adicionando as Tabs ao JTabbedPane
        tabbedPane.addTab(carros, tab1);
        tabbedPane.addTab(clientes, tab2);
        tabbedPane.addTab(vendas, tab3);
//ajustando a jframe
        jframe.add(tabbedPane);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setBounds(100, 100, 300, 300);
        jframe.setVisible(true);
    }

    public static void main(String[] args) {
        LojaCarros exemplo = new LojaCarros();
        exemplo.janela();

    }
}
