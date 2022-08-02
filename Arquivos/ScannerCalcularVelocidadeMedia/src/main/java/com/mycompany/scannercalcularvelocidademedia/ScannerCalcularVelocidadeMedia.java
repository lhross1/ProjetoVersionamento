/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.scannercalcularvelocidademedia;

/**
 *
 * @author Aluno
 */
import java.util.Scanner

public class ScannerCalcularVelocidadeMedia {

    public static void main(String[] args) {
        System.out.println("=== CÁLCULO DA VELOCIDADE MÉDIA ==========");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a distância percorrida: ");
        double distanciaPercorrida = scanner.nextDouble();
        System.out.println("A distância percorrida foi de " + distanciaPercorrida + "Km.");
        
        System.out.println("Digite o tempo gasto: ");
        double tempoGasto = scanner.nextDouble();
        System.out.println("O tempo gasto foi de " + tempoGasto + " horas.");
        
        double velocidadeMedia = distanciaPercorrida / tempoGasto;
        System.out.println("A velocidade média é de " + velocidadeMedia + "Km/h");
        
        System.out.println("Digite o consumo do carro: ");
        double consumoCarro = scanner.nextDouble();
        System.out.println("O carro faz " + consumoCarro + " km/L.");
        
        System.out.println("Digite o custo do litro de gasolina: ");
        double custoLitro = scanner.nextDouble();
        System.out.println("O custo do litro do combustível é de R$" + custoLitro + " reais.");
        
        double custoTotal = (distanciaPercorrida / consumoCarro) * custoLitro;
        System.out.println("O custo total da viagem é de R$" +custoTotal+ " reais.");
        scanner.close();
        System.out.println("Fim!");
        System.out.println("=====================================================");
    }
}
