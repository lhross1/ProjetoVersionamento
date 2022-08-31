/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;

public class ArmazenaPessoa {
    
   private String nome;
   private int idade;
   private float altura;
   private int id;
   private int index;
   
   public static int contador;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public ArmazenaPessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public ArmazenaPessoa() {
        this.id = 1 + contador;
        contador++;
    }
   
    public int buscaPessoa(String nome){
        
        return index;     
             }
    
    public void imprimeAgenda(){   
    System.out.println(getNome());
    System.out.println(getIdade());
    System.out.println(getAltura());
    
    }
    
    public void imprimePessoa(){
    System.out.println(getNome());
    System.out.println(getIdade());
    System.out.println(getAltura());
    
   
    }

  
    

}
