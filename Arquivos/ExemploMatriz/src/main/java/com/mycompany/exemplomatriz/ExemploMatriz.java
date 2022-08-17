/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exemplomatriz;

/**
 *
 * @author Aluno
 */
public class ExemploMatriz {

    public static void main(String[] args) {

        //Declara uma matriz com 10 linhas e 10 colunas
        int[][] matriz = new int[10][10];
        int i, j;

        System.out.println("Sorteando números");
        //Preenche os 100 elementos da matriz com números de 1 a 9

        for (i = 0; i < 10; i++) { //Preenchendo os elementos das linas

            for (j = 0; j < 10; j++) { //Preenchendo os elementos das colunas

                matriz[i][j] = (int) (Math.random() * 9) + 1;
            }

        }

        System.out.println("Matriz preenchida");
        for (i = 0; i < 10; i++) { //Selecionando a linha para impressão            
            for (j = 0; j < 10; j++) { //Selecionando a coluna para impressão 

                System.out.println("Matriz[" + i + "][" + j + "]= " + matriz[i][j]);
            }

        }
        int teste = 0;

        for (i = 0; i < 10; i++) {
            System.out.print("linha " + i + ": ");

            for (j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int somaLinha = 0;

        for (j = 0; j < 10; j++) {
            somaLinha += matriz[5][j];
        }
        System.out.println("A soma da linha 5 é: " + somaLinha);

        somaLinha = 0;

        for (i = 0; i < 10; i++) {
            
            for (j = 0; j < 10; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("A soma da linha " + i + " é: " + somaLinha);
            somaLinha = 0;
        }

        int somaColuna = 0;
        
        for (i = 0; i < 10; i++) {
            somaColuna += matriz[i][3];
        }
        System.out.println("A soma da coluna 3 é: " + somaColuna);

        somaColuna = 0;
        
         for (j = 0; j < 10; j++) {
            
            for (i = 0; i < 10; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("A soma da coluna " + j + " é: " + somaColuna);
            somaColuna = 0;
        }
        
        
    }

}
