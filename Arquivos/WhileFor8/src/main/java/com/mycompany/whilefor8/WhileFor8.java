/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.whilefor8;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;
public class WhileFor8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] idade = new int[5];
        double[] altura = new double[5];
        int i;
        
        for(i=0;i<5;i++){
        System.out.println("Digite a idade do aluno "+(i+1));
        idade[i] = sc.nextInt();
        }
        
         for(i=0;i<5;i++){
         System.out.println("Digite a altura do aluno "+(i+1));
        altura[i] = sc.nextDouble(); 
         }
      
         for(i=4;i>=0;i--){
      System.out.println("A idade do aluno "+(i+1)+" é: "+idade[i]);
       System.out.println("A altura do aluno "+(i+1)+" é: "+altura[i]);
      }
        sc.close(); 
      }
    }

