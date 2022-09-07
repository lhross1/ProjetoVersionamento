/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exemplojframeswing;

/**
 *
 * @author Aluno
 */
import javax.swing.JFrame;


public class ExemploJFRameSwing extends JFrame {

    

super("minha primeira janela com Swing");
    this.setSize(100,300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    
    
  public static void main(String[] args) {
  JFrame janela = new JFrame("Meu primeiro frame em Java");
  Painel meuPainel = new Painel();
  
  janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
  janela.add(meuPainel);
  janela.setSize(600,400);
  janela.setVisible(true);
        
}
}