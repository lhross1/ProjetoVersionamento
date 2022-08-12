/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lacofor3;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;
public class LacoFor3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double[] nota = new double [4];
        double soma = 0;
       
        for(int i=0;i<4;i++){
        System.out.println("Digite uma nota");
        nota[i] = sc.nextDouble();
        soma += nota[i];
        }
        
        System.out.println("A média é: "+soma/4);
    }
}
