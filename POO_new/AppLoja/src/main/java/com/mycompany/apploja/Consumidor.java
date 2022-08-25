/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apploja;

/**
 *
 * @author Aluno
 */
public class Consumidor {
    
    // primeiro 1000, segundo 1001
    private int id ;
    private String nome;
    
    public static int contador;  
     
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
  
    public Consumidor(String nome) {
        this.id = 1000 + contador;
        this.nome = nome;
        contador++;
    }    
}
