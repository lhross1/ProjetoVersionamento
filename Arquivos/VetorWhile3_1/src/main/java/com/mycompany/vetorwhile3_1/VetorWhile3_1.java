/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vetorwhile3_1;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;
public class VetorWhile3_1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
     
        System.out.println("Digite quantas notas serão:");
        int nNotas = sc.nextInt();
        double[] notas = new double [nNotas]; 
        int i = 0;
        
        while(i<nNotas){
         System.out.println("Digite a nota:");
         notas[i] = sc.nextDouble();
         i++;
        }
        
        i=0;
        
         System.out.println("=================================");      
        while(i<nNotas){
        System.out.println("A "+(i+1)+"ª nota é: "+notas[i]);
        i++;
                }
        
        i=0;
        
        double total = 0.0;
        
        System.out.println("====================================");
        
        while(i<nNotas){
        total += notas[i];
        i++;
        }
        
        System.out.println("A média é: "+total/nNotas);
        
    }
}
