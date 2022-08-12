/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.whilefor5;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;
public class WhileFor5 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int [20];
        int[] par = new int [20];
        int[] impar = new int [20];
        int resto = 0;
        int i;
       
        for(i = 0; i<vetor.length ; i++ ){
        System.out.println("Digite um inteiro");
        vetor[i] = sc.nextInt(); 
        resto = vetor[i] % 2;
        
        if(resto==0){
            par[i] = vetor[i];
            
        }else {
            impar[i] = vetor[i];
        }}
    System.out.println("==============================");
    System.out.println("Os números pares são: ");
         for(i=0;i<par.length;i++){
             if(par[i]!= 0){
              System.out.println(par[i]);
              }
         }
         System.out.println("==============================");
    System.out.println("Os números ímpares são: ");
         for(i=0;i<impar.length;i++){
             if(impar[i]!= 0){
              System.out.println(impar[i]);
              }
         } 
         sc.close();
    }
}
    
  
         
         
        
        
        
        
        
 

