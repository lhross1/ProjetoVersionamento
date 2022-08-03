/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estruturadecisao;

import java.util.Scanner
/**
 *
 * @author Aluno
 */
public class EstruturaDecisao {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("Informe o preço do produto");
        double precoProduto = scanner.nextDouble();
        boolean produtoAltoValor = precoProduto>=100;
                double percentualDesconto = 0.0;
         //Se maior ou igual a 100 aplique desconto
        if(produtoAltoValor){
        percentualDesconto = 5.0;
        } 
        else {
        System.out.println("Nada de desconto parça");
        }
        double precoComDesconto = precoProduto*(1 - percentualDesconto/100);
        System.out.println("O produto sairá por: " +precoComDesconto);
    scanner.close();
    }
}
