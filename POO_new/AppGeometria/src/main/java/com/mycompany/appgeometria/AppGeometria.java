/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.appgeometria;

/**
 *
 * @author Aluno
 */
public class AppGeometria {

    public static void main(String[] args) {
        
       Quadrado a = new Quadrado();
       
       a.setLado(5);
        
       System.out.println("O objeto 1 é um "+a.getNomeFigura());
        
       System.out.println("O perímetro do "+a.getNomeFigura()+" é "+a.getPerimetro());
       
      
       System.out.println("A área do "+a.getNomeFigura()+" é "+a.getArea());  

       Triangulo b = new Triangulo();
       
       b.setBase(5);
       b.setLado1(4);
       b.setLado2(3);
       b.setAltura(5);
       
       System.out.println();
       
       System.out.println("O objeto 2 é um "+b.getNomeFigura());
        
       System.out.println("O perímetro do "+b.getNomeFigura()+" é "+b.getPerimetro());
      
       System.out.println("A área do "+b.getNomeFigura()+" é "+b.getArea());
       
       Retangulo c = new Retangulo();
       
      
       c.setLado1(4);
       c.setLado2(3);
      
       
       System.out.println();
       
       System.out.println("O objeto 3 é um "+c.getNomeFigura());
        
       System.out.println("O perímetro do "+c.getNomeFigura()+" é "+c.getPerimetro());
      
       System.out.println("A área do "+c.getNomeFigura()+" é "+c.getArea());
      

       
    }
}
