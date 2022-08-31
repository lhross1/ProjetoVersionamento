/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemploruntimeexception;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;

public class ExemploRuntimeException {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro..: ");
       
        try{
        int numero = sc.nextInt();
           System.out.println("Numero lido: " + numero);
        }
        catch (RuntimeException e){
         System.out.println("Não foi inserido um número");
        }
         finally{
             System.out.println("Vou imprimir mesmo com erro");    
                 }
                
        }
     
        
        
        
    }

