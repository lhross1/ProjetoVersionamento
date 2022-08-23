/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.contacliente;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;
public class ContaCliente {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        
        AppContaCliente carlos = new AppContaCliente();
        ContaPessoaFisica ana = new ContaPessoaFisica();
        ContaPessoaJuridica neymarautocenter = new ContaPessoaJuridica();
        
        ana.setCpf("123.145.189-96");
        ana.setTitular("Ana Medeiros");
        
        neymarautocenter.setCnpj("81.488.072/0001-21");
        
        carlos.setTitular("Carlos Alberto");
        carlos.setnConta(12345);
        carlos.setSaldo(1000);
        carlos.setSacar(500);
       
      
        System.out.println("Titular: "+ carlos.getTitular());
        System.out.println("Nº da conta: "+ carlos.getnConta());
        System.out.println("Saldo Final: "+ carlos.getSaldo());
          
    }

    }


