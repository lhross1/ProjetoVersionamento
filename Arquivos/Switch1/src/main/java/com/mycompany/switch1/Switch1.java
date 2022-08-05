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
         letra = letra.toLowerCase();
         
      switch(letra){
            case "a":letra = "Vogal";
            break;
            case "e":letra = "Vogal";
            break;
            case "i":letra = "Vogal";
            break;
            case "o":letra = "Vogal";
            break;
            case "u":letra = "Vogal";
            break;
            default: letra = "Consoante";
            }
            System.out.println("A letra é uma " + letra);
            sc.close();
    }
}
