/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.borderlayout1;

/**
 *
 * @author Aluno
 */
import java.awt.*;
import javax.swing.*;

public class BorderLayout1 {

    public static void main(String[] args) {
       
        JPanel jpanel = new JPanel(new BorderLayout());
        
        JButton b = new JButton("Botão");
        jpanel.add(b, BorderLayout.CENTER);
        JButton a = new JButton("Botão");
        jpanel.add(a, BorderLayout.NORTH);
        JButton c = new JButton("Botão");
        jpanel.add(c, BorderLayout.WEST);
        JButton d = new JButton("Botão");
        jpanel.add(d, BorderLayout.EAST);
        JButton e = new JButton("Botão");
        jpanel.add(e, BorderLayout.SOUTH);
      
        
        JFrame frame = new JFrame();
        frame.getContentPane().add(jpanel);
        frame.pack();
        frame.setVisible(true);
    }
}
