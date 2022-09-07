/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.paneldemo1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelDemo1 extends JFrame {

    private JPanel buttonPanel;
    private JButton buttons[];

    public PanelDemo1() {

        super("Panel Demo");
        Container c = getContentPane();

        buttonPanel = new JPanel();
        buttons = new JButton[5];
        buttonPanel.setLayout(new GridLayout(1, buttons.length));

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("Button " + (i + 1));
            buttonPanel.add(buttons[i]);
        }
        JPanel jpanel = new JPanel();
        buttons = new JButton[5];
        buttonPanel.setLayout(new BoxLayout(jpanel, BoxLayout.Y_AXIS));

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("Button " + (i + 1));
            buttonPanel.add(buttons[i]);
        }
        c.add(buttonPanel, BorderLayout.NORTH);
        setSize(425, 150);

        Panel texto = new Panel();
        texto.add(new TextField(9));
        c.add(texto, BorderLayout.SOUTH);

        JFrame frame = new JFrame();
        frame.getContentPane().add(texto);
        frame.pack();
        frame.setVisible(true);

    }



public static void main(String args[]) {
        PanelDemo1 app = new PanelDemo1();
        app.addWindowListener(
                new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
