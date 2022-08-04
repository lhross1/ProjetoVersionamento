/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerciciodecisao4;

/**
 *
 * @author Aluno
 */
import java.util.Scanner
public class ExercicioDecisao4 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double custoMaca;  
       double custoTotal;
               System.out.println("Digite a quantidade de maçãs compradas");
       int quantidade = scanner.nextInt();
       if (quantidade<12){
       custoMaca = 0.30;
       custoTotal = custoMaca*quantidade;
       }
       else{
       custoMaca = 0.25;
       custoTotal = custoMaca*quantidade;
       }
        System.out.println("Valor total da compra: "+custoTotal+ " R$");
    }
}
