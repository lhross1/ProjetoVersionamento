/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.switch2;

/**
 *
 * @author Aluno
 */
import java.util.Scanner
public class Switch2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
                
                System.out.println("Digite um número de mês");
                int numeroMes = sc.nextInt();
                String mes;
                
                switch(numeroMes){
                        case 1: mes="janeiro";
                        break;
                        case 2: mes="fevereiro";
                        break;
                        case 3: mes="março";
                        break;
                        case 4: mes="abril";
                        break;
                        case 5: mes="maio";
                        break;
                        case 6: mes="junho";
                        break;
                        case 7: mes="julho";
                        break;
                        case 8: mes="agosto";
                        break;
                        case 9: mes="setembro";
                        break;
                        case 10: mes="outubro";
                        break;
                        case 11: mes="novembro";
                        break;
                        case 12: mes="dezembro";
                        break;
                        default: mes="Não existe mês com esse número";       
                }
                System.out.println(mes);
        
      
    }
}
