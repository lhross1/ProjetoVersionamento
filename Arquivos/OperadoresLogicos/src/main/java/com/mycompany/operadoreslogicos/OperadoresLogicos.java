/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operadoreslogicos;

import java.util.Scanner
        
public class OperadoresLogicos {

    public static void main(String[] args) {
        System.out.println("===============================");
// Faça testes alterando o valor das quatro variáveis abaixo.
// Lembrando, elas podem ser true ou false.
Scanner scanner = new Scanner(System.in);
System.out.println("O usuário é Vip?" );
boolean usuarioVIP = scanner.nextBoolean();
System.out.println("O usuário compra com valor alto?");
boolean compraComValorAlto = scanner.nextBoolean();
System.out.println("Qual a idade do usuário?");
int idadeusuario = scanner.nextInt();
boolean menorDeIdade = idadeusuario<18;
System.out.println("O usuário é menor de idade? " +menorDeIdade);

System.out.println("O usuário tem produto alcóolico no carrinho?");
boolean temProdutoAlcoolicoNoCarrinho = scanner.nextBoolean();

System.out.println("Usuário é VIP? " + usuarioVIP);
System.out.println("A compra tem um valor alto? " + compraComValorAlto);
System.out.println("É menor de idade? " + menorDeIdade);
System.out.println("Tem produto alcoólico no carrinho? " + temProdutoAlcoolicoNoCarrinho);
System.out.println("===============================");
boolean aplicarDesconto = usuarioVIP && compraComValorAlto;
System.out.println("O desconto deve ser aplicado? "
+ "(usuarioVIP && compraComValorAlto): "
+ aplicarDesconto);
aplicarDesconto = usuarioVIP || compraComValorAlto;
System.out.println("O desconto deve ser aplicado? "
+ "(usuarioVIP || compraComValorAlto): "
+ aplicarDesconto);
// Leia assim: "se não for menor de idade ou se
// não tiver produto alcoólico".
boolean permiteConcluirCompra = !menorDeIdade || !temProdutoAlcoolicoNoCarrinho;
System.out.println("Pode concluir compra? "
+ "(!menorDeIdade || !temProdutoAlcoolicoNoCarrinho): "
+ permiteConcluirCompra);
System.out.println("Fim!");
System.out.println("===============================");
    }
}
