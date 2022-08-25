/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apploja;

/**
 *
 * @author Aluno
 */
public class AppLoja {

    public static void main(String[] args) {
       
        Consumidor a = new Consumidor("Luis");
        System.out.println(a.getId()); 
        System.out.println(a.getNome());
        
        Consumidor b = new Consumidor("Andreia");
        System.out.println(b.getId()); 
        System.out.println(b.getNome());
        
        Consumidor c = new Consumidor("Lucas");
        System.out.println(c.getId()); 
        System.out.println(c.getNome());
        
    }
}
