/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.whilefor6_1;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;

public class WhileFor6_1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       System.out.println("Digite o número de alunos");
       int nAlunos = sc.nextInt();
        System.out.println("Digite a quantidade de notas");
         int nNotas = sc.nextInt();
       int i;
       double[] mediaAlunos = new double[nAlunos];
       double somaNotas = 0;
       double notaDigitada;
       for(i=0; i<nAlunos; i++){
           for(int j = 0;j<nNotas;j++){
               System.out.println("Digite a nota "+(j+1)+" do aluno "+(i+1));
               notaDigitada = sc.nextDouble();
               somaNotas += notaDigitada;
           }
           somaNotas/=nNotas;
           mediaAlunos[i]=somaNotas;
           somaNotas=0;
       }
        
       for(i=0;i<nAlunos;i++){
           if(mediaAlunos[i]>=7){
           System.out.println("A média do aluno "+(i+1)+"é "+mediaAlunos[i]);
           }
       
       } 
       
    }
}
