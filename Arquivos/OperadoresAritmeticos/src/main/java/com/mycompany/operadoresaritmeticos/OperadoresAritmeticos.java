/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operadoresaritmeticos;

/**
 *
 * @author Aluno
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
       System.out.println("===============================");
int adicao = 5 + 2;
System.out.println("Resultado da adição de 5 com 2: " + adicao);
int subtracao = 5 - 2;
System.out.println("Resultado da subtração de 5 pelo 2: " + subtracao);
int multiplicacao = 5 * 2;
System.out.println("Resultado da multiplicação de 5 pelo 2: " + multiplicacao);
double divisao = 5.0 / 2.0;
System.out.println("Resultado da divisão de 5 pelo 2: " + divisao);
double moduloOuResto = 5.0 % 2.0;
System.out.println("Resto da divisão de 5 pelo 2: " + moduloOuResto);

double potencia = Math.pow(2,3);
System.out.println("\nA potência de 2 elevado a 3 é:" + potencia);

System.out.println("\nFim!");
System.out.println("===============================");
    }
}
