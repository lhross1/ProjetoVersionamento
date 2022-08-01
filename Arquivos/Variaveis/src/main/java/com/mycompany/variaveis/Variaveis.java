/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.variaveis;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Variaveis {

    public static void main(String[] args) {
        System.out.println("============================================");
        //Altere o valor da variável abaixo para realizar testes
        double precoProduto = 150.0;
        System.out.println("O preço do produto é de " + precoProduto + "reais");
        double percentualDesconto = 10.0;
        System.out.println("O desconto será de " + percentualDesconto + "%." );
        // Regra de três para descobrir qual o valor do desconto.
        double desconto = precoProduto * percentualDesconto / 100;
        //Preço do produto menos o desconto para sabermos o valor do produto com
        // o desconto que foi calculado na linha anterior.
        double precoComDesconto = precoProduto - desconto;
        System.out.println("Com desconto, o produto sai por R$" + precoComDesconto + ".");
        System.out.println("fim!");
        System.out.println("============================================");
    }
}
