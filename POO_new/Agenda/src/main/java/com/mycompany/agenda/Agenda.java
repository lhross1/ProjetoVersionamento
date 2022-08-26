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

//C
        System.out.println("Imprimir a agenda inteira");
         for (int i = 0; i < 2; i++) {
         System.out.println("Registro "+i);
             a[i].imprimeAgenda();    
         }
        
        
//D      
         System.out.println("Digite um id para imprimir");
        
         
         
         /*for(int i=0; i< 1; i++){
           i = sc.nextInt();
             a[i].imprimePessoa();
         }*/
       
         
         
        /*
        for (int i = 0; i < 2; i++) {
            a[i].buscaPessoa = sc.next();
            if (a[i].buscaPessoa == a[i].getNome) {
                System.out.println("A posição é: " + i);
            }
        }*/
    }
}
