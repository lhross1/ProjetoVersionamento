/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tratamentoevento1;

/**
 *
 * @author Aluno
 */
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TratamentoEvento1 implements ActionListener {

    private JButton botao;

    public void janela() {
        JFrame frame = new JFrame();
        botao = new JButton();

//REGISTRA O EVENTO
        botao.addActionListener(this);
        frame.getContentPane().add(botao);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        botao.setText("Botão foi clicado!");
//ALTERA A FONTE
        botao.setFont(new Font("SansSerif", Font.BOLD, 20));
    }

    public static void main(String[] args) {
        TratamentoEvento1 captura = new TratamentoEvento1();
        captura.janela();
    }
}
