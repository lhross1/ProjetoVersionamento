/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemplovetores;

/**
 *
 * @author Aluno
 */
import java.util.Scanner
public class ExemploVetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("===========================================");
        //Faça testes incluindo mais preços aqui no vetor e, depois, altere e imprima diferentes posições
        double[] precoProdutos = new double[]{150.0, 20.0, 10.0, 100.0};
        //O índice é 1, mas o produto é o segundo, pois os índices começam do 0
        double precoProduto = precoProdutos[1];
        //Vai imprimir 20.0 
        System.out.println("O preço do segundo produto é: "+precoProduto);
        // Alterando o valor da posição 2 (de índice 1).
        
        System.out.println("Defina qual produto terá seu preco alterado");
        int ajustePosicao = sc.nextInt();
        int posicao = ajustePosicao -1;
        if(posicao<=3){
        
        
        System.out.println("Defina o preco do produto");
        precoProdutos[posicao] = sc1.nextDouble();
        
        switch(posicao){
            case 0:  System.out.println("O primeiro produto teve seu preço alterado. Seu preco é: "+ precoProdutos[posicao]);
            break;
            case 1:  System.out.println("O segundo produto teve seu preço alterado. Seu preco é: "+ precoProdutos[posicao]);
            break;
            case 2:  System.out.println("O terceiro produto teve seu preço alterado."+ precoProdutos[posicao]);
            break;
            case 3:  System.out.println("O quarto produto teve seu preço alterado."+ precoProdutos[posicao]);
            break;
            default: System.out.println("TESTE.");        
        System.out.println("Fim!");
        System.out.println("===========================================");      
    }  
        }
        else{System.out.println("Esse produto não existe");}
        
    }
}
