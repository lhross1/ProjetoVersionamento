/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.switch1;

/**
 *
 * @author Aluno
 */
import java.util.Scanner
public class Switch1 {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
         System.out.println("Digite uma letra");
         String letra = sc.nextLine();
         String letraMinuscula = letra.toLowerCase();
         
      switch(letraMinuscula){
            case "a":letraMinuscula = "Vogal";
            break;
            case "e":letraMinuscula = "Vogal";
            break;
            case "i":letraMinuscula = "Vogal";
            break;
            case "o":letraMinuscula = "Vogal";
            break;
            case "u":letraMinuscula = "Vogal";
            break;
            default: letraMinuscula = "Consoante";
            }
            System.out.println("A letra é uma " + letraMinuscula);
            sc.close();
    }
}
