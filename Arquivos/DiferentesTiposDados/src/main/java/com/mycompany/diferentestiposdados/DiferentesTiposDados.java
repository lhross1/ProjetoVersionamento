/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.diferentestiposdados;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;
        
public class DiferentesTiposDados {

    public static void main(String[] args) {
        System.out.println("====================");
        Scanner scanner = new Scanner(System.in);
        //----------------------------------------
        System.out.println(" >>> Digite um texto: ");
        String texto = scanner.nextLine(); 
        System.out.println("O texto digitado foi " + texto);
        //---------------------------------------
          System.out.println(" >>> Digite um decimal: ");
        Double numerodecimal = scanner.nextDouble(); 
        System.out.println("O número decimal digitado foi " + numerodecimal);
        //---------------------------------------
           System.out.println(" >>> Digite um inteiro: ");
        int numeroInteiro = scanner.nextInt(); 
        System.out.println("O número inteiro digitado foi " + numeroInteiro);
        //---------------------------------------
            System.out.println(" >>> Digite um boolean (true ou false): ");
        boolean booleano = scanner.nextBoolean(); 
        System.out.println("O booleano digitado foi " + booleano);
        //---------------------------------------
       /* scanner.close();
        System.out.println("Fim!");
        System.out.println("=============================");*/
    }
}
