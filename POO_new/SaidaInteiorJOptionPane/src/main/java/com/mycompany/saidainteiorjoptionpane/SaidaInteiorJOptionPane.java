/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.saidainteiorjoptionpane;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class SaidaInteiorJOptionPane {

    public static void main(String[] args) {

        try {
            SaidaInteiorJOptionPane et = new SaidaInteiorJOptionPane();

            double dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite um dividendo: "));
            double divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite um divisor: "));
          
            double resultado = et.dividir(divisor, dividendo);
           
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        

    }
  
    public double  dividir (double dividendo, double divisor)
            throws Exception {
        if (divisor == 0) {
            throw new JOptionPane.showMessageDialog((null), "Nao e permitido fazer uma divisao por zero!", "Resultado", JOptionPane.WARNING_MESSAGE);
        } else if (divisor > dividendo) {
            throw new JOptionPane.showMessageDialog((null), "Não é permitido dividir com divisor maior que dividendo", "Resultado", JOptionPane.WARNING_MESSAGE);
        }
             
          JOptionPane.showMessageDialog((null), "O resultado é: ", "Resultado", JOptionPane.INFORMATION_MESSAGE);  
    }

    }

