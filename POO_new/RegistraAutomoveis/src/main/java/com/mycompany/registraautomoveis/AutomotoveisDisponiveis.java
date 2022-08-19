/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registraautomoveis;

/**
 *
 * @author Aluno
 */
public class AutomotoveisDisponiveis {
    
    //Atri9butos
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String combustivel;
    private double valor;
    
    //atributo da classe
    private static int contadorCarros;
    
    
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAno(){
        return ano;
    }
    public String getCor(){
        return cor;
    }
    public String getCombustivel(){
        return combustivel;
    }
    public double getValor(){
        return valor;
    }
    public AutomotoveisDisponiveis(){
        contadorCarros += 1;
    }
    public static int getQuantidadeAutomoveis(){
        return contadorCarros; 
    }    
    public void setMarca(String temp){
        marca = temp;
    }
    public void setModelo(String temp){
        modelo = temp;
    }
     public void setAno(int temp){
        ano = temp;
    }
    public void setCor(String temp){
        cor = temp;
    }
    public void setCombustivel(String temp){
        combustivel = temp;
    }
      public void setValor(double temp){
        valor = temp;
    }
    
}
