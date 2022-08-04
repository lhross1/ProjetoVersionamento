/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerciciodecisao5;

/**
 *
 * @author Aluno
 */
import java.util.Scanner
public class ExercicioDecisao5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Digite o primeiro valor:");
         int a = sc.nextInt();
          System.out.println("Digite o segundo valor:");
         int b = sc.nextInt(); 
           System.out.println("Digite o terceiro valor:");
        int c = sc.nextInt();
        System.out.println("Os valores digitados foram: "+a+","+b+" e "+c+".");
      if(c>b && c>a && b>a){
      System.out.println(a + "->" + b + "->" + c);
      }
      else if(b>c && c>a && b>a){
        System.out.println(a + "->" + c+ "->" + b);
      }
      else if(c>a && a>b && c>b){
        System.out.println(b + "->"  + a + "->" + c);
      }
      else if(a>c && a>b && c>b){
        System.out.println(b+ "->"  + c+ "->"  + a);
      }
      else if(b>a && a>c && b>c){
        System.out.println(c + "->" + a +"->"+ b);
      }
      else if(a>b && b>c && a>c){
        System.out.println(c+ "->"  + b + "->" + a);
      }
        
     // System.out.println(primeiro+"->"+segundo+"->"+terceiro); 
      }
      
      
    }
         
     
    
       
   
   

