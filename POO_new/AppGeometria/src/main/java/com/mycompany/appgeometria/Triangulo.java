/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appgeometria;

/**
 *
 * @author Aluno
 */
public class Triangulo {
    
private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

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
private double lado1;
private double lado2;


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
private double altura;

    public double getLado() {
        return base;
    }

    public void setLado(double base) {
        this.base = base;
    }
    
    public String getNomeFigura(){
    return "triângulo";
    }
    
    public double getArea(){
    double area = 0;
    area = (base * altura)/2;
    return area;
    }
    
    public double getPerimetro(){
    double perimetro = 0;
    perimetro = base+lado1+lado2;
    return perimetro;
    }
    
}
