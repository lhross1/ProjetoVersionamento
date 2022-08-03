/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerciciodecisao;


import java.util.Scanner
/**
 *
 * @author Aluno
 */
public class ExercicioDecisao {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
                System.out.println("Digite o valor 1");
                double valor1 = scanner.nextDouble();
                System.out.println("Digite o valor 2");
                double valor2 = scanner.nextDouble();
        
                if(valor1>valor2){
                System.out.println("O maior valor é o valor1");
                }
                else{
                System.out.println("O maior valor é o valor2");
                }
         scanner.close();           
        
    }
}
