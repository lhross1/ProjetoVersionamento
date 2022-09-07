/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exemplogridlayout;

/**
 *
 * @author Aluno
 */
import java.awt.*;
import javax.swing.*;

public class ExemploGridLayout {

    public static void main(String[] args) {
       
        JFrame frame = new JFrame("Swing Application");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       
        Panel c = new Panel();
        frame.getContentPane().add(c);
        c.setLayout(new GridLayout(2, 2));
        c.add(new Button("um"));
        c.add(new TextField(5));
        c.add(new Button("dois"));
        c.add(new Button("três"));
        frame.setVisible(true);
        frame.pack();
    }
}
