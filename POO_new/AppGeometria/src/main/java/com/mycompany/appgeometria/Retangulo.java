/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appgeometria;

/**
 *
 * @author Aluno
 */
public class Retangulo {
    
    private double lado1;
    private double lado2;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    public String getNomeFigura(){
    return "retângulo";
    }
    
    public double getArea(){
    double area = 0;
    area = lado1 * lado2;
    return area;
    }
    
    public double getPerimetro(){
    double perimetro = 0;
    perimetro = 2*(lado1+lado2);
    return perimetro;
    }
    
    
    
}
