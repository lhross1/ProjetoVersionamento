/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exerciciolayout;

/**
 *
 * @author Aluno
 */
import java.awt.*;
import javax.swing.*;

public class ExercicioLayout {

    public static void main(String[] args) {
        //Panel Maior
        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel,BoxLayout.Y_AXIS));
        
        //Panel Superior
        JPanel a = new JPanel();
        painel.add(a);
        a.add(new JButton("BUT1"));
        a.add(new JButton("BUT2"));
        a.add(new JButton("BUT3"));
        a.add(new JButton("BUT4"));

        //Panel Central
        JPanel b = new JPanel();
        b.setLayout(new GridLayout(1, 1));
        painel.add(b);
        JPanel e = new JPanel();
        e.setLayout(new BoxLayout(e,BoxLayout.Y_AXIS));
        e.add(new JButton("BUT1"));
        e.add(new JButton("BUT2"));
        e.add(new JButton("BUT3"));
        e.add(new JButton("BUT4"));
        e.add(new JButton("BUT5"));
        b.add(e);
       
        
        //Panel Inferior
        JPanel c = new JPanel();
        painel.add(c);
        c.add(new TextField(35));

        //Frame - container obrigatorio
        JFrame jayframe = new JFrame();

        jayframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jayframe.add(painel);
        
        jayframe.pack();
        jayframe.setVisible(true);

    }
}
