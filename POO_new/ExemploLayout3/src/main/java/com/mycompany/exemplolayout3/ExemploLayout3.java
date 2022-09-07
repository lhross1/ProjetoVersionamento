/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exemplolayout3;

/**
 *
 * @author Aluno
 */
import java.awt.*;
import javax.swing.*;

public class ExemploLayout3 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Application");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500);
        Panel b = new Panel();
        frame.getContentPane().add(b);
        b.setLayout(new BoxLayout(b, BoxLayout.Y_AXIS));
//novo panel
        Panel c = new Panel();
        c.add(new Button("1"));
        c.add(new TextField(9));
        c.add(new Button("dois"));
        c.add(new Button("três"));
        b.add(c);
        frame.setVisible(true);
//novo panel
        Panel d = new Panel();
        d.setLayout(new GridLayout(2, 2));
        d.add(new Button("1"));
        d.add(new TextField(9));
        d.add(new Button("dois"));
        d.add(new Button("três"));
        b.add(d);
    }
}
