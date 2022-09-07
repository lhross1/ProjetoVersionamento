/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exemploflowlayout;

/**
 *
 * @author Aluno
 */
import java.awt.*;
import javax.swing.*;

public class ExemploFlowLayout {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Application");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Panel c = new Panel();
        c.add(new Button("1"));
        c.add(new TextField(9));
        c.add(new Button("dois"));
        c.add(new Button("três"));
        frame.getContentPane().add(c);
        frame.pack();
        frame.setVisible(true);
    }
}
