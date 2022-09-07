/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exemploborderlayout;

/**
 *
 * @author Aluno
 */

import java.awt.*;
import javax.swing.*;

public class ExemploBorderLayout {

    public static void main(String[] args) {
       
        JPanel jpanel = new JPanel(new BorderLayout());
        JButton b = new JButton("Botão");
        jpanel.add(b, BorderLayout.CENTER);
        JFrame frame = new JFrame();
        frame.getContentPane().add(jpanel);
        frame.pack();
        frame.setVisible(true);
    }
}
