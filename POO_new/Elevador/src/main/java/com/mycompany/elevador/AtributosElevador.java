/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elevador;

/**
 *
 * @author Aluno
 */
public class AtributosElevador {
    
    private int andar;
    private int totalAndares;
    private int capacidadePessoas;
    private int qtdPessoas;

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

   
    public void Inicializa(int andar, int qtdPessoas){
     this.andar = 0;
        this.qtdPessoas = 0;
    }
     
    public void Entra (){
    if(qtdPessoas < capacidadePessoas){
       qtdPessoas++;
       System.out.println("Quantidade pessoas: "+qtdPessoas);
    } else {System.out.println("Elevador lotado");}
    }
    
    public void Sai (){
    if(qtdPessoas > 0){
     this.qtdPessoas--;
     System.out.println("Quantidade pessoas: "+qtdPessoas);
    } else {System.out.println("Elevador vazio");}
    }
    
    public void Sobe (){
    if(andar<totalAndares){
    this.andar++;
    System.out.println("Está no andar: "+andar);
    }else{System.out.println("Já está no último andar");}
    }
    
    public void Desce (){
    if(andar>0){
    this.andar--;
    System.out.println("Está no andar: "+andar);
    }else{System.out.println("Já está no térreo");}
    }

    public AtributosElevador(int totalAndares, int capacidadePessoas) {
        this.totalAndares = totalAndares;
        this.capacidadePessoas = capacidadePessoas;
    }
 
    
    
    
}
