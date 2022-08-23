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
    private int nConta;
    private double saldo;

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getnConta() {
        return nConta;
    }
    public void setnConta(int nConta) {
        this.nConta = nConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setSacar(double valor){
        if(valor>this.saldo){
        System.out.println("Operação não realizada. Saldo indisponível"); 
        }else{this.saldo -= valor;
        }  
         System.out.println("Operação realizada. Saldo disponível: "+saldo);
    }
     public void setDepositar(double valor){
        this.saldo += valor;
    }
    
}
    
   