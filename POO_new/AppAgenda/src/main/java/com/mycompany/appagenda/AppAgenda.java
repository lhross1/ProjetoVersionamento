/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.appagenda;

/**
 *
 * @author Aluno
 */
public class AppAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       AgendaPessoas a = new AgendaPessoas("Luis Henrique", 1989, 1.77);
       System.out.println(a.getNome());
       System.out.println(a.getIdade());
       System.out.println(a.getAltura());
        
    }
    
}
