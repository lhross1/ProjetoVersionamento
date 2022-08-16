/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.whilefor7;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;
public class WhileFor7 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int[] inteiros = new int[5];
        int i;
        int soma = 0;
        int multiplicacao = 1;
        
        for(i=0;i<inteiros.length;i++){
             System.out.println("Digite um inteiro:");
            inteiros[i] = sc.nextInt();
            soma += inteiros[i];
            multiplicacao *= inteiros[i];
        }
        System.out.println("Os números digitados foram:"); 
        for(i=0;i<inteiros.length;i++){
         System.out.println(inteiros[i]);
         }
        
        System.out.println("A soma é: "+soma);
         System.out.println("A resultado da multiplicação é: "+multiplicacao);
        
         sc.close();
    }
}
