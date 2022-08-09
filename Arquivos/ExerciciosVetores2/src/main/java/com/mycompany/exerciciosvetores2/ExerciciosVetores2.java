/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerciciosvetores2;

/**
 *
 * @author Aluno
 */
import java.util.Scanner
public class ExerciciosVetores2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double [4]; 
        System.out.println("Digite a primeira nota:");
        notas[0] = sc.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        notas[1] = sc.nextDouble();
        
        System.out.println("Digite a terceira nota:");
        notas[2] = sc.nextDouble();
        
        System.out.println("Digite a quarta nota:");
        notas[3] = sc.nextDouble();
        
        System.out.println("As notas digitadas foram: "+notas[0]+", "+notas[1]+", "+notas[2]+" e "+notas[3]);
        double media = (notas[0]+notas[1]+notas[2]+notas[3])/4;
       
        System.out.println("A média das notas é: "+media);
       
       
    }
}
