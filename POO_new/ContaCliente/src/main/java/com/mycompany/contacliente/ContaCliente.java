/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.contacliente;

/**
 *
 * @author Aluno
 */
public class ContaCliente {

    public static void main(String[] args) {
     
        AppContaCliente carlos = new AppContaCliente();
       
       carlos.setTitular("Carlos Antônio");
       carlos.setNumero(12345);
       carlos.setSaldo(1000);
       carlos.setDeposito(200);
       carlos.setDeposito(200);
       carlos.setSaque(500);
        carlos.setSaque(200);
        
        System.out.println("Titular: "+carlos.getTitular());
        System.out.println("Nº da conta: "+carlos.getNumero());
        System.out.println("Saldo: "+carlos.getSaldo());
        System.out.println(carlos.getDeposito());
         System.out.println(carlos.getSaque());
        
    }
}
