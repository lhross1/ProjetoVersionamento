/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.matriz1;

/**
 *
 * @author Aluno
 */
public class Matriz1 {

    public static void main(String[] args) {
        
        int[][] matriz = new int[5][5];
        
        int i,j;
        
        for(i=0;i<5;i++){
            
            for(j=0;j<5;j++){
            
                if(i==j){
                
                    matriz[i][j] = 1;
                
                } else{
                 matriz[i][j] = 0;
                }
            }
            
        }
         for (i = 0; i < 5; i++) {
            System.out.print("linha " + i + ": ");

            for (j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        
       
    }
}
    
}
