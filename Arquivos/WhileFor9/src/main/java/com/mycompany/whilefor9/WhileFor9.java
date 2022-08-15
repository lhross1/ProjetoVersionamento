/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.whilefor9;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;
public class WhileFor9 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int[] inteiros = new int[10];
        int i;
        int somaQuadrados =0;
        
        for(i=0;i<10;i++){
              System.out.println("Digite um inteiro:");
            inteiros[i] = sc.nextInt();
            somaQuadrados += Math.pow(inteiros[i],2);
        }
        
        System.out.println("A soma dos quadrados dos inteiros digitados é: "+somaQuadrados);
    }
}
