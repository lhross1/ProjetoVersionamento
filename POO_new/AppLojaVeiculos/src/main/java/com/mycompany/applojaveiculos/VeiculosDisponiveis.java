/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.applojaveiculos;

/**
 *
 * @author Aluno
 */
public class VeiculosDisponiveis {
    
   private String marca; 
   private String modelo;
   private int ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
   
    public VeiculosDisponiveis() {
        
    }
    
   public VeiculosDisponiveis(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
   public VeiculosDisponiveis(String modelo, int ano) {
        this.marca = "Fiat";
        this.modelo = modelo;
        this.ano = ano;
    }
    public VeiculosDisponiveis( int ano) {
        this.marca = "Chevrolet";
        this.modelo = "Corsa";
        this.ano = ano;
    }
   
   
   
   }
    

