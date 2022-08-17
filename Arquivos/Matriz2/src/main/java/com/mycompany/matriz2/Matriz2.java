/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.matriz2;

/**
 *
 * @author Aluno
 */
public class Matriz2 {

    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        
        int i,j;
        
         int somaDiagonal = 0;
         int somaSuperior = 0;
         int somaInferior = 0;
        
        for (i = 0; i < 4; i++) { //Preenchendo os elementos das linas

            for (j = 0; j < 4; j++) { //Preenchendo os elementos das colunas

                matriz[i][j] = (int)(Math.random() * 9) + 1;
                
                if(i==j){
                somaDiagonal += matriz[i][j];
                }
                if(i<j){
                somaSuperior += matriz[i][j];
                }
                if(j<i){
                somaInferior += matriz[i][j];
                }
            }
        }
        
       
        
         System.out.println("Matriz");
        for (i = 0; i < 4; i++) {
            

            for (j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            
            System.out.println();
                 
        }
         
         
             System.out.println("Matriz transposta");
             
             for (j = 0; j < 4; j++) {
            

            for (i = 0; i < 4; i++) {
                System.out.print(matriz[i][j] + " ");
                
                
            }
            System.out.println();
             }
        
         System.out.println("A soma da diagonal principal é: "+somaDiagonal);
         System.out.println("A soma do triângulo superior é: "+somaSuperior);
         System.out.println("A soma do triângulo inferior é: "+somaInferior);
         
         
         
         
         
       
    }
}
    

