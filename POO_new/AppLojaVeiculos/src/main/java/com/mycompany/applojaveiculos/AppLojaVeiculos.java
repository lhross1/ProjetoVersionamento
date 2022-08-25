/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.applojaveiculos;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;

public class AppLojaVeiculos {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        VeiculosDisponiveis a = new VeiculosDisponiveis("Rolls Royce", "Phantom", 2022);
        System.out.println("A marca do carro é: "+a.getMarca()); 
        System.out.println("O modelo do carro é: "+a.getModelo()); 
        System.out.println("O ano do carro é: "+a.getAno()); 
        
        System.out.println(); 
        
        VeiculosDisponiveis b = new VeiculosDisponiveis("Palio", 2015);
        System.out.println("A marca do carro é: "+b.getMarca()); 
        System.out.println("O modelo do carro é: "+b.getModelo()); 
        System.out.println("O ano do carro é: "+b.getAno()); 
        
        System.out.println(); 
        
        VeiculosDisponiveis c = new VeiculosDisponiveis(2010);
        System.out.println("A marca do carro é: "+c.getMarca()); 
        System.out.println("O modelo do carro é: "+c.getModelo()); 
        System.out.println("O ano do carro é: "+c.getAno()); 
        
     VeiculosDisponiveis d[] = new VeiculosDisponiveis[2];
    
     for(int i=0; i<2 ; i++){
     d[i] = new VeiculosDisponiveis();
     System.out.println("================================"); 
     System.out.println("Informe a marca do carro");
     d[i].setMarca(sc.next());
     System.out.println("Informe o modelo do carro");
     d[i].setModelo(sc.next());  
     System.out.println("Informe o ano do carro");
     d[i].setAno(sc.nextInt());  
      
     }
     
     for(int i=0; i<2 ; i++){
     System.out.println(d[i].getMarca());
     System.out.println(d[i].getModelo());
     System.out.println(d[i].getAno());
     }
    
     
    }
}
