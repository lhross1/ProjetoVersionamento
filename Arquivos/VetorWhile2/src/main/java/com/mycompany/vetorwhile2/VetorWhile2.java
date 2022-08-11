/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vetorwhile2;

/**
 *
 * @author Aluno
 */

import java.util.Scanner;

public class VetorWhile2 {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        float[] nReal = new float[10];
        int i = 0;
        
        while(i<10){
                   System.out.println("Digite um valor para a posicao");
                   nReal[i] = sc.nextInt();
                   i += 1;
        }
        System.out.println("===========================================");
        
        while(i>0){
          i--;
        System.out.println(nReal[i]);

        }
        
    }
}
