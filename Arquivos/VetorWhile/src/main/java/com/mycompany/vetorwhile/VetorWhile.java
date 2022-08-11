/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vetorwhile;

/**
 *
 * @author Aluno
 */
public class VetorWhile {

    public static void main(String[] args) {
        
       int[] nInteiros = new int[]{1,2,3,4,5};
       int iteracao = 0;
       
       while(iteracao < 5){
           System.out.println(nInteiros[iteracao]);
           iteracao = iteracao + 1;       
       }
       
    }
}
