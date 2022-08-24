/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appgeometria;

/**
 *
 * @author Aluno
 */
public class Quadrado implements FiguraGeometrica {
    
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public String getNomeFigura(){
    return "quadrado";
    }
    
    public double getArea(){
    double area = 0;
    area = lado * lado;
    return area;
    }
    
    public double getPerimetro(){
    double perimetro = 0;
    perimetro = lado*4;
    return perimetro;
    }
    
 
}
