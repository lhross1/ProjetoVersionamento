/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.desafiowhile;

/**
 *
 * @author Aluno
 */
public class DesafioWhile {

    public static void main(String[] args) {
        
       int numero = 0;
       int resto = 0;
      
        while (numero<100){
        numero++;
        resto = numero % 2;
        
                if(resto==0){
                   System.out.println(numero); 
                }
        }
                
  
     
    }
}
