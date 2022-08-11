/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vetorwhile3;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;
import java.util.Random;

public class VetorWhile3 {

    public static void main(String[] args) {
      
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        int[] nInteiros = new int[5];
        int i = 0;
        
        while(i<5){
                   nInteiros[i] = random.nextInt(10);
                   i += 1;
        }
        i = 0;
        System.out.println("===========================================");
        while(i<5){
        System.out.println(nInteiros[i]);
        i++;
        }
        
    }
}
