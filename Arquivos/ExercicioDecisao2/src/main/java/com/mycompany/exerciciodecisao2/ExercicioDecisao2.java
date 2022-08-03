/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerciciodecisao2;

/**
 *
 * @author Aluno
 */
import java.util.Scanner
public class ExercicioDecisao2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Digite seu ano de nascimento");
        int anoNascimento = scanner.nextInt();
        int idade = 2022 - anoNascimento; 
        if(idade>=16){
        System.out.println("Voce poderá votar");
        }
        else{
       System.out.println("Voce não poderá votar");
        }
      scanner.close();  
      
    }
}
