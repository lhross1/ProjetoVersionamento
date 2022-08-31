/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exemplothrows1;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;

public class ExemploThrows1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        try {
            ExemploThrows1 et = new ExemploThrows1();

            System.out.print("Digite o valor do dividendo: ");
            double dividendo = s.nextDouble();

            System.out.print("Digite o valor do divisor: ");
            double divisor = s.nextDouble();

            double resultado = et.dividir(dividendo, divisor);
            System.out.println("O resultado da divisao eh: "+ resultado);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }

    public double dividir(double dividendo, double divisor)
            throws Exception {
        if (divisor == 0) {
            throw new Exception("Nao e permitido fazer uma divisao por zero!");
        } else if(divisor>dividendo){
        throw new Exception("Não é permitido dividir com divisor maior que dividendo");
        }
        return dividendo / divisor;
    }
}
