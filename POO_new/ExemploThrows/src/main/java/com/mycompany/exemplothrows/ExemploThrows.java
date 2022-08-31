/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exemplothrows;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;

public class ExemploThrows {

    public static void main(String[] args) {

    

    public class ExemploThrows {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            try {
                ExemploThrows et = new ExemploThrows();
                System.out.print("Digite o valor do dividendo: ");
                double dividendo = s.nextDouble();
                System.out.print("Digite o valor do divisor: ");
                double divisor = s.nextDouble();
                double resultado = et.dividir(dividendo, divisor);
                System.out.println("O resultado da divisao eh: "
                        + resultado);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
}
