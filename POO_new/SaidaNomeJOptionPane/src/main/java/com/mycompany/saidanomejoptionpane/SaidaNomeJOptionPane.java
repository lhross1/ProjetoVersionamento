/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.saidanomejoptionpane;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class SaidaNomeJOptionPane {

    public static void main(String[] args) {
       
        
        
        
        String nome = JOptionPane.showInputDialog("Digite o primeiro nome: ","Luis");
        String sobreNome =  JOptionPane.showInputDialog("Digite o sobrenome: ");
        String nomeCompleto = nome +" "+sobreNome;
        String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento: ");
        String idade = JOptionPane.showInputDialog("Digite a idade: ");
        JOptionPane.showMessageDialog((null), "Nome Completo: "+nomeCompleto+"\nData de Nascimento: "+dataNascimento+"\nIdade: "+idade ,"Informações",JOptionPane.INFORMATION_MESSAGE);
         
       JOptionPane.showConfirmDialog((null), "As informações estão corretas?");
       
    }
}
