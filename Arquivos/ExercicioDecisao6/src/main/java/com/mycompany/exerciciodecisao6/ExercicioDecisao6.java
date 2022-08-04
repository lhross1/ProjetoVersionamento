/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerciciodecisao6;

/**
 *
 * @author Aluno
 */
import java.util.Scanner
public class ExercicioDecisao6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double pesoIdeal;
       System.out.println("Digite o sexo:");
        int sexo = sc.nextInt();
        if(sexo==1){
           System.out.println("1:masculino"); 
        }else if(sexo==2){
            System.out.println("2:femino"); 
        }else{
            System.out.println("sexo indefinido"); 
        }
        System.out.println("Digite a altura:");
       double altura = sc.nextDouble();
       if(sexo==1){
       pesoIdeal = (altura*72.7)-58;
        System.out.println("Masculino: peso ideal é: "+ pesoIdeal);
       }else if(sexo==2){
       pesoIdeal = (altura*62.1)-44.7;
        System.out.println("Feminino: peso ideal é: "+ pesoIdeal);
       } else{
       System.out.println("peso ideal indefinido");
       }
       
    }
}
