/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.frame;

/**
 *
 * @author Aluno
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

public class Frame extends JFrame {
// criação do tabbedPane para incluir as tabs

    private JTabbedPane jTPane;

    public Frame() {
        jTPane = new JTabbedPane();
        add(jTPane);
// criandos as tabs
// tab1 carros
        JanelaCarros tab1 = new JanelaCarros();
        jTPane.add("Carros", tab1);
        setBounds(200, 200, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Frame().setVisible(true);
    }
}
