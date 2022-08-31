/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplothrows;

/**
 *
 * @author Aluno
 */
public class Throws {
    
      public double dividir(double dividendo, double divisor)
                throws Exception {
            if (divisor == 0) {
                throw new Exception("Nao e permitido fazer uma divisao por zero!");
            }
            return dividendo / divisor;
    
    
}
