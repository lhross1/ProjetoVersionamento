/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vetorwhile4;

/**
 *
 * @author Aluno
 */
import java.util.Scanner
public class VetorWhile4 {

    public static void main(String[] args) {
        
        String[] vetor = new String[10];
        Scanner sc = new Scanner(System.in);
       
        int quantidade = 0;
        String[] consoante = new String[10];
                
        for (int i = 0; i<10; i++){
            System.out.println("Digite uma letra");
            vetor[i] = sc.nextLine();
            switch(vetor[i]){
                case "a": /*System.out.println("vogal")*/;
                   // break;
                case "e": /*System.out.println("vogal")*/;
                  //  break;
                case "i": /*System.out.println("vogal")*/;
                 //   break;
                case "o": /*System.out.println("vogal")*/;
                  //  break;
                case "u": /*System.out.println("vogal")*/;
                    break;
                default:
                    quantidade++;
                    System.out.println("consoante");
                    consoante[i] = vetor[i];
            }  
        } 
         System.out.println("==============================");
         for(int a=0;a<10;a++){
             if(consoante[a]!= null){
              System.out.println(consoante[a]);
              }
         }
        System.out.println("O total de consoantes foi: "+quantidade);          
        }   
}
