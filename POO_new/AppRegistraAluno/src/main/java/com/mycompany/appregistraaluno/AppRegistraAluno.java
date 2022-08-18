/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.appregistraaluno;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;

public class AppRegistraAluno {

    public static void main(String[] args) {
       
Scanner sc = new Scanner(System.in);        

//criar 3 objetos RegistraAluno
   RegistraAluno ana = new RegistraAluno();
   RegistraAluno beto = new RegistraAluno();
   RegistraAluno carlos = new RegistraAluno();
   
   
   String[] aluno = new String[3];
   
   int i;
   for(i=0; i<3; i++){
    aluno[i] = sc.nextLine();
   }
   
   for(i=0; i<3; i++){
   RegistraAluno aluno[i]= new RegistraAluno;
   }
   
   
   ana.setNome(sc.nextLine());
   beto.setNome("Roberto da Silva");
   carlos.setNome("Carlos Alberto");
   
   ana.setEndereco("Rua do Fim");
   ana.setIdade(24);
   ana.setNotaMatematica(9.5);
   ana.setNotaPortugues(8.0);
   ana.setNotaCiencias(7.0);
   
       System.out.println(ana.getNome());
         System.out.println(ana.getEndereco());
          System.out.println(ana.getIdade());
           System.out.println(ana.getMedia());
           
           
           
       System.out.println("Contador: "+RegistraAluno.getQuantidadeAlunos());
        
    }
}
