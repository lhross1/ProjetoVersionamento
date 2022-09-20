/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.cardlayoutexemplo;

/**
 *
 * @author Aluno
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutExemplo {

    JPanel cards;
    private String buttonPanel = "Card com JButtons";
    private String textPanel = "Card com JTextField";

    public void janela() {
        JFrame jframe = new JFrame();
        JPanel jpanel1 = new JPanel();
        String comboBoxItems[] = {buttonPanel, textPanel};
        JComboBox cb = new JComboBox(comboBoxItems);
        jpanel1.add(cb);

// Criando os Cards
        JPanel card1 = new JPanel();
        card1.add(new JButton("Botão 1"));
        card1.add(new JButton("Botão 2"));
        card1.add(new JButton("Botão 3"));
        JPanel card2 = new JPanel();
        card2.add(new JTextField("TextField", 20));

// Adicionando Cards a um CardsLayout
        cards = new JPanel(new CardLayout());
        cards.add(card1, buttonPanel);
        cards.add(card2, textPanel);
        jframe.add(jpanel1, BorderLayout.PAGE_START);
        jframe.add(cards, BorderLayout.CENTER);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setBounds(100, 100, 300, 300);
        jframe.setVisible(true);
        Handler handler = new Handler();
        cb.addItemListener(handler);
    }

    public class Handler implements ItemListener {

        public void itemStateChanged(ItemEvent event) {
            CardLayout cl = (CardLayout) (cards.getLayout());
            cl.show(cards, (String) event.getItem());
        }
    }

    public static void main(String[] args) {
        CardLayoutExemplo cLayoutExemplo = new CardLayoutExemplo();
        cLayoutExemplo.janela();
    }
}
