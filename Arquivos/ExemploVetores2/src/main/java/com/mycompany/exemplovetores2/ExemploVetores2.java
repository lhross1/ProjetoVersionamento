/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemplovetores2;

/**
 *
 * @author Aluno
 */
public class ExemploVetores2 {

    public static void main(String[] args) {
        double [] tickets = new double []{100.0, 200.0};
        int pista = 0;
        int vip = 1;
        System.out.println("===================================");
        System.out.println("Preço Ingressos do 1º lote:");
        System.out.println("Pista: "+tickets[pista]);
        System.out.println("VIP: "+tickets[vip]);
        System.out.println("===================================");
        tickets[pista] = 150.0;
        tickets[vip] = 300.0;
        System.out.println("===================================");
        System.out.println("Preço Ingressos do 2º lote:");
        System.out.println("Pista: "+tickets[pista]);
        System.out.println("VIP: "+tickets[vip]);
        System.out.println("===================================");
    }
}
