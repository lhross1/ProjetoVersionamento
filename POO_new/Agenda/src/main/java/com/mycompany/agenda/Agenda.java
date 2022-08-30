/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.agenda;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArmazenaPessoa a[] = new ArmazenaPessoa[2];
// A
        for (int i = 0; i < 2; i++) {
            a[i] = new ArmazenaPessoa();
            System.out.println("================================");
            System.out.println("Digite um nome");
            a[i].setNome(sc.next());
            System.out.println("Digite a idade do(a) " + a[i].getNome());
            a[i].setIdade(sc.nextInt());
            System.out.println("Digite a altura do(a) " + a[i].getNome());
            a[i].setAltura(sc.nextFloat());
            System.out.println("O id do " + a[i].getNome() + " é " + a[i].getId());
        }

         System.out.println();
        
//C
        System.out.println("Imprimir a agenda inteira");
         for (int i = 0; i < 2; i++) {
         System.out.println("Registro "+(i+1));
             a[i].imprimeAgenda();    
         }
        
         System.out.println();
        
//B
        System.out.println("Digite um nome para descobrir a posição");
        String c = sc.next(); 
        for(int i=0; i<2 ; i++){
        if(a[i].getNome().equals(c)){
        System.out.println("A posição é: "+(i+1));
        }
        }
       
       
         
//D
     System.out.println();
        System.out.println("Digite um id para imprimir os dados");
         a[sc.nextInt()-1].imprimePessoa();
  
         
         
    }
}
