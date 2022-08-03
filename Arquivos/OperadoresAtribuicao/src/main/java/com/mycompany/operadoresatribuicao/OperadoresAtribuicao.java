/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operadoresatribuicao;

/**
 *
 * @author Aluno
 */
public class OperadoresAtribuicao {

    public static void main(String[] args) {
        System.out.println("===============================");
int umNumero = 5;
umNumero += 2;
System.out.println("Resultado da adição de 5 com 2: " + umNumero);
umNumero = 5; // Voltando o valor para 5.
umNumero -= 2;
System.out.println("Resultado da subtração de 5 pelo 2: "+ umNumero);

umNumero = 5; // Voltando o valor para 5.
umNumero *= 2;
System.out.println("Resultado da multiplicação de 5 pelo 2: "+ umNumero);

umNumero = 5; // Voltando o valor para 5.
umNumero /= 2;
System.out.println("Resultado da divisão de 5 pelo 2: "+ umNumero);

umNumero = 5; // Voltando o valor para 5.
umNumero %= 2;
System.out.println("Resto da divisão de 5 pelo 2: " + umNumero);
System.out.println("Fim!");
System.out.println("===============================");
    }
}
