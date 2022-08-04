/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerciciodecisao3;

/**
 *
 * @author Aluno
 */
import java.util.Scanner
public class ExercicioDecisao3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a senha:");
        int senha = scanner.nextInt();
        if(senha==1234){
            System.out.println("ACESSO PERMITIDO");
        }
        else{
            System.out.println("ACESSO NEGADO");
        }
        
    }
}
