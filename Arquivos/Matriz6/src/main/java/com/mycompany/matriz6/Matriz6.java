/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.matriz6;

/**
 *
 * @author Aluno
 */
import java.util.Random;
public class Matriz6 {

    public static void main(String[] args) {
        
        Random random = new Random(10);
        
        double notas[][] = new double[10][4];
        
        int i,j;
        
        for(i=0;i<10;i++){

            for(j=0;j<4;j++){
           notas[i][j] = (double)(Math.random() * 9) + 1;
            }
        }
       
         System.out.println("Alunos X Notas");
        for (i = 0; i < 4; i++) {
            System.out.print("Notas do aluno "+1);

            for (j = 0; j < 4; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
       
    }
}
