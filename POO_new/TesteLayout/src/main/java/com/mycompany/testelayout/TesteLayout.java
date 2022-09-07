/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testelayout;

/**
 *
 * @author Aluno
 */
import java.awt.*;
import javax.swing.*;


public class TesteLayout {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Swing Application");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500);
        
        Panel b = new Panel();
        frame.getContentPane().add(b);
        b.setLayout(new BoxLayout(b, BoxLayout.Y_AXIS));
       
        
        
        Panel c = new Panel();
        frame.getContentPane().add(b);
        c.setLayout(new GridLayout(1, 4));
        c.add(new Button("BUT1"));
        c.add(new Button("BUT2"));
        c.add(new Button("BUT3"));
        c.add(new Button("BUT4"));
        b.add(c);
        
        
        
        Panel d = new Panel();
        frame.getContentPane().add(b);
        d.setLayout(new GridLayout(5, 1));
        d.add(new Button("BUT1"));
        d.add(new Button("BUT2"));
        d.add(new Button("BUT3"));
        d.add(new Button("BUT4"));
        d.add(new Button("BUT5"));
        
        b.add(d);
        
        Panel f = new Panel();
        frame.getContentPane().add(b);
        f.setLayout(new GridLayout(5, 1));
        f.add(new TextField(9));
        
        
        b.add(f);
        
        frame.setVisible(true);
        frame.pack();


        
        
        
        
        
    }
}
