/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.whilefor6;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;
import java.util.Random;

public class WhileFor6 {

    public static void main(String[] args) {
        
        Random random = new Random();
        double[] aluno1 = new double[4];
        double[] aluno2 = new double[4];
        double[] aluno3 = new double[4];
        double[] aluno4 = new double[4];
        double soma1=0;
        double soma2=0;
        double soma3=0;
        double soma4=0;
        
        
        int i;
        
        for(i=0; i<aluno1.length; i++){
        aluno1[i] = random.nextDouble(10)+4;
        soma1 += aluno1[i];
        }
        for(i = 0; i<aluno1.length ; i++ ){
        System.out.println(aluno1[i]);
        }
        
        for(i=0; i<aluno2.length; i++){
        aluno2[i] = random.nextDouble(10);
        soma2 += aluno2[i];
        }
        for(i = 0; i<aluno2.length ; i++ ){
        System.out.println(aluno2[i]);
        }
        
        
        for(i=0; i<aluno3.length; i++){
        aluno3[i] = random.nextDouble(10)+5;
        soma3 += aluno3[i];
        }
         for(i = 0; i<aluno3.length ; i++ ){
        System.out.println(aluno3[i]);
        }
        
        for(i=0; i<aluno4.length; i++){
        aluno4[i] = random.nextDouble(10);
        soma4 += aluno4[i];
        }
         for(i = 0; i<aluno4.length ; i++ ){
        System.out.println(aluno4[i]);
        }
        double media1 = soma1/4;
        double media2 = soma2/4;
        double media3 = soma3/4;
        double media4 = soma4/4;
         
         System.out.println("A média dos alunos é respectivamente: "+media1+","+media2+","+media3+","+media4);
        if(media1>=7){
        System.out.println("A média do aluno1 é: "+media1);
    }else {System.out.println("A média do aluno1 é menor que 7.0");
            }
      if(media2>=7){
        System.out.println("A média do aluno2 é: "+media2);
    }else {System.out.println("A média do aluno2 é menor que 7.0");
            }
     if(media3>=7){
        System.out.println("A média do aluno3 é: "+media3);
    }else {System.out.println("A média do aluno3 é menor que 7.0");
            }
     if(media4>=7){
        System.out.println("A média do aluno4 é: "+media4);
    }else {System.out.println("A média do aluno4 é menor que 7.0");
            }
        }
    }

