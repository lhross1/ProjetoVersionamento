/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.desafio;

/**
 *
 * @author Aluno
 */
import java.util.Scanner
public class Desafio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = sc.nextInt();
        if(numero != 0){
          numero %= 2;  
        }
        if(numero == 0){
         System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    sc.close();    
    }       
        }
   

