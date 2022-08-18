/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.registraaluno;

/**
 *
 * @author Aluno
 */

public class RegistraAluno {
   
   //declaração dos atributos do objeto 
   private String nome;
   private String endereco;
   private int idade;
   private double notaMatematica;
   private double notaPortugues;
   private double notaCiencias;
  
   //atributo da classe
   private static int contadorEstudante;

   //retorna o nome do estudante
   public String getNome(){
    return nome;
   }
   
   //retorna o endereço do estudante
   public String getEndereco(){
    return endereco;
   }
   
   //retorna a idade do estudante
   public int getIdade(){
    return idade;
   }
   
   //retorna a média do estudante
   public double getMedia(){
    double resultado = 0;
    resultado = (notaMatematica + notaPortugues + notaCiencias)/3;
    return resultado;
   }
   
   //contando
   public RegistraAluno(){
       contadorEstudante += 1;
   }
   
   // retorna a quantidade de estudantes cadastrados
   public static int getQuantidadeAlunos(){
       return contadorEstudante;
   }
   
   //define ou altera o nome do estudante
   public void setNome(String temp){
       nome = temp;
   }
   
   //define ou altera o endereço do estudante
   public void setEndereco(String temp){
       endereco = temp;
   }
   
   //define ou altera a idade do estudante
   public void setIdade(int temp){
       idade = temp;
   }
   
   //define ou altera a nota de matemática
   public void setNotaMatematica(double temp){
       notaMatematica = temp;
   }
   
   //define ou altera a nota de português
   public void setNotaPortugues(double temp){
       notaPortugues = temp;
   }
   
   //define ou altera a nota de ciências
   public void setCiencias(double temp){
       notaCiencias = temp;
   }

   

   
}
