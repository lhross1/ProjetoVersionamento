/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calcularvelocidademedia;

/**
 *
 * @author Aluno
 */
public class CalcularVelocidadeMedia {

    public static void main(String[] args) {
        System.out.println("=== CÁLCULO DA VELOCIDADE MÉDIA ==========");
        double distanciaPercorrida = 150;
        System.out.println("A distância percorrida foi de " + distanciaPercorrida + "Km.");
        double tempoGasto = 1.5;
        System.out.println("O tempo gasto foi de " + tempoGasto + " horas.");
        double velocidadeMedia = distanciaPercorrida / tempoGasto;
        System.out.println("Para encontrar a velocidade média " + "dividimos a distância (" + distanciaPercorrida + ") pelo tempo gasto no " + "percurso (" + tempoGasto + ").");
        System.out.println("A velocidade média é de " + velocidadeMedia + "Km/h");
        double consumoLitro = 10;
        System.out.println("O carro faz " + consumoLitro + " km/L.");
        double custoLitro = 7;
        System.out.println("O custo do litro do combustível é R$" + custoLitro + " reais.");
        double custoTotal = (distanciaPercorrida/consumoLitro)*custoLitro;
        System.out.println("O custo total da viagem é de R$" +custoTotal+ " reais");
    }
}
