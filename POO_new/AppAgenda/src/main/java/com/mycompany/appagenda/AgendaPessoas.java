/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appagenda;

/**
 *
 * @author Aluno
 */
import java.util.Date;

public class AgendaPessoas {
    
    private String nome;
    private int ano;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void getDadosImpressao(){
      System.out.println(); 
    }

    public AgendaPessoas(String nome, int dataNascimento, double altura) {
        this.nome = nome;
        this.ano = dataNascimento;
        this.altura = altura;
    }
    
   public int getIdade(){
       int idade ;
      return idade = 2022 - ano;
       
   } 
        
    
}
