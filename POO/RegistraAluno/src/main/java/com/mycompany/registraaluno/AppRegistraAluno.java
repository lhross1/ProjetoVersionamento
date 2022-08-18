/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registraaluno;

/**
 *
 * @author Aluno
 */
public class AppRegistraAluno {
    
   public static void main(String[] args){
   //criar 3 objetos RegistraAluno
   RegistraAluno ana = new RegistraAluno();
   RegistraAluno beto = new RegistraAluno();
   RegistraAluno carlos = new RegistraAluno();
   
   ana.setNome("Ana Machado");
   beto.setNome("Roberto da Silva");
   carlos.setNome("Carlos Alberto");
   
       System.out.println(ana.getNome());
       System.out.println("Contador: "+RegistraAluno.getQuantidadeAlunos());
      
   }
 
}
