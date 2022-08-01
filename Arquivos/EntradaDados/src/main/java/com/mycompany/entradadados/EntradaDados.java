/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.entradadados;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args) {
        System.out.println("==================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma distância: ");
        double distanciaPercorrida = sc.nextDouble();
        System.out.println("A distância digitada foi " + distanciaPercorrida + " Km.");
        sc.close();
        System.out.println("Fim!");
        System.out.println("===================");
    }
}
