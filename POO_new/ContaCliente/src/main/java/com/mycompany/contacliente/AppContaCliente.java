/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contacliente;

/**
 *
 * @author Aluno
 */
public class AppContaCliente {
    
    private String titular;
    private int numero;
    private double saldo;
    
    private static double deposito;
    private static double saque;
    
    
    public String getTitular(){
        return titular;
    }
    public int getNumero(){
        return numero;
    }
    public void setTitular(String temp){
        titular = temp;
    }
    public double getSaldo(){
        return saldo;
    }
     public double getDeposito(){
        return deposito;
    }
      public double getSaque(){
        return saque;
    }
     public void setNumero(int temp){
        numero = temp;
    }
     public void setSaldo(double temp){
         saldo = temp;
    }
     
    public void setDeposito(double temp){
        deposito += temp;
    }
     public void setSaque(double temp){
        saque -= temp;
    }  
    
}
