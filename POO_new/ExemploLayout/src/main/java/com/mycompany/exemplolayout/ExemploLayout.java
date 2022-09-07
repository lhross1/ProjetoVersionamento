/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exemplolayout;

/**
 *
 * @author Aluno
 */
import java.awt.*;
import javax.swing.*;

public class ExemploLayout {

    public static void main(String[] args) {

        JPanel jpanel = new JPanel();
        jpanel.setLayout(new BoxLayout(jpanel, BoxLayout.X_AXIS));
        JButton um = new JButton("Botão");
        JButton dois = new JButton("Botão");
        JButton tres = new JButton("Botão");
        JButton quatro = new JButton("Botão");
        JButton cinco = new JButton("Botão");
        jpanel.add(um);
        jpanel.add(dois);
        jpanel.add(tres);
        jpanel.add(quatro);
        jpanel.add(cinco);

        JFrame frame = new JFrame();
        frame.getContentPane().add(jpanel);
        frame.pack();
        frame.setVisible(true);

    }
}
