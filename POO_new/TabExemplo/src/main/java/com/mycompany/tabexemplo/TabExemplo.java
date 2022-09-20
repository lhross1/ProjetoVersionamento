/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tabexemplo;

/**
 *
 * @author Aluno
 */
import javax.swing.*;

public class TabExemplo {

    private String buttonPanel = "Card com JButtons";
    private String textPanel = "Card com JTextField";

    public void janela() {
        JFrame jframe = new JFrame();
        JTabbedPane tabbedPane = new JTabbedPane();

//Criando as Tabs
        JPanel tab1 = new JPanel();
        tab1.add(new JButton("Botão 1"));
        tab1.add(new JButton("Botão 2"));
        tab1.add(new JButton("Botão 3"));
        JPanel tab2 = new JPanel();
        tab2.add(new JTextField("TextField", 20));

//Adicionando as Tabs ao JTabbedPane
        tabbedPane.addTab(buttonPanel, tab1);
        tabbedPane.addTab(textPanel, tab2);

//ajustando a jframe
        jframe.add(tabbedPane);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setBounds(100, 100, 300, 300);
        jframe.setVisible(true);
    }

    public static void main(String[] args) {
        TabExemplo tExemplo = new TabExemplo();
        tExemplo.janela();
    }
}
